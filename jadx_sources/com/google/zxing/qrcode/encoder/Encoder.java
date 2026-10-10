package com.google.zxing.qrcode.encoder;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class Encoder {
    private static final int[] ALPHANUMERIC_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final String DEFAULT_BYTE_MODE_ENCODING = "ISO-8859-1";

    public static Mode chooseMode(String str) {
        return chooseMode(str, null);
    }

    private static Version chooseVersion(int i11, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i12 = 1; i12 <= 40; i12++) {
            Version versionForNumber = Version.getVersionForNumber(i12);
            if (willFit(i11, versionForNumber, errorCorrectionLevel)) {
                return versionForNumber;
            }
        }
        throw new WriterException("Data too big");
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return encode(str, errorCorrectionLevel, null);
    }

    public static byte[] generateECBytes(byte[] bArr, int i11) {
        int length = bArr.length;
        int[] iArr = new int[length + i11];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = bArr[i12] & 255;
        }
        new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr, i11);
        byte[] bArr2 = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i13] = (byte) iArr[length + i13];
        }
        return bArr2;
    }

    private static boolean isOnlyDoubleByteKanji(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = bytes[i11] & 255;
                if ((i12 < 129 || i12 > 159) && (i12 < 224 || i12 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static Version recommendVersion(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) throws WriterException {
        return chooseVersion(calculateBitsNeeded(mode, bitArray, bitArray2, chooseVersion(calculateBitsNeeded(mode, bitArray, bitArray2, Version.getVersionForNumber(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* JADX INFO: renamed from: com.google.zxing.qrcode.encoder.Encoder$1 */
    public static /* synthetic */ class C91671 {
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
        }
    }

    public static void appendBytes(String str, Mode mode, BitArray bitArray, String str2) throws WriterException {
        int i11 = C91671.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
        if (i11 == 1) {
            appendNumericBytes(str, bitArray);
            return;
        }
        if (i11 == 2) {
            appendAlphanumericBytes(str, bitArray);
        } else if (i11 == 3) {
            append8BitBytes(str, bitArray, str2);
        } else {
            if (i11 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            appendKanjiBytes(str, bitArray);
        }
    }

    private static void appendECI(CharacterSetECI characterSetECI, BitArray bitArray) {
        bitArray.appendBits(Mode.ECI.getBits(), 4);
        bitArray.appendBits(characterSetECI.getValue(), 8);
    }

    public static void appendKanjiBytes(String str, BitArray bitArray) throws WriterException {
        int i11;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i12 = 0; i12 < length; i12 += 2) {
                int i13 = ((bytes[i12] & 255) << 8) | (bytes[i12 + 1] & 255);
                int i14 = 33088;
                if (i13 >= 33088 && i13 <= 40956) {
                    i11 = i13 - i14;
                } else if (i13 < 57408 || i13 > 60351) {
                    i11 = -1;
                } else {
                    i14 = 49472;
                    i11 = i13 - i14;
                }
                if (i11 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                bitArray.appendBits(((i11 >> 8) * 192) + (i11 & 255), 13);
            }
        } catch (UnsupportedEncodingException e11) {
            throw new WriterException(e11);
        }
    }

    private static Mode chooseMode(String str, String str2) {
        if ("Shift_JIS".equals(str2) && isOnlyDoubleByteKanji(str)) {
            return Mode.KANJI;
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z12 = true;
            } else {
                if (getAlphanumericCode(cCharAt) == -1) {
                    return Mode.BYTE;
                }
                z11 = true;
            }
        }
        if (z11) {
            return Mode.ALPHANUMERIC;
        }
        return z12 ? Mode.NUMERIC : Mode.BYTE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        Version versionRecommendVersion;
        CharacterSetECI characterSetECIByName;
        boolean z11 = map != null && map.containsKey(EncodeHintType.CHARACTER_SET);
        String string = z11 ? map.get(EncodeHintType.CHARACTER_SET).toString() : DEFAULT_BYTE_MODE_ENCODING;
        Mode modeChooseMode = chooseMode(str, string);
        BitArray bitArray = new BitArray();
        Mode mode = Mode.BYTE;
        if (modeChooseMode == mode && z11 && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(string)) != null) {
            appendECI(characterSetECIByName, bitArray);
        }
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue()) {
                appendModeInfo(Mode.FNC1_FIRST_POSITION, bitArray);
            }
        }
        appendModeInfo(modeChooseMode, bitArray);
        BitArray bitArray2 = new BitArray();
        appendBytes(str, modeChooseMode, bitArray2, string);
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.QR_VERSION;
            if (map.containsKey(encodeHintType2)) {
                versionRecommendVersion = Version.getVersionForNumber(Integer.parseInt(map.get(encodeHintType2).toString()));
                if (!willFit(calculateBitsNeeded(modeChooseMode, bitArray, bitArray2, versionRecommendVersion), versionRecommendVersion, errorCorrectionLevel)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                versionRecommendVersion = recommendVersion(errorCorrectionLevel, modeChooseMode, bitArray, bitArray2);
            }
        } else {
            versionRecommendVersion = recommendVersion(errorCorrectionLevel, modeChooseMode, bitArray, bitArray2);
        }
        BitArray bitArray3 = new BitArray();
        bitArray3.appendBitArray(bitArray);
        appendLengthInfo(modeChooseMode == mode ? bitArray2.getSizeInBytes() : str.length(), versionRecommendVersion, modeChooseMode, bitArray3);
        bitArray3.appendBitArray(bitArray2);
        Version.ECBlocks eCBlocksForLevel = versionRecommendVersion.getECBlocksForLevel(errorCorrectionLevel);
        int totalCodewords = versionRecommendVersion.getTotalCodewords() - eCBlocksForLevel.getTotalECCodewords();
        terminateBits(totalCodewords, bitArray3);
        BitArray bitArrayInterleaveWithECBytes = interleaveWithECBytes(bitArray3, versionRecommendVersion.getTotalCodewords(), totalCodewords, eCBlocksForLevel.getNumBlocks());
        QRCode qRCode = new QRCode();
        qRCode.setECLevel(errorCorrectionLevel);
        qRCode.setMode(modeChooseMode);
        qRCode.setVersion(versionRecommendVersion);
        int dimensionForVersion = versionRecommendVersion.getDimensionForVersion();
        ByteMatrix byteMatrix = new ByteMatrix(dimensionForVersion, dimensionForVersion);
        int iChooseMaskPattern = chooseMaskPattern(bitArrayInterleaveWithECBytes, errorCorrectionLevel, versionRecommendVersion, byteMatrix);
        qRCode.setMaskPattern(iChooseMaskPattern);
        MatrixUtil.buildMatrix(bitArrayInterleaveWithECBytes, errorCorrectionLevel, versionRecommendVersion, iChooseMaskPattern, byteMatrix);
        qRCode.setMatrix(byteMatrix);
        return qRCode;
    }

    public static int getAlphanumericCode(int i11) {
        int[] iArr = ALPHANUMERIC_TABLE;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public static void getNumDataBytesAndNumECBytesForBlockID(int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2) throws WriterException {
        if (i14 >= i13) {
            throw new WriterException("Block ID too large");
        }
        int i15 = i11 % i13;
        int i16 = i13 - i15;
        int i17 = i11 / i13;
        int i18 = i17 + 1;
        int i19 = i12 / i13;
        int i21 = i19 + 1;
        int i22 = i17 - i19;
        int i23 = i18 - i21;
        if (i22 != i23) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i13 != i16 + i15) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i11 != ((i19 + i22) * i16) + ((i21 + i23) * i15)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i14 < i16) {
            iArr[0] = i19;
            iArr2[0] = i22;
        } else {
            iArr[0] = i21;
            iArr2[0] = i23;
        }
    }

    public static void terminateBits(int i11, BitArray bitArray) throws WriterException {
        int i12 = i11 << 3;
        if (bitArray.getSize() > i12) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray.getSize() + " > " + i12);
        }
        for (int i13 = 0; i13 < 4 && bitArray.getSize() < i12; i13++) {
            bitArray.appendBit(false);
        }
        int size = bitArray.getSize() & 7;
        if (size > 0) {
            while (size < 8) {
                bitArray.appendBit(false);
                size++;
            }
        }
        int sizeInBytes = i11 - bitArray.getSizeInBytes();
        for (int i14 = 0; i14 < sizeInBytes; i14++) {
            bitArray.appendBits((i14 & 1) == 0 ? 236 : 17, 8);
        }
        if (bitArray.getSize() != i12) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    private Encoder() {
    }

    public static void append8BitBytes(String str, BitArray bitArray, String str2) throws WriterException {
        try {
            for (byte b11 : str.getBytes(str2)) {
                bitArray.appendBits(b11, 8);
            }
        } catch (UnsupportedEncodingException e11) {
            throw new WriterException(e11);
        }
    }

    public static void appendAlphanumericBytes(CharSequence charSequence, BitArray bitArray) throws WriterException {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int alphanumericCode = getAlphanumericCode(charSequence.charAt(i11));
            if (alphanumericCode != -1) {
                int i12 = i11 + 1;
                if (i12 < length) {
                    int alphanumericCode2 = getAlphanumericCode(charSequence.charAt(i12));
                    if (alphanumericCode2 != -1) {
                        bitArray.appendBits((alphanumericCode * 45) + alphanumericCode2, 11);
                        i11 += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    bitArray.appendBits(alphanumericCode, 6);
                    i11 = i12;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    public static void appendLengthInfo(int i11, Version version, Mode mode, BitArray bitArray) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(version);
        int i12 = 1 << characterCountBits;
        if (i11 < i12) {
            bitArray.appendBits(i11, characterCountBits);
            return;
        }
        throw new WriterException(i11 + " is bigger than " + (i12 - 1));
    }

    public static void appendModeInfo(Mode mode, BitArray bitArray) {
        bitArray.appendBits(mode.getBits(), 4);
    }

    public static void appendNumericBytes(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int iCharAt = charSequence.charAt(i11) - '0';
            int i12 = i11 + 2;
            if (i12 < length) {
                bitArray.appendBits((iCharAt * 100) + ((charSequence.charAt(i11 + 1) - '0') * 10) + (charSequence.charAt(i12) - '0'), 10);
                i11 += 3;
            } else {
                i11++;
                if (i11 < length) {
                    bitArray.appendBits((iCharAt * 10) + (charSequence.charAt(i11) - '0'), 7);
                    i11 = i12;
                } else {
                    bitArray.appendBits(iCharAt, 4);
                }
            }
        }
    }

    private static int calculateBitsNeeded(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
        return bitArray.getSize() + mode.getCharacterCountBits(version) + bitArray2.getSize();
    }

    private static int calculateMaskPenalty(ByteMatrix byteMatrix) {
        return MaskUtil.applyMaskPenaltyRule1(byteMatrix) + MaskUtil.applyMaskPenaltyRule2(byteMatrix) + MaskUtil.applyMaskPenaltyRule3(byteMatrix) + MaskUtil.applyMaskPenaltyRule4(byteMatrix);
    }

    private static int chooseMaskPattern(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) throws WriterException {
        int i11 = Integer.MAX_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < 8; i13++) {
            MatrixUtil.buildMatrix(bitArray, errorCorrectionLevel, version, i13, byteMatrix);
            int iCalculateMaskPenalty = calculateMaskPenalty(byteMatrix);
            if (iCalculateMaskPenalty < i11) {
                i12 = i13;
                i11 = iCalculateMaskPenalty;
            }
        }
        return i12;
    }

    public static BitArray interleaveWithECBytes(BitArray bitArray, int i11, int i12, int i13) throws WriterException {
        if (bitArray.getSizeInBytes() == i12) {
            ArrayList arrayList = new ArrayList(i13);
            int i14 = 0;
            int i15 = 0;
            int iMax = 0;
            int iMax2 = 0;
            while (i14 < i13) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int i16 = i11;
                int i17 = i12;
                int i18 = i13;
                getNumDataBytesAndNumECBytesForBlockID(i16, i17, i18, i14, iArr, iArr2);
                int i19 = iArr[0];
                byte[] bArr = new byte[i19];
                bitArray.toBytes(i15 << 3, bArr, 0, i19);
                byte[] bArrGenerateECBytes = generateECBytes(bArr, iArr2[0]);
                arrayList.add(new BlockPair(bArr, bArrGenerateECBytes));
                iMax = Math.max(iMax, i19);
                iMax2 = Math.max(iMax2, bArrGenerateECBytes.length);
                i15 += iArr[0];
                i14++;
                i11 = i16;
                i12 = i17;
                i13 = i18;
            }
            int i21 = i11;
            if (i12 == i15) {
                BitArray bitArray2 = new BitArray();
                for (int i22 = 0; i22 < iMax; i22++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] dataBytes = ((BlockPair) it.next()).getDataBytes();
                        if (i22 < dataBytes.length) {
                            bitArray2.appendBits(dataBytes[i22], 8);
                        }
                    }
                }
                for (int i23 = 0; i23 < iMax2; i23++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] errorCorrectionBytes = ((BlockPair) it2.next()).getErrorCorrectionBytes();
                        if (i23 < errorCorrectionBytes.length) {
                            bitArray2.appendBits(errorCorrectionBytes[i23], 8);
                        }
                    }
                }
                if (i21 == bitArray2.getSizeInBytes()) {
                    return bitArray2;
                }
                throw new WriterException("Interleaving error: " + i21 + " and " + bitArray2.getSizeInBytes() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static boolean willFit(int i11, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        if (version.getTotalCodewords() - version.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (i11 + 7) / 8) {
            return true;
        }
        return false;
    }
}
