package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0467R;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes45.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i11) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i11));
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i11, @IntRange(from = 0, m1553to = 100) int i12) {
        Hct hctFromInt = Hct.fromInt(i11);
        hctFromInt.setTone(i12);
        return hctFromInt.toInt();
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, @ColorInt int i11) {
        return getColorRoles(i11, isLightTheme(context));
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i11, @AttrRes int i12) {
        return layer(view, i11, i12, 1.0f);
    }

    @NonNull
    public static ColorRoles getColorRoles(@ColorInt int i11, boolean z11) {
        return z11 ? new ColorRoles(getColorRole(i11, 40), getColorRole(i11, 100), getColorRole(i11, 90), getColorRole(i11, 10)) : new ColorRoles(getColorRole(i11, 80), getColorRole(i11, 20), getColorRole(i11, 30), getColorRole(i11, 90));
    }

    @ColorInt
    public static int harmonizeWithPrimary(@NonNull Context context, @ColorInt int i11) {
        return harmonize(i11, getColor(context, C0467R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@ColorInt int i11) {
        return i11 != 0 && ColorUtils.calculateLuminance(i11) > 0.5d;
    }

    public static boolean isLightTheme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, C0467R.attr.isLightTheme, true);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i11, @AttrRes int i12, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        return layer(getColor(view, i11), getColor(view, i12), f11);
    }

    private static int resolveColor(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i11 = typedValue.resourceId;
        return i11 != 0 ? ContextCompat.getColor(context, i11) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i11 = typedValue.resourceId;
        return i11 != 0 ? ContextCompat.getColorStateList(context, i11) : ColorStateList.valueOf(typedValue.data);
    }

    private MaterialColors() {
    }

    @ColorInt
    public static int compositeARGBWithAlpha(@ColorInt int i11, @IntRange(from = 0, m1553to = 255) int i12) {
        return ColorUtils.setAlphaComponent(i11, (Color.alpha(i11) * i12) / 255);
    }

    @Nullable
    @ColorInt
    public static Integer getColorOrNull(@NonNull Context context, @AttrRes int i11) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i11);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int i11, @NonNull ColorStateList colorStateList) {
        ColorStateList colorStateListResolveColorStateList;
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i11);
        if (typedValueResolve != null) {
            colorStateListResolveColorStateList = resolveColorStateList(context, typedValueResolve);
        } else {
            colorStateListResolveColorStateList = null;
        }
        if (colorStateListResolveColorStateList == null) {
            return colorStateList;
        }
        return colorStateListResolveColorStateList;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context, @AttrRes int i11) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i11);
        if (typedValueResolve == null) {
            return null;
        }
        int i12 = typedValueResolve.resourceId;
        if (i12 != 0) {
            return ContextCompat.getColorStateList(context, i12);
        }
        int i13 = typedValueResolve.data;
        if (i13 == 0) {
            return null;
        }
        return ColorStateList.valueOf(i13);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerFromSeed(@NonNull Context context, @ColorInt int i11) {
        int i12;
        if (isLightTheme(context)) {
            i12 = 94;
        } else {
            i12 = 12;
        }
        return getColorRole(i11, i12, 6);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerHighFromSeed(@NonNull Context context, @ColorInt int i11) {
        int i12;
        if (isLightTheme(context)) {
            i12 = 92;
        } else {
            i12 = 17;
        }
        return getColorRole(i11, i12, 6);
    }

    @ColorInt
    public static int harmonize(@ColorInt int i11, @ColorInt int i12) {
        return Blend.harmonize(i11, i12);
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i11, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i11, str));
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i11, @IntRange(from = 0, m1553to = 100) int i12, int i13) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i11, i12));
        hctFromInt.setChroma(i13);
        return hctFromInt.toInt();
    }

    @ColorInt
    public static int layer(@ColorInt int i11, @ColorInt int i12, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        return layer(i11, ColorUtils.setAlphaComponent(i12, Math.round(Color.alpha(i12) * f11)));
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i11, @ColorInt int i12) {
        return getColor(view.getContext(), i11, i12);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i11, @ColorInt int i12) {
        Integer colorOrNull = getColorOrNull(context, i11);
        return colorOrNull != null ? colorOrNull.intValue() : i12;
    }

    @ColorInt
    public static int layer(@ColorInt int i11, @ColorInt int i12) {
        return ColorUtils.compositeColors(i12, i11);
    }
}
