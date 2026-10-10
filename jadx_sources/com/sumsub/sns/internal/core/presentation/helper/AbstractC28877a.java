package com.sumsub.sns.internal.core.presentation.helper;

import com.sumsub.sns.internal.features.data.model.common.ApplicantStatus;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.helper.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28877a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58720a;

    static {
        int[] iArr = new int[ApplicantStatus.values().length];
        try {
            iArr[ApplicantStatus.Reviewing.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicantStatus.Submitting.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApplicantStatus.Reviewed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f58720a = iArr;
    }
}
