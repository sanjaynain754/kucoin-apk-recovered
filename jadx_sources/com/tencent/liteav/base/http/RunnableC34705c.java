package com.tencent.liteav.base.http;

/* JADX INFO: renamed from: com.tencent.liteav.base.http.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34705c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HttpClientAndroid f73476a;

    /* JADX INFO: renamed from: b */
    private final Long f73477b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76050a(HttpClientAndroid httpClientAndroid, Long l11) {
        return new RunnableC34705c(httpClientAndroid, l11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpClientAndroid.lambda$resumeRepeatDownload$2(this.f73476a, this.f73477b);
    }

    private RunnableC34705c(HttpClientAndroid httpClientAndroid, Long l11) {
        this.f73476a = httpClientAndroid;
        this.f73477b = l11;
    }
}
