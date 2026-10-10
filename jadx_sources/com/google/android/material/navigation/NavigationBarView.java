package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C7090R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes45.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int ACTIVE_INDICATOR_WIDTH_MATCH_PARENT = -1;
    public static final int ACTIVE_INDICATOR_WIDTH_WRAP_CONTENT = -2;
    public static final int ITEM_GRAVITY_CENTER = 17;
    public static final int ITEM_GRAVITY_START_CENTER = 8388627;
    public static final int ITEM_GRAVITY_TOP_CENTER = 49;
    public static final int ITEM_ICON_GRAVITY_START = 1;
    public static final int ITEM_ICON_GRAVITY_TOP = 0;
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;

    @NonNull
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;

    @NonNull
    private final NavigationBarMenuView menuView;

    @NonNull
    private final NavigationBarPresenter presenter;
    private OnItemReselectedListener reselectedListener;
    private OnItemSelectedListener selectedListener;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ItemGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ItemIconGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        @Nullable
        Bundle menuPresenterState;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        private void readFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.menuPresenterState);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context);

    public abstract int getMaxItemCount();

    public boolean isSubMenuSupported() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldAddMenuView() {
        return false;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z11) {
        this.menuView.setMeasurePaddingFromLabelBaseline(z11);
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.menuView.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public BadgeDrawable getBadge(int i11) {
        return this.menuView.getBadge(i11);
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceActive() {
        return this.menuView.getHorizontalItemTextAppearanceActive();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceInactive() {
        return this.menuView.getHorizontalItemTextAppearanceInactive();
    }

    @Px
    public int getIconLabelHorizontalSpacing() {
        return this.menuView.getIconLabelHorizontalSpacing();
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorExpandedHeight() {
        return this.menuView.getItemActiveIndicatorExpandedHeight();
    }

    @Px
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    @Px
    public int getItemActiveIndicatorExpandedWidth() {
        return this.menuView.getItemActiveIndicatorExpandedWidth();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.menuView.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.menuView.getItemIconGravity();
    }

    @Dimension
    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelMaxLines(int i11) {
        return this.menuView.getLabelMaxLines();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.menuView;
    }

    @NonNull
    public ViewGroup getMenuViewGroup() {
        return this.menuView;
    }

    @NonNull
    public BadgeDrawable getOrCreateBadge(int i11) {
        return this.menuView.getOrCreateBadge(i11);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.menuView.getScaleLabelTextWithFont();
    }

    @IdRes
    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i11) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i11, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    public void removeBadge(int i11) {
        this.menuView.removeBadge(i11);
    }

    public void setActiveIndicatorLabelPadding(@Px int i11) {
        this.menuView.setActiveIndicatorLabelPadding(i11);
    }

    public void setHorizontalItemTextAppearanceActive(@StyleRes int i11) {
        this.menuView.setHorizontalItemTextAppearanceActive(i11);
    }

    public void setHorizontalItemTextAppearanceInactive(@StyleRes int i11) {
        this.menuView.setHorizontalItemTextAppearanceInactive(i11);
    }

    public void setIconLabelHorizontalSpacing(@Px int i11) {
        this.menuView.setIconLabelHorizontalSpacing(i11);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.menuView.setItemActiveIndicatorEnabled(z11);
    }

    public void setItemActiveIndicatorExpandedHeight(@Px int i11) {
        this.menuView.setItemActiveIndicatorExpandedHeight(i11);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@Px int i11) {
        this.menuView.setItemActiveIndicatorExpandedMarginHorizontal(i11);
    }

    public void setItemActiveIndicatorExpandedPadding(@Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        this.menuView.setItemActiveIndicatorExpandedPadding(i11, i12, i13, i14);
    }

    public void setItemActiveIndicatorExpandedWidth(@Px int i11) {
        this.menuView.setItemActiveIndicatorExpandedWidth(i11);
    }

    public void setItemActiveIndicatorHeight(@Px int i11) {
        this.menuView.setItemActiveIndicatorHeight(i11);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i11) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i11);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@Px int i11) {
        this.menuView.setItemActiveIndicatorWidth(i11);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i11) {
        this.menuView.setItemBackgroundRes(i11);
    }

    public void setItemGravity(int i11) {
        if (this.menuView.getItemGravity() != i11) {
            this.menuView.setItemGravity(i11);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconGravity(int i11) {
        if (this.menuView.getItemIconGravity() != i11) {
            this.menuView.setItemIconGravity(i11);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(@Dimension int i11) {
        this.menuView.setItemIconSize(i11);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i11, @Nullable View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i11, onTouchListener);
    }

    public void setItemPaddingBottom(@Px int i11) {
        this.menuView.setItemPaddingBottom(i11);
    }

    public void setItemPaddingTop(@Px int i11) {
        this.menuView.setItemPaddingTop(i11);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i11) {
        this.menuView.setItemTextAppearanceActive(i11);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.menuView.setItemTextAppearanceActiveBoldEnabled(z11);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i11) {
        this.menuView.setItemTextAppearanceInactive(i11);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.menuView.setLabelFontScalingEnabled(z11);
    }

    public void setLabelMaxLines(int i11) {
        this.menuView.setLabelMaxLines(i11);
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.menuView.getLabelVisibilityMode() != i11) {
            this.menuView.setLabelVisibilityMode(i11);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener onItemReselectedListener) {
        this.reselectedListener = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener onItemSelectedListener) {
        this.selectedListener = onItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i11) {
        MenuItem menuItemFindItem = this.menu.findItem(i11);
        if (menuItemFindItem != null) {
            boolean zPerformItemAction = this.menu.performItemAction(menuItemFindItem, this.presenter, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zPerformItemAction || menuItemFindItem.isChecked()) {
                    this.menuView.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01f5  */
    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        int i13;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C7090R.styleable.NavigationBarView;
        int i14 = C7090R.styleable.NavigationBarView_itemTextAppearanceInactive;
        int i15 = C7090R.styleable.NavigationBarView_itemTextAppearanceActive;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i11, i12, i14, i15);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount(), isSubMenuSupported());
        this.menu = navigationBarMenu;
        NavigationBarMenuView navigationBarMenuViewCreateNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = navigationBarMenuViewCreateNavigationBarMenuView;
        navigationBarMenuViewCreateNavigationBarMenuView.setMinimumHeight(getSuggestedMinimumHeight());
        navigationBarMenuViewCreateNavigationBarMenuView.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        navigationBarPresenter.setMenuView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        navigationBarMenuViewCreateNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        int i16 = C7090R.styleable.NavigationBarView_itemIconTint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i16)) {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i16));
        } else {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(navigationBarMenuViewCreateNavigationBarMenuView.createDefaultColorStateList(R.attr.textColorSecondary));
        }
        setItemIconSize(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C7090R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(C7090R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i14)) {
            setItemTextAppearanceInactive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i14, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i15)) {
            setItemTextAppearanceActive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i15, 0));
        }
        int i17 = C7090R.styleable.NavigationBarView_horizontalItemTextAppearanceInactive;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i17)) {
            setHorizontalItemTextAppearanceInactive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i17, 0));
        }
        int i18 = C7090R.styleable.NavigationBarView_horizontalItemTextAppearanceActive;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i18)) {
            setHorizontalItemTextAppearanceActive(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i18, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        int i19 = C7090R.styleable.NavigationBarView_itemTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i19)) {
            setItemTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i19));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i11, i12).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            setBackground(materialShapeDrawable);
        }
        int i21 = C7090R.styleable.NavigationBarView_itemPaddingTop;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i21)) {
            setItemPaddingTop(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i21, 0));
        }
        int i22 = C7090R.styleable.NavigationBarView_itemPaddingBottom;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i22)) {
            setItemPaddingBottom(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i22, 0));
        }
        int i23 = C7090R.styleable.NavigationBarView_activeIndicatorLabelPadding;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i23)) {
            setActiveIndicatorLabelPadding(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i23, 0));
        }
        int i24 = C7090R.styleable.NavigationBarView_iconLabelHorizontalSpacing;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i24)) {
            setIconLabelHorizontalSpacing(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i24, 0));
        }
        int i25 = C7090R.styleable.NavigationBarView_elevation;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i25)) {
            setElevation(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i25, 0));
        }
        getBackground().mutate().setTintList(MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, C7090R.styleable.NavigationBarView_backgroundTint));
        int dimensionPixelSize = -1;
        setLabelVisibilityMode(tintTypedArrayObtainTintedStyledAttributes.getInteger(C7090R.styleable.NavigationBarView_labelVisibilityMode, -1));
        setItemIconGravity(tintTypedArrayObtainTintedStyledAttributes.getInteger(C7090R.styleable.NavigationBarView_itemIconGravity, 0));
        setItemGravity(tintTypedArrayObtainTintedStyledAttributes.getInteger(C7090R.styleable.NavigationBarView_itemGravity, 49));
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(C7090R.styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            navigationBarMenuViewCreateNavigationBarMenuView.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, C7090R.styleable.NavigationBarView_itemRippleColor));
        }
        setMeasureBottomPaddingFromLabelBaseline(tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.NavigationBarView_measureBottomPaddingFromLabelBaseline, true));
        setLabelFontScalingEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.NavigationBarView_labelFontScalingEnabled, false));
        setLabelMaxLines(tintTypedArrayObtainTintedStyledAttributes.getInteger(C7090R.styleable.NavigationBarView_labelMaxLines, 1));
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(C7090R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, C7090R.styleable.NavigationBarActiveIndicator);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.NavigationBarActiveIndicator_android_width, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize2);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.NavigationBarActiveIndicator_android_height, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            int i26 = C7090R.styleable.NavigationBarActiveIndicator_expandedWidth;
            String string = typedArrayObtainStyledAttributes.getString(i26);
            if (string != null) {
                if (!String.valueOf(-1).equals(string)) {
                    if (String.valueOf(-2).equals(string)) {
                        dimensionPixelSize = -2;
                    } else {
                        dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i26, -2);
                    }
                }
            } else {
                dimensionPixelSize = -2;
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize2));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(C7090R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize3);
            if (getLayoutDirection() == 1) {
                i13 = dimensionPixelOffset3;
            } else {
                i13 = dimensionPixelOffset2;
            }
            setItemActiveIndicatorExpandedPadding(i13, typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.f11740x19991881, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C7090R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            typedArrayObtainStyledAttributes.recycle();
        }
        int i27 = C7090R.styleable.NavigationBarView_menu;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i27)) {
            inflateMenu(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i27, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        if (!shouldAddMenuView()) {
            addView(navigationBarMenuViewCreateNavigationBarMenuView);
        }
        navigationBarMenu.setCallback(new MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
                if (NavigationBarView.this.reselectedListener == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                    return (NavigationBarView.this.selectedListener == null || NavigationBarView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                NavigationBarView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        MaterialShapeUtils.setElevation(this, f11);
    }

    public void setItemIconSizeRes(@DimenRes int i11) {
        setItemIconSize(getResources().getDimensionPixelSize(i11));
    }
}
