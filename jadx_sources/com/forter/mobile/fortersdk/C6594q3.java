package com.forter.mobile.fortersdk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6594q3 implements InterfaceC6614u3 {

    /* JADX INFO: renamed from: a */
    public final long f11045a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f11046b;

    public C6594q3(long j11) {
        this(j11, new JSONObject());
    }

    public C6594q3(long j11, JSONObject jSONObject) {
        this.f11045a = j11;
        this.f11046b = jSONObject;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            return new JSONObject(this.f11046b.toString());
        } catch (JSONException e11) {
            C6514b.m12151b().m12159g(String.format("Failed converting to JSON event %s", "app/network2"), e11.toString());
            return null;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/network2";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f11045a;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/network2");
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
        JSONObject jSONObjectMo12303a = mo12303a();
        JSONObject jSONObjectOptJSONObject = jSONObjectMo12303a.optJSONObject("wifi");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.remove("freq");
            jSONObjectOptJSONObject.remove("linkSpeed");
            jSONObjectOptJSONObject.remove("signalLevel");
            jSONObjectOptJSONObject.remove("scanResults");
            jSONObjectOptJSONObject.remove("confNets");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("dhcp");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.remove("leaseDur");
            }
        }
        jSONObjectMo12303a.remove("trafficStats");
        return jSONObjectMo12303a;
    }
}
