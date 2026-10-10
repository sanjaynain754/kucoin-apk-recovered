package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.C7090R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuPresenter implements MenuPresenter {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private MenuPresenter.Callback callback;

    @Px
    int dividerInsetEnd;

    @Px
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;

    /* JADX INFO: renamed from: id */
    private int f11850id;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;

    @Px
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    MenuBuilder menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;

    @Nullable
    ColorStateList subheaderColor;

    @Px
    int subheaderInsetEnd;

    @Px
    int subheaderInsetStart;
    ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean textAppearanceActiveBoldEnabled = true;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z11 = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean zPerformItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z11 = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z11) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    public class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private MenuItemImpl checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i11) {
            int i12 = i11;
            for (int i13 = 0; i13 < i11; i13++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i13) == 2 || NavigationMenuPresenter.this.adapter.getItemViewType(i13) == 3) {
                    i12--;
                }
            }
            return i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllDividerMenuItems() {
            for (int i11 = 0; i11 < this.items.size(); i11++) {
                if (this.items.get(i11) instanceof NavigationMenuSeparatorItem) {
                    notifyItemChanged(i11);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllSubHeaderMenuItems() {
            for (int i11 = 0; i11 < this.items.size(); i11++) {
                if ((this.items.get(i11) instanceof NavigationMenuTextItem) && getItemViewType(i11) == 1) {
                    notifyItemChanged(i11);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllTextMenuItems() {
            for (int i11 = 0; i11 < this.items.size(); i11++) {
                if ((this.items.get(i11) instanceof NavigationMenuTextItem) && getItemViewType(i11) == 0) {
                    notifyItemChanged(i11);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        public int getRowCount() {
            int i11 = 0;
            for (int i12 = 0; i12 < NavigationMenuPresenter.this.adapter.getItemCount(); i12++) {
                int itemViewType = NavigationMenuPresenter.this.adapter.getItemViewType(i12);
                if (itemViewType == 0 || itemViewType == 1) {
                    i11++;
                }
            }
            return i11;
        }

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        private void appendTransparentIconIfMissing(int i11, int i12) {
            while (i11 < i12) {
                ((NavigationMenuTextItem) this.items.get(i11)).needsEmptyIcon = true;
                i11++;
            }
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i11 = -1;
            boolean z11 = false;
            int size2 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                MenuItemImpl menuItemImpl = NavigationMenuPresenter.this.menu.getVisibleItems().get(i12);
                if (menuItemImpl.isChecked()) {
                    setCheckedItem(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.setExclusiveCheckable(false);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i12 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(menuItemImpl));
                        int size3 = this.items.size();
                        int size4 = subMenu.size();
                        boolean z12 = false;
                        for (int i13 = 0; i13 < size4; i13++) {
                            MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i13);
                            if (menuItemImpl2.isVisible()) {
                                if (!z12 && menuItemImpl2.getIcon() != null) {
                                    z12 = true;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.setExclusiveCheckable(false);
                                }
                                if (menuItemImpl2.isChecked()) {
                                    setCheckedItem(menuItemImpl2);
                                }
                                this.items.add(new NavigationMenuTextItem(menuItemImpl2));
                            }
                        }
                        if (z12) {
                            appendTransparentIconIfMissing(size3, this.items.size());
                        }
                    }
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i11) {
                        size2 = this.items.size();
                        z11 = menuItemImpl.getIcon() != null;
                        if (i12 != 0) {
                            size2++;
                            ArrayList<NavigationMenuItem> arrayList = this.items;
                            int i14 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i14, i14));
                        }
                    } else if (!z11 && menuItemImpl.getIcon() != null) {
                        appendTransparentIconIfMissing(size2, this.items.size());
                        z11 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(menuItemImpl);
                    navigationMenuTextItem.needsEmptyIcon = z11;
                    this.items.add(navigationMenuTextItem);
                    i11 = groupId;
                }
            }
            this.updateSuspended = false;
        }

        private void setAccessibilityDelegate(View view, final int i11, final boolean z11) {
            ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(@NonNull View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i11), 1, 1, 1, z11, view2.isSelected()));
                }
            });
        }

        @NonNull
        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.checkedItem;
            if (menuItemImpl != null) {
                bundle.putInt(STATE_CHECKED_ITEM, menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i11 = 0; i11 < size; i11++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i11);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    MenuItemImpl menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public MenuItemImpl getCheckedItem() {
            return this.checkedItem;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i11) {
            NavigationMenuItem navigationMenuItem = this.items.get(i11);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i11) {
            int itemViewType = getItemViewType(i11);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i11);
                    viewHolder.itemView.setPaddingRelative(NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.items.get(i11)).getMenuItem().getTitle());
                TextViewCompat.setTextAppearance(textView, NavigationMenuPresenter.this.subheaderTextAppearance);
                textView.setPaddingRelative(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i11, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.textAppearance);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i11);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i12 = navigationMenuPresenter.itemHorizontalPadding;
            int i13 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i12, i13, i12, i13);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), NavigationMenuPresenter.this.textAppearanceActiveBoldEnabled);
            setAccessibilityDelegate(navigationMenuItemView, i11, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
            if (i11 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            }
            if (i11 == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i11 == 2) {
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i11 != 3) {
                return null;
            }
            return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }

        public void restoreInstanceState(@NonNull Bundle bundle) {
            MenuItemImpl menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl menuItem2;
            int i11 = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i11 != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                for (int i12 = 0; i12 < size; i12++) {
                    NavigationMenuItem navigationMenuItem = this.items.get(i12);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i11) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i13);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
            if (this.checkedItem == menuItemImpl || !menuItemImpl.isCheckable()) {
                return;
            }
            MenuItemImpl menuItemImpl2 = this.checkedItem;
            if (menuItemImpl2 != null) {
                menuItemImpl2.setChecked(false);
            }
            this.checkedItem = menuItemImpl;
            menuItemImpl.setChecked(true);
        }

        public void setUpdateSuspended(boolean z11) {
            this.updateSuspended = z11;
        }

        public void update() {
            int size = this.items.size();
            prepareMenuItems();
            notifyDataSetChanged();
            if (size == this.items.size()) {
                notifyItemRangeChanged(0, this.items.size());
            }
        }
    }

    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }

        public NavigationMenuSeparatorItem(int i11, int i12) {
            this.paddingTop = i11;
            this.paddingBottom = i12;
        }
    }

    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final MenuItemImpl menuItem;
        boolean needsEmptyIcon;

        public MenuItemImpl getMenuItem() {
            return this.menuItem;
        }

        public NavigationMenuTextItem(MenuItemImpl menuItemImpl) {
            this.menuItem = menuItemImpl;
        }
    }

    public class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        public NavigationMenuViewAccessibilityDelegate(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(NavigationMenuPresenter.this.adapter.getRowCount(), 1, false));
        }
    }

    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C7090R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C7090R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C7090R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private void updateAllDividerMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllDividerMenuItems();
        }
    }

    private void updateAllSubHeaderMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllSubHeaderMenuItems();
        }
    }

    private void updateAllTextMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllTextMenuItems();
        }
    }

    public void addHeaderView(@NonNull View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Nullable
    public MenuItemImpl getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    @Px
    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i11) {
        return this.headerLayout.getChildAt(i11);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f11850id;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    @Nullable
    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(C7090R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.adapter = navigationMenuAdapter;
                navigationMenuAdapter.setHasStableIds(true);
            }
            int i11 = this.overScrollMode;
            if (i11 != -1) {
                this.menuView.setOverScrollMode(i11);
            }
            LinearLayout linearLayout = (LinearLayout) this.layoutInflater.inflate(C7090R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.headerLayout = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(@LayoutRes int i11) {
        View viewInflate = this.layoutInflater.inflate(i11, (ViewGroup) this.headerLayout, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z11) {
        MenuPresenter.Callback callback = this.callback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    public void removeHeaderView(@NonNull View view) {
        this.headerLayout.removeView(view);
        if (hasHeader()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBehindStatusBar(boolean z11) {
        if (this.isBehindStatusBar != z11) {
            this.isBehindStatusBar = z11;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.callback = callback;
    }

    public void setCheckedItem(@NonNull MenuItemImpl menuItemImpl) {
        this.adapter.setCheckedItem(menuItemImpl);
    }

    public void setDividerInsetEnd(@Px int i11) {
        this.dividerInsetEnd = i11;
        updateAllDividerMenuItems();
    }

    public void setDividerInsetStart(@Px int i11) {
        this.dividerInsetStart = i11;
        updateAllDividerMenuItems();
    }

    public void setId(int i11) {
        this.f11850id = i11;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.itemBackground = drawable;
        updateAllTextMenuItems();
    }

    public void setItemForeground(@Nullable RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateAllTextMenuItems();
    }

    public void setItemHorizontalPadding(int i11) {
        this.itemHorizontalPadding = i11;
        updateAllTextMenuItems();
    }

    public void setItemIconPadding(int i11) {
        this.itemIconPadding = i11;
        updateAllTextMenuItems();
    }

    public void setItemIconSize(@Dimension int i11) {
        if (this.itemIconSize != i11) {
            this.itemIconSize = i11;
            this.hasCustomItemIconSize = true;
            updateAllTextMenuItems();
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateAllTextMenuItems();
    }

    public void setItemMaxLines(int i11) {
        this.itemMaxLines = i11;
        updateAllTextMenuItems();
    }

    public void setItemTextAppearance(@StyleRes int i11) {
        this.textAppearance = i11;
        updateAllTextMenuItems();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.textAppearanceActiveBoldEnabled = z11;
        updateAllTextMenuItems();
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateAllTextMenuItems();
    }

    public void setItemVerticalPadding(@Px int i11) {
        this.itemVerticalPadding = i11;
        updateAllTextMenuItems();
    }

    public void setOverScrollMode(int i11) {
        this.overScrollMode = i11;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i11);
        }
    }

    public void setSubheaderColor(@Nullable ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderInsetEnd(@Px int i11) {
        this.subheaderInsetEnd = i11;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderInsetStart(@Px int i11) {
        this.subheaderInsetStart = i11;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderTextAppearance(@StyleRes int i11) {
        this.subheaderTextAppearance = i11;
        updateAllSubHeaderMenuItems();
    }

    public void setUpdateSuspended(boolean z11) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z11);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z11) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }

    private boolean hasHeader() {
        if (getHeaderCount() > 0) {
            return true;
        }
        return false;
    }

    private void updateTopPadding() {
        int i11;
        if (!hasHeader() && this.isBehindStatusBar) {
            i11 = this.paddingTopDefault;
        } else {
            i11 = 0;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i11, 0, navigationMenuView.getPaddingBottom());
    }

    public void dispatchApplyWindowInsets(@NonNull WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.paddingTopDefault != systemWindowInsetTop) {
            this.paddingTopDefault = systemWindowInsetTop;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.headerLayout, windowInsetsCompat);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = menuBuilder;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(C7090R.dimen.design_navigation_separator_vertical_padding);
    }
}
