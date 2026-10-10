package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    private static final int DEFAULT_COLLAPSED_MAX_COUNT = 7;
    private static final int NO_PADDING = -1;
    private static final int NO_SELECTED_ITEM = -1;

    @NonNull
    private final SparseArray<BadgeDrawable> badgeDrawables;

    @Nullable
    private NavigationBarMenuItemView[] buttons;
    private MenuItem checkedItem;
    private int collapsedMaxItemCount;
    private boolean dividersEnabled;
    private boolean expanded;

    @StyleRes
    private int horizontalItemTextAppearanceActive;

    @StyleRes
    private int horizontalItemTextAppearanceInactive;
    private int iconLabelHorizontalSpacing;
    private ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorExpandedHeight;
    private int itemActiveIndicatorExpandedMarginHorizontal;
    private final Rect itemActiveIndicatorExpandedPadding;
    private int itemActiveIndicatorExpandedWidth;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorLabelPadding;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private ShapeAppearanceModel itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private int itemGravity;
    private int itemIconGravity;

    @Dimension
    private int itemIconSize;

    @Nullable
    private ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;

    @Nullable
    private Pools.Pool<NavigationBarItemView> itemPool;
    private int itemPoolSize;

    @Nullable
    private ColorStateList itemRippleColor;

    @StyleRes
    private int itemTextAppearanceActive;
    private boolean itemTextAppearanceActiveBoldEnabled;

    @StyleRes
    private int itemTextAppearanceInactive;

    @Nullable
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelMaxLines;
    private int labelVisibilityMode;
    private boolean measurePaddingFromLabelBaseline;
    private NavigationBarMenuBuilder menu;

    @NonNull
    private final View.OnClickListener onClickListener;

    @NonNull
    private final SparseArray<View.OnTouchListener> onTouchListeners;
    private NavigationBarPresenter presenter;
    private boolean scaleLabelWithFont;
    private int selectedItemId;
    private int selectedItemPosition;

    @Nullable
    private final TransitionSet set;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};

    private boolean isValidId(int i11) {
        return i11 != -1;
    }

    @NonNull
    public abstract NavigationBarItemView createNavigationBarItemView(@NonNull Context context);

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    public boolean isShifting(int i11, int i12) {
        if (i11 == -1) {
            return i12 > 3;
        }
        return i11 == 0;
    }

    public void restoreBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int iKeyAt = sparseArray.keyAt(i11);
            if (this.badgeDrawables.indexOfKey(iKeyAt) < 0) {
                this.badgeDrawables.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                    BadgeDrawable badgeDrawable = this.badgeDrawables.get(navigationBarItemView.getId());
                    if (badgeDrawable != null) {
                        navigationBarItemView.setBadge(badgeDrawable);
                    }
                }
            }
        }
    }

    @Nullable
    private Drawable createItemActiveIndicatorDrawable() {
        if (this.itemActiveIndicatorShapeAppearance == null || this.itemActiveIndicatorColor == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.itemActiveIndicatorShapeAppearance);
        materialShapeDrawable.setFillColor(this.itemActiveIndicatorColor);
        return materialShapeDrawable;
    }

    private NavigationBarItemView createMenuItem(int i11, MenuItemImpl menuItemImpl, boolean z11, boolean z12) {
        this.presenter.setUpdateSuspended(true);
        menuItemImpl.setCheckable(true);
        this.presenter.setUpdateSuspended(false);
        NavigationBarItemView newItem = getNewItem();
        newItem.setShifting(z11);
        newItem.setLabelMaxLines(this.labelMaxLines);
        newItem.setIconTintList(this.itemIconTint);
        newItem.setIconSize(this.itemIconSize);
        newItem.setTextColor(this.itemTextColorDefault);
        newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
        newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
        newItem.setHorizontalTextAppearanceInactive(this.horizontalItemTextAppearanceInactive);
        newItem.setHorizontalTextAppearanceActive(this.horizontalItemTextAppearanceActive);
        newItem.setTextAppearanceActiveBoldEnabled(this.itemTextAppearanceActiveBoldEnabled);
        newItem.setTextColor(this.itemTextColorFromUser);
        int i12 = this.itemPaddingTop;
        if (i12 != -1) {
            newItem.setItemPaddingTop(i12);
        }
        int i13 = this.itemPaddingBottom;
        if (i13 != -1) {
            newItem.setItemPaddingBottom(i13);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.measurePaddingFromLabelBaseline);
        newItem.setLabelFontScalingEnabled(this.scaleLabelWithFont);
        int i14 = this.itemActiveIndicatorLabelPadding;
        if (i14 != -1) {
            newItem.setActiveIndicatorLabelPadding(i14);
        }
        int i15 = this.iconLabelHorizontalSpacing;
        if (i15 != -1) {
            newItem.setIconLabelHorizontalSpacing(i15);
        }
        newItem.setActiveIndicatorWidth(this.itemActiveIndicatorWidth);
        newItem.setActiveIndicatorHeight(this.itemActiveIndicatorHeight);
        newItem.setActiveIndicatorExpandedWidth(this.itemActiveIndicatorExpandedWidth);
        newItem.setActiveIndicatorExpandedHeight(this.itemActiveIndicatorExpandedHeight);
        newItem.setActiveIndicatorMarginHorizontal(this.itemActiveIndicatorMarginHorizontal);
        newItem.setItemGravity(this.itemGravity);
        newItem.setActiveIndicatorExpandedPadding(this.itemActiveIndicatorExpandedPadding);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.itemActiveIndicatorExpandedMarginHorizontal);
        newItem.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
        newItem.setActiveIndicatorResizeable(this.itemActiveIndicatorResizeable);
        newItem.setActiveIndicatorEnabled(this.itemActiveIndicatorEnabled);
        Drawable drawable = this.itemBackground;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.itemBackgroundRes);
        }
        newItem.setItemRippleColor(this.itemRippleColor);
        newItem.setLabelVisibilityMode(this.labelVisibilityMode);
        newItem.setItemIconGravity(this.itemIconGravity);
        newItem.setOnlyShowWhenExpanded(z12);
        newItem.setExpanded(this.expanded);
        newItem.initialize(menuItemImpl, 0);
        newItem.setItemPosition(i11);
        int itemId = menuItemImpl.getItemId();
        newItem.setOnTouchListener(this.onTouchListeners.get(itemId));
        newItem.setOnClickListener(this.onClickListener);
        int i16 = this.selectedItemId;
        if (i16 != 0 && itemId == i16) {
            this.selectedItemPosition = i11;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.collapsedMaxItemCount, this.menu.getVisibleMainContentItemCount());
    }

    private NavigationBarItemView getNewItem() {
        Pools.Pool<NavigationBarItemView> pool = this.itemPool;
        NavigationBarItemView navigationBarItemViewAcquire = pool != null ? pool.acquire() : null;
        return navigationBarItemViewAcquire == null ? createNavigationBarItemView(getContext()) : navigationBarItemViewAcquire;
    }

    private boolean isMenuStructureSame() {
        NavigationBarMenuBuilder navigationBarMenuBuilder;
        if (this.buttons == null || (navigationBarMenuBuilder = this.menu) == null || navigationBarMenuBuilder.size() != this.buttons.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.buttons.length) {
                return true;
            }
            if ((this.menu.getItemAt(i11) instanceof DividerMenuItem) && !(this.buttons[i11] instanceof NavigationBarDividerView)) {
                return false;
            }
            boolean z11 = this.menu.getItemAt(i11).hasSubMenu() && !(this.buttons[i11] instanceof NavigationBarSubheaderView);
            boolean z12 = (this.menu.getItemAt(i11).hasSubMenu() || (this.buttons[i11] instanceof NavigationBarItemView)) ? false : true;
            if (!(this.menu.getItemAt(i11) instanceof DividerMenuItem) && (z11 || z12)) {
                break;
            }
            i11++;
        }
        return false;
    }

    private void releaseItemPool() {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr == null || this.itemPool == null) {
            return;
        }
        for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
            if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                this.itemPool.release(navigationBarItemView);
                navigationBarItemView.clear();
            }
        }
    }

    private void removeUnusedBadges() {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < this.menu.size(); i11++) {
            hashSet.add(Integer.valueOf(this.menu.getItemAt(i11).getItemId()));
        }
        for (int i12 = 0; i12 < this.badgeDrawables.size(); i12++) {
            int iKeyAt = this.badgeDrawables.keyAt(i12);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.badgeDrawables.delete(iKeyAt);
            }
        }
    }

    @Nullable
    public ColorStateList createDefaultColorStateList(int i11) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i11, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0467R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i12 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i12, defaultColor});
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.itemActiveIndicatorLabelPadding;
    }

    @Nullable
    public BadgeDrawable getBadge(int i11) {
        return this.badgeDrawables.get(i11);
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.badgeDrawables;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.expanded ? this.menu.getVisibleContentItemCount() : getCollapsedVisibleItemCount();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceActive() {
        return this.horizontalItemTextAppearanceActive;
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceInactive() {
        return this.horizontalItemTextAppearanceInactive;
    }

    @Px
    public int getIconLabelHorizontalSpacing() {
        return this.iconLabelHorizontalSpacing;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.itemActiveIndicatorColor;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.itemActiveIndicatorEnabled;
    }

    @Px
    public int getItemActiveIndicatorExpandedHeight() {
        return this.itemActiveIndicatorExpandedHeight;
    }

    @Px
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.itemActiveIndicatorExpandedMarginHorizontal;
    }

    @Px
    public int getItemActiveIndicatorExpandedWidth() {
        return this.itemActiveIndicatorExpandedWidth;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.itemActiveIndicatorHeight;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.itemActiveIndicatorMarginHorizontal;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.itemActiveIndicatorShapeAppearance;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.itemActiveIndicatorWidth;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null && navigationBarMenuItemViewArr.length > 0) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    return ((NavigationBarItemView) navigationBarMenuItemView).getBackground();
                }
            }
        }
        return this.itemBackground;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    public int getItemGravity() {
        return this.itemGravity;
    }

    public int getItemIconGravity() {
        return this.itemIconGravity;
    }

    @Dimension
    public int getItemIconSize() {
        return this.itemIconSize;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.itemPaddingBottom;
    }

    @Px
    public int getItemPaddingTop() {
        return this.itemPaddingTop;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public int getLabelMaxLines() {
        return this.labelMaxLines;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    @Nullable
    public NavigationBarMenuBuilder getMenu() {
        return this.menu;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.scaleLabelWithFont;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    public int getSelectedItemPosition() {
        return this.selectedItemPosition;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@NonNull MenuBuilder menuBuilder) {
        this.menu = new NavigationBarMenuBuilder(menuBuilder);
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isItemActiveIndicatorResizeable() {
        return this.itemActiveIndicatorResizeable;
    }

    public void setActiveIndicatorLabelPadding(@Px int i11) {
        this.itemActiveIndicatorLabelPadding = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorLabelPadding(i11);
                }
            }
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        if (this.checkedItem == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.checkedItem;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.checkedItem.setChecked(false);
        }
        menuItem.setChecked(true);
        this.checkedItem = menuItem;
    }

    public void setCollapsedMaxItemCount(int i11) {
        this.collapsedMaxItemCount = i11;
    }

    public void setExpanded(boolean z11) {
        this.expanded = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                navigationBarMenuItemView.setExpanded(z11);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(@StyleRes int i11) {
        this.horizontalItemTextAppearanceActive = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setHorizontalTextAppearanceActive(i11);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(@StyleRes int i11) {
        this.horizontalItemTextAppearanceInactive = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setHorizontalTextAppearanceInactive(i11);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(@Px int i11) {
        this.iconLabelHorizontalSpacing = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconLabelHorizontalSpacing(i11);
                }
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.itemActiveIndicatorColor = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.itemActiveIndicatorEnabled = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorEnabled(z11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(@Px int i11) {
        this.itemActiveIndicatorExpandedHeight = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedHeight(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@Px int i11) {
        this.itemActiveIndicatorExpandedMarginHorizontal = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedMarginHorizontal(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedPadding(int i11, int i12, int i13, int i14) {
        Rect rect = this.itemActiveIndicatorExpandedPadding;
        rect.left = i11;
        rect.top = i12;
        rect.right = i13;
        rect.bottom = i14;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedPadding(this.itemActiveIndicatorExpandedPadding);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(@Px int i11) {
        this.itemActiveIndicatorExpandedWidth = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedWidth(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i11) {
        this.itemActiveIndicatorHeight = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorHeight(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i11) {
        this.itemActiveIndicatorMarginHorizontal = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorMarginHorizontal(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z11) {
        this.itemActiveIndicatorResizeable = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorResizeable(z11);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.itemActiveIndicatorShapeAppearance = shapeAppearanceModel;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i11) {
        this.itemActiveIndicatorWidth = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorWidth(i11);
                }
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.itemBackground = drawable;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i11) {
        this.itemBackgroundRes = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemBackground(i11);
                }
            }
        }
    }

    public void setItemGravity(int i11) {
        this.itemGravity = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemGravity(i11);
                }
            }
        }
    }

    public void setItemIconGravity(int i11) {
        this.itemIconGravity = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemIconGravity(i11);
                }
            }
        }
    }

    public void setItemIconSize(@Dimension int i11) {
        this.itemIconSize = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconSize(i11);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i11, @Nullable View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.onTouchListeners.remove(i11);
        } else {
            this.onTouchListeners.put(i11, onTouchListener);
        }
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if ((navigationBarMenuItemView instanceof NavigationBarItemView) && navigationBarMenuItemView.getItemData() != null && navigationBarMenuItemView.getItemData().getItemId() == i11) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@Px int i11) {
        this.itemPaddingBottom = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemPaddingBottom(this.itemPaddingBottom);
                }
            }
        }
    }

    public void setItemPaddingTop(@Px int i11) {
        this.itemPaddingTop = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemPaddingTop(i11);
                }
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i11) {
        this.itemTextAppearanceActive = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceActive(i11);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.itemTextAppearanceActiveBoldEnabled = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceActiveBoldEnabled(z11);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i11) {
        this.itemTextAppearanceInactive = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceInactive(i11);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.scaleLabelWithFont = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setLabelFontScalingEnabled(z11);
                }
            }
        }
    }

    public void setLabelMaxLines(int i11) {
        this.labelMaxLines = i11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setLabelMaxLines(i11);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i11) {
        this.labelVisibilityMode = i11;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z11) {
        this.measurePaddingFromLabelBaseline = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setMeasureBottomPaddingFromLabelBaseline(z11);
                }
            }
        }
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.presenter = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z11) {
        if (this.dividersEnabled == z11) {
            return;
        }
        this.dividersEnabled = z11;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarDividerView) {
                    ((NavigationBarDividerView) navigationBarMenuItemView).setDividersEnabled(z11);
                }
            }
        }
    }

    public void tryRestoreSelectedItemId(int i11) {
        int size = this.menu.size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem itemAt = this.menu.getItemAt(i12);
            if (i11 == itemAt.getItemId()) {
                this.selectedItemId = i11;
                this.selectedItemPosition = i12;
                setCheckedItem(itemAt);
                return;
            }
        }
    }

    public void updateActiveIndicator(int i11) {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).updateActiveIndicatorLayoutParams(i11);
                }
            }
        }
    }

    public void updateMenuView() {
        TransitionSet transitionSet;
        if (this.menu == null || this.buttons == null) {
            return;
        }
        this.presenter.setUpdateSuspended(true);
        this.menu.refreshItems();
        this.presenter.setUpdateSuspended(false);
        if (!isMenuStructureSame()) {
            buildMenuView();
            return;
        }
        int i11 = this.selectedItemId;
        int size = this.menu.size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem itemAt = this.menu.getItemAt(i12);
            if (itemAt.isChecked()) {
                setCheckedItem(itemAt);
                this.selectedItemId = itemAt.getItemId();
                this.selectedItemPosition = i12;
            }
        }
        if (i11 != this.selectedItemId && (transitionSet = this.set) != null) {
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean zIsShifting = isShifting(this.labelVisibilityMode, getCurrentVisibleContentItemCount());
        for (int i13 = 0; i13 < size; i13++) {
            this.presenter.setUpdateSuspended(true);
            this.buttons[i13].setExpanded(this.expanded);
            NavigationBarMenuItemView navigationBarMenuItemView = this.buttons[i13];
            if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                navigationBarItemView.setLabelVisibilityMode(this.labelVisibilityMode);
                navigationBarItemView.setItemIconGravity(this.itemIconGravity);
                navigationBarItemView.setItemGravity(this.itemGravity);
                navigationBarItemView.setShifting(zIsShifting);
            }
            if (this.menu.getItemAt(i13) instanceof MenuItemImpl) {
                this.buttons[i13].initialize((MenuItemImpl) this.menu.getItemAt(i13), 0);
            }
            this.presenter.setUpdateSuspended(false);
        }
    }

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.onTouchListeners = new SparseArray<>();
        this.selectedItemId = -1;
        this.selectedItemPosition = -1;
        this.badgeDrawables = new SparseArray<>();
        this.itemPaddingTop = -1;
        this.itemPaddingBottom = -1;
        this.itemActiveIndicatorLabelPadding = -1;
        this.iconLabelHorizontalSpacing = -1;
        this.itemGravity = 49;
        this.itemActiveIndicatorResizeable = false;
        this.labelMaxLines = 1;
        this.itemPoolSize = 0;
        this.checkedItem = null;
        this.collapsedMaxItemCount = 7;
        this.dividersEnabled = false;
        this.itemActiveIndicatorExpandedPadding = new Rect();
        this.itemTextColorDefault = createDefaultColorStateList(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.set = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.set = autoTransition;
            autoTransition.setOrdering(0);
            autoTransition.excludeTarget(TextView.class, true);
            autoTransition.setDuration(MotionUtils.resolveThemeDuration(getContext(), C7090R.attr.motionDurationMedium4, getResources().getInteger(C7090R.integer.material_motion_duration_long_1)));
            autoTransition.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), C7090R.attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            autoTransition.addTransition(new TextScale());
        }
        this.onClickListener = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
                boolean zPerformItemAction = NavigationBarMenuView.this.menu.performItemAction(itemData, NavigationBarMenuView.this.presenter, 0);
                if (itemData == null || !itemData.isCheckable()) {
                    return;
                }
                if (!zPerformItemAction || itemData.isChecked()) {
                    NavigationBarMenuView.this.setCheckedItem(itemData);
                }
            }
        };
        setImportantForAccessibility(1);
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id2 = navigationBarItemView.getId();
        if (isValidId(id2) && (badgeDrawable = this.badgeDrawables.get(id2)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    private void validateMenuItemId(int i11) {
        if (isValidId(i11)) {
            return;
        }
        throw new IllegalArgumentException(i11 + " is not a valid view id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
        boolean z11;
        NavigationBarItemView navigationBarItemViewCreateMenuItem;
        View viewCreateMenuItem;
        NavigationBarDividerView navigationBarDividerView;
        removeAllViews();
        releaseItemPool();
        this.presenter.setUpdateSuspended(true);
        this.menu.refreshItems();
        this.presenter.setUpdateSuspended(false);
        int contentItemCount = this.menu.getContentItemCount();
        if (contentItemCount == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            this.itemPool = null;
            return;
        }
        if (this.itemPool == null || this.itemPoolSize != contentItemCount) {
            this.itemPoolSize = contentItemCount;
            this.itemPool = new Pools.SynchronizedPool(contentItemCount);
        }
        removeUnusedBadges();
        int size = this.menu.size();
        this.buttons = new NavigationBarMenuItemView[size];
        boolean zIsShifting = isShifting(this.labelVisibilityMode, getCurrentVisibleContentItemCount());
        int size2 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem itemAt = this.menu.getItemAt(i12);
            boolean z12 = itemAt instanceof DividerMenuItem;
            if (z12) {
                navigationBarDividerView = new NavigationBarDividerView(getContext());
                navigationBarDividerView.setOnlyShowWhenExpanded(true);
                navigationBarDividerView.setDividersEnabled(this.dividersEnabled);
            } else if (itemAt.hasSubMenu()) {
                if (size2 <= 0) {
                    NavigationBarSubheaderView navigationBarSubheaderView = new NavigationBarSubheaderView(getContext());
                    int i13 = this.horizontalItemTextAppearanceActive;
                    if (i13 == 0) {
                        i13 = this.itemTextAppearanceActive;
                    }
                    navigationBarSubheaderView.setTextAppearance(i13);
                    navigationBarSubheaderView.setTextColor(this.itemTextColorFromUser);
                    navigationBarSubheaderView.setOnlyShowWhenExpanded(true);
                    navigationBarSubheaderView.initialize((MenuItemImpl) itemAt, 0);
                    size2 = itemAt.getSubMenu().size();
                    viewCreateMenuItem = navigationBarSubheaderView;
                } else {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
            } else if (size2 > 0) {
                navigationBarItemViewCreateMenuItem = createMenuItem(i12, (MenuItemImpl) itemAt, zIsShifting, true);
                size2--;
            } else {
                MenuItemImpl menuItemImpl = (MenuItemImpl) itemAt;
                if (i11 >= this.collapsedMaxItemCount) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i11++;
                viewCreateMenuItem = createMenuItem(i12, menuItemImpl, zIsShifting, z11);
            }
            if (z12) {
                viewCreateMenuItem = navigationBarItemViewCreateMenuItem;
                viewCreateMenuItem = navigationBarDividerView;
            } else {
                viewCreateMenuItem = navigationBarItemViewCreateMenuItem;
                if (itemAt.isCheckable() && this.selectedItemPosition == -1) {
                    viewCreateMenuItem = navigationBarDividerView;
                    this.selectedItemPosition = i12;
                } else {
                    viewCreateMenuItem = navigationBarDividerView;
                }
            }
            this.buttons[i12] = viewCreateMenuItem;
            addView(viewCreateMenuItem);
        }
        int iMin = Math.min(size - 1, this.selectedItemPosition);
        this.selectedItemPosition = iMin;
        setCheckedItem(this.buttons[iMin].getItemData());
    }

    @Nullable
    public NavigationBarItemView findItemView(int i11) {
        validateMenuItemId(i11);
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                    if (navigationBarItemView.getId() == i11) {
                        return navigationBarItemView;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public BadgeDrawable getOrCreateBadge(int i11) {
        validateMenuItemId(i11);
        BadgeDrawable badgeDrawableCreate = this.badgeDrawables.get(i11);
        if (badgeDrawableCreate == null) {
            badgeDrawableCreate = BadgeDrawable.create(getContext());
            this.badgeDrawables.put(i11, badgeDrawableCreate);
        }
        NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i11);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.setBadge(badgeDrawableCreate);
        }
        return badgeDrawableCreate;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public void removeBadge(int i11) {
        validateMenuItemId(i11);
        NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i11);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.removeBadge();
        }
        this.badgeDrawables.put(i11, null);
    }
}
