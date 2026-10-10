package com.forter.mobile.fortersdk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.o3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6584o3 implements InterfaceC6614u3 {

    /* JADX INFO: renamed from: a */
    public long f11026a;

    /* JADX INFO: renamed from: b */
    public JSONObject f11027b;

    public C6584o3() {
        this(System.currentTimeMillis());
    }

    public C6584o3(long j11) {
        this(j11, new JSONObject());
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            return new JSONObject(this.f11027b.toString());
        } catch (JSONException e11) {
            C6514b.m12151b().m12159g(String.format("Failed converting to JSON event %s", "app/network_conf"), e11.toString());
            return null;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/network_conf";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f11026a;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/network_conf");
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    public C6584o3(long j11, JSONObject jSONObject) {
        this.f11026a = j11;
        this.f11027b = jSONObject;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6614u3
    /* JADX INFO: renamed from: e */
    public final JSONObject mo12307e() {
        return mo12303a();
    }
}
