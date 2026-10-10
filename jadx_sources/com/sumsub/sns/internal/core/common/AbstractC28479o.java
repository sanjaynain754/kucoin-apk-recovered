package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.data.model.SNSSupportItem;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28479o {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58015a;

    static {
        int[] iArr = new int[SNSSupportItem.Type.values().length];
        try {
            iArr[SNSSupportItem.Type.Url.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSSupportItem.Type.Email.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f58015a = iArr;
    }
}
