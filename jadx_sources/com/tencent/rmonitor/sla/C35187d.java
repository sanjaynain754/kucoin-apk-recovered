package com.tencent.rmonitor.sla;

import android.os.Debug;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.proguard.C33868q0;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.rmonitor.sla.d */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class C35187d {

    /* JADX INFO: renamed from: c */
    public static final String f75334c = "RMonitor_sla";

    /* JADX INFO: renamed from: d */
    public static final long f75335d = 80;

    /* JADX INFO: renamed from: a */
    public long f75336a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f75337b = false;

    /* JADX INFO: renamed from: com.tencent.rmonitor.sla.d$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f75338b;

        public a(int i11) {
            this.f75338b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM74637a = C33868q0.a.f71513a.m74637a(AttaEvent.EventCode.RM_SLA_LAUNCH);
            if (zM74637a) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                AttaEvent attaEvent = new AttaEvent(AttaEvent.EventCode.RM_SLA_LAUNCH);
                attaEvent.setEventTime(C35187d.this.f75336a);
                attaEvent.setEventCost((int) Math.abs(jCurrentTimeMillis - attaEvent.getEventTime()));
                attaEvent.setEventResult(this.f75338b);
                attaEvent.setDebug(C35187d.this.m77236a(attaEvent));
                C35187d.this.m77240b(attaEvent);
            }
            Logger.INSTANCE.mo77130d(C35187d.f75334c, "try to report sla hitSampling: " + zM74637a);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m77239b(int i11) {
        a aVar = new a(i11);
        if (ThreadManager.inMonitorThread()) {
            aVar.run();
        } else {
            ThreadManager.runInMonitorThread(aVar, 0L);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77237a() {
        if (this.f75336a == 0) {
            this.f75336a = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m77238a(int i11) {
        if (this.f75336a == 0) {
            Logger.INSTANCE.mo77131e(f75334c, "endStartRMonitor invalid call not start yet.");
            return false;
        }
        if (this.f75337b) {
            return true;
        }
        this.f75337b = true;
        m77239b(i11);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m77240b(@NotNull AttaEvent attaEvent) {
        AttaEventReporter.INSTANCE.getInstance().reportAsync(attaEvent, true);
    }

    /* JADX INFO: renamed from: a */
    public int m77236a(AttaEvent attaEvent) {
        return (attaEvent == null || Debug.isDebuggerConnected() || ((long) attaEvent.getEventCost()) >= 80 || attaEvent.getEventResult() == 0) ? 1 : 0;
    }
}
