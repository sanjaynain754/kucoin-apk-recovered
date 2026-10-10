package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public class LocalResponseNormalizationOptionsT {
    private int radius = 0;
    private float bias = 0.0f;
    private float alpha = 0.0f;
    private float beta = 0.0f;

    public float getAlpha() {
        return this.alpha;
    }

    public float getBeta() {
        return this.beta;
    }

    public float getBias() {
        return this.bias;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setAlpha(float f11) {
        this.alpha = f11;
    }

    public void setBeta(float f11) {
        this.beta = f11;
    }

    public void setBias(float f11) {
        this.bias = f11;
    }

    public void setRadius(int i11) {
        this.radius = i11;
    }
}
