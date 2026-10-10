package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.C0467R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i11) : colorStateList;
    }

    public static int getDimensionPixelSize(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11, int i12) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i11, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i11, i12);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i12);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static int getUnscaledLineHeight(@NonNull Context context, @StyleRes int i11, int i12) {
        if (i11 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, C7090R.styleable.MaterialTextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(C7090R.styleable.MaterialTextAppearance_lineHeight, typedValue);
            if (!value) {
                value = typedArrayObtainStyledAttributes.getValue(C7090R.styleable.MaterialTextAppearance_android_lineHeight, typedValue);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i12;
    }

    public static int getUnscaledTextSize(@NonNull Context context, @StyleRes int i11, int i12) {
        if (i11 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, C0467R.styleable.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(C0467R.styleable.TextAppearance_android_textSize, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i12;
    }

    private MaterialResources() {
    }

    private static int getComplexUnit(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int resourceId;
        Drawable drawable;
        if (typedArray.hasValue(i11) && (resourceId = typedArray.getResourceId(i11, 0)) != 0 && (drawable = AppCompatResources.getDrawable(context, resourceId)) != null) {
            return drawable;
        }
        return typedArray.getDrawable(i11);
    }

    public static float getFontScale(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    @StyleableRes
    public static int getIndexWithValue(@NonNull TypedArray typedArray, @StyleableRes int i11, @StyleableRes int i12) {
        if (typedArray.hasValue(i11)) {
            return i11;
        }
        return i12;
    }

    @Nullable
    public static TextAppearance getTextAppearance(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int resourceId;
        if (typedArray.hasValue(i11) && (resourceId = typedArray.getResourceId(i11, 0)) != 0) {
            return new TextAppearance(context, resourceId);
        }
        return null;
    }

    public static boolean isFontScaleAtLeast1_3(@NonNull Context context) {
        if (context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3) {
            return true;
        }
        return false;
    }

    public static boolean isFontScaleAtLeast2_0(@NonNull Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull TintTypedArray tintTypedArray, @StyleableRes int i11) {
        int resourceId;
        ColorStateList colorStateList;
        return (!tintTypedArray.hasValue(i11) || (resourceId = tintTypedArray.getResourceId(i11, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i11) : colorStateList;
    }
}
