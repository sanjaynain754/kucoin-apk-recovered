package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class RNNOptionsT {
    private byte fusedActivationFunction = 0;
    private boolean asymmetricQuantizeInputs = false;

    public boolean getAsymmetricQuantizeInputs() {
        return this.asymmetricQuantizeInputs;
    }

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public void setAsymmetricQuantizeInputs(boolean z11) {
        this.asymmetricQuantizeInputs = z11;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }
}
