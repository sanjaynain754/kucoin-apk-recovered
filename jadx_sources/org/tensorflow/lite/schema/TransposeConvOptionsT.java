package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class TransposeConvOptionsT {
    private byte padding = 0;
    private int strideW = 0;
    private int strideH = 0;
    private byte fusedActivationFunction = 0;

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
