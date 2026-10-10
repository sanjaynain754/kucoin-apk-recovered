package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.Formatter;

/* JADX INFO: loaded from: classes56.dex */
final class DetectionResult {
    private static final int ADJUST_ROW_NUMBER_SKIP = 2;
    private final int barcodeColumnCount;
    private final BarcodeMetadata barcodeMetadata;
    private BoundingBox boundingBox;
    private final DetectionResultColumn[] detectionResultColumns;

    private static boolean adjustRowNumber(Codeword codeword, Codeword codeword2) {
        if (codeword2 == null || !codeword2.hasValidRowNumber() || codeword2.getBucket() != codeword.getBucket()) {
            return false;
        }
        codeword.setRowNumber(codeword2.getRowNumber());
        return true;
    }

    private int adjustRowNumbers() {
        int iAdjustRowNumbersByRow = adjustRowNumbersByRow();
        if (iAdjustRowNumbersByRow == 0) {
            return 0;
        }
        for (int i11 = 1; i11 < this.barcodeColumnCount + 1; i11++) {
            Codeword[] codewords = this.detectionResultColumns[i11].getCodewords();
            for (int i12 = 0; i12 < codewords.length; i12++) {
                Codeword codeword = codewords[i12];
                if (codeword != null && !codeword.hasValidRowNumber()) {
                    adjustRowNumbers(i11, i12, codewords);
                }
            }
        }
        return iAdjustRowNumbersByRow;
    }

    private void adjustIndicatorColumnRowNumbers(DetectionResultColumn detectionResultColumn) {
        if (detectionResultColumn != null) {
            ((DetectionResultRowIndicatorColumn) detectionResultColumn).adjustCompleteIndicatorColumnRowNumbers(this.barcodeMetadata);
        }
    }

    private static int adjustRowNumberIfValid(int i11, int i12, Codeword codeword) {
        if (codeword == null || codeword.hasValidRowNumber()) {
            return i12;
        }
        if (!codeword.isValidRowNumber(i11)) {
            return i12 + 1;
        }
        codeword.setRowNumber(i11);
        return 0;
    }

