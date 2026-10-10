package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes45.dex */
public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {C0467R.attr.colorError, C7090R.attr.colorOnError, C7090R.attr.colorErrorContainer, C7090R.attr.colorOnErrorContainer};
    private final int[] attributes;

    @StyleRes
    private final int themeOverlay;

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr, @StyleRes int i11) {
        return new HarmonizedColorAttributes(iArr, i11);
    }

    @NonNull
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, C7090R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] getAttributes() {
        return this.attributes;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    private HarmonizedColorAttributes(@AttrRes @NonNull int[] iArr, @StyleRes int i11) {
        if (i11 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.attributes = iArr;
        this.themeOverlay = i11;
    }
}
