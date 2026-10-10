package com.tencent.liteav.sdkcommon;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34774d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final DashboardManager f73633a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76169a(DashboardManager dashboardManager) {
        return new RunnableC34774d(dashboardManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73633a.removeAllDashboardInternal();
    }

    private RunnableC34774d(DashboardManager dashboardManager) {
        this.f73633a = dashboardManager;
    }
}
