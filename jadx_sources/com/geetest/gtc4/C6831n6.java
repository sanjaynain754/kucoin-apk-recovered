package com.geetest.gtc4;

import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: renamed from: com.geetest.gtc4.n6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6831n6 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Security.getProperty("com.geetest.gtc4.asn1.allow_unsafe_integer");
    }
}
