package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.EKycFlowStatus;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC31515C {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f63940a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f63941b;

    static {
        int[] iArr = new int[ConfirmationType.values().length];
        try {
            iArr[ConfirmationType.OTP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConfirmationType.OAUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConfirmationType.EID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f63940a = iArr;
        int[] iArr2 = new int[EKycFlowStatus.values().length];
        try {
            iArr2[EKycFlowStatus.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EKycFlowStatus.SKIPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EKycFlowStatus.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f63941b = iArr2;
    }
}
