package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public double get(double d11) {
        if (d11 <= -1.0d) {
            return this.low;
        }
        if (d11 < 0.0d) {
            return MathUtils.lerp(this.low, this.normal, (d11 - (-1.0d)) / 1.0d);
        }
        if (d11 < 0.5d) {
            return MathUtils.lerp(this.normal, this.medium, (d11 - 0.0d) / 0.5d);
        }
        return d11 < 1.0d ? MathUtils.lerp(this.medium, this.high, (d11 - 0.5d) / 0.5d) : this.high;
    }

    public ContrastCurve(double d11, double d12, double d13, double d14) {
        this.low = d11;
        this.normal = d12;
        this.medium = d13;
        this.high = d14;
    }
}
