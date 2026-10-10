package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class ConcatenationOptionsT {
    private int axis = 0;
    private byte fusedActivationFunction = 0;

    public int getAxis() {
        return this.axis;
    }

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public void setAxis(int i11) {
        this.axis = i11;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }
}
