package com.fasterxml.jackson.core.p062io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.C6322a;
import com.fasterxml.jackson.core.util.C6330i;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.d */
/* JADX INFO: compiled from: IOContext.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6310d {

    /* JADX INFO: renamed from: a */
    public final ContentReference f10081a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public final Object f10082b;

    /* JADX INFO: renamed from: c */
    public JsonEncoding f10083c;

    /* JADX INFO: renamed from: d */
    public final boolean f10084d;

    /* JADX INFO: renamed from: e */
    public final C6322a f10085e;

    /* JADX INFO: renamed from: f */
    public byte[] f10086f;

    /* JADX INFO: renamed from: g */
    public byte[] f10087g;

    /* JADX INFO: renamed from: h */
    public byte[] f10088h;

    /* JADX INFO: renamed from: i */
    public char[] f10089i;

    /* JADX INFO: renamed from: j */
    public char[] f10090j;

    /* JADX INFO: renamed from: k */
    public char[] f10091k;

    /* JADX INFO: renamed from: a */
    public final void m10974a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10975b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw m10995v();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10976c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw m10995v();
        }
    }

    /* JADX INFO: renamed from: d */
    public byte[] m10977d() {
        m10974a(this.f10088h);
        byte[] bArrM11056a = this.f10085e.m11056a(3);
        this.f10088h = bArrM11056a;
        return bArrM11056a;
    }

    /* JADX INFO: renamed from: e */
    public char[] m10978e() {
        m10974a(this.f10090j);
        char[] cArrM11058c = this.f10085e.m11058c(1);
        this.f10090j = cArrM11058c;
        return cArrM11058c;
    }

    /* JADX INFO: renamed from: f */
    public char[] m10979f(int i11) {
        m10974a(this.f10091k);
        char[] cArrM11059d = this.f10085e.m11059d(3, i11);
        this.f10091k = cArrM11059d;
        return cArrM11059d;
    }

    /* JADX INFO: renamed from: g */
    public byte[] m10980g() {
        m10974a(this.f10086f);
        byte[] bArrM11056a = this.f10085e.m11056a(0);
        this.f10086f = bArrM11056a;
        return bArrM11056a;
    }

    /* JADX INFO: renamed from: h */
    public char[] m10981h() {
        m10974a(this.f10089i);
        char[] cArrM11058c = this.f10085e.m11058c(0);
        this.f10089i = cArrM11058c;
        return cArrM11058c;
    }

    /* JADX INFO: renamed from: i */
    public char[] m10982i(int i11) {
        m10974a(this.f10089i);
        char[] cArrM11059d = this.f10085e.m11059d(0, i11);
        this.f10089i = cArrM11059d;
        return cArrM11059d;
    }

    /* JADX INFO: renamed from: j */
    public byte[] m10983j() {
        m10974a(this.f10087g);
        byte[] bArrM11056a = this.f10085e.m11056a(1);
        this.f10087g = bArrM11056a;
        return bArrM11056a;
    }

    /* JADX INFO: renamed from: k */
    public C6330i m10984k() {
        return new C6330i(this.f10085e);
    }

    /* JADX INFO: renamed from: l */
    public ContentReference m10985l() {
        return this.f10081a;
    }

    /* JADX INFO: renamed from: m */
    public JsonEncoding m10986m() {
        return this.f10083c;
    }

    /* JADX INFO: renamed from: n */
    public boolean m10987n() {
        return this.f10084d;
    }

    /* JADX INFO: renamed from: o */
    public void m10988o(byte[] bArr) {
        if (bArr != null) {
            m10975b(bArr, this.f10088h);
            this.f10088h = null;
            this.f10085e.m11064i(3, bArr);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m10989p(char[] cArr) {
        if (cArr != null) {
            m10976c(cArr, this.f10090j);
            this.f10090j = null;
            this.f10085e.m11065j(1, cArr);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m10990q(char[] cArr) {
        if (cArr != null) {
            m10976c(cArr, this.f10091k);
            this.f10091k = null;
            this.f10085e.m11065j(3, cArr);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m10991r(byte[] bArr) {
        if (bArr != null) {
            m10975b(bArr, this.f10086f);
            this.f10086f = null;
            this.f10085e.m11064i(0, bArr);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10992s(char[] cArr) {
        if (cArr != null) {
            m10976c(cArr, this.f10089i);
            this.f10089i = null;
            this.f10085e.m11065j(0, cArr);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m10993t(byte[] bArr) {
        if (bArr != null) {
            m10975b(bArr, this.f10087g);
            this.f10087g = null;
            this.f10085e.m11064i(1, bArr);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m10994u(JsonEncoding jsonEncoding) {
        this.f10083c = jsonEncoding;
    }

    /* JADX INFO: renamed from: v */
    public final IllegalArgumentException m10995v() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    public C6310d(C6322a c6322a, ContentReference contentReference, boolean z11) {
        this.f10085e = c6322a;
        this.f10081a = contentReference;
        this.f10082b = contentReference.getRawContent();
        this.f10084d = z11;
    }
}
