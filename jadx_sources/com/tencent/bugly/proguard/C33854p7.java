package com.tencent.bugly.proguard;

import android.webkit.JavascriptInterface;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.p7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33854p7 {

    /* JADX INFO: renamed from: e */
    public static HashSet<Integer> f71378e = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public String f71379a = null;

    /* JADX INFO: renamed from: b */
    public Thread f71380b = null;

    /* JADX INFO: renamed from: c */
    public String f71381c = null;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f71382d = null;

    /* JADX INFO: renamed from: a */
    public static C33854p7 m74507a(C33891r3.d dVar) {
        if (dVar == null || f71378e.contains(Integer.valueOf(dVar.hashCode()))) {
            return null;
        }
        C33854p7 c33854p7 = new C33854p7();
        f71378e.add(Integer.valueOf(dVar.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        c33854p7.f71380b = threadCurrentThread;
        c33854p7.f71381c = m74508a(threadCurrentThread);
        c33854p7.f71382d = m74510b(dVar);
        return c33854p7;
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            C34012x4.m75444f("Payload from JS is null.", new Object[0]);
            return;
        }
        String strM72614c = C33571bi.m72614c(str.getBytes());
        String str2 = this.f71379a;
        if (str2 != null && str2.equals(strM72614c)) {
            C34012x4.m75444f("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f71379a = strM72614c;
        C34012x4.m75444f("Handling JS exception ...", new Object[0]);
        C33812n7 c33812n7M74511a = m74511a(str);
        if (c33812n7M74511a == null) {
            C34012x4.m75431a(LogState.WARN, "Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c33812n7M74511a.m74241a());
        linkedHashMap.putAll(this.f71382d);
        linkedHashMap.put("Java Stack", this.f71381c);
        m74509a(c33812n7M74511a, this.f71380b, linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m74510b(C33891r3.d dVar) {
        HashMap map = new HashMap();
        map.put("[WebView] ContentDescription", "" + ((Object) dVar.mo74788a()));
        return map;
    }

    @JavascriptInterface
    public void printLog(String str) {
        C34012x4.m75444f("Log from js: %s", str);
    }

    /* JADX INFO: renamed from: a */
    public static String m74508a(Thread thread) {
        if (thread == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        for (int i11 = 2; i11 < thread.getStackTrace().length; i11++) {
            StackTraceElement stackTraceElement = thread.getStackTrace()[i11];
            if (!stackTraceElement.toString().contains("crashreport")) {
                sb2.append(stackTraceElement.toString());
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C33812n7 m74511a(String str) {
        C33812n7 c33812n7;
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C33812n7 c33812n8 = new C33812n7();
            String string = jSONObject.getString(C33812n7.f71054m);
            c33812n8.f71065a = string;
            if (string == null) {
                return null;
            }
            String string2 = jSONObject.getString("context");
            c33812n8.f71066b = string2;
            if (string2 == null) {
                return null;
            }
            String string3 = jSONObject.getString("url");
            c33812n8.f71067c = string3;
            if (string3 == null) {
                return null;
            }
            String string4 = jSONObject.getString(C33812n7.f71057p);
            c33812n8.f71068d = string4;
            if (string4 == null) {
                return null;
            }
            String string5 = jSONObject.getString("language");
            c33812n8.f71069e = string5;
            if (string5 == null) {
                return null;
            }
            String string6 = jSONObject.getString("name");
            c33812n8.f71070f = string6;
            if (string6 == null || string6.equals("null")) {
                return null;
            }
            String string7 = jSONObject.getString(C33812n7.f71061t);
            if (string7 == null) {
                return null;
            }
            int iIndexOf = string7.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            c33812n7 = null;
            try {
                if (iIndexOf < 0) {
                    C34012x4.m75444f("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                c33812n8.f71072h = string7.substring(iIndexOf + 1);
                String strSubstring = string7.substring(0, iIndexOf);
                c33812n8.f71071g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(C33844oi.f71346o);
                if (iIndexOf2 > 0) {
                    c33812n8.f71071g = c33812n8.f71071g.substring(iIndexOf2 + 1);
                }
                c33812n8.f71073i = jSONObject.getString("file");
                if (c33812n8.f71070f == null) {
                    return null;
                }
                long j11 = jSONObject.getLong("lineNumber");
                c33812n8.f71074j = j11;
                if (j11 < 0) {
                    return null;
                }
                long j12 = jSONObject.getLong(C33812n7.f71064w);
                c33812n8.f71075k = j12;
                if (j12 < 0) {
                    return null;
                }
                C34012x4.m75442d("H5 crash information is following: ", new Object[0]);
                C34012x4.m75442d("[projectRoot]: " + c33812n8.f71065a, new Object[0]);
                C34012x4.m75442d("[context]: " + c33812n8.f71066b, new Object[0]);
                C34012x4.m75442d("[url]: " + c33812n8.f71067c, new Object[0]);
                C34012x4.m75442d("[userAgent]: " + c33812n8.f71068d, new Object[0]);
                C34012x4.m75442d("[language]: " + c33812n8.f71069e, new Object[0]);
                C34012x4.m75442d("[name]: " + c33812n8.f71070f, new Object[0]);
                C34012x4.m75442d("[message]: " + c33812n8.f71071g, new Object[0]);
                C34012x4.m75442d("[stacktrace]: \n" + c33812n8.f71072h, new Object[0]);
                C34012x4.m75442d("[file]: " + c33812n8.f71073i, new Object[0]);
                C34012x4.m75442d("[lineNumber]: " + c33812n8.f71074j, new Object[0]);
                C34012x4.m75442d("[columnNumber]: " + c33812n8.f71075k, new Object[0]);
                return c33812n8;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            c33812n7 = null;
        }
        if (C34012x4.m75438b(th)) {
            return c33812n7;
        }
        th.printStackTrace();
        return c33812n7;
    }

    /* JADX INFO: renamed from: a */
    public static void m74509a(C33812n7 c33812n7, Thread thread, Map<String, String> map) {
        if (c33812n7 != null) {
            C33563ba.m72494a(thread, c33812n7.f71070f, c33812n7.f71071g, c33812n7.f71072h, map);
        }
    }
}
