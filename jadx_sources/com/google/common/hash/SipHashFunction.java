package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    private final int f12376c;

    /* JADX INFO: renamed from: d */
    private final int f12377d;

    /* JADX INFO: renamed from: k0 */
    private final long f12378k0;

    /* JADX INFO: renamed from: k1 */
    private final long f12379k1;

    public static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* JADX INFO: renamed from: b */
        private long f12380b;

        /* JADX INFO: renamed from: c */
        private final int f12381c;

        /* JADX INFO: renamed from: d */
        private final int f12382d;
        private long finalM;

        /* JADX INFO: renamed from: v0 */
        private long f12383v0;

        /* JADX INFO: renamed from: v1 */
        private long f12384v1;

        /* JADX INFO: renamed from: v2 */
        private long f12385v2;

        /* JADX INFO: renamed from: v3 */
        private long f12386v3;

        private void sipRound(int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = this.f12383v0;
                long j12 = this.f12384v1;
                this.f12383v0 = j11 + j12;
                this.f12385v2 += this.f12386v3;
                this.f12384v1 = Long.rotateLeft(j12, 13);
                long jRotateLeft = Long.rotateLeft(this.f12386v3, 16);
                long j13 = this.f12384v1;
                long j14 = this.f12383v0;
                this.f12384v1 = j13 ^ j14;
                this.f12386v3 = jRotateLeft ^ this.f12385v2;
                long jRotateLeft2 = Long.rotateLeft(j14, 32);
                long j15 = this.f12385v2;
                long j16 = this.f12384v1;
                this.f12385v2 = j15 + j16;
                this.f12383v0 = jRotateLeft2 + this.f12386v3;
                this.f12384v1 = Long.rotateLeft(j16, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f12386v3, 21);
                long j17 = this.f12384v1;
                long j18 = this.f12385v2;
                this.f12384v1 = j17 ^ j18;
                this.f12386v3 = jRotateLeft3 ^ this.f12383v0;
                this.f12385v2 = Long.rotateLeft(j18, 32);
            }
        }

        public SipHasher(int i11, int i12, long j11, long j12) {
            super(8);
            this.f12380b = 0L;
            this.finalM = 0L;
            this.f12381c = i11;
            this.f12382d = i12;
            this.f12383v0 = 8317987319222330741L ^ j11;
            this.f12384v1 = 7237128888997146477L ^ j12;
            this.f12385v2 = 7816392313619706465L ^ j11;
            this.f12386v3 = 8387220255154660723L ^ j12;
        }

        private void processM(long j11) {
            this.f12386v3 ^= j11;
            sipRound(this.f12381c);
            this.f12383v0 = j11 ^ this.f12383v0;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j11 = this.finalM ^ (this.f12380b << 56);
            this.finalM = j11;
            processM(j11);
            this.f12385v2 ^= 255;
            sipRound(this.f12382d);
            return HashCode.fromLong(((this.f12383v0 ^ this.f12384v1) ^ this.f12385v2) ^ this.f12386v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            this.f12380b += 8;
            processM(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f12380b += (long) byteBuffer.remaining();
            int i11 = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (((long) byteBuffer.get()) & 255) << i11;
                i11 += 8;
            }
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.f12376c == sipHashFunction.f12376c && this.f12377d == sipHashFunction.f12377d && this.f12378k0 == sipHashFunction.f12378k0 && this.f12379k1 == sipHashFunction.f12379k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f12376c) ^ this.f12377d)) ^ this.f12378k0) ^ this.f12379k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f12376c, this.f12377d, this.f12378k0, this.f12379k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f12376c + "" + this.f12377d + "(" + this.f12378k0 + ", " + this.f12379k1 + ")";
    }

    public SipHashFunction(int i11, int i12, long j11, long j12) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "The number of SipRound iterations (c=%s) during Compression must be positive.", i11);
        Preconditions.checkArgument(i12 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i12);
        this.f12376c = i11;
        this.f12377d = i12;
        this.f12378k0 = j11;
        this.f12379k1 = j12;
    }
}
