package com.tencent.bugly.proguard;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33928t0 {

    /* JADX INFO: renamed from: a */
    public ArrayList<a> f72022a = new ArrayList<>();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.t0$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public byte f72023a = 0;

        /* JADX INFO: renamed from: b */
        public String f72024b = "";

        /* JADX INFO: renamed from: c */
        public byte[] f72025c = null;
    }

    /* JADX INFO: renamed from: a */
    public void m75013a(a aVar) {
        this.f72022a.add(aVar);
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<a> m75014b() {
        return this.f72022a;
    }

    /* JADX INFO: renamed from: a */
    public void m75012a() {
        this.f72022a.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m75015b(a aVar) {
        this.f72022a.remove(aVar);
    }
}
