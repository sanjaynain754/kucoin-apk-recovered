package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33933t5 implements Comparable<C33933t5> {

    /* JADX INFO: renamed from: b */
    public final int f72054b;

    /* JADX INFO: renamed from: e */
    public List<C33973v5> f72057e;

    /* JADX INFO: renamed from: d */
    public final Map<String, Integer> f72056d = new HashMap();

    /* JADX INFO: renamed from: c */
    public int f72055c = 0;

    /* JADX INFO: renamed from: a */
    public void m75038a(String str) {
        this.f72055c++;
        Integer num = this.f72056d.get(str);
        if (num == null) {
            this.f72056d.put(str, 0);
            num = 0;
        }
        this.f72056d.put(str, Integer.valueOf(num.intValue() + 1));
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Integer> m75039b() {
        return this.f72056d;
    }

    /* JADX INFO: renamed from: c */
    public List<C33973v5> m75040c() {
        if (this.f72057e == null) {
            this.f72057e = C33853p6.m74505a(this.f72056d);
        }
        return this.f72057e;
    }

    /* JADX INFO: renamed from: d */
    public int m75041d() {
        return this.f72054b;
    }

    public String toString() {
        return "FdStatisticItem{type=" + this.f72054b + ", count=" + this.f72055c + '}';
    }

    public C33933t5(int i11) {
        this.f72054b = i11;
    }

    /* JADX INFO: renamed from: a */
    public int m75036a() {
        return this.f72055c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C33933t5 c33933t5) {
        return c33933t5.f72055c - this.f72055c;
    }
}
