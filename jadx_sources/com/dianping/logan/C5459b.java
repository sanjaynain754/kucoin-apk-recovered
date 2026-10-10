package com.dianping.logan;

import android.text.TextUtils;
import com.tencent.bugly.proguard.C33557b4;

/* JADX INFO: renamed from: com.dianping.logan.b */
/* JADX INFO: compiled from: LoganConfig.java */
/* JADX INFO: loaded from: classes.dex */
public class C5459b {

    /* JADX INFO: renamed from: a */
    public String f7438a;

    /* JADX INFO: renamed from: b */
    public String f7439b;

    /* JADX INFO: renamed from: c */
    public long f7440c;

    /* JADX INFO: renamed from: d */
    public long f7441d;

    /* JADX INFO: renamed from: e */
    public long f7442e;

    /* JADX INFO: renamed from: f */
    public long f7443f;

    /* JADX INFO: renamed from: g */
    public byte[] f7444g;

    /* JADX INFO: renamed from: h */
    public byte[] f7445h;

    /* JADX INFO: renamed from: com.dianping.logan.b$b */
    /* JADX INFO: compiled from: LoganConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public String f7446a;

        /* JADX INFO: renamed from: b */
        public String f7447b;

        /* JADX INFO: renamed from: e */
        public byte[] f7450e;

        /* JADX INFO: renamed from: f */
        public byte[] f7451f;

        /* JADX INFO: renamed from: c */
        public long f7448c = C33557b4.f69134v;

        /* JADX INFO: renamed from: d */
        public long f7449d = 604800000;

        /* JADX INFO: renamed from: g */
        public long f7452g = 52428800;

        /* JADX INFO: renamed from: a */
        public C5459b m7515a() {
            C5459b c5459b = new C5459b();
            c5459b.m7508i(this.f7446a);
            c5459b.m7514o(this.f7447b);
            c5459b.m7512m(this.f7448c);
            c5459b.m7513n(this.f7452g);
            c5459b.m7509j(this.f7449d);
            c5459b.m7511l(this.f7450e);
            c5459b.m7510k(this.f7451f);
            return c5459b;
        }

        /* JADX INFO: renamed from: b */
        public b m7516b(String str) {
            this.f7446a = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m7518d(byte[] bArr) {
            this.f7451f = bArr;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m7519e(byte[] bArr) {
            this.f7450e = bArr;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m7520f(String str) {
            this.f7447b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m7517c(long j11) {
            this.f7449d = j11 * 86400000;
            return this;
        }
    }

    public C5459b() {
        this.f7440c = C33557b4.f69134v;
        this.f7441d = 604800000L;
        this.f7442e = 500L;
        this.f7443f = 52428800L;
    }

    /* JADX INFO: renamed from: h */
    public boolean m7507h() {
        return (TextUtils.isEmpty(this.f7438a) || TextUtils.isEmpty(this.f7439b) || this.f7444g == null || this.f7445h == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final void m7508i(String str) {
        this.f7438a = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m7509j(long j11) {
        this.f7441d = j11;
    }

    /* JADX INFO: renamed from: k */
    public final void m7510k(byte[] bArr) {
        this.f7445h = bArr;
    }

    /* JADX INFO: renamed from: l */
    public final void m7511l(byte[] bArr) {
        this.f7444g = bArr;
    }

    /* JADX INFO: renamed from: m */
    public final void m7512m(long j11) {
        this.f7440c = j11;
    }

    /* JADX INFO: renamed from: n */
    public final void m7513n(long j11) {
        this.f7443f = j11;
    }

    /* JADX INFO: renamed from: o */
    public final void m7514o(String str) {
        this.f7439b = str;
    }
}
