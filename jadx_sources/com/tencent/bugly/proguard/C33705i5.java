package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.i5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33705i5 extends JceStruct implements Cloneable {

    /* JADX INFO: renamed from: r */
    public static ArrayList<C33684h5> f70191r;

    /* JADX INFO: renamed from: q */
    public ArrayList<C33684h5> f70192q;

    public C33705i5() {
        this.f70192q = null;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73958a((Collection) this.f70192q, 0);
    }

    public C33705i5(ArrayList<C33684h5> arrayList) {
        this.f70192q = arrayList;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        if (f70191r == null) {
            f70191r = new ArrayList<>();
            f70191r.add(new C33684h5());
        }
        this.f70192q = (ArrayList) c33752ka.m73758a(f70191r, 0, true);
    }
}
