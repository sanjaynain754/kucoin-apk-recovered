package com.sumsub.sns.core.presentation.form.model;

import com.sumsub.sns.internal.core.presentation.form.model.FieldError;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.model.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28177a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57442a;

    static {
        int[] iArr = new int[FieldError.values().length];
        try {
            iArr[FieldError.REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FieldError.NOT_VALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f57442a = iArr;
    }
}
