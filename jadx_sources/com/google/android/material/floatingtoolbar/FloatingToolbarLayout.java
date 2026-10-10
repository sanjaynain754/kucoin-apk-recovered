package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes45.dex */
public class FloatingToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_FloatingToolbar;
    private static final String TAG = "FloatingToolbarLayout";
    private int bottomMarginWindowInset;
    private int leftMarginWindowInset;
    private boolean marginBottomSystemWindowInsets;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private Rect originalMargins;
    private int rightMarginWindowInset;
    private int topMarginWindowInset;

    public FloatingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        this(context, attributeSet, i11, DEF_STYLE_RES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMargins() {
        int i11;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.originalMargins;
        if (rect == null) {
            Log.w(TAG, "Unable to update margins because original view margins are not set");
            return;
        }
        int i14 = rect.left;
        int i15 = 0;
        if (this.marginLeftSystemWindowInsets) {
            i11 = this.leftMarginWindowInset;
        } else {
            i11 = 0;
        }
        int i16 = i14 + i11;
        int i17 = rect.right;
        if (this.marginRightSystemWindowInsets) {
            i12 = this.rightMarginWindowInset;
        } else {
            i12 = 0;
        }
        int i18 = i17 + i12;
        int i19 = rect.top;
        if (this.marginTopSystemWindowInsets) {
            i13 = this.topMarginWindowInset;
        } else {
            i13 = 0;
        }
        int i21 = i19 + i13;
        int i22 = rect.bottom;
        if (this.marginBottomSystemWindowInsets) {
            i15 = this.bottomMarginWindowInset;
        }
        int i23 = i22 + i15;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i23 && marginLayoutParams.leftMargin == i16 && marginLayoutParams.rightMargin == i18 && marginLayoutParams.topMargin == i21) {
            return;
        }
        marginLayoutParams.bottomMargin = i23;
        marginLayoutParams.leftMargin = i16;
        marginLayoutParams.rightMargin = i18;
        marginLayoutParams.topMargin = i21;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.originalMargins = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            updateMargins();
            return;
        }
        this.originalMargins = null;
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        Context context2 = getContext();
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C7090R.styleable.FloatingToolbar, i11, i12, new int[0]);
        int i13 = C7090R.styleable.FloatingToolbar_backgroundTint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i13)) {
            int color = tintTypedArrayObtainTintedStyledAttributes.getColor(i13, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i11, i12).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        this.marginLeftSystemWindowInsets = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.marginTopSystemWindowInsets = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.marginBottomSystemWindowInsets = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.FloatingToolbar_marginBottomSystemWindowInsets, true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.floatingtoolbar.FloatingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                if (!FloatingToolbarLayout.this.marginLeftSystemWindowInsets && !FloatingToolbarLayout.this.marginRightSystemWindowInsets && !FloatingToolbarLayout.this.marginTopSystemWindowInsets && !FloatingToolbarLayout.this.marginBottomSystemWindowInsets) {
                    return windowInsetsCompat;
                }
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.ime());
                FloatingToolbarLayout.this.bottomMarginWindowInset = insets.bottom;
                FloatingToolbarLayout.this.topMarginWindowInset = insets.top;
                FloatingToolbarLayout.this.rightMarginWindowInset = insets.right;
                FloatingToolbarLayout.this.leftMarginWindowInset = insets.left;
                FloatingToolbarLayout.this.updateMargins();
                return windowInsetsCompat;
            }
        });
        tintTypedArrayObtainTintedStyledAttributes.recycle();
    }
}
