package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SchemeFidelity extends DynamicScheme {
    public SchemeFidelity(Hct hct, boolean z11, double d11) {
        super(hct, Variant.FIDELITY, z11, d11, TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma()), TonalPalette.fromHueAndChroma(hct.getHue(), Math.max(hct.getChroma() - 32.0d, hct.getChroma() * 0.5d)), TonalPalette.fromHct(DislikeAnalyzer.fixIfDisliked(new TemperatureCache(hct).getComplement())), TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma() / 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), (hct.getChroma() / 8.0d) + 4.0d));
    }
}
