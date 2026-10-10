package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.p071ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* JADX INFO: loaded from: classes56.dex */
public final class PDF417ScanningDecoder {
    private static final int CODEWORD_SKEW_SIZE = 2;
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;
    private static final ErrorCorrection errorCorrection = new ErrorCorrection();

    private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn) throws NotFoundException {
        int[] rowHeights;
        if (detectionResultRowIndicatorColumn == null || (rowHeights = detectionResultRowIndicatorColumn.getRowHeights()) == null) {
            return null;
        }
        int max = getMax(rowHeights);
        int i11 = 0;
        int i12 = 0;
        for (int i13 : rowHeights) {
            i12 += max - i13;
            if (i13 > 0) {
                break;
            }
        }
        Codeword[] codewords = detectionResultRowIndicatorColumn.getCodewords();
        for (int i14 = 0; i12 > 0 && codewords[i14] == null; i14++) {
            i12--;
        }
        for (int length = rowHeights.length - 1; length >= 0; length--) {
            int i15 = rowHeights[length];
            i11 += max - i15;
            if (i15 > 0) {
                break;
            }
        }
        for (int length2 = codewords.length - 1; i11 > 0 && codewords[length2] == null; length2--) {
            i11--;
        }
        return detectionResultRowIndicatorColumn.getBoundingBox().addMissingRows(i12, i11, detectionResultRowIndicatorColumn.isLeft());
    }

    private static void adjustCodewordCount(DetectionResult detectionResult, BarcodeValue[][] barcodeValueArr) throws NotFoundException {
        BarcodeValue barcodeValue = barcodeValueArr[0][1];
        int[] value = barcodeValue.getValue();
        int barcodeColumnCount = (detectionResult.getBarcodeColumnCount() * detectionResult.getBarcodeRowCount()) - getNumberOfECCodeWords(detectionResult.getBarcodeECLevel());
        if (value.length != 0) {
            if (value[0] != barcodeColumnCount) {
                barcodeValue.setValue(barcodeColumnCount);
            }
        } else {
            if (barcodeColumnCount <= 0 || barcodeColumnCount > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            barcodeValue.setValue(barcodeColumnCount);
        }
    }

    private static DecoderResult createDecoderResultFromAmbiguousValues(int i11, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i12 = 100;
        while (true) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i14 = 0; i14 < length; i14++) {
                iArr[iArr3[i14]] = iArr4[i14][iArr5[i14]];
            }
            try {
                return decodeCodewords(iArr, i11, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                for (int i15 = 0; i15 < length; i15++) {
                    int i16 = iArr5[i15];
                    if (i16 < iArr4[i15].length - 1) {
                        iArr5[i15] = i16 + 1;
                        break;
                    }
                    iArr5[i15] = 0;
                    if (i15 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
                i12 = i13;
            }
        }
    }

    private static DecoderResult decodeCodewords(int[] iArr, int i11, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i12 = 1 << (i11 + 1);
        int iCorrectErrors = correctErrors(iArr, iArr2, i12);
        verifyCodewordCount(iArr, i12);
        DecoderResult decoderResultDecode = DecodedBitStreamParser.decode(iArr, String.valueOf(i11));
        decoderResultDecode.setErrorsCorrected(Integer.valueOf(iCorrectErrors));
        decoderResultDecode.setErasures(Integer.valueOf(iArr2.length));
        return decoderResultDecode;
    }

    private static BarcodeMetadata getBarcodeMetadata(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) {
        BarcodeMetadata barcodeMetadata;
        BarcodeMetadata barcodeMetadata2;
        if (detectionResultRowIndicatorColumn == null || (barcodeMetadata = detectionResultRowIndicatorColumn.getBarcodeMetadata()) == null) {
            if (detectionResultRowIndicatorColumn2 == null) {
                return null;
            }
            return detectionResultRowIndicatorColumn2.getBarcodeMetadata();
        }
        if (detectionResultRowIndicatorColumn2 == null || (barcodeMetadata2 = detectionResultRowIndicatorColumn2.getBarcodeMetadata()) == null || barcodeMetadata.getColumnCount() == barcodeMetadata2.getColumnCount() || barcodeMetadata.getErrorCorrectionLevel() == barcodeMetadata2.getErrorCorrectionLevel() || barcodeMetadata.getRowCount() == barcodeMetadata2.getRowCount()) {
            return barcodeMetadata;
        }
        return null;
    }

    private static int getCodewordBucketNumber(int i11) {
        return getCodewordBucketNumber(getBitCountForCodeword(i11));
    }

    private static int getMax(int[] iArr) {
        int iMax = -1;
        for (int i11 : iArr) {
            iMax = Math.max(iMax, i11);
        }
        return iMax;
    }

    private static int getNumberOfECCodeWords(int i11) {
        return 2 << i11;
    }

    private static DetectionResult merge(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) throws NotFoundException {
        BarcodeMetadata barcodeMetadata;
        if ((detectionResultRowIndicatorColumn == null && detectionResultRowIndicatorColumn2 == null) || (barcodeMetadata = getBarcodeMetadata(detectionResultRowIndicatorColumn, detectionResultRowIndicatorColumn2)) == null) {
            return null;
        }
        return new DetectionResult(barcodeMetadata, BoundingBox.merge(adjustBoundingBox(detectionResultRowIndicatorColumn), adjustBoundingBox(detectionResultRowIndicatorColumn2)));
    }

    private static void verifyCodewordCount(int[] iArr, int i11) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i12 = iArr[0];
        if (i12 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i12 == 0) {
            if (i11 >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    private static int adjustCodewordStartColumn(BitMatrix bitMatrix, int i11, int i12, boolean z11, int i13, int i14) {
        int i15 = z11 ? -1 : 1;
        int i16 = i13;
        for (int i17 = 0; i17 < 2; i17++) {
            while (true) {
                if (!z11) {
                    if (i16 >= i12) {
                        break;
                    }
                    if (z11 == bitMatrix.get(i16, i14)) {
                        break;
                        break;
                    }
                    if (Math.abs(i13 - i16) > 2) {
                        return i13;
                    }
                    i16 += i15;
                } else {
                    if (i16 < i11) {
                        break;
                    }
                    if (z11 == bitMatrix.get(i16, i14)) {
                        break;
                    }
                    if (Math.abs(i13 - i16) > 2) {
                        return i13;
                    }
                    i16 += i15;
                }
            }
            i15 = -i15;
            z11 = !z11;
        }
        return i16;
    }

    private static boolean checkCodewordSkew(int i11, int i12, int i13) {
        return i12 + (-2) <= i11 && i11 <= i13 + 2;
    }

    private static int correctErrors(int[] iArr, int[] iArr2, int i11) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i11 / 2) + 3) && i11 >= 0 && i11 <= 512) {
            return errorCorrection.decode(iArr, i11, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x010a A[SYNTHETIC] */
    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i11, int i12) throws NotFoundException, ChecksumException, FormatException {
        BoundingBox boundingBox;
        DetectionResultColumn detectionResultRowIndicatorColumn;
        DetectionResultColumn detectionResultColumn;
        int i13;
        int i14;
        Codeword codewordDetectCodeword;
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2 = null;
        boolean z11 = false;
        BoundingBox boundingBox2 = new BoundingBox(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        DetectionResultRowIndicatorColumn rowIndicatorColumn = null;
        DetectionResult detectionResultMerge = null;
        int i15 = 0;
        while (true) {
            if (i15 >= 2) {
                boundingBox = boundingBox2;
                break;
            }
            DetectionResultRowIndicatorColumn rowIndicatorColumn2 = resultPoint != null ? getRowIndicatorColumn(bitMatrix, boundingBox2, resultPoint, true, i11, i12) : detectionResultRowIndicatorColumn2;
            if (resultPoint3 != null) {
                rowIndicatorColumn = getRowIndicatorColumn(bitMatrix, boundingBox2, resultPoint3, false, i11, i12);
            }
            boundingBox = boundingBox2;
            detectionResultMerge = merge(rowIndicatorColumn2, rowIndicatorColumn);
            if (detectionResultMerge == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i15 != 0 || detectionResultMerge.getBoundingBox() == null || (detectionResultMerge.getBoundingBox().getMinY() >= boundingBox.getMinY() && detectionResultMerge.getBoundingBox().getMaxY() <= boundingBox.getMaxY())) {
                detectionResultMerge.setBoundingBox(boundingBox);
                detectionResultRowIndicatorColumn2 = rowIndicatorColumn2;
                break;
            }
            boundingBox2 = detectionResultMerge.getBoundingBox();
            i15++;
            detectionResultRowIndicatorColumn2 = rowIndicatorColumn2;
        }
        DetectionResult detectionResult = detectionResultMerge;
        int barcodeColumnCount = detectionResult.getBarcodeColumnCount() + 1;
        detectionResult.setDetectionResultColumn(0, detectionResultRowIndicatorColumn2);
        detectionResult.setDetectionResultColumn(barcodeColumnCount, rowIndicatorColumn);
        boolean z12 = detectionResultRowIndicatorColumn2 != null;
        int i16 = i11;
        int i17 = i12;
        int i18 = 1;
        while (i18 <= barcodeColumnCount) {
            int i19 = z12 ? i18 : barcodeColumnCount - i18;
            if (detectionResult.getDetectionResultColumn(i19) == null) {
                if (i19 == 0 || i19 == barcodeColumnCount) {
                    detectionResultRowIndicatorColumn = new DetectionResultRowIndicatorColumn(boundingBox, i19 == 0 ? true : z11);
                } else {
                    detectionResultRowIndicatorColumn = new DetectionResultColumn(boundingBox);
                }
                detectionResult.setDetectionResultColumn(i19, detectionResultRowIndicatorColumn);
                int i21 = -1;
                int iMin = i16;
                int iMax = i17;
                int minY = boundingBox.getMinY();
                int i22 = -1;
                while (minY <= boundingBox.getMaxY()) {
                    int startColumn = getStartColumn(detectionResult, i19, minY, z12);
                    if (startColumn >= 0 && startColumn <= boundingBox.getMaxX()) {
                        detectionResultColumn = detectionResultRowIndicatorColumn;
                        i13 = i21;
                        i14 = startColumn;
                        codewordDetectCodeword = detectCodeword(bitMatrix, boundingBox.getMinX(), boundingBox.getMaxX(), z12, i14, minY, iMin, iMax);
                        if (codewordDetectCodeword != null) {
                            detectionResultColumn.setCodeword(minY, codewordDetectCodeword);
                            iMin = Math.min(iMin, codewordDetectCodeword.getWidth());
                            iMax = Math.max(iMax, codewordDetectCodeword.getWidth());
                            i22 = i14;
                        }
                    } else if (i22 != i21) {
                        startColumn = i22;
                        detectionResultColumn = detectionResultRowIndicatorColumn;
                        i13 = i21;
                        i14 = startColumn;
                        codewordDetectCodeword = detectCodeword(bitMatrix, boundingBox.getMinX(), boundingBox.getMaxX(), z12, i14, minY, iMin, iMax);
                        if (codewordDetectCodeword != null) {
                            detectionResultColumn.setCodeword(minY, codewordDetectCodeword);
                            iMin = Math.min(iMin, codewordDetectCodeword.getWidth());
                            iMax = Math.max(iMax, codewordDetectCodeword.getWidth());
                            i22 = i14;
                        }
                    } else {
                        detectionResultColumn = detectionResultRowIndicatorColumn;
                        i13 = i21;
                    }
                    minY++;
                    detectionResultRowIndicatorColumn = detectionResultColumn;
                    i21 = i13;
                }
                i16 = iMin;
                i17 = iMax;
            }
            i18++;
            z11 = false;
        }
        return createDecoderResult(detectionResult);
    }

    private static int[] getBitCountForCodeword(int i11) {
        int[] iArr = new int[8];
        int i12 = 0;
        int i13 = 7;
        while (true) {
            int i14 = i11 & 1;
            if (i14 != i12) {
                i13--;
                if (i13 < 0) {
                    return iArr;
                }
                i12 = i14;
            }
            iArr[i13] = iArr[i13] + 1;
            i11 >>= 1;
        }
    }

    private static int getCodewordBucketNumber(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX WARN: Code duplicated, block: B:28:0x0027 A[EDGE_INSN: B:28:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:7:0x000c->B:31:0x000c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x001b A[SYNTHETIC] */
    private static int[] getModuleBitCount(BitMatrix bitMatrix, int i11, int i12, boolean z11, int i13, int i14) {
        int[] iArr = new int[8];
        int i15 = z11 ? 1 : -1;
        int i16 = 0;
        boolean z12 = z11;
        while (true) {
            if (!z11) {
                if (i13 < i11) {
                    break;
                }
                if (i16 < 8) {
                    break;
                    break;
                }
                if (bitMatrix.get(i13, i14) == z12) {
                    iArr[i16] = iArr[i16] + 1;
                    i13 += i15;
                } else {
                    i16++;
                    z12 = !z12;
                }
            } else {
                if (i13 >= i12) {
                    break;
                }
                if (i16 < 8) {
                    break;
                }
                if (bitMatrix.get(i13, i14) == z12) {
                    iArr[i16] = iArr[i16] + 1;
                    i13 += i15;
                } else {
                    i16++;
                    z12 = !z12;
                }
            }
        }
        if (i16 != 8) {
            if (z11) {
                i11 = i12;
            }
            if (i13 != i11 || i16 != 7) {
                return null;
            }
        }
        return iArr;
    }

    private static DetectionResultRowIndicatorColumn getRowIndicatorColumn(BitMatrix bitMatrix, BoundingBox boundingBox, ResultPoint resultPoint, boolean z11, int i11, int i12) {
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn = new DetectionResultRowIndicatorColumn(boundingBox, z11);
        int i13 = 0;
        while (i13 < 2) {
            int i14 = i13 == 0 ? 1 : -1;
            int x11 = (int) resultPoint.getX();
            for (int y11 = (int) resultPoint.getY(); y11 <= boundingBox.getMaxY() && y11 >= boundingBox.getMinY(); y11 += i14) {
                Codeword codewordDetectCodeword = detectCodeword(bitMatrix, 0, bitMatrix.getWidth(), z11, x11, y11, i11, i12);
                if (codewordDetectCodeword != null) {
                    detectionResultRowIndicatorColumn.setCodeword(y11, codewordDetectCodeword);
                    x11 = z11 ? codewordDetectCodeword.getStartX() : codewordDetectCodeword.getEndX();
                }
            }
            i13++;
        }
        return detectionResultRowIndicatorColumn;
    }

    private static int getStartColumn(DetectionResult detectionResult, int i11, int i12, boolean z11) {
        int i13 = z11 ? 1 : -1;
        int i14 = i11 - i13;
        Codeword codeword = isValidBarcodeColumn(detectionResult, i14) ? detectionResult.getDetectionResultColumn(i14).getCodeword(i12) : null;
        if (codeword != null) {
            return z11 ? codeword.getEndX() : codeword.getStartX();
        }
        Codeword codewordNearby = detectionResult.getDetectionResultColumn(i11).getCodewordNearby(i12);
        if (codewordNearby != null) {
            return z11 ? codewordNearby.getStartX() : codewordNearby.getEndX();
        }
        if (isValidBarcodeColumn(detectionResult, i14)) {
            codewordNearby = detectionResult.getDetectionResultColumn(i14).getCodewordNearby(i12);
        }
        if (codewordNearby != null) {
            return z11 ? codewordNearby.getEndX() : codewordNearby.getStartX();
        }
        int i15 = 0;
        while (true) {
            i11 -= i13;
            if (!isValidBarcodeColumn(detectionResult, i11)) {
                BoundingBox boundingBox = detectionResult.getBoundingBox();
                return z11 ? boundingBox.getMinX() : boundingBox.getMaxX();
            }
            for (Codeword codeword2 : detectionResult.getDetectionResultColumn(i11).getCodewords()) {
                if (codeword2 != null) {
                    return (z11 ? codeword2.getEndX() : codeword2.getStartX()) + (i13 * i15 * (codeword2.getEndX() - codeword2.getStartX()));
                }
            }
            i15++;
        }
    }

    private static boolean isValidBarcodeColumn(DetectionResult detectionResult, int i11) {
        return i11 >= 0 && i11 <= detectionResult.getBarcodeColumnCount() + 1;
    }

    public static String toString(BarcodeValue[][] barcodeValueArr) {
        Formatter formatter = new Formatter();
        for (int i11 = 0; i11 < barcodeValueArr.length; i11++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i11));
                int i12 = 0;
                while (true) {
                    BarcodeValue[] barcodeValueArr2 = barcodeValueArr[i11];
                    if (i12 < barcodeValueArr2.length) {
                        BarcodeValue barcodeValue = barcodeValueArr2[i12];
                        if (barcodeValue.getValue().length == 0) {
                            formatter.format("        ", null);
                        } else {
                            formatter.format("%4d(%2d)", Integer.valueOf(barcodeValue.getValue()[0]), barcodeValue.getConfidence(barcodeValue.getValue()[0]));
                        }
                        i12++;
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    private PDF417ScanningDecoder() {
    }

    private static BarcodeValue[][] createBarcodeMatrix(DetectionResult detectionResult) {
        int rowNumber;
        BarcodeValue[][] barcodeValueArr = (BarcodeValue[][]) Array.newInstance((Class<?>) BarcodeValue.class, detectionResult.getBarcodeRowCount(), detectionResult.getBarcodeColumnCount() + 2);
        for (BarcodeValue[] barcodeValueArr2 : barcodeValueArr) {
            int i11 = 0;
            while (true) {
                if (i11 < barcodeValueArr2.length) {
                    barcodeValueArr2[i11] = new BarcodeValue();
                    i11++;
                }
            }
        }
        int i12 = 0;
        for (DetectionResultColumn detectionResultColumn : detectionResult.getDetectionResultColumns()) {
            if (detectionResultColumn != null) {
                for (Codeword codeword : detectionResultColumn.getCodewords()) {
                    if (codeword != null && (rowNumber = codeword.getRowNumber()) >= 0 && rowNumber < barcodeValueArr.length) {
                        barcodeValueArr[rowNumber][i12].setValue(codeword.getValue());
                    }
                }
            }
            i12++;
        }
        return barcodeValueArr;
    }

    private static DecoderResult createDecoderResult(DetectionResult detectionResult) throws NotFoundException, ChecksumException, FormatException {
        BarcodeValue[][] barcodeValueArrCreateBarcodeMatrix = createBarcodeMatrix(detectionResult);
        adjustCodewordCount(detectionResult, barcodeValueArrCreateBarcodeMatrix);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[detectionResult.getBarcodeRowCount() * detectionResult.getBarcodeColumnCount()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < detectionResult.getBarcodeRowCount(); i11++) {
            int i12 = 0;
            while (i12 < detectionResult.getBarcodeColumnCount()) {
                int i13 = i12 + 1;
                int[] value = barcodeValueArrCreateBarcodeMatrix[i11][i13].getValue();
                int barcodeColumnCount = (detectionResult.getBarcodeColumnCount() * i11) + i12;
                if (value.length == 0) {
                    arrayList.add(Integer.valueOf(barcodeColumnCount));
                } else if (value.length == 1) {
                    iArr[barcodeColumnCount] = value[0];
                } else {
                    arrayList3.add(Integer.valueOf(barcodeColumnCount));
                    arrayList2.add(value);
                }
                i12 = i13;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i14 = 0; i14 < size; i14++) {
            iArr2[i14] = (int[]) arrayList2.get(i14);
        }
        return createDecoderResultFromAmbiguousValues(detectionResult.getBarcodeECLevel(), iArr, PDF417Common.toIntArray(arrayList), PDF417Common.toIntArray(arrayList3), iArr2);
    }

    private static Codeword detectCodeword(BitMatrix bitMatrix, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
        int i17;
        int decodedValue;
        int codeword;
        int iAdjustCodewordStartColumn = adjustCodewordStartColumn(bitMatrix, i11, i12, z11, i13, i14);
        int[] moduleBitCount = getModuleBitCount(bitMatrix, i11, i12, z11, iAdjustCodewordStartColumn, i14);
        if (moduleBitCount == null) {
            return null;
        }
        int iSum = MathUtils.sum(moduleBitCount);
        if (z11) {
            i17 = iAdjustCodewordStartColumn + iSum;
        } else {
            for (int i18 = 0; i18 < moduleBitCount.length / 2; i18++) {
                int i19 = moduleBitCount[i18];
                moduleBitCount[i18] = moduleBitCount[(moduleBitCount.length - 1) - i18];
                moduleBitCount[(moduleBitCount.length - 1) - i18] = i19;
            }
            iAdjustCodewordStartColumn -= iSum;
            i17 = iAdjustCodewordStartColumn;
        }
        if (!checkCodewordSkew(iSum, i15, i16) || (codeword = PDF417Common.getCodeword((decodedValue = PDF417CodewordDecoder.getDecodedValue(moduleBitCount)))) == -1) {
            return null;
        }
        return new Codeword(iAdjustCodewordStartColumn, i17, getCodewordBucketNumber(decodedValue), codeword);
    }
}
