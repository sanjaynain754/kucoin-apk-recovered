package com.forter.mobile.fortersdk;

import org.json.JSONArray;
import org.json.JSONObject;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C6510ae {

    /* JADX INFO: renamed from: a */
    public C44699a f10832a;

    /* JADX INFO: renamed from: b */
    public C44699a f10833b;

    /* JADX INFO: renamed from: c */
    public int f10834c;

    /* JADX INFO: renamed from: d */
    public JSONArray f10835d;

    /* JADX INFO: renamed from: e */
    public boolean f10836e;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.ae$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final int f10837a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f10838b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f10839c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f10840d = 4;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f10841e = {1, 2, 3, 4};
    }

    public C6510ae() {
        this.f10832a = null;
        this.f10833b = null;
        this.f10834c = a.f10840d;
        this.f10835d = null;
        this.f10836e = false;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C44699a m12134b() {
        if (this.f10836e) {
            return this.f10832a;
        }
        C44699a c44699a = this.f10832a;
        if (c44699a != null && this.f10833b == null) {
            this.f10833b = AbstractC6518b3.m12170d(c44699a, this.f10835d);
            this.f10832a = null;
        }
        return this.f10833b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m12135c(C44699a c44699a) {
        this.f10833b = null;
        this.f10832a = c44699a;
    }

    public C6510ae(String str) {
        this.f10832a = null;
        this.f10833b = null;
        this.f10834c = a.f10840d;
        this.f10835d = null;
        this.f10836e = false;
        try {
            this.f10835d = new JSONArray(str);
            C6540g c6540gM12133a = m12133a("globalConfiguration");
            this.f10834c = c6540gM12133a == null ? a.f10839c : AbstractC6518b3.m12172f(c6540gM12133a.f10953c) ? a.f10837a : a.f10838b;
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C6540g m12133a(String str) {
        JSONObject jSONObjectM12169c;
        JSONArray jSONArray = this.f10835d;
        if (jSONArray == null || (jSONObjectM12169c = AbstractC6518b3.m12169c(jSONArray, str)) == null) {
            return null;
        }
        return new C6540g(jSONObjectM12169c);
    }
}
