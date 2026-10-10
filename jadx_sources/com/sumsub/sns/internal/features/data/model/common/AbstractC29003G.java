package com.sumsub.sns.internal.features.data.model.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC29003G {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58949a;

    static {
        int[] iArr = new int[ReviewStatusType.values().length];
        try {
            iArr[ReviewStatusType.Init.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewStatusType.Processing.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReviewStatusType.RequiresAction.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReviewStatusType.AwaitingService.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ReviewStatusType.Pending.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ReviewStatusType.Prechecked.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ReviewStatusType.Completed.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ReviewStatusType.Unknown.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f58949a = iArr;
    }
}