    private void adjustRowNumbersFromBothRI() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null || detectionResultColumnArr[this.barcodeColumnCount + 1] == null) {
            return;
        }
        Codeword[] codewords = detectionResultColumn.getCodewords();
        Codeword[] codewords2 = this.detectionResultColumns[this.barcodeColumnCount + 1].getCodewords();
        for (int i11 = 0; i11 < codewords.length; i11++) {
            Codeword codeword = codewords[i11];
            if (codeword != null && codewords2[i11] != null && codeword.getRowNumber() == codewords2[i11].getRowNumber()) {
                for (int i12 = 1; i12 <= this.barcodeColumnCount; i12++) {
                    Codeword codeword2 = this.detectionResultColumns[i12].getCodewords()[i11];
                    if (codeword2 != null) {
                        codeword2.setRowNumber(codewords[i11].getRowNumber());
                        if (!codeword2.hasValidRowNumber()) {
                            this.detectionResultColumns[i12].getCodewords()[i11] = null;
                        }
                    }
                }
            }
        }
    }

    private int adjustRowNumbersFromLRI() {
        DetectionResultColumn detectionResultColumn = this.detectionResultColumns[0];
        if (detectionResultColumn == null) {
            return 0;
        }
        Codeword[] codewords = detectionResultColumn.getCodewords();
        int i11 = 0;
        for (int i12 = 0; i12 < codewords.length; i12++) {
            Codeword codeword = codewords[i12];
            if (codeword != null) {
                int rowNumber = codeword.getRowNumber();
                int iAdjustRowNumberIfValid = 0;
                for (int i13 = 1; i13 < this.barcodeColumnCount + 1 && iAdjustRowNumberIfValid < 2; i13++) {
                    Codeword codeword2 = this.detectionResultColumns[i13].getCodewords()[i12];
                    if (codeword2 != null) {
                        iAdjustRowNumberIfValid = adjustRowNumberIfValid(rowNumber, iAdjustRowNumberIfValid, codeword2);
                        if (!codeword2.hasValidRowNumber()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    private int adjustRowNumbersFromRRI() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        int i11 = this.barcodeColumnCount;
        if (detectionResultColumnArr[i11 + 1] == null) {
            return 0;
        }
        Codeword[] codewords = detectionResultColumnArr[i11 + 1].getCodewords();
        int i12 = 0;
        for (int i13 = 0; i13 < codewords.length; i13++) {
            Codeword codeword = codewords[i13];
            if (codeword != null) {
                int rowNumber = codeword.getRowNumber();
                int iAdjustRowNumberIfValid = 0;
                for (int i14 = this.barcodeColumnCount + 1; i14 > 0 && iAdjustRowNumberIfValid < 2; i14--) {
                    Codeword codeword2 = this.detectionResultColumns[i14].getCodewords()[i13];
                    if (codeword2 != null) {
                        iAdjustRowNumberIfValid = adjustRowNumberIfValid(rowNumber, iAdjustRowNumberIfValid, codeword2);
                        if (!codeword2.hasValidRowNumber()) {
                            i12++;
                        }
                    }
                }
            }
        }
        return i12;
    }

    public int getBarcodeColumnCount() {
        return this.barcodeColumnCount;
    }

    public int getBarcodeECLevel() {
        return this.barcodeMetadata.getErrorCorrectionLevel();
    }

    public int getBarcodeRowCount() {
        return this.barcodeMetadata.getRowCount();
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public DetectionResultColumn getDetectionResultColumn(int i11) {
        return this.detectionResultColumns[i11];
    }

    public DetectionResultColumn[] getDetectionResultColumns() {
        adjustIndicatorColumnRowNumbers(this.detectionResultColumns[0]);
        adjustIndicatorColumnRowNumbers(this.detectionResultColumns[this.barcodeColumnCount + 1]);
        int i11 = PDF417Common.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            int iAdjustRowNumbers = adjustRowNumbers();
            if (iAdjustRowNumbers <= 0 || iAdjustRowNumbers >= i11) {
                break;
            }
            i11 = iAdjustRowNumbers;
        }
        return this.detectionResultColumns;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setDetectionResultColumn(int i11, DetectionResultColumn detectionResultColumn) {
        this.detectionResultColumns[i11] = detectionResultColumn;
    }

    public String toString() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null) {
            detectionResultColumn = detectionResultColumnArr[this.barcodeColumnCount + 1];
        }
        Formatter formatter = new Formatter();
        for (int i11 = 0; i11 < detectionResultColumn.getCodewords().length; i11++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i11));
                for (int i12 = 0; i12 < this.barcodeColumnCount + 2; i12++) {
                    DetectionResultColumn detectionResultColumn2 = this.detectionResultColumns[i12];
                    if (detectionResultColumn2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        Codeword codeword = detectionResultColumn2.getCodewords()[i11];
                        if (codeword == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue()));
                        }
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

    public DetectionResult(BarcodeMetadata barcodeMetadata, BoundingBox boundingBox) {
        this.barcodeMetadata = barcodeMetadata;
        int columnCount = barcodeMetadata.getColumnCount();
        this.barcodeColumnCount = columnCount;
        this.boundingBox = boundingBox;
        this.detectionResultColumns = new DetectionResultColumn[columnCount + 2];
    }

    private int adjustRowNumbersByRow() {
        adjustRowNumbersFromBothRI();
        return adjustRowNumbersFromLRI() + adjustRowNumbersFromRRI();
    }

    private void adjustRowNumbers(int i11, int i12, Codeword[] codewordArr) {
        Codeword codeword = codewordArr[i12];
        Codeword[] codewords = this.detectionResultColumns[i11 - 1].getCodewords();
        DetectionResultColumn detectionResultColumn = this.detectionResultColumns[i11 + 1];
        Codeword[] codewords2 = detectionResultColumn != null ? detectionResultColumn.getCodewords() : codewords;
        Codeword[] codewordArr2 = new Codeword[14];
        codewordArr2[2] = codewords[i12];
        codewordArr2[3] = codewords2[i12];
        if (i12 > 0) {
            int i13 = i12 - 1;
            codewordArr2[0] = codewordArr[i13];
            codewordArr2[4] = codewords[i13];
            codewordArr2[5] = codewords2[i13];
        }
        if (i12 > 1) {
            int i14 = i12 - 2;
            codewordArr2[8] = codewordArr[i14];
            codewordArr2[10] = codewords[i14];
            codewordArr2[11] = codewords2[i14];
        }
        if (i12 < codewordArr.length - 1) {
            int i15 = i12 + 1;
            codewordArr2[1] = codewordArr[i15];
            codewordArr2[6] = codewords[i15];
            codewordArr2[7] = codewords2[i15];
        }
        if (i12 < codewordArr.length - 2) {
            int i16 = i12 + 2;
            codewordArr2[9] = codewordArr[i16];
            codewordArr2[12] = codewords[i16];
            codewordArr2[13] = codewords2[i16];
        }
        for (int i17 = 0; i17 < 14 && !adjustRowNumber(codeword, codewordArr2[i17]); i17++) {
        }
    }
}
