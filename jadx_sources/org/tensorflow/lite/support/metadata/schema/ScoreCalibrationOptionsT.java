package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class ScoreCalibrationOptionsT {
    private byte scoreTransformation = 0;
    private float defaultScore = 0.0f;

    public float getDefaultScore() {
        return this.defaultScore;
    }

    public byte getScoreTransformation() {
        return this.scoreTransformation;
    }

    public void setDefaultScore(float f11) {
        this.defaultScore = f11;
    }

    public void setScoreTransformation(byte b11) {
        this.scoreTransformation = b11;
    }
}
