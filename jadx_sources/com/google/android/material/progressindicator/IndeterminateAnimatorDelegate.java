package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected final List<DrawingDelegate.ActiveIndicator> activeIndicators = new ArrayList();
    protected IndeterminateDrawable drawable;

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int i11, int i12, int i13) {
        return MathUtils.clamp((i11 - i12) / i13, 0.0f, 1.0f);
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    @VisibleForTesting
    public abstract void resetPropertiesForNewStart();

    @VisibleForTesting
    public abstract void setAnimationFraction(float f11);

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();

    public void registerDrawable(@NonNull IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    public IndeterminateAnimatorDelegate(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }
}
