package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class FullyConnectedOptionsT {
    private byte fusedActivationFunction = 0;
    private byte weightsFormat = 0;
    private boolean keepNumDims = false;
    private boolean asymmetricQuantizeInputs = false;

    public boolean getAsymmetricQuantizeInputs() {
        return this.asymmetricQuantizeInputs;
    }

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public boolean getKeepNumDims() {
        return this.keepNumDims;
    }

    public byte getWeightsFormat() {
        return this.weightsFormat;
    }

    public void setAsymmetricQuantizeInputs(boolean z11) {
        this.asymmetricQuantizeInputs = z11;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }

    public void setKeepNumDims(boolean z11) {
        this.keepNumDims = z11;
    }

    public void setWeightsFormat(byte b11) {
        this.weightsFormat = b11;
    }
}
