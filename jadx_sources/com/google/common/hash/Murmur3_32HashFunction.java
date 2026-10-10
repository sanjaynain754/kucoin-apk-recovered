package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes56.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: C1 */
    private static final int f12373C1 = -862048943;

    /* JADX INFO: renamed from: C2 */
    private static final int f12374C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;
    static final HashFunction MURMUR3_32 = new Murmur3_32HashFunction(0, false);
    static final HashFunction MURMUR3_32_FIXED = new Murmur3_32HashFunction(0, true);
    static final HashFunction GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(Hashing.GOOD_FAST_HASH_SEED, true);

    public static final class Murmur3_32Hasher extends AbstractHasher {
        private long buffer;

        /* JADX INFO: renamed from: h1 */
        private int f12375h1;
        private int shift;
        private int length = 0;
        private boolean isDone = false;

        private void update(int i11, long j11) {
            long j12 = this.buffer;
            long j13 = j11 & KeyboardMap.kValueMask;
            int i12 = this.shift;
            long j14 = (j13 << i12) | j12;
            this.buffer = j14;
            int i13 = i12 + (i11 * 8);
            this.shift = i13;
            this.length += i11;
            if (i13 >= 32) {
                this.f12375h1 = Murmur3_32HashFunction.mixH1(this.f12375h1, Murmur3_32HashFunction.mixK1((int) j14));
                this.buffer >>>= 32;
                this.shift -= 32;
            }
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            Preconditions.checkState(!this.isDone);
            this.isDone = true;
            int iMixK1 = this.f12375h1 ^ Murmur3_32HashFunction.mixK1((int) this.buffer);
            this.f12375h1 = iMixK1;
            return Murmur3_32HashFunction.fmix(iMixK1, this.length);
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putByte(byte b11) {
            update(1, b11 & 255);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putChar(char c11) {
            update(2, c11);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putInt(int i11) {
            update(4, i11);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putLong(long j11) {
            update(4, (int) j11);
            update(4, j11 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putString(CharSequence charSequence, Charset charset) {
            if (!StandardCharsets.UTF_8.equals(charset)) {
                return super.putString(charSequence, charset);
            }
            int length = charSequence.length();
            int i11 = 0;
            while (true) {
                int i12 = i11 + 4;
                if (i12 > length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i11);
                char cCharAt2 = charSequence.charAt(i11 + 1);
                char cCharAt3 = charSequence.charAt(i11 + 2);
                char cCharAt4 = charSequence.charAt(i11 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                update(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                i11 = i12;
            }
            while (i11 < length) {
                char cCharAt5 = charSequence.charAt(i11);
                if (cCharAt5 < 128) {
                    update(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    update(2, Murmur3_32HashFunction.charToTwoUtf8Bytes(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    update(3, Murmur3_32HashFunction.charToThreeUtf8Bytes(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i11);
                    if (iCodePointAt == cCharAt5) {
                        putBytes(charSequence.subSequence(i11, length).toString().getBytes(charset));
                        return this;
                    }
                    i11++;
                    update(4, Murmur3_32HashFunction.codePointToFourUtf8Bytes(iCodePointAt));
                }
                i11++;
            }
            return this;
        }

        public Murmur3_32Hasher(int i11) {
            this.f12375h1 = i11;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putBytes(byte[] bArr, int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
            int i13 = 0;
            while (true) {
                int i14 = i13 + 4;
                if (i14 > i12) {
                    break;
                }
                update(4, Murmur3_32HashFunction.getIntLittleEndian(bArr, i13 + i11));
                i13 = i14;
            }
            while (i13 < i12) {
                putByte(bArr[i11 + i13]);
                i13++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putBytes(ByteBuffer byteBuffer) {
            ByteOrder byteOrderOrder = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                putInt(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                putByte(byteBuffer.get());
            }
            byteBuffer.order(byteOrderOrder);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashCode fmix(int i11, int i12) {
        int i13 = i11 ^ i12;
        int i14 = (i13 ^ (i13 >>> 16)) * (-2048144789);
        int i15 = (i14 ^ (i14 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i15 ^ (i15 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int i11, int i12) {
        return (Integer.rotateLeft(i11 ^ i12, 13) * 5) - 430675100;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long j11) {
        return fmix(mixH1(mixH1(this.seed, mixK1((int) j11)), mixK1((int) (j11 >>> 32))), 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c11) {
        return ((long) (c11 >>> '\f')) | 224 | ((long) ((((c11 >>> 6) & 63) | 128) << 8)) | ((long) (((c11 & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c11) {
        return ((long) (c11 >>> 6)) | 192 | ((long) (((c11 & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int i11) {
        return ((long) (i11 >>> 18)) | 240 | ((((long) ((i11 >>> 12) & 63)) | 128) << 8) | ((((long) ((i11 >>> 6) & 63)) | 128) << 16) | ((((long) (i11 & 63)) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] bArr, int i11) {
        return Ints.fromBytes(bArr[i11 + 3], bArr[i11 + 2], bArr[i11 + 1], bArr[i11]);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Murmur3_32HashFunction) {
            Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
            if (this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i11, int i12) {
        Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
        int iMixH1 = this.seed;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i14 + 4;
            if (i15 > i12) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1(getIntLittleEndian(bArr, i14 + i11)));
            i14 = i15;
        }
        int i16 = i14;
        int i17 = 0;
        while (i16 < i12) {
            i13 ^= UnsignedBytes.toInt(bArr[i11 + i16]) << i17;
            i16++;
            i17 += 8;
        }
        return fmix(mixK1(i13) ^ iMixH1, i12);
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        if (!StandardCharsets.UTF_8.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int iMixH1 = this.seed;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i12 + 4;
            if (i14 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i12);
            char cCharAt2 = charSequence.charAt(i12 + 1);
            char cCharAt3 = charSequence.charAt(i12 + 2);
            char cCharAt4 = charSequence.charAt(i12 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i13 += 4;
            i12 = i14;
        }
        long jCharToThreeUtf8Bytes = 0;
        while (i12 < length) {
            char cCharAt5 = charSequence.charAt(i12);
            if (cCharAt5 < 128) {
                jCharToThreeUtf8Bytes |= ((long) cCharAt5) << i11;
                i11 += 8;
                i13++;
            } else if (cCharAt5 < 2048) {
                jCharToThreeUtf8Bytes |= charToTwoUtf8Bytes(cCharAt5) << i11;
                i11 += 16;
                i13 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jCharToThreeUtf8Bytes |= charToThreeUtf8Bytes(cCharAt5) << i11;
                i11 += 24;
                i13 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i12);
                if (iCodePointAt == cCharAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i12++;
                jCharToThreeUtf8Bytes |= codePointToFourUtf8Bytes(iCodePointAt) << i11;
                if (this.supplementaryPlaneFix) {
                    i11 += 32;
                }
                i13 += 4;
            }
            if (i11 >= 32) {
                iMixH1 = mixH1(iMixH1, mixK1((int) jCharToThreeUtf8Bytes));
                jCharToThreeUtf8Bytes >>>= 32;
                i11 -= 32;
            }
            i12++;
        }
        return fmix(mixK1((int) jCharToThreeUtf8Bytes) ^ iMixH1, i13);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int iMixK1 = this.seed;
        for (int i11 = 1; i11 < charSequence.length(); i11 += 2) {
            iMixK1 = mixH1(iMixK1, mixK1(charSequence.charAt(i11 - 1) | (charSequence.charAt(i11) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            iMixK1 ^= mixK1(charSequence.charAt(charSequence.length() - 1));
        }
        return fmix(iMixK1, charSequence.length() * 2);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_32Hasher(this.seed);
    }

    public String toString() {
        return "Hashing.murmur3_32(" + this.seed + ")";
    }

    public Murmur3_32HashFunction(int i11, boolean z11) {
        this.seed = i11;
        this.supplementaryPlaneFix = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int i11) {
        return Integer.rotateLeft(i11 * (-862048943), 15) * f12374C2;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int i11) {
        return fmix(mixH1(this.seed, mixK1(i11)), 4);
    }
}
