package com.tencent.bugly.proguard;

import com.google.firebase.messaging.Constants;
import com.tencent.feedback.eup.CrashHandleListener;
import com.tencent.feedback.upload.UploadHandleListener;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.u3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33951u3 {

    /* JADX INFO: renamed from: u */
    public static final String f72173u = "[ODay:%d,isMerged:%b,tag:%s]";

    /* JADX INFO: renamed from: p */
    public String f72189p;

    /* JADX INFO: renamed from: a */
    public int f72174a = 10;

    /* JADX INFO: renamed from: b */
    public boolean f72175b = false;

    /* JADX INFO: renamed from: c */
    public int f72176c = C33745k3.f70517x;

    /* JADX INFO: renamed from: d */
    public String f72177d = null;

    /* JADX INFO: renamed from: e */
    public boolean f72178e = false;

    /* JADX INFO: renamed from: f */
    public String f72179f = null;

    /* JADX INFO: renamed from: g */
    public int f72180g = C33745k3.f70496H;

    /* JADX INFO: renamed from: h */
    public int f72181h = C33745k3.f70490B;

    /* JADX INFO: renamed from: i */
    public boolean f72182i = true;

    /* JADX INFO: renamed from: j */
    public boolean f72183j = true;

    /* JADX INFO: renamed from: k */
    public boolean f72184k = true;

    /* JADX INFO: renamed from: l */
    public boolean f72185l = false;

    /* JADX INFO: renamed from: m */
    public boolean f72186m = true;

    /* JADX INFO: renamed from: n */
    public int f72187n = 31;

    /* JADX INFO: renamed from: o */
    public boolean f72188o = true;

    /* JADX INFO: renamed from: q */
    public boolean f72190q = true;

    /* JADX INFO: renamed from: r */
    public InterfaceC34063zf f72191r = null;

    /* JADX INFO: renamed from: s */
    public CrashHandleListener f72192s = null;

    /* JADX INFO: renamed from: t */
    public UploadHandleListener f72193t = null;

    /* JADX INFO: renamed from: a */
    public synchronized void m75119a(CrashHandleListener crashHandleListener) {
        this.f72192s = crashHandleListener;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public synchronized void m75124b(String str) {
        this.f72177d = str;
    }

    /* JADX INFO: renamed from: c */
    public synchronized CrashHandleListener m75127c() {
        return this.f72192s;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public synchronized int m75131d() {
        return this.f72180g;
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public synchronized void m75135e(int i11) {
        if (i11 > 0) {
            this.f72174a = i11;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public synchronized void m75138f(boolean z11) {
        this.f72175b = z11;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public synchronized void m75140g(boolean z11) {
        this.f72178e = z11;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m75142h(boolean z11) {
        this.f72190q = z11;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public synchronized void m75144i(boolean z11) {
        this.f72186m = z11;
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public synchronized String m75145j() {
        return this.f72179f;
    }

    /* JADX INFO: renamed from: k */
    public synchronized UploadHandleListener m75146k() {
        return this.f72193t;
    }

    /* JADX INFO: renamed from: l */
    public synchronized boolean m75147l() {
        return this.f72182i;
    }

    /* JADX INFO: renamed from: m */
    public synchronized boolean m75148m() {
        return this.f72184k;
    }

    /* JADX INFO: renamed from: n */
    public synchronized boolean m75149n() {
        return this.f72183j;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public synchronized boolean m75151p() {
        return this.f72175b;
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public synchronized boolean m75152q() {
        return this.f72178e;
    }

    /* JADX INFO: renamed from: r */
    public synchronized boolean m75153r() {
        return this.f72190q;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public synchronized boolean m75154s() {
        return this.f72186m;
    }

    public synchronized String toString() {
        try {
        } catch (Throwable th2) {
            try {
                if (C34012x4.m75438b(th2)) {
                    return Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                }
                th2.printStackTrace();
                return Constants.IPC_BUNDLE_KEY_SEND_ERROR;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return String.format(Locale.US, f72173u, Integer.valueOf(this.f72174a), Boolean.valueOf(this.f72175b), this.f72177d);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m75120a(UploadHandleListener uploadHandleListener) {
        this.f72193t = uploadHandleListener;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public synchronized void m75123b(int i11) {
        if (i11 > 0) {
            this.f72180g = i11;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public synchronized void m75129c(String str) {
        this.f72179f = str;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public synchronized void m75132d(int i11) {
        this.f72181h = i11;
    }

    /* JADX INFO: renamed from: e */
    public void m75136e(boolean z11) {
        this.f72185l = z11;
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public int m75137f() {
        return this.f72176c;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public synchronized int m75139g() {
        return this.f72181h;
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public synchronized String m75141h() {
        return this.f72177d;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public synchronized int m75143i() {
        return this.f72174a;
    }

    /* JADX INFO: renamed from: o */
    public boolean m75150o() {
        return this.f72185l;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m75121a(String str) {
        this.f72189p = str;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m75125b(boolean z11) {
        this.f72182i = z11;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m75130c(boolean z11) {
        this.f72184k = z11;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m75133d(boolean z11) {
        this.f72183j = z11;
    }

    /* JADX INFO: renamed from: e */
    public synchronized String m75134e() {
        return this.f72189p;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public synchronized void m75118a(int i11) {
        this.f72187n = i11;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public synchronized boolean m75126b() {
        return this.f72188o;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m75128c(int i11) {
        this.f72176c = i11;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public synchronized int m75117a() {
        return this.f72187n;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public synchronized void m75122a(boolean z11) {
        this.f72188o = z11;
    }
}
