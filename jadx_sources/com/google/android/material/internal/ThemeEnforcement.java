package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.C0467R;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C7090R;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ThemeEnforcement {
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";
    private static final int[] APPCOMPAT_CHECK_ATTRS = {C0467R.attr.colorPrimary};
    private static final int[] MATERIAL_CHECK_ATTRS = {C7090R.attr.colorPrimaryVariant};

    public static void checkAppCompatTheme(@NonNull Context context) {
        checkTheme(context, APPCOMPAT_CHECK_ATTRS, APPCOMPAT_THEME_NAME);
    }

    private static void checkCompatibleTheme(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.ThemeEnforcement, i11, i12);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z11) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C7090R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    public static void checkMaterialTheme(@NonNull Context context) {
        checkTheme(context, MATERIAL_CHECK_ATTRS, MATERIAL_THEME_NAME);
    }

    private static void checkTextAppearance(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i11, @StyleRes int i12, @Nullable @StyleableRes int... iArr2) {
        boolean zIsCustomTextAppearanceValid;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.ThemeEnforcement, i11, i12);
        if (!typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zIsCustomTextAppearanceValid = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zIsCustomTextAppearanceValid = isCustomTextAppearanceValid(context, attributeSet, iArr, i11, i12, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zIsCustomTextAppearanceValid) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static boolean isAppCompatTheme(@NonNull Context context) {
        return isTheme(context, APPCOMPAT_CHECK_ATTRS);
    }

    public static boolean isMaterial3Theme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, C7090R.attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(@NonNull Context context) {
        return isTheme(context, MATERIAL_CHECK_ATTRS);
    }

    private ThemeEnforcement() {
    }

    private static void checkTheme(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (isTheme(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean isCustomTextAppearanceValid(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i11, @StyleRes int i12, @NonNull @StyleableRes int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        for (int i13 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i13, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static boolean isTheme(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i11)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    @NonNull
    public static TypedArray obtainStyledAttributes(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i11, @StyleRes int i12, @StyleableRes int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i11, i12);
        checkTextAppearance(context, attributeSet, iArr, i11, i12, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
    }

    public static TintTypedArray obtainTintedStyledAttributes(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i11, @StyleRes int i12, @StyleableRes int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i11, i12);
        checkTextAppearance(context, attributeSet, iArr, i11, i12, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i11, i12);
    }
}
