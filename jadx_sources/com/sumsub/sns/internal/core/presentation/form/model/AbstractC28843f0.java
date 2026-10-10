package com.sumsub.sns.internal.core.presentation.form.model;

import com.sumsub.sns.internal.core.presentation.form.FieldId;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28843f0 {
    /* JADX INFO: renamed from: a */
    public static final FieldId m69656a(AbstractC28841e0 abstractC28841e0) {
        String strMo69643d = abstractC28841e0.mo69643d();
        if (strMo69643d == null) {
            strMo69643d = "";
        }
        String str = abstractC28841e0.mo69642c().f59466a;
        return new FieldId(strMo69643d, str != null ? str : "");
    }
}
