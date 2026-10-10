package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;

/* JADX INFO: loaded from: classes45.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;

    @Nullable
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;

    @Nullable
    private VelocityTracker velocityTracker;

    public class FlingRunnable implements Runnable {
        private final V layout;
        private final CoordinatorLayout parent;

        public FlingRunnable(CoordinatorLayout coordinatorLayout, V v11) {
            this.parent = coordinatorLayout;
            this.layout = v11;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.layout == null || (overScroller = HeaderBehavior.this.scroller) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
            this.layout.postOnAnimation(this);
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public boolean canDragView(V v11) {
        return false;
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        return setHeaderTopBottomOffset(coordinatorLayout, v11, i11, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    public final boolean fling(CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, float f11) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v11.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v11.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f11), 0, 0, i11, i12);
        if (!this.scroller.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v11);
            return false;
        }
        FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v11);
        this.flingRunnable = flingRunnable;
        v11.postOnAnimation(flingRunnable);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i11 = this.activePointerId;
            if (i11 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i11)) == -1) {
                return false;
            }
            int y11 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y11 - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y11;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x11 = (int) motionEvent.getX();
            int y12 = (int) motionEvent.getY();
            boolean z11 = canDragView(v11) && coordinatorLayout.isPointInChildBounds(v11, x11, y12);
            this.isBeingDragged = z11;
            if (z11) {
                this.lastMotionY = y12;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13) {
        int iClamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i12 == 0 || topAndBottomOffset < i12 || topAndBottomOffset > i13 || topAndBottomOffset == (iClamp = MathUtils.clamp(i11, i12, i13))) {
            return 0;
        }
        setTopAndBottomOffset(iClamp);
        return topAndBottomOffset - iClamp;
    }

    public int getMaxDragOffset(@NonNull V v11) {
        return -v11.getHeight();
    }

    public int getScrollRangeForDragFling(@NonNull V v11) {
        return v11.getHeight();
    }

    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        boolean z11;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        this.activePointerId = motionEvent.getPointerId(i11);
                        this.lastMotionY = (int) (motionEvent.getY(i11) + 0.5f);
                    }
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y11 = (int) motionEvent.getY(iFindPointerIndex);
                int i12 = this.lastMotionY - y11;
                this.lastMotionY = y11;
                scroll(coordinatorLayout, v11, i12, getMaxDragOffset(v11), 0);
            }
            z11 = false;
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (!this.isBeingDragged || z11) {
                return true;
            }
            return false;
        }
        VelocityTracker velocityTracker3 = this.velocityTracker;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.velocityTracker.computeCurrentVelocity(1000);
            fling(coordinatorLayout, v11, -getScrollRangeForDragFling(v11), 0, this.velocityTracker.getYVelocity(this.activePointerId));
            z11 = true;
        }
        this.isBeingDragged = false;
        this.activePointerId = -1;
        velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (!this.isBeingDragged) {
        }
        return true;
        z11 = false;
        this.isBeingDragged = false;
        this.activePointerId = -1;
        velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (!this.isBeingDragged) {
        }
        return true;
    }

    public final int scroll(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13) {
        return setHeaderTopBottomOffset(coordinatorLayout, v11, getTopBottomOffsetForScrollingSibling() - i11, i12, i13);
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public void onFlingFinished(CoordinatorLayout coordinatorLayout, V v11) {
    }
}
