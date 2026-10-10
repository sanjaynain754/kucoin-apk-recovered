package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class BatchMatMulOptionsT {
    private boolean adjX = false;
    private boolean adjY = false;
    private boolean asymmetricQuantizeInputs = false;

    public boolean getAdjX() {
        return this.adjX;
    }

    public boolean getAdjY() {
        return this.adjY;
    }

    public boolean getAsymmetricQuantizeInputs() {
        return this.asymmetricQuantizeInputs;
    }

    public void setAdjX(boolean z11) {
        this.adjX = z11;
    }

    public void setAdjY(boolean z11) {
        this.adjY = z11;
    }

    public void setAsymmetricQuantizeInputs(boolean z11) {
        this.asymmetricQuantizeInputs = z11;
    }
}
