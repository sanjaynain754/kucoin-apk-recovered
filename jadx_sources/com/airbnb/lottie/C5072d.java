package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.File;
import p418l1.C42018b;
import p418l1.C42022f;
import p418l1.C42023g;
import p418l1.InterfaceC42020d;
import p418l1.InterfaceC42021e;
import p484o1.C42926h;

/* JADX INFO: renamed from: com.airbnb.lottie.d */
/* JADX INFO: compiled from: L.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C5072d {

    /* JADX INFO: renamed from: a */
    public static boolean f5935a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f5936b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f5937c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f5938d = true;

    /* JADX INFO: renamed from: e */
    public static AsyncUpdates f5939e = AsyncUpdates.AUTOMATIC;

    /* JADX INFO: renamed from: f */
    public static InterfaceC42021e f5940f;

    /* JADX INFO: renamed from: g */
    public static InterfaceC42020d f5941g;

    /* JADX INFO: renamed from: h */
    public static volatile C42023g f5942h;

    /* JADX INFO: renamed from: i */
    public static volatile C42022f f5943i;

    /* JADX INFO: renamed from: j */
    public static ThreadLocal<C42926h> f5944j;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ File m5641a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    /* JADX INFO: renamed from: b */
    public static void m5642b(String str) {
        if (f5936b) {
            m5646f().m94160a(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m5643c(String str) {
        if (f5936b) {
            return m5646f().m94161b(str);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public static AsyncUpdates m5644d() {
        return f5939e;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m5645e() {
        return f5938d;
    }

    /* JADX INFO: renamed from: f */
    public static C42926h m5646f() {
        C42926h c42926h = f5944j.get();
        if (c42926h != null) {
            return c42926h;
        }
        C42926h c42926h2 = new C42926h();
        f5944j.set(c42926h2);
        return c42926h2;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m5647g() {
        return f5936b;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static C42022f m5648h(@NonNull Context context) {
        C42022f c42022f;
        if (!f5937c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        C42022f c42022f2 = f5943i;
        if (c42022f2 != null) {
            return c42022f2;
        }
        synchronized (C42022f.class) {
            try {
                c42022f = f5943i;
                if (c42022f == null) {
                    InterfaceC42020d interfaceC42020d = f5941g;
                    if (interfaceC42020d == null) {
                        interfaceC42020d = new InterfaceC42020d() { // from class: com.airbnb.lottie.c
                            @Override // p418l1.InterfaceC42020d
                            /* JADX INFO: renamed from: a */
                            public final File mo5640a() {
                                return C5072d.m5641a(applicationContext);
                            }
                        };
                    }
                    c42022f = new C42022f(interfaceC42020d);
                    f5943i = c42022f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c42022f;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static C42023g m5649i(@NonNull Context context) {
        C42023g c42023g;
        C42023g c42023g2 = f5942h;
        if (c42023g2 != null) {
            return c42023g2;
        }
        synchronized (C42023g.class) {
            try {
                c42023g = f5942h;
                if (c42023g == null) {
                    C42022f c42022fM5648h = m5648h(context);
                    InterfaceC42021e c42018b = f5940f;
                    if (c42018b == null) {
                        c42018b = new C42018b();
                    }
                    c42023g = new C42023g(c42022fM5648h, c42018b);
                    f5942h = c42023g;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c42023g;
    }
}
