package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes56.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);

    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {

        /* JADX INFO: renamed from: C1 */
        private static final long f12369C1 = -8663945395140668459L;

        /* JADX INFO: renamed from: C2 */
        private static final long f12370C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;

        /* JADX INFO: renamed from: h1 */
        private long f12371h1;

        /* JADX INFO: renamed from: h2 */
        private long f12372h2;
        private int length;

        public Murmur3_128Hasher(int i11) {
            super(16);
            long j11 = i11;
            this.f12371h1 = j11;
            this.f12372h2 = j11;
            this.length = 0;
        }

        private void bmix64(long j11, long j12) {
            long jMixK1 = mixK1(j11) ^ this.f12371h1;
            this.f12371h1 = jMixK1;
            long jRotateLeft = Long.rotateLeft(jMixK1, 27);
            long j13 = this.f12372h2;
            this.f12371h1 = ((jRotateLeft + j13) * 5) + 1390208809;
            long jMixK2 = mixK2(j12) ^ j13;
            this.f12372h2 = jMixK2;
            this.f12372h2 = ((Long.rotateLeft(jMixK2, 31) + this.f12371h1) * 5) + 944331445;
        }

        private static long fmix64(long j11) {
            long j12 = (j11 ^ (j11 >>> 33)) * (-49064778989728563L);
            long j13 = (j12 ^ (j12 >>> 33)) * (-4265267296055464877L);
            return j13 ^ (j13 >>> 33);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j11 = this.f12371h1;
            int i11 = this.length;
            long j12 = j11 ^ ((long) i11);
            long j13 = this.f12372h2 ^ ((long) i11);
            long j14 = j12 + j13;
            this.f12371h1 = j14;
            this.f12372h2 = j13 + j14;
            this.f12371h1 = fmix64(j14);
            long jFmix64 = fmix64(this.f12372h2);
            long j15 = this.f12371h1 + jFmix64;
            this.f12371h1 = j15;
            this.f12372h2 = jFmix64 + j15;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f12371h1).putLong(this.f12372h2).array());
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            long j11;
            long j12;
            long j13;
            long j14;
            long j15;
            long j16;
            long j17;
            this.length += byteBuffer.remaining();
            long j18 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j11 = 0;
                    j17 = j11 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 2:
                    j12 = 0;
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j17 = j11 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 3:
                    j13 = 0;
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j13;
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j17 = j11 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 4:
                    j14 = 0;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j13;
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j17 = j11 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 5:
                    j15 = 0;
                    j14 = j15 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j13;
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j17 = j11 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 6:
                    j16 = 0;
                    j15 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j16;
                    j14 = j15 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j13;
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j17 = j11 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 7:
                    j16 = ((long) UnsignedBytes.toInt(byteBuffer.get(6))) << 48;
                    j15 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j16;
                    j14 = j15 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j13;
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j17 = j11 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 8:
                    j17 = byteBuffer.getLong();
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 9:
                    j18 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j17 = byteBuffer.getLong();
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 10:
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j18 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j17 = byteBuffer.getLong();
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 11:
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j18 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j17 = byteBuffer.getLong();
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 12:
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j18 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j17 = byteBuffer.getLong();
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 13:
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j18 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j17 = byteBuffer.getLong();
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 14:
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j18 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j17 = byteBuffer.getLong();
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                case 15:
                    j18 = ((long) UnsignedBytes.toInt(byteBuffer.get(14))) << 48;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j18 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j18 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j17 = byteBuffer.getLong();
                    this.f12371h1 = mixK1(j17) ^ this.f12371h1;
                    this.f12372h2 ^= mixK2(j18);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            bmix64(byteBuffer.getLong(), byteBuffer.getLong());
            this.length += 16;
        }

        private static long mixK1(long j11) {
            return Long.rotateLeft(j11 * f12369C1, 31) * f12370C2;
        }

        private static long mixK2(long j11) {
            return Long.rotateLeft(j11 * f12370C2, 33) * f12369C1;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) obj).seed;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.seed + ")";
    }

    public Murmur3_128HashFunction(int i11) {
        this.seed = i11;
    }
}
