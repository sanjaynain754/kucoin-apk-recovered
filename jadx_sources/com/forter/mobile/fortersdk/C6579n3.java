package com.forter.mobile.fortersdk;

import android.content.Context;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.n3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6579n3 implements InterfaceC6614u3 {

    /* JADX INFO: renamed from: a */
    public final long f11012a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f11013b;

    public C6579n3() {
        this(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12438b(@NonNull Context context) {
        C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("app/netstat");
        if (c6545hArrM12165b == null) {
            return false;
        }
        try {
            JSONObject jSONObjectM12174h = AbstractC6518b3.m12174h(c6545hArrM12165b, "lps");
            if (jSONObjectM12174h == null) {
                return true;
            }
            this.f11013b.put("lps", C6576n0.m12431b(context, jSONObjectM12174h));
            return true;
        } catch (Throwable th2) {
            C6514b.m12151b().m12159g(String.format("Failed generating event %s", "app/netstat"), th2.toString());
            return true;
        }
    }

    public C6579n3(long j11) {
        this(j11, new JSONObject());
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            return new JSONObject(this.f11013b.toString());
        } catch (JSONException e11) {
            C6514b.m12151b().m12159g(String.format("Failed converting to JSON event %s", "app/netstat"), e11.toString());
            return null;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/netstat";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f11012a;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/netstat");
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    public C6579n3(long j11, JSONObject jSONObject) {
        this.f11012a = j11;
        this.f11013b = jSONObject;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6614u3
    /* JADX INFO: renamed from: e */
    public final JSONObject mo12307e() {
        return mo12306d();
    }
}
