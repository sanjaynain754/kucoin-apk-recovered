package com.tencent.liteav.base.p129a;

/* JADX INFO: renamed from: com.tencent.liteav.base.a.a */
/* JADX INFO: loaded from: classes59.dex */
public class C34689a {

    /* JADX INFO: renamed from: a */
    protected static C34689a f73376a;

    /* JADX INFO: renamed from: b */
    private int f73377b = 60;

    /* JADX INFO: renamed from: c */
    private int f73378c = 70;

    /* JADX INFO: renamed from: d */
    private int f73379d = 80;

    /* JADX INFO: renamed from: e */
    private int f73380e = 50;

    /* JADX INFO: renamed from: f */
    private int f73381f = 10;

    /* JADX INFO: renamed from: a */
    public static C34689a m76039a() {
        if (f73376a == null) {
            synchronized (C34689a.class) {
                try {
                    if (f73376a == null) {
                        f73376a = new C34689a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73376a;
    }
}
