package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.BaselineLayout;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements NavigationBarMenuItemView {
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM;
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int INVALID_ITEM_POSITION = -1;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorExpandedDesiredHeight;
    private int activeIndicatorExpandedDesiredWidth;
    private int activeIndicatorExpandedMarginHorizontal;
    private int activeIndicatorLabelPadding;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private ActiveIndicatorTransform activeIndicatorTransform;

    @NonNull
    private final View activeIndicatorView;

    @Nullable
    private BadgeDrawable badgeDrawable;
    private int badgeFixedEdge;
    private boolean boldText;

    @NonNull
    private final LinearLayout contentContainer;
    private BaselineLayout currentLabelGroup;
    private boolean expanded;
    private BaselineLayout expandedLabelGroup;
    private float expandedLabelScaleDownFactor;
    private float expandedLabelScaleUpFactor;
    private float expandedLabelShiftAmountY;
    private TextView expandedLargeLabel;
    private TextView expandedSmallLabel;

    @StyleRes
    private int horizontalTextAppearanceActive;

    @StyleRes
    private int horizontalTextAppearanceInactive;
    private final ImageView icon;

    @NonNull
    private final FrameLayout iconContainer;
    private int iconLabelHorizontalSpacing;

    @Nullable
    private ColorStateList iconTint;
    private boolean initialized;

    @NonNull
    private final LinearLayout innerContentContainer;
    private boolean isShifting;
    private Rect itemActiveIndicatorExpandedPadding;

    @Nullable
    Drawable itemBackground;

    @Nullable
    private MenuItemImpl itemData;
    private int itemGravity;
    private int itemIconGravity;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private ColorStateList itemRippleColor;
    private final BaselineLayout labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private boolean measurePaddingFromBaseline;
    private boolean onlyShowWhenExpanded;

    @Nullable
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private boolean scaleLabelSizeWithFont;
    private float scaleUpFactor;
    private float shiftAmountY;
    private final TextView smallLabel;

    @StyleRes
    private int textAppearanceActive;

    @StyleRes
    private int textAppearanceInactive;

    @Nullable
    private ColorStateList textColor;

    @Nullable
    private Drawable wrappedIconDrawable;

    public static class ActiveIndicatorTransform {
        private static final float ALPHA_FRACTION = 0.2f;
        private static final float SCALE_X_HIDDEN = 0.4f;
        private static final float SCALE_X_SHOWN = 1.0f;

        private ActiveIndicatorTransform() {
        }

        public float calculateAlpha(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12) {
            return AnimationUtils.lerp(0.0f, 1.0f, f12 == 0.0f ? 0.8f : 0.0f, f12 == 0.0f ? 1.0f : 0.2f, f11);
        }

        public float calculateScaleY(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
            return 1.0f;
        }

        public float calculateScaleX(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
            return AnimationUtils.lerp(SCALE_X_HIDDEN, 1.0f, f11);
        }

        public void updateForProgress(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, @NonNull View view) {
            view.setScaleX(calculateScaleX(f11));
            view.setScaleY(calculateScaleY(f11));
            view.setAlpha(calculateAlpha(f11, f12));
        }
    }

    private void updateItemIconGravity() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.badgeFixedEdge = 0;
        this.currentLabelGroup = this.labelGroup;
        int i17 = 8;
        if (this.itemIconGravity == 1) {
            if (this.expandedLabelGroup.getParent() == null) {
                addDefaultExpandedLabelGroupViews();
            }
            Rect rect = this.itemActiveIndicatorExpandedPadding;
            int i18 = rect.left;
            int i19 = rect.right;
            int i21 = rect.top;
            i11 = rect.bottom;
            this.badgeFixedEdge = 1;
            int i22 = this.activeIndicatorExpandedMarginHorizontal;
            this.currentLabelGroup = this.expandedLabelGroup;
            i15 = i21;
            i14 = i19;
            i13 = i18;
            i12 = i22;
            i16 = 0;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 8;
            i17 = 0;
        }
        this.labelGroup.setVisibility(i17);
        this.expandedLabelGroup.setVisibility(i16);
        ((FrameLayout.LayoutParams) this.contentContainer.getLayoutParams()).gravity = this.itemGravity;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.innerContentContainer.getLayoutParams();
        layoutParams.leftMargin = i13;
        layoutParams.rightMargin = i14;
        layoutParams.topMargin = i15;
        layoutParams.bottomMargin = i11;
        setPadding(i12, 0, i12, 0);
        updateActiveIndicatorLayoutParams(getWidth());
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setItemBackground(int i11) {
        setItemBackground(i11 == 0 ? null : getContext().getDrawable(i11));
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        public float calculateScaleY(float f11) {
            return calculateScaleX(f11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13136a(NavigationBarItemView navigationBarItemView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z11;
        if (navigationBarItemView.icon.getVisibility() == 0) {
            navigationBarItemView.tryUpdateBadgeBounds(navigationBarItemView.icon);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) navigationBarItemView.innerContentContainer.getLayoutParams();
        int i19 = (i13 - i11) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i21 = (i14 - i12) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z12 = true;
        if (navigationBarItemView.itemIconGravity == 1 && navigationBarItemView.activeIndicatorExpandedDesiredWidth == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) navigationBarItemView.activeIndicatorView.getLayoutParams();
            if (navigationBarItemView.activeIndicatorExpandedDesiredWidth != -2 || navigationBarItemView.activeIndicatorView.getMeasuredWidth() == i19) {
                z11 = false;
            } else {
                layoutParams2.width = Math.max(i19, Math.min(navigationBarItemView.activeIndicatorDesiredWidth, navigationBarItemView.getMeasuredWidth() - (navigationBarItemView.activeIndicatorMarginHorizontal * 2)));
                z11 = true;
            }
            if (navigationBarItemView.activeIndicatorView.getMeasuredHeight() < i21) {
                layoutParams2.height = i21;
            } else {
                z12 = z11;
            }
            if (z12) {
                navigationBarItemView.activeIndicatorView.setLayoutParams(layoutParams2);
            }
        }
    }

    private void addDefaultExpandedLabelGroupViews() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.innerContentContainer.addView(this.expandedLabelGroup, layoutParams);
        setExpandedLabelGroupMargins();
    }

    private void calculateTextScaleFactors() {
        float textSize = this.smallLabel.getTextSize();
        float textSize2 = this.largeLabel.getTextSize();
        this.shiftAmountY = textSize - textSize2;
        this.scaleUpFactor = (textSize2 * 1.0f) / textSize;
        this.scaleDownFactor = (textSize * 1.0f) / textSize2;
        float textSize3 = this.expandedSmallLabel.getTextSize();
        float textSize4 = this.expandedLargeLabel.getTextSize();
        this.expandedLabelShiftAmountY = textSize3 - textSize4;
        this.expandedLabelScaleUpFactor = (textSize4 * 1.0f) / textSize3;
        this.expandedLabelScaleDownFactor = (textSize3 * 1.0f) / textSize4;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.iconContainer.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.icon.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        return this.activeIndicatorResizeable && this.labelVisibilityMode == 2;
    }

    private void maybeAnimateActiveIndicatorToProgress(@FloatRange(from = 0.0d, m1552to = 1.0d) final float f11) {
        if (!this.activeIndicatorEnabled || !this.initialized || !isAttachedToWindow()) {
            setActiveIndicatorProgress(f11, f11);
            return;
        }
        ValueAnimator valueAnimator = this.activeIndicatorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.activeIndicatorAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.activeIndicatorProgress, f11);
        this.activeIndicatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NavigationBarItemView.this.setActiveIndicatorProgress(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f11);
            }
        });
        this.activeIndicatorAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), C7090R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        this.activeIndicatorAnimator.setDuration(MotionUtils.resolveThemeDuration(getContext(), C7090R.attr.motionDurationLong2, getResources().getInteger(C7090R.integer.material_motion_duration_long_1)));
        this.activeIndicatorAnimator.start();
    }

    private void refreshChecked() {
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    private void refreshItemBackground() {
        Drawable drawableCreateItemBackgroundCompat = this.itemBackground;
        RippleDrawable rippleDrawable = null;
        boolean z11 = true;
        if (this.itemRippleColor != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.activeIndicatorEnabled && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.itemRippleColor), null, activeIndicatorDrawable);
                z11 = false;
            } else if (drawableCreateItemBackgroundCompat == null) {
                drawableCreateItemBackgroundCompat = createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        this.iconContainer.setPadding(0, 0, 0, 0);
        this.iconContainer.setForeground(rippleDrawable);
        setBackground(drawableCreateItemBackgroundCompat);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveIndicatorProgress(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11, float f12) {
        this.activeIndicatorTransform.updateForProgress(f11, f12, this.activeIndicatorView);
        this.activeIndicatorProgress = f11;
    }

    private void setExpandedLabelGroupMargins() {
        int i11 = this.icon.getLayoutParams().width > 0 ? this.iconLabelHorizontalSpacing : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.expandedLabelGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i11 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i11 : 0;
        }
    }

    private void setLayoutConfigurationIconAndLabel(View view, View view2, float f11, float f12) {
        setViewMarginAndGravity(this.contentContainer, this.itemIconGravity == 0 ? (int) (this.itemPaddingTop + f12) : 0, 0, this.itemGravity);
        LinearLayout linearLayout = this.innerContentContainer;
        int i11 = this.itemIconGravity;
        setViewMarginAndGravity(linearLayout, i11 == 0 ? 0 : this.itemActiveIndicatorExpandedPadding.top, i11 == 0 ? 0 : this.itemActiveIndicatorExpandedPadding.bottom, i11 == 0 ? 17 : NavigationBarView.ITEM_GRAVITY_START_CENTER);
        updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
        this.currentLabelGroup.setVisibility(0);
        setViewScaleValues(view, 1.0f, 1.0f, 0);
        setViewScaleValues(view2, f11, f11, 4);
    }

    private void setLayoutConfigurationIconOnly() {
        LinearLayout linearLayout = this.contentContainer;
        int i11 = this.itemPaddingTop;
        setViewMarginAndGravity(linearLayout, i11, i11, this.itemIconGravity == 0 ? 17 : this.itemGravity);
        setViewMarginAndGravity(this.innerContentContainer, 0, 0, 17);
        updateViewPaddingBottom(this.labelGroup, 0);
        this.currentLabelGroup.setVisibility(8);
    }

    private void setTextAppearanceForLabel(TextView textView, int i11) {
        if (this.scaleLabelSizeWithFont) {
            TextViewCompat.setTextAppearance(textView, i11);
        } else {
            setTextAppearanceWithoutFontScaling(textView, i11);
        }
    }

    private void updateActiveLabelBoldness() {
        TextView textView = this.largeLabel;
        textView.setTypeface(textView.getTypeface(), this.boldText ? 1 : 0);
        TextView textView2 = this.expandedLargeLabel;
        textView2.setTypeface(textView2.getTypeface(), this.boldText ? 1 : 0);
    }

    private void updateActiveLabelTextAppearance(@Nullable TextView textView, @StyleRes int i11) {
        if (textView == null) {
            return;
        }
        setTextAppearanceForLabel(textView, i11);
        calculateTextScaleFactors();
        textView.setMinimumHeight(MaterialResources.getUnscaledLineHeight(textView.getContext(), i11, 0));
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        updateActiveLabelBoldness();
    }

    private void updateInactiveLabelTextAppearance(@Nullable TextView textView, @StyleRes int i11) {
        if (textView == null) {
            return;
        }
        setTextAppearanceForLabel(textView, i11);
        calculateTextScaleFactors();
        textView.setMinimumHeight(MaterialResources.getUnscaledLineHeight(textView.getContext(), i11, 0));
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void updateVisibility() {
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setVisibility((!menuItemImpl.isVisible() || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.activeIndicatorEnabled) {
            this.iconContainer.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        return this.activeIndicatorView.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    @NonNull
    public BaselineLayout getExpandedLabelGroup() {
        return this.expandedLabelGroup;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return C7090R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return C7090R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    @NonNull
    public BaselineLayout getLabelGroup() {
        return this.labelGroup;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentContainer.getLayoutParams();
        return this.contentContainer.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.itemIconGravity == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.innerContentContainer.getLayoutParams();
            return this.innerContentContainer.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.labelGroup.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i11) {
        this.itemData = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        TooltipCompat.setTooltipText(this, !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        updateVisibility();
        this.initialized = true;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isExpanded() {
        return this.expanded;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        this.activeIndicatorView.setBackground(drawable);
        refreshItemBackground();
    }

    public void setActiveIndicatorEnabled(boolean z11) {
        this.activeIndicatorEnabled = z11;
        refreshItemBackground();
        this.activeIndicatorView.setVisibility(z11 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i11) {
        this.activeIndicatorExpandedDesiredHeight = i11;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(@Px int i11) {
        this.activeIndicatorExpandedMarginHorizontal = i11;
        if (this.itemIconGravity == 1) {
            setPadding(i11, 0, i11, 0);
        }
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(@NonNull Rect rect) {
        this.itemActiveIndicatorExpandedPadding = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i11) {
        this.activeIndicatorExpandedDesiredWidth = i11;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorHeight(int i11) {
        this.activeIndicatorDesiredHeight = i11;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        if (this.activeIndicatorLabelPadding != i11) {
            this.activeIndicatorLabelPadding = i11;
            ((LinearLayout.LayoutParams) this.labelGroup.getLayoutParams()).topMargin = i11;
            if (this.expandedLabelGroup.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.expandedLabelGroup.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i11 : 0;
                if (getLayoutDirection() == 1) {
                    i11 = 0;
                }
                layoutParams.leftMargin = i11;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i11) {
        this.activeIndicatorMarginHorizontal = i11;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z11) {
        this.activeIndicatorResizeable = z11;
    }

    public void setActiveIndicatorWidth(int i11) {
        this.activeIndicatorDesiredWidth = i11;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        if (this.badgeDrawable == badgeDrawable) {
            return;
        }
        if (hasBadge() && this.icon != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            tryRemoveBadgeFromAnchor(this.icon);
        }
        this.badgeDrawable = badgeDrawable;
        badgeDrawable.setBadgeFixedEdge(this.badgeFixedEdge);
        ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z11) {
        setLabelPivots(this.largeLabel);
        setLabelPivots(this.smallLabel);
        setLabelPivots(this.expandedLargeLabel);
        setLabelPivots(this.expandedSmallLabel);
        maybeAnimateActiveIndicatorToProgress(z11 ? 1.0f : 0.0f);
        TextView textView = this.largeLabel;
        TextView textView2 = this.smallLabel;
        float f11 = this.shiftAmountY;
        float f12 = this.scaleUpFactor;
        float f13 = this.scaleDownFactor;
        if (this.itemIconGravity == 1) {
            textView = this.expandedLargeLabel;
            textView2 = this.expandedSmallLabel;
            f11 = this.expandedLabelShiftAmountY;
            f12 = this.expandedLabelScaleUpFactor;
            f13 = this.expandedLabelScaleDownFactor;
        }
        int i11 = this.labelVisibilityMode;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        setLayoutConfigurationIconOnly();
                    }
                } else if (z11) {
                    setLayoutConfigurationIconAndLabel(textView, textView2, f12, f11);
                } else {
                    setLayoutConfigurationIconAndLabel(textView2, textView, f13, 0.0f);
                }
            } else if (z11) {
                setLayoutConfigurationIconAndLabel(textView, textView2, f12, 0.0f);
            } else {
                setLayoutConfigurationIconOnly();
            }
        } else if (this.isShifting) {
            if (z11) {
                setLayoutConfigurationIconAndLabel(textView, textView2, f12, 0.0f);
            } else {
                setLayoutConfigurationIconOnly();
            }
        } else if (z11) {
            setLayoutConfigurationIconAndLabel(textView, textView2, f12, f11);
        } else {
            setLayoutConfigurationIconAndLabel(textView2, textView, f13, 0.0f);
        }
        refreshDrawableState();
        setSelected(z11);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z11) {
        this.expanded = z11;
        updateVisibility();
    }

    public void setHorizontalTextAppearanceActive(@StyleRes int i11) {
        this.horizontalTextAppearanceActive = i11;
        TextView textView = this.expandedLargeLabel;
        if (i11 == 0) {
            i11 = this.textAppearanceActive;
        }
        updateActiveLabelTextAppearance(textView, i11);
    }

    public void setHorizontalTextAppearanceInactive(@StyleRes int i11) {
        this.horizontalTextAppearanceInactive = i11;
        TextView textView = this.expandedSmallLabel;
        if (i11 == 0) {
            i11 = this.textAppearanceInactive;
        }
        updateInactiveLabelTextAppearance(textView, i11);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i11) {
        if (this.iconLabelHorizontalSpacing != i11) {
            this.iconLabelHorizontalSpacing = i11;
            setExpandedLabelGroupMargins();
            requestLayout();
        }
    }

    public void setIconSize(int i11) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i11;
        this.icon.setLayoutParams(layoutParams);
        setExpandedLabelGroupMargins();
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setItemGravity(int i11) {
        this.itemGravity = i11;
        requestLayout();
    }

    public void setItemIconGravity(int i11) {
        if (this.itemIconGravity != i11) {
            this.itemIconGravity = i11;
            updateItemIconGravity();
            refreshItemBackground();
        }
    }

    public void setItemPaddingBottom(int i11) {
        if (this.itemPaddingBottom != i11) {
            this.itemPaddingBottom = i11;
            refreshChecked();
        }
    }

    public void setItemPaddingTop(int i11) {
        if (this.itemPaddingTop != i11) {
            this.itemPaddingTop = i11;
            refreshChecked();
        }
    }

    public void setItemPosition(int i11) {
        this.itemPosition = i11;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        refreshItemBackground();
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.scaleLabelSizeWithFont = z11;
        setTextAppearanceActive(this.textAppearanceActive);
        setTextAppearanceInactive(this.textAppearanceInactive);
        setHorizontalTextAppearanceActive(this.horizontalTextAppearanceActive);
        setHorizontalTextAppearanceInactive(this.horizontalTextAppearanceInactive);
    }

    public void setLabelMaxLines(int i11) {
        this.smallLabel.setMaxLines(i11);
        this.largeLabel.setMaxLines(i11);
        this.expandedSmallLabel.setMaxLines(i11);
        this.expandedLargeLabel.setMaxLines(i11);
        if (Build.VERSION.SDK_INT > 34) {
            this.smallLabel.setGravity(17);
            this.largeLabel.setGravity(17);
        } else if (i11 > 1) {
            this.smallLabel.setEllipsize(null);
            this.largeLabel.setEllipsize(null);
            this.smallLabel.setGravity(17);
            this.largeLabel.setGravity(17);
        } else {
            this.smallLabel.setGravity(16);
            this.largeLabel.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.labelVisibilityMode != i11) {
            this.labelVisibilityMode = i11;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z11) {
        this.measurePaddingFromBaseline = z11;
        this.labelGroup.setMeasurePaddingFromBaseline(z11);
        this.smallLabel.setIncludeFontPadding(z11);
        this.largeLabel.setIncludeFontPadding(z11);
        this.expandedLabelGroup.setMeasurePaddingFromBaseline(z11);
        this.expandedSmallLabel.setIncludeFontPadding(z11);
        this.expandedLargeLabel.setIncludeFontPadding(z11);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z11) {
        this.onlyShowWhenExpanded = z11;
        updateVisibility();
    }

    public void setShifting(boolean z11) {
        if (this.isShifting != z11) {
            this.isShifting = z11;
            refreshChecked();
        }
    }

    public void setTextAppearanceActive(@StyleRes int i11) {
        this.textAppearanceActive = i11;
        updateActiveLabelTextAppearance(this.largeLabel, i11);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z11) {
        this.boldText = z11;
        setTextAppearanceActive(this.textAppearanceActive);
        setHorizontalTextAppearanceActive(this.horizontalTextAppearanceActive);
        updateActiveLabelBoldness();
    }

    public void setTextAppearanceInactive(@StyleRes int i11) {
        this.textAppearanceInactive = i11;
        updateInactiveLabelTextAppearance(this.smallLabel, i11);
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
            this.expandedSmallLabel.setTextColor(colorStateList);
            this.expandedLargeLabel.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        this.expandedSmallLabel.setText(charSequence);
        this.expandedLargeLabel.setText(charSequence);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.itemData;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    public void updateActiveIndicatorLayoutParams(int i11) {
        if (i11 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.activeIndicatorDesiredWidth, i11 - (this.activeIndicatorMarginHorizontal * 2));
            int iMax = this.activeIndicatorDesiredHeight;
            if (this.itemIconGravity == 1) {
                int measuredWidth = i11 - (this.activeIndicatorExpandedMarginHorizontal * 2);
                int i12 = this.activeIndicatorExpandedDesiredWidth;
                if (i12 != -1) {
                    measuredWidth = i12 == -2 ? this.contentContainer.getMeasuredWidth() : Math.min(i12, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.activeIndicatorExpandedDesiredHeight, this.innerContentContainer.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
            if (isActiveIndicatorResizeableAndUnlabeled()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.activeIndicatorView.setLayoutParams(layoutParams);
        }
    }

    static {
        ACTIVE_INDICATOR_LABELED_TRANSFORM = new ActiveIndicatorTransform();
        ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new ActiveIndicatorUnlabeledTransform();
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.initialized = false;
        this.itemPosition = -1;
        this.textAppearanceActive = 0;
        this.textAppearanceInactive = 0;
        this.horizontalTextAppearanceActive = 0;
        this.horizontalTextAppearanceInactive = 0;
        this.boldText = false;
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorExpandedDesiredWidth = -2;
        this.activeIndicatorExpandedDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        this.activeIndicatorExpandedMarginHorizontal = 0;
        this.badgeFixedEdge = 0;
        this.itemGravity = 49;
        this.expanded = false;
        this.onlyShowWhenExpanded = false;
        this.measurePaddingFromBaseline = false;
        this.scaleLabelSizeWithFont = false;
        this.itemActiveIndicatorExpandedPadding = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.contentContainer = (LinearLayout) findViewById(C7090R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(C7090R.id.navigation_bar_item_inner_content_container);
        this.innerContentContainer = linearLayout;
        this.activeIndicatorView = findViewById(C7090R.id.navigation_bar_item_active_indicator_view);
        this.iconContainer = (FrameLayout) findViewById(C7090R.id.navigation_bar_item_icon_container);
        this.icon = (ImageView) findViewById(C7090R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(C7090R.id.navigation_bar_item_labels_group);
        this.labelGroup = baselineLayout;
        TextView textView = (TextView) findViewById(C7090R.id.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(C7090R.id.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        initializeDefaultExpandedLabelGroupViews();
        this.currentLabelGroup = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = baselineLayout.getPaddingBottom();
        this.activeIndicatorLabelPadding = 0;
        this.iconLabelHorizontalSpacing = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.expandedSmallLabel.setImportantForAccessibility(2);
        this.expandedLargeLabel.setImportantForAccessibility(2);
        setFocusable(true);
        calculateTextScaleFactors();
        this.activeIndicatorExpandedDesiredHeight = getResources().getDimensionPixelSize(C7090R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                NavigationBarItemView.m13136a(this.f11859b, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    private static Drawable createItemBackgroundCompat(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i11 = 0;
        for (int i12 = 0; i12 < iIndexOfChild; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i11++;
            }
        }
        return i11;
    }

    private void initializeDefaultExpandedLabelGroupViews() {
        float dimension = getResources().getDimension(C7090R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(C7090R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.expandedLabelGroup = baselineLayout;
        baselineLayout.setVisibility(8);
        this.expandedLabelGroup.setDuplicateParentStateEnabled(true);
        this.expandedLabelGroup.setMeasurePaddingFromBaseline(this.measurePaddingFromBaseline);
        TextView textView = new TextView(getContext());
        this.expandedSmallLabel = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.expandedSmallLabel;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.expandedSmallLabel.setDuplicateParentStateEnabled(true);
        this.expandedSmallLabel.setIncludeFontPadding(false);
        this.expandedSmallLabel.setGravity(16);
        this.expandedSmallLabel.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.expandedLargeLabel = textView3;
        textView3.setMaxLines(1);
        this.expandedLargeLabel.setEllipsize(truncateAt);
        this.expandedLargeLabel.setDuplicateParentStateEnabled(true);
        this.expandedLargeLabel.setVisibility(4);
        this.expandedLargeLabel.setIncludeFontPadding(false);
        this.expandedLargeLabel.setGravity(16);
        this.expandedLargeLabel.setTextSize(dimension2);
        this.expandedLabelGroup.addView(this.expandedSmallLabel);
        this.expandedLabelGroup.addView(this.expandedLargeLabel);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    private static void setTextAppearanceWithoutFontScaling(TextView textView, @StyleRes int i11) {
        TextViewCompat.setTextAppearance(textView, i11);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i11, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    private static void setViewMarginAndGravity(@NonNull View view, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i12;
        layoutParams.gravity = i13;
        view.setLayoutParams(layoutParams);
    }

    private static void setViewScaleValues(@NonNull View view, float f11, float f12, int i11) {
        view.setScaleX(f11);
        view.setScaleY(f12);
        view.setVisibility(i11);
    }

    private void tryAttachBadgeToAnchor(@Nullable View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view);
        }
    }

    private void tryRemoveBadgeFromAnchor(@Nullable View view) {
        if (!hasBadge()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
        }
        this.badgeDrawable = null;
    }

    private void tryUpdateBadgeBounds(View view) {
        if (!hasBadge()) {
            return;
        }
        BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, null);
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    private static void updateViewPaddingBottom(@NonNull View view, int i11) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
    }

    public void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.itemData.getTitle();
            if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(C7090R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(final int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
            @Override // java.lang.Runnable
            public void run() {
                NavigationBarItemView.this.updateActiveIndicatorLayoutParams(i11);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z11) {
        refreshDrawableState();
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.smallLabel.setEnabled(z11);
        this.largeLabel.setEnabled(z11);
        this.expandedSmallLabel.setEnabled(z11);
        this.expandedLargeLabel.setEnabled(z11);
        this.icon.setEnabled(z11);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable;
        refreshItemBackground();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z11, char c11) {
    }
}
