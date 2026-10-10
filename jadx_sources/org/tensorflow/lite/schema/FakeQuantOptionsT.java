package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class FakeQuantOptionsT {
    private float min = 0.0f;
    private float max = 0.0f;
    private int numBits = 0;
    private boolean narrowRange = false;

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public boolean getNarrowRange() {
        return this.narrowRange;
    }

    public int getNumBits() {
        return this.numBits;
    }

    public void setMax(float f11) {
        this.max = f11;
    }

    public void setMin(float f11) {
        this.min = f11;
    }

    public void setNarrowRange(boolean z11) {
        this.narrowRange = z11;
    }

    public void setNumBits(int i11) {
        this.numBits = i11;
    }
}
