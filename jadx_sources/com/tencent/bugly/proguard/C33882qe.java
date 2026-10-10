package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.qe */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33882qe implements InterfaceC33957u9 {

    /* JADX INFO: renamed from: b */
    public InterfaceC33937t9 f71572b = null;

    /* JADX INFO: renamed from: c */
    public InterfaceC33897r9 f71573c = null;

    /* JADX INFO: renamed from: d */
    public boolean f71574d = false;

    /* JADX INFO: renamed from: e */
    public boolean f71575e = false;

    /* JADX INFO: renamed from: a */
    public final String f71571a = C33591ch.m72746d();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.qe$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C33882qe f71576a = new C33882qe();
    }

    /* JADX INFO: renamed from: a */
    public void m74695a(InterfaceC33937t9 interfaceC33937t9) {
        if (interfaceC33937t9 == null) {
            return;
        }
        this.f71572b = interfaceC33937t9;
        InterfaceC33897r9 interfaceC33897r9 = this.f71573c;
        if (interfaceC33897r9 == null || !this.f71574d) {
            return;
        }
        interfaceC33897r9.mo74129b();
        this.f71574d = false;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC33897r9 m74699d() {
        if (this.f71573c == null) {
            synchronized (this) {
                try {
                    if (this.f71573c == null) {
                        this.f71573c = new C33798me(this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f71573c;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC33937t9 m74700e() {
        return this.f71572b;
    }

    /* JADX INFO: renamed from: c */
    public static C33882qe m74691c() {
        return a.f71576a;
    }

    /* JADX INFO: renamed from: b */
    public void m74698b() {
        InterfaceC33937t9 interfaceC33937t9M74700e = m74700e();
        if (interfaceC33937t9M74700e != null) {
            interfaceC33937t9M74700e.mo74287a();
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC33917s9 m74693a(String str, InterfaceC33937t9 interfaceC33937t9) {
        if (m74700e() == null) {
            m74695a(interfaceC33937t9);
        }
        return m74692a(str);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC33917s9 m74692a(String str) {
        InterfaceC33937t9 interfaceC33937t9M74700e;
        if (TextUtils.isEmpty(str) || (interfaceC33937t9M74700e = m74700e()) == null) {
            return null;
        }
        return new C33840oe(interfaceC33937t9M74700e.mo74286a(str));
    }

    /* JADX INFO: renamed from: a */
    public boolean m74696a(String str, String str2) {
        InterfaceC33937t9 interfaceC33937t9M74700e = m74700e();
        if (interfaceC33937t9M74700e == null) {
            this.f71574d = true;
            return false;
        }
        m74694a();
        interfaceC33937t9M74700e.mo74290a(this.f71571a, str, str2);
        return true;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33957u9
    /* JADX INFO: renamed from: a */
    public boolean mo74697a(Map<String, String> map) {
        InterfaceC33937t9 interfaceC33937t9M74700e = m74700e();
        if (interfaceC33937t9M74700e == null) {
            this.f71574d = true;
            return false;
        }
        m74694a();
        interfaceC33937t9M74700e.mo74291a(this.f71571a, map);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m74694a() {
        if (this.f71575e) {
            return;
        }
        m74698b();
        this.f71575e = true;
    }
}
