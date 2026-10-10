package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.vf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33983vf extends JceStruct {

    /* JADX INFO: renamed from: y */
    public static byte[] f72375y = {0};

    /* JADX INFO: renamed from: z */
    public static Map<String, String> f72376z;

    /* JADX INFO: renamed from: q */
    public byte f72377q;

    /* JADX INFO: renamed from: r */
    public int f72378r;

    /* JADX INFO: renamed from: s */
    public byte[] f72379s;

    /* JADX INFO: renamed from: t */
    public String f72380t;

    /* JADX INFO: renamed from: u */
    public long f72381u;

    /* JADX INFO: renamed from: v */
    public String f72382v;

    /* JADX INFO: renamed from: w */
    public String f72383w;

    /* JADX INFO: renamed from: x */
    public Map<String, String> f72384x;

    static {
        HashMap map = new HashMap();
        f72376z = map;
        map.put("", "");
    }

    public C33983vf() {
        this.f72377q = (byte) 0;
        this.f72378r = 0;
        this.f72379s = null;
        this.f72380t = "";
        this.f72381u = 0L;
        this.f72382v = "";
        this.f72383w = "";
        this.f72384x = null;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73942a(this.f72377q, 0);
        c33773la.m73946a(this.f72378r, 1);
        byte[] bArr = this.f72379s;
        if (bArr != null) {
            c33773la.m73962a(bArr, 2);
        }
        String str = this.f72380t;
        if (str != null) {
            c33773la.m73957a(str, 3);
        }
        c33773la.m73947a(this.f72381u, 4);
        String str2 = this.f72382v;
        if (str2 != null) {
            c33773la.m73957a(str2, 5);
        }
        String str3 = this.f72383w;
        if (str3 != null) {
            c33773la.m73957a(str3, 6);
        }
        Map<String, String> map = this.f72384x;
        if (map != null) {
            c33773la.m73959a((Map) map, 7);
        }
    }

    public C33983vf(byte b11, int i11, byte[] bArr, String str, long j11, String str2, String str3, Map<String, String> map) {
        this.f72377q = b11;
        this.f72378r = i11;
        this.f72379s = bArr;
        this.f72380t = str;
        this.f72381u = j11;
        this.f72382v = str2;
        this.f72383w = str3;
        this.f72384x = map;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f72377q = c33752ka.m73750a(this.f72377q, 0, true);
        this.f72378r = c33752ka.m73753a(this.f72378r, 1, true);
        this.f72379s = c33752ka.m73770a(f72375y, 2, false);
        this.f72380t = c33752ka.m73781b(3, false);
        this.f72381u = c33752ka.m73756a(this.f72381u, 4, false);
        this.f72382v = c33752ka.m73781b(5, false);
        this.f72383w = c33752ka.m73781b(6, false);
        this.f72384x = (Map) c33752ka.m73758a(f72376z, 7, false);
    }
}
