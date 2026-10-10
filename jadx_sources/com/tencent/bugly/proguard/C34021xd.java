package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.looper.LooperMonitor;
import com.tencent.rmonitor.natmem.NatMemMonitor;
import com.tencent.rmonitor.p145fd.FdLeakMonitor;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.xd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34021xd implements InterfaceC34001wd {

    /* JADX INFO: renamed from: a */
    public static final String f72510a = "RMonitor_init";

    @Override // com.tencent.bugly.proguard.InterfaceC34001wd
    public QAPMMonitorPlugin createPlugin(DefaultPluginConfig defaultPluginConfig) {
        if (defaultPluginConfig == null) {
            return null;
        }
        String str = defaultPluginConfig.pluginName;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        QAPMMonitorPlugin qAPMMonitorPluginM75460c = m75460c(str);
        if (qAPMMonitorPluginM75460c == null) {
            qAPMMonitorPluginM75460c = m75458a(str);
        }
        if (qAPMMonitorPluginM75460c == null) {
            qAPMMonitorPluginM75460c = m75459b(str);
        }
        if (qAPMMonitorPluginM75460c == null) {
            qAPMMonitorPluginM75460c = m75462e(str);
        }
        if (qAPMMonitorPluginM75460c == null) {
            qAPMMonitorPluginM75460c = m75461d(str);
        }
        if (qAPMMonitorPluginM75460c == null) {
            Logger.INSTANCE.mo77132i(f72510a, C33778lf.m73987a("create plugin fail {", str, "}"));
        }
        return qAPMMonitorPluginM75460c;
    }

    /* JADX INFO: renamed from: a */
    public final QAPMMonitorPlugin m75458a(String str) {
        if ("looper_stack".equals(str)) {
            return new LooperMonitor();
        }
        if ("work_thread_lag".equals(str)) {
            return new C33946ti();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final QAPMMonitorPlugin m75459b(String str) {
        if ("activity_leak".equals(str)) {
            return C33586cc.b.f69420a;
        }
        if ("big_bitmap".equals(str)) {
            return C33889r1.m74711a();
        }
        if ("fd_leak".equals(str)) {
            return FdLeakMonitor.C35155b.f75264a;
        }
        if ("native_memory".equals(str)) {
            return NatMemMonitor.m77197b();
        }
        if ("java_memory_ceiling_hprof".equals(str)) {
            return C33919sb.m74961b();
        }
        if ("asan".equals(str)) {
            return C33783m.m73999b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final QAPMMonitorPlugin m75460c(String str) {
        if ("looper_metric".equals(str)) {
            return new C33932t4();
        }
        if ("memory_quantile".equals(str)) {
            return new C33670gc();
        }
        if ("sub_memory_quantile".equals(str)) {
            return new C33670gc();
        }
        if ("custom_event".equals(str)) {
            return new C34051z3();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final QAPMMonitorPlugin m75461d(String str) {
        if ("page_launch".equals(str)) {
            return new C33941td();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final QAPMMonitorPlugin m75462e(String str) {
        if ("traffic".equals(str)) {
            return new C33696hh();
        }
        if ("traffic_detail".equals(str)) {
            return new C33633eh();
        }
        if ("net_quality".equals(str)) {
            return new C33713id();
        }
        if ("battery_element".equals(str)) {
            return new C33701i1();
        }
        if ("battery_ele_metric".equals(str)) {
            return new C33680h1();
        }
        if ("battery_metric".equals(str)) {
            return new C33806n1();
        }
        return null;
    }
}
