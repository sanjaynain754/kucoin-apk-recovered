package com.facebook.react.views.view;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: ColorUtil.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0002¨\u0006\r"}, m90084d2 = {"Lcom/facebook/react/views/view/ColorUtil;", "", "<init>", "()V", "normalize", "", "r", "", "g", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "clamp255", "value", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ColorUtil {

    @NotNull
    public static final ColorUtil INSTANCE = new ColorUtil();

    private final int clamp255(double value) {
        return Math.max(0, Math.min(255, MathKt.roundToInt(value)));
    }

    @JvmStatic
    public static final int normalize(double r11, double g11, double b11, double a11) {
        ColorUtil colorUtil = INSTANCE;
        return (colorUtil.clamp255(r11) << 16) | (colorUtil.clamp255(a11 * ((double) 255)) << 24) | (colorUtil.clamp255(g11) << 8) | colorUtil.clamp255(b11);
    }

    private ColorUtil() {
    }
}
