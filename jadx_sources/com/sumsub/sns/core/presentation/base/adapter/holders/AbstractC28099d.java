package com.sumsub.sns.core.presentation.base.adapter.holders;

import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.adapter.holders.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28099d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57301a;

    static {
        int[] iArr = new int[SNSStepState.values().length];
        try {
            iArr[SNSStepState.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSStepState.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f57301a = iArr;
    }
}
