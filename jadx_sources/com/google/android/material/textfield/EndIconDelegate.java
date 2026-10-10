package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
abstract class EndIconDelegate {
    final Context context;
    final CheckableImageButton endIconView;
    final EndCompoundLayout endLayout;
    final TextInputLayout textInputLayout;

    @StringRes
    public int getIconContentDescriptionResId() {
        return 0;
    }

    @DrawableRes
    public int getIconDrawableResId() {
        return 0;
    }

    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return null;
    }

    public View.OnClickListener getOnIconClickListener() {
        return null;
    }

    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return null;
    }

    public boolean isBoxBackgroundModeSupported(int i11) {
        return true;
    }

    public boolean isIconActivable() {
        return false;
    }

    public boolean isIconActivated() {
        return false;
    }

    public boolean isIconCheckable() {
        return false;
    }

    public boolean isIconChecked() {
        return false;
    }

    public boolean shouldTintIconOnError() {
        return false;
    }

    public final void refreshIconState() {
        this.endLayout.refreshIconState(false);
    }

    public EndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        this.textInputLayout = endCompoundLayout.textInputLayout;
        this.endLayout = endCompoundLayout;
        this.context = endCompoundLayout.getContext();
        this.endIconView = endCompoundLayout.getEndIconView();
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    public void afterEditTextChanged(Editable editable) {
    }

    public void onEditTextAttached(@Nullable EditText editText) {
    }

    public void onSuffixVisibilityChanged(boolean z11) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void beforeEditTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
