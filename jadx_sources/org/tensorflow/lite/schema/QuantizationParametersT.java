package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class QuantizationParametersT {
    private float[] min = null;
    private float[] max = null;
    private float[] scale = null;
    private long[] zeroPoint = null;
    private QuantizationDetailsUnion details = null;
    private int quantizedDimension = 0;

    public QuantizationDetailsUnion getDetails() {
        return this.details;
    }

    public float[] getMax() {
        return this.max;
    }

    public float[] getMin() {
        return this.min;
    }

    public int getQuantizedDimension() {
        return this.quantizedDimension;
    }

    public float[] getScale() {
        return this.scale;
    }

    public long[] getZeroPoint() {
        return this.zeroPoint;
    }

    public void setDetails(QuantizationDetailsUnion quantizationDetailsUnion) {
        this.details = quantizationDetailsUnion;
    }

    public void setMax(float[] fArr) {
        this.max = fArr;
    }

    public void setMin(float[] fArr) {
        this.min = fArr;
    }

    public void setQuantizedDimension(int i11) {
        this.quantizedDimension = i11;
    }

    public void setScale(float[] fArr) {
        this.scale = fArr;
    }

    public void setZeroPoint(long[] jArr) {
        this.zeroPoint = jArr;
    }
}
