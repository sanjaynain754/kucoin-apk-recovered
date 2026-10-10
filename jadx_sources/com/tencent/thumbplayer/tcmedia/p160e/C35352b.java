package com.tencent.thumbplayer.tcmedia.p160e;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.e.b */
/* JADX INFO: loaded from: classes64.dex */
public class C35352b {

    /* JADX INFO: renamed from: a */
    private String f76016a;

    /* JADX INFO: renamed from: b */
    private String f76017b;

    /* JADX INFO: renamed from: c */
    private String f76018c;

    /* JADX INFO: renamed from: d */
    private String f76019d;

    /* JADX INFO: renamed from: e */
    private String f76020e;

    public C35352b(C35352b c35352b, String str) {
        this.f76016a = "";
        this.f76017b = "";
        this.f76018c = "";
        this.f76019d = "";
        this.f76020e = "TPLogger";
        m78146a(c35352b, str);
    }

    /* JADX INFO: renamed from: a */
    public String m78145a() {
        return this.f76020e;
    }

    public C35352b(String str) {
        this(str, "", "", "");
    }

    /* JADX INFO: renamed from: b */
    private void m78144b() {
        this.f76020e = this.f76016a;
        if (!TextUtils.isEmpty(this.f76017b)) {
            this.f76020e += "_C" + this.f76017b;
        }
        if (!TextUtils.isEmpty(this.f76018c)) {
            this.f76020e += "_T" + this.f76018c;
        }
        if (TextUtils.isEmpty(this.f76019d)) {
            return;
        }
        this.f76020e += "_" + this.f76019d;
    }

    /* JADX INFO: renamed from: a */
    public void m78146a(C35352b c35352b, String str) {
        String str2;
        if (c35352b != null) {
            this.f76016a = c35352b.f76016a;
            this.f76017b = c35352b.f76017b;
            str2 = c35352b.f76018c;
        } else {
            str2 = "";
            this.f76016a = "";
            this.f76017b = "";
        }
        this.f76018c = str2;
        this.f76019d = str;
        m78144b();
    }

    public String toString() {
        return "TPLoggerContext{prefix='" + this.f76016a + "', classId='" + this.f76017b + "', taskId='" + this.f76018c + "', model='" + this.f76019d + "', tag='" + this.f76020e + "'}";
    }

    public C35352b(String str, String str2, String str3, String str4) {
        this.f76020e = "TPLogger";
        this.f76016a = str;
        this.f76017b = str2;
        this.f76018c = str3;
        this.f76019d = str4;
        m78144b();
    }

    /* JADX INFO: renamed from: a */
    public void m78147a(String str) {
        this.f76018c = str;
        m78144b();
    }
}
