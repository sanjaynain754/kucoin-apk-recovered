package com.tencent.rmonitor.sla;

import com.tencent.bugly.proguard.C33868q0;
import com.tencent.bugly.proguard.InterfaceC33624e8;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.rmonitor.sla.a */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class C35184a implements InterfaceC33624e8 {

    /* JADX INFO: renamed from: a */
    public static final String f75321a = "RMonitor_atta";

    @Override // com.tencent.bugly.proguard.InterfaceC33624e8
    /* JADX INFO: renamed from: a */
    public void mo72932a(String str, int i11, int i12, long j11) {
        if (AttaEvent.EventCode.RM_CONFIG.equals(str)) {
            m77220a(i11, i12, j11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77220a(int i11, int i12, long j11) {
        boolean zM74637a = C33868q0.a.f71513a.m74637a(AttaEvent.EventCode.RM_CONFIG);
        if (zM74637a) {
            AttaEvent attaEvent = new AttaEvent(AttaEvent.EventCode.RM_CONFIG);
            attaEvent.setEventResult(i11);
            attaEvent.setErrorCode(i12);
            attaEvent.setEventCost((int) j11);
            attaEvent.setDebug(1);
            AttaEventReporter.INSTANCE.getInstance().addEvent(attaEvent);
        }
        Logger.INSTANCE.mo77132i(f75321a, "reportConfigEvent, eventResult: " + i11 + ", errorCode: " + i12 + ", eventCostInMs: " + j11 + ", hitSampling: " + zM74637a);
    }
}
