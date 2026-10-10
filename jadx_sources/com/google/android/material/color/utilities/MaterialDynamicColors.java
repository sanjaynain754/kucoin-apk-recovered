package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.messaging.Constants;
import java.util.function.Function;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialDynamicColors {
    private final boolean isExtendedFidelity;

    public MaterialDynamicColors() {
        this.isExtendedFidelity = false;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ ToneDeltaPair m12956B(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.secondaryContainer(), materialDynamicColors.secondary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ ToneDeltaPair m12959C(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.errorContainer(), materialDynamicColors.error(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ ToneDeltaPair m13024X1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.tertiaryFixed(), materialDynamicColors.tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ ToneDeltaPair m13029Z0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.secondaryContainer(), materialDynamicColors.secondary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ToneDeltaPair m13031a(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.primaryFixed(), materialDynamicColors.primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ ToneDeltaPair m13049e1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.secondaryFixed(), materialDynamicColors.secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ToneDeltaPair m13051f(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.primaryFixed(), materialDynamicColors.primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    private boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant;
        Variant variant2;
        return !(!this.isExtendedFidelity || (variant2 = dynamicScheme.variant) == Variant.MONOCHROME || variant2 == Variant.NEUTRAL) || (variant = dynamicScheme.variant) == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.MONOCHROME;
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ ToneDeltaPair m13072l1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.primaryContainer(), materialDynamicColors.primary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ ToneDeltaPair m13083p0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.errorContainer(), materialDynamicColors.error(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ ToneDeltaPair m13094t(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.primaryContainer(), materialDynamicColors.primary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ ToneDeltaPair m13095t0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.secondaryFixed(), materialDynamicColors.secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ ToneDeltaPair m13099u1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.tertiaryFixed(), materialDynamicColors.tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ ToneDeltaPair m13111y1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.tertiaryContainer(), materialDynamicColors.tertiary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ ToneDeltaPair m13113z0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(materialDynamicColors.tertiaryContainer(), materialDynamicColors.tertiary(), 10.0d, TonePolarity.NEARER, false);
    }

    @NonNull
    public DynamicColor background() {
        return new DynamicColor("background", new Function() { // from class: com.google.android.material.color.utilities.y2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 6.0d : 98.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette("control_activated", new Function() { // from class: com.google.android.material.color.utilities.u1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 90.0d);
            }
        });
    }

    @NonNull
    public DynamicColor controlHighlight() {
        return new DynamicColor("control_highlight", new Function() { // from class: com.google.android.material.color.utilities.r2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 100.0d : 0.0d);
            }
        }, false, null, null, null, null, new Function() { // from class: com.google.android.material.color.utilities.t2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 0.2d : 0.12d);
            }
        });
    }

    @NonNull
    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette("control_normal", new Function() { // from class: com.google.android.material.color.utilities.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 30.0d);
            }
        });
    }

    @NonNull
    public DynamicColor error() {
        return new DynamicColor(Constants.IPC_BUNDLE_KEY_SEND_ERROR, new Function() { // from class: com.google.android.material.color.utilities.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 40.0d);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12959C(this.f11813a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor errorContainer() {
        return new DynamicColor("error_container", new Function() { // from class: com.google.android.material.color.utilities.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 90.0d);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13083p0(this.f11793a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor highestSurface(@NonNull DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    @NonNull
    public DynamicColor inverseOnSurface() {
        return new DynamicColor("inverse_on_surface", new Function() { // from class: com.google.android.material.color.utilities.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 20.0d : 95.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11825a.inverseSurface();
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor inversePrimary() {
        return new DynamicColor("inverse_primary", new Function() { // from class: com.google.android.material.color.utilities.n3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 40.0d : 80.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.p3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11820a.inverseSurface();
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), null);
    }

    @NonNull
    public DynamicColor inverseSurface() {
        return new DynamicColor("inverse_surface", new Function() { // from class: com.google.android.material.color.utilities.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 90.0d : 20.0d);
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).neutralPalette.getKeyColor().getTone());
            }
        });
    }

    @NonNull
    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.q4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).neutralVariantPalette.getKeyColor().getTone());
            }
        });
    }

    @NonNull
    public DynamicColor onBackground() {
        return new DynamicColor("on_background", new Function() { // from class: com.google.android.material.color.utilities.c3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 90.0d : 10.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.e3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11796a.background();
            }
        }, null, new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public DynamicColor onError() {
        return new DynamicColor("on_error", new Function() { // from class: com.google.android.material.color.utilities.c4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 20.0d : 100.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.e4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11797a.error();
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onErrorContainer() {
        return new DynamicColor("on_error_container", new Function() { // from class: com.google.android.material.color.utilities.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13082p((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11828a.errorContainer();
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onPrimary() {
        return new DynamicColor("on_primary", new Function() { // from class: com.google.android.material.color.utilities.k3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12987L0((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.m3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11814a.primary();
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryContainer() {
        return new DynamicColor("on_primary_container", new Function() { // from class: com.google.android.material.color.utilities.h4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12957B0(this.f11807a, (DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.j4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11810a.primaryContainer();
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixed() {
        return new DynamicColor("on_primary_fixed", new Function() { // from class: com.google.android.material.color.utilities.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13093s1((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11800a.primaryFixedDim();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11803a.primaryFixed();
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixedVariant() {
        return new DynamicColor("on_primary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.u3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12999P0((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.w3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11827a.primaryFixedDim();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11830a.primaryFixed();
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSecondary() {
        return new DynamicColor("on_secondary", new Function() { // from class: com.google.android.material.color.utilities.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12989M((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11799a.secondary();
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryContainer() {
        return new DynamicColor("on_secondary_container", new Function() { // from class: com.google.android.material.color.utilities.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13070l(this.f11792a, (DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11795a.secondaryContainer();
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixed() {
        return new DynamicColor("on_secondary_fixed", new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(10.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11821a.secondaryFixedDim();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11822a.secondaryFixed();
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixedVariant() {
        return new DynamicColor("on_secondary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13015U1((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11817a.secondaryFixedDim();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11819a.secondaryFixed();
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSurface() {
        return new DynamicColor("on_surface", new Function() { // from class: com.google.android.material.color.utilities.m4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 90.0d : 10.0d);
            }
        }, false, new C7263i5(this), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSurfaceVariant() {
        return new DynamicColor("on_surface_variant", new Function() { // from class: com.google.android.material.color.utilities.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 30.0d);
            }
        }, false, new C7263i5(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onTertiary() {
        return new DynamicColor("on_tertiary", new Function() { // from class: com.google.android.material.color.utilities.f3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13033a1((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.b4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11790a.tertiary();
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryContainer() {
        return new DynamicColor("on_tertiary_container", new Function() { // from class: com.google.android.material.color.utilities.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13057g1(this.f11831a, (DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11786a.tertiaryContainer();
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixed() {
        return new DynamicColor("on_tertiary_fixed", new Function() { // from class: com.google.android.material.color.utilities.l2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13064j((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.n2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11815a.tertiaryFixedDim();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11818a.tertiaryFixed();
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixedVariant() {
        return new DynamicColor("on_tertiary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13037b1((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11789a.tertiaryFixedDim();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f11794a.tertiaryFixed();
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor outline() {
        return new DynamicColor("outline", new Function() { // from class: com.google.android.material.color.utilities.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 60.0d : 50.0d);
            }
        }, false, new C7263i5(this), null, new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public DynamicColor outlineVariant() {
        return new DynamicColor("outline_variant", new Function() { // from class: com.google.android.material.color.utilities.g3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 80.0d);
            }
        }, false, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), null);
    }

    @NonNull
    public DynamicColor primary() {
        return new DynamicColor("primary", new Function() { // from class: com.google.android.material.color.utilities.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12981J0((DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.j1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13072l1(this.f11809a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor primaryContainer() {
        return new DynamicColor("primary_container", new Function() { // from class: com.google.android.material.color.utilities.v2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12973G1(this.f11826a, (DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.x2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13094t(this.f11829a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor primaryFixed() {
        return new DynamicColor("primary_fixed", new Function() { // from class: com.google.android.material.color.utilities.z4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13086q0((DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.b5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13031a(this.f11791a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor primaryFixedDim() {
        return new DynamicColor("primary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.c5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13021W1((DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.e5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13051f(this.f11798a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette("primary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).primaryPalette.getKeyColor().getTone());
            }
        });
    }

    @NonNull
    public DynamicColor scrim() {
        return new DynamicColor("scrim", new Function() { // from class: com.google.android.material.color.utilities.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(0.0d);
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public DynamicColor secondary() {
        return new DynamicColor("secondary", new Function() { // from class: com.google.android.material.color.utilities.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 40.0d);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12956B(this.f11805a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor secondaryContainer() {
        return new DynamicColor("secondary_container", new Function() { // from class: com.google.android.material.color.utilities.h2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13032a0(this.f11806a, (DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.k2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13029Z0(this.f11812a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor secondaryFixed() {
        return new DynamicColor("secondary_fixed", new Function() { // from class: com.google.android.material.color.utilities.r3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13081o1((DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.t3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13049e1(this.f11824a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor secondaryFixedDim() {
        return new DynamicColor("secondary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.k4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13102v1((DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.n4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13095t0(this.f11816a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette("secondary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.d2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).secondaryPalette.getKeyColor().getTone());
            }
        });
    }

    @NonNull
    public DynamicColor shadow() {
        return new DynamicColor("shadow", new Function() { // from class: com.google.android.material.color.utilities.u4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(0.0d);
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public DynamicColor surface() {
        return new DynamicColor("surface", new Function() { // from class: com.google.android.material.color.utilities.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 6.0d : 98.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceBright() {
        return new DynamicColor("surface_bright", new Function() { // from class: com.google.android.material.color.utilities.i3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(24.0d, 24.0d, 29.0d, 34.0d).get(dynamicScheme.contrastLevel) : 98.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainer() {
        return new DynamicColor("surface_container", new Function() { // from class: com.google.android.material.color.utilities.o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(12.0d, 12.0d, 16.0d, 20.0d).get(dynamicScheme.contrastLevel) : new ContrastCurve(94.0d, 94.0d, 92.0d, 90.0d).get(dynamicScheme.contrastLevel));
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHigh() {
        return new DynamicColor("surface_container_high", new Function() { // from class: com.google.android.material.color.utilities.a3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(17.0d, 17.0d, 21.0d, 25.0d).get(dynamicScheme.contrastLevel) : new ContrastCurve(92.0d, 92.0d, 88.0d, 85.0d).get(dynamicScheme.contrastLevel));
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHighest() {
        return new DynamicColor("surface_container_highest", new Function() { // from class: com.google.android.material.color.utilities.w4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(22.0d, 22.0d, 26.0d, 30.0d).get(dynamicScheme.contrastLevel) : new ContrastCurve(90.0d, 90.0d, 84.0d, 80.0d).get(dynamicScheme.contrastLevel));
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLow() {
        return new DynamicColor("surface_container_low", new Function() { // from class: com.google.android.material.color.utilities.f2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(10.0d, 10.0d, 11.0d, 12.0d).get(dynamicScheme.contrastLevel) : new ContrastCurve(96.0d, 96.0d, 96.0d, 95.0d).get(dynamicScheme.contrastLevel));
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLowest() {
        return new DynamicColor("surface_container_lowest", new Function() { // from class: com.google.android.material.color.utilities.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(4.0d, 4.0d, 2.0d, 0.0d).get(dynamicScheme.contrastLevel) : 100.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceDim() {
        return new DynamicColor("surface_dim", new Function() { // from class: com.google.android.material.color.utilities.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                return Double.valueOf(dynamicScheme.isDark ? 6.0d : new ContrastCurve(87.0d, 87.0d, 80.0d, 75.0d).get(dynamicScheme.contrastLevel));
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceTint() {
        return new DynamicColor("surface_tint", new Function() { // from class: com.google.android.material.color.utilities.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 40.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceVariant() {
        return new DynamicColor("surface_variant", new Function() { // from class: com.google.android.material.color.utilities.o4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 90.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor tertiary() {
        return new DynamicColor("tertiary", new Function() { // from class: com.google.android.material.color.utilities.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12961C1((DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.t1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13111y1(this.f11823a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryContainer() {
        return new DynamicColor("tertiary_container", new Function() { // from class: com.google.android.material.color.utilities.f5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13001Q(this.f11802a, (DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.h5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13113z0(this.f11804a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryFixed() {
        return new DynamicColor("tertiary_fixed", new Function() { // from class: com.google.android.material.color.utilities.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13063i1((DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13024X1(this.f11801a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryFixedDim() {
        return new DynamicColor("tertiary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.y3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m12976H1((DynamicScheme) obj);
            }
        }, true, new C7263i5(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.a4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.m13099u1(this.f11787a, (DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette("tertiary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.p2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).tertiaryPalette.getKeyColor().getTone());
            }
        });
    }

    @NonNull
    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette("text_hint_inverse", new Function() { // from class: com.google.android.material.color.utilities.s4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 90.0d);
            }
        });
    }

    @NonNull
    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette("text_primary_inverse", new Function() { // from class: com.google.android.material.color.utilities.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 90.0d);
            }
        });
    }

    @NonNull
    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", new Function() { // from class: com.google.android.material.color.utilities.f4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 90.0d);
            }
        });
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new Function() { // from class: com.google.android.material.color.utilities.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 80.0d);
            }
        });
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new Function() { // from class: com.google.android.material.color.utilities.j2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.u2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 90.0d);
            }
        });
    }

    public MaterialDynamicColors(boolean z11) {
        this.isExtendedFidelity = z11;
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ Double m12957B0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        double d11;
        double d12;
        if (materialDynamicColors.isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(materialDynamicColors.primaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d12 = 0.0d;
            } else {
                d12 = 100.0d;
            }
            return Double.valueOf(d12);
        }
        if (dynamicScheme.isDark) {
            d11 = 90.0d;
        } else {
            d11 = 30.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ Double m12961C1(DynamicScheme dynamicScheme) {
        double d11;
        double d12;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d12 = 90.0d;
            } else {
                d12 = 25.0d;
            }
            return Double.valueOf(d12);
        }
        if (dynamicScheme.isDark) {
            d11 = 80.0d;
        } else {
            d11 = 40.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ Double m12973G1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        double d11;
        double d12;
        if (materialDynamicColors.isFidelity(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.sourceColorHct.getTone());
        }
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d12 = 85.0d;
            } else {
                d12 = 25.0d;
            }
            return Double.valueOf(d12);
        }
        if (dynamicScheme.isDark) {
            d11 = 30.0d;
        } else {
            d11 = 90.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ Double m12976H1(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 30.0d;
        } else {
            d11 = 80.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ Double m12981J0(DynamicScheme dynamicScheme) {
        double d11;
        double d12;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d12 = 100.0d;
            } else {
                d12 = 0.0d;
            }
            return Double.valueOf(d12);
        }
        if (dynamicScheme.isDark) {
            d11 = 80.0d;
        } else {
            d11 = 40.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ Double m12987L0(DynamicScheme dynamicScheme) {
        double d11;
        double d12;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d12 = 10.0d;
            } else {
                d12 = 90.0d;
            }
            return Double.valueOf(d12);
        }
        if (dynamicScheme.isDark) {
            d11 = 20.0d;
        } else {
            d11 = 100.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Double m12989M(DynamicScheme dynamicScheme) {
        double d11 = 100.0d;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 10.0d;
            }
            return Double.valueOf(d11);
        }
        if (dynamicScheme.isDark) {
            d11 = 20.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ Double m12999P0(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 90.0d;
        } else {
            d11 = 30.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Double m13001Q(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        double d11;
        double d12;
        materialDynamicColors.getClass();
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d12 = 60.0d;
            } else {
                d12 = 49.0d;
            }
            return Double.valueOf(d12);
        }
        if (!materialDynamicColors.isFidelity(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 30.0d;
            } else {
                d11 = 90.0d;
            }
            return Double.valueOf(d11);
        }
        return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone())).getTone());
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ Double m13015U1(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 25.0d;
        } else {
            d11 = 30.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: W1 */
    public static /* synthetic */ Double m13021W1(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 30.0d;
        } else {
            d11 = 80.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ Double m13032a0(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        double d11;
        materialDynamicColors.getClass();
        double d12 = 30.0d;
        if (dynamicScheme.isDark) {
            d11 = 30.0d;
        } else {
            d11 = 90.0d;
        }
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d12 = 85.0d;
            }
            return Double.valueOf(d12);
        }
        if (!materialDynamicColors.isFidelity(dynamicScheme)) {
            return Double.valueOf(d11);
        }
        return Double.valueOf(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d11, !dynamicScheme.isDark));
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Double m13033a1(DynamicScheme dynamicScheme) {
        double d11;
        double d12;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d12 = 10.0d;
            } else {
                d12 = 90.0d;
            }
            return Double.valueOf(d12);
        }
        if (dynamicScheme.isDark) {
            d11 = 20.0d;
        } else {
            d11 = 100.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ Double m13037b1(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 90.0d;
        } else {
            d11 = 30.0d;
        }
        return Double.valueOf(d11);
    }

    public static double findDesiredChromaByTone(double d11, double d12, double d13, boolean z11) {
        double d14;
        Hct hctFrom = Hct.from(d11, d12, d13);
        if (hctFrom.getChroma() < d12) {
            double chroma = hctFrom.getChroma();
            while (hctFrom.getChroma() < d12) {
                if (z11) {
                    d14 = -1.0d;
                } else {
                    d14 = 1.0d;
                }
                d13 += d14;
                Hct hctFrom2 = Hct.from(d11, d12, d13);
                if (chroma > hctFrom2.getChroma() || Math.abs(hctFrom2.getChroma() - d12) < 0.4d) {
                    return d13;
                }
                if (Math.abs(hctFrom2.getChroma() - d12) < Math.abs(hctFrom.getChroma() - d12)) {
                    hctFrom = hctFrom2;
                }
                chroma = Math.max(chroma, hctFrom2.getChroma());
            }
        }
        return d13;
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ Double m13057g1(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        double d11;
        double d12;
        materialDynamicColors.getClass();
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d12 = 0.0d;
            } else {
                d12 = 100.0d;
            }
            return Double.valueOf(d12);
        }
        if (!materialDynamicColors.isFidelity(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 90.0d;
            } else {
                d11 = 30.0d;
            }
            return Double.valueOf(d11);
        }
        return Double.valueOf(DynamicColor.foregroundTone(materialDynamicColors.tertiaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ Double m13063i1(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 40.0d;
        } else {
            d11 = 90.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Double m13064j(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 100.0d;
        } else {
            d11 = 10.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Double m13070l(MaterialDynamicColors materialDynamicColors, DynamicScheme dynamicScheme) {
        materialDynamicColors.getClass();
        double d11 = 90.0d;
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d11 = 10.0d;
            }
            return Double.valueOf(d11);
        }
        if (!materialDynamicColors.isFidelity(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d11 = 30.0d;
            }
            return Double.valueOf(d11);
        }
        return Double.valueOf(DynamicColor.foregroundTone(materialDynamicColors.secondaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ Double m13081o1(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 80.0d;
        } else {
            d11 = 90.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Double m13082p(DynamicScheme dynamicScheme) {
        double d11 = 90.0d;
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d11 = 10.0d;
            }
            return Double.valueOf(d11);
        }
        if (!dynamicScheme.isDark) {
            d11 = 30.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Double m13086q0(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 40.0d;
        } else {
            d11 = 90.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ Double m13093s1(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 100.0d;
        } else {
            d11 = 10.0d;
        }
        return Double.valueOf(d11);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ Double m13102v1(DynamicScheme dynamicScheme) {
        double d11;
        if (isMonochrome(dynamicScheme)) {
            d11 = 70.0d;
        } else {
            d11 = 80.0d;
        }
        return Double.valueOf(d11);
    }
}
