package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC32661l {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66652a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f66653b;

    static {
        int[] iArr = new int[DocumentSideness.values().length];
        try {
            iArr[DocumentSideness.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DocumentSideness.SINGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DocumentSideness.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f66652a = iArr;
        int[] iArr2 = new int[SecondSidePolicy.values().length];
        try {
            iArr2[SecondSidePolicy.AlwaysPrompt.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SecondSidePolicy.Backend.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f66653b = iArr2;
    }
}
