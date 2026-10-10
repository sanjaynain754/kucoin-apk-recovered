package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    @Nullable
    public abstract View findFirstDependency(List<View> list);

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    private static int resolveGravity(int i11) {
        if (i11 == 0) {
            return 8388659;
        }
        return i11;
    }

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i11 = this.overlayTop;
        return MathUtils.clamp((int) (overlapRatioForOffset * i11), 0, i11);
    }

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public final void setOverlayTop(int i11) {
        this.overlayTop = i11;
    }

    public int getScrollRange(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
        View viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (viewFindFirstDependency != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + viewFindFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.tempRect2;
            Gravity.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i11);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i11);
        this.verticalLayoutGap = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13, int i14) {
        View viewFindFirstDependency;
        int i15;
        WindowInsetsCompat lastWindowInsets;
        int i16 = view.getLayoutParams().height;
        if ((i16 == -1 || i16 == -2) && (viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) != null) {
            int size = View.MeasureSpec.getSize(i13);
            if (size > 0) {
                if (viewFindFirstDependency.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int scrollRange = size + getScrollRange(viewFindFirstDependency);
            int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
            if (shouldHeaderOverlapScrollingChild()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                scrollRange -= measuredHeight;
            }
            if (i16 == -1) {
                i15 = 1073741824;
            } else {
                i15 = Integer.MIN_VALUE;
            }
            coordinatorLayout.onMeasureChild(view, i11, i12, View.MeasureSpec.makeMeasureSpec(scrollRange, i15), i14);
            return true;
        }
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}
