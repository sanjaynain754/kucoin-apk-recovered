package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class StatsT {
    private float[] max = null;
    private float[] min = null;

    public float[] getMax() {
        return this.max;
    }

    public float[] getMin() {
        return this.min;
    }

    public void setMax(float[] fArr) {
        this.max = fArr;
    }

    public void setMin(float[] fArr) {
        this.min = fArr;
    }
}
