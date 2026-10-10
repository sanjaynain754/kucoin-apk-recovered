package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class FlexboxItemDecoration extends RecyclerView.ItemDecoration {
    public static final int BOTH = 3;
    public static final int HORIZONTAL = 1;
    private static final int[] LIST_DIVIDER_ATTRS = {android.R.attr.listDivider};
    public static final int VERTICAL = 2;
    private Drawable mDrawable;
    private int mOrientation;

    private boolean needsHorizontalDecoration() {
        return (this.mOrientation & 1) > 0;
    }

    private boolean needsVerticalDecoration() {
        return (this.mOrientation & 2) > 0;
    }

    public void setDrawable(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.mDrawable = drawable;
    }

    public void setOrientation(int i11) {
        this.mOrientation = i11;
    }

    public FlexboxItemDecoration(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(LIST_DIVIDER_ATTRS);
        this.mDrawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(3);
    }

    private void drawHorizontalDecorations(Canvas canvas, RecyclerView recyclerView) {
        int top;
        int intrinsicHeight;
        int left;
        int right;
        int i11;
        int iMin;
        int left2;
        if (needsHorizontalDecoration()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int right2 = recyclerView.getRight() + recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexDirection == 3) {
                    intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    top = this.mDrawable.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    intrinsicHeight = top - this.mDrawable.getIntrinsicHeight();
                }
                if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                    if (flexboxLayoutManager.isLayoutRtl()) {
                        iMin = Math.min(childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + this.mDrawable.getIntrinsicWidth(), right2);
                        left2 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    } else {
                        left = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDrawable.getIntrinsicWidth(), left3);
                        right = childAt.getRight();
                        i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    }
                    this.mDrawable.setBounds(left2, intrinsicHeight, iMin, top);
                    this.mDrawable.draw(canvas);
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    right = childAt.getRight();
                    i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                int i13 = left;
                iMin = right + i11;
                left2 = i13;
                this.mDrawable.setBounds(left2, intrinsicHeight, iMin, top);
                this.mDrawable.draw(canvas);
            }
        }
    }

    private void drawVerticalDecorations(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        int iMax;
        int bottom;
        int i11;
        int i12;
        if (needsVerticalDecoration()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top = recyclerView.getTop() - recyclerView.getPaddingTop();
            int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = recyclerView.getChildAt(i13);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexboxLayoutManager.isLayoutRtl()) {
                    intrinsicWidth = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    left = this.mDrawable.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    intrinsicWidth = left - this.mDrawable.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                    iMax = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    bottom = childAt.getBottom();
                    i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                } else {
                    if (flexDirection == 3) {
                        int iMin = Math.min(childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + this.mDrawable.getIntrinsicHeight(), bottom2);
                        iMax = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        i12 = iMin;
                    } else {
                        iMax = Math.max((childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDrawable.getIntrinsicHeight(), top);
                        bottom = childAt.getBottom();
                        i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    this.mDrawable.setBounds(intrinsicWidth, iMax, left, i12);
                    this.mDrawable.draw(canvas);
                }
                i12 = bottom + i11;
                this.mDrawable.setBounds(intrinsicWidth, iMax, left, i12);
                this.mDrawable.draw(canvas);
            }
        }
    }

    private boolean isFirstItemInLine(int i11, List<FlexLine> list, FlexboxLayoutManager flexboxLayoutManager) {
        int positionToFlexLineIndex = flexboxLayoutManager.getPositionToFlexLineIndex(i11);
        if ((positionToFlexLineIndex != -1 && positionToFlexLineIndex < flexboxLayoutManager.getFlexLinesInternal().size() && flexboxLayoutManager.getFlexLinesInternal().get(positionToFlexLineIndex).mFirstIndex == i11) || i11 == 0) {
            return true;
        }
        if (list.size() != 0 && list.get(list.size() - 1).mLastIndex == i11 - 1) {
            return true;
        }
        return false;
    }

    private void setOffsetAlongCrossAxis(Rect rect, int i11, FlexboxLayoutManager flexboxLayoutManager, List<FlexLine> list) {
        if (list.size() != 0 && flexboxLayoutManager.getPositionToFlexLineIndex(i11) != 0) {
            if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                if (!needsHorizontalDecoration()) {
                    rect.top = 0;
                    rect.bottom = 0;
                    return;
                } else {
                    rect.top = this.mDrawable.getIntrinsicHeight();
                    rect.bottom = 0;
                    return;
                }
            }
            if (!needsVerticalDecoration()) {
                return;
            }
            if (flexboxLayoutManager.isLayoutRtl()) {
                rect.right = this.mDrawable.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.mDrawable.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    private void setOffsetAlongMainAxis(Rect rect, int i11, FlexboxLayoutManager flexboxLayoutManager, List<FlexLine> list, int i12) {
        if (isFirstItemInLine(i11, list, flexboxLayoutManager)) {
            return;
        }
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            if (!needsVerticalDecoration()) {
                rect.left = 0;
                rect.right = 0;
                return;
            } else if (flexboxLayoutManager.isLayoutRtl()) {
                rect.right = this.mDrawable.getIntrinsicWidth();
                rect.left = 0;
                return;
            } else {
                rect.left = this.mDrawable.getIntrinsicWidth();
                rect.right = 0;
                return;
            }
        }
        if (!needsHorizontalDecoration()) {
            rect.top = 0;
            rect.bottom = 0;
        } else if (i12 == 3) {
            rect.bottom = this.mDrawable.getIntrinsicHeight();
            rect.top = 0;
        } else {
            rect.top = this.mDrawable.getIntrinsicHeight();
            rect.bottom = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        if (!needsHorizontalDecoration() && !needsVerticalDecoration()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<FlexLine> flexLines = flexboxLayoutManager.getFlexLines();
        setOffsetAlongMainAxis(rect, childAdapterPosition, flexboxLayoutManager, flexLines, flexboxLayoutManager.getFlexDirection());
        setOffsetAlongCrossAxis(rect, childAdapterPosition, flexboxLayoutManager, flexLines);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        drawHorizontalDecorations(canvas, recyclerView);
        drawVerticalDecorations(canvas, recyclerView);
    }
}
