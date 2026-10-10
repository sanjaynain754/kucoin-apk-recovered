package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28398I {
    /* JADX INFO: renamed from: a */
    public static final String m69284a(C29983l c29983l, String... strArr) {
        if (c29983l == null) {
            return "";
        }
        for (String str : strArr) {
            String strM70061a = c29983l.m70061a(str);
            if (strM70061a != null && !StringsKt.isBlank(strM70061a)) {
                return strM70061a;
            }
        }
        return "";
    }
}
