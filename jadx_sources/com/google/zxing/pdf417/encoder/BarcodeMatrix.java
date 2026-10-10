package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes56.dex */
public final class BarcodeMatrix {
    private int currentRow;
    private final int height;
    private final BarcodeRow[] matrix;
    private final int width;

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public BarcodeRow getCurrentRow() {
        return this.matrix[this.currentRow];
    }

    public byte[][] getScaledMatrix(int i11, int i12) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.height * i12, this.width * i11);
        int i13 = this.height * i12;
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[(i13 - i14) - 1] = this.matrix[i14 / i12].getScaledRow(i11);
        }
        return bArr;
    }

    public void set(int i11, int i12, byte b11) {
        this.matrix[i12].set(i11, b11);
    }

    public void startRow() {
        this.currentRow++;
    }

    public BarcodeMatrix(int i11, int i12) {
        BarcodeRow[] barcodeRowArr = new BarcodeRow[i11];
        this.matrix = barcodeRowArr;
        int length = barcodeRowArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.matrix[i13] = new BarcodeRow(((i12 + 4) * 17) + 1);
        }
        this.width = i12 * 17;
        this.height = i11;
        this.currentRow = -1;
    }
}
