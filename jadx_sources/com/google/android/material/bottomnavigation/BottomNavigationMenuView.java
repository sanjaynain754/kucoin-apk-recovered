package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.C7090R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        this.itemHorizontalTranslationEnabled = z11;
    }

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(C7090R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(C7090R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(C7090R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(C7090R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int measuredWidth = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i18 = i15 - measuredWidth;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i16);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i16);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int measuredWidth;
        int iMax;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i11);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), Integer.MIN_VALUE);
        int i16 = 1;
        int i17 = 0;
        if (getItemIconGravity() == 0) {
            if (isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount) && isItemHorizontalTranslationEnabled()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int iMax2 = this.activeItemMinWidth;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                if (childAt.getVisibility() != 8) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                int i18 = currentVisibleContentItemCount - i14;
                int iMin = Math.min(size - (this.inactiveItemMinWidth * i18), Math.min(iMax2, this.activeItemMaxWidth));
                int i19 = size - iMin;
                if (i18 != 0) {
                    i16 = i18;
                }
                int iMin2 = Math.min(i19 / i16, this.inactiveItemMaxWidth);
                int i21 = i19 - (i18 * iMin2);
                for (int i22 = 0; i22 < childCount; i22++) {
                    if (getChildAt(i22).getVisibility() != 8) {
                        if (i22 == getSelectedItemPosition()) {
                            i15 = iMin;
                        } else {
                            i15 = iMin2;
                        }
                        if (i21 > 0) {
                            i15++;
                            i21--;
                        }
                    } else {
                        i15 = 0;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i15));
                }
            } else {
                if (currentVisibleContentItemCount != 0) {
                    i16 = currentVisibleContentItemCount;
                }
                int iMin3 = Math.min(size / i16, this.activeItemMaxWidth);
                int i23 = size - (currentVisibleContentItemCount * iMin3);
                for (int i24 = 0; i24 < childCount; i24++) {
                    if (getChildAt(i24).getVisibility() != 8) {
                        if (i23 > 0) {
                            i13 = iMin3 + 1;
                            i23--;
                        } else {
                            i13 = iMin3;
                        }
                    } else {
                        i13 = 0;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i13));
                }
            }
            measuredWidth = 0;
            iMax = 0;
            while (i17 < childCount) {
                View childAt2 = getChildAt(i17);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i17).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    measuredWidth += childAt2.getMeasuredWidth();
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                }
                i17++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f11 = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f11;
            float f12 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f12);
            int iRound2 = Math.round(f11 / f12);
            int measuredWidth2 = 0;
            int iMax3 = 0;
            while (i17 < childCount) {
                View childAt3 = getChildAt(i17);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    measuredWidth2 += childAt3.getMeasuredWidth();
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                }
                i17++;
            }
            measuredWidth = measuredWidth2;
            iMax = iMax3;
        }
        setMeasuredDimension(measuredWidth, Math.max(iMax, getSuggestedMinimumHeight()));
    }
}
