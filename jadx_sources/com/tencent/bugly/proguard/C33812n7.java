package com.tencent.bugly.proguard;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.n7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33812n7 {

    /* JADX INFO: renamed from: l */
    public static final String f71053l = "[JS] ";

    /* JADX INFO: renamed from: m */
    public static final String f71054m = "projectRoot";

    /* JADX INFO: renamed from: n */
    public static final String f71055n = "context";

    /* JADX INFO: renamed from: o */
    public static final String f71056o = "url";

    /* JADX INFO: renamed from: p */
    public static final String f71057p = "userAgent";

    /* JADX INFO: renamed from: q */
    public static final String f71058q = "language";

    /* JADX INFO: renamed from: r */
    public static final String f71059r = "name";

    /* JADX INFO: renamed from: s */
    public static final String f71060s = "message";

    /* JADX INFO: renamed from: t */
    public static final String f71061t = "stacktrace";

    /* JADX INFO: renamed from: u */
    public static final String f71062u = "file";

    /* JADX INFO: renamed from: v */
    public static final String f71063v = "lineNumber";

    /* JADX INFO: renamed from: w */
    public static final String f71064w = "columnNumber";

    /* JADX INFO: renamed from: a */
    public String f71065a = null;

    /* JADX INFO: renamed from: b */
    public String f71066b = null;

    /* JADX INFO: renamed from: c */
    public String f71067c = null;

    /* JADX INFO: renamed from: d */
    public String f71068d = null;

    /* JADX INFO: renamed from: e */
    public String f71069e = null;

    /* JADX INFO: renamed from: f */
    public String f71070f = null;

    /* JADX INFO: renamed from: g */
    public String f71071g = null;

    /* JADX INFO: renamed from: h */
    public String f71072h = null;

    /* JADX INFO: renamed from: i */
    public String f71073i = null;

    /* JADX INFO: renamed from: j */
    public long f71074j = 0;

    /* JADX INFO: renamed from: k */
    public long f71075k = 0;

    /* JADX INFO: renamed from: a */
    public Map<String, String> m74241a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f71065a;
        if (str != null) {
            linkedHashMap.put("[JS] projectRoot", str);
        }
        String str2 = this.f71066b;
        if (str2 != null) {
            linkedHashMap.put("[JS] context", str2);
        }
        String str3 = this.f71067c;
        if (str3 != null) {
            linkedHashMap.put("[JS] url", str3);
        }
        String str4 = this.f71068d;
        if (str4 != null) {
            linkedHashMap.put("[JS] userAgent", str4);
        }
        String str5 = this.f71073i;
        if (str5 != null) {
            linkedHashMap.put("[JS] file", str5);
        }
        long j11 = this.f71074j;
        if (j11 != 0) {
            linkedHashMap.put("[JS] lineNumber", Long.toString(j11));
        }
        return linkedHashMap;
    }
}
