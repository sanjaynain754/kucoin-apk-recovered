package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.C7090R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    private static int readFirstAvailableDimension(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull @StyleableRes int... iArr) {
        int dimensionPixelSize = -1;
        for (int i11 = 0; i11 < iArr.length && dimensionPixelSize < 0; i11++) {
            dimensionPixelSize = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i11], -1);
        }
        return dimensionPixelSize;
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void applyLineHeightFromViewAppearance(@NonNull Resources.Theme theme, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i11, C7090R.styleable.MaterialTextAppearance);
        int firstAvailableDimension = readFirstAvailableDimension(getContext(), typedArrayObtainStyledAttributes, C7090R.styleable.MaterialTextAppearance_android_lineHeight, C7090R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (firstAvailableDimension >= 0) {
            setLineHeight(firstAvailableDimension);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
        return MaterialAttributes.resolveBoolean(context, C7090R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int findViewAppearanceResourceId(@NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i11, int i12) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7090R.styleable.MaterialTextView, i11, i12);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static boolean viewAttrsHasLineHeight(@NonNull Context context, @NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i11, int i12) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7090R.styleable.MaterialTextView, i11, i12);
        int firstAvailableDimension = readFirstAvailableDimension(context, typedArrayObtainStyledAttributes, C7090R.styleable.MaterialTextView_android_lineHeight, C7090R.styleable.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return firstAvailableDimension != -1;
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, 0), attributeSet, i11);
        initialize(attributeSet, i11, 0);
    }

    private void initialize(@Nullable AttributeSet attributeSet, int i11, int i12) {
        int iFindViewAppearanceResourceId;
        Context context = getContext();
        if (canApplyTextAppearanceLineHeight(context)) {
            Resources.Theme theme = context.getTheme();
            if (!viewAttrsHasLineHeight(context, theme, attributeSet, i11, i12) && (iFindViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i11, i12)) != -1) {
                applyLineHeightFromViewAppearance(theme, iFindViewAppearanceResourceId);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i11) {
        super.setTextAppearance(context, i11);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i11);
        }
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        initialize(attributeSet, i11, i12);
    }
}
