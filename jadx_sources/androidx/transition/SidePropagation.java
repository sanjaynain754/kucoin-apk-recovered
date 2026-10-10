package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public class SidePropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    public void setPropagationSpeed(float f11) {
        if (f11 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.mPropagationSpeed = f11;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    private int distance(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = this.mSide;
        if (i19 == 8388611) {
            if (view.getLayoutDirection() == 1) {
                i19 = 5;
            } else {
                i19 = 3;
            }
        } else if (i19 == 8388613) {
            if (view.getLayoutDirection() == 1) {
                i19 = 3;
            } else {
                i19 = 5;
            }
        }
        if (i19 == 3) {
            return (i17 - i11) + Math.abs(i14 - i12);
        }
        if (i19 == 5) {
            return (i11 - i15) + Math.abs(i14 - i12);
        }
        if (i19 == 48) {
            return (i18 - i12) + Math.abs(i13 - i11);
        }
        if (i19 != 80) {
            return 0;
        }
        return (i12 - i16) + Math.abs(i13 - i11);
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        int i11 = this.mSide;
        return (i11 == 3 || i11 == 5 || i11 == 8388611 || i11 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(@NonNull ViewGroup viewGroup, @NonNull Transition transition, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i11;
        int i12;
        int iCenterY;
        int i13;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i11 = -1;
        } else {
            transitionValues3 = transitionValues2;
            i11 = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (epicenter != null) {
            int iCenterX = epicenter.centerX();
            i13 = iRound2;
            iCenterY = epicenter.centerY();
            i12 = iCenterX;
        } else {
            i12 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i13 = iRound2;
        }
        float fDistance = distance(viewGroup, viewX, viewY, i12, iCenterY, iRound, i13, width, height) / getMaxDistance(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i11)) / this.mPropagationSpeed) * fDistance);
    }

    public void setSide(int i11) {
        this.mSide = i11;
    }
}
