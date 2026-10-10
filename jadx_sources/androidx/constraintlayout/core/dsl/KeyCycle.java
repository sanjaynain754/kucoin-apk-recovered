package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes23.dex */
public class KeyCycle extends KeyAttribute {
    private static final String TAG = "KeyCycle";
    private float mWaveOffset;
    private float mWavePeriod;
    private float mWavePhase;
    private Wave mWaveShape;

    public enum Wave {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    public float getOffset() {
        return this.mWaveOffset;
    }

    public float getPeriod() {
        return this.mWavePeriod;
    }

    public float getPhase() {
        return this.mWavePhase;
    }

    public Wave getShape() {
        return this.mWaveShape;
    }

    public void setOffset(float f11) {
        this.mWaveOffset = f11;
    }

    public void setPeriod(float f11) {
        this.mWavePeriod = f11;
    }

    public void setPhase(float f11) {
        this.mWavePhase = f11;
    }

    public void setShape(Wave wave) {
        this.mWaveShape = wave;
    }

    public KeyCycle(int i11, String str) {
        super(i11, str);
        this.mWaveShape = null;
        this.mWavePeriod = Float.NaN;
        this.mWaveOffset = Float.NaN;
        this.mWavePhase = Float.NaN;
        this.TYPE = "KeyCycle";
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttribute
    public void attributesToString(StringBuilder sb2) {
        super.attributesToString(sb2);
        if (this.mWaveShape != null) {
            sb2.append("shape:'");
            sb2.append(this.mWaveShape);
            sb2.append("',\n");
        }
        append(sb2, "period", this.mWavePeriod);
        append(sb2, TypedValues.CycleType.S_WAVE_OFFSET, this.mWaveOffset);
        append(sb2, TypedValues.CycleType.S_WAVE_PHASE, this.mWavePhase);
    }
}
