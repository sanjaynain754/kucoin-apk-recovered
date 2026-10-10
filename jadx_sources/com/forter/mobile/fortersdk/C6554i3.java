package com.forter.mobile.fortersdk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.i3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6554i3 implements InterfaceC6614u3 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f10969a;

    /* JADX INFO: renamed from: b */
    public final long f10970b;

    public C6554i3() {
        this(System.currentTimeMillis());
    }

    public C6554i3(long j11) {
        this(j11, new JSONObject());
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            return new JSONObject(this.f10969a.toString());
        } catch (JSONException e11) {
            C6514b.m12151b().m12159g(String.format("Failed converting to JSON event %s", "app/display"), e11.toString());
            return null;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/display";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f10970b;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/display");
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    public C6554i3(long j11, JSONObject jSONObject) {
        this.f10970b = j11;
        this.f10969a = jSONObject;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6614u3
    /* JADX INFO: renamed from: e */
    public final JSONObject mo12307e() {
        return mo12306d();
    }
}
