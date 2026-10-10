package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarMenuBuilder {
    private final MenuBuilder menuBuilder;
    private int contentItemCount = 0;
    private int visibleContentItemCount = 0;
    private int visibleMainItemCount = 0;
    private final List<MenuItem> items = new ArrayList();

    public int getContentItemCount() {
        return this.contentItemCount;
    }

    @NonNull
    public MenuItem getItemAt(int i11) {
        return this.items.get(i11);
    }

    public int getVisibleContentItemCount() {
        return this.visibleContentItemCount;
    }

    public int getVisibleMainContentItemCount() {
        return this.visibleMainItemCount;
    }

    public boolean performItemAction(@NonNull MenuItem menuItem, @NonNull MenuPresenter menuPresenter, int i11) {
        return this.menuBuilder.performItemAction(menuItem, menuPresenter, i11);
    }

    public void refreshItems() {
        this.items.clear();
        this.contentItemCount = 0;
        this.visibleContentItemCount = 0;
        this.visibleMainItemCount = 0;
        for (int i11 = 0; i11 < this.menuBuilder.size(); i11++) {
            MenuItem item = this.menuBuilder.getItem(i11);
            if (item.hasSubMenu()) {
                if (!this.items.isEmpty()) {
                    List<MenuItem> list = this.items;
                    if (!(list.get(list.size() - 1) instanceof DividerMenuItem) && item.isVisible()) {
                        this.items.add(new DividerMenuItem());
                    }
                }
                this.items.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i12 = 0; i12 < subMenu.size(); i12++) {
                    MenuItem item2 = subMenu.getItem(i12);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.items.add(item2);
                    this.contentItemCount++;
                    if (item2.isVisible()) {
                        this.visibleContentItemCount++;
                    }
                }
                this.items.add(new DividerMenuItem());
            } else {
                this.items.add(item);
                this.contentItemCount++;
                if (item.isVisible()) {
                    this.visibleContentItemCount++;
                    this.visibleMainItemCount++;
                }
            }
        }
        if (this.items.isEmpty()) {
            return;
        }
        List<MenuItem> list2 = this.items;
        if (list2.get(list2.size() - 1) instanceof DividerMenuItem) {
            List<MenuItem> list3 = this.items;
            list3.remove(list3.size() - 1);
        }
    }

    public int size() {
        return this.items.size();
    }

    public NavigationBarMenuBuilder(MenuBuilder menuBuilder) {
        this.menuBuilder = menuBuilder;
        refreshItems();
    }
}
