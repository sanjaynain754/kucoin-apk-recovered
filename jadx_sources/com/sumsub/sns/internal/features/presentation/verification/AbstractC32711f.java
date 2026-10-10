package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC32711f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66910a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f66911b;

    static {
        int[] iArr = new int[ValidationIdentifierType.values().length];
        try {
            iArr[ValidationIdentifierType.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ValidationIdentifierType.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f66910a = iArr;
        int[] iArr2 = new int[SNSVerificationStepViewModel$ViewState$ButtonSpec$Action.values().length];
        try {
            iArr2[SNSVerificationStepViewModel$ViewState$ButtonSpec$Action.RESEND_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SNSVerificationStepViewModel$ViewState$ButtonSpec$Action.ENTER_OTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f66911b = iArr2;
    }
}
