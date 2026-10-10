package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C7090R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes45.dex */
public class SearchBar extends Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_SearchBar;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private final int backgroundColor;
    private MaterialShapeDrawable backgroundShape;

    @Nullable
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private final AppBarLayout.LiftOnScrollProgressListener liftColorListener;
    private boolean liftOnScroll;

    @Nullable
    private final ColorStateList liftOnScrollColor;
    private int maxWidth;
    private int menuResId;

    @Nullable
    private ActionMenuView menuView;

    @Nullable
    private ImageButton navIconButton;

    @Nullable
    private Integer navigationIconTint;

    @Nullable
    private Drawable originalNavigationIconBackground;
    private final TextView placeholderTextView;
    private final SearchBarAnimationHelper searchBarAnimationHelper;
    private boolean textCentered;
    private final TextView textView;
    private final FrameLayout textViewContainer;
    private final boolean tintNavigationIcon;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String text;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.text);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private void initTextView(@StyleRes int i11, String str, String str2) {
        if (i11 != -1) {
            TextViewCompat.setTextAppearance(this.textView, i11);
            TextViewCompat.setTextAppearance(this.placeholderTextView, i11);
        }
        setText(str);
        setHint(str2);
        setTextCentered(this.textCentered);
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view) {
        return collapse(view, null);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view) {
        return expand(view, null);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.textView.setText(charSequence);
        this.placeholderTextView.setText(charSequence);
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean zOnDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof AppBarLayout)) {
                this.initialized = true;
                setAppBarLayoutTransparent((AppBarLayout) view2);
            }
            return zOnDependentViewChanged;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialSearchBarStyle);
    }

    private int defaultIfZero(int i11, int i12) {
        return i11 == 0 ? i12 : i11;
    }

    @Nullable
    private ActionMenuView findOrGetMenuView() {
        if (this.menuView == null) {
            this.menuView = ToolbarUtils.getActionMenuView(this);
        }
        return this.menuView;
    }

    @Nullable
    private ImageButton findOrGetNavView() {
        if (this.navIconButton == null) {
            this.navIconButton = ToolbarUtils.getNavigationIconButton(this);
        }
        return this.navIconButton;
    }

    private void initBackground(ShapeAppearanceModel shapeAppearanceModel, @ColorInt int i11, float f11, float f12, @ColorInt int i12) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(f11);
        if (f12 >= 0.0f) {
            this.backgroundShape.setStroke(f12, i12);
        }
        int color = MaterialColors.getColor(this, C0467R.attr.colorControlHighlight);
        this.backgroundShape.setFillColor(ColorStateList.valueOf(i11));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
        setBackground(new RippleDrawable(colorStateListValueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    private void layoutViewInCenter(View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i11 = measuredWidth2 + measuredWidth;
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        layoutChild(view, measuredWidth2, measuredHeight2, i11, measuredHeight2 + measuredHeight);
    }

    @Nullable
    private Drawable maybeTintNavigationIcon(@Nullable Drawable drawable) {
        int color;
        if (!this.tintNavigationIcon || drawable == null) {
            return drawable;
        }
        Integer num = this.navigationIconTint;
        if (num != null) {
            color = num.intValue();
        } else {
            color = MaterialColors.getColor(this, drawable == this.defaultNavigationIcon ? C7090R.attr.colorOnSurfaceVariant : C7090R.attr.colorOnSurface);
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        drawableWrap.setTint(color);
        return drawableWrap;
    }

    private void measureCenterView(int i11, int i12) {
        View view = this.centerView;
        if (view != null) {
            view.measure(i11, i12);
        }
    }

    private void setDefaultMargins() {
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C7090R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = defaultIfZero(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = defaultIfZero(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = defaultIfZero(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = defaultIfZero(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void setHandwritingBoundsInsets() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z11 = getLayoutDirection() == 1;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null || !navigationIconButton.isClickable()) {
            width = 0;
        } else {
            width = z11 ? getWidth() - navigationIconButton.getLeft() : navigationIconButton.getRight();
        }
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this);
        if (actionMenuView != null) {
            right = z11 ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft();
        }
        float f11 = -(z11 ? right : width);
        if (!z11) {
            width = right;
        }
        setHandwritingBoundsOffsets(f11, 0.0f, -width, 0.0f);
    }

    private void validateAttributes(@Nullable AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, "title") != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    public void addCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addCollapseAnimationListener(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addExpandAnimationListener(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        this.searchBarAnimationHelper.addOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i11, layoutParams);
    }

    public void clearText() {
        this.textView.setText("");
        this.placeholderTextView.setText("");
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    @Nullable
    public View getCenterView() {
        return this.centerView;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : getElevation();
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    @DimenRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultMarginVerticalResource() {
        return C7090R.dimen.m3_searchbar_margin_vertical;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return C7090R.drawable.ic_search_black_24;
    }

    @Nullable
    public CharSequence getHint() {
        return this.textView.getHint();
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMenuResId() {
        return this.menuResId;
    }

    public TextView getPlaceholderTextView() {
        return this.placeholderTextView;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    @NonNull
    public CharSequence getText() {
        return this.textView.getText();
    }

    public boolean getTextCentered() {
        return this.textCentered;
    }

    @NonNull
    public TextView getTextView() {
        return this.textView;
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.isCollapsing();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.isExpanding();
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.isOnLoadAnimationFadeInEnabled();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13 = this.maxWidth;
        if (i13 >= 0 && i13 < View.MeasureSpec.getSize(i11)) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.maxWidth, View.MeasureSpec.getMode(i11));
        }
        super.onMeasure(i11, i12);
        measureCenterView(i11, i12);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.text = text == null ? null : text.toString();
        return savedState;
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeCollapseAnimationListener(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.searchBarAnimationHelper.removeOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z11) {
        this.defaultScrollFlagsEnabled = z11;
        setOrClearDefaultScrollFlags();
    }

    public void setHint(@StringRes int i11) {
        this.textView.setHint(i11);
    }

    public void setLiftOnScroll(boolean z11) {
        this.liftOnScroll = z11;
        if (z11) {
            addLiftOnScrollProgressListener();
        } else {
            removeLiftOnScrollProgressListener();
        }
    }

    public void setMaxWidth(@Px int i11) {
        if (this.maxWidth != i11) {
            this.maxWidth = i11;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z11) {
        this.searchBarAnimationHelper.setOnLoadAnimationFadeInEnabled(z11);
    }

    public void setPlaceholderText(String str) {
        this.placeholderTextView.setText(str);
    }

    public void setTextCentered(boolean z11) {
        this.textCentered = z11;
        TextView textView = this.textView;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z11) {
            layoutParams.gravity = 1;
            this.textView.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            this.textView.setGravity(0);
        }
        this.textView.setLayoutParams(layoutParams);
        this.placeholderTextView.setLayoutParams(layoutParams);
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: com.google.android.material.search.b
            @Override // java.lang.Runnable
            public final void run() {
                SearchBar searchBar = this.f11867b;
                searchBar.searchBarAnimationHelper.startOnLoadAnimation(searchBar);
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.searchBarAnimationHelper.stopOnLoadAnimation(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.menuResId = -1;
        this.liftColorListener = new AppBarLayout.LiftOnScrollProgressListener() { // from class: com.google.android.material.search.SearchBar.1
            @Override // com.google.android.material.appbar.AppBarLayout.LiftOnScrollProgressListener
            public void onUpdate(float f11, int i13, float f12) {
                if (SearchBar.this.liftOnScrollColor != null) {
                    SearchBar.this.backgroundShape.setFillColor(ColorStateList.valueOf(MaterialColors.layer(SearchBar.this.backgroundColor, SearchBar.this.liftOnScrollColor.getDefaultColor(), f12)));
                }
            }
        };
        Context context2 = getContext();
        validateAttributes(attributeSet);
        this.defaultNavigationIcon = AppCompatResources.getDrawable(context2, getDefaultNavigationIconResource());
        this.searchBarAnimationHelper = new SearchBarAnimationHelper();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C7090R.styleable.SearchBar, i11, i12, new int[0]);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i11, i12).build();
        int color = typedArrayObtainStyledAttributes.getColor(C7090R.styleable.SearchBar_backgroundTint, 0);
        this.backgroundColor = color;
        this.liftOnScrollColor = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C7090R.styleable.SearchBar_liftOnScrollColor);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.SearchBar_elevation, 0.0f);
        this.defaultMarginsEnabled = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchBar_defaultMarginsEnabled, true);
        this.defaultScrollFlagsEnabled = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchBar_hideNavigationIcon, false);
        this.forceDefaultNavigationOnClickListener = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.tintNavigationIcon = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchBar_tintNavigationIcon, true);
        int i13 = C7090R.styleable.SearchBar_navigationIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.navigationIconTint = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i13, -1));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.SearchBar_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(C7090R.styleable.SearchBar_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(C7090R.styleable.SearchBar_android_hint);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(C7090R.styleable.SearchBar_strokeColor, 0);
        this.textCentered = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchBar_textCentered, false);
        this.liftOnScroll = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchBar_liftOnScroll, false);
        this.maxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.SearchBar_android_maxWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (!z11) {
            initNavigationIcon();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(C7090R.layout.mtrl_search_bar, this);
        this.layoutInflated = true;
        this.textView = (TextView) findViewById(C7090R.id.open_search_bar_text_view);
        this.placeholderTextView = (TextView) findViewById(C7090R.id.open_search_bar_placeholder_text_view);
        this.textViewContainer = (FrameLayout) findViewById(C7090R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        initTextView(resourceId, string, string2);
        initBackground(shapeAppearanceModelBuild, color, dimension, dimension2, color2);
    }

    private void addLiftOnScrollProgressListener() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null && this.liftOnScrollColor != null) {
            appBarLayoutParentIfExists.addLiftOnScrollProgressListener(this.liftColorListener);
        }
    }

    @Nullable
    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void initNavigationIcon() {
        Drawable navigationIcon;
        if (getNavigationIcon() == null) {
            navigationIcon = this.defaultNavigationIcon;
        } else {
            navigationIcon = getNavigationIcon();
        }
        setNavigationIcon(navigationIcon);
        setNavigationIconDecorative(true);
    }

    private void layoutChild(View view, int i11, int i12, int i13, int i14) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i13, i12, getMeasuredWidth() - i11, i14);
        } else {
            view.layout(i11, i12, i13, i14);
        }
    }

    private void layoutTextViewCenterAvoidToolbarViewsAndPadding() {
        View view;
        int iMax;
        int iMax2;
        int measuredWidth = (getMeasuredWidth() / 2) - (this.textViewContainer.getMeasuredWidth() / 2);
        int measuredWidth2 = this.textViewContainer.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.textViewContainer.getMeasuredHeight() / 2);
        int measuredHeight2 = this.textViewContainer.getMeasuredHeight() + measuredHeight;
        boolean z11 = true;
        if (getLayoutDirection() != 1) {
            z11 = false;
        }
        View viewFindOrGetMenuView = findOrGetMenuView();
        ImageButton imageButtonFindOrGetNavView = findOrGetNavView();
        int measuredWidth3 = (this.textViewContainer.getMeasuredWidth() / 2) - (this.textView.getMeasuredWidth() / 2);
        int measuredWidth4 = this.textView.getMeasuredWidth() + measuredWidth3;
        int i11 = measuredWidth3 + measuredWidth;
        int i12 = measuredWidth4 + measuredWidth;
        if (z11) {
            view = viewFindOrGetMenuView;
        } else {
            view = imageButtonFindOrGetNavView;
        }
        if (z11) {
            viewFindOrGetMenuView = imageButtonFindOrGetNavView;
        }
        if (view != null) {
            iMax = Math.max(view.getRight() - i11, 0);
        } else {
            iMax = 0;
        }
        int i13 = i11 + iMax;
        int i14 = i12 + iMax;
        if (viewFindOrGetMenuView != null) {
            iMax2 = Math.max(i14 - viewFindOrGetMenuView.getLeft(), 0);
        } else {
            iMax2 = 0;
        }
        int i15 = i13 - iMax2;
        int i16 = i14 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i15, getContentInsetLeft() - i15), 0)) - Math.max(Math.max(i16 - (getMeasuredWidth() - getPaddingRight()), i16 - (getMeasuredWidth() - getContentInsetRight())), 0);
        this.textViewContainer.layout(measuredWidth + iMax3, measuredHeight, measuredWidth2 + iMax3, measuredHeight2);
    }

    private void removeLiftOnScrollProgressListener() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.removeLiftOnScrollProgressListener(this.liftColorListener);
        }
    }

    private void setNavigationIconDecorative(boolean z11) {
        Drawable drawable;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z11);
        navigationIconButton.setFocusable(!z11);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        if (z11) {
            drawable = null;
        } else {
            drawable = this.originalNavigationIconBackground;
        }
        navigationIconButton.setBackgroundDrawable(drawable);
        setHandwritingBoundsInsets();
    }

    private void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z11) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.searchBarAnimationHelper.startCollapseAnimation(this, view, appBarLayout, z11);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z11) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.searchBarAnimationHelper.startExpandAnimation(this, view, appBarLayout, z11);
        return true;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@MenuRes int i11) {
        super.inflateMenu(i11);
        this.menuResId = i11;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.backgroundShape);
        setDefaultMargins();
        setOrClearDefaultScrollFlags();
        if (this.liftOnScroll) {
            addLiftOnScrollProgressListener();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeLiftOnScrollProgressListener();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.centerView;
        if (view != null) {
            layoutViewInCenter(view);
        }
        setHandwritingBoundsInsets();
        if (this.textView != null && this.textCentered) {
            layoutTextViewCenterAvoidToolbarViewsAndPadding();
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f11);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setStrokeColor(@ColorInt int i11) {
        if (getStrokeColor() != i11) {
            this.backgroundShape.setStrokeColor(ColorStateList.valueOf(i11));
        }
    }

    public void setStrokeWidth(@Dimension float f11) {
        if (getStrokeWidth() != f11) {
            this.backgroundShape.setStrokeWidth(f11);
        }
    }

    public void setText(@StringRes int i11) {
        this.textView.setText(i11);
        this.placeholderTextView.setText(i11);
    }

    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
