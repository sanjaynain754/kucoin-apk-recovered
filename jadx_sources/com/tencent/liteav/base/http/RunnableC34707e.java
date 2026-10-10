package com.tencent.liteav.base.http;

/* JADX INFO: renamed from: com.tencent.liteav.base.http.e */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34707e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HttpClientAndroid f73480a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76052a(HttpClientAndroid httpClientAndroid) {
        return new RunnableC34707e(httpClientAndroid);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$destroy$4(this.f73480a);
    }

    private RunnableC34707e(HttpClientAndroid httpClientAndroid) {
        this.f73480a = httpClientAndroid;
    }
}
