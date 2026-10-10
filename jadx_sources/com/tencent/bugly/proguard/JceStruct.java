package com.tencent.bugly.proguard;

import java.io.Serializable;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class JceStruct implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final byte f68769b = 0;

    /* JADX INFO: renamed from: c */
    public static final byte f68770c = 1;

    /* JADX INFO: renamed from: d */
    public static final byte f68771d = 2;

    /* JADX INFO: renamed from: e */
    public static final byte f68772e = 3;

    /* JADX INFO: renamed from: f */
    public static final byte f68773f = 4;

    /* JADX INFO: renamed from: g */
    public static final byte f68774g = 5;

    /* JADX INFO: renamed from: h */
    public static final byte f68775h = 6;

    /* JADX INFO: renamed from: i */
    public static final byte f68776i = 7;

    /* JADX INFO: renamed from: j */
    public static final byte f68777j = 8;

    /* JADX INFO: renamed from: k */
    public static final byte f68778k = 9;

    /* JADX INFO: renamed from: l */
    public static final byte f68779l = 10;

    /* JADX INFO: renamed from: m */
    public static final byte f68780m = 11;

    /* JADX INFO: renamed from: n */
    public static final byte f68781n = 12;

    /* JADX INFO: renamed from: o */
    public static final byte f68782o = 13;

    /* JADX INFO: renamed from: p */
    public static final int f68783p = 104857600;

    /* JADX INFO: renamed from: a */
    public JceStruct m72267a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo72268a(C33752ka c33752ka);

    /* JADX INFO: renamed from: a */
    public abstract void mo72269a(C33773la c33773la);

    /* JADX INFO: renamed from: a */
    public abstract void mo72271a(StringBuilder sb2, int i11);

    /* JADX INFO: renamed from: b */
    public Object m72273b(String str) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m72270a(String str, Object obj) {
    }

    /* JADX INFO: renamed from: b */
    public void m72274b() {
    }

    /* JADX INFO: renamed from: c */
    public byte[] m72275c() {
        C33773la c33773la = new C33773la(128);
        mo72269a(c33773la);
        return c33773la.m73973b();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        mo72271a(sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m72272a(String str) {
        return false;
    }
}
