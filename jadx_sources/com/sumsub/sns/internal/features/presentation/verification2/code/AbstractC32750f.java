package com.sumsub.sns.internal.features.presentation.verification2.code;

import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC32750f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67008a;

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
        f67008a = iArr;
    }
}
