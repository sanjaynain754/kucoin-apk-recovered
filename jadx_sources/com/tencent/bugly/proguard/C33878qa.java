package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.qa */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33878qa {

    /* JADX INFO: renamed from: a */
    public float f71550a = 0.1f;

    /* JADX INFO: renamed from: b */
    public long f71551b = 200;

    /* JADX INFO: renamed from: c */
    public long f71552c = 3000;

    /* JADX INFO: renamed from: d */
    public long f71553d = 52;

    /* JADX INFO: renamed from: e */
    public boolean f71554e = true;

    /* JADX INFO: renamed from: f */
    public String f71555f = "msg";

    /* JADX INFO: renamed from: a */
    public void m74678a() {
        this.f71550a = 0.1f;
        this.f71551b = 200L;
        this.f71552c = 3000L;
        this.f71553d = 52L;
        this.f71554e = true;
        this.f71555f = "msg";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f71550a);
        sb2.append(",");
        sb2.append(this.f71551b);
        sb2.append(",");
        sb2.append(this.f71553d);
        sb2.append(",");
        sb2.append(this.f71552c);
        sb2.append(",");
        sb2.append(this.f71554e);
        sb2.append(",");
        return C34025xh.m75464a(sb2, this.f71555f, "]");
    }

    /* JADX INFO: renamed from: a */
    public void m74679a(C33878qa c33878qa) {
        if (c33878qa == null) {
            return;
        }
        this.f71550a = c33878qa.f71550a;
        this.f71551b = c33878qa.f71551b;
        this.f71552c = c33878qa.f71552c;
        this.f71553d = c33878qa.f71553d;
        this.f71554e = c33878qa.f71554e;
        this.f71555f = c33878qa.f71555f;
    }
}
