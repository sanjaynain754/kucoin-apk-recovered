package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class NormalizationOptionsT {
    private float[] mean = null;
    private float[] std = null;

    public float[] getMean() {
        return this.mean;
    }

    public float[] getStd() {
        return this.std;
    }

    public void setMean(float[] fArr) {
        this.mean = fArr;
    }

    public void setStd(float[] fArr) {
        this.std = fArr;
    }
}
