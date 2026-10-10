package com.kubi.core.biz.margininfo.dialog;

import p852kotlin.Metadata;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.m */
/* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m90084d2 = {"resolveLeverageSectionIndex", "", "sectionValue", "", "sectionCount", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11958m {
    /* JADX INFO: renamed from: a */
    public static final int m21948a(float f11, int i11) {
        if (i11 <= 0) {
            return 0;
        }
        return RangesKt.coerceIn(MathKt.roundToInt(f11 / (100.0f / i11)), 0, i11);
    }
}
