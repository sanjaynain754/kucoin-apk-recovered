package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class CodaBarReader extends OneDReader {
    private static final float MAX_ACCEPTABLE = 2.0f;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final float PADDING = 1.5f;
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCD";
    static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    static final int[] CHARACTER_ENCODINGS = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] STARTEND_ENCODING = {'A', 'B', 'C', 'D'};
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private int[] counters = new int[80];
    private int counterLength = 0;

    public static boolean arrayContains(char[] cArr, char c11) {
        if (cArr != null) {
            for (char c12 : cArr) {
                if (c12 == c11) {
                    return true;
                }
            }
        }
        return false;
    }

    private int findStartPattern() throws NotFoundException {
        for (int i11 = 1; i11 < this.counterLength; i11 += 2) {
            int narrowWidePattern = toNarrowWidePattern(i11);
            if (narrowWidePattern != -1 && arrayContains(STARTEND_ENCODING, ALPHABET[narrowWidePattern])) {
                int i12 = 0;
                for (int i13 = i11; i13 < i11 + 7; i13++) {
                    i12 += this.counters[i13];
                }
                if (i11 == 1 || this.counters[i11 - 1] >= i12 / 2) {
                    return i11;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void setCounters(BitArray bitArray) throws NotFoundException {
        int i11 = 0;
        this.counterLength = 0;
        int nextUnset = bitArray.getNextUnset(0);
        int size = bitArray.getSize();
        if (nextUnset >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z11 = true;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z11) {
                i11++;
            } else {
                counterAppend(i11);
                z11 = !z11;
                i11 = 1;
            }
            nextUnset++;
        }
        counterAppend(i11);
    }

    private void counterAppend(int i11) {
        int[] iArr = this.counters;
        int i12 = this.counterLength;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.counterLength = i13;
        if (i13 >= iArr.length) {
            int[] iArr2 = new int[i13 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.counters = iArr2;
        }
    }

    private int toNarrowWidePattern(int i11) {
        int i12 = i11 + 7;
        if (i12 >= this.counterLength) {
            return -1;
        }
        int[] iArr = this.counters;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        for (int i17 = i11; i17 < i12; i17 += 2) {
            int i18 = iArr[i17];
            if (i18 < i15) {
                i15 = i18;
            }
            if (i18 > i16) {
                i16 = i18;
            }
        }
        int i19 = (i15 + i16) / 2;
        int i21 = 0;
        for (int i22 = i11 + 1; i22 < i12; i22 += 2) {
            int i23 = iArr[i22];
            if (i23 < i13) {
                i13 = i23;
            }
            if (i23 > i21) {
                i21 = i23;
            }
        }
        int i24 = (i13 + i21) / 2;
        int i25 = 128;
        int i26 = 0;
        for (int i27 = 0; i27 < 7; i27++) {
            i25 >>= 1;
            if (iArr[i11 + i27] > ((i27 & 1) == 0 ? i19 : i24)) {
                i26 |= i25;
            }
        }
        while (true) {
            int[] iArr2 = CHARACTER_ENCODINGS;
            if (i14 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i14] == i26) {
                return i14;
            }
            i14++;
        }
    }

    private void validatePattern(int i11) throws NotFoundException {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.decodeRowResult.length() - 1;
        int i12 = i11;
        int i13 = 0;
        while (true) {
            int i14 = CHARACTER_ENCODINGS[this.decodeRowResult.charAt(i13)];
            for (int i15 = 6; i15 >= 0; i15--) {
                int i16 = (i15 & 1) + ((i14 & 1) << 1);
                iArr[i16] = iArr[i16] + this.counters[i12 + i15];
                iArr2[i16] = iArr2[i16] + 1;
                i14 >>= 1;
            }
            if (i13 >= length) {
                break;
            }
            i12 += 8;
            i13++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i17 = 0; i17 < 2; i17++) {
            fArr2[i17] = 0.0f;
            int i18 = i17 + 2;
            float f11 = iArr[i17] / iArr2[i17];
            int i19 = iArr[i18];
            int i21 = iArr2[i18];
            float f12 = (f11 + (i19 / i21)) / 2.0f;
            fArr2[i18] = f12;
            fArr[i17] = f12;
            fArr[i18] = ((i19 * 2.0f) + 1.5f) / i21;
        }
        int i22 = i11;
        int i23 = 0;
        loop3: while (true) {
            int i24 = CHARACTER_ENCODINGS[this.decodeRowResult.charAt(i23)];
            for (int i25 = 6; i25 >= 0; i25--) {
                int i26 = (i25 & 1) + ((i24 & 1) << 1);
                float f13 = this.counters[i22 + i25];
                if (f13 < fArr2[i26] || f13 > fArr[i26]) {
                    break loop3;
                }
                i24 >>= 1;
            }
            if (i23 >= length) {
                return;
            }
            i22 += 8;
            i23++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i11, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i12;
        Arrays.fill(this.counters, 0);
        setCounters(bitArray);
        int iFindStartPattern = findStartPattern();
        this.decodeRowResult.setLength(0);
        int i13 = iFindStartPattern;
        while (true) {
            int narrowWidePattern = toNarrowWidePattern(i13);
            if (narrowWidePattern == -1) {
                throw NotFoundException.getNotFoundInstance();
            }
            this.decodeRowResult.append((char) narrowWidePattern);
            i12 = i13 + 8;
            if ((this.decodeRowResult.length() > 1 && arrayContains(STARTEND_ENCODING, ALPHABET[narrowWidePattern])) || i12 >= this.counterLength) {
                break;
            }
            i13 = i12;
        }
        int i14 = i13 + 7;
        int i15 = this.counters[i14];
        int i16 = 0;
        for (int i17 = -8; i17 < -1; i17++) {
            i16 += this.counters[i12 + i17];
        }
        if (i12 < this.counterLength && i15 < i16 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        validatePattern(iFindStartPattern);
        for (int i18 = 0; i18 < this.decodeRowResult.length(); i18++) {
            StringBuilder sb2 = this.decodeRowResult;
            sb2.setCharAt(i18, ALPHABET[sb2.charAt(i18)]);
        }
        char cCharAt = this.decodeRowResult.charAt(0);
        char[] cArr = STARTEND_ENCODING;
        if (!arrayContains(cArr, cCharAt)) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb3 = this.decodeRowResult;
        if (!arrayContains(cArr, sb3.charAt(sb3.length() - 1))) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (this.decodeRowResult.length() <= 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.decodeRowResult;
            sb4.deleteCharAt(sb4.length() - 1);
            this.decodeRowResult.deleteCharAt(0);
        }
        int i19 = 0;
        for (int i21 = 0; i21 < iFindStartPattern; i21++) {
            i19 += this.counters[i21];
        }
        float f11 = i19;
        while (iFindStartPattern < i14) {
            i19 += this.counters[iFindStartPattern];
            iFindStartPattern++;
        }
        float f12 = i11;
        return new Result(this.decodeRowResult.toString(), null, new ResultPoint[]{new ResultPoint(f11, f12), new ResultPoint(i19, f12)}, BarcodeFormat.CODABAR);
    }
}
