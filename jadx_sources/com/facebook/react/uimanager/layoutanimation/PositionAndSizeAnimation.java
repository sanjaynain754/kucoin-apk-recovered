package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes45.dex */
class PositionAndSizeAnimation extends Animation implements LayoutHandlingAnimation {
    private int mDeltaHeight;
    private int mDeltaWidth;
    private float mDeltaX;
    private float mDeltaY;
    private int mStartHeight;
    private int mStartWidth;
    private float mStartX;
    private float mStartY;
    private final View mView;

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }

    private void calculateAnimation(int i11, int i12, int i13, int i14) {
        this.mStartX = this.mView.getX() - this.mView.getTranslationX();
        this.mStartY = this.mView.getY() - this.mView.getTranslationY();
        this.mStartWidth = this.mView.getWidth();
        int height = this.mView.getHeight();
        this.mStartHeight = height;
        this.mDeltaX = i11 - this.mStartX;
        this.mDeltaY = i12 - this.mStartY;
        this.mDeltaWidth = i13 - this.mStartWidth;
        this.mDeltaHeight = i14 - height;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f11, Transformation transformation) {
        float f12 = this.mStartX + (this.mDeltaX * f11);
        float f13 = this.mStartY + (this.mDeltaY * f11);
        this.mView.layout(Math.round(f12), Math.round(f13), Math.round(f12 + this.mStartWidth + (this.mDeltaWidth * f11)), Math.round(f13 + this.mStartHeight + (this.mDeltaHeight * f11)));
    }

    public PositionAndSizeAnimation(View view, int i11, int i12, int i13, int i14) {
        this.mView = view;
        calculateAnimation(i11, i12, i13, i14);
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutHandlingAnimation
    public void onLayoutUpdate(int i11, int i12, int i13, int i14) {
        calculateAnimation(i11, i12, i13, i14);
    }
}
