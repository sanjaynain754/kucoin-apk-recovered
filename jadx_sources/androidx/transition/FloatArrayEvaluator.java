package androidx.transition;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes34.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {
    private float[] mArray;

    @Override // android.animation.TypeEvaluator
    public float[] evaluate(float f11, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.mArray;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i11 = 0; i11 < fArr3.length; i11++) {
            float f12 = fArr[i11];
            fArr3[i11] = f12 + ((fArr2[i11] - f12) * f11);
        }
        return fArr3;
    }

    public FloatArrayEvaluator(float[] fArr) {
        this.mArray = fArr;
    }
}
