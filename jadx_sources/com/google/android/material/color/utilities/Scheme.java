package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

/* JADX INFO: loaded from: classes45.dex */
@CheckReturnValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        return this.primary == scheme.primary && this.onPrimary == scheme.onPrimary && this.primaryContainer == scheme.primaryContainer && this.onPrimaryContainer == scheme.onPrimaryContainer && this.secondary == scheme.secondary && this.onSecondary == scheme.onSecondary && this.secondaryContainer == scheme.secondaryContainer && this.onSecondaryContainer == scheme.onSecondaryContainer && this.tertiary == scheme.tertiary && this.onTertiary == scheme.onTertiary && this.tertiaryContainer == scheme.tertiaryContainer && this.onTertiaryContainer == scheme.onTertiaryContainer && this.error == scheme.error && this.onError == scheme.onError && this.errorContainer == scheme.errorContainer && this.onErrorContainer == scheme.onErrorContainer && this.background == scheme.background && this.onBackground == scheme.onBackground && this.surface == scheme.surface && this.onSurface == scheme.onSurface && this.surfaceVariant == scheme.surfaceVariant && this.onSurfaceVariant == scheme.onSurfaceVariant && this.outline == scheme.outline && this.outlineVariant == scheme.outlineVariant && this.shadow == scheme.shadow && this.scrim == scheme.scrim && this.inverseSurface == scheme.inverseSurface && this.inverseOnSurface == scheme.inverseOnSurface && this.inversePrimary == scheme.inversePrimary;
    }

    public Scheme(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i41, int i42) {
        this.primary = i11;
        this.onPrimary = i12;
        this.primaryContainer = i13;
        this.onPrimaryContainer = i14;
        this.secondary = i15;
        this.onSecondary = i16;
        this.secondaryContainer = i17;
        this.onSecondaryContainer = i18;
        this.tertiary = i19;
        this.onTertiary = i21;
        this.tertiaryContainer = i22;
        this.onTertiaryContainer = i23;
        this.error = i24;
        this.onError = i25;
        this.errorContainer = i26;
        this.onErrorContainer = i27;
        this.background = i28;
        this.onBackground = i29;
        this.surface = i31;
        this.onSurface = i32;
        this.surfaceVariant = i33;
        this.onSurfaceVariant = i34;
        this.outline = i35;
        this.outlineVariant = i36;
        this.shadow = i37;
        this.scrim = i38;
        this.inverseSurface = i39;
        this.inverseOnSurface = i41;
        this.inversePrimary = i42;
    }

    private static Scheme darkFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f11768a1.tone(80)).withOnPrimary(corePalette.f11768a1.tone(20)).withPrimaryContainer(corePalette.f11768a1.tone(30)).withOnPrimaryContainer(corePalette.f11768a1.tone(90)).withSecondary(corePalette.f11769a2.tone(80)).withOnSecondary(corePalette.f11769a2.tone(20)).withSecondaryContainer(corePalette.f11769a2.tone(30)).withOnSecondaryContainer(corePalette.f11769a2.tone(90)).withTertiary(corePalette.f11770a3.tone(80)).withOnTertiary(corePalette.f11770a3.tone(20)).withTertiaryContainer(corePalette.f11770a3.tone(30)).withOnTertiaryContainer(corePalette.f11770a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f11771n1.tone(10)).withOnBackground(corePalette.f11771n1.tone(90)).withSurface(corePalette.f11771n1.tone(10)).withOnSurface(corePalette.f11771n1.tone(90)).withSurfaceVariant(corePalette.f11772n2.tone(30)).withOnSurfaceVariant(corePalette.f11772n2.tone(80)).withOutline(corePalette.f11772n2.tone(60)).withOutlineVariant(corePalette.f11772n2.tone(30)).withShadow(corePalette.f11771n1.tone(0)).withScrim(corePalette.f11771n1.tone(0)).withInverseSurface(corePalette.f11771n1.tone(90)).withInverseOnSurface(corePalette.f11771n1.tone(20)).withInversePrimary(corePalette.f11768a1.tone(40));
    }

    private static Scheme lightFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f11768a1.tone(40)).withOnPrimary(corePalette.f11768a1.tone(100)).withPrimaryContainer(corePalette.f11768a1.tone(90)).withOnPrimaryContainer(corePalette.f11768a1.tone(10)).withSecondary(corePalette.f11769a2.tone(40)).withOnSecondary(corePalette.f11769a2.tone(100)).withSecondaryContainer(corePalette.f11769a2.tone(90)).withOnSecondaryContainer(corePalette.f11769a2.tone(10)).withTertiary(corePalette.f11770a3.tone(40)).withOnTertiary(corePalette.f11770a3.tone(100)).withTertiaryContainer(corePalette.f11770a3.tone(90)).withOnTertiaryContainer(corePalette.f11770a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f11771n1.tone(99)).withOnBackground(corePalette.f11771n1.tone(10)).withSurface(corePalette.f11771n1.tone(99)).withOnSurface(corePalette.f11771n1.tone(10)).withSurfaceVariant(corePalette.f11772n2.tone(90)).withOnSurfaceVariant(corePalette.f11772n2.tone(30)).withOutline(corePalette.f11772n2.tone(50)).withOutlineVariant(corePalette.f11772n2.tone(80)).withShadow(corePalette.f11771n1.tone(0)).withScrim(corePalette.f11771n1.tone(0)).withInverseSurface(corePalette.f11771n1.tone(20)).withInverseOnSurface(corePalette.f11771n1.tone(95)).withInversePrimary(corePalette.f11768a1.tone(80));
    }

    public int getBackground() {
        return this.background;
    }

    public int getError() {
        return this.error;
    }

    public int getErrorContainer() {
        return this.errorContainer;
    }

    public int getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public int getInversePrimary() {
        return this.inversePrimary;
    }

    public int getInverseSurface() {
        return this.inverseSurface;
    }

    public int getOnBackground() {
        return this.onBackground;
    }

    public int getOnError() {
        return this.onError;
    }

    public int getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public int getOnPrimary() {
        return this.onPrimary;
    }

    public int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public int getOnSecondary() {
        return this.onSecondary;
    }

    public int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public int getOnSurface() {
        return this.onSurface;
    }

    public int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public int getOnTertiary() {
        return this.onTertiary;
    }

    public int getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public int getOutline() {
        return this.outline;
    }

    public int getOutlineVariant() {
        return this.outlineVariant;
    }

    public int getPrimary() {
        return this.primary;
    }

    public int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public int getScrim() {
        return this.scrim;
    }

    public int getSecondary() {
        return this.secondary;
    }

    public int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public int getShadow() {
        return this.shadow;
    }

    public int getSurface() {
        return this.surface;
    }

    public int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public int getTertiary() {
        return this.tertiary;
    }

    public int getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public void setBackground(int i11) {
        this.background = i11;
    }

    public void setError(int i11) {
        this.error = i11;
    }

    public void setErrorContainer(int i11) {
        this.errorContainer = i11;
    }

    public void setInverseOnSurface(int i11) {
        this.inverseOnSurface = i11;
    }

    public void setInversePrimary(int i11) {
        this.inversePrimary = i11;
    }

    public void setInverseSurface(int i11) {
        this.inverseSurface = i11;
    }

    public void setOnBackground(int i11) {
        this.onBackground = i11;
    }

    public void setOnError(int i11) {
        this.onError = i11;
    }

    public void setOnErrorContainer(int i11) {
        this.onErrorContainer = i11;
    }

    public void setOnPrimary(int i11) {
        this.onPrimary = i11;
    }

    public void setOnPrimaryContainer(int i11) {
        this.onPrimaryContainer = i11;
    }

    public void setOnSecondary(int i11) {
        this.onSecondary = i11;
    }

    public void setOnSecondaryContainer(int i11) {
        this.onSecondaryContainer = i11;
    }

    public void setOnSurface(int i11) {
        this.onSurface = i11;
    }

    public void setOnSurfaceVariant(int i11) {
        this.onSurfaceVariant = i11;
    }

    public void setOnTertiary(int i11) {
        this.onTertiary = i11;
    }

    public void setOnTertiaryContainer(int i11) {
        this.onTertiaryContainer = i11;
    }

    public void setOutline(int i11) {
        this.outline = i11;
    }

    public void setOutlineVariant(int i11) {
        this.outlineVariant = i11;
    }

    public void setPrimary(int i11) {
        this.primary = i11;
    }

    public void setPrimaryContainer(int i11) {
        this.primaryContainer = i11;
    }

    public void setScrim(int i11) {
        this.scrim = i11;
    }

    public void setSecondary(int i11) {
        this.secondary = i11;
    }

    public void setSecondaryContainer(int i11) {
        this.secondaryContainer = i11;
    }

    public void setShadow(int i11) {
        this.shadow = i11;
    }

    public void setSurface(int i11) {
        this.surface = i11;
    }

    public void setSurfaceVariant(int i11) {
        this.surfaceVariant = i11;
    }

    public void setTertiary(int i11) {
        this.tertiary = i11;
    }

    public void setTertiaryContainer(int i11) {
        this.tertiaryContainer = i11;
    }

    public String toString() {
        return "Scheme{primary=" + this.primary + ", onPrimary=" + this.onPrimary + ", primaryContainer=" + this.primaryContainer + ", onPrimaryContainer=" + this.onPrimaryContainer + ", secondary=" + this.secondary + ", onSecondary=" + this.onSecondary + ", secondaryContainer=" + this.secondaryContainer + ", onSecondaryContainer=" + this.onSecondaryContainer + ", tertiary=" + this.tertiary + ", onTertiary=" + this.onTertiary + ", tertiaryContainer=" + this.tertiaryContainer + ", onTertiaryContainer=" + this.onTertiaryContainer + ", error=" + this.error + ", onError=" + this.onError + ", errorContainer=" + this.errorContainer + ", onErrorContainer=" + this.onErrorContainer + ", background=" + this.background + ", onBackground=" + this.onBackground + ", surface=" + this.surface + ", onSurface=" + this.onSurface + ", surfaceVariant=" + this.surfaceVariant + ", onSurfaceVariant=" + this.onSurfaceVariant + ", outline=" + this.outline + ", outlineVariant=" + this.outlineVariant + ", shadow=" + this.shadow + ", scrim=" + this.scrim + ", inverseSurface=" + this.inverseSurface + ", inverseOnSurface=" + this.inverseOnSurface + ", inversePrimary=" + this.inversePrimary + '}';
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int i11) {
        this.background = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int i11) {
        this.error = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int i11) {
        this.errorContainer = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int i11) {
        this.inverseOnSurface = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int i11) {
        this.inversePrimary = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int i11) {
        this.inverseSurface = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int i11) {
        this.onBackground = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int i11) {
        this.onError = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int i11) {
        this.onErrorContainer = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int i11) {
        this.onPrimary = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int i11) {
        this.onPrimaryContainer = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int i11) {
        this.onSecondary = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int i11) {
        this.onSecondaryContainer = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int i11) {
        this.onSurface = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int i11) {
        this.onSurfaceVariant = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int i11) {
        this.onTertiary = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int i11) {
        this.onTertiaryContainer = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int i11) {
        this.outline = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int i11) {
        this.outlineVariant = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int i11) {
        this.primary = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int i11) {
        this.primaryContainer = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int i11) {
        this.scrim = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int i11) {
        this.secondary = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int i11) {
        this.secondaryContainer = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int i11) {
        this.shadow = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int i11) {
        this.surface = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int i11) {
        this.surfaceVariant = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int i11) {
        this.tertiary = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int i11) {
        this.tertiaryContainer = i11;
        return this;
    }

    public static Scheme dark(int i11) {
        return darkFromCorePalette(CorePalette.m12950of(i11));
    }

    public static Scheme darkContent(int i11) {
        return darkFromCorePalette(CorePalette.contentOf(i11));
    }

    public static Scheme light(int i11) {
        return lightFromCorePalette(CorePalette.m12950of(i11));
    }

    public static Scheme lightContent(int i11) {
        return lightFromCorePalette(CorePalette.contentOf(i11));
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((System.identityHashCode(this) * 31) + this.primary) * 31) + this.onPrimary) * 31) + this.primaryContainer) * 31) + this.onPrimaryContainer) * 31) + this.secondary) * 31) + this.onSecondary) * 31) + this.secondaryContainer) * 31) + this.onSecondaryContainer) * 31) + this.tertiary) * 31) + this.onTertiary) * 31) + this.tertiaryContainer) * 31) + this.onTertiaryContainer) * 31) + this.error) * 31) + this.onError) * 31) + this.errorContainer) * 31) + this.onErrorContainer) * 31) + this.background) * 31) + this.onBackground) * 31) + this.surface) * 31) + this.onSurface) * 31) + this.surfaceVariant) * 31) + this.onSurfaceVariant) * 31) + this.outline) * 31) + this.outlineVariant) * 31) + this.shadow) * 31) + this.scrim) * 31) + this.inverseSurface) * 31) + this.inverseOnSurface) * 31) + this.inversePrimary;
    }
}
