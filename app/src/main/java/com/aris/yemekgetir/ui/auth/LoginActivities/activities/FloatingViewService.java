package com.aris.yemekgetir.ui.auth.LoginActivities.activities;

import android.app.ActivityManager;
import android.app.Service;
import android.app.TaskInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import com.aris.yemekgetir.R;
import com.aris.yemekgetir.ui.auth.LoginActivities.activities.orderStatusAndRaiting.OrderStatus;
import com.yandex.runtime.sensors.internal.ActivityService;

import java.util.List;

public class FloatingViewService extends Service {
    private WindowManager mWindowManager;
    private View mFloatingView;
    private static final String TAG = "FloatingViewService";

    public FloatingViewService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        //Inflate the floating view layout we created
        mFloatingView = LayoutInflater.from(this).inflate(R.layout.layout_floating_widget, null);

        //Add the view to the window.
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                //WindowManager.LayoutParams.TYPE_PHONE, //For SDK < 26
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY, //For SDK >= 26
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);

        //Specify the view position
        params.gravity = Gravity.TOP | Gravity.LEFT;        //Initially view will be added to top-left corner
        params.x = 0;
        params.y = 100;

        //Add the view to the window
        mWindowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        mWindowManager.addView(mFloatingView, params);

        //The root element of the collapsed view layout
        final View collapsedView = mFloatingView.findViewById(R.id.collapse_view);
        //The root element of the expanded view layout
        //final View expandedView = mFloatingView.findViewById(R.id.expanded_container);
        //for changing the background of the floating button
        final View collapsedView_iv = mFloatingView.findViewById(R.id.collapsed_iv);


//        ImageView openButton = (ImageView) mFloatingView.findViewById(R.id.collapsed_iv);
//        openButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Open the application  click.
//
//
//
//                //close the service and remove view from the view hierarchy
//                //stopSelf();
//            }
//        });


        //Drag and move floating view using user's touch action.
        mFloatingView.findViewById(R.id.root_container).setOnTouchListener(new View.OnTouchListener() {
            private int initialX;
            private int initialY;
            private float initialTouchX;
            private float initialTouchY;


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:


                        //remember the initial position.
                        initialX = params.x;
                        initialY = params.y;


                        //get the touch location
                        initialTouchX = event.getRawX();
                        initialTouchY = event.getRawY();
                        return true;
                    case MotionEvent.ACTION_UP:
                        int Xdiff = (int) (event.getRawX() - initialTouchX);
                        int Ydiff = (int) (event.getRawY() - initialTouchY);


                        //The check for Xdiff <10 && YDiff< 10 because sometime elements moves a little while clicking.
                        //So that is click event.
                        if (Xdiff < 10 && Ydiff < 10) {
                            if (isViewCollapsed()) {
                                //When user clicks on the image view of the collapsed layout,
                                //visibility of the collapsed layout will be changed to "View.GONE"
                                //and expanded view will become visible.

                                Intent intent = new Intent(FloatingViewService.this, OrderStatus.class);

                                ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);


                                boolean isStatusActivity = false;


                                try {
//                                    isStatusActivity = manager.getAppTasks().get(0).getTaskInfo().origActivity.getClassName() == OrderStatus.class.getName();

                                    for (ActivityManager.AppTask taskInfo : manager.getAppTasks()
                                         ) {
                                        Log.e(TAG, "onTouch: " + taskInfo.getTaskInfo().toString());

                                    }
                                } catch (Exception ignored) {
                                    Log.e(TAG, "onTouch: ",ignored );
                                }
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


                                if (isStatusActivity)
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                                startActivity(intent);


                                // collapsedView.setVisibility(View.GONE);
                                //  expandedView.setVisibility(View.VISIBLE);
                            }
                        }
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        //Calculate the X and Y coordinates of the view.
                        params.x = initialX + (int) (event.getRawX() - initialTouchX);
                        params.y = initialY + (int) (event.getRawY() - initialTouchY);


                        //Update the layout with new X & Y coordinate
                        mWindowManager.updateViewLayout(mFloatingView, params);
                        return true;

                }
                return false;
            }
        });


    }


    /**
     * Detect if the floating view is collapsed or expanded.
     *
     * @return true if the floating view is collapsed.
     */
    private boolean isViewCollapsed() {
        return mFloatingView == null || mFloatingView.findViewById(R.id.collapse_view).getVisibility() == View.VISIBLE;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mFloatingView != null) mWindowManager.removeView(mFloatingView);
    }
}