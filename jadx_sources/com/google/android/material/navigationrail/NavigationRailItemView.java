package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.C7090R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
final class NavigationRailItemView extends NavigationBarItemView {
    @Override // com.google.android.material.navigation.NavigationBarItemView
    @DimenRes
    public int getItemDefaultMarginResId() {
        return C7090R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @LayoutRes
    public int getItemLayoutResId() {
        return C7090R.layout.mtrl_navigation_rail_item;
    }

    public NavigationRailItemView(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i12) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i12)));
        }
    }
}
