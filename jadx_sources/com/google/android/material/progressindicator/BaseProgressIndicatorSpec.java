package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;
import com.google.android.material.C7090R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;

    @FloatRange(from = 0.10000000149011612d, m1552to = 10.0d)
    public float indeterminateAnimatorDurationScale;

    @NonNull
    public int[] indicatorColors = new int[0];

    @Px
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;

    @ColorInt
    public int trackColor;

    @Px
    public int trackCornerRadius;
    public float trackCornerRadiusFraction;

    @Px
    public int trackThickness;
    public boolean useRelativeTrackCornerRadius;

    @Px
    public int waveAmplitude;

    @Px
    public int waveSpeed;

    @Px
    public int wavelengthDeterminate;

    @Px
    public int wavelengthIndeterminate;

    private void loadIndicatorColors(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i11 = C7090R.styleable.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i11)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, C0467R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(i11).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(i11, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i11, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void loadTrackColor(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i11 = C7090R.styleable.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i11)) {
            this.trackColor = typedArray.getColor(i11, -1);
            return;
        }
        this.trackColor = this.indicatorColors[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f11 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.trackColor = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f11 * 255.0f));
    }

    public int getTrackCornerRadiusInPx() {
        return this.useRelativeTrackCornerRadius ? (int) (this.trackThickness * this.trackCornerRadiusFraction) : this.trackCornerRadius;
    }

    public boolean hasWavyEffect(boolean z11) {
        if (this.waveAmplitude <= 0) {
            return false;
        }
        if (z11 || this.wavelengthIndeterminate <= 0) {
            return z11 && this.wavelengthDeterminate > 0;
        }
        return true;
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }

    public boolean useStrokeCap() {
        return this.useRelativeTrackCornerRadius && this.trackCornerRadiusFraction == 0.5f;
    }

    @CallSuper
    public void validateSpec() {
        if (this.indicatorTrackGapSize < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public BaseProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7090R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C7090R.styleable.BaseProgressIndicator, i11, i12, new int[0]);
        this.trackThickness = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C7090R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(C7090R.styleable.BaseProgressIndicator_trackCornerRadius);
        if (typedValuePeekValue != null) {
            int i13 = typedValuePeekValue.type;
            if (i13 == 5) {
                this.trackCornerRadius = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.trackThickness / 2);
                this.useRelativeTrackCornerRadius = false;
            } else if (i13 == 6) {
                this.trackCornerRadiusFraction = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.useRelativeTrackCornerRadius = true;
            }
        }
        this.showAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.hideAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.indicatorTrackGapSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.BaseProgressIndicator_indicatorTrackGapSize, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.BaseProgressIndicator_wavelength, 0));
        this.wavelengthDeterminate = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.BaseProgressIndicator_wavelengthDeterminate, iAbs));
        this.wavelengthIndeterminate = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.BaseProgressIndicator_wavelengthIndeterminate, iAbs));
        this.waveAmplitude = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.BaseProgressIndicator_waveAmplitude, 0));
        this.waveSpeed = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.BaseProgressIndicator_waveSpeed, 0);
        this.indeterminateAnimatorDurationScale = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.BaseProgressIndicator_indeterminateAnimatorDurationScale, 1.0f);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        loadTrackColor(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
