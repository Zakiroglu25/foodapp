package com.aris.yemekgetir.ui.auth.LoginActivities.helpers;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.aris.yemekgetir.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BotttomDialog  extends BottomSheetDialogFragment {
  private BottomSheetListener mListener;


  private int layout;

  public BotttomDialog(int layout) {
    this.layout = layout;
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
      Bundle savedInstanceState) {
    View v = inflater.inflate(layout, container, false);

    Button button1 = v.findViewById(R.id.send_btn);
    button1.setOnClickListener(v1 -> {
      mListener.onButtonClicked(layout);
      dismiss();
    });

    return v;
  }

  public interface BottomSheetListener {
    void onButtonClicked(int text);
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);

    try {
      mListener = (BottomSheetListener) context;
    } catch (ClassCastException e) {
      throw new ClassCastException(context.toString()
          + " must implement BottomSheetListener");
    }
  }
}
