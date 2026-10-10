package com.tencent.liteav.sdkcommon;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.a */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34771a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final DashboardManager f73627a;

    /* JADX INFO: renamed from: b */
    private final boolean f73628b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76166a(DashboardManager dashboardManager, boolean z11) {
        return new RunnableC34771a(dashboardManager, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73627a.showDashboardInternal(this.f73628b);
    }

    private RunnableC34771a(DashboardManager dashboardManager, boolean z11) {
        this.f73627a = dashboardManager;
        this.f73628b = z11;
    }
}
