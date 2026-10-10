package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private AccessibilityManager accessibilityManager;
    private int additionalHiddenOffsetY;

    @Nullable
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private boolean disableOnTouchExploration;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private int height;

    @NonNull
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationListener;
    private static final int ENTER_ANIM_DURATION_ATTR = C7090R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = C7090R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = C7090R.attr.motionEasingEmphasizedInterpolator;

    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, int i11);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.disableOnTouchExploration = true;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        return i11 == 2;
    }

    public void slideDown(@NonNull V v11) {
        slideDown(v11, true);
    }

    public void slideUp(@NonNull V v11) {
        slideUp(v11, true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12919a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z11) {
        if (!z11) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.isScrolledDown()) {
            hideBottomViewOnScrollBehavior.slideUp(view);
        }
    }

    private void disableIfTouchExplorationEnabled(final V v11) {
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(v11.getContext(), AccessibilityManager.class);
        }
        if (this.accessibilityManager == null || this.touchExplorationListener != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.behavior.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z11) {
                HideBottomViewOnScrollBehavior.m12919a(this.f11747a, v11, z11);
            }
        };
        this.touchExplorationListener = touchExplorationStateChangeListener;
        this.accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        v11.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NonNull View view) {
                if (HideBottomViewOnScrollBehavior.this.touchExplorationListener == null || HideBottomViewOnScrollBehavior.this.accessibilityManager == null) {
                    return;
                }
                HideBottomViewOnScrollBehavior.this.accessibilityManager.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.touchExplorationListener);
                HideBottomViewOnScrollBehavior.this.touchExplorationListener = null;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view) {
            }
        });
    }

    private void updateCurrentState(@NonNull V v11, int i11) {
        this.currentState = i11;
        Iterator<OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v11, this.currentState);
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }

    public void disableOnTouchExploration(boolean z11) {
        this.disableOnTouchExploration = z11;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.disableOnTouchExploration;
    }

    public boolean isScrolledDown() {
        return this.currentState == 1;
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        if (i12 > 0) {
            slideDown(v11);
        } else if (i12 < 0) {
            slideUp(v11);
        }
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(@NonNull V v11, @Dimension int i11) {
        this.additionalHiddenOffsetY = i11;
        if (this.currentState == 1) {
            v11.setTranslationY(this.height + i11);
        }
    }

    public void slideDown(@NonNull V v11, boolean z11) {
        AccessibilityManager accessibilityManager;
        if (isScrolledDown()) {
            return;
        }
        if (this.disableOnTouchExploration && (accessibilityManager = this.accessibilityManager) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        updateCurrentState(v11, 1);
        int i11 = this.height + this.additionalHiddenOffsetY;
        if (z11) {
            animateChildTo(v11, i11, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            v11.setTranslationY(i11);
        }
    }

    public void slideUp(@NonNull V v11, boolean z11) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        updateCurrentState(v11, 2);
        if (z11) {
            animateChildTo(v11, 0, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            v11.setTranslationY(0);
        }
    }

    private void animateChildTo(@NonNull V v11, int i11, long j11, TimeInterpolator timeInterpolator) {
        this.currentAnimator = v11.animate().translationY(i11).setInterpolator(timeInterpolator).setDuration(j11).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        this.height = v11.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v11.getLayoutParams()).bottomMargin;
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v11.getContext(), ENTER_ANIM_DURATION_ATTR, DEFAULT_ENTER_ANIMATION_DURATION_MS);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v11.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v11.getContext();
        int i12 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i12, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v11.getContext(), i12, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        disableIfTouchExplorationEnabled(v11);
        return super.onLayoutChild(coordinatorLayout, v11, i11);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.disableOnTouchExploration = true;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }
}
