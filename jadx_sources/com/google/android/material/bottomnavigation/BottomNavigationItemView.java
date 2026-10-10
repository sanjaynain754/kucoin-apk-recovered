package com.google.android.material.bottomnavigation;

import android.content.Context;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.C7090R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends NavigationBarItemView {
    @Override // com.google.android.material.navigation.NavigationBarItemView
    @DimenRes
    public int getItemDefaultMarginResId() {
        return C7090R.dimen.design_bottom_navigation_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @LayoutRes
    public int getItemLayoutResId() {
        return C7090R.layout.design_bottom_navigation_item;
    }

    public BottomNavigationItemView(@NonNull Context context) {
        super(context);
    }
}
