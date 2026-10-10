package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.wf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C34003wf {

    /* JADX INFO: renamed from: a */
    public static a f72447a;

    /* JADX INFO: renamed from: b */
    public static String f72448b;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.wf$a */
    /* JADX INFO: compiled from: BUGLY */
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo74227a();
    }

    /* JADX INFO: renamed from: a */
    public static void m75383a(a aVar) {
        f72447a = aVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m75384b() {
        f72447a = null;
        f72448b = null;
    }

    /* JADX INFO: renamed from: a */
    public static String m75382a() {
        a aVar = f72447a;
        if (f72448b == null && aVar != null) {
            f72448b = aVar.mo74227a();
        }
        return f72448b;
    }
}
