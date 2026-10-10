package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.launch.AppLaunch;
import com.tencent.rmonitor.launch.AppLaunchMonitorInstaller;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34027y implements AppLaunch {
    @Override // com.tencent.bugly.launch.AppLaunch
    public void addTag(String str) {
        C33553b0.m72375g().f68884h.m73229a(str);
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void endSpanFromLaunch(String str) {
        C33553b0.m72375g().m72395d(str);
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void install(Context context) {
        AppLaunchMonitorInstaller.m77181a(context);
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void reportAppFullLaunch() {
        C33553b0.m72375g().m72404m();
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void spanEnd(String str) {
        C33553b0.m72375g().f68883g.m73119c(str);
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void spanStart(String str, String str2) {
        C33553b0.m72375g().f68883g.m73113a(str, str2);
    }
}
