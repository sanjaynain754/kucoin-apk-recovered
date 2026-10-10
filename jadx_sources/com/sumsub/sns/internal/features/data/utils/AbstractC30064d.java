package com.sumsub.sns.internal.features.data.utils;

import com.sumsub.sns.internal.features.data.model.common.C29069W2;
import com.sumsub.sns.internal.features.data.model.common.C29086a3;
import com.sumsub.sns.internal.features.data.model.common.C29110e3;
import java.util.List;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.utils.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30064d {
    /* JADX INFO: renamed from: a */
    public static final String m70090a(C29069W2 c29069w2, String str, String str2) {
        C29110e3 c29110e3;
        C29086a3 c29086a3;
        if (str2 == null || (c29110e3 = (C29110e3) c29069w2.f59013b.get(str)) == null || (c29086a3 = (C29086a3) c29110e3.f59060a.get(str2)) == null) {
            return null;
        }
        return c29086a3.f59038a;
    }

    /* JADX INFO: renamed from: b */
    public static final List m70091b(C29069W2 c29069w2, String str, String str2) {
        C29110e3 c29110e3;
        C29086a3 c29086a3;
        if (str2 == null || str == null || (c29110e3 = (C29110e3) c29069w2.f59013b.get(str)) == null || (c29086a3 = (C29086a3) c29110e3.f59060a.get(str2)) == null) {
            return null;
        }
        return c29086a3.f59039b;
    }
}
