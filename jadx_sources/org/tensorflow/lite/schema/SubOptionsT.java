package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class SubOptionsT {
    private byte fusedActivationFunction = 0;
    private boolean potScaleInt16 = true;

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public boolean getPotScaleInt16() {
        return this.potScaleInt16;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }

    public void setPotScaleInt16(boolean z11) {
        this.potScaleInt16 = z11;
    }
}
