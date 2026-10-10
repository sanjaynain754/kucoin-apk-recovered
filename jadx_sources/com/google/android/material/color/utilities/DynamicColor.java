package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z11, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z11;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z11) {
        return new DynamicColor(str, function, function2, z11, null, null, null, null);
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = this.palette.apply(dynamicScheme).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(@NonNull DynamicScheme dynamicScheme) {
        double d11;
        double dMax;
        double dMin;
        boolean z11 = false;
        boolean z12 = dynamicScheme.contrastLevel < 0.0d;
        Function<DynamicScheme, ToneDeltaPair> function = this.toneDeltaPair;
        if (function == null) {
            boolean z13 = z12;
            double dDoubleValue = this.tone.apply(dynamicScheme).doubleValue();
            Function<DynamicScheme, DynamicColor> function2 = this.background;
            if (function2 == null) {
                return dDoubleValue;
            }
            double tone = function2.apply(dynamicScheme).getTone(dynamicScheme);
            double d12 = this.contrastCurve.get(dynamicScheme.contrastLevel);
            if (Contrast.ratioOfTones(tone, dDoubleValue) < d12) {
                dDoubleValue = foregroundTone(tone, d12);
            }
            if (z13) {
                dDoubleValue = foregroundTone(tone, d12);
            }
            if (!this.isBackground || 50.0d > dDoubleValue || dDoubleValue >= 60.0d) {
                d11 = dDoubleValue;
            } else {
                d11 = 49.0d;
                if (Contrast.ratioOfTones(49.0d, tone) < d12) {
                    d11 = 60.0d;
                }
            }
            if (this.secondBackground != null) {
                double tone2 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
                double tone3 = this.secondBackground.apply(dynamicScheme).getTone(dynamicScheme);
                double dMax2 = Math.max(tone2, tone3);
                double dMin2 = Math.min(tone2, tone3);
                if (Contrast.ratioOfTones(dMax2, d11) < d12 || Contrast.ratioOfTones(dMin2, d11) < d12) {
                    double dLighter = Contrast.lighter(dMax2, d12);
                    double dDarker = Contrast.darker(dMin2, d12);
                    ArrayList arrayList = new ArrayList();
                    if (dLighter != -1.0d) {
                        arrayList.add(Double.valueOf(dLighter));
                    }
                    if (dDarker != -1.0d) {
                        arrayList.add(Double.valueOf(dDarker));
                    }
                    if (tonePrefersLightForeground(tone2) || tonePrefersLightForeground(tone3)) {
                        if (dLighter == -1.0d) {
                            return 100.0d;
                        }
                        return dLighter;
                    }
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (dDarker == -1.0d) {
                        return 0.0d;
                    }
                    return dDarker;
                }
            }
            return d11;
        }
        ToneDeltaPair toneDeltaPairApply = function.apply(dynamicScheme);
        DynamicColor roleA = toneDeltaPairApply.getRoleA();
        DynamicColor roleB = toneDeltaPairApply.getRoleB();
        double delta = toneDeltaPairApply.getDelta();
        TonePolarity polarity = toneDeltaPairApply.getPolarity();
        boolean stayTogether = toneDeltaPairApply.getStayTogether();
        double tone4 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
        if (polarity == TonePolarity.NEARER || ((polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark))) {
            z11 = true;
        }
        DynamicColor dynamicColor = z11 ? roleA : roleB;
        DynamicColor dynamicColor2 = z11 ? roleB : roleA;
        boolean zEquals = this.name.equals(dynamicColor.name);
        double d13 = dynamicScheme.isDark ? 1.0d : -1.0d;
        double d14 = dynamicColor.contrastCurve.get(dynamicScheme.contrastLevel);
        double d15 = dynamicColor2.contrastCurve.get(dynamicScheme.contrastLevel);
        double dDoubleValue2 = dynamicColor.tone.apply(dynamicScheme).doubleValue();
        if (Contrast.ratioOfTones(tone4, dDoubleValue2) < d14) {
            dDoubleValue2 = foregroundTone(tone4, d14);
        }
        boolean z14 = z12;
        double dDoubleValue3 = dynamicColor2.tone.apply(dynamicScheme).doubleValue();
        if (Contrast.ratioOfTones(tone4, dDoubleValue3) < d15) {
            dDoubleValue3 = foregroundTone(tone4, d15);
        }
        if (z14) {
            dDoubleValue2 = foregroundTone(tone4, d14);
            dDoubleValue3 = foregroundTone(tone4, d15);
        }
        if ((dDoubleValue3 - dDoubleValue2) * d13 < delta) {
            double d16 = delta * d13;
            double dClampDouble = MathUtils.clampDouble(0.0d, 100.0d, dDoubleValue2 + d16);
            if ((dClampDouble - dDoubleValue2) * d13 < delta) {
                dDoubleValue2 = MathUtils.clampDouble(0.0d, 100.0d, dClampDouble - d16);
            }
            dDoubleValue3 = dClampDouble;
        }
        if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
            if (50.0d > dDoubleValue3 || dDoubleValue3 >= 60.0d) {
                dMax = dDoubleValue3;
            } else if (!stayTogether) {
                dMax = d13 > 0.0d ? 60.0d : 49.0d;
            } else if (d13 > 0.0d) {
                dMax = Math.max(dDoubleValue3, (delta * d13) + 60.0d);
                dDoubleValue2 = 60.0d;
            } else {
                dMin = Math.min(dDoubleValue3, (delta * d13) + 49.0d);
                dMax = dMin;
                dDoubleValue2 = 49.0d;
            }
        } else if (d13 > 0.0d) {
            dMax = Math.max(dDoubleValue3, (delta * d13) + 60.0d);
            dDoubleValue2 = 60.0d;
        } else {
            dMin = Math.min(dDoubleValue3, (delta * d13) + 49.0d);
            dMax = dMin;
            dDoubleValue2 = 49.0d;
        }
        return zEquals ? dDoubleValue2 : dMax;
    }

    public static double enableLightForeground(double d11) {
        if (tonePrefersLightForeground(d11) && !toneAllowsLightForeground(d11)) {
            return 49.0d;
        }
        return d11;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[RETURN] */
    public static double foregroundTone(double d11, double d12) {
        boolean z11;
        double dLighterUnsafe = Contrast.lighterUnsafe(d11, d12);
        double dDarkerUnsafe = Contrast.darkerUnsafe(d11, d12);
        double dRatioOfTones = Contrast.ratioOfTones(dLighterUnsafe, d11);
        double dRatioOfTones2 = Contrast.ratioOfTones(dDarkerUnsafe, d11);
        if (tonePrefersLightForeground(d11)) {
            if (Math.abs(dRatioOfTones - dRatioOfTones2) < 0.1d && dRatioOfTones < d12 && dRatioOfTones2 < d12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (dRatioOfTones >= d12 || dRatioOfTones >= dRatioOfTones2 || z11) {
                return dLighterUnsafe;
            }
            return dDarkerUnsafe;
        }
        if (dRatioOfTones2 < d12 && dRatioOfTones2 < dRatioOfTones) {
            return dLighterUnsafe;
        }
        return dDarkerUnsafe;
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String str, int i11) {
        final Hct hctFromInt = Hct.fromInt(i11);
        final TonalPalette tonalPaletteFromInt = TonalPalette.fromInt(i11);
        return fromPalette(str, new Function() { // from class: com.google.android.material.color.utilities.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.m12952b(tonalPaletteFromInt, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(hctFromInt.getTone());
            }
        });
    }

    public static boolean toneAllowsLightForeground(double d11) {
        if (Math.round(d11) <= 49) {
            return true;
        }
        return false;
    }

    public static boolean tonePrefersLightForeground(double d11) {
        if (Math.round(d11) < 60) {
            return true;
        }
        return false;
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme) {
        int i11 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i11;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i11 & 16777215);
    }

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z11, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5, @Nullable Function<DynamicScheme, Double> function6) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z11;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TonalPalette m12952b(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }
}
