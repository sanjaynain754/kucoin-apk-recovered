package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;

/* JADX INFO: loaded from: classes45.dex */
abstract class BaseLayoutAnimation extends AbstractLayoutAnimation {
    public abstract boolean isReverse();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.layoutanimation.BaseLayoutAnimation$1 */
    public static /* synthetic */ class C61681 {

        /* JADX INFO: renamed from: $SwitchMap$com$facebook$react$uimanager$layoutanimation$AnimatedPropertyType */
        static final /* synthetic */ int[] f9931x36728427;

        static {
            int[] iArr = new int[AnimatedPropertyType.values().length];
            f9931x36728427 = iArr;
            try {
                iArr[AnimatedPropertyType.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9931x36728427[AnimatedPropertyType.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9931x36728427[AnimatedPropertyType.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9931x36728427[AnimatedPropertyType.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    public Animation createAnimationImpl(View view, int i11, int i12, int i13, int i14) {
        AnimatedPropertyType animatedPropertyType = this.mAnimatedProperty;
        if (animatedPropertyType == null) {
            throw new IllegalViewOperationException("Missing animated property from animation config");
        }
        int i15 = C61681.f9931x36728427[animatedPropertyType.ordinal()];
        if (i15 == 1) {
            return new OpacityAnimation(view, isReverse() ? view.getAlpha() : 0.0f, isReverse() ? 0.0f : view.getAlpha());
        }
        if (i15 == 2) {
            float f11 = isReverse() ? 1.0f : 0.0f;
            float f12 = isReverse() ? 0.0f : 1.0f;
            return new ScaleAnimation(f11, f12, f11, f12, 1, 0.5f, 1, 0.5f);
        }
        if (i15 == 3) {
            return new ScaleAnimation(isReverse() ? 1.0f : 0.0f, isReverse() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (i15 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, isReverse() ? 1.0f : 0.0f, isReverse() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        throw new IllegalViewOperationException("Missing animation for property : " + this.mAnimatedProperty);
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    public boolean isValid() {
        return this.mDurationMs > 0 && this.mAnimatedProperty != null;
    }
}
