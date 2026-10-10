package com.datavisorobfus;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.datavisorobfus.k */
/* JADX INFO: loaded from: classes34.dex */
public class C5426k {

    /* JADX INFO: renamed from: n */
    private static C5426k f7292n = new C5426k();

    /* JADX INFO: renamed from: a */
    public ExecutorService f7293a;

    /* JADX INFO: renamed from: b */
    public ExecutorService f7294b;

    /* JADX INFO: renamed from: c */
    public ExecutorService f7295c;

    /* JADX INFO: renamed from: d */
    public ExecutorService f7296d;

    /* JADX INFO: renamed from: e */
    public ExecutorService f7297e;

    /* JADX INFO: renamed from: f */
    public ExecutorService f7298f;

    /* JADX INFO: renamed from: g */
    public ExecutorService f7299g;

    /* JADX INFO: renamed from: h */
    public ExecutorService f7300h;

    /* JADX INFO: renamed from: i */
    public ExecutorService f7301i;

    /* JADX INFO: renamed from: j */
    public ExecutorService f7302j;

    /* JADX INFO: renamed from: k */
    public ExecutorService f7303k;

    /* JADX INFO: renamed from: l */
    public ScheduledThreadPoolExecutor f7304l;

    /* JADX INFO: renamed from: m */
    public ScheduledThreadPoolExecutor f7305m;

    /* JADX INFO: renamed from: a */
    public static C5426k m7189a() {
        return f7292n;
    }

    private C5426k() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f7293a = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7294b = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7295c = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7296d = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7297e = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7298f = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7299g = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7300h = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7301i = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7302j = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7303k = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
        this.f7304l = new ScheduledThreadPoolExecutor(1);
        this.f7305m = new ScheduledThreadPoolExecutor(1);
    }
}
