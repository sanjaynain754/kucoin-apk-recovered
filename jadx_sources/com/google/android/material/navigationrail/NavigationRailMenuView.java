package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {

    @Px
    private int itemMinimumHeight;

    @Px
    private int itemSpacing;
    private final FrameLayout.LayoutParams layoutParams;

    private int makeSharedHeightSpec(int i11, int i12, int i13) {
        int iMax = i12 / Math.max(1, i13);
        int size = this.itemMinimumHeight;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i11);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int measureSharedChildHeights(int i11, int i12, int i13, View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 0);
        int childCount = getChildCount();
        int iMeasureChildHeight = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (!(childAt instanceof NavigationBarItemView)) {
                int iMeasureChildHeight2 = measureChildHeight(childAt, i11, iMakeMeasureSpec);
                i12 -= iMeasureChildHeight2;
                iMeasureChildHeight += iMeasureChildHeight2;
            }
        }
        int iMakeSharedHeightSpec = view == null ? makeSharedHeightSpec(i11, Math.max(i12, 0), i13) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() == 0) {
                i15++;
            }
            if ((childAt2 instanceof NavigationBarItemView) && childAt2 != view) {
                iMeasureChildHeight += measureChildHeight(childAt2, i11, iMakeSharedHeightSpec);
            }
        }
        return iMeasureChildHeight + (Math.max(0, i15 - 1) * this.itemSpacing);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    @Px
    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    public void setItemMinimumHeight(@Px int i11) {
        if (this.itemMinimumHeight != i11) {
            this.itemMinimumHeight = i11;
            requestLayout();
        }
    }

    public void setItemSpacing(@Px int i11) {
        if (this.itemSpacing != i11) {
            this.itemSpacing = i11;
            requestLayout();
        }
    }

    public void setMenuGravity(int i11) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i11) {
            layoutParams.gravity = i11;
            setLayoutParams(layoutParams);
        }
    }

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        this.itemSpacing = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int measureChildHeight(View view, int i11, int i12) {
        view.measure(i11, i12);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureShiftingChildHeights(int i11, int i12, int i13) {
        int iMeasureChildHeight;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iMeasureChildHeight = measureChildHeight(childAt, i11, makeSharedHeightSpec(i11, i12, i13));
            i12 -= iMeasureChildHeight;
            i13--;
        } else {
            iMeasureChildHeight = 0;
        }
        return iMeasureChildHeight + measureSharedChildHeights(i11, i12, i13, childAt);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int iMax;
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = 0;
        int measuredHeight = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measuredHeight += childAt.getMeasuredHeight();
                i16++;
            }
        }
        if (i16 <= 1) {
            iMax = 0;
        } else {
            iMax = Math.max(0, Math.min((getMeasuredHeight() - measuredHeight) / (i16 - 1), this.itemSpacing));
        }
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                childAt2.layout(0, i18, i15, measuredHeight2 + i18);
                i18 += measuredHeight2 + iMax;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int iMeasureSharedChildHeights;
        int size = View.MeasureSpec.getSize(i12);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        if (currentVisibleContentItemCount > 1 && isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount)) {
            iMeasureSharedChildHeights = measureShiftingChildHeights(i11, size, currentVisibleContentItemCount);
        } else {
            iMeasureSharedChildHeights = measureSharedChildHeights(i11, size, currentVisibleContentItemCount, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.resolveSizeAndState(iMeasureSharedChildHeights, i12, 0));
    }
}
