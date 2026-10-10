package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class ITFReader extends OneDReader {
    private static final float MAX_AVG_VARIANCE = 0.38f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.5f;

    /* JADX INFO: renamed from: N */
    private static final int f12794N = 1;

    /* JADX INFO: renamed from: W */
    private static final int f12795W = 3;

    /* JADX INFO: renamed from: w */
    private static final int f12796w = 2;
    private int narrowLineWidth = -1;
    private static final int[] DEFAULT_ALLOWED_LENGTHS = {6, 8, 10, 12, 14};
    private static final int[] START_PATTERN = {1, 1, 1, 1};
    private static final int[][] END_PATTERN_REVERSED = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    private static final int[][] PATTERNS = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    private static int[] findGuardPattern(BitArray bitArray, int i11, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = bitArray.getSize();
        int i12 = i11;
        boolean z11 = false;
        int i13 = 0;
        while (i11 < size) {
            if (bitArray.get(i11) != z11) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i12, i11};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z11 = !z11;
            }
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int decodeDigit(int[] iArr) throws NotFoundException {
        int length = PATTERNS.length;
        float f11 = 0.38f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, PATTERNS[i12], 0.5f);
            if (fPatternMatchVariance < f11) {
                i11 = i12;
                f11 = fPatternMatchVariance;
            } else if (fPatternMatchVariance == f11) {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            return i11 % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static void decodeMiddle(BitArray bitArray, int i11, int i12, StringBuilder sb2) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i11 < i12) {
            OneDReader.recordPattern(bitArray, i11, iArr);
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = i13 * 2;
                iArr2[i13] = iArr[i14];
                iArr3[i13] = iArr[i14 + 1];
            }
            sb2.append((char) (decodeDigit(iArr2) + 48));
            sb2.append((char) (decodeDigit(iArr3) + 48));
            for (int i15 = 0; i15 < 10; i15++) {
                i11 += iArr[i15];
            }
        }
    }

    private void validateQuietZone(BitArray bitArray, int i11) throws NotFoundException {
        int i12 = this.narrowLineWidth * 10;
        if (i12 >= i11) {
            i12 = i11;
        }
        for (int i13 = i11 - 1; i12 > 0 && i13 >= 0 && !bitArray.get(i13); i13--) {
            i12--;
        }
        if (i12 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private int[] decodeEnd(BitArray bitArray) throws NotFoundException {
        int[] iArrFindGuardPattern;
        bitArray.reverse();
        try {
            int iSkipWhiteSpace = skipWhiteSpace(bitArray);
            try {
                iArrFindGuardPattern = findGuardPattern(bitArray, iSkipWhiteSpace, END_PATTERN_REVERSED[0]);
            } catch (NotFoundException unused) {
                iArrFindGuardPattern = findGuardPattern(bitArray, iSkipWhiteSpace, END_PATTERN_REVERSED[1]);
            }
            validateQuietZone(bitArray, iArrFindGuardPattern[0]);
            int i11 = iArrFindGuardPattern[0];
            iArrFindGuardPattern[0] = bitArray.getSize() - iArrFindGuardPattern[1];
            iArrFindGuardPattern[1] = bitArray.getSize() - i11;
            bitArray.reverse();
            return iArrFindGuardPattern;
        } catch (Throwable th2) {
            bitArray.reverse();
            throw th2;
        }
    }

    private int[] decodeStart(BitArray bitArray) throws NotFoundException {
        int[] iArrFindGuardPattern = findGuardPattern(bitArray, skipWhiteSpace(bitArray), START_PATTERN);
        int i11 = iArrFindGuardPattern[1];
        int i12 = iArrFindGuardPattern[0];
        this.narrowLineWidth = (i11 - i12) / 4;
        validateQuietZone(bitArray, i12);
        return iArrFindGuardPattern;
    }

    private static int skipWhiteSpace(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        if (nextSet != size) {
            return nextSet;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i11, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        int[] iArr;
        boolean z11;
        int[] iArrDecodeStart = decodeStart(bitArray);
        int[] iArrDecodeEnd = decodeEnd(bitArray);
        StringBuilder sb2 = new StringBuilder(20);
        decodeMiddle(bitArray, iArrDecodeStart[1], iArrDecodeEnd[0], sb2);
        String string = sb2.toString();
        if (map != null) {
            iArr = (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = DEFAULT_ALLOWED_LENGTHS;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 < length2) {
                int i14 = iArr[i12];
                if (length == i14) {
                    z11 = true;
                    break;
                }
                if (i14 > i13) {
                    i13 = i14;
                }
                i12++;
            } else {
                z11 = false;
                break;
            }
        }
        if (!z11 && length > i13) {
            z11 = true;
        }
        if (z11) {
            float f11 = i11;
            return new Result(string, null, new ResultPoint[]{new ResultPoint(iArrDecodeStart[1], f11), new ResultPoint(iArrDecodeEnd[0], f11)}, BarcodeFormat.ITF);
        }
        throw FormatException.getFormatInstance();
    }
}
