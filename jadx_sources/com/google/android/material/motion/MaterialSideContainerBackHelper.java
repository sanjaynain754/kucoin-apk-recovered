package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v11 = this.view;
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i11), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt final int i11, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z11 = backEventCompat.getSwipeEdge() == 0;
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i11, 3);
        float width = (this.view.getWidth() * this.view.getScaleX()) + getEdgeMargin(zCheckAbsoluteGravity);
        V v11 = this.view;
        Property property = View.TRANSLATION_X;
        if (zCheckAbsoluteGravity) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v11, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z11, i11);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt int i11) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i11);
    }

    private boolean checkAbsoluteGravity(@GravityInt int i11, @GravityInt int i12) {
        return (Gravity.getAbsoluteGravity(i11, this.view.getLayoutDirection()) & i12) == i12;
    }

    private int getEdgeMargin(boolean z11) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(C7090R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(C7090R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(C7090R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    @VisibleForTesting
    public void updateBackProgress(float f11, boolean z11, @GravityInt int i11) {
        int right;
        float fInterpolateProgress = interpolateProgress(f11);
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i11, 3);
        boolean z12 = z11 == zCheckAbsoluteGravity;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f12 = width;
        if (f12 > 0.0f) {
            float f13 = height;
            if (f13 <= 0.0f) {
                return;
            }
            float f14 = this.maxScaleXDistanceShrink / f12;
            float f15 = this.maxScaleXDistanceGrow / f12;
            float f16 = this.maxScaleYDistance / f13;
            V v11 = this.view;
            if (zCheckAbsoluteGravity) {
                f12 = 0.0f;
            }
            v11.setPivotX(f12);
            if (!z12) {
                f15 = -f14;
            }
            float fLerp = AnimationUtils.lerp(0.0f, f15, fInterpolateProgress);
            float f17 = fLerp + 1.0f;
            float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f16, fInterpolateProgress);
            if (Float.isNaN(f17) || Float.isNaN(fLerp2)) {
                return;
            }
            this.view.setScaleX(f17);
            this.view.setScaleY(fLerp2);
            V v12 = this.view;
            if (v12 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v12;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    if (zCheckAbsoluteGravity) {
                        right = (width - childAt.getRight()) + childAt.getWidth();
                    } else {
                        right = -childAt.getLeft();
                    }
                    childAt.setPivotX(right);
                    childAt.setPivotY(-childAt.getTop());
                    float f18 = z12 ? 1.0f - fLerp : 1.0f;
                    float f19 = fLerp2 != 0.0f ? (f17 / fLerp2) * f18 : 1.0f;
                    if (!Float.isNaN(f18) && !Float.isNaN(f19)) {
                        childAt.setScaleX(f18);
                        childAt.setScaleY(f19);
                    }
                }
            }
        }
    }
}
