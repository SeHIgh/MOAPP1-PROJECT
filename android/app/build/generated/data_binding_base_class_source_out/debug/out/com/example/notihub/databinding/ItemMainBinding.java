// Generated by view binder compiler. Do not edit!
package com.example.notihub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notihub.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final TextView textViewSource;

  @NonNull
  public final TextView textViewSummary;

  @NonNull
  public final TextView textViewTime;

  @NonNull
  public final TextView textViewTitle;

  private ItemMainBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout linearLayout2,
      @NonNull LinearLayout linearLayout3, @NonNull TextView textViewSource,
      @NonNull TextView textViewSummary, @NonNull TextView textViewTime,
      @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.linearLayout2 = linearLayout2;
    this.linearLayout3 = linearLayout3;
    this.textViewSource = textViewSource;
    this.textViewSummary = textViewSummary;
    this.textViewTime = textViewTime;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.textViewSource;
      TextView textViewSource = ViewBindings.findChildViewById(rootView, id);
      if (textViewSource == null) {
        break missingId;
      }

      id = R.id.textViewSummary;
      TextView textViewSummary = ViewBindings.findChildViewById(rootView, id);
      if (textViewSummary == null) {
        break missingId;
      }

      id = R.id.textViewTime;
      TextView textViewTime = ViewBindings.findChildViewById(rootView, id);
      if (textViewTime == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new ItemMainBinding((ConstraintLayout) rootView, linearLayout2, linearLayout3,
          textViewSource, textViewSummary, textViewTime, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
