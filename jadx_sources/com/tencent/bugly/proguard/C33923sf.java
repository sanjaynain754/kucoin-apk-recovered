package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.sf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33923sf extends JceStruct {

    /* JADX INFO: renamed from: A */
    public static byte[] f71974A = null;

    /* JADX INFO: renamed from: B */
    public static Map<String, String> f71975B = null;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ boolean f71976C = true;

    /* JADX INFO: renamed from: q */
    public short f71977q;

    /* JADX INFO: renamed from: r */
    public byte f71978r;

    /* JADX INFO: renamed from: s */
    public int f71979s;

    /* JADX INFO: renamed from: t */
    public int f71980t;

    /* JADX INFO: renamed from: u */
    public String f71981u;

    /* JADX INFO: renamed from: v */
    public String f71982v;

    /* JADX INFO: renamed from: w */
    public byte[] f71983w;

    /* JADX INFO: renamed from: x */
    public int f71984x;

    /* JADX INFO: renamed from: y */
    public Map<String, String> f71985y;

    /* JADX INFO: renamed from: z */
    public Map<String, String> f71986z;

    public C33923sf() {
        this.f71977q = (short) 0;
        this.f71978r = (byte) 0;
        this.f71979s = 0;
        this.f71980t = 0;
        this.f71981u = null;
        this.f71982v = null;
        this.f71984x = 0;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73960a(this.f71977q, 1);
        c33773la.m73942a(this.f71978r, 2);
        c33773la.m73946a(this.f71979s, 3);
        c33773la.m73946a(this.f71980t, 4);
        c33773la.m73957a(this.f71981u, 5);
        c33773la.m73957a(this.f71982v, 6);
        c33773la.m73962a(this.f71983w, 7);
        c33773la.m73946a(this.f71984x, 8);
        c33773la.m73959a((Map) this.f71985y, 9);
        c33773la.m73959a((Map) this.f71986z, 10);
    }

    public boolean equals(Object obj) {
        C33923sf c33923sf = (C33923sf) obj;
        Integer num = 1;
        return C33794ma.m74107b(1, (int) c33923sf.f71977q) && C33794ma.m74107b(1, (int) c33923sf.f71978r) && C33794ma.m74107b(1, c33923sf.f71979s) && C33794ma.m74107b(1, c33923sf.f71980t) && num.equals(c33923sf.f71981u) && num.equals(c33923sf.f71982v) && num.equals(c33923sf.f71983w) && C33794ma.m74107b(1, c33923sf.f71984x) && num.equals(c33923sf.f71985y) && num.equals(c33923sf.f71986z);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f71976C) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public C33923sf(short s11, byte b11, int i11, int i12, String str, String str2, byte[] bArr, int i13, Map<String, String> map, Map<String, String> map2) {
        this.f71977q = s11;
        this.f71978r = b11;
        this.f71979s = i11;
        this.f71980t = i12;
        this.f71981u = str;
        this.f71982v = str2;
        this.f71983w = bArr;
        this.f71984x = i13;
        this.f71985y = map;
        this.f71986z = map2;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        try {
            this.f71977q = c33752ka.m73765a(this.f71977q, 1, true);
            this.f71978r = c33752ka.m73750a(this.f71978r, 2, true);
            this.f71979s = c33752ka.m73753a(this.f71979s, 3, true);
            this.f71980t = c33752ka.m73753a(this.f71980t, 4, true);
            this.f71981u = c33752ka.m73781b(5, true);
            this.f71982v = c33752ka.m73781b(6, true);
            if (f71974A == null) {
                f71974A = new byte[]{0};
            }
            this.f71983w = c33752ka.m73770a(f71974A, 7, true);
            this.f71984x = c33752ka.m73753a(this.f71984x, 8, true);
            if (f71975B == null) {
                HashMap map = new HashMap();
                f71975B = map;
                map.put("", "");
            }
            this.f71985y = (Map) c33752ka.m73758a(f71975B, 9, true);
            if (f71975B == null) {
                HashMap map2 = new HashMap();
                f71975B = map2;
                map2.put("", "");
            }
            this.f71986z = (Map) c33752ka.m73758a(f71975B, 10, true);
        } catch (Exception e11) {
            e11.printStackTrace();
            System.out.println("RequestPacket decode error " + C34006wi.m75401a(this.f71983w));
            throw new RuntimeException(e11);
        }
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb2, i11);
        jceDisplayer.m72256a(this.f71977q, "iVersion");
        jceDisplayer.m72245a(this.f71978r, "cPacketType");
        jceDisplayer.m72249a(this.f71979s, "iMessageType");
        jceDisplayer.m72249a(this.f71980t, "iRequestId");
        jceDisplayer.m72253a(this.f71981u, "sServantName");
        jceDisplayer.m72253a(this.f71982v, "sFuncName");
        jceDisplayer.m72258a(this.f71983w, "sBuffer");
        jceDisplayer.m72249a(this.f71984x, "iTimeout");
        jceDisplayer.m72255a((Map) this.f71985y, "context");
        jceDisplayer.m72255a((Map) this.f71986z, "status");
    }
}
