package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

/* JADX INFO: loaded from: classes56.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static void drawBullsEye(BitMatrix bitMatrix, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13 += 2) {
            int i14 = i11 - i13;
            int i15 = i14;
            while (true) {
                int i16 = i11 + i13;
                if (i15 <= i16) {
                    bitMatrix.set(i15, i14);
                    bitMatrix.set(i15, i16);
                    bitMatrix.set(i14, i15);
                    bitMatrix.set(i16, i15);
                    i15++;
                }
            }
        }
        int i17 = i11 - i12;
        bitMatrix.set(i17, i17);
        int i18 = i17 + 1;
        bitMatrix.set(i18, i17);
        bitMatrix.set(i17, i18);
        int i19 = i11 + i12;
        bitMatrix.set(i19, i17);
        bitMatrix.set(i19, i18);
        bitMatrix.set(i19, i19 - 1);
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0);
    }

    private static GenericGF getGF(int i11) {
        if (i11 == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i11 == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i11 == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i11 == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i11 == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i11)));
    }

    private static int[] bitsToWords(BitArray bitArray, int i11, int i12) {
        int[] iArr = new int[i12];
        int size = bitArray.getSize() / i11;
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 |= bitArray.get((i13 * i11) + i15) ? 1 << ((i11 - i15) - 1) : 0;
            }
            iArr[i13] = i14;
        }
        return iArr;
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z11, int i11, BitArray bitArray) {
        int i12 = i11 / 2;
        int i13 = 0;
        if (z11) {
            while (i13 < 7) {
                int i14 = (i12 - 3) + i13;
                if (bitArray.get(i13)) {
                    bitMatrix.set(i14, i12 - 5);
                }
                if (bitArray.get(i13 + 7)) {
                    bitMatrix.set(i12 + 5, i14);
                }
                if (bitArray.get(20 - i13)) {
                    bitMatrix.set(i14, i12 + 5);
                }
                if (bitArray.get(27 - i13)) {
                    bitMatrix.set(i12 - 5, i14);
                }
                i13++;
            }
            return;
        }
        while (i13 < 10) {
            int i15 = (i12 - 5) + i13 + (i13 / 5);
            if (bitArray.get(i13)) {
                bitMatrix.set(i15, i12 - 7);
            }
            if (bitArray.get(i13 + 10)) {
                bitMatrix.set(i12 + 7, i15);
            }
            if (bitArray.get(29 - i13)) {
                bitMatrix.set(i15, i12 + 7);
            }
            if (bitArray.get(39 - i13)) {
                bitMatrix.set(i12 - 7, i15);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AztecCode encode(byte[] bArr, int i11, int i12) {
        BitArray bitArrayStuffBits;
        int i13;
        boolean z11;
        int iAbs;
        int i14;
        int i15;
        BitArray bitArrayEncode = new HighLevelEncoder(bArr).encode();
        int size = ((bitArrayEncode.getSize() * i11) / 100) + 11;
        int size2 = bitArrayEncode.getSize() + size;
        int i16 = 1;
        if (i12 != 0) {
            boolean z12 = i12 < 0;
            iAbs = Math.abs(i12);
            if (iAbs > (z12 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i12)));
            }
            i14 = totalBitsInLayer(iAbs, z12);
            i13 = WORD_SIZE[iAbs];
            int i17 = i14 - (i14 % i13);
            bitArrayStuffBits = stuffBits(bitArrayEncode, i13);
            if (bitArrayStuffBits.getSize() + size > i17) {
                z11 = z12;
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z12) {
                z11 = z12;
                if (bitArrayStuffBits.getSize() > (i13 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
        } else {
            BitArray bitArrayStuffBits2 = null;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (i18 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z13 = i18 <= 3 ? i16 : 0;
                int i21 = z13 != 0 ? i18 + 1 : i18;
                int i22 = totalBitsInLayer(i21, z13);
                if (size2 <= i22) {
                    if (bitArrayStuffBits2 == null || i19 != WORD_SIZE[i21]) {
                        int i23 = WORD_SIZE[i21];
                        i19 = i23;
                        bitArrayStuffBits2 = stuffBits(bitArrayEncode, i23);
                    }
                    int i24 = i22 - (i22 % i19);
                    if ((z13 == 0 || bitArrayStuffBits2.getSize() <= (i19 << 6)) && bitArrayStuffBits2.getSize() + size <= i24) {
                        bitArrayStuffBits = bitArrayStuffBits2;
                        i13 = i19;
                        z11 = z13;
                        iAbs = i21;
                        i14 = i22;
                        break;
                    }
                }
                i18++;
                i16 = i16;
            }
        }
        BitArray bitArrayGenerateCheckWords = generateCheckWords(bitArrayStuffBits, i14, i13);
        int size3 = bitArrayStuffBits.getSize() / i13;
        BitArray bitArrayGenerateModeMessage = generateModeMessage(z11, iAbs, size3);
        int i25 = (z11 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i25];
        int i26 = 2;
        if (z11) {
            for (int i27 = 0; i27 < i25; i27++) {
                iArr[i27] = i27;
            }
            i15 = i25;
        } else {
            int i28 = i25 / 2;
            i15 = i25 + 1 + (((i28 - 1) / 15) * 2);
            int i29 = i15 / 2;
            for (int i31 = 0; i31 < i28; i31++) {
                int i32 = (i31 / 15) + i31;
                iArr[(i28 - i31) - i16] = (i29 - i32) - 1;
                iArr[i28 + i31] = i32 + i29 + i16;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i15);
        int i33 = 0;
        for (int i34 = 0; i34 < iAbs; i34++) {
            int i35 = ((iAbs - i34) << i26) + (z11 ? 9 : 12);
            for (int i36 = 0; i36 < i35; i36++) {
                int i37 = i36 << 1;
                int i38 = 0;
                while (i38 < i26) {
                    int i39 = i16;
                    if (bitArrayGenerateCheckWords.get(i33 + i37 + i38)) {
                        int i41 = i34 << 1;
                        bitMatrix.set(iArr[i41 + i38], iArr[i41 + i36]);
                    }
                    if (bitArrayGenerateCheckWords.get((i35 << 1) + i33 + i37 + i38)) {
                        int i42 = i34 << 1;
                        bitMatrix.set(iArr[i42 + i36], iArr[((i25 - 1) - i42) - i38]);
                    }
                    if (bitArrayGenerateCheckWords.get((i35 << 2) + i33 + i37 + i38)) {
                        int i43 = (i25 - 1) - (i34 << 1);
                        bitMatrix.set(iArr[i43 - i38], iArr[i43 - i36]);
                    }
                    if (bitArrayGenerateCheckWords.get((i35 * 6) + i33 + i37 + i38)) {
                        int i44 = i34 << 1;
                        bitMatrix.set(iArr[((i25 - 1) - i44) - i36], iArr[i44 + i38]);
                    }
                    i38++;
                    i16 = i39;
                    i26 = i26;
                }
            }
            i33 += i35 << 3;
        }
        drawModeMessage(bitMatrix, z11, i15, bitArrayGenerateModeMessage);
        if (z11) {
            drawBullsEye(bitMatrix, i15 / 2, 5);
        } else {
            int i45 = i15 / 2;
            drawBullsEye(bitMatrix, i45, 7);
            int i46 = 0;
            int i47 = 0;
            while (i47 < (i25 / 2) - 1) {
                for (int i48 = i45 & 1; i48 < i15; i48 += 2) {
                    int i49 = i45 - i46;
                    bitMatrix.set(i49, i48);
                    int i51 = i45 + i46;
                    bitMatrix.set(i51, i48);
                    bitMatrix.set(i48, i49);
                    bitMatrix.set(i48, i51);
                }
                i47 += 15;
                i46 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z11);
        aztecCode.setSize(i15);
        aztecCode.setLayers(iAbs);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }

    public static BitArray generateModeMessage(boolean z11, int i11, int i12) {
        BitArray bitArray = new BitArray();
        if (z11) {
            bitArray.appendBits(i11 - 1, 2);
            bitArray.appendBits(i12 - 1, 6);
            return generateCheckWords(bitArray, 28, 4);
        }
        bitArray.appendBits(i11 - 1, 5);
        bitArray.appendBits(i12 - 1, 11);
        return generateCheckWords(bitArray, 40, 4);
    }

    public static BitArray stuffBits(BitArray bitArray, int i11) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i12 = (1 << i11) - 2;
        int i13 = 0;
        while (i13 < size) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = i13 + i15;
                if (i16 >= size || bitArray.get(i16)) {
                    i14 |= 1 << ((i11 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                bitArray2.appendBits(i17, i11);
            } else {
                if (i17 == 0) {
                    bitArray2.appendBits(i14 | 1, i11);
                } else {
                    bitArray2.appendBits(i14, i11);
                }
                i13 += i11;
            }
            i13--;
            i13 += i11;
        }
        return bitArray2;
    }

    private static int totalBitsInLayer(int i11, boolean z11) {
        return ((z11 ? 88 : 112) + (i11 << 4)) * i11;
    }

    private Encoder() {
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i11, int i12) {
        int size = bitArray.getSize() / i12;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i12));
        int i13 = i11 / i12;
        int[] iArrBitsToWords = bitsToWords(bitArray, i12, i13);
        reedSolomonEncoder.encode(iArrBitsToWords, i13 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i11 % i12);
        for (int i14 : iArrBitsToWords) {
            bitArray2.appendBits(i14, i12);
        }
        return bitArray2;
    }
}
