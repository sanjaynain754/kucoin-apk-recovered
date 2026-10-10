package com.forter.mobile.fortersdk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.p3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6589p3 implements InterfaceC6614u3 {

    /* JADX INFO: renamed from: a */
    public final long f11040a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f11041b;

    public C6589p3(long j11) {
        this(j11, new JSONObject());
    }

    public C6589p3(long j11, JSONObject jSONObject) {
        this.f11040a = j11;
        this.f11041b = jSONObject;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            return new JSONObject(this.f11041b.toString());
        } catch (JSONException e11) {
            C6514b.m12151b().m12159g(String.format("Failed converting to JSON event %s", "app/network"), e11.toString());
            return null;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/network";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f11040a;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/network");
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6614u3
    /* JADX INFO: renamed from: e */
    public final JSONObject mo12307e() {
        return mo12303a();
    }
}
