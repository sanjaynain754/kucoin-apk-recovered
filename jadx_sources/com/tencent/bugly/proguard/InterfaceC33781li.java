package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.li */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC33781li {

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.li$a */
    /* JADX INFO: compiled from: BUGLY */
    public enum a {
        WarmedUp,
        CleanedUp,
        WarmUpThreadBlocked,
        WarmUpFailed,
        WarmUpDuration,
        ConsumeRequestDuration,
        DiskUsage
    }

    /* JADX INFO: renamed from: a */
    void m73997a(a aVar, Object... objArr);
}
