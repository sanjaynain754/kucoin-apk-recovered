package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class Pool2DOptionsT {
    private byte padding = 0;
    private int strideW = 0;
    private int strideH = 0;
    private int filterWidth = 0;
    private int filterHeight = 0;
    private byte fusedActivationFunction = 0;

    public int getFilterHeight() {
        return this.filterHeight;
    }

    public int getFilterWidth() {
        return this.filterWidth;
    }

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public byte getPadding() {
        return this.padding;
    }

    public int getStrideH() {
        return this.strideH;
    }

    public int getStrideW() {
        return this.strideW;
    }

    public void setFilterHeight(int i11) {
        this.filterHeight = i11;
    }

    public void setFilterWidth(int i11) {
        this.filterWidth = i11;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }

    public void setPadding(byte b11) {
        this.padding = b11;
    }

    public void setStrideH(int i11) {
        this.strideH = i11;
    }

    public void setStrideW(int i11) {
        this.strideW = i11;
    }
}
