package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.core.data.model.DayNightMode;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28086a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57284a;

    static {
        int[] iArr = new int[DayNightMode.values().length];
        try {
            iArr[DayNightMode.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DayNightMode.NIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f57284a = iArr;
    }
}
