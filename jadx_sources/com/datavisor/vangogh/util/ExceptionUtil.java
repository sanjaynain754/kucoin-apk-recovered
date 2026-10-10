package com.datavisor.vangogh.util;

import android.content.Context;
import com.datavisorobfus.C5399a;
import com.datavisorobfus.C5411e;
import com.datavisorobfus.C5415f0;
import com.datavisorobfus.C5422i;
import com.datavisorobfus.C5430m;
import com.datavisorobfus.C5440r;
import com.datavisorobfus.C5441r0;
import com.datavisorobfus.C5447u0;
import com.datavisorobfus.C5457z0;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes34.dex */
public class ExceptionUtil {
    /* JADX INFO: renamed from: a */
    public static synchronized String m7088a(Context context) {
        return C5447u0.m7416e(context, "DVSPNETEXCEPTION");
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m7094b(Context context) {
        return C5447u0.m7416e(context, "DVSPOVERALLEXCEPTION");
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m7089a(String str, String str2, Context context) {
        if (m7093a(1)) {
            m7090a(str, str2, context, "DVSPNETEXCEPTION");
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m7095b(String str, Throwable th2, Context context) {
        m7092a(str, th2, context, "DVSPOVERALLEXCEPTION");
    }

    /* JADX INFO: renamed from: c */
    public static synchronized String m7096c(Context context) {
        return C5447u0.m7416e(context, "DVSPZDEXCEPTION");
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m7097d(Context context) {
        C5447u0.m7412b(context, "DVSPOVERALLEXCEPTION");
        C5447u0.m7412b(context, "DVSPNETEXCEPTION");
        C5447u0.m7412b(context, "DVSPZDEXCEPTION");
    }

    /* JADX INFO: renamed from: a */
    private static void m7090a(String str, String str2, Context context, String str3) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (C5457z0.m7482b(str)) {
                sb2.append(str);
                sb2.append('\n');
            }
            sb2.append(str2);
            sb2.append('\n');
            sb2.append("tt: " + System.currentTimeMillis());
            String string = sb2.toString();
            if (C5457z0.m7482b(string)) {
                C5447u0.m7411b(context, str3, string);
            }
        } catch (Throwable unused) {
        }
    }

    public static void reportException(Context context) {
        try {
            String strM7088a = m7088a(context);
            String strM7094b = m7094b(context);
            String strM7096c = m7096c(context);
            HashMap map = new HashMap();
            if (C5457z0.m7482b(strM7088a)) {
                map.put("netException", strM7088a);
            }
            if (C5457z0.m7482b(strM7094b)) {
                map.put("overallException", strM7094b);
            }
            if (C5457z0.m7482b(strM7096c)) {
                map.put("zdException", strM7096c);
            }
            if (!map.isEmpty()) {
                if (C5457z0.m7482b(C5422i.m7160b().m7162a())) {
                    map.put("app_access_key", C5422i.m7160b().m7162a());
                }
                map.put("sdk_version", "5.3.5.20260227_Android");
                map.put(C33556b3.f69078o2, KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
                String strM7321a = C5440r.m7286q().m7321a(context, "wlan0");
                if (C5457z0.m7482b(strM7321a) && !strM7321a.equals("no_permission") && !strM7321a.equals("para_err") && !strM7321a.equals("empty") && !strM7321a.equals("exception")) {
                    map.put(TPDownloadProxyEnum.USER_MAC, strM7321a);
                }
                String strM7329d = C5440r.m7286q().m7329d(context);
                if (C5457z0.m7482b(strM7329d) && !strM7329d.equals("empty") && !strM7329d.equals("exception") && !strM7329d.equals("para_err") && !strM7329d.equals("default")) {
                    map.put("aid", strM7329d);
                }
                String strM7368v = C5440r.m7286q().m7368v();
                if (C5457z0.m7482b(strM7368v)) {
                    map.put(TPDownloadProxyEnum.USER_DEVICE_MODEL, strM7368v);
                }
                String strM7328d = C5440r.m7286q().m7328d();
                if (C5457z0.m7482b(strM7328d)) {
                    map.put("os_version", strM7328d);
                }
                String strM7104e = C5399a.m7098a().m7104e(context);
                if (C5457z0.m7482b(strM7104e)) {
                    map.put("app_version", strM7104e);
                }
                byte[] bArrM7221a = C5430m.m7221a(C5411e.m7130b(map).toString().getBytes());
                if (bArrM7221a != null) {
                    HashMap map2 = new HashMap();
                    map2.put("c", "1");
                    if (C5441r0.m7389d(map2, bArrM7221a, context).f7383c == 0) {
                        m7097d(context);
                    }
                }
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m7091a(String str, Throwable th2, Context context) {
        if (m7093a(1)) {
            m7092a(str, th2, context, "DVSPNETEXCEPTION");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7092a(String str, Throwable th2, Context context, String str2) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!C5457z0.m7480a(str)) {
                sb2.append(str);
                sb2.append('\n');
            }
            sb2.append(th2.toString());
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                sb2.append('\n');
                sb2.append(stackTraceElement.toString());
            }
            sb2.append('\n');
            sb2.append("tt: " + System.currentTimeMillis());
            String string = sb2.toString();
            if (C5457z0.m7480a(string)) {
                return;
            }
            C5447u0.m7411b(context, str2, string);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7093a(int i11) {
        try {
            return new Random().nextInt(100) + 1 <= Math.min(100, Math.max(0, i11));
        } catch (Throwable unused) {
        }
    }
}
