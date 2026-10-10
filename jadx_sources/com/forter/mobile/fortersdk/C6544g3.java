package com.forter.mobile.fortersdk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6544g3 implements InterfaceC6614u3 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f10957a;

    /* JADX INFO: renamed from: b */
    public long f10958b;

    public C6544g3() {
        this(System.currentTimeMillis());
    }

    public C6544g3(long j11) {
        this(j11, new JSONObject());
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            return new JSONObject(this.f10957a.toString());
        } catch (JSONException e11) {
            C6514b.m12151b().m12159g(String.format("Failed converting to JSON event %s", "app/active"), e11.toString());
            return null;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/active";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f10958b;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/active");
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    public C6544g3(long j11, JSONObject jSONObject) {
        this.f10958b = j11;
        this.f10957a = jSONObject;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6614u3
    /* JADX INFO: renamed from: e */
    public final JSONObject mo12307e() {
        JSONObject jSONObjectMo12303a = mo12303a();
        jSONObjectMo12303a.remove("networkType");
        jSONObjectMo12303a.remove("deviceUptime");
        jSONObjectMo12303a.remove("deviceSleepTime");
        jSONObjectMo12303a.remove("deviceFirstBoot");
        jSONObjectMo12303a.remove("userFormatLocalTime");
        jSONObjectMo12303a.remove("normalizedLocalTime");
        jSONObjectMo12303a.remove("displayResolution");
        jSONObjectMo12303a.remove("availableStorageCapacity");
        jSONObjectMo12303a.remove("availableExtStorageCapacity");
        jSONObjectMo12303a.remove("availableSystemCapacity");
        jSONObjectMo12303a.remove("isFirstRun");
        jSONObjectMo12303a.remove("bat");
        return jSONObjectMo12303a;
    }
}
