package com.tencent.bugly.proguard;

import com.tencent.rmonitor.p145fd.hook.FdOpenStackManager;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.v6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33974v6 extends AbstractC34048z0 {

    /* JADX INFO: renamed from: h */
    public static final String f72327h = "RMonitor_FdLeak_FdStacksDumper";

    @Override // com.tencent.bugly.proguard.InterfaceC34016x8
    /* JADX INFO: renamed from: a */
    public int mo72778a() {
        return 4;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34048z0, com.tencent.bugly.proguard.InterfaceC34016x8
    /* JADX INFO: renamed from: b */
    public boolean mo75288b() {
        return C33664g6.m73156f();
    }

    @Override // com.tencent.bugly.proguard.AbstractC34048z0
    /* JADX INFO: renamed from: c */
    public C33706i6 mo72780c(String str) {
        if (FdOpenStackManager.m77178a(str)) {
            return m75570a(str, (Object) null);
        }
        return m75568a(1);
    }
}
