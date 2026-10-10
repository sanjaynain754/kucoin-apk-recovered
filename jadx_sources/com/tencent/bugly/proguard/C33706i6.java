package com.tencent.bugly.proguard;

import java.io.Serializable;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.i6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33706i6 extends C33913s5 implements Serializable {

    /* JADX INFO: renamed from: p */
    public final int f70193p;

    /* JADX INFO: renamed from: q */
    public Object f70194q;

    /* JADX INFO: renamed from: r */
    public String f70195r;

    /* JADX INFO: renamed from: s */
    public long f70196s;

    public C33706i6(int i11, int i12, String str) {
        this.f70193p = i11;
        this.f71828b = i12;
        this.f71829c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C33706i6 m73341a(int i11, int i12) {
        return new C33706i6(i11, i12, "");
    }

    /* JADX INFO: renamed from: a */
    public static C33706i6 m73342a(int i11, int i12, String str) {
        return new C33706i6(i11, i12, str);
    }

    /* JADX INFO: renamed from: d */
    public <T> T m73345d() {
        return (T) this.f70194q;
    }

    /* JADX INFO: renamed from: e */
    public long m73346e() {
        return this.f70196s;
    }

    /* JADX INFO: renamed from: f */
    public String m73347f() {
        return this.f70195r;
    }

    /* JADX INFO: renamed from: g */
    public int m73348g() {
        return this.f70193p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FdLeakDumpResult{errorCode=");
        sb2.append(this.f71828b);
        sb2.append(", dumpFilePath='");
        sb2.append(this.f70195r);
        sb2.append("', errorMessage='");
        return C34025xh.m75464a(sb2, this.f71829c, "'}");
    }

    /* JADX INFO: renamed from: a */
    public void m73344a(Object obj) {
        this.f70194q = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m73343a(long j11) {
        this.f70196s = j11;
    }

    public C33706i6(int i11, String str, Object obj) {
        this.f70193p = i11;
        this.f70194q = obj;
        this.f70195r = str;
    }
}
