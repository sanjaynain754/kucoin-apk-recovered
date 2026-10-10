package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C7090R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, MaterialBackHandler {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;

    @NonNull
    private final MaterialBackOrchestrator backOrchestrator;

    @ColorInt
    private final int backgroundColor;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;

    @NonNull
    private TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;

    @Nullable
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final LinearLayout textContainer;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set<TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
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
        int visibility;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface TransitionListener {
        void onStateChanged(@NonNull SearchView searchView, @NonNull TransitionState transitionState, @NonNull TransitionState transitionState2);
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m13157i(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void setUpEditText(@StyleRes int i11, String str, String str2) {
        if (i11 != -1) {
            TextViewCompat.setTextAppearance(this.editText, i11);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpHeaderLayout(int i11) {
        if (i11 != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) this.headerContainer, false));
        }
    }

    @SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z11) {
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z11);
                } else if (z11) {
                    this.childImportantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map<View, Integer> map = this.childImportantForAccessibilityMap;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.childImportantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z11) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z11);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialSearchViewStyle);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13152d(SearchView searchView) {
        searchView.editText.clearFocus();
        ViewUtils.hideKeyboard(searchView.editText, searchView.useWindowInsetsController);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m13153e(SearchView searchView) {
        if (searchView.editText.requestFocus()) {
            searchView.editText.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(searchView.editText, searchView.useWindowInsetsController);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ WindowInsetsCompat m13155g(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(searchView.toolbar);
        int i11 = zIsLayoutRtl ? relativePadding.end : relativePadding.start;
        int i12 = zIsLayoutRtl ? relativePadding.start : relativePadding.end;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        searchView.toolbar.setPadding(i11 + insets.left, relativePadding.top, i12 + insets.right, relativePadding.bottom);
        return windowInsetsCompat;
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(C7090R.dimen.m3_searchview_elevation);
    }

    private boolean isHiddenOrHiding() {
        return this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING);
    }

    private void setStatusBarSpacerEnabledInternal(boolean z11) {
        this.statusBarSpacer.setVisibility(z11 ? 0 : 8);
    }

    private void setTransitionState(@NonNull TransitionState transitionState, boolean z11) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        if (z11) {
            updateModalForAccessibility(transitionState);
        }
        TransitionState transitionState2 = this.currentTransitionState;
        this.currentTransitionState = transitionState;
        Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
        updateListeningForBackCallbacks(transitionState);
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || transitionState != TransitionState.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    private void setUpBackButton(boolean z11, boolean z12) {
        if (z12) {
            this.toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        this.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11882b.hide();
            }
        });
        if (z11) {
            DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
            drawerArrowDrawable.setColor(MaterialColors.getColor(this, C7090R.attr.colorOnSurface));
            this.toolbar.setNavigationIcon(drawerArrowDrawable);
        }
    }

    private void setUpBackgroundViewElevationOverlay(float f11) {
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.backgroundColor, f11));
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.m13154f(this.f11885b, view);
            }
        });
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                SearchView.this.clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.v
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m13151c(this.f11894b, view, motionEvent);
            }
        });
    }

    private void setUpDividerInsetListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i11 = marginLayoutParams.leftMargin;
        final int i12 = marginLayoutParams.rightMargin;
        ViewCompat.setOnApplyWindowInsetsListener(this.divider, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.o
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.m13150b(marginLayoutParams, i11, i12, view, windowInsetsCompat);
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
        this.rootView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.u
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m13157i(view, motionEvent);
            }
        });
    }

    private void setUpStatusBarSpacer(@Px int i11) {
        if (this.statusBarSpacer.getLayoutParams().height != i11) {
            this.statusBarSpacer.getLayoutParams().height = i11;
            this.statusBarSpacer.requestLayout();
        }
    }

    private void setUpToolbarInsetListener() {
        ViewUtils.doOnApplyWindowInsets(this.toolbar, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.q
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                return SearchView.m13155g(this.f11890a, view, windowInsetsCompat, relativePadding);
            }
        });
    }

    private void updateListeningForBackCallbacks(@NonNull TransitionState transitionState) {
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.backOrchestrator.startListeningForBackCallbacks();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.backOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private void updateModalForAccessibility(@NonNull TransitionState transitionState) {
        if (transitionState == TransitionState.SHOWN) {
            setModalForAccessibility(true);
        } else if (transitionState == TransitionState.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(AppCompatResources.getDrawable(getContext(), defaultNavigationIconResource).mutate());
        if (this.toolbar.getNavigationIconTint() != null) {
            drawableWrap.setTint(this.toolbar.getNavigationIconTint().intValue());
        }
        DrawableCompat.setLayoutDirection(drawableWrap, getLayoutDirection());
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), drawableWrap));
        updateNavigationIconProgressIfNeeded();
    }

    private void updateNavigationIconProgressIfNeeded() {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        int i11 = this.rootView.getVisibility() == 0 ? 1 : 0;
        Drawable drawableUnwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (drawableUnwrap instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawableUnwrap).setProgress(i11);
        }
        if (drawableUnwrap instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawableUnwrap).setProgress(i11);
        }
    }

    public void addHeaderView(@NonNull View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(@NonNull TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i11, layoutParams);
        } else {
            super.addView(view, i11, layoutParams);
        }
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new Runnable() { // from class: com.google.android.material.search.l
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.m13152d(this.f11883b);
            }
        });
    }

    public void clearText() {
        this.editText.setText("");
    }

    @VisibleForTesting
    public MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.getBackHelper();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return C7090R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.editText;
    }

    @Nullable
    public CharSequence getHint() {
        return this.editText.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.softInputMode;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.editText.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.toolbar;
    }

    public void hide() {
        if (this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING)) {
            return;
        }
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.searchViewAnimationHelper.hide();
            return;
        }
        this.searchBar.setPlaceholderText(this.editText.getText().toString());
        SearchBar searchBar2 = this.searchBar;
        final SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
        Objects.requireNonNull(searchViewAnimationHelper);
        searchBar2.post(new Runnable() { // from class: com.google.android.material.search.m
            @Override // java.lang.Runnable
            public final void run() {
                searchViewAnimationHelper.hide();
            }
        });
    }

    public void inflateMenu(@MenuRes int i11) {
        this.toolbar.inflateMenu(i11);
    }

    public boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        return this.searchBar != null;
    }

    public boolean isShowing() {
        return this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        setVisible(savedState.visibility == 0);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.text = text == null ? null : text.toString();
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(@NonNull View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeTransitionListener(@NonNull TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new Runnable() { // from class: com.google.android.material.search.p
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.m13153e(this.f11889b);
            }
        }, TALKBACK_FOCUS_CHANGE_DELAY_MS);
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void setAnimatedNavigationIcon(boolean z11) {
        this.animatedNavigationIcon = z11;
    }

    public void setAutoShowKeyboard(boolean z11) {
        this.autoShowKeyboard = z11;
    }

    public void setHint(@StringRes int i11) {
        this.editText.setHint(i11);
    }

    public void setMenuItemsAnimated(boolean z11) {
        this.animatedMenuItems = z11;
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        this.searchPrefix.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setText(@StringRes int i11) {
        this.editText.setText(i11);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z11) {
        this.toolbar.setTouchscreenBlocksFocus(z11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z11) {
        this.useWindowInsetsController = z11;
    }

    public void setVisible(boolean z11) {
        boolean z12 = this.rootView.getVisibility() == 0;
        this.rootView.setVisibility(z11 ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        setTransitionState(z11 ? TransitionState.SHOWN : TransitionState.HIDDEN, z12 != z11);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.setSearchBar(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11892b.show();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: com.google.android.material.search.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11893b.show();
                        }
                    });
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
        updateListeningForBackCallbacks(getCurrentTransitionState());
    }

    public void show() {
        if (this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING)) {
            return;
        }
        this.searchViewAnimationHelper.show();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.transitionListeners = new LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C7090R.styleable.SearchView, i11, i12, new int[0]);
        this.backgroundColor = typedArrayObtainStyledAttributes.getColor(C7090R.styleable.SearchView_backgroundTint, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.SearchView_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(C7090R.styleable.SearchView_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(C7090R.styleable.SearchView_android_hint);
        String string3 = typedArrayObtainStyledAttributes.getString(C7090R.styleable.SearchView_searchPrefixText);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.animatedNavigationIcon = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchView_animateNavigationIcon, true);
        this.animatedMenuItems = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchView_animateMenuItems, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchView_hideNavigationIcon, false);
        this.autoShowKeyboard = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchView_autoShowKeyboard, true);
        this.backHandlingEnabled = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SearchView_backHandlingEnabled, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(C7090R.layout.mtrl_search_view, this);
        this.layoutInflated = true;
        this.scrim = findViewById(C7090R.id.open_search_view_scrim);
        this.rootView = (ClippableRoundedCornerLayout) findViewById(C7090R.id.open_search_view_root);
        this.backgroundView = findViewById(C7090R.id.open_search_view_background);
        this.statusBarSpacer = findViewById(C7090R.id.open_search_view_status_bar_spacer);
        this.headerContainer = (FrameLayout) findViewById(C7090R.id.open_search_view_header_container);
        this.toolbarContainer = (FrameLayout) findViewById(C7090R.id.open_search_view_toolbar_container);
        this.toolbar = (MaterialToolbar) findViewById(C7090R.id.open_search_view_toolbar);
        this.dummyToolbar = (Toolbar) findViewById(C7090R.id.open_search_view_dummy_toolbar);
        this.searchPrefix = (TextView) findViewById(C7090R.id.open_search_view_search_prefix);
        this.textContainer = (LinearLayout) findViewById(C7090R.id.open_search_view_text_container);
        this.editText = (EditText) findViewById(C7090R.id.open_search_view_edit_text);
        this.clearButton = (ImageButton) findViewById(C7090R.id.open_search_view_clear_button);
        this.divider = findViewById(C7090R.id.open_search_view_divider);
        this.contentContainer = (TouchObserverFrameLayout) findViewById(C7090R.id.open_search_view_content_container);
        this.searchViewAnimationHelper = new SearchViewAnimationHelper(this);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        setUpRootView();
        setUpBackgroundViewElevationOverlay();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        setUpEditText(resourceId2, string, string2);
        setUpBackButton(z11, z12);
        setUpClearButton();
        setUpContentOnTouchListener();
        setUpInsetListeners();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WindowInsetsCompat m13150b(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        marginLayoutParams.leftMargin = i11 + insets.left;
        marginLayoutParams.rightMargin = i12 + insets.right;
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m13151c(SearchView searchView, View view, MotionEvent motionEvent) {
        if (searchView.isAdjustNothingSoftInputMode()) {
            searchView.clearFocusAndHideKeyboard();
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m13154f(SearchView searchView, View view) {
        searchView.clearText();
        searchView.requestFocusAndShowKeyboardIfNeeded();
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ WindowInsetsCompat m13156h(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z11;
        searchView.getClass();
        int i11 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout()).top;
        searchView.setUpStatusBarSpacer(i11);
        if (!searchView.statusBarSpacerEnabledOverride) {
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            searchView.setStatusBarSpacerEnabledInternal(z11);
        }
        return windowInsetsCompat;
    }

    private boolean isNavigationIconDrawerArrowDrawable(@NonNull Toolbar toolbar) {
        return DrawableCompat.unwrap(toolbar.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.setOnApplyWindowInsetsListener(this.statusBarSpacer, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.r
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.m13156h(this.f11891b, view, windowInsetsCompat);
            }
        });
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (!isHiddenOrHiding() && this.searchBar != null && Build.VERSION.SDK_INT >= 34) {
            this.searchViewAnimationHelper.cancelBackProgress();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = this.searchViewAnimationHelper.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT >= 34 && this.searchBar != null && backEventCompatOnHandleBackInvoked != null) {
            this.searchViewAnimationHelper.finishBackProgress();
        } else {
            hide();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        TransitionState currentTransitionState = getCurrentTransitionState();
        updateModalForAccessibility(currentTransitionState);
        updateListeningForBackCallbacks(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.backOrchestrator.stopListeningForBackCallbacks();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        setUpBackgroundViewElevationOverlay(f11);
    }

    public void setModalForAccessibility(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z11) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z11);
        if (!z11) {
            this.childImportantForAccessibilityMap = null;
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        SearchBar searchBar;
        if (!isHiddenOrHiding() && (searchBar = this.searchBar) != null) {
            if (searchBar != null) {
                searchBar.setPlaceholderText(this.editText.getText().toString());
            }
            this.searchViewAnimationHelper.startBackProgress(backEventCompat);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (!isHiddenOrHiding() && this.searchBar != null && Build.VERSION.SDK_INT >= 34) {
            this.searchViewAnimationHelper.updateBackProgress(backEventCompat);
        }
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }
}
