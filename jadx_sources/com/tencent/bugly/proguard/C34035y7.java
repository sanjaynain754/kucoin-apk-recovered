package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34035y7 {

    /* JADX INFO: renamed from: a */
    public static Proxy f72550a;

    /* JADX INFO: renamed from: a */
    public static void m75487a(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            f72550a = null;
        } else {
            f72550a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75488a(InetAddress inetAddress, int i11) {
        if (inetAddress == null) {
            f72550a = null;
        } else {
            f72550a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Proxy m75486a() {
        return f72550a;
    }
}
