package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* JADX INFO: loaded from: classes23.dex */
abstract class KeyPositionBase extends Key {
    protected static final float SELECTION_SLOPE = 20.0f;
    int mCurveFit = Key.UNSET;

    public abstract void calcPosition(int i11, int i12, float f11, float f12, float f13, float f14);

    public abstract float getPositionX();

    public abstract float getPositionY();

    public abstract boolean intersects(int i11, int i12, RectF rectF, RectF rectF2, float f11, float f12);

    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f11, float f12, String[] strArr, float[] fArr);

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }
}
