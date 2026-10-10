package com.tencent.bugly.proguard;

import com.facebook.soloader.MinElf;
import com.tencent.rmonitor.base.config.ConfigProxy;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.rb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33899rb {

    /* JADX INFO: renamed from: d */
    public static final String f71627d = "none";

    /* JADX INFO: renamed from: e */
    public static volatile C33899rb f71628e;

    /* JADX INFO: renamed from: a */
    public boolean f71629a = false;

    /* JADX INFO: renamed from: b */
    public boolean f71630b = false;

    /* JADX INFO: renamed from: c */
    public boolean f71631c = false;

    /* JADX INFO: renamed from: a */
    public static C33899rb m74807a() {
        if (f71628e == null) {
            synchronized (C33899rb.class) {
                try {
                    if (f71628e == null) {
                        f71628e = new C33899rb();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f71628e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74811b(boolean z11, boolean z12, boolean z13) {
        return z12 || z11 || z13;
    }

    /* JADX INFO: renamed from: d */
    public String m74813d() {
        ConfigProxy configProxy = ConfigProxy.INSTANCE;
        boolean z11 = configProxy.getConfig().m77076e("native_memory").f70122g;
        boolean z12 = configProxy.getConfig().m77076e("fd_leak").f70122g;
        boolean z13 = configProxy.getConfig().m77076e("asan").f70122g;
        if (!m74811b(z11, z12, z13)) {
            return "none";
        }
        String strM74810b = m74810b();
        if (strM74810b != null) {
            return strM74810b;
        }
        ArrayList<String> arrayListM74808a = m74808a(z11, z12, z13);
        String str = arrayListM74808a.get((int) (Math.random() * ((double) arrayListM74808a.size())));
        str.getClass();
        switch (str) {
            case "fd_leak":
                this.f71629a = true;
                return str;
            case "native_memory":
                this.f71630b = true;
                return str;
            case "asan":
                this.f71631c = true;
                return str;
            default:
                return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m74810b() {
        if (this.f71630b) {
            return "native_memory";
        }
        if (this.f71629a) {
            return "fd_leak";
        }
        if (this.f71631c) {
            return "asan";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m74812c() {
        String strM74662a = C33872q4.m74662a(C33598d3.m72772c());
        if (!strM74662a.contains(MinElf.ISA.X86) && !strM74662a.contains(C33864ph.f71456b)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m74809a(String str) {
        for (String str2 : Arrays.asList("native_memory", "fd_leak", "asan")) {
            if (!str.equals(str2) && C33589cf.m72692a().m72697b(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> m74808a(boolean z11, boolean z12, boolean z13) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (z11) {
            arrayList.add("native_memory");
        }
        if (z12) {
            arrayList.add("fd_leak");
        }
        if (z13) {
            arrayList.add("asan");
        }
        return arrayList;
    }
}
