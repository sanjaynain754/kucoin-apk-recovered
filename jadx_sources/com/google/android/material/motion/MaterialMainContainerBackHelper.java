package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private static final float MIN_SCALE = 0.9f;

    @Nullable
    private float[] expandedCornerRadii;

    @Nullable
    private Rect initialHideFromClipBounds;

    @Nullable
    private Rect initialHideToClipBounds;
    private float initialTouchY;
    private final float maxTranslationY;
    private final float minEdgeGap;

    /* JADX INFO: Access modifiers changed from: private */
    public static float[] lerpCornerRadii(float[] fArr, float[] fArr2, float f11) {
        return new float[]{AnimationUtils.lerp(fArr[0], fArr2[0], f11), AnimationUtils.lerp(fArr[1], fArr2[1], f11), AnimationUtils.lerp(fArr[2], fArr2[2], f11), AnimationUtils.lerp(fArr[3], fArr2[3], f11), AnimationUtils.lerp(fArr[4], fArr2[4], f11), AnimationUtils.lerp(fArr[5], fArr2[5], f11), AnimationUtils.lerp(fArr[6], fArr2[6], f11), AnimationUtils.lerp(fArr[7], fArr2[7], f11)};
    }

    private void resetInitialValues() {
        this.initialTouchY = 0.0f;
        this.initialHideToClipBounds = null;
        this.initialHideFromClipBounds = null;
    }

    public void clearExpandedCornerRadii() {
        this.expandedCornerRadii = null;
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat, @Nullable View view) {
        super.onStartBackProgress(backEventCompat);
        startBackProgress(backEventCompat.getTouchY(), view);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @Nullable View view, float f11) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, backEventCompat.getTouchY(), f11);
    }

    private float[] calculateExpandedCornerRadii() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.view.getRootWindowInsets()) == null) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        DisplayMetrics displayMetrics = this.view.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        int roundedCornerRadius = (i13 == 0 && i14 == 0) ? getRoundedCornerRadius(rootWindowInsets, 0) : 0;
        int i15 = width + i13;
        int roundedCornerRadius2 = (i15 < i11 || i14 != 0) ? 0 : getRoundedCornerRadius(rootWindowInsets, 1);
        int roundedCornerRadius3 = (i15 < i11 || i14 + height < i12) ? 0 : getRoundedCornerRadius(rootWindowInsets, 2);
        int roundedCornerRadius4 = (i13 != 0 || i14 + height < i12) ? 0 : getRoundedCornerRadius(rootWindowInsets, 3);
        float f11 = roundedCornerRadius;
        float f12 = roundedCornerRadius2;
        float f13 = roundedCornerRadius3;
        float f14 = roundedCornerRadius4;
        return new float[]{f11, f11, f12, f12, f13, f13, f14, f14};
    }

    @NonNull
    private ValueAnimator createCornerAnimator(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: com.google.android.material.motion.c
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f11, Object obj, Object obj2) {
                return MaterialMainContainerBackHelper.lerpCornerRadii((float[]) obj, (float[]) obj2, f11);
            }
        }, clippableRoundedCornerLayout.getCornerRadii(), getExpandedCornerRadii());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.motion.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                clippableRoundedCornerLayout.updateCornerRadii((float[]) valueAnimator.getAnimatedValue());
            }
        });
        return valueAnimatorOfObject;
    }

    @NonNull
    private AnimatorSet createResetScaleAndTranslationAnimator(@Nullable final View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialMainContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view2 = view;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    @NonNull
    public float[] getExpandedCornerRadii() {
        if (this.expandedCornerRadii == null) {
            this.expandedCornerRadii = calculateExpandedCornerRadii();
        }
        return this.expandedCornerRadii;
    }

    @Nullable
    public Rect getInitialHideFromClipBounds() {
        return this.initialHideFromClipBounds;
    }

    @Nullable
    public Rect getInitialHideToClipBounds() {
        return this.initialHideToClipBounds;
    }

    public MaterialMainContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.minEdgeGap = resources.getDimension(C7090R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.maxTranslationY = resources.getDimension(C7090R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    @RequiresApi(31)
    private int getRoundedCornerRadius(WindowInsets windowInsets, int i11) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i11);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    public void cancelBackProgress(@Nullable View view) {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSetCreateResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        V v11 = this.view;
        if (v11 instanceof ClippableRoundedCornerLayout) {
            animatorSetCreateResetScaleAndTranslationAnimator.playTogether(createCornerAnimator((ClippableRoundedCornerLayout) v11));
        }
        animatorSetCreateResetScaleAndTranslationAnimator.setDuration(this.cancelDuration);
        animatorSetCreateResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    public void finishBackProgress(long j11, @Nullable View view) {
        AnimatorSet animatorSetCreateResetScaleAndTranslationAnimator = createResetScaleAndTranslationAnimator(view);
        animatorSetCreateResetScaleAndTranslationAnimator.setDuration(j11);
        animatorSetCreateResetScaleAndTranslationAnimator.start();
        resetInitialValues();
    }

    @VisibleForTesting
    public void startBackProgress(float f11, @Nullable View view) {
        this.initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.view);
        if (view != null) {
            this.initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.view, view);
        }
        this.initialTouchY = f11;
    }

    @VisibleForTesting
    public void updateBackProgress(float f11, boolean z11, float f12, float f13) {
        float fInterpolateProgress = interpolateProgress(f11);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fLerp = AnimationUtils.lerp(1.0f, MIN_SCALE, fInterpolateProgress);
        float fLerp2 = AnimationUtils.lerp(0.0f, Math.max(0.0f, ((width - (MIN_SCALE * width)) / 2.0f) - this.minEdgeGap), fInterpolateProgress) * (z11 ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, ((height - (fLerp * height)) / 2.0f) - this.minEdgeGap), this.maxTranslationY);
        float f14 = f12 - this.initialTouchY;
        float fLerp3 = AnimationUtils.lerp(0.0f, fMin, Math.abs(f14) / height) * Math.signum(f14);
        if (Float.isNaN(fLerp) || Float.isNaN(fLerp2) || Float.isNaN(fLerp3)) {
            return;
        }
        this.view.setScaleX(fLerp);
        this.view.setScaleY(fLerp);
        this.view.setTranslationX(fLerp2);
        this.view.setTranslationY(fLerp3);
        V v11 = this.view;
        if (v11 instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) v11).updateCornerRadii(lerpCornerRadii(getExpandedCornerRadii(), f13, fInterpolateProgress));
        }
    }

    private static float[] lerpCornerRadii(float[] fArr, float f11, float f12) {
        return new float[]{AnimationUtils.lerp(fArr[0], f11, f12), AnimationUtils.lerp(fArr[1], f11, f12), AnimationUtils.lerp(fArr[2], f11, f12), AnimationUtils.lerp(fArr[3], f11, f12), AnimationUtils.lerp(fArr[4], f11, f12), AnimationUtils.lerp(fArr[5], f11, f12), AnimationUtils.lerp(fArr[6], f11, f12), AnimationUtils.lerp(fArr[7], f11, f12)};
    }
}
