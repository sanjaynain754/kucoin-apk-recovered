package com.forter.mobile.fortersdk;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6540g {

    /* JADX INFO: renamed from: a */
    public String f10951a;

    /* JADX INFO: renamed from: b */
    public String f10952b;

    /* JADX INFO: renamed from: c */
    public String f10953c;

    /* JADX INFO: renamed from: d */
    public C6545h[] f10954d;

    /* JADX INFO: renamed from: a */
    public final boolean m12293a() {
        return !AbstractC6518b3.m12172f(this.f10953c);
    }

    public C6540g(JSONObject jSONObject) {
        this.f10951a = null;
        this.f10952b = null;
        this.f10953c = null;
        this.f10954d = null;
        if (jSONObject == null) {
            return;
        }
        try {
            this.f10951a = jSONObject.getString("featureName");
            this.f10952b = jSONObject.getString("featureType");
            this.f10953c = jSONObject.getString("priority");
            this.f10954d = AbstractC6518b3.m12173g(jSONObject.getJSONObject("keysOverride"));
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }
}
