package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.i0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33700i0 extends JceStruct implements Cloneable {

    /* JADX INFO: renamed from: s */
    public static ArrayList<String> f70150s;

    /* JADX INFO: renamed from: q */
    public String f70151q;

    /* JADX INFO: renamed from: r */
    public ArrayList<String> f70152r;

    public C33700i0() {
        this.f70151q = "";
        this.f70152r = null;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73957a(this.f70151q, 0);
        ArrayList<String> arrayList = this.f70152r;
        if (arrayList != null) {
            c33773la.m73958a((Collection) arrayList, 1);
        }
    }

    public C33700i0(String str, ArrayList<String> arrayList) {
        this.f70151q = str;
        this.f70152r = arrayList;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f70151q = c33752ka.m73781b(0, true);
        if (f70150s == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f70150s = arrayList;
            arrayList.add("");
        }
        this.f70152r = (ArrayList) c33752ka.m73758a(f70150s, 1, false);
    }
}
