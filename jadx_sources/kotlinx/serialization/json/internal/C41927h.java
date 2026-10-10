package kotlinx.serialization.json.internal;

import p852kotlin.C41154d;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.h */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C41927h {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m91941a(long j11, int i11) {
        if (j11 == 0) {
            return "0";
        }
        if (j11 > 0) {
            return Long.toString(j11, i11);
        }
        if (i11 < 2 || i11 > 36) {
            i11 = 10;
        }
        int i12 = 64;
        char[] cArr = new char[64];
        int i13 = i11 - 1;
        if ((i11 & i13) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i11);
            do {
                i12--;
                cArr[i12] = Character.forDigit(((int) j11) & i13, i11);
                j11 >>>= iNumberOfTrailingZeros;
            } while (j11 != 0);
        } else {
            long jM90129a = (i11 & 1) == 0 ? (j11 >>> 1) / ((long) (i11 >>> 1)) : C41154d.m90129a(j11, i11);
            long j12 = i11;
            cArr[63] = Character.forDigit((int) (j11 - (jM90129a * j12)), i11);
            i12 = 63;
            while (jM90129a > 0) {
                i12--;
                cArr[i12] = Character.forDigit((int) (jM90129a % j12), i11);
                jM90129a /= j12;
            }
        }
        return new String(cArr, i12, 64 - i12);
    }
}
