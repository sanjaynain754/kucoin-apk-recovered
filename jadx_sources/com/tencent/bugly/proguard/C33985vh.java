package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.vh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33985vh extends JceStruct {

    /* JADX INFO: renamed from: r */
    public static ArrayList<C34005wh> f72386r = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public ArrayList<C34005wh> f72387q;

    public C33985vh() {
        this.f72387q = null;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73958a((Collection) this.f72387q, 0);
    }

    static {
        f72386r.add(new C34005wh());
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f72387q = (ArrayList) c33752ka.m73758a(f72386r, 0, true);
    }

    public C33985vh(ArrayList<C34005wh> arrayList) {
        this.f72387q = arrayList;
    }
}
