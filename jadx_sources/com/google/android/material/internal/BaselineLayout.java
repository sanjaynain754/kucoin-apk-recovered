package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes45.dex */
public class BaselineLayout extends ViewGroup {
    private int baseline;
    private boolean measurePaddingFromBaseline;

    public BaselineLayout(Context context) {
        super(context, null, 0);
        this.baseline = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.baseline;
    }

    public void setMeasurePaddingFromBaseline(boolean z11) {
        this.measurePaddingFromBaseline = z11;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.baseline = -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int baseline;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i13 - i11) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.baseline != -1 && childAt.getBaseline() != -1) {
                    baseline = (this.baseline + paddingTop) - childAt.getBaseline();
                } else {
                    baseline = paddingTop;
                }
                childAt.layout(i16, baseline, measuredWidth + i16, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int childCount = getChildCount();
        int iMax = 0;
        int paddingBottom = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i11, i12);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = Math.max(iMax3, baseline);
                    iMax4 = Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                paddingBottom = Math.max(paddingBottom, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            if (this.measurePaddingFromBaseline) {
                paddingBottom = Math.max(paddingBottom, Math.max(iMax4, getPaddingBottom()) + iMax3);
            }
            this.baseline = iMax3;
        }
        if (!this.measurePaddingFromBaseline) {
            paddingBottom = iMax + getPaddingBottom();
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i11, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i12, iCombineMeasuredStates << 16));
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.baseline = -1;
    }
}
