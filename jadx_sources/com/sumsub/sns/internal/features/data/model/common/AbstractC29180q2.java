package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.q2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29180q2 {

    /* JADX INFO: renamed from: a */
    public final String f59176a;

    /* JADX INFO: renamed from: b */
    public final String f59177b;

    /* JADX INFO: renamed from: a */
    public final CharSequence m69801a(C29983l c29983l, CharSequence charSequence) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM69671a = AbstractC28892d.m69671a(new Object[]{this.f59176a}, 1, "sns_iddoc_type_%s", c29983l);
        if (strM69671a != null) {
            return strM69671a;
        }
        return charSequence == null ? this.f59176a : charSequence;
    }

    public AbstractC29180q2(String str, String str2) {
        this.f59176a = str;
        this.f59177b = str2;
    }
}
