package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public class Explode extends Visibility {
    private static final String PROPNAME_SCREEN_BOUNDS = "android:explode:screenBounds";
    private int[] mTempLoc;
    private static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
    private static final TimeInterpolator sAccelerate = new AccelerateInterpolator();

    public Explode() {
        this.mTempLoc = new int[2];
        setPropagation(new CircularPropagation());
    }

    private static float calculateDistance(float f11, float f12) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    private void calculateOut(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.mTempLoc);
        int[] iArr2 = this.mTempLoc;
        int i11 = iArr2[0];
        int i12 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            width = (view.getWidth() / 2) + i11 + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i12 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fCalculateDistance = calculateDistance(fCenterX, fCenterY);
        float fCalculateMaxDistance = calculateMaxDistance(view, width - i11, iCenterY - i12);
        iArr[0] = Math.round((fCenterX / fCalculateDistance) * fCalculateMaxDistance);
        iArr[1] = Math.round(fCalculateMaxDistance * (fCenterY / fCalculateDistance));
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        view.getLocationOnScreen(this.mTempLoc);
        int[] iArr = this.mTempLoc;
        int i11 = iArr[0];
        int i12 = iArr[1];
        transitionValues.values.put(PROPNAME_SCREEN_BOUNDS, new Rect(i11, i12, view.getWidth() + i11, view.getHeight() + i12));
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues2.values.get(PROPNAME_SCREEN_BOUNDS);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        calculateOut(viewGroup, rect, this.mTempLoc);
        int[] iArr = this.mTempLoc;
        return TranslationAnimationCreator.createAnimation(view, transitionValues2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, sDecelerate, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        float f11;
        float f12;
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get(PROPNAME_SCREEN_BOUNDS);
        int i11 = rect.left;
        int i12 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(C4093R.id.transition_position);
        if (iArr != null) {
            int i13 = iArr[0];
            f11 = (i13 - rect.left) + translationX;
            int i14 = iArr[1];
            f12 = (i14 - rect.top) + translationY;
            rect.offsetTo(i13, i14);
        } else {
            f11 = translationX;
            f12 = translationY;
        }
        calculateOut(viewGroup, rect, this.mTempLoc);
        int[] iArr2 = this.mTempLoc;
        return TranslationAnimationCreator.createAnimation(view, transitionValues, i11, i12, translationX, translationY, f11 + iArr2[0], f12 + iArr2[1], sAccelerate, this);
    }

    private static float calculateMaxDistance(View view, int i11, int i12) {
        return calculateDistance(Math.max(i11, view.getWidth() - i11), Math.max(i12, view.getHeight() - i12));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        captureValues(transitionValues);
    }

    public Explode(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTempLoc = new int[2];
        setPropagation(new CircularPropagation());
    }
}
