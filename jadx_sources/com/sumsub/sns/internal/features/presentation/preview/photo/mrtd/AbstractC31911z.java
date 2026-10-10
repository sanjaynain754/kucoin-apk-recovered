package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC31911z {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64871a;

    static {
        int[] iArr = new int[MRTDInstructionType.values().length];
        try {
            iArr[MRTDInstructionType.ECard.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MRTDInstructionType.EPassportFrontCoverOutside.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f64871a = iArr;
    }
}
