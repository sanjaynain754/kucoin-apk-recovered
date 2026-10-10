package com.tencent.liteav.base.http;

/* JADX INFO: renamed from: com.tencent.liteav.base.http.a */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34703a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HttpClientAndroid f73473a;

    /* JADX INFO: renamed from: b */
    private final HttpClientAndroid.C34699e f73474b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76048a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.C34699e c34699e) {
        return new RunnableC34703a(httpClientAndroid, c34699e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73473a.doRequest(this.f73474b);
    }

    private RunnableC34703a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.C34699e c34699e) {
        this.f73473a = httpClientAndroid;
        this.f73474b = c34699e;
    }
}
