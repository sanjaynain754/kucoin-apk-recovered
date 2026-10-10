package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    public enum StrategyType {
        CONTAINED,
        UNCONTAINED
    }

    public static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = iArr[i11] * 2;
        }
        return iArr2;
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    public static float getChildMaskPercentage(float f11, float f12, float f13) {
        return 1.0f - ((f11 - f13) / (f12 - f13));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i11) {
        return false;
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    public StrategyType getStrategyType() {
        return StrategyType.CONTAINED;
    }

    public void initialize(Context context) {
        float smallSizeMin = this.smallSizeMin;
        if (smallSizeMin <= 0.0f) {
            smallSizeMin = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = smallSizeMin;
        float smallSizeMax = this.smallSizeMax;
        if (smallSizeMax <= 0.0f) {
            smallSizeMax = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = smallSizeMax;
    }

    public void setSmallItemSizeMax(float f11) {
        this.smallSizeMax = f11;
    }

    public void setSmallItemSizeMin(float f11) {
        this.smallSizeMin = f11;
    }
}
