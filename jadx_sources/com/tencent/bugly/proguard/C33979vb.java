package com.tencent.bugly.proguard;

import androidx.annotation.NonNull;
import com.tencent.rmonitor.base.meta.DumpResult;
import com.tencent.rmonitor.base.plugin.listener.IMemoryCeilingListener;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.vb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33979vb {

    /* JADX INFO: renamed from: e */
    public static final String f72349e = "RMonitor_MemoryCeiling_Trigger";

    /* JADX INFO: renamed from: f */
    public static final int f72350f = 20;

    /* JADX INFO: renamed from: a */
    public String f72351a = "";

    /* JADX INFO: renamed from: b */
    public IMemoryCeilingListener f72352b = null;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ArrayList<String> f72353c = new ArrayList<>(20);

    /* JADX INFO: renamed from: d */
    public final C33959ub f72354d;

    /* JADX INFO: renamed from: a */
    public final boolean m75296a(long j11) {
        if (!PluginController.INSTANCE.whetherPluginEventSampling("java_memory_ceiling_hprof")) {
            Logger.INSTANCE.mo77132i(f72349e, "memory ceiling don't dump for event sample ratio");
            return false;
        }
        IMemoryCeilingListener iMemoryCeilingListener = (IMemoryCeilingListener) ListenerManager.memoryCeilingListener.getListener();
        this.f72352b = iMemoryCeilingListener;
        if (iMemoryCeilingListener != null && !iMemoryCeilingListener.onLowMemory(j11)) {
            Logger.INSTANCE.mo77132i(f72349e, "memory ceiling don't dump for user's onLowMemory call back");
            return false;
        }
        String strM73094e = C33657g.m73094e();
        this.f72351a = strM73094e;
        if (!this.f72353c.contains(strM73094e)) {
            return true;
        }
        Logger.INSTANCE.mo77132i(f72349e, "memory ceiling don't dump for scene that has dumped");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m75297b(long j11) {
        if (C33919sb.f71876u || m75296a(j11)) {
            Logger.INSTANCE.mo77130d(f72349e, "dump hprof in scene:", this.f72351a);
            this.f72353c.add(this.f72351a);
            DumpResult dumpResultM75495a = C34039yb.m75495a("LowMemory", "LowMemory", true, false, this.f72352b, C34019xb.m75455c().m75051d(), C34019xb.m75455c().f72071n);
            if (dumpResultM75495a.success) {
                this.f72354d.m75174a(dumpResultM75495a, "onLowMemory");
            }
        }
    }

    public C33979vb(C33959ub c33959ub) {
        this.f72354d = c33959ub;
    }
}
