package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CorePalette {

    /* JADX INFO: renamed from: a1 */
    public TonalPalette f11768a1;

    /* JADX INFO: renamed from: a2 */
    public TonalPalette f11769a2;

    /* JADX INFO: renamed from: a3 */
    public TonalPalette f11770a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1 */
    public TonalPalette f11771n1;

    /* JADX INFO: renamed from: n2 */
    public TonalPalette f11772n2;

    public static CorePalette contentOf(int i11) {
        return new CorePalette(i11, true);
    }

    /* JADX INFO: renamed from: of */
    public static CorePalette m12950of(int i11) {
        return new CorePalette(i11, false);
    }

    private CorePalette(int i11, boolean z11) {
        Hct hctFromInt = Hct.fromInt(i11);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z11) {
            this.f11768a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f11769a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f11770a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f11771n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f11772n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f11768a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f11769a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f11770a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f11771n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f11772n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }
}
