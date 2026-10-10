package io.reactivex.internal.util;

/* JADX INFO: loaded from: classes23.dex */
public final class Pow2 {
    public static int roundToPowerOfTwo(int i11) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i11 - 1));
    }

    public static boolean isPowerOfTwo(int i11) {
        return (i11 & (i11 + (-1))) == 0;
    }

    private Pow2() {
        throw new IllegalStateException("No instances!");
    }
}
