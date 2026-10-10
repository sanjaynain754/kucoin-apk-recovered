package com.tencent.rtmp.video.p149a;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.b */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class ThreadFactoryC35214b implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final String f75446a;

    /* JADX INFO: renamed from: a */
    public static ThreadFactory m77305a(String str) {
        return new ThreadFactoryC35214b(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f75446a);
    }

    private ThreadFactoryC35214b(String str) {
        this.f75446a = str;
    }
}
