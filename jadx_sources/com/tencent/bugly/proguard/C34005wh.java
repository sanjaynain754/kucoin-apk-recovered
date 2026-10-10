package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.wh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C34005wh extends JceStruct implements Cloneable {

    /* JADX INFO: renamed from: v */
    public static ArrayList<C33944tg> f72461v;

    /* JADX INFO: renamed from: w */
    public static Map<String, String> f72462w;

    /* JADX INFO: renamed from: q */
    public byte f72463q;

    /* JADX INFO: renamed from: r */
    public String f72464r;

    /* JADX INFO: renamed from: s */
    public String f72465s;

    /* JADX INFO: renamed from: t */
    public ArrayList<C33944tg> f72466t;

    /* JADX INFO: renamed from: u */
    public Map<String, String> f72467u;

    public C34005wh() {
        this.f72463q = (byte) 0;
        this.f72464r = "";
        this.f72465s = "";
        this.f72466t = null;
        this.f72467u = null;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73942a(this.f72463q, 0);
        String str = this.f72464r;
        if (str != null) {
            c33773la.m73957a(str, 1);
        }
        String str2 = this.f72465s;
        if (str2 != null) {
            c33773la.m73957a(str2, 2);
        }
        ArrayList<C33944tg> arrayList = this.f72466t;
        if (arrayList != null) {
            c33773la.m73958a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f72467u;
        if (map != null) {
            c33773la.m73959a((Map) map, 4);
        }
    }

    public C34005wh(byte b11, String str, String str2, ArrayList<C33944tg> arrayList, Map<String, String> map) {
        this.f72463q = b11;
        this.f72464r = str;
        this.f72465s = str2;
        this.f72466t = arrayList;
        this.f72467u = map;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f72463q = c33752ka.m73750a(this.f72463q, 0, true);
        this.f72464r = c33752ka.m73781b(1, false);
        this.f72465s = c33752ka.m73781b(2, false);
        if (f72461v == null) {
            f72461v = new ArrayList<>();
            f72461v.add(new C33944tg());
        }
        this.f72466t = (ArrayList) c33752ka.m73758a(f72461v, 3, false);
        if (f72462w == null) {
            HashMap map = new HashMap();
            f72462w = map;
            map.put("", "");
        }
        this.f72467u = (Map) c33752ka.m73758a(f72462w, 4, false);
    }
}
