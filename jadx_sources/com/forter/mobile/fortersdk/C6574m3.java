package com.forter.mobile.fortersdk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.m3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6574m3 implements InterfaceC6619v3 {

    /* JADX INFO: renamed from: a */
    public String f10999a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f11000b;

    /* JADX INFO: renamed from: c */
    public final long f11001c;

    /* JADX INFO: renamed from: d */
    public String f11002d;

    /* JADX INFO: renamed from: e */
    public String f11003e;

    /* JADX INFO: renamed from: f */
    public String f11004f;

    /* JADX INFO: renamed from: g */
    public String f11005g;

    public C6574m3() {
        this(System.currentTimeMillis());
    }

    public C6574m3(long j11) {
        this(j11, new JSONObject());
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            C6540g c6540gM12164a = AbstractC6515b0.m12164a(String.format("%s%s", "nav/", this.f10999a));
            C6535f c6535f = new C6535f(c6540gM12164a);
            if (c6540gM12164a != null && c6540gM12164a.m12293a()) {
                return this.f11000b;
            }
            if (c6535f.m12248a("pageTitle")) {
                this.f11000b.put("pageTitle", this.f11002d);
            }
            if (c6535f.m12248a("pageID")) {
                this.f11000b.put("pageID", this.f11003e);
            }
            if (c6535f.m12248a("pageCategory")) {
                this.f11000b.put("pageCategory", this.f11004f);
            }
            if (c6535f.m12248a("other")) {
                this.f11000b.put("other", this.f11005g);
            }
            return this.f11000b;
        } catch (Exception unused) {
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "nav/";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f11001c;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "nav/" + this.f10999a);
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    public C6574m3(long j11, JSONObject jSONObject) {
        this.f10999a = null;
        this.f11001c = j11;
        this.f11000b = jSONObject;
    }
}
