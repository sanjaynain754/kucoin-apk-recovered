package com.facebook.react.uimanager.drawable;

import p852kotlin.Metadata;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BoxShadowBorderRadius.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, m90084d2 = {"adjustRadiusForSpread", "", "radius", "spread", "ReactAndroid_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class BoxShadowBorderRadiusKt {
    public static final float adjustRadiusForSpread(float f11, float f12) {
        float fPow;
        if (f11 < Math.abs(f12)) {
            float f13 = 1;
            fPow = f13 + ((float) Math.pow((f11 / Math.abs(f12)) - f13, 3));
        } else {
            fPow = 1.0f;
        }
        return RangesKt.coerceAtLeast(f11 + (f12 * fPow), 0.0f);
    }
}
