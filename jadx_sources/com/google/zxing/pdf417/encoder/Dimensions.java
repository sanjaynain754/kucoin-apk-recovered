package com.google.zxing.pdf417.encoder;

/* JADX INFO: loaded from: classes56.dex */
public final class Dimensions {
    private final int maxCols;
    private final int maxRows;
    private final int minCols;
    private final int minRows;

    public int getMaxCols() {
        return this.maxCols;
    }

    public int getMaxRows() {
        return this.maxRows;
    }

    public int getMinCols() {
        return this.minCols;
    }

    public int getMinRows() {
        return this.minRows;
    }

    public Dimensions(int i11, int i12, int i13, int i14) {
        this.minCols = i11;
        this.maxCols = i12;
        this.minRows = i13;
        this.maxRows = i14;
    }
}
