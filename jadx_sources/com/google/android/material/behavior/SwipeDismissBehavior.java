package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* JADX INFO: loaded from: classes45.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    ViewDragHelper viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@NonNull View view, float f11) {
            if (f11 == 0.0f) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z11 = view.getLayoutDirection() == 1;
            int i11 = SwipeDismissBehavior.this.swipeDirection;
            if (i11 == 2) {
                return true;
            }
            if (i11 == 0) {
                if (z11) {
                    return f11 < 0.0f;
                }
                return f11 > 0.0f;
            }
            if (i11 == 1) {
                if (z11) {
                    return f11 > 0.0f;
                }
                if (f11 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(@NonNull View view, float f11, float f12) {
            int i11;
            boolean z11;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f11)) {
                if (f11 >= 0.0f) {
                    int left = view.getLeft();
                    int i12 = this.originalCapturedViewLeft;
                    if (left < i12) {
                        i11 = this.originalCapturedViewLeft - width;
                    } else {
                        i11 = i12 + width;
                    }
                } else {
                    i11 = this.originalCapturedViewLeft - width;
                }
                z11 = true;
            } else {
                i11 = this.originalCapturedViewLeft;
                z11 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.settleCapturedViewAt(i11, view.getTop())) {
                view.postOnAnimation(new SettleRunnable(view, z11));
            } else {
                if (!z11 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(@NonNull View view, int i11) {
            this.activePointerId = i11;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i11) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i11);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i11) {
            int i12 = this.activePointerId;
            return (i12 == -1 || i12 == i11) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
            boolean z11;
            int width;
            int width2;
            int width3;
            if (view.getLayoutDirection() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i13 = SwipeDismissBehavior.this.swipeDirection;
            if (i13 == 0) {
                if (z11) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i13 == 1) {
                if (z11) {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                }
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i11, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float fAbs = Math.abs(i11 - this.originalCapturedViewLeft);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, fAbs), 1.0f));
            }
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i11);
    }

    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z11) {
            this.view = view;
            this.dismiss = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.viewDragHelper;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                this.view.postOnAnimation(this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f11, float f12, float f13) {
        return Math.min(Math.max(f11, f12), f13);
    }

    public static float fraction(float f11, float f12, float f13) {
        return (f13 - f11) / (f12 - f11);
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public void setDragDismissDistance(float f11) {
        this.dragDismissThreshold = clamp(0.0f, f11, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f11) {
        this.alphaEndSwipeDistance = clamp(0.0f, f11, 1.0f);
    }

    public void setStartAlphaSwipeDistance(float f11) {
        this.alphaStartSwipeDistance = clamp(0.0f, f11, 1.0f);
    }

    public static int clamp(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i12), i13);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? ViewDragHelper.create(viewGroup, this.sensitivity, this.dragCallback) : ViewDragHelper.create(viewGroup, this.dragCallback);
        }
    }

    private void updateAccessibilityActions(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(@NonNull View view2, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    boolean z11 = view2.getLayoutDirection() == 1;
                    int i11 = SwipeDismissBehavior.this.swipeDirection;
                    ViewCompat.offsetLeftAndRight(view2, (!(i11 == 0 && z11) && (i11 != 1 || z11)) ? view2.getWidth() : -view2.getWidth());
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v11, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (zIsPointInChildBounds) {
            ensureViewDragHelper(coordinatorLayout);
            if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f11) {
        this.sensitivity = f11;
        this.sensitivitySet = true;
    }

    public void setSwipeDirection(int i11) {
        this.swipeDirection = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v11, i11);
        if (v11.getImportantForAccessibility() == 0) {
            v11.setImportantForAccessibility(1);
            updateAccessibilityActions(v11);
        }
        return zOnLayoutChild;
    }
}
