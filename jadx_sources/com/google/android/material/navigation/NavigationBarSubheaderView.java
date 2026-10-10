package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarSubheaderView extends FrameLayout implements NavigationBarMenuItemView {
    private boolean expanded;

    @Nullable
    private MenuItemImpl itemData;
    boolean onlyShowWhenExpanded;
    private final TextView subheaderLabel;

    @Nullable
    private ColorStateList textColor;

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return false;
    }

    private void updateVisibility() {
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setVisibility((!menuItemImpl.isVisible() || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i11) {
        this.itemData = menuItemImpl;
        menuItemImpl.setCheckable(false);
        this.subheaderLabel.setText(menuItemImpl.getTitle());
        updateVisibility();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isExpanded() {
        return this.expanded;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z11) {
        this.expanded = z11;
        updateVisibility();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z11) {
        this.onlyShowWhenExpanded = z11;
        updateVisibility();
    }

    public void setTextAppearance(@StyleRes int i11) {
        TextViewCompat.setTextAppearance(this.subheaderLabel, i11);
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            this.subheaderLabel.setTextColor(colorStateList);
        }
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
        if (colorStateList != null) {
            this.subheaderLabel.setTextColor(colorStateList);
        }
    }

    public NavigationBarSubheaderView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C7090R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.subheaderLabel = (TextView) findViewById(C7090R.id.navigation_menu_subheader_label);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z11) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z11) {
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z11) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z11, char c11) {
    }
}
