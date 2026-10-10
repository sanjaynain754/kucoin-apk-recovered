package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.fc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33649fc {

    /* JADX INFO: renamed from: f */
    public static final String f69884f = "max_pss_";

    /* JADX INFO: renamed from: g */
    public static final String f69885g = "max_vss_";

    /* JADX INFO: renamed from: h */
    public static final String f69886h = "max_java_heap_";

    /* JADX INFO: renamed from: a */
    public final String f69887a;

    /* JADX INFO: renamed from: b */
    public final String f69888b;

    /* JADX INFO: renamed from: c */
    public long f69889c;

    /* JADX INFO: renamed from: d */
    public long f69890d;

    /* JADX INFO: renamed from: e */
    public long f69891e;

    public C33649fc(String str, String str2) {
        this.f69889c = 0L;
        this.f69890d = 0L;
        this.f69891e = 0L;
        this.f69887a = str;
        this.f69888b = str2;
    }

    /* JADX INFO: renamed from: a */
    public long m73046a() {
        return this.f69891e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33649fc)) {
            return false;
        }
        C33649fc c33649fc = (C33649fc) obj;
        return this.f69889c == c33649fc.f69889c && this.f69890d == c33649fc.f69890d && this.f69891e == c33649fc.f69891e && TextUtils.equals(this.f69887a, c33649fc.f69887a) && TextUtils.equals(this.f69888b, c33649fc.f69888b);
    }

    /* JADX INFO: renamed from: a */
    public void m73047a(long j11, long j12, long j13) {
        this.f69889c = j11;
        this.f69890d = j12;
        this.f69891e = j13;
    }

    /* JADX INFO: renamed from: b */
    public final String m73052b() {
        return this.f69887a + f69886h + this.f69888b;
    }

    /* JADX INFO: renamed from: c */
    public long m73053c() {
        return this.f69889c;
    }

    /* JADX INFO: renamed from: d */
    public final String m73054d() {
        return this.f69887a + f69884f + this.f69888b;
    }

    /* JADX INFO: renamed from: e */
    public long m73055e() {
        return this.f69890d;
    }

    /* JADX INFO: renamed from: f */
    public final String m73056f() {
        return this.f69887a + f69885g + this.f69888b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m73057g() {
        return this.f69889c > 0 && this.f69890d > 0 && this.f69891e > 0;
    }

    /* JADX INFO: renamed from: a */
    public void m73048a(SharedPreferences.Editor editor) {
        editor.putLong(m73054d(), this.f69889c);
        editor.putLong(m73056f(), this.f69890d);
        editor.putLong(m73052b(), this.f69891e);
    }

    public C33649fc(C33649fc c33649fc) {
        this.f69889c = 0L;
        this.f69890d = 0L;
        this.f69891e = 0L;
        this.f69887a = c33649fc.f69887a;
        this.f69888b = c33649fc.f69888b;
        this.f69889c = c33649fc.f69889c;
        this.f69890d = c33649fc.f69890d;
        this.f69891e = c33649fc.f69891e;
    }

    /* JADX INFO: renamed from: a */
    public void m73050a(SharedPreferences sharedPreferences) {
        this.f69889c = sharedPreferences.getLong(m73054d(), 0L);
        this.f69890d = sharedPreferences.getLong(m73056f(), 0L);
        this.f69891e = sharedPreferences.getLong(m73052b(), 0L);
    }

    /* JADX INFO: renamed from: a */
    public void m73049a(SharedPreferences.Editor editor, long j11, long j12, long j13) {
        if (j11 > this.f69889c) {
            this.f69889c = j11;
            editor.putLong(m73054d(), this.f69889c);
        }
        if (j12 > this.f69890d) {
            this.f69890d = j12;
            editor.putLong(m73056f(), this.f69890d);
        }
        if (j13 > this.f69891e) {
            this.f69891e = j13;
            editor.putLong(m73052b(), this.f69891e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73051a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(C34025xh.m75464a(new StringBuilder(), this.f69887a, "pss"), this.f69889c);
        jSONObject.put(C34025xh.m75464a(new StringBuilder(), this.f69887a, "vss"), this.f69890d);
        jSONObject.put(C34025xh.m75464a(new StringBuilder(), this.f69887a, "java_heap"), this.f69891e);
    }
}
