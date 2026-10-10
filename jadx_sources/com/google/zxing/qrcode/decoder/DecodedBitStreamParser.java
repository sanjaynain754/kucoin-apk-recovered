package com.google.zxing.qrcode.decoder;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.StringUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    private static void decodeNumericSegment(BitSource bitSource, StringBuilder sb2, int i11) throws FormatException {
        while (i11 >= 3) {
            if (bitSource.available() < 10) {
                throw FormatException.getFormatInstance();
            }
            int bits = bitSource.readBits(10);
            if (bits >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(toAlphaNumericChar(bits / 100));
            sb2.append(toAlphaNumericChar((bits / 10) % 10));
            sb2.append(toAlphaNumericChar(bits % 10));
            i11 -= 3;
        }
        if (i11 == 2) {
            if (bitSource.available() < 7) {
                throw FormatException.getFormatInstance();
            }
            int bits2 = bitSource.readBits(7);
            if (bits2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(toAlphaNumericChar(bits2 / 10));
            sb2.append(toAlphaNumericChar(bits2 % 10));
            return;
        }
        if (i11 == 1) {
            if (bitSource.available() < 4) {
                throw FormatException.getFormatInstance();
            }
            int bits3 = bitSource.readBits(4);
            if (bits3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(toAlphaNumericChar(bits3));
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1 */
    public static /* synthetic */ class C91651 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static DecoderResult decode(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        byte[] bArr2 = bArr;
        BitSource bitSource = new BitSource(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int bits = -1;
        int bits2 = -1;
        boolean z11 = false;
        CharacterSetECI characterSetECIByValue = null;
        while (true) {
            try {
                Mode modeForBits = bitSource.available() < 4 ? Mode.TERMINATOR : Mode.forBits(bitSource.readBits(4));
                int[] iArr = C91651.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
                switch (iArr[modeForBits.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z11 = true;
                        break;
                    case 8:
                        if (bitSource.available() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        bits = bitSource.readBits(8);
                        bits2 = bitSource.readBits(8);
                        break;
                        break;
                    case 9:
                        characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(parseECIValue(bitSource));
                        if (characterSetECIByValue == null) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                        break;
                    case 10:
                        int bits3 = bitSource.readBits(4);
                        int bits4 = bitSource.readBits(modeForBits.getCharacterCountBits(version));
                        if (bits3 == 1) {
                            decodeHanziSegment(bitSource, sb2, bits4);
                        }
                        break;
                    default:
                        int bits5 = bitSource.readBits(modeForBits.getCharacterCountBits(version));
                        int i11 = iArr[modeForBits.ordinal()];
                        if (i11 == 1) {
                            decodeNumericSegment(bitSource, sb2, bits5);
                        } else if (i11 == 2) {
                            decodeAlphanumericSegment(bitSource, sb2, bits5, z11);
                        } else if (i11 == 3) {
                            decodeByteSegment(bitSource, sb2, bits5, characterSetECIByValue, arrayList, map);
                        } else {
                            if (i11 != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            decodeKanjiSegment(bitSource, sb2, bits5);
                        }
                        break;
                }
                if (modeForBits == Mode.TERMINATOR) {
                    String string = sb2.toString();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    return new DecoderResult(bArr2, string, arrayList, errorCorrectionLevel != null ? errorCorrectionLevel.toString() : null, bits, bits2);
                }
                bArr2 = bArr;
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    private static void decodeByteSegment(BitSource bitSource, StringBuilder sb2, int i11, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if ((i11 << 3) > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) bitSource.readBits(8);
        }
        try {
            sb2.append(new String(bArr, characterSetECI == null ? StringUtils.guessEncoding(bArr, map) : characterSetECI.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    private static void decodeHanziSegment(BitSource bitSource, StringBuilder sb2, int i11) throws FormatException {
        if (i11 * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i11 * 2];
        int i12 = 0;
        while (i11 > 0) {
            int bits = bitSource.readBits(13);
            int i13 = (bits % 96) | ((bits / 96) << 8);
            int i14 = i13 + (i13 < 959 ? 41377 : 42657);
            bArr[i12] = (byte) (i14 >> 8);
            bArr[i12 + 1] = (byte) i14;
            i12 += 2;
            i11--;
        }
        try {
            sb2.append(new String(bArr, StringUtils.GB2312));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    private static void decodeKanjiSegment(BitSource bitSource, StringBuilder sb2, int i11) throws FormatException {
        if (i11 * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i11 * 2];
        int i12 = 0;
        while (i11 > 0) {
            int bits = bitSource.readBits(13);
            int i13 = (bits % 192) | ((bits / 192) << 8);
            int i14 = i13 + (i13 < 7936 ? 33088 : 49472);
            bArr[i12] = (byte) (i14 >> 8);
            bArr[i12 + 1] = (byte) i14;
            i12 += 2;
            i11--;
        }
        try {
            sb2.append(new String(bArr, StringUtils.SHIFT_JIS));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    private static int parseECIValue(BitSource bitSource) throws FormatException {
        int bits = bitSource.readBits(8);
        if ((bits & 128) == 0) {
            return bits & 127;
        }
        if ((bits & 192) == 128) {
            return bitSource.readBits(8) | ((bits & 63) << 8);
        }
        if ((bits & 224) == 192) {
            return bitSource.readBits(16) | ((bits & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    private static char toAlphaNumericChar(int i11) throws FormatException {
        char[] cArr = ALPHANUMERIC_CHARS;
        if (i11 < cArr.length) {
            return cArr[i11];
        }
        throw FormatException.getFormatInstance();
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void decodeAlphanumericSegment(BitSource bitSource, StringBuilder sb2, int i11, boolean z11) throws FormatException {
        while (i11 > 1) {
            if (bitSource.available() >= 11) {
                int bits = bitSource.readBits(11);
                sb2.append(toAlphaNumericChar(bits / 45));
                sb2.append(toAlphaNumericChar(bits % 45));
                i11 -= 2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i11 == 1) {
            if (bitSource.available() >= 6) {
                sb2.append(toAlphaNumericChar(bitSource.readBits(6)));
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (z11) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i12 = length + 1;
                        if (sb2.charAt(i12) == '%') {
                            sb2.deleteCharAt(i12);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }
}
