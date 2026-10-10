package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C7090R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, C7090R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, C7090R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, C7090R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, C7090R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i11, float f11, @NonNull View view) {
        return compositeOverlay(i11, f11 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i11, float f11, @NonNull View view) {
        return compositeOverlayIfNeeded(i11, f11 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f11, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f11 + getParentAbsoluteElevation(view));
    }

    private boolean isThemeSurfaceColor(@ColorInt int i11) {
        return ColorUtils.setAlphaComponent(i11, 255) == this.colorSurface;
    }

    public float calculateOverlayAlphaFraction(float f11) {
        float f12 = this.displayDensity;
        if (f12 <= 0.0f || f11 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f11 / f12)) * FORMULA_MULTIPLIER) + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public int calculateOverlayAlpha(float f11) {
        return Math.round(calculateOverlayAlphaFraction(f11) * 255.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i11, float f11) {
        int i12;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f11);
        int iAlpha = Color.alpha(i11);
        int iLayer = MaterialColors.layer(ColorUtils.setAlphaComponent(i11, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i12 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, ColorUtils.setAlphaComponent(i12, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return ColorUtils.setAlphaComponent(iLayer, iAlpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i11, float f11) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i11)) ? compositeOverlay(i11, f11) : i11;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f11) {
        return compositeOverlayIfNeeded(this.colorSurface, f11);
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    public ElevationOverlayProvider(boolean z11, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13, float f11) {
        this.elevationOverlayEnabled = z11;
        this.elevationOverlayColor = i11;
        this.elevationOverlayAccentColor = i12;
        this.colorSurface = i13;
        this.displayDensity = f11;
    }
}
