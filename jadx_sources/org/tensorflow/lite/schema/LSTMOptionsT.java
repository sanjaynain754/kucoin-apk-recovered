package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class LSTMOptionsT {
    private byte fusedActivationFunction = 0;
    private float cellClip = 0.0f;
    private float projClip = 0.0f;
    private byte kernelType = 0;
    private boolean asymmetricQuantizeInputs = false;

    public boolean getAsymmetricQuantizeInputs() {
        return this.asymmetricQuantizeInputs;
    }

    public float getCellClip() {
        return this.cellClip;
    }

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public byte getKernelType() {
        return this.kernelType;
    }

    public float getProjClip() {
        return this.projClip;
    }

    public void setAsymmetricQuantizeInputs(boolean z11) {
        this.asymmetricQuantizeInputs = z11;
    }

    public void setCellClip(float f11) {
        this.cellClip = f11;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }

    public void setKernelType(byte b11) {
        this.kernelType = b11;
    }

    public void setProjClip(float f11) {
        this.projClip = f11;
    }
}
