package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.oc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33838oc extends JceStruct implements Cloneable {

    /* JADX INFO: renamed from: r */
    public static Map<Integer, byte[]> f71328r;

    /* JADX INFO: renamed from: q */
    public Map<Integer, byte[]> f71329q;

    public C33838oc() {
        this.f71329q = null;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73959a((Map) this.f71329q, 0);
    }

    public C33838oc(Map<Integer, byte[]> map) {
        this.f71329q = map;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        if (f71328r == null) {
            f71328r = new HashMap();
            f71328r.put(0, new byte[]{0});
        }
        this.f71329q = (Map) c33752ka.m73758a(f71328r, 0, true);
    }
}
