package com.sumsub.sns.internal.core.presentation.form.model;

import com.sumsub.sns.internal.core.presentation.util.AbstractC28967a;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29028M0;
import com.sumsub.sns.internal.features.data.model.common.C29705v0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28849i0 {
    /* JADX INFO: renamed from: a */
    public static final FieldError m69660a(C29470F c29470f, String str) {
        if (Intrinsics.areEqual(c29470f.f59470e, Boolean.TRUE) && (str == null || StringsKt.isBlank(str))) {
            return FieldError.REQUIRED;
        }
        C29705v0 c29705v0 = AbstractC29028M0.Companion;
        String str2 = c29470f.f59471f;
        c29705v0.getClass();
        if (AbstractC28967a.m69711a(C29705v0.m69909a(str2), str)) {
            return null;
        }
        return FieldError.NOT_VALID;
    }
}
