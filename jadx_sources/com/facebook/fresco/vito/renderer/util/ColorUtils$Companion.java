package com.facebook.fresco.vito.renderer.util;

import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ColorUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"com/facebook/fresco/vito/renderer/util/ColorUtils$Companion", "", "<init>", "()V", "", "color", "alpha", "multiplyColorAlpha", "(II)I", "renderer_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ColorUtils$Companion {
    public /* synthetic */ ColorUtils$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ColorUtils$Companion() {
    }

    public final int multiplyColorAlpha(int color, int alpha) {
        if (alpha != 0) {
            if (alpha != 255) {
                return (color & 16777215) | ((((color >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24);
            }
            return color;
        }
        return color & 16777215;
    }
}
