package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import androidx.core.graphics.BlendModeCompat;

/* JADX INFO: loaded from: classes.dex */
public enum LBlendMode {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.LBlendMode$a */
    public static /* synthetic */ class C5092a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6049a;

        static {
            int[] iArr = new int[LBlendMode.values().length];
            f6049a = iArr;
            try {
                iArr[LBlendMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6049a[LBlendMode.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6049a[LBlendMode.OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6049a[LBlendMode.DARKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6049a[LBlendMode.LIGHTEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6049a[LBlendMode.ADD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6049a[LBlendMode.MULTIPLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6049a[LBlendMode.COLOR_DODGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6049a[LBlendMode.COLOR_BURN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6049a[LBlendMode.HARD_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6049a[LBlendMode.SOFT_LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6049a[LBlendMode.DIFFERENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6049a[LBlendMode.EXCLUSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6049a[LBlendMode.HUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6049a[LBlendMode.SATURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6049a[LBlendMode.COLOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6049a[LBlendMode.LUMINOSITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6049a[LBlendMode.HARD_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Nullable
    public BlendModeCompat toNativeBlendMode() {
        int i11 = C5092a.f6049a[ordinal()];
        if (i11 == 2) {
            return BlendModeCompat.SCREEN;
        }
        if (i11 == 3) {
            return BlendModeCompat.OVERLAY;
        }
        if (i11 == 4) {
            return BlendModeCompat.DARKEN;
        }
        if (i11 == 5) {
            return BlendModeCompat.LIGHTEN;
        }
        if (i11 != 6) {
            return null;
        }
        return BlendModeCompat.PLUS;
    }
}
