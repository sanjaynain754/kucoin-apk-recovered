package com.tencent.bugly.network;

import com.tencent.bugly.proguard.C34049z1;
import java.util.Iterator;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class ClientBuilder {

    /* JADX INFO: renamed from: a */
    public static OkHttpClient.Builder f68766a;

    /* JADX INFO: renamed from: a */
    public static OkHttpClient.Builder m72242a() {
        if (f68766a == null) {
            synchronized (ClientBuilder.class) {
                try {
                    if (f68766a == null) {
                        f68766a = new OkHttpClient.Builder();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68766a;
    }

    public static OkHttpClient.Builder configBuilder(OkHttpClient.Builder builder) {
        if (builder == null) {
            builder = m72242a();
        }
        try {
            builder.eventListenerFactory(BuglyListenerFactory.getInstance());
            m72243a(builder);
        } catch (Throwable unused) {
        }
        return builder;
    }

    public static OkHttpClient createClient(OkHttpClient okHttpClient) {
        return configBuilder(okHttpClient == null ? null : okHttpClient.newBuilder()).build();
    }

    /* JADX INFO: renamed from: a */
    public static void m72243a(OkHttpClient.Builder builder) {
        List<Interceptor> listInterceptors = builder.interceptors();
        if (listInterceptors != null) {
            Iterator<Interceptor> it = listInterceptors.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C34049z1) {
                    return;
                }
            }
        }
        if (listInterceptors != null) {
            listInterceptors.add(0, C34049z1.f72585a);
        }
    }
}
