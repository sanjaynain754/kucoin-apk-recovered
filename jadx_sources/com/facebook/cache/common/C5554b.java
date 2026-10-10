package com.facebook.cache.common;

/* JADX INFO: renamed from: com.facebook.cache.common.b */
/* JADX INFO: compiled from: NoOpCacheErrorLogger.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5554b implements CacheErrorLogger {

    /* JADX INFO: renamed from: a */
    public static C5554b f8093a;

    /* JADX INFO: renamed from: b */
    public static synchronized C5554b m8455b() {
        try {
            if (f8093a == null) {
                f8093a = new C5554b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8093a;
    }

    @Override // com.facebook.cache.common.CacheErrorLogger
    /* JADX INFO: renamed from: a */
    public void mo8446a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, Throwable th2) {
    }
}
