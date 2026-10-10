package com.sumsub.sns.internal.core.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.N0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28409N0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m69294a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
