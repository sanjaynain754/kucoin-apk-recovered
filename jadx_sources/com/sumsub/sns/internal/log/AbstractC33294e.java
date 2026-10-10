package com.sumsub.sns.internal.log;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33294e {
    /* JADX INFO: renamed from: a */
    public static final String m71624a(Object obj) {
        if (!obj.getClass().isAnonymousClass()) {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 23) {
                return simpleName;
            }
            return simpleName.substring(0, 23);
        }
        String name = obj.getClass().getName();
        if (name.length() <= 23) {
            return name;
        }
        return name.substring(name.length() - 23, name.length());
    }
}
