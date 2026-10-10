package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.features.data.model.common.C29699u;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC31478C {
    /* JADX INFO: renamed from: a */
    public static final String m70748a(C29699u c29699u, String str, C29983l c29983l) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = c29699u.f59761b;
        String strM69671a = AbstractC28892d.m69671a(new Object[]{str2 != null ? StringsKt.replaceFirst$default(str2, "custom.", "", false, 4, (Object) null) : null}, 1, str, c29983l);
        if (strM69671a == null || strM69671a.length() <= 0) {
            return null;
        }
        return strM69671a;
    }
}
