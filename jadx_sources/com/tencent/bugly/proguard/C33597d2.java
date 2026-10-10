package com.tencent.bugly.proguard;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33597d2 {

    /* JADX INFO: renamed from: a */
    public static final String f69485a = "BuildConfigWrapper";

    /* JADX INFO: renamed from: b */
    public static final String f69486b = "4.4.7.8";

    /* JADX INFO: renamed from: c */
    public static final String f69487c = "https://rmonitor.qq.com";

    /* JADX INFO: renamed from: d */
    public static final String f69488d = "https://t.rmonitor.qq.com";

    /* JADX INFO: renamed from: e */
    public static final String f69489e = "https://pre.rmonitor.qq.com";

    /* JADX INFO: renamed from: f */
    public static final String f69490f = "https://pro.bugly.qq.com";

    /* JADX INFO: renamed from: g */
    public static final String f69491g = "https://t.pro.bugly.qq.com";

    /* JADX INFO: renamed from: h */
    public static final String f69492h = "https://android.bugly.tencent.com";

    /* JADX INFO: renamed from: i */
    public static final String f69493i = "https://t.android.bugly.tencent.com";

    /* JADX INFO: renamed from: j */
    public static final String f69494j = "https://cloud.bugly.qq.com";

    /* JADX INFO: renamed from: k */
    public static final String f69495k = "https://buglycloud.test.ias.qq.com";

    /* JADX INFO: renamed from: l */
    public static final String f69496l = "https://buglypro.iot-tencent.com";

    /* JADX INFO: renamed from: m */
    public static final String f69497m = "https://buglycloud.sgp.tencent.com";

    /* JADX INFO: renamed from: n */
    public static final String f69498n = "https://buglycloudsgp.test.ias.qq.com";

    /* JADX INFO: renamed from: o */
    public static final Set<String> f69499o;

    /* JADX INFO: renamed from: p */
    public static String f69500p;

    /* JADX INFO: renamed from: a */
    public static String m72766a() {
        return "https://h.trace.qq.com/kv";
    }

    static {
        HashSet hashSet = new HashSet();
        f69499o = hashSet;
        hashSet.add("https://rmonitor.qq.com");
        hashSet.add("https://t.rmonitor.qq.com");
        hashSet.add("https://pre.rmonitor.qq.com");
        hashSet.add("https://pro.bugly.qq.com");
        hashSet.add("https://t.pro.bugly.qq.com");
        hashSet.add("https://android.bugly.tencent.com");
        hashSet.add(f69493i);
        hashSet.add("https://cloud.bugly.qq.com");
        hashSet.add(f69495k);
        hashSet.add("https://buglypro.iot-tencent.com");
        hashSet.add("https://buglycloud.sgp.tencent.com");
        hashSet.add(f69498n);
        f69500p = "https://pro.bugly.qq.com";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72767a(String str) {
        if (!f69499o.contains(str)) {
            return false;
        }
        f69500p = str;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m72768b() {
        return f69500p;
    }
}
