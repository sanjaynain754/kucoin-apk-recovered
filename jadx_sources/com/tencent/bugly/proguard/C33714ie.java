package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ie */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33714ie implements InterfaceC33877q9 {

    /* JADX INFO: renamed from: o */
    public static final C33714ie f70270o = new C33714ie();

    /* JADX INFO: renamed from: c */
    public final b f70271c = new b();

    /* JADX INFO: renamed from: d */
    public String f70272d = null;

    /* JADX INFO: renamed from: e */
    public String f70273e = null;

    /* JADX INFO: renamed from: f */
    public String f70274f = null;

    /* JADX INFO: renamed from: g */
    public String f70275g = null;

    /* JADX INFO: renamed from: h */
    public String f70276h = null;

    /* JADX INFO: renamed from: i */
    public String f70277i = null;

    /* JADX INFO: renamed from: j */
    public String f70278j = null;

    /* JADX INFO: renamed from: k */
    public String[] f70279k = null;

    /* JADX INFO: renamed from: l */
    public int f70280l = -1;

    /* JADX INFO: renamed from: m */
    public Boolean f70281m = null;

    /* JADX INFO: renamed from: n */
    public InterfaceC33877q9 f70282n = new C33735je();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ie$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f70283a;

        public b() {
            this.f70283a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC33877q9 m73407a(Context context) {
        if (context != null && C33598d3.m72772c() == null) {
            C33598d3.m72770a(context);
        }
        return new C33735je();
    }

    /* JADX INFO: renamed from: b */
    public void m73414b(String str) {
        this.f70271c.f70283a = str;
        this.f70274f = str;
    }

    /* JADX INFO: renamed from: l */
    public void m73423l() {
        this.f70272d = null;
        this.f70273e = null;
        this.f70274f = this.f70271c.f70283a;
        this.f70275g = null;
        this.f70276h = null;
        this.f70277i = null;
        this.f70278j = null;
        this.f70279k = null;
        this.f70280l = -1;
        this.f70281m = null;
    }

    /* JADX INFO: renamed from: k */
    public static C33714ie m73408k() {
        return f70270o;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: c */
    public int mo73415c() {
        if (this.f70280l == -1) {
            this.f70280l = this.f70282n.mo73415c();
        }
        return this.f70280l;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: d */
    public String mo73416d() {
        if (!TextUtils.isEmpty(this.f70271c.f70283a)) {
            this.f70274f = this.f70271c.f70283a;
        }
        if (TextUtils.isEmpty(this.f70274f)) {
            String strMo73416d = this.f70282n.mo73416d();
            if (strMo73416d == null) {
                strMo73416d = "";
            }
            this.f70274f = strMo73416d;
        }
        String str = this.f70274f;
        return str == null ? "" : str;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: e */
    public String[] mo73417e() {
        if (this.f70279k == null) {
            this.f70279k = this.f70282n.mo73417e();
        }
        String[] strArr = this.f70279k;
        return strArr == null ? InterfaceC33877q9.f71548a : strArr;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: f */
    public String mo73418f() {
        if (this.f70275g == null) {
            String strMo73418f = this.f70282n.mo73418f();
            if (strMo73418f == null) {
                strMo73418f = "";
            }
            this.f70275g = strMo73418f;
        }
        String str = this.f70275g;
        return str == null ? "" : str;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: g */
    public String mo73419g() {
        if (this.f70273e == null) {
            String strMo73419g = this.f70282n.mo73419g();
            if (strMo73419g == null) {
                strMo73419g = "";
            }
            this.f70273e = strMo73419g;
        }
        String str = this.f70273e;
        return str == null ? "" : str;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: h */
    public String mo73420h() {
        if (this.f70277i == null) {
            String strMo73420h = this.f70282n.mo73420h();
            if (strMo73420h == null) {
                strMo73420h = "";
            }
            this.f70277i = strMo73420h;
        }
        String str = this.f70277i;
        return str == null ? "" : str;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: i */
    public boolean mo73421i() {
        if (this.f70281m == null) {
            this.f70281m = Boolean.valueOf(this.f70282n.mo73421i());
        }
        return this.f70281m.booleanValue();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: j */
    public String mo73422j() {
        if (this.f70276h == null) {
            String strMo73422j = this.f70282n.mo73422j();
            if (strMo73422j == null) {
                strMo73422j = "";
            }
            this.f70276h = strMo73422j;
        }
        String str = this.f70276h;
        return str == null ? "" : str;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: b */
    public String mo73413b() {
        if (this.f70272d == null) {
            String strMo73413b = this.f70282n.mo73413b();
            if (strMo73413b == null) {
                strMo73413b = "";
            }
            this.f70272d = strMo73413b;
        }
        String str = this.f70272d;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public void m73411a(InterfaceC33877q9 interfaceC33877q9) {
        if (interfaceC33877q9 != null) {
            this.f70282n = interfaceC33877q9;
        }
        m73423l();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33877q9
    /* JADX INFO: renamed from: a */
    public String mo73409a() {
        if (this.f70278j == null) {
            String strMo73409a = this.f70282n.mo73409a();
            if (strMo73409a == null) {
                strMo73409a = "";
            }
            this.f70278j = strMo73409a;
        }
        String str = this.f70278j;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public final String[] m73412a(String[] strArr) {
        return strArr == null ? InterfaceC33877q9.f71548a : strArr;
    }

    /* JADX INFO: renamed from: a */
    public final String m73410a(String str) {
        return str == null ? "" : str;
    }
}
