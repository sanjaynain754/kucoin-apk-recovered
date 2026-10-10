package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes45.dex */
class OpacityAnimation extends Animation {
    private final float mDeltaOpacity;
    private final float mStartOpacity;
    private final View mView;

    public static class OpacityAnimationListener implements Animation.AnimationListener {
        private boolean mLayerTypeChanged = false;
        private final View mView;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.mLayerTypeChanged) {
                this.mView.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.mView.hasOverlappingRendering() && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, null);
            }
        }

        public OpacityAnimationListener(View view) {
            this.mView = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f11, Transformation transformation) {
        this.mView.setAlpha(this.mStartOpacity + (this.mDeltaOpacity * f11));
    }

    public OpacityAnimation(View view, float f11, float f12) {
        this.mView = view;
        this.mStartOpacity = f11;
        this.mDeltaOpacity = f12 - f11;
        setAnimationListener(new OpacityAnimationListener(view));
    }
}
