package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;
import com.google.android.material.C7090R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;

/* JADX INFO: loaded from: classes45.dex */
public final class LoadingIndicatorSpec {

    @ColorInt
    int containerColor;

    @Px
    int containerHeight;

    @Px
    int containerWidth;

    @NonNull
    int[] indicatorColors;

    @Px
    int indicatorSize;
    boolean scaleToFit;

    public LoadingIndicatorSpec(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.loadingIndicatorStyle);
    }

    public LoadingIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        this(context, attributeSet, i11, LoadingIndicator.DEF_STYLE_RES);
    }

    private void loadIndicatorColors(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i11 = C7090R.styleable.LoadingIndicator_indicatorColor;
        if (!typedArray.hasValue(i11)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, C0467R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(i11).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(i11, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i11, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public void setScaleToFit(boolean z11) {
        this.scaleToFit = z11;
    }

    public LoadingIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        this.scaleToFit = false;
        this.indicatorColors = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7090R.dimen.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C7090R.dimen.m3_loading_indicator_container_size);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C7090R.styleable.LoadingIndicator, i11, i12, new int[0]);
        this.indicatorSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.LoadingIndicator_indicatorSize, dimensionPixelSize);
        this.containerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.LoadingIndicator_containerWidth, dimensionPixelSize2);
        this.containerHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.LoadingIndicator_containerHeight, dimensionPixelSize2);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        this.containerColor = typedArrayObtainStyledAttributes.getColor(C7090R.styleable.LoadingIndicator_containerColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
