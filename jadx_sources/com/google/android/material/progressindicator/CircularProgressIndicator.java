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

/* JADX INFO: loaded from: classes45.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_ADVANCE = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_RETREAT = 1;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.circularProgressIndicatorStyle);
    }

    private void initializeDrawables() {
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate((CircularProgressIndicatorSpec) this.spec);
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.spec, circularDrawingDelegate));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.spec, circularDrawingDelegate));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public CircularProgressIndicatorSpec createSpec(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.spec).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorInset;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorSize;
    }

    public void setIndeterminateAnimationType(int i11) {
        if (((CircularProgressIndicatorSpec) this.spec).indeterminateAnimationType == i11) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s11 = this.spec;
        ((CircularProgressIndicatorSpec) s11).indeterminateAnimationType = i11;
        ((CircularProgressIndicatorSpec) s11).validateSpec();
        getIndeterminateDrawable().setAnimatorDelegate(i11 == 1 ? new CircularIndeterminateRetreatAnimatorDelegate(getContext(), (CircularProgressIndicatorSpec) this.spec) : new CircularIndeterminateAdvanceAnimatorDelegate((CircularProgressIndicatorSpec) this.spec));
        registerSwitchIndeterminateModeCallback();
        invalidate();
    }

    public void setIndicatorDirection(int i11) {
        ((CircularProgressIndicatorSpec) this.spec).indicatorDirection = i11;
        invalidate();
    }

    public void setIndicatorInset(@Px int i11) {
        S s11 = this.spec;
        if (((CircularProgressIndicatorSpec) s11).indicatorInset != i11) {
            ((CircularProgressIndicatorSpec) s11).indicatorInset = i11;
            invalidate();
        }
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        super(context, attributeSet, i11, DEF_STYLE_RES);
        initializeDrawables();
        this.initialized = true;
    }

    public void setIndicatorSize(@Px int i11) {
        int iMax = Math.max(i11, getTrackThickness() * 2);
        S s11 = this.spec;
        if (((CircularProgressIndicatorSpec) s11).indicatorSize != iMax) {
            ((CircularProgressIndicatorSpec) s11).indicatorSize = iMax;
            ((CircularProgressIndicatorSpec) s11).validateSpec();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i11) {
        super.setTrackThickness(i11);
        ((CircularProgressIndicatorSpec) this.spec).validateSpec();
    }
}
