package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.r7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33895r7 {

    /* JADX INFO: renamed from: e */
    public static final int f71609e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f71610f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f71611g = 4;

    /* JADX INFO: renamed from: h */
    public static final int f71612h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f71613i = 16;

    /* JADX INFO: renamed from: j */
    public static final int f71614j = 32;

    /* JADX INFO: renamed from: a */
    public final boolean f71615a;

    /* JADX INFO: renamed from: b */
    public final int f71616b;

    /* JADX INFO: renamed from: c */
    public final String f71617c;

    /* JADX INFO: renamed from: d */
    public InterfaceC33604d9 f71618d;

    public C33895r7(boolean z11, int i11, String str) {
        this.f71615a = z11;
        this.f71616b = i11;
        this.f71617c = str;
    }

    /* JADX INFO: renamed from: a */
    public String m74797a() {
        return this.f71617c;
    }

    /* JADX INFO: renamed from: a */
    public void m74798a(InterfaceC33604d9 interfaceC33604d9) {
        this.f71618d = interfaceC33604d9;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC33604d9 m74799b() {
        return this.f71618d;
    }

    /* JADX INFO: renamed from: c */
    public int m74800c() {
        return this.f71616b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m74801d() {
        return this.f71615a;
    }

    public C33895r7(boolean z11, int i11) {
        this(z11, i11, "");
    }

    public C33895r7(boolean z11) {
        this(z11, 0);
    }
}
