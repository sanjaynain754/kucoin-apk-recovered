package com.appsflyer.internal;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: loaded from: classes34.dex */
public final class AFk1rSDK {
    public static long[] AFAdRevenueData(int i11, int i12) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i12) & KeyboardMap.kValueMask) | ((((long) i11) & KeyboardMap.kValueMask) << 32);
        for (int i13 = 1; i13 < 4; i13++) {
            long j11 = jArr[i13 - 1];
            jArr[i13] = ((j11 ^ (j11 >> 30)) * 1812433253) + ((long) i13);
        }
        return jArr;
    }
}
