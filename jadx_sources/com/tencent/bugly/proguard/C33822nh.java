package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.nh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33822nh extends C33801mh {

    /* JADX INFO: renamed from: k */
    public static final int f71176k = 4;

    /* JADX INFO: renamed from: l */
    public static HashMap<String, byte[]> f71177l;

    /* JADX INFO: renamed from: m */
    public static HashMap<String, HashMap<String, byte[]>> f71178m;

    /* JADX INFO: renamed from: i */
    public C33923sf f71179i;

    /* JADX INFO: renamed from: j */
    public int f71180j;

    public C33822nh() {
        C33923sf c33923sf = new C33923sf();
        this.f71179i = c33923sf;
        this.f71180j = 0;
        c33923sf.f71977q = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.C33801mh, com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: a */
    public void mo74145a(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("decode package must include size head");
        }
        try {
            C33752ka c33752ka = new C33752ka(bArr, 4);
            c33752ka.f70614b = this.f71936d;
            m74325a(c33752ka);
            C33923sf c33923sf = this.f71179i;
            if (c33923sf.f71977q == 3) {
                C33752ka c33752ka2 = new C33752ka(c33923sf.f71983w);
                c33752ka2.f70614b = this.f71936d;
                if (f71177l == null) {
                    HashMap<String, byte[]> map = new HashMap<>();
                    f71177l = map;
                    map.put("", new byte[0]);
                }
                this.f70972f = c33752ka2.m73761a((Map) f71177l, 0, false);
                return;
            }
            C33752ka c33752ka3 = new C33752ka(c33923sf.f71983w);
            c33752ka3.f70614b = this.f71936d;
            if (f71178m == null) {
                f71178m = new HashMap<>();
                HashMap<String, byte[]> map2 = new HashMap<>();
                map2.put("", new byte[0]);
                f71178m.put("", map2);
            }
            this.f71933a = c33752ka3.m73761a((Map) f71178m, 0, false);
            this.f71934b = new HashMap<>();
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.tencent.bugly.proguard.C33801mh, com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: b */
    public <T> void mo74149b(String str, T t11) {
        if (str.startsWith(C33978va.f72339h)) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.mo74149b(str, t11);
    }

    @Override // com.tencent.bugly.proguard.C33801mh
    /* JADX INFO: renamed from: c */
    public void mo74153c(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("decode package must include size head");
        }
        try {
            C33752ka c33752ka = new C33752ka(bArr, 4);
            c33752ka.f70614b = this.f71936d;
            m74325a(c33752ka);
            C33752ka c33752ka2 = new C33752ka(this.f71179i.f71983w);
            c33752ka2.f70614b = this.f71936d;
            if (f71177l == null) {
                HashMap<String, byte[]> map = new HashMap<>();
                f71177l = map;
                map.put("", new byte[0]);
            }
            this.f70972f = c33752ka2.m73761a((Map) f71177l, 0, false);
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.tencent.bugly.proguard.C33801mh
    /* JADX INFO: renamed from: g */
    public void mo74163g() {
        super.mo74163g();
        this.f71179i.f71977q = (short) 3;
    }

    /* JADX INFO: renamed from: h */
    public void m74330h(String str) {
        this.f71179i.f71981u = str;
    }

    /* JADX INFO: renamed from: h */
    public byte[] m74331h() {
        C33773la c33773la = new C33773la(0);
        c33773la.f70834b = this.f71936d;
        c33773la.m73959a((Map) this.f71933a, 0);
        byte[] bArrM74111b = C33794ma.m74111b(c33773la.f70833a);
        C33773la c33773la2 = new C33773la(0);
        c33773la2.f70834b = this.f71936d;
        c33773la2.m73960a(this.f71179i.f71977q, 1);
        c33773la2.m73942a(this.f71179i.f71978r, 2);
        c33773la2.m73946a(this.f71179i.f71980t, 3);
        c33773la2.m73946a(this.f71179i.f71979s, 4);
        c33773la2.m73946a(this.f71180j, 5);
        c33773la2.m73962a(bArrM74111b, 6);
        c33773la2.m73959a((Map) this.f71179i.f71986z, 7);
        return C33794ma.m74111b(c33773la2.f70833a);
    }

    /* JADX INFO: renamed from: i */
    public C33822nh m74332i() {
        C33822nh c33822nh = new C33822nh();
        c33822nh.f71179i.f71980t = m74335l();
        c33822nh.f71179i.f71981u = m74336m();
        c33822nh.f71179i.f71982v = m74333j();
        c33822nh.f71936d = this.f71936d;
        return c33822nh;
    }

    /* JADX INFO: renamed from: j */
    public String m74333j() {
        return this.f71179i.f71982v;
    }

    /* JADX INFO: renamed from: k */
    public int m74334k() {
        return this.f71180j;
    }

    /* JADX INFO: renamed from: l */
    public int m74335l() {
        return this.f71179i.f71980t;
    }

    /* JADX INFO: renamed from: m */
    public String m74336m() {
        return this.f71179i.f71981u;
    }

    /* JADX INFO: renamed from: g */
    public void m74329g(String str) {
        this.f71179i.f71982v = str;
    }

    @Override // com.tencent.bugly.proguard.C33801mh, com.tencent.bugly.proguard.C33921sd
    /* JADX INFO: renamed from: b */
    public byte[] mo74151b() {
        C33923sf c33923sf = this.f71179i;
        if (c33923sf.f71977q == 2) {
            if (!c33923sf.f71981u.equals("")) {
                if (this.f71179i.f71982v.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (c33923sf.f71981u == null) {
                c33923sf.f71981u = "";
            }
            if (c33923sf.f71982v == null) {
                c33923sf.f71982v = "";
            }
        }
        C33773la c33773la = new C33773la(0);
        c33773la.f70834b = this.f71936d;
        if (this.f71179i.f71977q == 2) {
            c33773la.m73959a((Map) this.f71933a, 0);
        } else {
            c33773la.m73959a((Map) this.f70972f, 0);
        }
        this.f71179i.f71983w = C33794ma.m74111b(c33773la.f70833a);
        C33773la c33773la2 = new C33773la(0);
        c33773la2.f70834b = this.f71936d;
        m74326a(c33773la2);
        byte[] bArrM74111b = C33794ma.m74111b(c33773la2.f70833a);
        int length = bArrM74111b.length + 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length).put(bArrM74111b).flip();
        return byteBufferAllocate.array();
    }

    public C33822nh(boolean z11) {
        C33923sf c33923sf = new C33923sf();
        this.f71179i = c33923sf;
        this.f71180j = 0;
        if (z11) {
            mo74163g();
        } else {
            c33923sf.f71977q = (short) 2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74326a(C33773la c33773la) {
        this.f71179i.mo72269a(c33773la);
    }

    /* JADX INFO: renamed from: a */
    public void m74325a(C33752ka c33752ka) {
        this.f71179i.mo72268a(c33752ka);
    }

    /* JADX INFO: renamed from: a */
    public void m74327a(StringBuilder sb2, int i11) {
        this.f71179i.mo72271a(sb2, i11);
    }

    /* JADX INFO: renamed from: a */
    public void m74324a(int i11) {
        this.f71180j = i11;
    }

    @Override // com.tencent.bugly.proguard.C33801mh
    /* JADX INFO: renamed from: b */
    public void mo74150b(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C33752ka c33752ka = new C33752ka(bArr, 4);
                c33752ka.f70614b = this.f71936d;
                m74325a(c33752ka);
                C33752ka c33752ka2 = new C33752ka(this.f71179i.f71983w);
                c33752ka2.f70614b = this.f71936d;
                if (f71178m == null) {
                    f71178m = new HashMap<>();
                    HashMap<String, byte[]> map = new HashMap<>();
                    map.put("", new byte[0]);
                    f71178m.put("", map);
                }
                this.f71933a = c33752ka2.m73761a((Map) f71178m, 0, false);
                this.f71934b = new HashMap<>();
                return;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }

    /* JADX INFO: renamed from: b */
    public void m74328b(int i11) {
        this.f71179i.f71980t = i11;
    }
}
