package com.tencent.liteav.sdkcommon;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34773c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final DashboardManager f73631a;

    /* JADX INFO: renamed from: b */
    private final String f73632b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76168a(DashboardManager dashboardManager, String str) {
        return new RunnableC34773c(dashboardManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73631a.removeDashboardInternal(this.f73632b);
    }

    private RunnableC34773c(DashboardManager dashboardManager, String str) {
        this.f73631a = dashboardManager;
        this.f73632b = str;
    }
}
