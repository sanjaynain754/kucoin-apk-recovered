package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes45.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int COLLAPSED_TITLE_GRAVITY_AVAILABLE_SPACE = 1;
    private static final int COLLAPSED_TITLE_GRAVITY_ENTIRE_SPACE = 0;
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    private final int collapsedTitleGravityMode;

    @NonNull
    final CollapsingTextHelper collapsingSubtitleHelper;
    private boolean collapsingTitleEnabled;

    @NonNull
    final CollapsingTextHelper collapsingTitleHelper;

    @Nullable
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;

    @NonNull
    final ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int expandedTitleSpacing;
    private int extraHeightForTitles;
    private boolean extraMultilineHeightEnabled;
    private int extraMultilineSubtitleHeight;
    private int extraMultilineTitleHeight;
    private boolean forceApplySystemWindowInsetTop;

    @Nullable
    WindowInsetsCompat lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int screenOrientation;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;

    @Nullable
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;

    @Nullable
    private ViewGroup toolbar;

    @Nullable
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CollapsedTitleGravityMode {
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i11) {
            this.collapseMode = i11;
        }

        public void setParallaxMultiplier(float f11) {
            this.parallaxMult = f11;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i11, int i12, int i13) {
            super(i11, i12, i13);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }
    }

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i11;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.lastInsets;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i13 = layoutParams.collapseMode;
                if (i13 == 1) {
                    viewOffsetHelper.setTopAndBottomOffset(MathUtils.clamp(-i11, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i13 == 2) {
                    viewOffsetHelper.setTopAndBottomOffset(Math.round((-i11) * layoutParams.parallaxMult));
                }
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && systemWindowInsetTop > 0) {
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int minimumHeight = (height - CollapsingToolbarLayout.this.getMinimumHeight()) - systemWindowInsetTop;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            int i14 = CollapsingToolbarLayout.this.currentOffset + minimumHeight;
            float f11 = minimumHeight;
            float fAbs = Math.abs(i11) / f11;
            float f12 = scrimVisibleHeightTrigger / f11;
            CollapsingToolbarLayout.this.collapsingTitleHelper.setFadeModeStartFraction(Math.min(1.0f, f12));
            CollapsingToolbarLayout.this.collapsingTitleHelper.setCurrentOffsetY(i14);
            CollapsingToolbarLayout.this.collapsingTitleHelper.setExpansionFraction(fAbs);
            CollapsingToolbarLayout.this.collapsingSubtitleHelper.setFadeModeStartFraction(Math.min(1.0f, f12));
            CollapsingToolbarLayout.this.collapsingSubtitleHelper.setCurrentOffsetY(i14);
            CollapsingToolbarLayout.this.collapsingSubtitleHelper.setExpansionFraction(fAbs);
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void updateContentScrimBounds(@NonNull Drawable drawable, int i11, int i12) {
        updateContentScrimBounds(drawable, this.toolbar, i11, i12);
    }

    public void setCollapsedSubtitleTextColor(@ColorInt int i11) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setCollapsedTitleTextColor(@ColorInt int i11) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setScrimsShown(boolean z11) {
        setScrimsShown(z11, isLaidOut() && !isInEditMode());
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.collapsingToolbarLayoutStyle);
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i11) {
        if (i11 == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i11 != 1) {
            return i11 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            ViewGroup viewGroup = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i11 = this.toolbarId;
            if (i11 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i11);
                this.toolbar = viewGroup2;
                if (viewGroup2 != null) {
                    this.toolbarDirectChild = findDirectChild(viewGroup2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (isToolbar(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.toolbar = viewGroup;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    @Nullable
    private static CharSequence getToolbarSubtitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getSubtitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getSubtitle();
        }
        return null;
    }

    @Nullable
    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    public static ViewOffsetHelper getViewOffsetHelper(@NonNull View view) {
        int i11 = C7090R.id.view_offset_helper;
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(i11);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(i11, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            return view == this.toolbar;
        }
        return view == view2;
    }

    private void updateCollapsedBounds(boolean z11) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        Rect rect = this.tmpRect;
        int i11 = rect.left + (z11 ? titleMarginEnd : titleMarginStart);
        int i12 = rect.right - (z11 ? titleMarginStart : titleMarginEnd);
        int i13 = rect.top + maxOffsetForPinChild + titleMarginTop;
        int i14 = (rect.bottom + maxOffsetForPinChild) - titleMarginBottom;
        int collapsedFullSingleLineHeight = (int) (i14 - this.collapsingSubtitleHelper.getCollapsedFullSingleLineHeight());
        int collapsedFullSingleLineHeight2 = (int) (i13 + this.collapsingTitleHelper.getCollapsedFullSingleLineHeight());
        if (TextUtils.isEmpty(this.collapsingSubtitleHelper.getText())) {
            this.collapsingTitleHelper.setCollapsedBounds(i11, i13, i12, i14);
        } else {
            this.collapsingTitleHelper.setCollapsedBounds(i11, i13, i12, collapsedFullSingleLineHeight);
            this.collapsingSubtitleHelper.setCollapsedBounds(i11, collapsedFullSingleLineHeight2, i12, i14);
        }
        if (this.collapsedTitleGravityMode == 0) {
            DescendantOffsetUtils.getDescendantRect(this, this, this.tmpRect);
            Rect rect2 = this.tmpRect;
            int i15 = rect2.left + (z11 ? titleMarginEnd : titleMarginStart);
            int i16 = rect2.right;
            if (!z11) {
                titleMarginStart = titleMarginEnd;
            }
            int i17 = i16 - titleMarginStart;
            if (TextUtils.isEmpty(this.collapsingSubtitleHelper.getText())) {
                this.collapsingTitleHelper.setCollapsedBoundsForOffsets(i15, i13, i17, i14);
            } else {
                this.collapsingTitleHelper.setCollapsedBoundsForOffsets(i15, i13, i17, collapsedFullSingleLineHeight);
                this.collapsingSubtitleHelper.setCollapsedBoundsForOffsets(i15, collapsedFullSingleLineHeight2, i17, i14);
            }
        }
    }

    private void updateContentScrimBounds(@NonNull Drawable drawable, @Nullable View view, int i11, int i12) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i12 = view.getBottom();
        }
        drawable.setBounds(0, 0, i11, i12);
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    private void updateTextBounds(int i11, int i12, int i13, int i14, boolean z11) {
        View view;
        if (!this.collapsingTitleEnabled || (view = this.dummyView) == null) {
            return;
        }
        boolean z12 = view.isAttachedToWindow() && this.dummyView.getVisibility() == 0;
        this.drawCollapsingTitle = z12;
        if (z12 || z11) {
            boolean z13 = getLayoutDirection() == 1;
            updateCollapsedBounds(z13);
            int i15 = z13 ? this.expandedMarginEnd : this.expandedMarginStart;
            int i16 = this.tmpRect.top + this.expandedMarginTop;
            int i17 = (i13 - i11) - (z13 ? this.expandedMarginStart : this.expandedMarginEnd);
            int i18 = (i14 - i12) - this.expandedMarginBottom;
            if (TextUtils.isEmpty(this.collapsingSubtitleHelper.getText())) {
                this.collapsingTitleHelper.setExpandedBounds(i15, i16, i17, i18);
                this.collapsingTitleHelper.recalculate(z11);
            } else {
                this.collapsingTitleHelper.setExpandedBounds(i15, i16, i17, (int) ((i18 - (this.collapsingSubtitleHelper.getExpandedTextFullSingleLineHeight() + this.extraMultilineSubtitleHeight)) - this.expandedTitleSpacing), false);
                this.collapsingSubtitleHelper.setExpandedBounds(i15, (int) (i16 + this.collapsingTitleHelper.getExpandedTextFullSingleLineHeight() + this.extraMultilineTitleHeight + this.expandedTitleSpacing), i17, i18, false);
                this.collapsingTitleHelper.recalculate(z11);
                this.collapsingSubtitleHelper.recalculate(z11);
            }
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup == null || !this.collapsingTitleEnabled) {
            return;
        }
        CharSequence toolbarTitle = getToolbarTitle(viewGroup);
        if (TextUtils.isEmpty(this.collapsingTitleHelper.getText()) && !TextUtils.isEmpty(toolbarTitle)) {
            setTitle(toolbarTitle);
        }
        CharSequence toolbarSubtitle = getToolbarSubtitle(this.toolbar);
        if (!TextUtils.isEmpty(this.collapsingSubtitleHelper.getText()) || TextUtils.isEmpty(toolbarSubtitle)) {
            return;
        }
        setSubtitle(toolbarSubtitle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        boolean z11;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z11 = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z11 = true;
        }
        return super.drawChild(canvas, view, j11) || z11;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.collapsingSubtitleHelper.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedSubtitleTypeface() {
        return this.collapsingSubtitleHelper.getCollapsedTypeface();
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTitleHelper.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTitleHelper.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTitleHelper.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public float getExpandedSubtitleTextSize() {
        return this.collapsingSubtitleHelper.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedSubtitleTypeface() {
        return this.collapsingSubtitleHelper.getExpandedTypeface();
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTitleHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public int getExpandedTitleSpacing() {
        return this.expandedTitleSpacing;
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTitleHelper.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTitleHelper.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.collapsingTitleHelper.getHyphenationFrequency();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.collapsingTitleHelper.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.collapsingTitleHelper.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.collapsingTitleHelper.getLineSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.collapsingTitleHelper.getExpandedMaxLines();
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i11 = this.scrimVisibleHeightTrigger;
        if (i11 >= 0) {
            return i11 + this.topInsetApplied + this.extraMultilineTitleHeight + this.extraMultilineSubtitleHeight + this.extraHeightForTitles;
        }
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @Nullable
    public CharSequence getSubtitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingSubtitleHelper.getText();
        }
        return null;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTitleHelper.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTitleHelper.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTitleHelper.getTitleTextEllipsize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTitleHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    public void setCollapsedSubtitleTextAppearance(@StyleRes int i11) {
        this.collapsingSubtitleHelper.setCollapsedTextAppearance(i11);
    }

    public void setCollapsedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingSubtitleHelper.setCollapsedTextColor(colorStateList);
    }

    public void setCollapsedSubtitleTextSize(float f11) {
        this.collapsingSubtitleHelper.setCollapsedTextSize(f11);
    }

    public void setCollapsedSubtitleTypeface(@Nullable Typeface typeface) {
        this.collapsingSubtitleHelper.setCollapsedTypeface(typeface);
    }

    public void setCollapsedTitleGravity(int i11) {
        this.collapsingTitleHelper.setCollapsedTextGravity(i11);
        this.collapsingSubtitleHelper.setCollapsedTextGravity(i11);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i11) {
        this.collapsingTitleHelper.setCollapsedTextAppearance(i11);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTitleHelper.setCollapsedTextColor(colorStateList);
    }

    public void setCollapsedTitleTextSize(float f11) {
        this.collapsingTitleHelper.setCollapsedTextSize(f11);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTitleHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = drawableMutate;
            if (drawableMutate != null) {
                updateContentScrimBounds(drawableMutate, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(@ColorInt int i11) {
        setContentScrim(new ColorDrawable(i11));
    }

    public void setExpandedSubtitleTextAppearance(@StyleRes int i11) {
        this.collapsingSubtitleHelper.setExpandedTextAppearance(i11);
    }

    public void setExpandedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingSubtitleHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedSubtitleTextSize(float f11) {
        this.collapsingSubtitleHelper.setExpandedTextSize(f11);
    }

    public void setExpandedSubtitleTypeface(@Nullable Typeface typeface) {
        this.collapsingSubtitleHelper.setExpandedTypeface(typeface);
    }

    public void setExpandedTitleGravity(int i11) {
        this.collapsingTitleHelper.setExpandedTextGravity(i11);
        this.collapsingSubtitleHelper.setExpandedTextGravity(i11);
    }

    public void setExpandedTitleMargin(int i11, int i12, int i13, int i14) {
        this.expandedMarginStart = i11;
        this.expandedMarginTop = i12;
        this.expandedMarginEnd = i13;
        this.expandedMarginBottom = i14;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i11) {
        this.expandedMarginBottom = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i11) {
        this.expandedMarginEnd = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i11) {
        this.expandedMarginStart = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i11) {
        this.expandedMarginTop = i11;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i11) {
        this.expandedTitleSpacing = i11;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i11) {
        this.collapsingTitleHelper.setExpandedTextAppearance(i11);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTitleHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f11) {
        this.collapsingTitleHelper.setExpandedTextSize(f11);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTitleHelper.setExpandedTypeface(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z11) {
        this.extraMultilineHeightEnabled = z11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z11) {
        this.forceApplySystemWindowInsetTop = z11;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i11) {
        this.collapsingTitleHelper.setHyphenationFrequency(i11);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f11) {
        this.collapsingTitleHelper.setLineSpacingAdd(f11);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f11) {
        this.collapsingTitleHelper.setLineSpacingMultiplier(f11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i11) {
        this.collapsingTitleHelper.setExpandedMaxLines(i11);
        this.collapsingSubtitleHelper.setExpandedMaxLines(i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z11) {
        this.collapsingTitleHelper.setRtlTextDirectionHeuristicsEnabled(z11);
    }

    public void setScrimAlpha(int i11) {
        ViewGroup viewGroup;
        if (i11 != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.scrimAlpha = i11;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j11) {
        this.scrimAnimationDuration = j11;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i11) {
        if (this.scrimVisibleHeightTrigger != i11) {
            this.scrimVisibleHeightTrigger = i11;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z11, boolean z12) {
        if (this.scrimsAreShown != z11) {
            if (z12) {
                animateScrim(z11 ? 255 : 0);
            } else {
                setScrimAlpha(z11 ? 255 : 0);
            }
            this.scrimsAreShown = z11;
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.collapsingTitleHelper.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.statusBarScrim, getLayoutDirection());
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i11) {
        setStatusBarScrim(new ColorDrawable(i11));
    }

    public void setSubtitle(@Nullable CharSequence charSequence) {
        this.collapsingSubtitleHelper.setText(charSequence);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.collapsingTitleHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int i11) {
        this.titleCollapseMode = i11;
        boolean zIsTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTitleHelper.setFadeModeEnabled(zIsTitleCollapseFadeMode);
        this.collapsingSubtitleHelper.setFadeModeEnabled(zIsTitleCollapseFadeMode);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (zIsTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.collapsingTitleHelper.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z11) {
        if (z11 != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z11;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.collapsingTitleHelper.setPositionInterpolator(timeInterpolator);
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.refreshToolbar = true;
        this.tmpRect = new Rect();
        this.scrimVisibleHeightTrigger = -1;
        this.topInsetApplied = 0;
        this.extraMultilineTitleHeight = 0;
        this.extraMultilineSubtitleHeight = 0;
        this.extraHeightForTitles = 0;
        Context context2 = getContext();
        this.screenOrientation = getResources().getConfiguration().orientation;
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTitleHelper = collapsingTextHelper;
        TimeInterpolator timeInterpolator = AnimationUtils.DECELERATE_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C7090R.styleable.CollapsingToolbarLayout, i11, i12, new int[0]);
        int i13 = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        int i14 = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.collapsedTitleGravityMode = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.CollapsingToolbarLayout_collapsedTitleGravityMode, 1);
        collapsingTextHelper.setExpandedTextGravity(i13);
        collapsingTextHelper.setCollapsedTextGravity(i14);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.expandedMarginBottom = dimensionPixelSize;
        this.expandedMarginEnd = dimensionPixelSize;
        this.expandedMarginTop = dimensionPixelSize;
        this.expandedMarginStart = dimensionPixelSize;
        int i15 = C7090R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.expandedMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, 0);
        }
        int i16 = C7090R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.expandedMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(i16, 0);
        }
        int i17 = C7090R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            this.expandedMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(i17, 0);
        }
        int i18 = C7090R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            this.expandedMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(i18, 0);
        }
        int i19 = C7090R.styleable.CollapsingToolbarLayout_expandedTitleSpacing;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            this.expandedTitleSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(i19, 0);
        }
        this.collapsingTitleEnabled = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(C7090R.styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper.setExpandedTextAppearance(C7090R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.setCollapsedTextAppearance(C0467R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        int i21 = C7090R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i21, 0));
        }
        int i22 = C7090R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i22, 0));
        }
        int i23 = C7090R.styleable.CollapsingToolbarLayout_titleTextEllipsize;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            setTitleEllipsize(convertEllipsizeToTruncateAt(typedArrayObtainStyledAttributes.getInt(i23, -1)));
        }
        int i24 = C7090R.styleable.CollapsingToolbarLayout_expandedTitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            collapsingTextHelper.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i24));
        }
        int i25 = C7090R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i25)) {
            collapsingTextHelper.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i25));
        }
        this.scrimVisibleHeightTrigger = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        int i26 = C7090R.styleable.CollapsingToolbarLayout_titleMaxLines;
        if (typedArrayObtainStyledAttributes.hasValue(i26)) {
            collapsingTextHelper.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(i26, 1));
        } else {
            int i27 = C7090R.styleable.CollapsingToolbarLayout_maxLines;
            if (typedArrayObtainStyledAttributes.hasValue(i27)) {
                collapsingTextHelper.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(i27, 1));
            }
        }
        int i28 = C7090R.styleable.CollapsingToolbarLayout_titlePositionInterpolator;
        if (typedArrayObtainStyledAttributes.hasValue(i28)) {
            collapsingTextHelper.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(i28, 0)));
        }
        CollapsingTextHelper collapsingTextHelper2 = new CollapsingTextHelper(this);
        this.collapsingSubtitleHelper = collapsingTextHelper2;
        collapsingTextHelper2.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper2.setRtlTextDirectionHeuristicsEnabled(false);
        int i29 = C7090R.styleable.CollapsingToolbarLayout_subtitle;
        if (typedArrayObtainStyledAttributes.hasValue(i29)) {
            setSubtitle(typedArrayObtainStyledAttributes.getText(i29));
        }
        collapsingTextHelper2.setExpandedTextGravity(i13);
        collapsingTextHelper2.setCollapsedTextGravity(i14);
        collapsingTextHelper2.setExpandedTextAppearance(C0467R.style.TextAppearance_AppCompat_Headline);
        collapsingTextHelper2.setCollapsedTextAppearance(C0467R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        int i31 = C7090R.styleable.CollapsingToolbarLayout_expandedSubtitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i31)) {
            collapsingTextHelper2.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i31, 0));
        }
        int i32 = C7090R.styleable.CollapsingToolbarLayout_collapsedSubtitleTextAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i32)) {
            collapsingTextHelper2.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(i32, 0));
        }
        int i33 = C7090R.styleable.CollapsingToolbarLayout_expandedSubtitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i33)) {
            collapsingTextHelper2.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i33));
        }
        int i34 = C7090R.styleable.CollapsingToolbarLayout_collapsedSubtitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i34)) {
            collapsingTextHelper2.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i34));
        }
        int i35 = C7090R.styleable.CollapsingToolbarLayout_subtitleMaxLines;
        if (typedArrayObtainStyledAttributes.hasValue(i35)) {
            collapsingTextHelper2.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(i35, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(i28)) {
            collapsingTextHelper2.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(i28, 0)));
        }
        this.scrimAnimationDuration = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        int i36 = C7090R.attr.motionEasingStandardInterpolator;
        this.scrimAnimationFadeInInterpolator = MotionUtils.resolveThemeInterpolator(context2, i36, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        this.scrimAnimationFadeOutInterpolator = MotionUtils.resolveThemeInterpolator(context2, i36, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(C7090R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(C7090R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(C7090R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.toolbarId = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.forceApplySystemWindowInsetTop = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.extraMultilineHeightEnabled = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                return CollapsingToolbarLayout.this.onWindowInsetChanged(windowInsetsCompat);
            }
        });
    }

    private void animateScrim(int i11) {
        TimeInterpolator timeInterpolator;
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            if (i11 > this.scrimAlpha) {
                timeInterpolator = this.scrimAnimationFadeInInterpolator;
            } else {
                timeInterpolator = this.scrimAnimationFadeOutInterpolator;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i11);
        this.scrimAnimator.start();
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    @NonNull
    private View findDirectChild(@NonNull View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), C7090R.attr.colorSurfaceContainer);
        if (colorStateListOrNull != null) {
            return colorStateListOrNull.getDefaultColor();
        }
        return this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(C7090R.dimen.design_appbar_elevation));
    }

    private static int getHeightWithMargins(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int systemWindowInsetTop;
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar != null && this.contentScrim != null && this.scrimAlpha > 0 && isTitleCollapseFadeMode() && this.collapsingTitleHelper.getExpansionFraction() < this.collapsingTitleHelper.getFadeModeThresholdFraction()) {
                int iSave = canvas.save();
                canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                this.collapsingTitleHelper.draw(canvas);
                this.collapsingSubtitleHelper.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                this.collapsingTitleHelper.draw(canvas);
                this.collapsingSubtitleHelper.draw(canvas);
            }
        }
        if (this.statusBarScrim != null && this.scrimAlpha > 0) {
            WindowInsetsCompat windowInsetsCompat = this.lastInsets;
            if (windowInsetsCompat != null) {
                systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), systemWindowInsetTop - this.currentOffset);
                this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
                this.statusBarScrim.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean state;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        } else {
            state = false;
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTitleHelper;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final int getMaxOffsetForPinChild(@NonNull View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTitleHelper.maybeUpdateFontWeightAdjustment(configuration);
        if (this.screenOrientation != configuration.orientation && this.extraMultilineHeightEnabled && this.collapsingTitleHelper.getExpansionFraction() == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.screenOrientation = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            getViewOffsetHelper(getChildAt(i16)).onViewLayout();
        }
        updateTextBounds(i11, i12, i13, i14, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i17 = 0; i17 < childCount3; i17++) {
            getViewOffsetHelper(getChildAt(i17)).applyOffsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int systemWindowInsetTop;
        CollapsingToolbarLayout collapsingToolbarLayout;
        float expandedTextFullSingleLineHeight;
        ensureToolbar();
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            systemWindowInsetTop = 0;
        }
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && systemWindowInsetTop > 0) {
            this.topInsetApplied = systemWindowInsetTop;
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
        }
        updateTitleFromToolbarIfNeeded();
        if (this.collapsingTitleEnabled && !TextUtils.isEmpty(this.collapsingTitleHelper.getText())) {
            int measuredHeight = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.updateTextBounds(0, 0, getMeasuredWidth(), measuredHeight, true);
            float expandedTextFullSingleLineHeight2 = collapsingToolbarLayout.topInsetApplied + collapsingToolbarLayout.expandedMarginTop + collapsingToolbarLayout.collapsingTitleHelper.getExpandedTextFullSingleLineHeight();
            if (TextUtils.isEmpty(collapsingToolbarLayout.collapsingSubtitleHelper.getText())) {
                expandedTextFullSingleLineHeight = 0.0f;
            } else {
                expandedTextFullSingleLineHeight = collapsingToolbarLayout.expandedTitleSpacing + collapsingToolbarLayout.collapsingSubtitleHelper.getExpandedTextFullSingleLineHeight();
            }
            int i13 = (int) (expandedTextFullSingleLineHeight2 + expandedTextFullSingleLineHeight + collapsingToolbarLayout.expandedMarginBottom);
            if (i13 > measuredHeight) {
                collapsingToolbarLayout.extraHeightForTitles = i13 - measuredHeight;
            } else {
                collapsingToolbarLayout.extraHeightForTitles = 0;
            }
            if (collapsingToolbarLayout.extraMultilineHeightEnabled) {
                if (collapsingToolbarLayout.collapsingTitleHelper.getExpandedMaxLines() > 1) {
                    int expandedLineCount = collapsingToolbarLayout.collapsingTitleHelper.getExpandedLineCount();
                    if (expandedLineCount > 1) {
                        collapsingToolbarLayout.extraMultilineTitleHeight = Math.round(collapsingToolbarLayout.collapsingTitleHelper.getExpandedTextFullSingleLineHeight()) * (expandedLineCount - 1);
                    } else {
                        collapsingToolbarLayout.extraMultilineTitleHeight = 0;
                    }
                }
                if (collapsingToolbarLayout.collapsingSubtitleHelper.getExpandedMaxLines() > 1) {
                    int expandedLineCount2 = collapsingToolbarLayout.collapsingSubtitleHelper.getExpandedLineCount();
                    if (expandedLineCount2 > 1) {
                        collapsingToolbarLayout.extraMultilineSubtitleHeight = Math.round(collapsingToolbarLayout.collapsingSubtitleHelper.getExpandedTextFullSingleLineHeight()) * (expandedLineCount2 - 1);
                    } else {
                        collapsingToolbarLayout.extraMultilineSubtitleHeight = 0;
                    }
                }
            }
            int i14 = collapsingToolbarLayout.extraHeightForTitles;
            int i15 = collapsingToolbarLayout.extraMultilineTitleHeight;
            int i16 = collapsingToolbarLayout.extraMultilineSubtitleHeight;
            if (i14 + i15 + i16 > 0) {
                super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(measuredHeight + i14 + i15 + i16, 1073741824));
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.toolbar;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.toolbarDirectChild;
            if (view != null && view != collapsingToolbarLayout) {
                setMinimumHeight(getHeightWithMargins(view));
            } else {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i11, i12);
        }
    }

    public WindowInsetsCompat onWindowInsetChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (getFitsSystemWindows()) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    public void setContentScrimResource(@DrawableRes int i11) {
        setContentScrim(getContext().getDrawable(i11));
    }

    public void setExpandedSubtitleColor(@ColorInt int i11) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setExpandedTitleColor(@ColorInt int i11) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setStatusBarScrimResource(@DrawableRes int i11) {
        setStatusBarScrim(getContext().getDrawable(i11));
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        boolean z11;
        super.setVisibility(i11);
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z11) {
            this.statusBarScrim.setVisible(z11, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isVisible() != z11) {
            this.contentScrim.setVisible(z11, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.contentScrim && drawable != this.statusBarScrim) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
