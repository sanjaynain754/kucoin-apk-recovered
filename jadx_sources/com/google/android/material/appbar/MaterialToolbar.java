package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0467R;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.C7090R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes45.dex */
public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    @Nullable
    private Boolean logoAdjustViewBounds;

    @Nullable
    private ImageView.ScaleType logoScaleType;

    @Nullable
    private Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    public void clearNavigationIconTint() {
        this.navigationIconTint = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            DrawableCompat.wrap(navigationIcon.mutate()).setTintList(null);
            setNavigationIcon(navigationIcon);
        }
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C0467R.attr.toolbarStyle);
    }

    private void maybeCenterTitleViews() {
        if (this.titleCentered || this.subtitleCentered) {
            TextView titleTextView = ToolbarUtils.getTitleTextView(this);
            TextView subtitleTextView = ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView == null && subtitleTextView == null) {
                return;
            }
            Pair<Integer, Integer> pairCalculateTitleBoundLimits = calculateTitleBoundLimits(titleTextView, subtitleTextView);
            if (this.titleCentered && titleTextView != null) {
                layoutTitleCenteredHorizontally(titleTextView, pairCalculateTitleBoundLimits);
            }
            if (!this.subtitleCentered || subtitleTextView == null) {
                return;
            }
            layoutTitleCenteredHorizontally(subtitleTextView, pairCalculateTitleBoundLimits);
        }
    }

    @Nullable
    private Drawable maybeTintNavigationIcon(@Nullable Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        drawableWrap.setTint(this.navigationIconTint.intValue());
        return drawableWrap;
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.logoScaleType;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.navigationIconTint;
    }

    public boolean isLogoAdjustViewBounds() {
        Boolean bool = this.logoAdjustViewBounds;
        return bool != null && bool.booleanValue();
    }

    public boolean isSubtitleCentered() {
        return this.subtitleCentered;
    }

    public boolean isTitleCentered() {
        return this.titleCentered;
    }

    public void setLogoAdjustViewBounds(boolean z11) {
        Boolean bool = this.logoAdjustViewBounds;
        if (bool == null || bool.booleanValue() != z11) {
            this.logoAdjustViewBounds = Boolean.valueOf(z11);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.logoScaleType != scaleType) {
            this.logoScaleType = scaleType;
            requestLayout();
        }
    }

    public void setSubtitleCentered(boolean z11) {
        if (this.subtitleCentered != z11) {
            this.subtitleCentered = z11;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z11) {
        if (this.titleCentered != z11) {
            this.titleCentered = z11;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C7090R.styleable.MaterialToolbar, i11, i12, new int[0]);
        int i13 = C7090R.styleable.MaterialToolbar_navigationIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(i13, -1));
        }
        this.titleCentered = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.MaterialToolbar_titleCentered, false);
        this.subtitleCentered = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.MaterialToolbar_subtitleCentered, false);
        int i14 = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i14 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = LOGO_SCALE_TYPE_ARRAY;
            if (i14 < scaleTypeArr.length) {
                this.logoScaleType = scaleTypeArr[i14];
            }
        }
        int i15 = C7090R.styleable.MaterialToolbar_logoAdjustViewBounds;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.logoAdjustViewBounds = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(i15, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        initBackground(context2);
    }

    private Pair<Integer, Integer> calculateTitleBoundLimits(@Nullable TextView textView, @Nullable TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i11 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void initBackground(Context context) {
        ColorStateList colorStateListOrNull;
        Drawable background = getBackground();
        if (background == null) {
            colorStateListOrNull = ColorStateList.valueOf(0);
        } else {
            colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        }
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
    }

    private void layoutTitleCenteredHorizontally(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i11 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i12 = measuredWidth2 + i11;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i11, 0), Math.max(i12 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i11 += iMax;
            i12 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i12 - i11, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i11, view.getTop(), i12, view.getBottom());
    }

    private void updateLogoImageView() {
        ImageView logoImageView = ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            Boolean bool = this.logoAdjustViewBounds;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.logoScaleType;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        maybeCenterTitleViews();
        updateLogoImageView();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        MaterialShapeUtils.setElevation(this, f11);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i11) {
        this.navigationIconTint = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
