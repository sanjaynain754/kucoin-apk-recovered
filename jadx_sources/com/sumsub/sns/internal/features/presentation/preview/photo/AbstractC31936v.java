package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.presentation.utils.SecondSideStep;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC31936v {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64925a;

    static {
        int[] iArr = new int[SecondSideStep.values().length];
        try {
            iArr[SecondSideStep.Prompt.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SecondSideStep.RequestBackSide.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SecondSideStep.Proceed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f64925a = iArr;
    }
}
