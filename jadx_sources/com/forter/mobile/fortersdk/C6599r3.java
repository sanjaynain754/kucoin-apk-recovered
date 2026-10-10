package com.forter.mobile.fortersdk;

import com.forter.mobile.fortersdk.models.TrackType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.r3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6599r3 implements InterfaceC6619v3 {

    /* JADX INFO: renamed from: a */
    public long f11050a;

    /* JADX INFO: renamed from: b */
    public TrackType f11051b;

    /* JADX INFO: renamed from: c */
    public String f11052c;

    /* JADX INFO: renamed from: d */
    public JSONObject f11053d;

    public C6599r3(long j11, TrackType trackType) {
        this.f11052c = null;
        this.f11053d = null;
        this.f11050a = j11;
        this.f11051b = trackType;
    }

    public C6599r3(long j11, TrackType trackType, String str) {
        this.f11050a = j11;
        this.f11051b = trackType;
        this.f11052c = str;
        this.f11053d = null;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/track";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f11050a;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/track");
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    public C6599r3(TrackType trackType) {
        this(System.currentTimeMillis(), trackType);
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            C6540g c6540gM12164a = AbstractC6515b0.m12164a("app/track");
            C6535f c6535f = new C6535f(c6540gM12164a);
            if (c6540gM12164a == null || !c6540gM12164a.m12293a()) {
                if (c6535f.m12248a("trackInfo") && (((obj = this.f11053d) != null && this.f11052c == null) || (obj == null && (obj = this.f11052c) != null))) {
                    jSONObject.put("trackInfo", obj);
                }
                if (c6535f.m12248a("trackType")) {
                    jSONObject.put("trackType", this.f11051b);
                }
                if (c6535f.m12248a("unique_ids") && this.f11051b == TrackType.ACCOUNT_ID_ADDED) {
                    jSONObject.put("unique_ids", C6629x3.m12509a());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public C6599r3(TrackType trackType, String str) {
        this(System.currentTimeMillis(), trackType, str);
    }
}
