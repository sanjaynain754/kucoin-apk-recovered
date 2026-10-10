package com.forter.mobile.fortersdk;

import android.text.TextUtils;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.k3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6564k3 implements InterfaceC6614u3 {

    /* JADX INFO: renamed from: a */
    public long f10990a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f10991b;

    public C6564k3() {
        this(System.currentTimeMillis());
    }

    public C6564k3(long j11) {
        this(j11, new JSONObject());
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            return new JSONObject(this.f10991b.toString());
        } catch (JSONException e11) {
            C6514b.m12151b().m12159g(String.format("Failed converting to JSON event %s", "app/files"), e11.toString());
            return null;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/files";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f10990a;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/files");
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12417f() {
        boolean z11;
        C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("app/files");
        if (c6545hArrM12165b == null) {
            return false;
        }
        try {
            for (C6545h c6545h : c6545hArrM12165b) {
                String str = c6545h.f10959a;
                try {
                    JSONArray jSONArray = new JSONArray(c6545h.f10960b);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= jSONArray.length()) {
                            z11 = false;
                            break;
                        }
                        String strOptString = jSONArray.optString(i11, null);
                        if (!TextUtils.isEmpty(strOptString) && new File(strOptString).exists()) {
                            z11 = true;
                            break;
                        }
                        i11++;
                    }
                    this.f10991b.put(str, z11);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            C6514b.m12151b().m12159g(String.format("Failed generating event %s", "app/files"), th2.toString());
        }
        return true;
    }

    public C6564k3(long j11, JSONObject jSONObject) {
        this.f10990a = j11;
        this.f10991b = jSONObject;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6614u3
    /* JADX INFO: renamed from: e */
    public final JSONObject mo12307e() {
        return mo12306d();
    }
}
