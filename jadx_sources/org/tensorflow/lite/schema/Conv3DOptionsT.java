package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class Conv3DOptionsT {
    private byte padding = 0;
    private int strideD = 0;
    private int strideW = 0;
    private int strideH = 0;
    private byte fusedActivationFunction = 0;
    private int dilationDFactor = 1;
    private int dilationWFactor = 1;
    private int dilationHFactor = 1;

    public int getDilationDFactor() {
        return this.dilationDFactor;
    }

    public int getDilationHFactor() {
        return this.dilationHFactor;
    }

    public int getDilationWFactor() {
        return this.dilationWFactor;
    }

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public byte getPadding() {
        return this.padding;
    }

    public int getStrideD() {
        return this.strideD;
    }

    public int getStrideH() {
        return this.strideH;
    }

    public int getStrideW() {
        return this.strideW;
    }

    public void setDilationDFactor(int i11) {
        this.dilationDFactor = i11;
    }

    public void setDilationHFactor(int i11) {
        this.dilationHFactor = i11;
    }

    public void setDilationWFactor(int i11) {
        this.dilationWFactor = i11;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }

    public void setPadding(byte b11) {
        this.padding = b11;
    }

    public void setStrideD(int i11) {
        this.strideD = i11;
    }

    public void setStrideH(int i11) {
        this.strideH = i11;
    }

    public void setStrideW(int i11) {
        this.strideW = i11;
    }
}
