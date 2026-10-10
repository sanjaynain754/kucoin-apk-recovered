package com.dianping.logan;

/* JADX INFO: renamed from: com.dianping.logan.a */
/* JADX INFO: compiled from: Logan.java */
/* JADX INFO: loaded from: classes.dex */
public class C5458a {

    /* JADX INFO: renamed from: a */
    public static InterfaceC5464g f7435a;

    /* JADX INFO: renamed from: b */
    public static C5460c f7436b;

    /* JADX INFO: renamed from: c */
    public static boolean f7437c;

    /* JADX INFO: renamed from: a */
    public static void m7494a() {
        C5460c c5460c = f7436b;
        if (c5460c == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        c5460c.m7522a();
    }

    /* JADX INFO: renamed from: c */
    public static void m7496c(String str, int i11) {
        InterfaceC5464g interfaceC5464g = f7435a;
        if (interfaceC5464g != null) {
            interfaceC5464g.mo7543a(str, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7497d(String[] strArr, AbstractRunnableC5466i abstractRunnableC5466i) {
        C5460c c5460c = f7436b;
        if (c5460c == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        c5460c.m7525e(strArr, abstractRunnableC5466i);
    }

    /* JADX INFO: renamed from: e */
    public static void m7498e(boolean z11) {
        f7437c = z11;
    }

    /* JADX INFO: renamed from: f */
    public static void m7499f(String str, int i11) {
        C5460c c5460c = f7436b;
        if (c5460c == null) {
            throw new RuntimeException("Please initialize Logan first");
        }
        c5460c.m7526f(str, i11);
    }

    /* JADX INFO: renamed from: b */
    public static void m7495b(C5459b c5459b) {
        f7436b = C5460c.m7521d(c5459b);
    }
}
