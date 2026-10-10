package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    public static final class KeyColor {
        private static final double MAX_CHROMA_VALUE = 200.0d;
        private final Map<Integer, Double> chromaCache = new HashMap();
        private final double hue;
        private final double requestedChroma;

        public Hct create() {
            int i11 = 100;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = (i12 + i11) / 2;
                int i14 = i13 + 1;
                boolean z11 = maxChroma(i13) < maxChroma(i14);
                if (maxChroma(i13) >= this.requestedChroma - 0.01d) {
                    if (Math.abs(i12 - 50) < Math.abs(i11 - 50)) {
                        i11 = i13;
                    } else {
                        if (i12 == i13) {
                            return Hct.from(this.hue, this.requestedChroma, i12);
                        }
                        i12 = i13;
                    }
                } else if (z11) {
                    i12 = i14;
                } else {
                    i11 = i13;
                }
            }
            return Hct.from(this.hue, this.requestedChroma, i12);
        }

        private double maxChroma(int i11) {
            if (this.chromaCache.get(Integer.valueOf(i11)) == null) {
                this.chromaCache.put(Integer.valueOf(i11), Double.valueOf(Hct.from(this.hue, MAX_CHROMA_VALUE, i11).getChroma()));
            }
            return this.chromaCache.get(Integer.valueOf(i11)).doubleValue();
        }

        public KeyColor(double d11, double d12) {
            this.hue = d11;
            this.requestedChroma = d12;
        }
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d11, double d12) {
        return new TonalPalette(d11, d12, new KeyColor(d11, d12).create());
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d11) {
        return Hct.from(this.hue, this.chroma, d11);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i11) {
        Integer numValueOf = this.cache.get(Integer.valueOf(i11));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.hue, this.chroma, i11).toInt());
            this.cache.put(Integer.valueOf(i11), numValueOf);
        }
        return numValueOf.intValue();
    }

    private TonalPalette(double d11, double d12, Hct hct) {
        this.hue = d11;
        this.chroma = d12;
        this.keyColor = hct;
    }

    public static TonalPalette fromInt(int i11) {
        return fromHct(Hct.fromInt(i11));
    }
}
