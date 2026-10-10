package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.C0467R;
import com.google.android.material.C7090R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Arrays;

/* JADX INFO: loaded from: classes45.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {
    static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_LoadingIndicator;

    @NonNull
    private final LoadingIndicatorDrawable drawable;

    @NonNull
    private final LoadingIndicatorSpec specs;

    public LoadingIndicator(@NonNull Context context) {
        this(context, null);
    }

    public boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), C0467R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.specs.indicatorColors = iArr;
        this.drawable.getAnimatorDelegate().invalidateSpecValues();
        invalidate();
    }

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.loadingIndicatorStyle);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @ColorInt
    public int getContainerColor() {
        return this.specs.containerColor;
    }

    @Px
    public int getContainerHeight() {
        return this.specs.containerHeight;
    }

    @Px
    public int getContainerWidth() {
        return this.specs.containerWidth;
    }

    @NonNull
    public LoadingIndicatorDrawable getDrawable() {
        return this.drawable;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.specs.indicatorColors;
    }

    @Px
    public int getIndicatorSize() {
        return this.specs.indicatorSize;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.drawable.animatorDurationScaleProvider = animatorDurationScaleProvider;
    }

    public void setContainerColor(@ColorInt int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerColor != i11) {
            loadingIndicatorSpec.containerColor = i11;
            invalidate();
        }
    }

    public void setContainerHeight(@Px int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerHeight != i11) {
            loadingIndicatorSpec.containerHeight = i11;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(@Px int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerWidth != i11) {
            loadingIndicatorSpec.containerWidth = i11;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.indicatorSize != i11) {
            loadingIndicatorSpec.indicatorSize = i11;
            requestLayout();
            invalidate();
        }
    }

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, DEF_STYLE_RES), attributeSet, i11);
        Context context2 = getContext();
        LoadingIndicatorDrawable loadingIndicatorDrawableCreate = LoadingIndicatorDrawable.create(context2, new LoadingIndicatorSpec(context2, attributeSet, i11));
        this.drawable = loadingIndicatorDrawableCreate;
        loadingIndicatorDrawableCreate.setCallback(this);
        this.specs = loadingIndicatorDrawableCreate.getDrawingDelegate().specs;
        setAnimatorDurationScaleProvider(new AnimatorDurationScaleProvider());
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        this.drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        LoadingIndicatorDrawingDelegate drawingDelegate = this.drawable.getDrawingDelegate();
        int preferredWidth = drawingDelegate.getPreferredWidth() + getPaddingLeft() + getPaddingRight();
        int preferredHeight = drawingDelegate.getPreferredHeight() + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(size, preferredWidth), 1073741824);
        } else if (mode == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(preferredWidth, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, preferredHeight), 1073741824);
        } else if (mode2 == 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(preferredHeight, 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.drawable.setBounds(0, 0, i11, i12);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i11) {
        boolean z11;
        super.onVisibilityChanged(view, i11);
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        boolean zVisibleToUser = visibleToUser();
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        loadingIndicatorDrawable.setVisible(zVisibleToUser, false, z11);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i11) {
        boolean z11;
        super.onWindowVisibilityChanged(i11);
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        boolean zVisibleToUser = visibleToUser();
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        loadingIndicatorDrawable.setVisible(zVisibleToUser, false, z11);
    }

    public boolean visibleToUser() {
        if (isAttachedToWindow() && getWindowVisibility() == 0 && isEffectivelyVisible()) {
            return true;
        }
        return false;
    }
}
