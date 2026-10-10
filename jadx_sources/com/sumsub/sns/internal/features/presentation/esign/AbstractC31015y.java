package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.features.data.model.esign.ESignSubmissionResponse$Status;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC31015y {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f62683a;

    static {
        int[] iArr = new int[ESignSubmissionResponse$Status.values().length];
        try {
            iArr[ESignSubmissionResponse$Status.ACTION_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ESignSubmissionResponse$Status.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ESignSubmissionResponse$Status.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f62683a = iArr;
    }
}
