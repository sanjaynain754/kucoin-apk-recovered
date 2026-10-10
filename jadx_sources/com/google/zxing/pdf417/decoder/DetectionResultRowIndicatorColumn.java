package com.google.zxing.pdf417.decoder;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes56.dex */
final class DetectionResultRowIndicatorColumn extends DetectionResultColumn {
    private final boolean isLeft;

    private void removeIncorrectCodewords(Codeword[] codewordArr, BarcodeMetadata barcodeMetadata) {
        for (int i11 = 0; i11 < codewordArr.length; i11++) {
            Codeword codeword = codewordArr[i11];
            if (codeword != null) {
                int value = codeword.getValue() % 30;
                int rowNumber = codeword.getRowNumber();
                if (rowNumber > barcodeMetadata.getRowCount()) {
                    codewordArr[i11] = null;
                } else {
                    if (!this.isLeft) {
                        rowNumber += 2;
                    }
                    int i12 = rowNumber % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2 && value + 1 != barcodeMetadata.getColumnCount()) {
                                codewordArr[i11] = null;
                            }
                        } else if (value / 3 != barcodeMetadata.getErrorCorrectionLevel() || value % 3 != barcodeMetadata.getRowCountLowerPart()) {
                            codewordArr[i11] = null;
                        }
                    } else if ((value * 3) + 1 != barcodeMetadata.getRowCountUpperPart()) {
                        codewordArr[i11] = null;
                    }
                }
            }
        }
    }

    public boolean isLeft() {
        return this.isLeft;
    }

    @Override // com.google.zxing.pdf417.decoder.DetectionResultColumn
    public String toString() {
        return "IsLeft: " + this.isLeft + '\n' + super.toString();
    }

    public DetectionResultRowIndicatorColumn(BoundingBox boundingBox, boolean z11) {
        super(boundingBox);
        this.isLeft = z11;
    }

    private void adjustIncompleteIndicatorColumnRowNumbers(BarcodeMetadata barcodeMetadata) {
        ResultPoint topRight;
        ResultPoint bottomRight;
        BoundingBox boundingBox = getBoundingBox();
        if (this.isLeft) {
            topRight = boundingBox.getTopLeft();
        } else {
            topRight = boundingBox.getTopRight();
        }
        if (this.isLeft) {
            bottomRight = boundingBox.getBottomLeft();
        } else {
            bottomRight = boundingBox.getBottomRight();
        }
        int iImageRowToCodewordIndex = imageRowToCodewordIndex((int) bottomRight.getY());
        Codeword[] codewords = getCodewords();
        int rowNumber = -1;
        int i11 = 0;
        int iMax = 1;
        for (int iImageRowToCodewordIndex2 = imageRowToCodewordIndex((int) topRight.getY()); iImageRowToCodewordIndex2 < iImageRowToCodewordIndex; iImageRowToCodewordIndex2++) {
            Codeword codeword = codewords[iImageRowToCodewordIndex2];
            if (codeword != null) {
                codeword.setRowNumberAsRowIndicatorColumn();
                int rowNumber2 = codeword.getRowNumber() - rowNumber;
                if (rowNumber2 == 0) {
                    i11++;
                } else {
                    if (rowNumber2 == 1) {
                        iMax = Math.max(iMax, i11);
                        rowNumber = codeword.getRowNumber();
                    } else if (codeword.getRowNumber() >= barcodeMetadata.getRowCount()) {
                        codewords[iImageRowToCodewordIndex2] = null;
                    } else {
                        rowNumber = codeword.getRowNumber();
                    }
                    i11 = 1;
                }
            }
        }
    }

    private void setRowNumbers() {
        for (Codeword codeword : getCodewords()) {
            if (codeword != null) {
                codeword.setRowNumberAsRowIndicatorColumn();
            }
        }
    }

    public void adjustCompleteIndicatorColumnRowNumbers(BarcodeMetadata barcodeMetadata) {
        ResultPoint topRight;
        ResultPoint bottomRight;
        boolean z11;
        Codeword[] codewords = getCodewords();
        setRowNumbers();
        removeIncorrectCodewords(codewords, barcodeMetadata);
        BoundingBox boundingBox = getBoundingBox();
        if (this.isLeft) {
            topRight = boundingBox.getTopLeft();
        } else {
            topRight = boundingBox.getTopRight();
        }
        if (this.isLeft) {
            bottomRight = boundingBox.getBottomLeft();
        } else {
            bottomRight = boundingBox.getBottomRight();
        }
        int iImageRowToCodewordIndex = imageRowToCodewordIndex((int) bottomRight.getY());
        int rowNumber = -1;
        int i11 = 0;
        int iMax = 1;
        for (int iImageRowToCodewordIndex2 = imageRowToCodewordIndex((int) topRight.getY()); iImageRowToCodewordIndex2 < iImageRowToCodewordIndex; iImageRowToCodewordIndex2++) {
            Codeword codeword = codewords[iImageRowToCodewordIndex2];
            if (codeword != null) {
                int rowNumber2 = codeword.getRowNumber() - rowNumber;
                if (rowNumber2 == 0) {
                    i11++;
                } else {
                    if (rowNumber2 == 1) {
                        iMax = Math.max(iMax, i11);
                        rowNumber = codeword.getRowNumber();
                    } else if (rowNumber2 >= 0 && codeword.getRowNumber() < barcodeMetadata.getRowCount() && rowNumber2 <= iImageRowToCodewordIndex2) {
                        if (iMax > 2) {
                            rowNumber2 *= iMax - 2;
                        }
                        if (rowNumber2 >= iImageRowToCodewordIndex2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        for (int i12 = 1; i12 <= rowNumber2 && !z11; i12++) {
                            if (codewords[iImageRowToCodewordIndex2 - i12] != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            codewords[iImageRowToCodewordIndex2] = null;
                        } else {
                            rowNumber = codeword.getRowNumber();
                        }
                    } else {
                        codewords[iImageRowToCodewordIndex2] = null;
                    }
                    i11 = 1;
                }
            }
        }
    }

    public BarcodeMetadata getBarcodeMetadata() {
        Codeword[] codewords = getCodewords();
        BarcodeValue barcodeValue = new BarcodeValue();
        BarcodeValue barcodeValue2 = new BarcodeValue();
        BarcodeValue barcodeValue3 = new BarcodeValue();
        BarcodeValue barcodeValue4 = new BarcodeValue();
        for (Codeword codeword : codewords) {
            if (codeword != null) {
                codeword.setRowNumberAsRowIndicatorColumn();
                int value = codeword.getValue() % 30;
                int rowNumber = codeword.getRowNumber();
                if (!this.isLeft) {
                    rowNumber += 2;
                }
                int i11 = rowNumber % 3;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            barcodeValue.setValue(value + 1);
                        }
                    } else {
                        barcodeValue4.setValue(value / 3);
                        barcodeValue3.setValue(value % 3);
                    }
                } else {
                    barcodeValue2.setValue((value * 3) + 1);
                }
            }
        }
        if (barcodeValue.getValue().length != 0 && barcodeValue2.getValue().length != 0 && barcodeValue3.getValue().length != 0 && barcodeValue4.getValue().length != 0 && barcodeValue.getValue()[0] > 0 && barcodeValue2.getValue()[0] + barcodeValue3.getValue()[0] >= 3 && barcodeValue2.getValue()[0] + barcodeValue3.getValue()[0] <= 90) {
            BarcodeMetadata barcodeMetadata = new BarcodeMetadata(barcodeValue.getValue()[0], barcodeValue2.getValue()[0], barcodeValue3.getValue()[0], barcodeValue4.getValue()[0]);
            removeIncorrectCodewords(codewords, barcodeMetadata);
            return barcodeMetadata;
        }
        return null;
    }

    public int[] getRowHeights() {
        int rowNumber;
        BarcodeMetadata barcodeMetadata = getBarcodeMetadata();
        if (barcodeMetadata == null) {
            return null;
        }
        adjustIncompleteIndicatorColumnRowNumbers(barcodeMetadata);
        int rowCount = barcodeMetadata.getRowCount();
        int[] iArr = new int[rowCount];
        for (Codeword codeword : getCodewords()) {
            if (codeword != null && (rowNumber = codeword.getRowNumber()) < rowCount) {
                iArr[rowNumber] = iArr[rowNumber] + 1;
            }
        }
        return iArr;
    }
}
