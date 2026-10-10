package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();

    /* JADX INFO: renamed from: K0 */
    private static final long f12362K0 = -4348849565147123417L;

    /* JADX INFO: renamed from: K1 */
    private static final long f12363K1 = -5435081209227447693L;

    /* JADX INFO: renamed from: K2 */
    private static final long f12364K2 = -7286425919675154353L;

    private static long hashLength16(long j11, long j12, long j13) {
        long j14 = (j11 ^ j12) * j13;
        long j15 = ((j14 ^ (j14 >>> 47)) ^ j12) * j13;
        return (j15 ^ (j15 >>> 47)) * j13;
    }

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i11, int i12) {
        if (i12 <= 32) {
            return i12 <= 16 ? hashLength0to16(bArr, i11, i12) : hashLength17to32(bArr, i11, i12);
        }
        return i12 <= 64 ? hashLength33To64(bArr, i11, i12) : hashLength65Plus(bArr, i11, i12);
    }

    private static long hashLength17to32(byte[] bArr, int i11, int i12) {
        long j11 = (((long) i12) * 2) + f12364K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i11) * f12363K1;
        long jLoad65 = LittleEndianByteArray.load64(bArr, i11 + 8);
        int i13 = i11 + i12;
        long jLoad66 = LittleEndianByteArray.load64(bArr, i13 - 8) * j11;
        return hashLength16(Long.rotateRight(jLoad64 + jLoad65, 43) + Long.rotateRight(jLoad66, 30) + (LittleEndianByteArray.load64(bArr, i13 - 16) * f12364K2), jLoad66 + jLoad64 + Long.rotateRight(jLoad65 + f12364K2, 18), j11);
    }

    private static long hashLength33To64(byte[] bArr, int i11, int i12) {
        long j11 = (((long) i12) * 2) + f12364K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i11) * f12364K2;
        long jLoad65 = LittleEndianByteArray.load64(bArr, i11 + 8);
        int i13 = i11 + i12;
        long jLoad66 = LittleEndianByteArray.load64(bArr, i13 - 8) * j11;
        long jRotateRight = Long.rotateRight(jLoad64 + jLoad65, 43) + Long.rotateRight(jLoad66, 30) + (LittleEndianByteArray.load64(bArr, i13 - 16) * f12364K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad66 + Long.rotateRight(jLoad65 + f12364K2, 18) + jLoad64, j11);
        long jLoad67 = LittleEndianByteArray.load64(bArr, i11 + 16) * j11;
        long jLoad68 = LittleEndianByteArray.load64(bArr, i11 + 24);
        long jLoad69 = (jRotateRight + LittleEndianByteArray.load64(bArr, i13 - 32)) * j11;
        return hashLength16(Long.rotateRight(jLoad67 + jLoad68, 43) + Long.rotateRight(jLoad69, 30) + ((jHashLength16 + LittleEndianByteArray.load64(bArr, i13 - 24)) * j11), jLoad67 + Long.rotateRight(jLoad64 + jLoad68, 18) + jLoad69, j11);
    }

    private static long hashLength65Plus(byte[] bArr, int i11, int i12) {
        long j11 = 81;
        long j12 = f12363K1;
        long j13 = (j11 * f12363K1) + 113;
        long jShiftMix = shiftMix((j13 * f12364K2) + 113) * f12364K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        char c11 = 1;
        int i13 = i12 - 1;
        int i14 = i11 + ((i13 / 64) * 64);
        int i15 = i13 & 63;
        int i16 = i14 + i15;
        int i17 = i16 - 63;
        long j14 = j13;
        long jLoad64 = (j11 * f12364K2) + LittleEndianByteArray.load64(bArr, i11);
        int i18 = i11;
        while (true) {
            long j15 = j12;
            long jRotateRight = Long.rotateRight(jLoad64 + j14 + jArr[0] + LittleEndianByteArray.load64(bArr, i18 + 8), 37) * j15;
            long jRotateRight2 = Long.rotateRight(j14 + jArr[c11] + LittleEndianByteArray.load64(bArr, i18 + 48), 42) * j15;
            long j16 = jRotateRight ^ jArr2[c11];
            char c12 = c11;
            long jLoad65 = jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr, i18 + 40);
            long jRotateRight3 = Long.rotateRight(jShiftMix + jArr2[0], 33) * j15;
            weakHashLength32WithSeeds(bArr, i18, jArr[c12] * j15, j16 + jArr2[0], jArr);
            int i19 = i18;
            long[] jArr3 = jArr;
            weakHashLength32WithSeeds(bArr, i19 + 32, jArr2[c12] + jRotateRight3, jLoad65 + LittleEndianByteArray.load64(bArr, i19 + 16), jArr2);
            i18 = i19 + 64;
            if (i18 == i14) {
                long j17 = ((j16 & 255) << c12) + j15;
                long j18 = jArr2[0] + ((long) i15);
                jArr2[0] = j18;
                long j19 = jArr3[0] + j18;
                jArr3[0] = j19;
                jArr2[0] = jArr2[0] + j19;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jLoad65 + jArr3[0] + LittleEndianByteArray.load64(bArr, i16 - 55), 37) * j17;
                long jRotateRight5 = Long.rotateRight(jLoad65 + jArr3[c12] + LittleEndianByteArray.load64(bArr, i16 - 15), 42) * j17;
                long j21 = jRotateRight4 ^ (jArr2[c12] * 9);
                long jLoad66 = jRotateRight5 + (jArr3[0] * 9) + LittleEndianByteArray.load64(bArr, i16 - 23);
                long jRotateRight6 = Long.rotateRight(j16 + jArr2[0], 33) * j17;
                weakHashLength32WithSeeds(bArr, i17, jArr3[c12] * j17, jArr2[0] + j21, jArr3);
                weakHashLength32WithSeeds(bArr, i16 - 31, jArr2[c12] + jRotateRight6, LittleEndianByteArray.load64(bArr, i16 - 47) + jLoad66, jArr2);
                return hashLength16(hashLength16(jArr3[0], jArr2[0], j17) + (shiftMix(jLoad66) * f12362K0) + j21, hashLength16(jArr3[c12], jArr2[c12], j17) + jRotateRight6, j17);
            }
            jLoad64 = jRotateRight3;
            j12 = j15;
            jShiftMix = j16;
            c11 = c12;
            j14 = jLoad65;
            jArr = jArr3;
        }
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
        return "Hashing.farmHashFingerprint64()";
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i11, long j11, long j12, long[] jArr) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i11);
        long jLoad65 = LittleEndianByteArray.load64(bArr, i11 + 8);
        long jLoad66 = LittleEndianByteArray.load64(bArr, i11 + 16);
        long jLoad67 = LittleEndianByteArray.load64(bArr, i11 + 24);
        long j13 = j11 + jLoad64;
        long j14 = jLoad65 + j13 + jLoad66;
        long jRotateRight = Long.rotateRight(j12 + j13 + jLoad67, 21) + Long.rotateRight(j14, 44);
        jArr[0] = j14 + jLoad67;
        jArr[1] = jRotateRight + j13;
    }

    private static long hashLength0to16(byte[] bArr, int i11, int i12) {
        if (i12 >= 8) {
            long j11 = (((long) i12) * 2) + f12364K2;
            long jLoad64 = LittleEndianByteArray.load64(bArr, i11) + f12364K2;
            long jLoad65 = LittleEndianByteArray.load64(bArr, (i11 + i12) - 8);
            return hashLength16((Long.rotateRight(jLoad65, 37) * j11) + jLoad64, (Long.rotateRight(jLoad64, 25) + jLoad65) * j11, j11);
        }
        if (i12 >= 4) {
            return hashLength16(((long) i12) + ((((long) LittleEndianByteArray.load32(bArr, i11)) & KeyboardMap.kValueMask) << 3), ((long) LittleEndianByteArray.load32(bArr, (i11 + i12) - 4)) & KeyboardMap.kValueMask, ((long) (i12 * 2)) + f12364K2);
        }
        if (i12 <= 0) {
            return f12364K2;
        }
        return shiftMix((((long) ((bArr[i11] & 255) + ((bArr[(i12 >> 1) + i11] & 255) << 8))) * f12364K2) ^ (((long) (i12 + ((bArr[i11 + (i12 - 1)] & 255) << 2))) * f12362K0)) * f12364K2;
    }
}
