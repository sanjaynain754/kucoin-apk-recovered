package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SchemeNeutral extends DynamicScheme {
    public SchemeNeutral(Hct hct, boolean z11, double d11) {
        super(hct, Variant.NEUTRAL, z11, d11, TonalPalette.fromHueAndChroma(hct.getHue(), 12.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 2.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 2.0d));
    }
}
