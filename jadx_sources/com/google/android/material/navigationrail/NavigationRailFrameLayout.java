package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailFrameLayout extends FrameLayout {
    int paddingTop;
    boolean scrollingEnabled;

    public void setPaddingTop(int i11) {
        this.paddingTop = i11;
    }

    public void setScrollingEnabled(boolean z11) {
        this.scrollingEnabled = z11;
    }

    public NavigationRailFrameLayout(@NonNull Context context) {
        super(context);
        this.paddingTop = 0;
        this.scrollingEnabled = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int childCount = getChildCount();
        int measuredHeight = this.paddingTop;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int iMax = Math.max(measuredHeight, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), iMax, childAt.getRight(), childAt.getMeasuredHeight() + iMax);
            measuredHeight = iMax + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int childCount = getChildCount();
        int measuredHeight = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i12);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i11, i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            measuredHeight = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i13 = (size - measuredHeight) - this.paddingTop;
            childAt = getChildAt(1);
            if (!this.scrollingEnabled) {
                i12 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i11, i12);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.paddingTop + measuredHeight + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }
}
