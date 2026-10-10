package com.kubi.utils;

import androidx.annotation.IntRange;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.kubi.utils.e */
/* JADX INFO: compiled from: BigDecimalUtil.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27021e {
    /* JADX INFO: renamed from: a */
    public static double m66522a(double d11, double d12) {
        return new BigDecimal(Double.toString(d11)).add(new BigDecimal(Double.toString(d12))).doubleValue();
    }

    /* JADX INFO: renamed from: b */
    public static double m66523b(double d11, double d12) {
        return m66524c(d11, d12, 10);
    }

    /* JADX INFO: renamed from: c */
    public static double m66524c(double d11, double d12, @IntRange(from = 0) int i11) {
        if (i11 >= 0) {
            return new BigDecimal(Double.toString(d11)).divide(new BigDecimal(Double.toString(d12)), i11, 4).doubleValue();
        }
        throw new IllegalArgumentException("The scale must be a positive integer or zero");
    }

    /* JADX INFO: renamed from: d */
    public static double m66525d(double d11, double d12, @IntRange(from = 0) int i11, int i12) {
        if (i11 >= 0) {
            return new BigDecimal(Double.toString(d11)).divide(new BigDecimal(Double.toString(d12)), i11, i12).doubleValue();
        }
        throw new IllegalArgumentException("The scale must be a positive integer or zero");
    }

    /* JADX INFO: renamed from: e */
    public static double m66526e(double d11, double d12) {
        return new BigDecimal(Double.toString(d11)).multiply(new BigDecimal(Double.toString(d12))).doubleValue();
    }

    /* JADX INFO: renamed from: f */
    public static double m66527f(double d11, double d12) {
        return new BigDecimal(Double.toString(d11)).subtract(new BigDecimal(Double.toString(d12))).doubleValue();
    }
}
