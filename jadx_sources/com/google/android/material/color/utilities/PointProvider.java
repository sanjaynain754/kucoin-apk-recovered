package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface PointProvider {
    double distance(double[] dArr, double[] dArr2);

    double[] fromInt(int i11);

    int toInt(double[] dArr);
}
