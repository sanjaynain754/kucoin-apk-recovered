package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import java.security.KeyStore;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.kh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33759kh {

    /* JADX INFO: renamed from: a */
    public static X509TrustManager f70673a;

    /* JADX INFO: renamed from: a */
    public static X509TrustManager m73820a() {
        X509TrustManager x509TrustManager = f70673a;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    f70673a = (X509TrustManager) trustManager;
                }
            }
        } catch (Throwable unused) {
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor", "Default System TrustManager is " + f70673a);
        }
        return f70673a;
    }
}
