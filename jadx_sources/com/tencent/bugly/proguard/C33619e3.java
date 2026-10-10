package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.e3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33619e3 implements Comparable<C33619e3> {

    /* JADX INFO: renamed from: b */
    public long f69662b = -1;

    /* JADX INFO: renamed from: c */
    public long f69663c = -1;

    /* JADX INFO: renamed from: d */
    public String f69664d = null;

    /* JADX INFO: renamed from: e */
    public boolean f69665e = false;

    /* JADX INFO: renamed from: f */
    public boolean f69666f = false;

    /* JADX INFO: renamed from: g */
    public int f69667g = 0;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C33619e3 c33619e3) {
        if (c33619e3 == null) {
            return 1;
        }
        long j11 = this.f69663c - c33619e3.f69663c;
        if (j11 > 0) {
            return 1;
        }
        return j11 < 0 ? -1 : 0;
    }
}
