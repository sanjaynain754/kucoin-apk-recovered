package com.tencent.liteav.sdkcommon;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.f */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34776f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final DashboardManager f73637a;

    /* JADX INFO: renamed from: b */
    private final String f73638b;

    /* JADX INFO: renamed from: c */
    private final String f73639c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76171a(DashboardManager dashboardManager, String str, String str2) {
        return new RunnableC34776f(dashboardManager, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73637a.appendLogInternal(this.f73638b, this.f73639c);
    }

    private RunnableC34776f(DashboardManager dashboardManager, String str, String str2) {
        this.f73637a = dashboardManager;
        this.f73638b = str;
        this.f73639c = str2;
    }
}
