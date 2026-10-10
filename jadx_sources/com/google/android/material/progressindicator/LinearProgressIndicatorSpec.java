package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ThemeEnforcement;

/* JADX INFO: loaded from: classes45.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    boolean drawHorizontallyInverse;
    public boolean hasInnerCornerRadius;
    public int indeterminateAnimationType;
    public int indicatorDirection;

    @Px
    public int trackInnerCornerRadius;
    public float trackInnerCornerRadiusFraction;

    @Nullable
    public Integer trackStopIndicatorPadding;

    @Px
    public int trackStopIndicatorSize;
    public boolean useRelativeTrackInnerCornerRadius;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        this(context, attributeSet, i11, LinearProgressIndicator.DEF_STYLE_RES);
    }

    public int getTrackInnerCornerRadiusInPx() {
        if (this.hasInnerCornerRadius) {
            return this.useRelativeTrackInnerCornerRadius ? (int) (this.trackThickness * this.trackInnerCornerRadiusFraction) : this.trackInnerCornerRadius;
        }
        return getTrackCornerRadiusInPx();
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C7090R.styleable.LinearProgressIndicator, C7090R.attr.linearProgressIndicatorStyle, LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.trackStopIndicatorSize = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.LinearProgressIndicator_trackStopIndicatorSize, 0), this.trackThickness);
        int i13 = C7090R.styleable.LinearProgressIndicator_trackStopIndicatorPadding;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.trackStopIndicatorPadding = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(C7090R.styleable.LinearProgressIndicator_trackInnerCornerRadius);
        if (typedValuePeekValue != null) {
            int i14 = typedValuePeekValue.type;
            if (i14 == 5) {
                this.trackInnerCornerRadius = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.trackThickness / 2);
                this.useRelativeTrackInnerCornerRadius = false;
                this.hasInnerCornerRadius = true;
            } else if (i14 == 6) {
                this.trackInnerCornerRadiusFraction = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.useRelativeTrackInnerCornerRadius = true;
                this.hasInnerCornerRadius = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
        this.drawHorizontallyInverse = this.indicatorDirection == 1;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public boolean useStrokeCap() {
        if (super.useStrokeCap() && getTrackInnerCornerRadiusInPx() == getTrackCornerRadiusInPx()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public void validateSpec() {
        super.validateSpec();
        if (this.trackStopIndicatorSize >= 0) {
            if (this.indeterminateAnimationType == 0) {
                if ((getTrackCornerRadiusInPx() <= 0 && (!this.hasInnerCornerRadius || getTrackInnerCornerRadiusInPx() <= 0)) || this.indicatorTrackGapSize != 0) {
                    if (this.indicatorColors.length < 3) {
                        throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                    }
                    return;
                }
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            return;
        }
        throw new IllegalArgumentException("Stop indicator size must be >= 0.");
    }
}
