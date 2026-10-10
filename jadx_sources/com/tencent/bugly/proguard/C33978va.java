package com.tencent.bugly.proguard;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.va */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33978va {

    /* JADX INFO: renamed from: h */
    public static final String f72339h = ".";

    /* JADX INFO: renamed from: i */
    public static final long f72340i = 3600;

    /* JADX INFO: renamed from: j */
    public static final long f72341j = 60;

    /* JADX INFO: renamed from: a */
    public String f72342a = "";

    /* JADX INFO: renamed from: b */
    public String f72343b = "";

    /* JADX INFO: renamed from: c */
    public String f72344c = "";

    /* JADX INFO: renamed from: d */
    public String f72345d = "";

    /* JADX INFO: renamed from: e */
    public String f72346e = "";

    /* JADX INFO: renamed from: f */
    public long f72347f = 0;

    /* JADX INFO: renamed from: g */
    public long f72348g = 0;

    /* JADX INFO: renamed from: a */
    public static C33978va m75292a(JSONObject jSONObject) {
        C33978va c33978va = new C33978va();
        try {
            c33978va.f72342a = jSONObject.optString(C33820nf.f71149e);
            c33978va.f72343b = jSONObject.optString(C33820nf.f71150f);
            c33978va.f72344c = jSONObject.optString("launch_id");
            c33978va.f72345d = jSONObject.optString("process_launch_id");
            c33978va.f72346e = jSONObject.optString(C33820nf.f71156l);
            c33978va.f72347f = jSONObject.optLong("event_time");
            c33978va.f72348g = jSONObject.optLong(C33820nf.f71148d);
            return c33978va;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C33978va c33978va = (C33978va) obj;
            if (TextUtils.equals(this.f72342a, c33978va.f72342a) && TextUtils.equals(this.f72343b, c33978va.f72343b) && TextUtils.equals(this.f72344c, c33978va.f72344c) && TextUtils.equals(this.f72345d, c33978va.f72345d) && TextUtils.equals(this.f72346e, c33978va.f72346e) && this.f72347f == c33978va.f72347f && this.f72348g == c33978va.f72348g) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m75295b() {
        return TextUtils.isEmpty(this.f72342a) || TextUtils.isEmpty(this.f72343b) || TextUtils.isEmpty(this.f72344c) || TextUtils.isEmpty(this.f72345d) || this.f72347f == 0 || this.f72348g == 0;
    }

    public int hashCode() {
        String str = this.f72342a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f72343b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f72344c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f72345d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f72346e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        long j11 = this.f72347f;
        int i11 = (iHashCode5 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f72348g;
        return i11 + ((int) (j12 ^ (j12 >>> 32)));
    }

    /* JADX INFO: renamed from: a */
    public String m75293a() {
        return this.f72342a + f72339h + this.f72343b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m75294a(C33978va c33978va) {
        if (c33978va == null || c33978va.m75295b() || !TextUtils.equals(this.f72345d, c33978va.f72345d)) {
            return false;
        }
        long j11 = this.f72347f;
        long j12 = c33978va.f72347f;
        return j11 - j12 < f72340i && j12 - j11 < 60;
    }
}
