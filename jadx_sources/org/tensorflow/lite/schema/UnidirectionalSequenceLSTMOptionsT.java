package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class UnidirectionalSequenceLSTMOptionsT {
    private byte fusedActivationFunction = 0;
    private float cellClip = 0.0f;
    private float projClip = 0.0f;
    private boolean timeMajor = false;
    private boolean asymmetricQuantizeInputs = false;
    private boolean diagonalRecurrentTensors = false;

    public boolean getAsymmetricQuantizeInputs() {
        return this.asymmetricQuantizeInputs;
    }

    public float getCellClip() {
        return this.cellClip;
    }

    public boolean getDiagonalRecurrentTensors() {
        return this.diagonalRecurrentTensors;
    }

    public byte getFusedActivationFunction() {
        return this.fusedActivationFunction;
    }

    public float getProjClip() {
        return this.projClip;
    }

    public boolean getTimeMajor() {
        return this.timeMajor;
    }

    public void setAsymmetricQuantizeInputs(boolean z11) {
        this.asymmetricQuantizeInputs = z11;
    }

    public void setCellClip(float f11) {
        this.cellClip = f11;
    }

    public void setDiagonalRecurrentTensors(boolean z11) {
        this.diagonalRecurrentTensors = z11;
    }

    public void setFusedActivationFunction(byte b11) {
        this.fusedActivationFunction = b11;
    }

    public void setProjClip(float f11) {
        this.projClip = f11;
    }

    public void setTimeMajor(boolean z11) {
        this.timeMajor = z11;
    }
}
