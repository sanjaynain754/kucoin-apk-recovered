package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class SVDFOptionsT {
    private int rank = 0;
    private byte fusedActivationFunction = 0;
    private boolean asymmetricQuantizeInputs = false;

    public boolean getAsymmetricQuantizeInputs() {
        return this.asymmetricQuantizeInputs;
    }

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public int getRank() {
        return this.rank;
    }

    public void setAsymmetricQuantizeInputs(boolean z11) {
        this.asymmetricQuantizeInputs = z11;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }

    public void setRank(int i11) {
        this.rank = i11;
    }
}
