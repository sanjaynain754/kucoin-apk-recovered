package com.tencent.bugly.proguard;

import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.bg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33569bg extends JceStruct implements Cloneable {

    /* JADX INFO: renamed from: C */
    public static C33548ag f69281C = new C33548ag();

    /* JADX INFO: renamed from: D */
    public static Map<String, String> f69282D = null;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ boolean f69283E = true;

    /* JADX INFO: renamed from: A */
    public int f69284A;

    /* JADX INFO: renamed from: B */
    public int f69285B;

    /* JADX INFO: renamed from: q */
    public boolean f69286q;

    /* JADX INFO: renamed from: r */
    public boolean f69287r;

    /* JADX INFO: renamed from: s */
    public boolean f69288s;

    /* JADX INFO: renamed from: t */
    public String f69289t;

    /* JADX INFO: renamed from: u */
    public String f69290u;

    /* JADX INFO: renamed from: v */
    public C33548ag f69291v;

    /* JADX INFO: renamed from: w */
    public Map<String, String> f69292w;

    /* JADX INFO: renamed from: x */
    public long f69293x;

    /* JADX INFO: renamed from: y */
    public String f69294y;

    /* JADX INFO: renamed from: z */
    public String f69295z;

    public C33569bg() {
        this.f69286q = true;
        this.f69287r = true;
        this.f69288s = true;
        this.f69289t = "";
        this.f69290u = "";
        this.f69291v = null;
        this.f69292w = null;
        this.f69293x = 0L;
        this.f69294y = "";
        this.f69295z = "";
        this.f69284A = 0;
        this.f69285B = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m72532a(boolean z11) {
        this.f69286q = z11;
    }

    /* JADX INFO: renamed from: b */
    public void m72535b(boolean z11) {
        this.f69288s = z11;
    }

    /* JADX INFO: renamed from: c */
    public void m72537c(boolean z11) {
        this.f69287r = z11;
    }

    /* JADX INFO: renamed from: d */
    public String m72538d() {
        return "rqd.RqdStrategy";
    }

    /* JADX INFO: renamed from: e */
    public String m72540e() {
        return "rqd.RqdStrategy";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C33569bg c33569bg = (C33569bg) obj;
        return C33794ma.m74110b(this.f69286q, c33569bg.f69286q) && C33794ma.m74110b(this.f69287r, c33569bg.f69287r) && C33794ma.m74110b(this.f69288s, c33569bg.f69288s) && this.f69289t.equals(c33569bg.f69289t) && this.f69290u.equals(c33569bg.f69290u) && this.f69291v.equals(c33569bg.f69291v) && this.f69292w.equals(c33569bg.f69292w) && C33794ma.m74108b(this.f69293x, c33569bg.f69293x) && this.f69294y.equals(c33569bg.f69294y) && this.f69295z.equals(c33569bg.f69295z) && C33794ma.m74107b(this.f69284A, c33569bg.f69284A) && C33794ma.m74107b(this.f69285B, c33569bg.f69285B);
    }

    /* JADX INFO: renamed from: f */
    public boolean m72543f() {
        return this.f69286q;
    }

    static {
        HashMap map = new HashMap();
        f69282D = map;
        map.put("", "");
    }

    /* JADX INFO: renamed from: a */
    public void m72530a(C33548ag c33548ag) {
        this.f69291v = c33548ag;
    }

    /* JADX INFO: renamed from: b */
    public void m72533b(int i11) {
        this.f69285B = i11;
    }

    /* JADX INFO: renamed from: c */
    public void m72536c(String str) {
        this.f69290u = str;
    }

    /* JADX INFO: renamed from: d */
    public void m72539d(String str) {
        this.f69295z = str;
    }

    /* JADX INFO: renamed from: e */
    public void m72541e(String str) {
        this.f69294y = str;
    }

    /* JADX INFO: renamed from: f */
    public void m72542f(String str) {
        this.f69289t = str;
    }

    /* JADX INFO: renamed from: g */
    public boolean m72544g() {
        return this.f69288s;
    }

    /* JADX INFO: renamed from: h */
    public boolean m72545h() {
        return this.f69287r;
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public int m72546i() {
        return this.f69284A;
    }

    /* JADX INFO: renamed from: j */
    public int m72547j() {
        return this.f69285B;
    }

    /* JADX INFO: renamed from: k */
    public String m72548k() {
        return this.f69290u;
    }

    /* JADX INFO: renamed from: l */
    public String m72549l() {
        return this.f69295z;
    }

    /* JADX INFO: renamed from: m */
    public String m72550m() {
        return this.f69294y;
    }

    /* JADX INFO: renamed from: n */
    public C33548ag m72551n() {
        return this.f69291v;
    }

    /* JADX INFO: renamed from: o */
    public long m72552o() {
        return this.f69293x;
    }

    /* JADX INFO: renamed from: p */
    public String m72553p() {
        return this.f69289t;
    }

    /* JADX INFO: renamed from: q */
    public Map<String, String> m72554q() {
        return this.f69292w;
    }

    /* JADX INFO: renamed from: a */
    public void m72531a(Map<String, String> map) {
        this.f69292w = map;
    }

    /* JADX INFO: renamed from: b */
    public void m72534b(StringBuilder sb2, int i11) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb2, i11);
        jceDisplayer.displaySimple(this.f69286q, true);
        jceDisplayer.displaySimple(this.f69287r, true);
        jceDisplayer.displaySimple(this.f69288s, true);
        jceDisplayer.displaySimple(this.f69289t, true);
        jceDisplayer.displaySimple(this.f69290u, true);
        jceDisplayer.displaySimple(this.f69291v, true);
        jceDisplayer.displaySimple(this.f69292w, true);
        jceDisplayer.displaySimple(this.f69293x, true);
        jceDisplayer.displaySimple(this.f69294y, true);
        jceDisplayer.displaySimple(this.f69295z, true);
        jceDisplayer.displaySimple(this.f69284A, true);
        jceDisplayer.displaySimple(this.f69285B, false);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f69283E) {
                return null;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72529a(long j11) {
        this.f69293x = j11;
    }

    /* JADX INFO: renamed from: a */
    public void m72528a(int i11) {
        this.f69284A = i11;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72269a(C33773la c33773la) {
        c33773la.m73961a(this.f69286q, 0);
        c33773la.m73961a(this.f69287r, 1);
        c33773la.m73961a(this.f69288s, 2);
        String str = this.f69289t;
        if (str != null) {
            c33773la.m73957a(str, 3);
        }
        String str2 = this.f69290u;
        if (str2 != null) {
            c33773la.m73957a(str2, 4);
        }
        C33548ag c33548ag = this.f69291v;
        if (c33548ag != null) {
            c33773la.m73948a((JceStruct) c33548ag, 5);
        }
        Map<String, String> map = this.f69292w;
        if (map != null) {
            c33773la.m73959a((Map) map, 6);
        }
        c33773la.m73947a(this.f69293x, 7);
        String str3 = this.f69294y;
        if (str3 != null) {
            c33773la.m73957a(str3, 8);
        }
        String str4 = this.f69295z;
        if (str4 != null) {
            c33773la.m73957a(str4, 9);
        }
        c33773la.m73946a(this.f69284A, 10);
        c33773la.m73946a(this.f69285B, 11);
    }

    public C33569bg(boolean z11, boolean z12, boolean z13, String str, String str2, C33548ag c33548ag, Map<String, String> map, long j11, String str3, String str4, int i11, int i12) {
        this.f69286q = z11;
        this.f69287r = z12;
        this.f69288s = z13;
        this.f69289t = str;
        this.f69290u = str2;
        this.f69291v = c33548ag;
        this.f69292w = map;
        this.f69293x = j11;
        this.f69294y = str3;
        this.f69295z = str4;
        this.f69284A = i11;
        this.f69285B = i12;
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72268a(C33752ka c33752ka) {
        this.f69286q = c33752ka.m73769a(this.f69286q, 0, true);
        this.f69287r = c33752ka.m73769a(this.f69287r, 1, true);
        this.f69288s = c33752ka.m73769a(this.f69288s, 2, true);
        this.f69289t = c33752ka.m73781b(3, false);
        this.f69290u = c33752ka.m73781b(4, false);
        this.f69291v = (C33548ag) c33752ka.m73780b((JceStruct) f69281C, 5, false);
        this.f69292w = (Map) c33752ka.m73758a(f69282D, 6, false);
        this.f69293x = c33752ka.m73756a(this.f69293x, 7, false);
        this.f69294y = c33752ka.m73781b(8, false);
        this.f69295z = c33752ka.m73781b(9, false);
        this.f69284A = c33752ka.m73753a(this.f69284A, 10, false);
        this.f69285B = c33752ka.m73753a(this.f69285B, 11, false);
    }

    @Override // com.tencent.bugly.proguard.JceStruct
    /* JADX INFO: renamed from: a */
    public void mo72271a(StringBuilder sb2, int i11) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb2, i11);
        jceDisplayer.m72257a(this.f69286q, BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE);
        jceDisplayer.m72257a(this.f69287r, "enableUserInfo");
        jceDisplayer.m72257a(this.f69288s, "enableQuery");
        jceDisplayer.m72253a(this.f69289t, "url");
        jceDisplayer.m72253a(this.f69290u, "expUrl");
        jceDisplayer.m72251a((JceStruct) this.f69291v, "security");
        jceDisplayer.m72255a((Map) this.f69292w, "valueMap");
        jceDisplayer.m72250a(this.f69293x, C33556b3.f69082p2);
        jceDisplayer.m72253a(this.f69294y, "httpsUrl");
        jceDisplayer.m72253a(this.f69295z, "httpsExpUrl");
        jceDisplayer.m72249a(this.f69284A, "eventRecordCount");
        jceDisplayer.m72249a(this.f69285B, "eventTimeInterval");
    }
}
