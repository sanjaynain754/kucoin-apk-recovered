package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarMenu extends MenuBuilder {
    public static final int NO_MAX_ITEM_LIMIT = Integer.MAX_VALUE;
    private final int maxItemCount;
    private final boolean subMenuSupported;

    @NonNull
    private final Class<?> viewClass;

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i11, int i12, int i13, @NonNull CharSequence charSequence) {
        if (this.subMenuSupported) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i11, i12, i13, charSequence);
            NavigationBarSubMenu navigationBarSubMenu = new NavigationBarSubMenu(getContext(), this, menuItemImpl);
            menuItemImpl.setSubMenu(navigationBarSubMenu);
            return navigationBarSubMenu;
        }
        throw new UnsupportedOperationException(this.viewClass.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i11, boolean z11) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i11;
        this.subMenuSupported = z11;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public MenuItem addInternal(int i11, int i12, int i13, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i11, i12, i13, charSequence);
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.maxItemCount + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }
}
