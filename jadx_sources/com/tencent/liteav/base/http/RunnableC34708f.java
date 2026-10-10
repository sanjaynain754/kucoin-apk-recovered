package com.tencent.liteav.base.http;

/* JADX INFO: renamed from: com.tencent.liteav.base.http.f */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34708f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HttpClientAndroid f73481a;

    /* JADX INFO: renamed from: b */
    private final HttpClientAndroid.C34700f f73482b;

    /* JADX INFO: renamed from: c */
    private final long f73483c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76053a(HttpClientAndroid httpClientAndroid, HttpClientAndroid.C34700f c34700f, long j11) {
        return new RunnableC34708f(httpClientAndroid, c34700f, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$doReadData$5(this.f73481a, this.f73482b, this.f73483c);
    }

    private RunnableC34708f(HttpClientAndroid httpClientAndroid, HttpClientAndroid.C34700f c34700f, long j11) {
        this.f73481a = httpClientAndroid;
        this.f73482b = c34700f;
        this.f73483c = j11;
    }
}
