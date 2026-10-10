package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.kd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33755kd {

    /* JADX INFO: renamed from: a */
    public static final String f70650a = "NetWorkUtil";

    /* JADX INFO: renamed from: b */
    public static final String f70651b = "127\\.(?:[0-9]{1,3}\\.){2}[0-9]{1,3}";

    /* JADX INFO: renamed from: c */
    public static final String f70652c = "10\\.(?:[0-9]{1,3}\\.){2}[0-9]{1,3}";

    /* JADX INFO: renamed from: d */
    public static final String f70653d = "172\\.(?:1[6-9]|2[0-9]|3[0-1])\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}";

    /* JADX INFO: renamed from: e */
    public static final String f70654e = "192\\.168\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}";

    /* JADX INFO: renamed from: f */
    public static final String f70655f = "169\\.254\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}";

    /* JADX INFO: renamed from: g */
    public static final String f70656g = "::1";

    /* JADX INFO: renamed from: h */
    public static final String f70657h = "fe80:(?::[0-9a-fA-F]{0,4}){0,7}";

    /* JADX INFO: renamed from: i */
    public static final String f70658i = "fc[0-9a-fA-F]{2}:(?::[0-9a-fA-F]{0,4}){0,7}";

    /* JADX INFO: renamed from: j */
    public static final Pattern f70659j = Pattern.compile("^(127\\.(?:[0-9]{1,3}\\.){2}[0-9]{1,3}|10\\.(?:[0-9]{1,3}\\.){2}[0-9]{1,3}|172\\.(?:1[6-9]|2[0-9]|3[0-1])\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}|192\\.168\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}|169\\.254\\.(?:[0-9]{1,3}\\.)[0-9]{1,3}|::1|fe80:(?::[0-9a-fA-F]{0,4}){0,7}|fc[0-9a-fA-F]{2}:(?::[0-9a-fA-F]{0,4}){0,7})$");

    /* JADX INFO: renamed from: a */
    public static boolean m73813a(String str) {
        try {
            return f70659j.matcher(str).matches();
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70650a, th2);
            return false;
        }
    }
}
