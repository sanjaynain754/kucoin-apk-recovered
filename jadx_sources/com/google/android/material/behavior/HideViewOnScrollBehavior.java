package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
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
import com.tencent.bugly.proguard.C33978va;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes45.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int EDGE_BOTTOM = 1;
    public static final int EDGE_LEFT = 2;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_SCROLLED_IN = 2;
    public static final int STATE_SCROLLED_OUT = 1;
    private AccessibilityManager accessibilityManager;
    private int additionalHiddenOffset;

    @Nullable
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private boolean disableOnTouchExploration;
    private int enterAnimDuration;

    @Nullable
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;

    @Nullable
    private TimeInterpolator exitAnimInterpolator;
    private HideViewOnScrollDelegate hideOnScrollViewDelegate;

    @NonNull
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private int size;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationListener;
    private boolean viewEdgeOverride;
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

    public HideViewOnScrollBehavior() {
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.viewEdgeOverride = false;
    }

    private boolean isGravityLeft(int i11) {
        return i11 == 3 || i11 == 19;
    }

    private void setViewEdge(@NonNull V v11, int i11) {
        if (this.viewEdgeOverride) {
            return;
        }
        int i12 = ((CoordinatorLayout.LayoutParams) v11.getLayoutParams()).gravity;
        if (isGravityBottom(i12)) {
            setViewEdgeInternal(1);
        } else {
            setViewEdgeInternal(isGravityLeft(Gravity.getAbsoluteGravity(i12, i11)) ? 2 : 0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        return i11 == 2;
    }

    public void slideIn(@NonNull V v11) {
        slideIn(v11, true);
    }

    public void slideOut(@NonNull V v11) {
        slideOut(v11, true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12920a(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z11) {
        if (hideViewOnScrollBehavior.disableOnTouchExploration && z11 && hideViewOnScrollBehavior.isScrolledOut()) {
            hideViewOnScrollBehavior.slideIn(view);
        }
    }

    private void animateChildTo(@NonNull V v11, int i11, long j11, @NonNull TimeInterpolator timeInterpolator) {
        this.currentAnimator = this.hideOnScrollViewDelegate.getViewTranslationAnimator(v11, i11).setInterpolator(timeInterpolator).setDuration(j11).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    private void disableIfTouchExplorationEnabled(final V v11) {
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(v11.getContext(), AccessibilityManager.class);
        }
        if (this.accessibilityManager == null || this.touchExplorationListener != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.behavior.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z11) {
                HideViewOnScrollBehavior.m12920a(this.f11749a, v11, z11);
            }
        };
        this.touchExplorationListener = touchExplorationStateChangeListener;
        this.accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        v11.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NonNull View view) {
                if (HideViewOnScrollBehavior.this.touchExplorationListener == null || HideViewOnScrollBehavior.this.accessibilityManager == null) {
                    return;
                }
                HideViewOnScrollBehavior.this.accessibilityManager.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.touchExplorationListener);
                HideViewOnScrollBehavior.this.touchExplorationListener = null;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view) {
            }
        });
    }

    private boolean isGravityBottom(int i11) {
        return i11 == 80 || i11 == 81;
    }

    private void setViewEdgeInternal(int i11) {
        HideViewOnScrollDelegate hideViewOnScrollDelegate = this.hideOnScrollViewDelegate;
        if (hideViewOnScrollDelegate == null || hideViewOnScrollDelegate.getViewEdge() != i11) {
            if (i11 == 0) {
                this.hideOnScrollViewDelegate = new HideRightViewOnScrollDelegate();
                return;
            }
            if (i11 == 1) {
                this.hideOnScrollViewDelegate = new HideBottomViewOnScrollDelegate();
                return;
            }
            if (i11 == 2) {
                this.hideOnScrollViewDelegate = new HideLeftViewOnScrollDelegate();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i11 + ". Must be 0, 1 or 2" + C33978va.f72339h);
        }
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

    public boolean isScrolledIn() {
        return this.currentState == 2;
    }

    public boolean isScrolledOut() {
        return this.currentState == 1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        if (i12 > 0) {
            slideOut(v11);
        } else if (i12 < 0) {
            slideIn(v11);
        }
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffset(@NonNull V v11, @Dimension int i11) {
        this.additionalHiddenOffset = i11;
        if (this.currentState == 1) {
            this.hideOnScrollViewDelegate.setAdditionalHiddenOffset(v11, this.size, i11);
        }
    }

    public void slideIn(@NonNull V v11, boolean z11) {
        if (isScrolledIn()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v11.clearAnimation();
        }
        updateCurrentState(v11, 2);
        int targetTranslation = this.hideOnScrollViewDelegate.getTargetTranslation();
        if (z11) {
            animateChildTo(v11, targetTranslation, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            this.hideOnScrollViewDelegate.setViewTranslation(v11, targetTranslation);
        }
    }

    public void slideOut(@NonNull V v11, boolean z11) {
        AccessibilityManager accessibilityManager;
        if (isScrolledOut()) {
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
        int i11 = this.size + this.additionalHiddenOffset;
        if (z11) {
            animateChildTo(v11, i11, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            this.hideOnScrollViewDelegate.setViewTranslation(v11, i11);
        }
    }

    @NonNull
    public static <V extends View> HideViewOnScrollBehavior<V> from(@NonNull V v11) {
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof HideViewOnScrollBehavior) {
                return (HideViewOnScrollBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with HideViewOnScrollBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        disableIfTouchExplorationEnabled(v11);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        setViewEdge(v11, i11);
        this.size = this.hideOnScrollViewDelegate.getSize(v11, marginLayoutParams);
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v11.getContext(), ENTER_ANIM_DURATION_ATTR, DEFAULT_ENTER_ANIMATION_DURATION_MS);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v11.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v11.getContext();
        int i12 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i12, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v11.getContext(), i12, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v11, i11);
    }

    public HideViewOnScrollBehavior(int i11) {
        this();
        setViewEdge(i11);
    }

    public void setViewEdge(int i11) {
        this.viewEdgeOverride = true;
        setViewEdgeInternal(i11);
    }

    public HideViewOnScrollBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.viewEdgeOverride = false;
    }
}
