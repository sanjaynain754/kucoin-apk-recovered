package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.C7090R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes45.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_LinearProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.linearProgressIndicatorStyle);
    }

    private void initializeDrawables() {
        LinearDrawingDelegate linearDrawingDelegate = new LinearDrawingDelegate((LinearProgressIndicatorSpec) this.spec);
        setIndeterminateDrawable(IndeterminateDrawable.createLinearDrawable(getContext(), (LinearProgressIndicatorSpec) this.spec, linearDrawingDelegate));
        setProgressDrawable(DeterminateDrawable.createLinearDrawable(getContext(), (LinearProgressIndicatorSpec) this.spec, linearDrawingDelegate));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public LinearProgressIndicatorSpec createSpec(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    @Px
    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.spec).trackInnerCornerRadius;
    }

    @Nullable
    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorPadding;
    }

    @Px
    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize;
    }

    public void setIndeterminateAnimationType(int i11) {
        if (((LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType == i11) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s11 = this.spec;
        ((LinearProgressIndicatorSpec) s11).indeterminateAnimationType = i11;
        ((LinearProgressIndicatorSpec) s11).validateSpec();
        if (i11 == 0) {
            getIndeterminateDrawable().setAnimatorDelegate(new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec) this.spec));
        } else {
            getIndeterminateDrawable().setAnimatorDelegate(new LinearIndeterminateDisjointAnimatorDelegate(getContext(), (LinearProgressIndicatorSpec) this.spec));
        }
        registerSwitchIndeterminateModeCallback();
        invalidate();
    }

    public void setIndicatorDirection(int i11) {
        S s11 = this.spec;
        ((LinearProgressIndicatorSpec) s11).indicatorDirection = i11;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s11;
        boolean z11 = true;
        if (i11 != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 2) && (getLayoutDirection() != 0 || i11 != 3))) {
            z11 = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z11;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i11, boolean z11) {
        S s11 = this.spec;
        if (s11 != 0 && ((LinearProgressIndicatorSpec) s11).indeterminateAnimationType == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i11, z11);
    }

    public void setTrackInnerCornerRadius(@Px int i11) {
        S s11 = this.spec;
        if (((LinearProgressIndicatorSpec) s11).trackInnerCornerRadius != i11) {
            ((LinearProgressIndicatorSpec) s11).trackInnerCornerRadius = Math.round(Math.min(i11, ((LinearProgressIndicatorSpec) s11).trackThickness / 2.0f));
            S s12 = this.spec;
            ((LinearProgressIndicatorSpec) s12).useRelativeTrackInnerCornerRadius = false;
            ((LinearProgressIndicatorSpec) s12).hasInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) s12).validateSpec();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f11) {
        S s11 = this.spec;
        if (((LinearProgressIndicatorSpec) s11).trackInnerCornerRadiusFraction != f11) {
            ((LinearProgressIndicatorSpec) s11).trackInnerCornerRadiusFraction = Math.min(f11, 0.5f);
            S s12 = this.spec;
            ((LinearProgressIndicatorSpec) s12).useRelativeTrackInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) s12).hasInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) s12).validateSpec();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(@Nullable Integer num) {
        if (Objects.equals(((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorPadding, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorPadding = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i11) {
        S s11 = this.spec;
        if (((LinearProgressIndicatorSpec) s11).trackStopIndicatorSize != i11) {
            ((LinearProgressIndicatorSpec) s11).trackStopIndicatorSize = Math.min(i11, ((LinearProgressIndicatorSpec) s11).trackThickness);
            ((LinearProgressIndicatorSpec) this.spec).validateSpec();
            invalidate();
        }
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        super(context, attributeSet, i11, DEF_STYLE_RES);
        initializeDrawables();
        this.initialized = true;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        S s11 = this.spec;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s11;
        boolean z12 = true;
        if (((LinearProgressIndicatorSpec) s11).indicatorDirection != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 3))) {
            z12 = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z12;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        int paddingLeft = i11 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i12 - (getPaddingTop() + getPaddingBottom());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.spec).validateSpec();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i11) {
        super.setTrackCornerRadius(i11);
        ((LinearProgressIndicatorSpec) this.spec).validateSpec();
        invalidate();
    }
}
