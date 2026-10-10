package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes45.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indeterminateAnimationType;
    public boolean indeterminateTrackVisible;
    public int indicatorDirection;

    @Px
    public int indicatorInset;

    @Px
    public int indicatorSize;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        this(context, attributeSet, i11, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(context, attributeSet, i11, i12);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7090R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C7090R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C7090R.styleable.CircularProgressIndicator, i11, i12, new int[0]);
        this.indeterminateAnimationType = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.CircularProgressIndicator_indeterminateAnimationTypeCircular, 0);
        this.indicatorSize = Math.max(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C7090R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.trackThickness * 2);
        this.indicatorInset = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C7090R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        this.indeterminateTrackVisible = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.CircularProgressIndicator_indeterminateTrackVisible, true);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
    }
}
