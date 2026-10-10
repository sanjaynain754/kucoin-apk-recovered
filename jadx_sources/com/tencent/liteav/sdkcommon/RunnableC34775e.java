package com.tencent.liteav.sdkcommon;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.e */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34775e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final DashboardManager f73634a;

    /* JADX INFO: renamed from: b */
    private final String f73635b;

    /* JADX INFO: renamed from: c */
    private final String f73636c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76170a(DashboardManager dashboardManager, String str, String str2) {
        return new RunnableC34775e(dashboardManager, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73634a.setStatusInternal(this.f73635b, this.f73636c);
    }

    private RunnableC34775e(DashboardManager dashboardManager, String str, String str2) {
        this.f73634a = dashboardManager;
        this.f73635b = str;
        this.f73636c = str2;
    }
}
