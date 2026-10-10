package com.tencent.rmonitor.sla;

import com.tencent.bugly.proguard.C33805n0;
import com.tencent.bugly.proguard.C33868q0;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.rmonitor.sla.c */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class C35186c {
    /* JADX INFO: renamed from: a */
    public static void m77234a(String str, String str2, String str3, String str4, String str5) {
        if (!C33868q0.a.f71513a.m74637a(AttaEvent.EventCode.RM_CLIENT_ILLEGAL_REPORT)) {
            Logger.INSTANCE.mo77130d(C33805n0.f71011g, "report fail for not sampling");
            return;
        }
        AttaEvent attaEvent = new AttaEvent(AttaEvent.EventCode.RM_CLIENT_ILLEGAL_REPORT);
        attaEvent.setParam0(str);
        attaEvent.setParam1(str2);
        attaEvent.setParam2(str3);
        attaEvent.setParam3(str4);
        attaEvent.setParam7(str5);
        AttaEventReporter.INSTANCE.getInstance().reportAsync(attaEvent, true);
    }
}
