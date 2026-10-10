package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.vg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33984vg extends C33822nh {

    /* JADX INFO: renamed from: n */
    public static final long f72385n = 1;

    /* JADX INFO: renamed from: a */
    public void m75312a(short s11) {
        this.f71179i.f71977q = s11;
        if (s11 == 3) {
            mo74163g();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m75315d(int i11) {
        this.f71179i.f71984x = i11;
    }

    /* JADX INFO: renamed from: b */
    public void m75313b(Map<String, String> map) {
        this.f71179i.f71986z = map;
    }

    /* JADX INFO: renamed from: c */
    public void m75314c(int i11) {
        this.f71179i.f71979s = i11;
    }

    /* JADX INFO: renamed from: d */
    public void m75316d(byte[] bArr) {
        this.f71179i.f71983w = bArr;
    }

    /* JADX INFO: renamed from: n */
    public byte[] m75317n() {
        return this.f71179i.f71983w;
    }

    /* JADX INFO: renamed from: o */
    public Map<String, String> m75318o() {
        return this.f71179i.f71985y;
    }

    /* JADX INFO: renamed from: p */
    public int m75319p() {
        return this.f71179i.f71979s;
    }

    /* JADX INFO: renamed from: q */
    public byte m75320q() {
        return this.f71179i.f71978r;
    }

    /* JADX INFO: renamed from: r */
    public int m75321r() {
        String str = this.f71179i.f71986z.get("STATUS_RESULT_CODE");
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public String m75322s() {
        String str = this.f71179i.f71986z.get("STATUS_RESULT_DESC");
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: t */
    public Map<String, String> m75323t() {
        return this.f71179i.f71986z;
    }

    /* JADX INFO: renamed from: u */
    public int m75324u() {
        return this.f71179i.f71984x;
    }

    /* JADX INFO: renamed from: v */
    public short m75325v() {
        return this.f71179i.f71977q;
    }

    public C33984vg() {
        C33923sf c33923sf = this.f71179i;
        c33923sf.f71977q = (short) 2;
        c33923sf.f71978r = (byte) 0;
        c33923sf.f71979s = 0;
        c33923sf.f71984x = 0;
        c33923sf.f71983w = new byte[0];
        c33923sf.f71985y = new HashMap();
        this.f71179i.f71986z = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public void m75310a(byte b11) {
        this.f71179i.f71978r = b11;
    }

    /* JADX INFO: renamed from: a */
    public void m75311a(Map<String, String> map) {
        this.f71179i.f71985y = map;
    }
}
