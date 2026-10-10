package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    private float calculateLargeSize(float f11, int i11, float f12, int i12, int i13) {
        if (i11 <= 0) {
            f12 = 0.0f;
        }
        float f13 = i12 / 2.0f;
        return (f11 - ((i11 + f13) * f12)) / (i13 + f13);
    }

    @Nullable
    public static Arrangement findLowestCostArrangement(float f11, float f12, float f13, float f14, @NonNull int[] iArr, float f15, @NonNull int[] iArr2, float f16, @NonNull int[] iArr3) {
        Arrangement arrangement = null;
        int i11 = 1;
        for (int i12 : iArr3) {
            int length = iArr2.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = iArr2[i13];
                int length2 = iArr.length;
                int i15 = 0;
                while (i15 < length2) {
                    int i16 = length;
                    int i17 = i13;
                    int i18 = i11;
                    int i19 = length2;
                    int i21 = i15;
                    Arrangement arrangement2 = new Arrangement(i18, f12, f13, f14, iArr[i15], f15, i14, f16, i12, f11);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i22 = i18 + 1;
                    i15 = i21 + 1;
                    i13 = i17;
                    i11 = i22;
                    length = i16;
                    length2 = i19;
                }
                i13++;
                i11 = i11;
                length = length;
            }
        }
        return arrangement;
    }

    private float getSpace() {
        return (this.largeSize * this.largeCount) + (this.mediumSize * this.mediumCount) + (this.smallSize * this.smallCount);
    }

    private boolean isValid() {
        int i11 = this.largeCount;
        if (i11 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i11 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f11 = this.largeSize;
        float f12 = this.mediumSize;
        return f11 > f12 && f12 > this.smallSize;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
    }

    public Arrangement(int i11, float f11, float f12, float f13, int i12, float f14, int i13, float f15, int i14, float f16) {
        this.priority = i11;
        this.smallSize = MathUtils.clamp(f11, f12, f13);
        this.smallCount = i12;
        this.mediumSize = f14;
        this.mediumCount = i13;
        this.largeSize = f15;
        this.largeCount = i14;
        fit(f16, f12, f13, f15);
        this.cost = cost(f15);
    }

    private float cost(float f11) {
        if (!isValid()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f11 - this.largeSize) * this.priority;
    }

    private void fit(float f11, float f12, float f13, float f14) {
        float f15;
        float space = f11 - getSpace();
        int i11 = this.smallCount;
        if (i11 > 0 && space > 0.0f) {
            float f16 = this.smallSize;
            this.smallSize = f16 + Math.min(space / i11, f13 - f16);
        } else if (i11 > 0 && space < 0.0f) {
            float f17 = this.smallSize;
            this.smallSize = f17 + Math.max(space / i11, f12 - f17);
        }
        int i12 = this.smallCount;
        if (i12 > 0) {
            f15 = this.smallSize;
        } else {
            f15 = 0.0f;
        }
        this.smallSize = f15;
        float fCalculateLargeSize = calculateLargeSize(f11, i12, f15, this.mediumCount, this.largeCount);
        this.largeSize = fCalculateLargeSize;
        float f18 = (this.smallSize + fCalculateLargeSize) / 2.0f;
        this.mediumSize = f18;
        int i13 = this.mediumCount;
        if (i13 > 0 && fCalculateLargeSize != f14) {
            float f19 = (f14 - fCalculateLargeSize) * this.largeCount;
            float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i13);
            if (f19 > 0.0f) {
                this.mediumSize -= fMin / this.mediumCount;
                this.largeSize += fMin / this.largeCount;
            } else {
                this.mediumSize += fMin / this.mediumCount;
                this.largeSize -= fMin / this.largeCount;
            }
        }
    }
}
