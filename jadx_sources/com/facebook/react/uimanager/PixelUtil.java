package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: PixelUtil.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J\n\u0010\f\u001a\u00020\u0005*\u00020\rJ\n\u0010\f\u001a\u00020\u0005*\u00020\u000eJ\n\u0010\f\u001a\u00020\u0005*\u00020\u0005J\n\u0010\f\u001a\u00020\u0005*\u00020\u0007J\n\u0010\u000f\u001a\u00020\u0005*\u00020\rJ\n\u0010\u000f\u001a\u00020\u0005*\u00020\u000eJ\n\u0010\u000f\u001a\u00020\u0005*\u00020\u0005J\n\u0010\u000f\u001a\u00020\u0005*\u00020\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/react/uimanager/PixelUtil;", "", "<init>", "()V", "toPixelFromDIP", "", "value", "", "toPixelFromSP", "maxFontScale", "toDIPFromPixel", "getDisplayMetricDensity", "dpToPx", "", "", "pxToDp", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class PixelUtil {

    @NotNull
    public static final PixelUtil INSTANCE = new PixelUtil();

    @JvmStatic
    public static final float toPixelFromDIP(float value) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, value, DisplayMetricsHolder.getWindowDisplayMetrics());
    }

    @JvmStatic
    @JvmOverloads
    public static final float toPixelFromSP(float f11) {
        return toPixelFromSP$default(f11, 0.0f, 2, null);
    }

    public final float dpToPx(int i11) {
        return toPixelFromDIP(i11);
    }

    public final float pxToDp(int i11) {
        return toDIPFromPixel(i11);
    }

    @JvmStatic
    @JvmOverloads
    public static final float toPixelFromSP(float value, float maxFontScale) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        DisplayMetrics windowDisplayMetrics = DisplayMetricsHolder.getWindowDisplayMetrics();
        float fApplyDimension = TypedValue.applyDimension(2, value, windowDisplayMetrics);
        return maxFontScale >= 1.0f ? Math.min(fApplyDimension, value * windowDisplayMetrics.density * maxFontScale) : fApplyDimension;
    }

    public static /* synthetic */ float toPixelFromSP$default(float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = Float.NaN;
        }
        return toPixelFromSP(f11, f12);
    }

    public final float dpToPx(long j11) {
        return toPixelFromDIP(j11);
    }

    public final float pxToDp(long j11) {
        return toDIPFromPixel(j11);
    }

    private PixelUtil() {
    }

    @JvmStatic
    public static final float getDisplayMetricDensity() {
        return DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    @JvmStatic
    public static final float toDIPFromPixel(float value) {
        if (Float.isNaN(value)) {
            return Float.NaN;
        }
        return value / DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    public final float dpToPx(float f11) {
        return toPixelFromDIP(f11);
    }

    public final float pxToDp(float f11) {
        return toDIPFromPixel(f11);
    }

    @JvmStatic
    public static final float toPixelFromDIP(double value) {
        return toPixelFromDIP((float) value);
    }

    public final float dpToPx(double d11) {
        return toPixelFromDIP((float) d11);
    }

    public final float pxToDp(double d11) {
        return toDIPFromPixel((float) d11);
    }

    @JvmStatic
    public static final float toPixelFromSP(double value) {
        return toPixelFromSP$default((float) value, 0.0f, 2, null);
    }
}
