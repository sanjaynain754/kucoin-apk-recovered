package com.forter.mobile.fortersdk;

import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.j3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6559j3 implements InterfaceC6619v3 {

    /* JADX INFO: renamed from: a */
    public long f10984a;

    /* JADX INFO: renamed from: b */
    public String f10985b;

    /* JADX INFO: renamed from: c */
    public String f10986c;

    public C6559j3(long j11, String str, String str2) {
        this.f10984a = j11;
        this.f10985b = str;
        this.f10986c = str2;
    }

    public C6559j3(String str, String str2) {
        this(System.currentTimeMillis(), str, str2);
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        JSONObject jSONObject = new JSONObject();
        try {
            C6540g c6540gM12164a = AbstractC6515b0.m12164a(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            C6535f c6535f = new C6535f(c6540gM12164a);
            if (c6540gM12164a == null || !c6540gM12164a.m12293a()) {
                if (c6535f.m12248a("msg")) {
                    jSONObject.put("msg", this.f10985b);
                }
                if (c6535f.m12248a("data")) {
                    jSONObject.put("data", this.f10986c);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return Constants.IPC_BUNDLE_KEY_SEND_ERROR;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f10984a;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }
}
