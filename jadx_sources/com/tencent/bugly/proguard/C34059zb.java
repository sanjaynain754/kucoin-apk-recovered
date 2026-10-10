package com.tencent.bugly.proguard;

import com.tencent.rmonitor.sla.AttaEvent;
import com.tencent.rmonitor.sla.AttaEventReporter;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.zb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34059zb {

    /* JADX INFO: renamed from: a */
    public static final String f72626a = "QuantileErrorEvent";

    /* JADX INFO: renamed from: b */
    public static final String f72627b = "vss_parser_error";

    /* JADX INFO: renamed from: c */
    public static final String f72628c = "name_parser_error";

    /* JADX INFO: renamed from: d */
    public static final String f72629d = "json_parser_error";

    /* JADX INFO: renamed from: a */
    public static void m75593a(String str, String... strArr) {
        AttaEvent attaEvent = new AttaEvent(str);
        attaEvent.setParams(strArr);
        AttaEventReporter.INSTANCE.getInstance().reportAsync(attaEvent, true);
    }

    /* JADX INFO: renamed from: a */
    public static void m75592a(String str, String str2) {
        m75593a(f72626a, str, str2);
    }
}
