package com.google.android.material.navigation;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarSubMenu extends SubMenuBuilder {
    public NavigationBarSubMenu(@NonNull Context context, @NonNull NavigationBarMenu navigationBarMenu, @NonNull MenuItemImpl menuItemImpl) {
        super(context, navigationBarMenu, menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void onItemsChanged(boolean z11) {
        super.onItemsChanged(z11);
        ((MenuBuilder) getParentMenu()).onItemsChanged(z11);
    }
}
