package com.google.protobuf;

import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* JADX INFO: loaded from: classes56.dex */
    public static class DecodeUtil {
        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b11, char[] cArr, int i11) {
            cArr[i11] = (char) b11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b11, byte b12, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (b11 < -62 || isNotTrailingByte(b12)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i11] = (char) (((b11 & 31) << 6) | trailingByteValue(b12));
        }

        private static char highSurrogate(int i11) {
            return (char) ((i11 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b11) {
            return b11 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b11) {
            return b11 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b11) {
            return b11 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b11) {
            return b11 < -32;
        }

        private static char lowSurrogate(int i11) {
            return (char) ((i11 & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b11) {
            return b11 & 63;
        }

        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b12) && (((b11 << 28) + (b12 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0 && !isNotTrailingByte(b13) && !isNotTrailingByte(b14)) {
                int iTrailingByteValue = ((b11 & 7) << 18) | (trailingByteValue(b12) << 12) | (trailingByteValue(b13) << 6) | trailingByteValue(b14);
                cArr[i11] = highSurrogate(iTrailingByteValue);
                cArr[i11 + 1] = lowSurrogate(iTrailingByteValue);
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b11, byte b12, byte b13, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b12) && ((b11 != -32 || b12 >= -96) && ((b11 != -19 || b12 < -96) && !isNotTrailingByte(b13)))) {
                cArr[i11] = (char) (((b11 & 15) << 12) | (trailingByteValue(b12) << 6) | trailingByteValue(b13));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }
    }

    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i11, i12) : decodeUtf8Default(byteBuffer, i11, i12);
        }

        public abstract String decodeUtf8(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException;

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i11, int i12);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i11, int i12) {
            return partialIsValidUtf8(0, bArr, i11, i12) == 0;
        }

        public final int partialIsValidUtf8(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i11, byteBuffer, i12, i13) : partialIsValidUtf8Default(i11, byteBuffer, i12, i13);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i11, byteBuffer.array(), i12 + iArrayOffset, iArrayOffset + i13);
        }

        public abstract int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13);

        public abstract int partialIsValidUtf8Direct(int i11, ByteBuffer byteBuffer, int i12, int i13);

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = byteBuffer.get(i11);
                if (!DecodeUtil.isOneByte(b11)) {
                    break;
                }
                i11++;
                DecodeUtil.handleOneByte(b11, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = byteBuffer.get(i11);
                if (DecodeUtil.isOneByte(b12)) {
                    int i17 = i15 + 1;
                    DecodeUtil.handleOneByte(b12, cArr, i15);
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b13 = byteBuffer.get(i18);
                        if (!DecodeUtil.isOneByte(b13)) {
                            break;
                        }
                        i18++;
                        DecodeUtil.handleOneByte(b13, cArr, i17);
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (DecodeUtil.isTwoBytes(b12)) {
                    if (i16 >= i13) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i11 += 2;
                    DecodeUtil.handleTwoBytes(b12, byteBuffer.get(i16), cArr, i15);
                    i15++;
                } else if (DecodeUtil.isThreeBytes(b12)) {
                    if (i16 >= i13 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    DecodeUtil.handleThreeBytes(b12, byteBuffer.get(i16), byteBuffer.get(i19), cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b14 = byteBuffer.get(i16);
                    int i21 = i11 + 3;
                    byte b15 = byteBuffer.get(i11 + 2);
                    i11 += 4;
                    DecodeUtil.handleFourBytes(b12, b14, b15, byteBuffer.get(i21), cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i11, int i12) {
            return partialIsValidUtf8(0, byteBuffer, i11, i12) == 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int partialIsValidUtf8Default(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            byte b11;
            int i14;
            int i15;
            if (i11 != 0) {
                if (i12 >= i13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        int i16 = i12 + 1;
                        byte b14 = byteBuffer.get(i12);
                        if (i16 >= i13) {
                            return Utf8.incompleteStateFor(b12, b14);
                        }
                        i12 = i16;
                        b13 = b14;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                byte b15 = (byte) (~(i11 >> 8));
                if (b15 == 0) {
                    i14 = i12 + 1;
                    b15 = byteBuffer.get(i12);
                    if (i14 >= i13) {
                        return Utf8.incompleteStateFor(b12, b15);
                    }
                    b11 = 0;
                } else {
                    b11 = (byte) (i11 >> 16);
                    i14 = i12;
                }
                if (b11 == 0) {
                    int i17 = i14 + 1;
                    byte b16 = byteBuffer.get(i14);
                    if (i17 >= i13) {
                        return Utf8.incompleteStateFor(b12, b15, b16);
                    }
                    b11 = b16;
                    i14 = i17;
                }
                if (b15 <= -65 && (((b12 << 28) + (b15 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0 && b11 <= -65) {
                    i12 = i14 + 1;
                }
                return -1;
                i12 = i15;
            }
            return partialIsValidUtf8(byteBuffer, i12, i13);
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i11 = 0;
            while (i11 < length) {
                try {
                    char cCharAt = charSequence.charAt(i11);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i11, (byte) cCharAt);
                    i11++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i11 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i11);
                return;
            }
            iPosition += i11;
            while (i11 < length) {
                char cCharAt2 = charSequence.charAt(i11);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i12 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i12, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i12;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i12;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i13 = i11 + 1;
                        if (i13 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i14 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i15 = iPosition + 2;
                                        try {
                                            byteBuffer.put(i14, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            byteBuffer.put(i15, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i11 = i13;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i11 = i13;
                                            iPosition = i15;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i14;
                                        i11 = i13;
                                    }
                                } else {
                                    i11 = i13;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i11 = i13;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + (byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1)));
                        }
                        throw new UnpairedSurrogateException(i11, length);
                    }
                    int i16 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i16, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i11++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i11, int i12) {
            int iEstimateConsecutiveAscii = i11 + Utf8.estimateConsecutiveAscii(byteBuffer, i11, i12);
            while (iEstimateConsecutiveAscii < i12) {
                int i13 = iEstimateConsecutiveAscii + 1;
                byte b11 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b11 >= 0) {
                    iEstimateConsecutiveAscii = i13;
                } else if (b11 < -32) {
                    if (i13 >= i12) {
                        return b11;
                    }
                    if (b11 < -62 || byteBuffer.get(i13) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b11 >= -16) {
                        if (i13 >= i12 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b11, i13, i12 - i13);
                        }
                        int i14 = iEstimateConsecutiveAscii + 2;
                        byte b12 = byteBuffer.get(i13);
                        if (b12 <= -65 && (((b11 << 28) + (b12 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0) {
                            int i15 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i14) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i15) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i13 >= i12 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b11, i13, i12 - i13);
                    }
                    int i16 = iEstimateConsecutiveAscii + 2;
                    byte b13 = byteBuffer.get(i13);
                    if (b13 > -65 || ((b11 == -32 && b13 < -96) || ((b11 == -19 && b13 >= -96) || byteBuffer.get(i16) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    public static final class SafeProcessor extends Processor {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13) {
            byte b11;
            int i14;
            int i15;
            if (i11 != 0) {
                if (i12 >= i13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        int i16 = i12 + 1;
                        byte b14 = bArr[i12];
                        if (i16 >= i13) {
                            return Utf8.incompleteStateFor(b12, b14);
                        }
                        i12 = i16;
                        b13 = b14;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                byte b15 = (byte) (~(i11 >> 8));
                if (b15 == 0) {
                    i14 = i12 + 1;
                    b15 = bArr[i12];
                    if (i14 >= i13) {
                        return Utf8.incompleteStateFor(b12, b15);
                    }
                    b11 = 0;
                } else {
                    b11 = (byte) (i11 >> 16);
                    i14 = i12;
                }
                if (b11 == 0) {
                    int i17 = i14 + 1;
                    byte b16 = bArr[i14];
                    if (i17 >= i13) {
                        return Utf8.incompleteStateFor(b12, b15, b16);
                    }
                    b11 = b16;
                    i14 = i17;
                }
                if (b15 <= -65 && (((b12 << 28) + (b15 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0 && b11 <= -65) {
                    i12 = i14 + 1;
                }
                return -1;
                i12 = i15;
            }
            return partialIsValidUtf8(bArr, i12, i13);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i11, int i12) {
            while (i11 < i12) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i13 >= i12) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            i11 += 2;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b11 >= -16) {
                        if (i13 >= i12 - 2) {
                            return Utf8.incompleteStateFor(bArr, i13, i12);
                        }
                        int i14 = i11 + 2;
                        byte b12 = bArr[i13];
                        if (b12 <= -65 && (((b11 << 28) + (b12 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0) {
                            int i15 = i11 + 3;
                            if (bArr[i14] <= -65) {
                                i11 += 4;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i13 >= i12 - 1) {
                        return Utf8.incompleteStateFor(bArr, i13, i12);
                    }
                    int i16 = i11 + 2;
                    byte b13 = bArr[i13];
                    if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                        i11 += 3;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                i11 = i13;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                if (!DecodeUtil.isOneByte(b11)) {
                    break;
                }
                i11++;
                DecodeUtil.handleOneByte(b11, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = bArr[i11];
                if (DecodeUtil.isOneByte(b12)) {
                    int i17 = i15 + 1;
                    DecodeUtil.handleOneByte(b12, cArr, i15);
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b13 = bArr[i18];
                        if (!DecodeUtil.isOneByte(b13)) {
                            break;
                        }
                        i18++;
                        DecodeUtil.handleOneByte(b13, cArr, i17);
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (DecodeUtil.isTwoBytes(b12)) {
                    if (i16 >= i13) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i11 += 2;
                    DecodeUtil.handleTwoBytes(b12, bArr[i16], cArr, i15);
                    i15++;
                } else if (DecodeUtil.isThreeBytes(b12)) {
                    if (i16 >= i13 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    DecodeUtil.handleThreeBytes(b12, bArr[i16], bArr[i19], cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b14 = bArr[i16];
                    int i21 = i11 + 3;
                    byte b15 = bArr[i11 + 2];
                    i11 += 4;
                    DecodeUtil.handleFourBytes(b12, b14, b15, bArr[i21], cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i11, i12);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i11, int i12) {
            int i13;
            int i14;
            char cCharAt;
            int length = charSequence.length();
            int i15 = i12 + i11;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i11) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
                bArr[i14] = (byte) cCharAt;
                i16++;
            }
            if (i16 == length) {
                return i11 + length;
            }
            int i17 = i11 + i16;
            while (i16 < length) {
                char cCharAt2 = charSequence.charAt(i16);
                if (cCharAt2 < 128 && i17 < i15) {
                    bArr[i17] = (byte) cCharAt2;
                    i17++;
                } else if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                    i17 += 2;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && i17 <= i15 - 3) {
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | TXVodDownloadDataSource.QUALITY_480P);
                    int i19 = i17 + 2;
                    bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i17 += 3;
                    bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if (i17 <= i15 - 4) {
                        int i21 = i16 + 1;
                        if (i21 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i21);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i22 = i17 + 3;
                                bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 += 4;
                                bArr[i22] = (byte) ((codePoint & 63) | 128);
                                i16 = i21;
                            } else {
                                i16 = i21;
                            }
                        }
                        throw new UnpairedSurrogateException(i16 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                        throw new UnpairedSurrogateException(i16, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                }
                i16++;
            }
            return i17;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            return partialIsValidUtf8Default(i11, byteBuffer, i12, i13);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i11, int i12) {
            while (i11 < i12 && bArr[i11] >= 0) {
                i11++;
            }
            if (i11 >= i12) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i11, i12);
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    public static final class UnsafeProcessor extends Processor {
        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j11, int i11) {
            int i12 = 0;
            if (i11 < 16) {
                return 0;
            }
            int i13 = 8 - (((int) j11) & 7);
            while (i12 < i13) {
                long j12 = 1 + j11;
                if (UnsafeUtil.getByte(bArr, j11) < 0) {
                    return i12;
                }
                i12++;
                j11 = j12;
            }
            while (true) {
                int i14 = i12 + 8;
                if (i14 > i11 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j11) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j11 += 8;
                i12 = i14;
            }
            while (i12 < i11) {
                long j13 = j11 + 1;
                if (UnsafeUtil.getByte(bArr, j11) < 0) {
                    return i12;
                }
                i12++;
                j11 = j13;
            }
            return i11;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i11, long j11, int i12) {
            if (i12 == 0) {
                return Utf8.incompleteStateFor(i11);
            }
            if (i12 == 1) {
                return Utf8.incompleteStateFor(i11, UnsafeUtil.getByte(bArr, j11));
            }
            if (i12 == 2) {
                return Utf8.incompleteStateFor(i11, UnsafeUtil.getByte(bArr, j11), UnsafeUtil.getByte(bArr, j11 + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13) {
            byte b11;
            long j11;
            if ((i12 | i13 | (bArr.length - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long j12 = i12;
            long j13 = i13;
            if (i11 != 0) {
                if (j12 >= j13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        long j14 = 1 + j12;
                        if (UnsafeUtil.getByte(bArr, j12) <= -65) {
                            j12 = j14;
                        }
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        long j15 = j12 + 1;
                        b13 = UnsafeUtil.getByte(bArr, j12);
                        if (j15 >= j13) {
                            return Utf8.incompleteStateFor(b12, b13);
                        }
                        j12 = j15;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        j11 = j12 + 1;
                    }
                    return -1;
                }
                byte b14 = (byte) (~(i11 >> 8));
                if (b14 == 0) {
                    long j16 = j12 + 1;
                    b14 = UnsafeUtil.getByte(bArr, j12);
                    if (j16 >= j13) {
                        return Utf8.incompleteStateFor(b12, b14);
                    }
                    b11 = 0;
                    j12 = j16;
                } else {
                    b11 = (byte) (i11 >> 16);
                }
                if (b11 == 0) {
                    long j17 = j12 + 1;
                    b11 = UnsafeUtil.getByte(bArr, j12);
                    if (j17 >= j13) {
                        return Utf8.incompleteStateFor(b12, b14, b11);
                    }
                    j12 = j17;
                }
                if (b14 <= -65 && (((b12 << 28) + (b14 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0 && b11 <= -65) {
                    j11 = j12 + 1;
                }
                return -1;
                j12 = j11;
            }
            return partialIsValidUtf8(bArr, j12, (int) (j13 - j12));
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i11, i12, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i11, i12 + i11))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i11);
            long j11 = ((long) i12) + jAddressOffset;
            char[] cArr = new char[i12];
            int i13 = 0;
            while (jAddressOffset < j11) {
                byte b11 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b11)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b11, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (jAddressOffset < j11) {
                long j12 = jAddressOffset + 1;
                byte b12 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b12)) {
                    int i15 = i14 + 1;
                    DecodeUtil.handleOneByte(b12, cArr, i14);
                    long j13 = j12;
                    while (j13 < j11) {
                        byte b13 = UnsafeUtil.getByte(j13);
                        if (!DecodeUtil.isOneByte(b13)) {
                            break;
                        }
                        j13++;
                        DecodeUtil.handleOneByte(b13, cArr, i15);
                        i15++;
                    }
                    i14 = i15;
                    jAddressOffset = j13;
                } else if (DecodeUtil.isTwoBytes(b12)) {
                    if (j12 >= j11) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b12, UnsafeUtil.getByte(j12), cArr, i14);
                    i14++;
                } else if (DecodeUtil.isThreeBytes(b12)) {
                    if (j12 >= j11 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j14 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b12, UnsafeUtil.getByte(j12), UnsafeUtil.getByte(j14), cArr, i14);
                    i14++;
                } else {
                    if (j12 >= j11 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b14 = UnsafeUtil.getByte(j12);
                    long j15 = jAddressOffset + 3;
                    byte b15 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b12, b14, b15, UnsafeUtil.getByte(j15), cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i11, int i12) {
            long j11;
            long j12;
            long j13;
            int i13;
            char cCharAt;
            long j14 = i11;
            long j15 = ((long) i12) + j14;
            int length = charSequence.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i11 + i12));
            }
            int i14 = 0;
            while (true) {
                j11 = 1;
                if (i14 >= length || (cCharAt = charSequence.charAt(i14)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j14, (byte) cCharAt);
                i14++;
                j14 = 1 + j14;
            }
            if (i14 == length) {
                return (int) j14;
            }
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 < 128 && j14 < j15) {
                    UnsafeUtil.putByte(bArr, j14, (byte) cCharAt2);
                    j13 = j15;
                    j12 = j11;
                    j14 += j11;
                } else if (cCharAt2 >= 2048 || j14 > j15 - 2) {
                    j12 = j11;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j14 > j15 - 3) {
                        j13 = j15;
                        if (j14 > j13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                throw new UnpairedSurrogateException(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j14);
                        }
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char cCharAt3 = charSequence.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.putByte(bArr, j14 + j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j16 = j14 + 3;
                                UnsafeUtil.putByte(bArr, j14 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j14 += 4;
                                UnsafeUtil.putByte(bArr, j16, (byte) ((codePoint & 63) | 128));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new UnpairedSurrogateException(i14 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j14, (byte) ((cCharAt2 >>> '\f') | TXVodDownloadDataSource.QUALITY_480P));
                    long j17 = j14 + 2;
                    j13 = j15;
                    UnsafeUtil.putByte(bArr, j14 + j12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j14 += 3;
                    UnsafeUtil.putByte(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j12 = j11;
                    long j18 = j14 + j12;
                    UnsafeUtil.putByte(bArr, j14, (byte) ((cCharAt2 >>> 6) | 960));
                    j14 += 2;
                    UnsafeUtil.putByte(bArr, j18, (byte) ((cCharAt2 & '?') | 128));
                    j13 = j15;
                }
                i14++;
                j11 = j12;
                j15 = j13;
            }
            return (int) j14;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j11;
            char c11;
            long j12;
            int i11;
            char c12;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i12 = 0;
            while (true) {
                j11 = 1;
                c11 = 128;
                if (i12 >= length || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i12++;
                jPosition = 1 + jPosition;
            }
            if (i12 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 >= c11 || jPosition >= jLimit) {
                    j12 = j11;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j13 = jPosition + j12;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j13, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            jAddressOffset = jAddressOffset;
                            jLimit = jLimit;
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i11)))) {
                                    throw new UnpairedSurrogateException(i12, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i13 = i12 + 1;
                            if (i13 != length) {
                                char cCharAt3 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c12 = 128;
                                    UnsafeUtil.putByte(jPosition + j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j14 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j14, (byte) ((codePoint & 63) | 128));
                                    i12 = i13;
                                } else {
                                    i12 = i13;
                                }
                            }
                            throw new UnpairedSurrogateException(i12 - 1, length);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | TXVodDownloadDataSource.QUALITY_480P));
                        long j15 = jPosition + 2;
                        UnsafeUtil.putByte(jPosition + j12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        UnsafeUtil.putByte(j15, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c12 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    jAddressOffset = jAddressOffset;
                    jLimit = jLimit;
                    c12 = c11;
                    jPosition += j11;
                    j12 = j11;
                }
                i12++;
                c11 = c12;
                j11 = j12;
                jAddressOffset = jAddressOffset;
                jLimit = jLimit;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int partialIsValidUtf8Direct(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            byte b11;
            long j11;
            if ((i12 | i13 | (byteBuffer.limit() - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i12);
            long j12 = ((long) (i13 - i12)) + jAddressOffset;
            if (i11 != 0) {
                if (jAddressOffset >= j12) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        j11 = 1 + jAddressOffset;
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        long j13 = jAddressOffset + 1;
                        b13 = UnsafeUtil.getByte(jAddressOffset);
                        if (j13 >= j12) {
                            return Utf8.incompleteStateFor(b12, b13);
                        }
                        jAddressOffset = j13;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        j11 = 1 + jAddressOffset;
                    }
                    return -1;
                }
                byte b14 = (byte) (~(i11 >> 8));
                if (b14 == 0) {
                    long j14 = jAddressOffset + 1;
                    b14 = UnsafeUtil.getByte(jAddressOffset);
                    if (j14 >= j12) {
                        return Utf8.incompleteStateFor(b12, b14);
                    }
                    b11 = 0;
                    jAddressOffset = j14;
                } else {
                    b11 = (byte) (i11 >> 16);
                }
                if (b11 == 0) {
                    long j15 = jAddressOffset + 1;
                    b11 = UnsafeUtil.getByte(jAddressOffset);
                    if (j15 >= j12) {
                        return Utf8.incompleteStateFor(b12, b14, b11);
                    }
                    jAddressOffset = j15;
                }
                if (b14 <= -65 && (((b12 << 28) + (b14 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0 && b11 <= -65) {
                    j11 = 1 + jAddressOffset;
                }
                return -1;
                jAddressOffset = j11;
            }
            return partialIsValidUtf8(jAddressOffset, (int) (j12 - jAddressOffset));
        }

        public static boolean isAvailable() {
            if (UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations()) {
                return true;
            }
            return false;
        }

        private static int unsafeEstimateConsecutiveAscii(long j11, int i11) {
            if (i11 < 16) {
                return 0;
            }
            int i12 = (int) ((-j11) & 7);
            int i13 = i12;
            while (i13 > 0) {
                long j12 = 1 + j11;
                if (UnsafeUtil.getByte(j11) < 0) {
                    return i12 - i13;
                }
                i13--;
                j11 = j12;
            }
            int i14 = i11 - i12;
            while (i14 >= 8 && (UnsafeUtil.getLong(j11) & (-9187201950435737472L)) == 0) {
                j11 += 8;
                i14 -= 8;
            }
            return i11 - i14;
        }

        private static int unsafeIncompleteStateFor(long j11, int i11, int i12) {
            if (i12 == 0) {
                return Utf8.incompleteStateFor(i11);
            }
            if (i12 == 1) {
                return Utf8.incompleteStateFor(i11, UnsafeUtil.getByte(j11));
            }
            if (i12 == 2) {
                return Utf8.incompleteStateFor(i11, UnsafeUtil.getByte(j11), UnsafeUtil.getByte(j11 + 1));
            }
            throw new AssertionError();
        }

        private static int partialIsValidUtf8(byte[] bArr, long j11, int i11) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j11, i11);
            int i12 = i11 - iUnsafeEstimateConsecutiveAscii;
            long j12 = j11 + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b11 = 0;
                while (i12 > 0) {
                    long j13 = j12 + 1;
                    b11 = UnsafeUtil.getByte(bArr, j12);
                    if (b11 < 0) {
                        j12 = j13;
                        break;
                    }
                    i12--;
                    j12 = j13;
                }
                if (i12 == 0) {
                    return 0;
                }
                int i13 = i12 - 1;
                if (b11 < -32) {
                    if (i13 == 0) {
                        return b11;
                    }
                    i12 -= 2;
                    if (b11 >= -62) {
                        long j14 = 1 + j12;
                        if (UnsafeUtil.getByte(bArr, j12) <= -65) {
                            j12 = j14;
                        }
                    }
                    return -1;
                }
                if (b11 >= -16) {
                    if (i13 < 3) {
                        return unsafeIncompleteStateFor(bArr, b11, j12, i13);
                    }
                    i12 -= 4;
                    long j15 = 1 + j12;
                    byte b12 = UnsafeUtil.getByte(bArr, j12);
                    if (b12 <= -65 && (((b11 << 28) + (b12 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0) {
                        long j16 = 2 + j12;
                        if (UnsafeUtil.getByte(bArr, j15) <= -65) {
                            j12 += 3;
                            if (UnsafeUtil.getByte(bArr, j16) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i13 < 2) {
                    return unsafeIncompleteStateFor(bArr, b11, j12, i13);
                }
                i12 -= 3;
                long j17 = 1 + j12;
                byte b13 = UnsafeUtil.getByte(bArr, j12);
                if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                    j12 += 2;
                    if (UnsafeUtil.getByte(bArr, j17) > -65) {
                    }
                }
                return -1;
            }
        }

        private static int partialIsValidUtf8(long j11, int i11) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j11, i11);
            long j12 = j11 + ((long) iUnsafeEstimateConsecutiveAscii);
            int i12 = i11 - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b11 = 0;
                while (i12 > 0) {
                    long j13 = j12 + 1;
                    b11 = UnsafeUtil.getByte(j12);
                    if (b11 < 0) {
                        j12 = j13;
                        break;
                    }
                    i12--;
                    j12 = j13;
                }
                if (i12 == 0) {
                    return 0;
                }
                int i13 = i12 - 1;
                if (b11 < -32) {
                    if (i13 == 0) {
                        return b11;
                    }
                    i12 -= 2;
                    if (b11 >= -62) {
                        long j14 = 1 + j12;
                        if (UnsafeUtil.getByte(j12) <= -65) {
                            j12 = j14;
                        }
                    }
                    return -1;
                }
                if (b11 >= -16) {
                    if (i13 < 3) {
                        return unsafeIncompleteStateFor(j12, b11, i13);
                    }
                    i12 -= 4;
                    long j15 = 1 + j12;
                    byte b12 = UnsafeUtil.getByte(j12);
                    if (b12 <= -65 && (((b11 << 28) + (b12 + BuiltinOptions.ReadVariableOptions)) >> 30) == 0) {
                        long j16 = 2 + j12;
                        if (UnsafeUtil.getByte(j15) <= -65) {
                            j12 += 3;
                            if (UnsafeUtil.getByte(j16) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i13 < 2) {
                    return unsafeIncompleteStateFor(j12, b11, i13);
                }
                i12 -= 3;
                long j17 = 1 + j12;
                byte b13 = UnsafeUtil.getByte(j12);
                if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                    j12 += 2;
                    if (UnsafeUtil.getByte(j17) > -65) {
                    }
                }
                return -1;
            }
        }
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13) {
        return processor.partialIsValidUtf8(i11, bArr, i12, i13);
    }

    public static String decodeUtf8(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i11, i12);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        return processor.encodeUtf8(charSequence, bArr, i11, i12);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i11, int i12) {
        int i13 = i12 - 7;
        int i14 = i11;
        while (i14 < i13 && (byteBuffer.getLong(i14) & (-9187201950435737472L)) == 0) {
            i14 += 8;
        }
        return i14 - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i11, int i12) {
        return processor.isValidUtf8(bArr, i11, i12);
    }

    public static int partialIsValidUtf8(int i11, ByteBuffer byteBuffer, int i12, int i13) {
        return processor.partialIsValidUtf8(i11, byteBuffer, i12, i13);
    }

    static {
        Processor safeProcessor;
        if (UnsafeProcessor.isAvailable() && !Android.isOnAndroidDevice()) {
            safeProcessor = new UnsafeProcessor();
        } else {
            safeProcessor = new SafeProcessor();
        }
        processor = safeProcessor;
    }

    private Utf8() {
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int iEncodedLengthGeneral = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i11);
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) >= 65536) {
                        i11++;
                    } else {
                        throw new UnpairedSurrogateException(i11, length);
                    }
                }
            }
            i11++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            return incompleteStateFor(b11);
        }
        if (i13 == 1) {
            return incompleteStateFor(b11, bArr[i11]);
        }
        if (i13 == 2) {
            return incompleteStateFor(b11, bArr[i11], bArr[i11 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        if (i13 == 0) {
            return incompleteStateFor(i11);
        }
        if (i13 == 1) {
            return incompleteStateFor(i11, byteBuffer.get(i12));
        }
        if (i13 == 2) {
            return incompleteStateFor(i11, byteBuffer.get(i12), byteBuffer.get(i12 + 1));
        }
        throw new AssertionError();
    }
}
