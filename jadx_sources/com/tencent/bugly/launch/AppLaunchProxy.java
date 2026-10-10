package com.tencent.bugly.launch;

import android.content.Context;
import com.tencent.bugly.proguard.C34027y;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class AppLaunchProxy implements AppLaunch {

    /* JADX INFO: renamed from: a */
    public final AppLaunch f68726a = new C34027y();

    /* JADX INFO: renamed from: com.tencent.bugly.launch.AppLaunchProxy$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class C33522a {

        /* JADX INFO: renamed from: a */
        public static final AppLaunchProxy f68727a = new AppLaunchProxy();
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void addTag(String str) {
        this.f68726a.addTag(str);
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void endSpanFromLaunch(String str) {
        this.f68726a.endSpanFromLaunch(str);
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void install(Context context) {
        this.f68726a.install(context);
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void reportAppFullLaunch() {
        this.f68726a.reportAppFullLaunch();
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void spanEnd(String str) {
        this.f68726a.spanEnd(str);
    }

    @Override // com.tencent.bugly.launch.AppLaunch
    public void spanStart(String str, String str2) {
        this.f68726a.spanStart(str, str2);
    }

    public static AppLaunch getAppLaunch() {
        return C33522a.f68727a;
    }
}
