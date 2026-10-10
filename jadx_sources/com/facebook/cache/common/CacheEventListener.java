package com.facebook.cache.common;

/* JADX INFO: loaded from: classes34.dex */
public interface CacheEventListener {

    public enum EvictionReason {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED,
        TRIM_EXPIRED
    }

    /* JADX INFO: renamed from: a */
    void mo8447a(InterfaceC5553a interfaceC5553a);

    /* JADX INFO: renamed from: b */
    void mo8448b(InterfaceC5553a interfaceC5553a);

    /* JADX INFO: renamed from: c */
    void mo8449c(InterfaceC5553a interfaceC5553a);

    /* JADX INFO: renamed from: d */
    void mo8450d();

    /* JADX INFO: renamed from: e */
    void mo8451e(InterfaceC5553a interfaceC5553a);

    /* JADX INFO: renamed from: f */
    void mo8452f(InterfaceC5553a interfaceC5553a);

    /* JADX INFO: renamed from: g */
    void mo8453g(InterfaceC5553a interfaceC5553a);

    /* JADX INFO: renamed from: h */
    void mo8454h(InterfaceC5553a interfaceC5553a);
}
