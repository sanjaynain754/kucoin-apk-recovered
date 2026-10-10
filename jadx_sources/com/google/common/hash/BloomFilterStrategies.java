package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t11, Funnel<? super T> funnel, int i11, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            long jAsLong = Hashing.murmur3_128().hashObject(t11, funnel).asLong();
            int i12 = (int) jAsLong;
            int i13 = (int) (jAsLong >>> 32);
            for (int i14 = 1; i14 <= i11; i14++) {
                int i15 = (i14 * i13) + i12;
                if (i15 < 0) {
                    i15 = ~i15;
                }
                if (!lockFreeBitArray.get(((long) i15) % jBitSize)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t11, Funnel<? super T> funnel, int i11, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            long jAsLong = Hashing.murmur3_128().hashObject(t11, funnel).asLong();
            int i12 = (int) jAsLong;
            int i13 = (int) (jAsLong >>> 32);
            boolean z11 = false;
            for (int i14 = 1; i14 <= i11; i14++) {
                int i15 = (i14 * i13) + i12;
                if (i15 < 0) {
                    i15 = ~i15;
                }
                z11 |= lockFreeBitArray.set(((long) i15) % jBitSize);
            }
            return z11;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bArr) {
            return Longs.fromBytes(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.fromBytes(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t11, Funnel<? super T> funnel, int i11, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t11, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            for (int i12 = 0; i12 < i11; i12++) {
                if (!lockFreeBitArray.get((Long.MAX_VALUE & jLowerEight) % jBitSize)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t11, Funnel<? super T> funnel, int i11, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t11, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            boolean z11 = false;
            for (int i12 = 0; i12 < i11; i12++) {
                z11 |= lockFreeBitArray.set((Long.MAX_VALUE & jLowerEight) % jBitSize);
                jLowerEight += jUpperEight;
            }
            return z11;
        }
    };

    public static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final LongAddable bitCount;
        final AtomicLongArray data;

        public LockFreeBitArray(long j11) {
            Preconditions.checkArgument(j11 > 0, "data length is zero!");
            this.data = new AtomicLongArray(Ints.checkedCast(LongMath.divide(j11, 64L, RoundingMode.CEILING)));
            this.bitCount = LongAddables.create();
        }

        public long bitCount() {
            return this.bitCount.sum();
        }

        public long bitSize() {
            return ((long) this.data.length()) * 64;
        }

        public LockFreeBitArray copy() {
            return new LockFreeBitArray(toPlainArray(this.data));
        }

        public int dataLength() {
            return this.data.length();
        }

        public boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(toPlainArray(this.data), toPlainArray(((LockFreeBitArray) obj).data));
            }
            return false;
        }

        public boolean get(long j11) {
            return ((1 << ((int) j11)) & this.data.get((int) (j11 >>> 6))) != 0;
        }

        public int hashCode() {
            return Arrays.hashCode(toPlainArray(this.data));
        }

        public void putAll(LockFreeBitArray lockFreeBitArray) {
            Preconditions.checkArgument(this.data.length() == lockFreeBitArray.data.length(), "BitArrays must be of equal length (%s != %s)", this.data.length(), lockFreeBitArray.data.length());
            for (int i11 = 0; i11 < this.data.length(); i11++) {
                putData(i11, lockFreeBitArray.data.get(i11));
            }
        }

        public void putData(int i11, long j11) {
            while (true) {
                long j12 = this.data.get(i11);
                long j13 = j12 | j11;
                if (j12 == j13) {
                    return;
                }
                int i12 = i11;
                if (this.data.compareAndSet(i12, j12, j13)) {
                    this.bitCount.add(Long.bitCount(j13) - Long.bitCount(j12));
                    return;
                }
                i11 = i12;
            }
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                jArr[i11] = atomicLongArray.get(i11);
            }
            return jArr;
        }

        public boolean set(long j11) {
            long j12;
            long j13;
            if (get(j11)) {
                return false;
            }
            int i11 = (int) (j11 >>> 6);
            long j14 = 1 << ((int) j11);
            do {
                j12 = this.data.get(i11);
                j13 = j12 | j14;
                if (j12 == j13) {
                    return false;
                }
            } while (!this.data.compareAndSet(i11, j12, j13));
            this.bitCount.increment();
            return true;
        }

        public LockFreeBitArray(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.data = new AtomicLongArray(jArr);
            this.bitCount = LongAddables.create();
            long jBitCount = 0;
            for (long j11 : jArr) {
                jBitCount += (long) Long.bitCount(j11);
            }
            this.bitCount.add(jBitCount);
        }
    }
}
