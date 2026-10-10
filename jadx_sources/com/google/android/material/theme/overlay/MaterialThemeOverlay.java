package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, C0467R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {C7090R.attr.materialThemeOverlay};

    @NonNull
    private static int[] obtainMaterialOverlayIds(@NonNull Context context, @Nullable AttributeSet attributeSet, @NonNull int[] iArr, @AttrRes int i11, @StyleRes int i12) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
            for (int i13 = 0; i13 < iArr.length; i13++) {
                iArr2[i13] = typedArrayObtainStyledAttributes.getResourceId(i13, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        return wrap(context, attributeSet, i11, i12, new int[0]);
    }

    @StyleRes
    private static int obtainAndroidThemeOverlayId(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @StyleRes
    private static int obtainMaterialThemeOverlayId(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        return obtainMaterialOverlayIds(context, attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i11, i12)[0];
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12, @NonNull int[] iArr) {
        int iObtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i11, i12);
        boolean z11 = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == iObtainMaterialThemeOverlayId;
        if (iObtainMaterialThemeOverlayId == 0 || z11) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, iObtainMaterialThemeOverlayId);
        for (int i13 : obtainMaterialOverlayIds(context, attributeSet, iArr, i11, i12)) {
            if (i13 != 0) {
                contextThemeWrapper.getTheme().applyStyle(i13, true);
            }
        }
        int iObtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (iObtainAndroidThemeOverlayId != 0) {
            contextThemeWrapper.getTheme().applyStyle(iObtainAndroidThemeOverlayId, true);
        }
        return contextThemeWrapper;
    }

    private MaterialThemeOverlay() {
    }
}
