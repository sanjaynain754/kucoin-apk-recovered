package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.C7090R;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes45.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_BottomSheet_DragHandle;

    @Nullable
    private final AccessibilityManager accessibilityManager;

    @Nullable
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private final GestureDetector gestureDetector;
    private final GestureDetector.OnGestureListener gestureListener;
    private boolean hasClickListener;
    private boolean hasTouchListener;

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private BottomSheetBehavior<?> findParentBottomSheetBehavior() {
        View parentView = this;
        while (true) {
            parentView = getParentView(parentView);
            if (parentView == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = parentView.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) behavior;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBottomSheetStateChanged(int i11) {
        if (i11 == 4) {
            this.clickToExpand = true;
        } else if (i11 == 3) {
            this.clickToExpand = false;
        }
        ViewCompat.replaceAccessibilityAction(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, this.clickToExpand ? this.clickToExpandActionLabel : this.clickToCollapseActionLabel, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.c
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return this.f11752a.expandOrCollapseBottomSheetIfPossible();
            }
        });
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.bottomSheetDragHandleStyle);
    }

    private boolean hasAttachedBehavior() {
        return this.bottomSheetBehavior != null;
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.bottomSheetCallback);
            this.bottomSheetBehavior.setAccessibilityDelegateView(null);
            this.bottomSheetBehavior.setDragHandleView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            this.bottomSheetBehavior.setDragHandleView(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.getState());
            this.bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
        setClickable(hasAttachedBehavior());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.hasClickListener || this.hasTouchListener) ? super.onTouchEvent(motionEvent) : this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.hasClickListener = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.hasTouchListener = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, DEF_STYLE_RES), attributeSet, i11);
        this.hasTouchListener = false;
        this.hasClickListener = false;
        this.clickToExpandActionLabel = getResources().getString(C7090R.string.bottomsheet_action_expand);
        this.clickToCollapseActionLabel = getResources().getString(C7090R.string.bottomsheet_action_collapse);
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(@NonNull View view, int i12) {
                BottomSheetDragHandleView.this.onBottomSheetStateChanged(i12);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(@NonNull View view, float f11) {
            }
        };
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(@NonNull MotionEvent motionEvent) {
                if (BottomSheetDragHandleView.this.bottomSheetBehavior == null || !BottomSheetDragHandleView.this.bottomSheetBehavior.isHideable()) {
                    return super.onDoubleTap(motionEvent);
                }
                BottomSheetDragHandleView.this.bottomSheetBehavior.setState(5);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NonNull MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.isClickable();
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
            }
        };
        this.gestureListener = simpleOnGestureListener;
        Context context2 = getContext();
        this.gestureDetector = new GestureDetector(context2, simpleOnGestureListener, new Handler(Looper.getMainLooper()));
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean expandOrCollapseBottomSheetIfPossible() {
        boolean z11 = false;
        if (!hasAttachedBehavior()) {
            return false;
        }
        if (!this.bottomSheetBehavior.isFitToContents() && !this.bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
            z11 = true;
        }
        int state = this.bottomSheetBehavior.getState();
        int i11 = 6;
        int i12 = 3;
        if (state == 4) {
            if (!z11) {
                i11 = i12;
            }
        } else if (state == 3) {
            if (!z11) {
                i11 = 4;
            }
        } else {
            if (!this.clickToExpand) {
                i12 = 4;
            }
            i11 = i12;
        }
        this.bottomSheetBehavior.setState(i11);
        return true;
    }

    @Nullable
    private static View getParentView(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.accessibilityManager.isEnabled());
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z11) {
    }
}
