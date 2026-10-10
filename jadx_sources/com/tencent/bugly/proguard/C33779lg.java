package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.lg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33779lg {

    /* JADX INFO: renamed from: a */
    public final String f70846a;

    /* JADX INFO: renamed from: b */
    public final String f70847b;

    /* JADX INFO: renamed from: c */
    public final String f70848c;

    public C33779lg(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            this.f70846a = str;
            this.f70847b = str2;
            this.f70848c = str3;
            return;
        }
        throw new RuntimeException("SoFile args should not be null!");
    }
}
