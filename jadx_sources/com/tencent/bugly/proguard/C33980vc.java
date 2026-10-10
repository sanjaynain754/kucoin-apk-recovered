package com.tencent.bugly.proguard;

import com.tencent.rmonitor.sla.AttaEvent;
import com.tencent.rmonitor.sla.AttaEventReporter;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.vc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33980vc {

    /* JADX INFO: renamed from: a */
    public static final String f72355a = "NatMemFailEvent";

    /* JADX INFO: renamed from: b */
    public static final String f72356b = "NatMemSuccEvent";

    /* JADX INFO: renamed from: c */
    public static final String f72357c = "NatMemSigJmpEvent";

    /* JADX INFO: renamed from: d */
    public static final String f72358d = "crash_times";

    /* JADX INFO: renamed from: e */
    public static final String f72359e = "android_verison";

    /* JADX INFO: renamed from: f */
    public static final String f72360f = "sample";

    /* JADX INFO: renamed from: a */
    public static void m75298a() {
        m75301a(f72356b, new String[0]);
    }

    /* JADX INFO: renamed from: a */
    public static void m75300a(String str) {
        m75301a(f72355a, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m75299a(int i11) {
        m75301a(f72357c, String.valueOf(i11));
    }

    /* JADX INFO: renamed from: a */
    public static void m75301a(String str, String... strArr) {
        AttaEvent attaEvent = new AttaEvent(str);
        attaEvent.setParams(strArr);
        AttaEventReporter.INSTANCE.getInstance().reportAsync(attaEvent, true);
    }
}
