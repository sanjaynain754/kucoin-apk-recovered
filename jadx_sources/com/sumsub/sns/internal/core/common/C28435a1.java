package com.sumsub.sns.internal.core.common;

import java.util.ArrayList;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.math.MathKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.a1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28435a1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f57949a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f57950b = true;

    /* JADX INFO: renamed from: a */
    public final long m69318a(double d11) {
        if (!this.f57950b) {
            CollectionsKt.sort(this.f57949a);
            this.f57950b = true;
        }
        int iRoundToInt = MathKt.roundToInt((d11 / 100.0d) * ((double) (this.f57949a.size() - 1)));
        ArrayList arrayList = this.f57949a;
        return ((Number) ((iRoundToInt < 0 || iRoundToInt >= arrayList.size()) ? -1L : arrayList.get(iRoundToInt))).longValue();
    }
}
