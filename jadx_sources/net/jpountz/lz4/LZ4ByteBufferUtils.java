package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.jpountz.util.ByteBufferUtils;

/* JADX INFO: loaded from: classes61.dex */
enum LZ4ByteBufferUtils {
    ;

    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static class Match {
        int len;
        int ref;
        int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i11) {
            this.start += i11;
            this.ref += i11;
            this.len -= i11;
        }
    }

    public static int commonBytes(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        int iNumberOfTrailingZeros;
        int i14 = 0;
        while (i12 <= i13 - 8) {
            if (ByteBufferUtils.readLong(byteBuffer, i12) != ByteBufferUtils.readLong(byteBuffer, i11)) {
                if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                    iNumberOfTrailingZeros = Long.numberOfLeadingZeros(ByteBufferUtils.readLong(byteBuffer, i11) ^ ByteBufferUtils.readLong(byteBuffer, i12));
                } else {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(ByteBufferUtils.readLong(byteBuffer, i11) ^ ByteBufferUtils.readLong(byteBuffer, i12));
                }
                return i14 + (iNumberOfTrailingZeros >>> 3);
            }
            i14 += 8;
            i11 += 8;
            i12 += 8;
        }
        while (i12 < i13) {
            int i15 = i11 + 1;
            int i16 = i12 + 1;
            if (ByteBufferUtils.readByte(byteBuffer, i11) != ByteBufferUtils.readByte(byteBuffer, i12)) {
                break;
            }
            i14++;
            i11 = i15;
            i12 = i16;
        }
        return i14;
    }

    public static int commonBytesBackward(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        int i15 = 0;
        while (i11 > i13 && i12 > i14) {
            i11--;
            i12--;
            if (byteBuffer.get(i11) != byteBuffer.get(i12)) {
                break;
            }
            i15++;
        }
        return i15;
    }

    public static void safeArraycopy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            byteBuffer2.put(i12 + i14, byteBuffer.get(i11 + i14));
        }
    }

    public static void safeIncrementalCopy(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            byteBuffer.put(i12 + i14, byteBuffer.get(i11 + i14));
        }
    }

    public static void wildArraycopy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14 += 8) {
            try {
                byteBuffer2.putLong(i12 + i14, byteBuffer.getLong(i11 + i14));
            } catch (IndexOutOfBoundsException unused) {
                throw new LZ4Exception("Malformed input at offset " + i11);
            }
        }
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int encodeSequence(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, ByteBuffer byteBuffer2, int i15, int i16) {
        int i17;
        int i18;
        int i19 = i12 - i11;
        int iWriteLen = i15 + 1;
        if (iWriteLen + i19 + 8 + (i19 >>> 8) > i16) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i19 >= 15) {
            iWriteLen = writeLen(i19 - 15, byteBuffer2, iWriteLen);
            i17 = -16;
        } else {
            i17 = i19 << 4;
        }
        wildArraycopy(byteBuffer, i11, byteBuffer2, iWriteLen, i19);
        int i21 = iWriteLen + i19;
        int i22 = i12 - i13;
        byteBuffer2.put(i21, (byte) i22);
        int iWriteLen2 = i21 + 2;
        byteBuffer2.put(i21 + 1, (byte) (i22 >>> 8));
        int i23 = i14 - 4;
        if (i21 + 8 + (i23 >>> 8) > i16) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i23 >= 15) {
            i18 = i17 | 15;
            iWriteLen2 = writeLen(i14 - 19, byteBuffer2, iWriteLen2);
        } else {
            i18 = i23 | i17;
        }
        byteBuffer2.put(i15, (byte) i18);
        return iWriteLen2;
    }

    public static int lastLiterals(ByteBuffer byteBuffer, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        int iWriteLen;
        if (i13 + i12 + 1 + ((i12 + 240) / 255) > i14) {
            throw new LZ4Exception();
        }
        if (i12 >= 15) {
            byteBuffer2.put(i13, (byte) -16);
            iWriteLen = writeLen(i12 - 15, byteBuffer2, i13 + 1);
        } else {
            byteBuffer2.put(i13, (byte) (i12 << 4));
            iWriteLen = i13 + 1;
        }
        safeArraycopy(byteBuffer, i11, byteBuffer2, iWriteLen, i12);
        return iWriteLen + i12;
    }

    public static void wildIncrementalCopy(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if (i14 < 4) {
            int i15 = 0;
            for (int i16 = 0; i16 < 4; i16++) {
                ByteBufferUtils.writeByte(byteBuffer, i12 + i16, ByteBufferUtils.readByte(byteBuffer, i11 + i16));
            }
            int i17 = i12 + 4;
            int i18 = i11 + 4;
            int i19 = i17 - i18;
            if (i19 == 1) {
                i18 = i11 + 1;
            } else if (i19 == 2) {
                i18 = i11 + 2;
            } else if (i19 == 3) {
                i18 = i11 + 1;
                i15 = -1;
            } else if (i19 == 5) {
                i15 = 1;
            } else if (i19 == 6) {
                i15 = 2;
            } else if (i19 == 7) {
                i15 = 3;
            }
            ByteBufferUtils.writeInt(byteBuffer, i17, ByteBufferUtils.readInt(byteBuffer, i18));
            i12 += 8;
            i11 = i18 - i15;
        } else if (i14 < 8) {
            ByteBufferUtils.writeLong(byteBuffer, i12, ByteBufferUtils.readLong(byteBuffer, i11));
            i12 += i14;
        }
        while (i12 < i13) {
            ByteBufferUtils.writeLong(byteBuffer, i12, ByteBufferUtils.readLong(byteBuffer, i11));
            i12 += 8;
            i11 += 8;
        }
    }

    public static int writeLen(int i11, ByteBuffer byteBuffer, int i12) {
        while (i11 >= 255) {
            byteBuffer.put(i12, (byte) -1);
            i11 -= 255;
            i12++;
        }
        int i13 = i12 + 1;
        byteBuffer.put(i12, (byte) i11);
        return i13;
    }

    public static int hash(ByteBuffer byteBuffer, int i11) {
        return LZ4Utils.hash(ByteBufferUtils.readInt(byteBuffer, i11));
    }

    public static int hash64k(ByteBuffer byteBuffer, int i11) {
        return LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i11));
    }

    public static boolean readIntEquals(ByteBuffer byteBuffer, int i11, int i12) {
        if (byteBuffer.getInt(i11) == byteBuffer.getInt(i12)) {
            return true;
        }
        return false;
    }
}
