package com.tencent.liteav.base.http;

/* JADX INFO: renamed from: com.tencent.liteav.base.http.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34706d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HttpClientAndroid f73478a;

    /* JADX INFO: renamed from: b */
    private final long f73479b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76051a(HttpClientAndroid httpClientAndroid, long j11) {
        return new RunnableC34706d(httpClientAndroid, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$resumeRepeatDownload$3(this.f73478a, this.f73479b);
    }

    private RunnableC34706d(HttpClientAndroid httpClientAndroid, long j11) {
        this.f73478a = httpClientAndroid;
        this.f73479b = j11;
    }
}
