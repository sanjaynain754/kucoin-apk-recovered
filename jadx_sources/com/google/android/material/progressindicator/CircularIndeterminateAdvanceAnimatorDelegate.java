package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.tencent.rtmp.TXVodConstants;

/* JADX INFO: loaded from: classes45.dex */
final class CircularIndeterminateAdvanceAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    private static final Property<CircularIndeterminateAdvanceAnimatorDelegate, Float> ANIMATION_FRACTION;
    private static final Property<CircularIndeterminateAdvanceAnimatorDelegate, Float> COMPLETE_END_FRACTION;
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = -20;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private ObjectAnimator animator;
    Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final BaseProgressIndicatorSpec baseSpec;
    private ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset;
    private final FastOutSlowInInterpolator interpolator;
    private static final int[] DELAY_TO_EXPAND_IN_MS = {0, 1350, 2700, 4050};
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = {667, TXVodConstants.VOD_PLAY_EVT_FIRST_VIDEO_PACKET, 3367, 4717};
    private static final int[] DELAY_TO_FADE_IN_MS = {1000, 2350, 3700, 5050};

    public CircularIndeterminateAdvanceAnimatorDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.indicatorColorIndexOffset = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = circularProgressIndicatorSpec;
        this.interpolator = new FastOutSlowInInterpolator();
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 5400.0f));
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = CircularIndeterminateAdvanceAnimatorDelegate.this;
                    circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset + 4) % CircularIndeterminateAdvanceAnimatorDelegate.this.baseSpec.indicatorColors.length;
                }
            });
        }
        if (this.completeEndAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, COMPLETE_END_FRACTION, 0.0f, 1.0f);
            this.completeEndAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 333.0f));
            this.completeEndAnimator.setInterpolator(this.interpolator);
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAdvanceAnimatorDelegate.this.cancelAnimatorImmediately();
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = CircularIndeterminateAdvanceAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAdvanceAnimatorDelegate.animatorCompleteCallback;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(circularIndeterminateAdvanceAnimatorDelegate.drawable);
                    }
                }
            });
        }
    }

    private void maybeUpdateSegmentColors(int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            float fractionInRange = getFractionInRange(i11, DELAY_TO_FADE_IN_MS[i12], 333);
            if (fractionInRange > 0.0f && fractionInRange < 1.0f) {
                int i13 = i12 + this.indicatorColorIndexOffset;
                int[] iArr = this.baseSpec.indicatorColors;
                int length = i13 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i14 = iArr[length];
                int i15 = iArr[length2];
                this.activeIndicators.get(0).color = ArgbEvaluatorCompat.getInstance().evaluate(this.interpolator.getInterpolation(fractionInRange), Integer.valueOf(i14), Integer.valueOf(i15)).intValue();
                return;
            }
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void resetPropertiesForNewStart() {
        this.indicatorColorIndexOffset = 0;
        this.activeIndicators.get(0).color = this.baseSpec.indicatorColors[0];
        this.completeEndFraction = 0.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }

    static {
        Class<Float> cls = Float.class;
        ANIMATION_FRACTION = new Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>(cls, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.3
            @Override // android.util.Property
            public Float get(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAdvanceAnimatorDelegate.getAnimationFraction());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate, Float f11) {
                circularIndeterminateAdvanceAnimatorDelegate.setAnimationFraction(f11.floatValue());
            }
        };
        COMPLETE_END_FRACTION = new Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>(cls, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.4
            @Override // android.util.Property
            public Float get(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAdvanceAnimatorDelegate.getCompleteEndFraction());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate, Float f11) {
                circularIndeterminateAdvanceAnimatorDelegate.setCompleteEndFraction(f11.floatValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCompleteEndFraction() {
        return this.completeEndFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompleteEndFraction(float f11) {
        this.completeEndFraction = f11;
    }

    private void updateSegmentPositions(int i11) {
        DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicators.get(0);
        float f11 = this.animationFraction;
        activeIndicator.startFraction = (f11 * 1520.0f) - 20.0f;
        activeIndicator.endFraction = f11 * 1520.0f;
        for (int i12 = 0; i12 < 4; i12++) {
            activeIndicator.endFraction += this.interpolator.getInterpolation(getFractionInRange(i11, DELAY_TO_EXPAND_IN_MS[i12], 667)) * 250.0f;
            activeIndicator.startFraction += this.interpolator.getInterpolation(getFractionInRange(i11, DELAY_TO_COLLAPSE_IN_MS[i12], 667)) * 250.0f;
        }
        float f12 = activeIndicator.startFraction;
        float f13 = activeIndicator.endFraction;
        activeIndicator.startFraction = (f12 + ((f13 - f12) * this.completeEndFraction)) / 360.0f;
        activeIndicator.endFraction = f13 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.animatorCompleteCallback = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.completeEndAnimator;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.drawable.isVisible()) {
            this.completeEndAnimator.start();
        } else {
            cancelAnimatorImmediately();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void setAnimationFraction(float f11) {
        this.animationFraction = f11;
        int i11 = (int) (f11 * 5400.0f);
        updateSegmentPositions(i11);
        maybeUpdateSegmentColors(i11);
        this.drawable.invalidateSelf();
    }

    private void updateAnimatorsDuration() {
        maybeInitializeAnimators();
        this.animator.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 5400.0f));
        this.completeEndAnimator.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 333.0f));
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        updateAnimatorsDuration();
        resetPropertiesForNewStart();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }
}
