package com.tencent.bugly.network;

import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33860pd;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Hashtable;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class BuglyURLStreamHandlerFactory implements URLStreamHandlerFactory {

    /* JADX INFO: renamed from: c */
    public static final String f68763c = "RMonitor_net_quality";

    /* JADX INFO: renamed from: d */
    public static Object f68764d;

    /* JADX INFO: renamed from: b */
    public final URLStreamHandlerFactory f68765b;

    /* JADX INFO: renamed from: a */
    public static Object m72239a() {
        String message;
        Object obj = null;
        boolean z11 = false;
        try {
            Field declaredField = URL.class.getDeclaredField("factory");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            message = null;
            obj = obj2;
            z11 = true;
        } catch (IllegalAccessException e11) {
            message = e11.getMessage();
        } catch (NoSuchFieldException e12) {
            message = e12.getMessage();
        } catch (Throwable th2) {
            message = th2.getMessage();
        }
        Logger.INSTANCE.mo77132i("RMonitor_net_quality", "getFactory, ret: " + z11 + ", factory: " + obj + ", errorMsg: " + message);
        return obj;
    }

    public static void reset() {
        boolean zM72240a = m72240a(f68764d);
        f68764d = null;
        Logger.INSTANCE.mo77132i("RMonitor_net_quality", "reset, " + zM72240a);
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        return this.f68765b.createURLStreamHandler(str);
    }

    public BuglyURLStreamHandlerFactory(OkHttpClient okHttpClient) {
        this.f68765b = new C33860pd(okHttpClient);
    }

    public static void init(OkHttpClient okHttpClient) {
        BuglyURLStreamHandlerFactory buglyURLStreamHandlerFactory;
        Object objM72239a = m72239a();
        if (objM72239a instanceof BuglyURLStreamHandlerFactory) {
            Logger.INSTANCE.mo77132i("RMonitor_net_quality", "has inited before.");
            return;
        }
        f68764d = objM72239a;
        boolean zM72241a = false;
        try {
            buglyURLStreamHandlerFactory = new BuglyURLStreamHandlerFactory(ClientBuilder.createClient(okHttpClient));
            try {
                URL.setURLStreamHandlerFactory(buglyURLStreamHandlerFactory);
                zM72241a = true;
                Logger.INSTANCE.mo77132i("RMonitor_net_quality", "setURLStreamHandlerFactory success.");
            } catch (Throwable unused) {
                if (buglyURLStreamHandlerFactory != null) {
                    zM72241a = m72241a((URLStreamHandlerFactory) buglyURLStreamHandlerFactory);
                }
            }
        } catch (Throwable unused2) {
            buglyURLStreamHandlerFactory = null;
        }
        Logger.INSTANCE.mo77132i("RMonitor_net_quality", "init, " + zM72241a);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72240a(Object obj) {
        String message;
        boolean z11 = false;
        try {
            Field declaredField = URL.class.getDeclaredField("factory");
            declaredField.setAccessible(true);
            message = null;
            declaredField.set(null, obj);
            Field declaredField2 = URL.class.getDeclaredField("handlers");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(null);
            if (obj2 instanceof Hashtable) {
                ((Hashtable) obj2).clear();
            }
            z11 = true;
        } catch (IllegalAccessException e11) {
            message = e11.getMessage();
        } catch (NoSuchFieldException e12) {
            message = e12.getMessage();
        } catch (Throwable th2) {
            message = th2.getMessage();
        }
        Logger.INSTANCE.mo77132i("RMonitor_net_quality", "resetFactory, ret: " + z11 + ", errorMsg: " + message);
        return z11;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72241a(@NonNull URLStreamHandlerFactory uRLStreamHandlerFactory) {
        String message;
        boolean z11 = false;
        try {
            Field declaredField = URL.class.getDeclaredField("handlers");
            declaredField.setAccessible(true);
            message = null;
            Object obj = declaredField.get(null);
            if (obj instanceof Hashtable) {
                Hashtable hashtable = (Hashtable) obj;
                hashtable.put("http", uRLStreamHandlerFactory.createURLStreamHandler("http"));
                hashtable.put(ProxyConfig.MATCH_HTTPS, uRLStreamHandlerFactory.createURLStreamHandler(ProxyConfig.MATCH_HTTPS));
                z11 = true;
            }
        } catch (IllegalAccessException e11) {
            message = e11.getMessage();
        } catch (NoSuchFieldException e12) {
            message = e12.getMessage();
        } catch (Throwable th2) {
            message = th2.getMessage();
        }
        Logger.INSTANCE.mo77132i("RMonitor_net_quality", "updateHandlers, ret: " + z11 + ", errorMsg: " + message);
        return z11;
    }
}
