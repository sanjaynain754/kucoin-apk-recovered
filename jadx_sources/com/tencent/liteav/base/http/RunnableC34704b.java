package com.tencent.liteav.base.http;

/* JADX INFO: renamed from: com.tencent.liteav.base.http.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34704b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HttpClientAndroid f73475a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76049a(HttpClientAndroid httpClientAndroid) {
        return new RunnableC34704b(httpClientAndroid);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$cancelAll$1(this.f73475a);
    }

    private RunnableC34704b(HttpClientAndroid httpClientAndroid) {
        this.f73475a = httpClientAndroid;
    }
}
