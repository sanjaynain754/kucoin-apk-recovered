package com.google.flatbuffers;

import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class Utf8Safe extends Utf8 {

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    public static String decodeUtf8Array(byte[] bArr, int i11, int i12) {
        if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        int i13 = i11 + i12;
        char[] cArr = new char[i12];
        int i14 = 0;
        while (i11 < i13) {
            byte b11 = bArr[i11];
            if (!Utf8.DecodeUtil.isOneByte(b11)) {
                break;
            }
            i11++;
            Utf8.DecodeUtil.handleOneByte(b11, cArr, i14);
            i14++;
        }
        int i15 = i14;
        while (i11 < i13) {
            int i16 = i11 + 1;
            byte b12 = bArr[i11];
            if (Utf8.DecodeUtil.isOneByte(b12)) {
                int i17 = i15 + 1;
                Utf8.DecodeUtil.handleOneByte(b12, cArr, i15);
                int i18 = i16;
                while (i18 < i13) {
                    byte b13 = bArr[i18];
                    if (!Utf8.DecodeUtil.isOneByte(b13)) {
                        break;
                    }
                    i18++;
                    Utf8.DecodeUtil.handleOneByte(b13, cArr, i17);
                    i17++;
                }
                i15 = i17;
                i11 = i18;
            } else if (Utf8.DecodeUtil.isTwoBytes(b12)) {
                if (i16 >= i13) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i11 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b12, bArr[i16], cArr, i15);
                i15++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b12)) {
                if (i16 >= i13 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i19 = i11 + 2;
                i11 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b12, bArr[i16], bArr[i19], cArr, i15);
                i15++;
            } else {
                if (i16 >= i13 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b14 = bArr[i16];
                int i21 = i11 + 3;
                byte b15 = bArr[i11 + 2];
                i11 += 4;
                Utf8.DecodeUtil.handleFourBytes(b12, b14, b15, bArr[i21], cArr, i15);
                i15 += 2;
            }
        }
        return new String(cArr, 0, i15);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i11, int i12) {
        if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        int i13 = i11 + i12;
        char[] cArr = new char[i12];
        int i14 = 0;
        while (i11 < i13) {
            byte b11 = byteBuffer.get(i11);
            if (!Utf8.DecodeUtil.isOneByte(b11)) {
                break;
            }
            i11++;
            Utf8.DecodeUtil.handleOneByte(b11, cArr, i14);
            i14++;
        }
        int i15 = i14;
        while (i11 < i13) {
            int i16 = i11 + 1;
            byte b12 = byteBuffer.get(i11);
            if (Utf8.DecodeUtil.isOneByte(b12)) {
                int i17 = i15 + 1;
                Utf8.DecodeUtil.handleOneByte(b12, cArr, i15);
                int i18 = i16;
                while (i18 < i13) {
                    byte b13 = byteBuffer.get(i18);
                    if (!Utf8.DecodeUtil.isOneByte(b13)) {
                        break;
                    }
                    i18++;
                    Utf8.DecodeUtil.handleOneByte(b13, cArr, i17);
                    i17++;
                }
                i15 = i17;
                i11 = i18;
            } else if (Utf8.DecodeUtil.isTwoBytes(b12)) {
                if (i16 >= i13) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                i11 += 2;
                Utf8.DecodeUtil.handleTwoBytes(b12, byteBuffer.get(i16), cArr, i15);
                i15++;
            } else if (Utf8.DecodeUtil.isThreeBytes(b12)) {
                if (i16 >= i13 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i19 = i11 + 2;
                i11 += 3;
                Utf8.DecodeUtil.handleThreeBytes(b12, byteBuffer.get(i16), byteBuffer.get(i19), cArr, i15);
                i15++;
            } else {
                if (i16 >= i13 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b14 = byteBuffer.get(i16);
                int i21 = i11 + 3;
                byte b15 = byteBuffer.get(i11 + 2);
                i11 += 4;
                Utf8.DecodeUtil.handleFourBytes(b12, b14, b15, byteBuffer.get(i21), cArr, i15);
                i15 += 2;
            }
        }
        return new String(cArr, 0, i15);
    }

    private static int computeEncodedLength(CharSequence charSequence) {
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

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i11, int i12) {
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

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
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
            byteBuffer.position(iPosition + i11);
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
        byteBuffer.position(iPosition);
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

    @Override // com.google.flatbuffers.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i11, int i12) throws IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12);
        }
        return decodeUtf8Buffer(byteBuffer, i11, i12);
    }

    @Override // com.google.flatbuffers.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else {
            encodeUtf8Buffer(charSequence, byteBuffer);
        }
    }

    @Override // com.google.flatbuffers.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
