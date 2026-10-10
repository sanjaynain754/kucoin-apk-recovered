package com.datavisorobfus;

import android.content.Context;
import com.datavisor.vangogh.bridge.crypto;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.p0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5437p0 {

    /* JADX INFO: renamed from: a */
    public String f7341a;

    /* JADX INFO: renamed from: b */
    public String f7342b;

    /* JADX INFO: renamed from: c */
    public JSONArray f7343c;

    /* JADX INFO: renamed from: d */
    public JSONArray f7344d;

    /* JADX INFO: renamed from: e */
    public String f7345e;

    /* JADX INFO: renamed from: f */
    public String f7346f;

    /* JADX INFO: renamed from: g */
    public Throwable f7347g;

    /* JADX INFO: renamed from: h */
    public int f7348h;

    public C5437p0() {
        this.f7341a = "";
        this.f7342b = "";
        this.f7343c = new JSONArray();
        this.f7344d = new JSONArray();
        this.f7345e = "";
        this.f7346f = "";
        this.f7347g = null;
        this.f7348h = 0;
    }

    /* JADX INFO: renamed from: a */
    private String m7254a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(crypto.convert("H6i37Q=="), this.f7341a);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private String m7257b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(crypto.convert("H6i37Q=="), this.f7341a);
            jSONObject.put(crypto.convert("H6iqxnPZqQ=="), this.f7342b);
            jSONObject.put(crypto.convert("H6i9/Q=="), this.f7345e);
            JSONArray jSONArray = this.f7343c;
            if (jSONArray != null && jSONArray.length() != 0) {
                jSONObject.put(crypto.convert("H6iu233oqMsKXoc="), this.f7343c);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static C5437p0 m7259c(Context context, String str) {
        C5437p0 c5437p0 = new C5437p0();
        try {
            String strM7399a = C5445t0.m7399a(context, str);
            if (C5457z0.m7482b(strM7399a)) {
                c5437p0.m7255a(new JSONObject(strM7399a));
                return c5437p0;
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
        return c5437p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    public C5437p0(Context context, C5443s0 c5443s0) {
        int i11;
        this.f7341a = "";
        this.f7342b = "";
        this.f7343c = new JSONArray();
        this.f7344d = new JSONArray();
        this.f7345e = "";
        this.f7346f = "";
        this.f7347g = null;
        this.f7348h = 0;
        try {
            if (c5443s0 == 0) {
                this.f7348h = 10;
                return;
            }
            int i12 = c5443s0.f7383c;
            this.f7348h = i12;
            this.f7347g = c5443s0.f7386f;
            if (i12 != 0) {
                return;
            }
            try {
                c5443s0 = (!c5443s0.f7381a.containsKey("cv") || c5443s0.f7381a.get("cv").isEmpty() || c5443s0.f7381a.get("cv").get(0).equals("0")) ? c5443s0.f7382b : crypto.decryptV(c5443s0.f7382b);
            } catch (Throwable unused) {
                c5443s0 = c5443s0.f7382b;
            }
            if (c5443s0 == 0) {
                i11 = 3;
            } else {
                JSONObject jSONObject = new JSONObject(new String(c5443s0));
                if (jSONObject.has(crypto.convert("PoyM9nvTo8U=")) && jSONObject.getInt(crypto.convert("PoyM9nvTo8U=")) != 0) {
                    i11 = jSONObject.getInt(crypto.convert("PoyM9nvTo8U="));
                } else {
                    if (jSONObject.has(crypto.convert("MpCYxg=="))) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(crypto.convert("MpCYxg=="));
                        if (jSONObject2 == null) {
                            return;
                        }
                        m7255a(jSONObject2);
                        m7260c(jSONObject2, context);
                        float f11 = 1.0f;
                        if (jSONObject.has(crypto.convert("H6iz6A=="))) {
                            try {
                                f11 = Float.parseFloat(jSONObject.getString(crypto.convert("H6iz6A==")));
                            } catch (Throwable unused2) {
                            }
                        }
                        C5447u0.m7407a(context, "DVSPDVMA", System.currentTimeMillis() + Math.min(Math.max((long) (f11 * 8.64E7f), 600000L), 864000000L));
                        if (jSONObject.has(crypto.convert("H6i67A=="))) {
                            try {
                                C5447u0.m7411b(context, "DVSPDVDE", jSONObject.getJSONArray(crypto.convert("H6i67A==")).toString());
                            } catch (Throwable unused3) {
                            }
                        } else if (C5447u0.m7409a(context, "DVSPDVDE")) {
                            C5447u0.m7412b(context, "DVSPDVDE");
                        }
                        if (jSONObject.has(crypto.convert("H6i67Ef/le8hZLVc"))) {
                            try {
                                C5447u0.m7411b(context, "DVSPCRONDE", jSONObject.getJSONArray(crypto.convert("H6i67Ef/le8hZLVc")).toString());
                            } catch (Throwable unused4) {
                            }
                        } else if (C5447u0.m7409a(context, "DVSPCRONDE")) {
                            C5447u0.m7412b(context, "DVSPCRONDE");
                        }
                        m7256a(jSONObject, context);
                        m7258b(jSONObject, context);
                        if (jSONObject.has("UT")) {
                            try {
                                this.f7346f = jSONObject.getString("UT");
                                return;
                            } catch (Throwable th2) {
                                C5415f0.m7139a(th2);
                                return;
                            }
                        }
                        return;
                    }
                    i11 = 4;
                }
            }
            this.f7348h = i11;
        } catch (Throwable unused5) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7260c(JSONObject jSONObject, Context context) {
        long jOptLong;
        if (jSONObject != null) {
            try {
                jOptLong = jSONObject.optLong(crypto.convert("H6iq/VQ="), 0L);
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
                return;
            }
        } else {
            jOptLong = 0;
        }
        C5447u0.m7407a(context, "DVSPDVTTL", (System.currentTimeMillis() / 1000) + (jOptLong > 0 ? Math.max(jOptLong - 10800, 86400L) : 315360000L));
    }

    /* JADX INFO: renamed from: a */
    public void m7261a(Context context, String str) {
        try {
            String strM7254a = m7254a();
            if (C5457z0.m7480a(strM7254a)) {
                return;
            }
            C5445t0.m7400a(context, str, strM7254a);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7262b(Context context, String str) {
        try {
            String strM7257b = m7257b();
            if (C5457z0.m7480a(strM7257b)) {
                return;
            }
            C5447u0.m7408a(context, str, strM7257b);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    public C5437p0(Context context, String str) {
        this.f7341a = "";
        this.f7342b = "";
        this.f7343c = new JSONArray();
        this.f7344d = new JSONArray();
        this.f7345e = "";
        this.f7346f = "";
        this.f7347g = null;
        this.f7348h = 0;
        try {
            String strM7417f = C5447u0.m7417f(context, str);
            if (C5457z0.m7482b(strM7417f)) {
                m7255a(new JSONObject(strM7417f));
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7255a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has(crypto.convert("H6i37Q=="))) {
                this.f7341a = jSONObject.getString(crypto.convert("H6i37Q=="));
            }
            if (jSONObject.has(crypto.convert("H6iqxnPZqQ=="))) {
                this.f7342b = jSONObject.getString(crypto.convert("H6iqxnPZqQ=="));
            }
            if (jSONObject.has(crypto.convert("H6i9/Q=="))) {
                this.f7345e = jSONObject.getString(crypto.convert("H6i9/Q=="));
            }
            if (jSONObject.has(crypto.convert("H6iu233oqMsKXoc="))) {
                this.f7343c = jSONObject.getJSONArray(crypto.convert("H6iu233oqMsKXoc="));
            }
            this.f7344d = new JSONArray();
            JSONArray jSONArray = this.f7343c;
            if (jSONArray == null || jSONArray.length() == 0) {
                return;
            }
            for (int i11 = 0; i11 < this.f7343c.length(); i11++) {
                this.f7344d.put(this.f7343c.get(i11));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7258b(JSONObject jSONObject, Context context) {
        if (jSONObject == null || context == null) {
            return;
        }
        try {
            C5447u0.m7413b(context, "DVSPANYCASTFIRST", jSONObject.optBoolean(crypto.convert("H6i/x2H/ptMbdp1sA/s="), true));
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7256a(JSONObject jSONObject, Context context) {
        if (jSONObject == null || context == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(crypto.convert("H6i/x2H/ptMbeaQ="));
            if (jSONArrayOptJSONArray != null) {
                C5447u0.m7411b(context, "SPANYCASTIPS", jSONArrayOptJSONArray.toString());
            } else if (C5447u0.m7409a(context, "SPANYCASTIPS")) {
                C5447u0.m7412b(context, "SPANYCASTIPS");
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(crypto.convert("H6i3+Q=="));
            if (jSONArrayOptJSONArray2 != null) {
                C5447u0.m7411b(context, "SPVANGOGHEIPS", jSONArrayOptJSONArray2.toString());
            } else if (C5447u0.m7409a(context, "SPVANGOGHEIPS")) {
                C5447u0.m7412b(context, "SPVANGOGHEIPS");
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(crypto.convert("H6ik7VHs"));
            if (jSONArrayOptJSONArray3 != null) {
                C5447u0.m7411b(context, "SPZDEIPS", jSONArrayOptJSONArray3.toString());
            } else if (C5447u0.m7409a(context, "SPZDEIPS")) {
                C5447u0.m7412b(context, "SPZDEIPS");
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }
}
