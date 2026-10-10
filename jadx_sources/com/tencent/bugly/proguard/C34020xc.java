package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.rmonitor.natmem.NatMemMonitor;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.xc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34020xc extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f72508a = "com.tencent.rmonitor.natmem.USAGE_DUMP";

    /* JADX INFO: renamed from: b */
    public static final String f72509b = "com.tencent.rmonitor.natmem.LEAK_DUMP";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (f72508a.equals(action) && C33704i4.m73338a()) {
            NatMemMonitor.m77197b().m77201c("/storage/emulated/0/rmonitor/natmem_usage.json");
        } else if (f72509b.equals(action) && C33704i4.m73338a()) {
            NatMemMonitor.m77197b().m77199b("/storage/emulated/0/rmonitor/natmem_leak.json");
        }
    }
}
