package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.TintTypedArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes45.dex */
public class DockedToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_DockedToolbar;
    private static final String TAG = "DockedToolbarLayout";
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;

    public DockedToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.dockedToolbarStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasGravity(ViewGroup.LayoutParams layoutParams, int i11) {
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            return (((CoordinatorLayout.LayoutParams) layoutParams).gravity & i11) == i11;
        }
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i11) == i11;
    }

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        this(context, attributeSet, i11, DEF_STYLE_RES);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i12) != 1073741824) {
            int childCount = getChildCount();
            int iMax = Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom());
            for (int i13 = 0; i13 < childCount; i13++) {
                measureChild(getChildAt(i13), i11, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        Context context2 = getContext();
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C7090R.styleable.DockedToolbar, i11, i12, new int[0]);
        int i13 = C7090R.styleable.DockedToolbar_backgroundTint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i13)) {
            int color = tintTypedArrayObtainTintedStyledAttributes.getColor(i13, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i11, i12).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        int i14 = C7090R.styleable.DockedToolbar_paddingTopSystemWindowInsets;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i14)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(i14, true));
        }
        int i15 = C7090R.styleable.DockedToolbar_paddingBottomSystemWindowInsets;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i15)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(tintTypedArrayObtainTintedStyledAttributes.getBoolean(i15, true));
        }
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.dockedtoolbar.DockedToolbarLayout.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
                if (DockedToolbarLayout.this.paddingTopSystemWindowInsets != null && DockedToolbarLayout.this.paddingBottomSystemWindowInsets != null && !DockedToolbarLayout.this.paddingTopSystemWindowInsets.booleanValue() && !DockedToolbarLayout.this.paddingBottomSystemWindowInsets.booleanValue()) {
                    return windowInsetsCompat;
                }
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.ime());
                int i16 = insets.bottom;
                int i17 = insets.top;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i18 = (DockedToolbarLayout.this.hasGravity(layoutParams, 48) && DockedToolbarLayout.this.paddingTopSystemWindowInsets == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i17 : 0;
                int i19 = (DockedToolbarLayout.this.hasGravity(layoutParams, 80) && DockedToolbarLayout.this.paddingBottomSystemWindowInsets == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i16 : 0;
                if (DockedToolbarLayout.this.paddingBottomSystemWindowInsets != null) {
                    if (!DockedToolbarLayout.this.paddingBottomSystemWindowInsets.booleanValue()) {
                        i16 = 0;
                    }
                    i19 = i16;
                }
                if (DockedToolbarLayout.this.paddingTopSystemWindowInsets != null) {
                    if (!DockedToolbarLayout.this.paddingTopSystemWindowInsets.booleanValue()) {
                        i17 = 0;
                    }
                    i18 = i17;
                }
                relativePadding.top += i18;
                relativePadding.bottom += i19;
                relativePadding.applyToView(view);
                return windowInsetsCompat;
            }
        });
        setImportantForAccessibility(1);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
    }
}
