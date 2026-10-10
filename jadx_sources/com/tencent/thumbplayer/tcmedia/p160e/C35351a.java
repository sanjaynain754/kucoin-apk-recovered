package com.tencent.thumbplayer.tcmedia.p160e;

import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.e.a */
/* JADX INFO: loaded from: classes64.dex */
public class C35351a {

    /* JADX INFO: renamed from: a */
    private String f76014a;

    /* JADX INFO: renamed from: b */
    private C35352b f76015b;

    public C35351a(C35352b c35352b) {
        this.f76015b = c35352b;
        this.f76014a = c35352b.m78145a();
    }

    /* JADX INFO: renamed from: a */
    public C35352b m78135a() {
        return this.f76015b;
    }

    /* JADX INFO: renamed from: b */
    public String m78139b() {
        return this.f76015b.m78145a();
    }

    public C35351a(C35352b c35352b, String str) {
        C35352b c35352b2 = new C35352b(c35352b, str);
        this.f76015b = c35352b2;
        this.f76014a = c35352b2.m78145a();
    }

    /* JADX INFO: renamed from: a */
    public void m78136a(C35352b c35352b) {
        if (c35352b == null) {
            this.f76015b = new C35352b(this.f76014a);
        } else {
            this.f76015b = c35352b;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78140b(String str) {
        TPLogUtil.m78796d(this.f76015b.m78145a(), str);
    }

    /* JADX INFO: renamed from: c */
    public void m78141c(String str) {
        TPLogUtil.m78800i(this.f76015b.m78145a(), str);
    }

    /* JADX INFO: renamed from: d */
    public void m78142d(String str) {
        TPLogUtil.m78802w(this.f76015b.m78145a(), str);
    }

    /* JADX INFO: renamed from: e */
    public void m78143e(String str) {
        TPLogUtil.m78797e(this.f76015b.m78145a(), str);
    }

    /* JADX INFO: renamed from: a */
    public void m78137a(Exception exc) {
        TPLogUtil.m78798e(this.f76015b.m78145a(), exc);
    }

    /* JADX INFO: renamed from: a */
    public void m78138a(String str) {
        this.f76015b.m78147a(str);
    }
}
