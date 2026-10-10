package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getMeasuredDimension(int i11, int i12, int i13) {
        if (i12 != Integer.MIN_VALUE) {
            return i12 != 1073741824 ? i13 : i11;
        }
        return Math.min(i13, i11);
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getLineSpacing() {
        return this.lineSpacing;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(@NonNull View view) {
        Object tag = view.getTag(C7090R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        boolean z12 = true;
        this.rowCount = 1;
        boolean z13 = getLayoutDirection() == 1;
        int paddingRight = z13 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z13 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i15 = 0;
        int measuredWidth = paddingRight;
        int i16 = paddingTop;
        while (i15 < getChildCount()) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C7090R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                int i17 = i13 - i11;
                int i18 = i17 - paddingLeft;
                if (!this.singleLine && measuredWidth2 > i18) {
                    measuredWidth2 = paddingRight + marginStart + childAt.getMeasuredWidth();
                    i16 = paddingTop + this.lineSpacing;
                    this.rowCount++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(C7090R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (z13) {
                    childAt.layout(i17 - measuredWidth2, i16, (i17 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i16, measuredWidth2, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.itemSpacing;
                paddingTop = measuredHeight;
            }
            i15++;
            z12 = z12;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i11, i12);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin;
                    i14 = marginLayoutParams.rightMargin;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i19 = paddingLeft2;
                if (paddingLeft2 + i13 + childAt.getMeasuredWidth() <= paddingRight || isSingleLine()) {
                    paddingLeft = i19;
                } else {
                    paddingLeft = getPaddingLeft();
                    i16 = this.lineSpacing + paddingTop;
                }
                int measuredWidth = paddingLeft + i13 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i13 + i14 + childAt.getMeasuredWidth() + this.itemSpacing;
                if (i18 == getChildCount() - 1) {
                    i17 += i14;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, i17 + getPaddingRight()), getMeasuredDimension(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i11) {
        this.itemSpacing = i11;
    }

    public void setLineSpacing(int i11) {
        this.lineSpacing = i11;
    }

    public void setSingleLine(boolean z11) {
        this.singleLine = z11;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    private void loadFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7090R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.FlowLayout_horizontalItemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
