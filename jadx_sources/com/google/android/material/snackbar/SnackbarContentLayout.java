package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.contentInterpolator = MotionUtils.resolveThemeInterpolator(context, C7090R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i11, int i12) {
        this.messageView.setAlpha(0.0f);
        long j11 = i12;
        long j12 = i11;
        this.messageView.animate().alpha(1.0f).setDuration(j11).setInterpolator(this.contentInterpolator).setStartDelay(j12).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j11).setInterpolator(this.contentInterpolator).setStartDelay(j12).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i11, int i12) {
        this.messageView.setAlpha(1.0f);
        long j11 = i12;
        long j12 = i11;
        this.messageView.animate().alpha(0.0f).setDuration(j11).setInterpolator(this.contentInterpolator).setStartDelay(j12).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j11).setInterpolator(this.contentInterpolator).setStartDelay(j12).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    public void setMaxInlineActionWidth(int i11) {
        this.maxInlineActionWidth = i11;
    }

    public void updateActionTextColorAlphaIfNeeded(float f11) {
        if (f11 != 1.0f) {
            this.actionView.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, C7090R.attr.colorSurface), this.actionView.getCurrentTextColor(), f11));
        }
    }

    private static void updateTopBottomPadding(@NonNull View view, int i11, int i12) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i11, view.getPaddingEnd(), i12);
        } else {
            view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), i12);
        }
    }

    private boolean updateViewsWithinLayout(int i11, int i12, int i13) {
        boolean z11;
        if (i11 != getOrientation()) {
            setOrientation(i11);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.messageView.getPaddingTop() == i12 && this.messageView.getPaddingBottom() == i13) {
            return z11;
        }
        updateTopBottomPadding(this.messageView, i12, i13);
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(C7090R.id.snackbar_text);
        this.actionView = (Button) findViewById(C7090R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        super.onMeasure(i11, i12);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C7090R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C7090R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.messageView.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.maxInlineActionWidth > 0 && this.actionView.getMeasuredWidth() > this.maxInlineActionWidth) {
                if (!updateViewsWithinLayout(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z11) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!updateViewsWithinLayout(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i11, i12);
        }
    }
}
