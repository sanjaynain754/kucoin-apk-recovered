package com.tencent.liteav.sdkcommon;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34772b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final DashboardManager f73629a;

    /* JADX INFO: renamed from: b */
    private final String f73630b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76167a(DashboardManager dashboardManager, String str) {
        return new RunnableC34772b(dashboardManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73629a.addDashboardInternal(this.f73630b);
    }

    private RunnableC34772b(DashboardManager dashboardManager, String str) {
        this.f73629a = dashboardManager;
        this.f73630b = str;
    }
}
