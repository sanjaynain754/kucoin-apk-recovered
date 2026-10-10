package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public abstract class UPCEANReader extends OneDReader {
    static final int[][] L_AND_G_PATTERNS;
    static final int[][] L_PATTERNS;
    private static final float MAX_AVG_VARIANCE = 0.48f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;
    static final int[] START_END_PATTERN = {1, 1, 1};
    static final int[] MIDDLE_PATTERN = {1, 1, 1, 1, 1};
    static final int[] END_PATTERN = {1, 1, 1, 1, 1, 1};
    private final StringBuilder decodeRowStringBuffer = new StringBuilder(20);
    private final UPCEANExtensionSupport extensionReader = new UPCEANExtensionSupport();
    private final EANManufacturerOrgSupport eanManSupport = new EANManufacturerOrgSupport();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        L_PATTERNS = iArr;
        int[][] iArr2 = new int[20][];
        L_AND_G_PATTERNS = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i11 = 10; i11 < 20; i11++) {
            int[] iArr3 = L_PATTERNS[i11 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                iArr4[i12] = iArr3[(iArr3.length - i12) - 1];
            }
            L_AND_G_PATTERNS[i11] = iArr4;
        }
    }

    public static int[] findGuardPattern(BitArray bitArray, int i11, boolean z11, int[] iArr) throws NotFoundException {
        return findGuardPattern(bitArray, i11, z11, iArr, new int[iArr.length]);
    }

    public int[] decodeEnd(BitArray bitArray, int i11) throws NotFoundException {
        return findGuardPattern(bitArray, i11, false, START_END_PATTERN);
    }

    public abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException;

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i11, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return decodeRow(i11, bitArray, findStartGuardPattern(bitArray), map);
    }

    public abstract BarcodeFormat getBarcodeFormat();

    private static int[] findGuardPattern(BitArray bitArray, int i11, boolean z11, int[] iArr, int[] iArr2) throws NotFoundException {
        int size = bitArray.getSize();
        int nextUnset = z11 ? bitArray.getNextUnset(i11) : bitArray.getNextSet(i11);
        int length = iArr.length;
        boolean z12 = z11;
        int i12 = 0;
        int i13 = nextUnset;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z12) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.7f) < MAX_AVG_VARIANCE) {
                        return new int[]{i13, nextUnset};
                    }
                    i13 += iArr2[0] + iArr2[1];
                    int i14 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z12 = !z12;
            }
            nextUnset++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] findStartGuardPattern(BitArray bitArray) throws NotFoundException {
        int[] iArr = new int[START_END_PATTERN.length];
        int[] iArrFindGuardPattern = null;
        boolean zIsRange = false;
        int i11 = 0;
        while (!zIsRange) {
            int[] iArr2 = START_END_PATTERN;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrFindGuardPattern = findGuardPattern(bitArray, i11, false, iArr2, iArr);
            int i12 = iArrFindGuardPattern[0];
            int i13 = iArrFindGuardPattern[1];
            int i14 = i12 - (i13 - i12);
            if (i14 >= 0) {
                zIsRange = bitArray.isRange(i14, i12, false);
            }
            i11 = i13;
        }
        return iArrFindGuardPattern;
    }

    public Result decodeRow(int i11, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strLookupCountryIdentifier;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        int i12 = 0;
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i11));
        }
        StringBuilder sb2 = this.decodeRowStringBuffer;
        sb2.setLength(0);
        int iDecodeMiddle = decodeMiddle(bitArray, iArr, sb2);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(iDecodeMiddle, i11));
        }
        int[] iArrDecodeEnd = decodeEnd(bitArray, iDecodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArrDecodeEnd[0] + iArrDecodeEnd[1]) / 2.0f, i11));
        }
        int i13 = iArrDecodeEnd[1];
        int i14 = (i13 - iArrDecodeEnd[0]) + i13;
        if (i14 >= bitArray.getSize() || !bitArray.isRange(i13, i14, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!checkChecksum(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f11 = (iArr[1] + iArr[0]) / 2.0f;
        float f12 = (iArrDecodeEnd[1] + iArrDecodeEnd[0]) / 2.0f;
        BarcodeFormat barcodeFormat = getBarcodeFormat();
        float f13 = i11;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint(f11, f13), new ResultPoint(f12, f13)}, barcodeFormat);
        try {
            Result resultDecodeRow = this.extensionReader.decodeRow(i11, bitArray, iArrDecodeEnd[1]);
            result.putMetadata(ResultMetadataType.UPC_EAN_EXTENSION, resultDecodeRow.getText());
            result.putAllMetadata(resultDecodeRow.getResultMetadata());
            result.addResultPoints(resultDecodeRow.getResultPoints());
            length = resultDecodeRow.getText().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            while (true) {
                if (i12 >= length2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (length == iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        if ((barcodeFormat == BarcodeFormat.EAN_13 || barcodeFormat == BarcodeFormat.UPC_A) && (strLookupCountryIdentifier = this.eanManSupport.lookupCountryIdentifier(string)) != null) {
            result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, strLookupCountryIdentifier);
        }
        return result;
    }

    public static boolean checkStandardUPCEANChecksum(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i11 = length - 1;
        if (getStandardUPCEANChecksum(charSequence.subSequence(0, i11)) != Character.digit(charSequence.charAt(i11), 10)) {
            return false;
        }
        return true;
    }

    public static int decodeDigit(BitArray bitArray, int[] iArr, int i11, int[][] iArr2) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i11, iArr);
        int length = iArr2.length;
        float f11 = MAX_AVG_VARIANCE;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i13], 0.7f);
            if (fPatternMatchVariance < f11) {
                i12 = i13;
                f11 = fPatternMatchVariance;
            }
        }
        if (i12 >= 0) {
            return i12;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int getStandardUPCEANChecksum(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 1; i12 >= 0; i12 -= 2) {
            int iCharAt = charSequence.charAt(i12) - '0';
            if (iCharAt >= 0 && iCharAt <= 9) {
                i11 += iCharAt;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        int i13 = i11 * 3;
        for (int i14 = length - 2; i14 >= 0; i14 -= 2) {
            int iCharAt2 = charSequence.charAt(i14) - '0';
            if (iCharAt2 >= 0 && iCharAt2 <= 9) {
                i13 += iCharAt2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        return (1000 - i13) % 10;
    }

    public boolean checkChecksum(String str) throws FormatException {
        return checkStandardUPCEANChecksum(str);
    }
}
