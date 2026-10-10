package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.features.data.model.common.ApplicantStatus;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC32448s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66138a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f66139b;

    static {
        int[] iArr = new int[ApplicantStatus.values().length];
        try {
            iArr[ApplicantStatus.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicantStatus.Submitting.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApplicantStatus.Reviewing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApplicantStatus.Reviewed.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ApplicantStatus.Skip.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f66138a = iArr;
        int[] iArr2 = new int[ReviewStatusType.values().length];
        try {
            iArr2[ReviewStatusType.Completed.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ReviewStatusType.RequiresAction.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ReviewStatusType.AwaitingService.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ReviewStatusType.Processing.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ReviewStatusType.Pending.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ReviewStatusType.Prechecked.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        f66139b = iArr2;
    }
}
