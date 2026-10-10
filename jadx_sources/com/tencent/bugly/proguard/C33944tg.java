package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.tg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33944tg extends JceStruct {

    /* JADX INFO: renamed from: y */
    public static Map<String, String> f72112y;

    /* JADX INFO: renamed from: q */
    public long f72113q;

    /* JADX INFO: renamed from: r */
    public byte f72114r;

    /* JADX INFO: renamed from: s */
    public String f72115s;

    /* JADX INFO: renamed from: t */
    public String f72116t;

    /* JADX INFO: renamed from: u */
    public String f72117u;

    /* JADX INFO: renamed from: v */
    public Map<String, String> f72118v;

    /* JADX INFO: renamed from: w */
    public String f72119w;

    /* JADX INFO: renamed from: x */
    public boolean f72120x;

    public C33944tg() {
        this.f72113q = 0L;
        this.f72114r = (byte) 0;
        this.f72115s = "";
        this.f72116t = "";
        this.f72117u = "";
        this.f72118v = null;
        this.f72119w = "";
        this.f72120x = true;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73947a(this.f72113q, 0);
        c33773la.m73942a(this.f72114r, 1);
        String str = this.f72115s;
        if (str != null) {
            c33773la.m73957a(str, 2);
        }
        String str2 = this.f72116t;
        if (str2 != null) {
            c33773la.m73957a(str2, 3);
        }
        String str3 = this.f72117u;
        if (str3 != null) {
            c33773la.m73957a(str3, 4);
        }
        Map<String, String> map = this.f72118v;
        if (map != null) {
            c33773la.m73959a((Map) map, 5);
        }
        String str4 = this.f72119w;
        if (str4 != null) {
            c33773la.m73957a(str4, 6);
        }
        c33773la.m73961a(this.f72120x, 7);
    }

    static {
        HashMap map = new HashMap();
        f72112y = map;
        map.put("", "");
    }

    public C33944tg(long j11, byte b11, String str, String str2, String str3, Map<String, String> map, String str4, boolean z11) {
        this.f72113q = j11;
        this.f72114r = b11;
        this.f72115s = str;
        this.f72116t = str2;
        this.f72117u = str3;
        this.f72118v = map;
        this.f72119w = str4;
        this.f72120x = z11;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f72113q = c33752ka.m73756a(this.f72113q, 0, true);
        this.f72114r = c33752ka.m73750a(this.f72114r, 1, true);
        this.f72115s = c33752ka.m73781b(2, false);
        this.f72116t = c33752ka.m73781b(3, false);
        this.f72117u = c33752ka.m73781b(4, false);
        this.f72118v = (Map) c33752ka.m73758a(f72112y, 5, false);
        this.f72119w = c33752ka.m73781b(6, false);
        this.f72120x = c33752ka.m73769a(this.f72120x, 7, false);
    }
}
