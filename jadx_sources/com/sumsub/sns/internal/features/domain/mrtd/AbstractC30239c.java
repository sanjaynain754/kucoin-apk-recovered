package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.features.data.model.common.MRTDError;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30239c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60780a;

    static {
        int[] iArr = new int[MRTDError.values().length];
        try {
            iArr[MRTDError.ModuleNotFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MRTDError.HardwareUnavailable.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MRTDError.ModuleMisconfigured.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f60780a = iArr;
    }
}
