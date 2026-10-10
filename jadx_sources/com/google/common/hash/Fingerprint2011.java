package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {
    static final HashFunction FINGERPRINT_2011 = new Fingerprint2011();

    /* JADX INFO: renamed from: K0 */
    private static final long f12365K0 = -6505348102511208375L;

    /* JADX INFO: renamed from: K1 */
    private static final long f12366K1 = -8261664234251669945L;

    /* JADX INFO: renamed from: K2 */
    private static final long f12367K2 = -4288712594273399085L;

    /* JADX INFO: renamed from: K3 */
    private static final long f12368K3 = -4132994306676758123L;

    @VisibleForTesting
    public static long hash128to64(long j11, long j12) {
        long j13 = (j12 ^ j11) * f12368K3;
        long j14 = (j11 ^ (j13 ^ (j13 >>> 47))) * f12368K3;
        return (j14 ^ (j14 >>> 47)) * f12368K3;
    }

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i11, int i12) {
        long jHashLength33To64;
        if (i12 <= 32) {
            jHashLength33To64 = murmurHash64WithSeed(bArr, i11, i12, -1397348546323613475L);
        } else {
            jHashLength33To64 = i12 <= 64 ? hashLength33To64(bArr, i11, i12) : fullFingerprint(bArr, i11, i12);
        }
        long jLoad64 = f12365K0;
        long jLoad65 = i12 >= 8 ? LittleEndianByteArray.load64(bArr, i11) : -6505348102511208375L;
        if (i12 >= 9) {
            jLoad64 = LittleEndianByteArray.load64(bArr, (i11 + i12) - 8);
        }
        long jHash128to64 = hash128to64(jHashLength33To64 + jLoad64, jLoad65);
        return (jHash128to64 == 0 || jHash128to64 == 1) ? jHash128to64 - 2 : jHash128to64;
    }

    private static long fullFingerprint(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = bArr;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i11);
        int i13 = i11 + i12;
        long jLoad65 = LittleEndianByteArray.load64(bArr2, i13 - 16) ^ f12366K1;
        long jLoad66 = f12365K0 ^ LittleEndianByteArray.load64(bArr2, i13 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j11 = i12;
        weakHashLength32WithSeeds(bArr2, i13 - 64, j11, jLoad65, jArr);
        weakHashLength32WithSeeds(bArr2, i13 - 32, j11 * f12366K1, f12365K0, jArr2);
        long[] jArr3 = jArr2;
        long jShiftMix = jLoad66 + (shiftMix(jArr[1]) * f12366K1);
        long jRotateRight = Long.rotateRight(jLoad64 + jShiftMix, 39) * f12366K1;
        int i14 = (i12 - 1) & (-64);
        long jRotateRight2 = Long.rotateRight(jLoad65, 33) * f12366K1;
        long j12 = jRotateRight;
        int i15 = i11;
        while (true) {
            long jRotateRight3 = Long.rotateRight(j12 + jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr2, i15 + 16), 37) * f12366K1;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + LittleEndianByteArray.load64(bArr2, i15 + 48), 42) * f12366K1;
            long j13 = jArr3[1] ^ jRotateRight3;
            long j14 = jRotateRight4 ^ jArr[0];
            long jRotateRight5 = Long.rotateRight(jArr3[0] ^ jShiftMix, 33);
            weakHashLength32WithSeeds(bArr2, i15, jArr[1] * f12366K1, jArr3[0] + j13, jArr);
            int i16 = i15;
            long[] jArr4 = jArr3;
            jRotateRight2 = j14;
            weakHashLength32WithSeeds(bArr, i16 + 32, jArr3[1] + jRotateRight5, jRotateRight2, jArr4);
            i15 = i16 + 64;
            i14 -= 64;
            if (i14 == 0) {
                return hash128to64(hash128to64(jArr[0], jArr4[0]) + (shiftMix(jRotateRight2) * f12366K1) + j13, hash128to64(jArr[1], jArr4[1]) + jRotateRight5);
            }
            bArr2 = bArr;
            jArr3 = jArr4;
            j12 = jRotateRight5;
            jShiftMix = j13;
        }
    }

    private static long hashLength33To64(byte[] bArr, int i11, int i12) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i11 + 24);
        int i13 = i11 + i12;
        int i14 = i13 - 16;
        long jLoad65 = LittleEndianByteArray.load64(bArr, i11) + ((((long) i12) + LittleEndianByteArray.load64(bArr, i14)) * f12365K0);
        long jRotateRight = Long.rotateRight(jLoad65 + jLoad64, 52);
        long jRotateRight2 = Long.rotateRight(jLoad65, 37);
        long jLoad66 = jLoad65 + LittleEndianByteArray.load64(bArr, i11 + 8);
        long jRotateRight3 = jRotateRight2 + Long.rotateRight(jLoad66, 7);
        int i15 = i11 + 16;
        long jLoad67 = jLoad66 + LittleEndianByteArray.load64(bArr, i15);
        long j11 = jLoad64 + jLoad67;
        long jRotateRight4 = jRotateRight + Long.rotateRight(jLoad67, 31) + jRotateRight3;
        long jLoad68 = LittleEndianByteArray.load64(bArr, i15) + LittleEndianByteArray.load64(bArr, i13 - 32);
        long jLoad69 = LittleEndianByteArray.load64(bArr, i13 - 8);
        long jRotateRight5 = Long.rotateRight(jLoad68 + jLoad69, 52);
        long jRotateRight6 = Long.rotateRight(jLoad68, 37);
        long jLoad610 = jLoad68 + LittleEndianByteArray.load64(bArr, i13 - 24);
        long jRotateRight7 = jRotateRight6 + Long.rotateRight(jLoad610, 7);
        long jLoad611 = jLoad610 + LittleEndianByteArray.load64(bArr, i14);
        return shiftMix((shiftMix(((j11 + jRotateRight5 + Long.rotateRight(jLoad611, 31) + jRotateRight7) * f12367K2) + ((jLoad69 + jLoad611 + jRotateRight4) * f12365K0)) * f12365K0) + jRotateRight4) * f12367K2;
    }

    @VisibleForTesting
    public static long murmurHash64WithSeed(byte[] bArr, int i11, int i12, long j11) {
        int i13 = i12 & (-8);
        int i14 = i12 & 7;
        long jLoad64Safely = j11 ^ (((long) i12) * f12368K3);
        for (int i15 = 0; i15 < i13; i15 += 8) {
            jLoad64Safely = (jLoad64Safely ^ (shiftMix(LittleEndianByteArray.load64(bArr, i11 + i15) * f12368K3) * f12368K3)) * f12368K3;
        }
        if (i14 != 0) {
            jLoad64Safely = (LittleEndianByteArray.load64Safely(bArr, i11 + i13, i14) ^ jLoad64Safely) * f12368K3;
        }
        return shiftMix(shiftMix(jLoad64Safely) * f12368K3);
    }

    private static long shiftMix(long j11) {
        return j11 ^ (j11 >>> 47);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i11, int i12) {
        Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i11, i12));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i11, long j11, long j12, long[] jArr) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i11);
        long jLoad65 = LittleEndianByteArray.load64(bArr, i11 + 8);
        long jLoad66 = LittleEndianByteArray.load64(bArr, i11 + 16);
        long jLoad67 = LittleEndianByteArray.load64(bArr, i11 + 24);
        long j13 = j11 + jLoad64;
        long j14 = jLoad65 + j13 + jLoad66;
        long jRotateRight = Long.rotateRight(j12 + j13 + jLoad67, 51) + Long.rotateRight(j14, 23);
        jArr[0] = j14 + jLoad67;
        jArr[1] = jRotateRight + j13;
    }
}
