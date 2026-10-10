package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28203k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57482a;

    static {
        int[] iArr = new int[FormItem$ItemState.values().length];
        try {
            iArr[FormItem$ItemState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormItem$ItemState.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f57482a = iArr;
    }
}
