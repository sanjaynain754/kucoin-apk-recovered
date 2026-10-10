package com.datavisorobfus;

import android.content.Context;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.bridge.storage;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.y0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5455y0 {

    /* JADX INFO: renamed from: f */
    private static volatile C5455y0 f7410f;

    /* JADX INFO: renamed from: a */
    private Context f7411a;

    /* JADX INFO: renamed from: b */
    public int f7412b;

    /* JADX INFO: renamed from: c */
    private int f7413c;

    /* JADX INFO: renamed from: d */
    private JSONArray f7414d;

    /* JADX INFO: renamed from: e */
    private String f7415e;

    /* JADX INFO: renamed from: com.datavisorobfus.y0$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f7416a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f7417b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f7418c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f7419d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f7420e;

        public a(String str, String str2, String str3, int i11, String str4) {
            this.f7416a = str;
            this.f7417b = str2;
            this.f7418c = str3;
            this.f7419d = i11;
            this.f7420e = str4;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x012f  */
        @Override // java.lang.Runnable
        public void run() {
            C5422i c5422iM7160b;
            try {
                JSONObject jSONObjectM7124e = C5408d.m7124e(C5455y0.this.f7411a);
                JSONObject jSONObject = new JSONObject(jSONObjectM7124e.toString());
                String strOptString = jSONObject.optString("c6", "");
                jSONObject.remove("c6");
                if (C5457z0.m7482b(strOptString)) {
                    jSONObject.put("c6", C5411e.m7132c(strOptString));
                }
                jSONObject.remove("d33");
                jSONObject.remove("d39");
                jSONObject.remove("d40");
                String strM7403a = C5446u.m7403a(jSONObject.toString());
                String strM7416e = C5447u0.m7416e(C5455y0.this.f7411a, "SPLASTUPDATEHASH");
                boolean z11 = true;
                boolean z12 = (C5457z0.m7482b(strM7416e) && C5457z0.m7482b(strM7403a) && C5457z0.m7481a(strM7403a, strM7416e)) ? false : true;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_access_key", this.f7416a);
                jSONObject2.put("origin_token", this.f7417b);
                jSONObject2.put("pre_token", this.f7418c);
                if (this.f7419d != 0 && z12 && C5455y0.this.m7471b()) {
                    jSONObject2.put("update_data", jSONObjectM7124e);
                    if (C5457z0.m7482b(this.f7420e)) {
                        jSONObject2.put("user_session_id", this.f7420e);
                    }
                } else {
                    String strM7167b = C5422i.m7160b().m7167b(C5455y0.this.f7411a);
                    if (!C5457z0.m7482b(this.f7420e) || strM7167b.equals(this.f7420e) || this.f7419d == 0) {
                        jSONObject2 = null;
                    } else {
                        jSONObject2.put("user_session_id", this.f7420e);
                        if (this.f7419d != 0 && z12) {
                            jSONObject2.put("update_data", jSONObjectM7124e);
                        }
                    }
                }
                C5415f0.m7136a("nCurrentIndex is: " + this.f7419d + ", bDataChanged is: " + z12 + ", JSONUpdateData: " + jSONObjectM7124e);
                if (jSONObject2 != null) {
                    C5430m.a aVarM7220a = C5430m.m7220a(jSONObject2.toString(), 0);
                    if (aVarM7220a == null || aVarM7220a.f7317b == null || aVarM7220a.f7316a != 0) {
                        z11 = false;
                    } else {
                        HashMap map = new HashMap();
                        map.put("c", "1");
                        if (C5441r0.m7382a(map, aVarM7220a.f7317b, C5455y0.this.f7411a).f7383c != 0) {
                            z11 = false;
                        }
                    }
                    C5415f0.m7136a("patchDataToServer bUpdateSuccess: " + z11);
                    if ((this.f7419d == 0 || z11) && C5457z0.m7482b(strM7403a) && z12) {
                        C5447u0.m7411b(C5455y0.this.f7411a, "SPLASTUPDATEHASH", strM7403a);
                    }
                    if (!z11) {
                        return;
                    } else {
                        c5422iM7160b = C5422i.m7160b();
                    }
                } else {
                    if (C5457z0.m7482b(strM7403a) && z12) {
                        C5447u0.m7411b(C5455y0.this.f7411a, "SPLASTUPDATEHASH", strM7403a);
                    }
                    c5422iM7160b = C5422i.m7160b();
                }
                c5422iM7160b.m7165a(C5455y0.this.f7411a, this.f7420e);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7473d() {
        try {
            this.f7412b = 0;
            C5437p0 c5437p0 = new C5437p0(this.f7411a, "responsekey");
            if (!C5411e.m7131b(c5437p0.f7341a) || !C5411e.m7131b(c5437p0.f7342b)) {
                C5437p0 c5437p0M7259c = C5437p0.m7259c(this.f7411a, ".__pdvk.sys");
                if (C5411e.m7131b(c5437p0M7259c.f7341a)) {
                    storage.globalSet(crypto.convert("H6i37Q=="), c5437p0M7259c.f7341a, 0);
                    this.f7412b = 2;
                    return;
                }
                return;
            }
            storage.globalSet(crypto.convert("H6i37Q=="), c5437p0.f7341a, 0);
            storage.globalSet(crypto.convert("H6iqxnPZqQ=="), c5437p0.f7342b, 0);
            storage.globalSet(crypto.convert("H6i9/Q=="), c5437p0.f7345e, 0);
            this.f7414d = c5437p0.f7344d;
            this.f7413c = C5447u0.m7414c(this.f7411a, "DVSPPRETOKENINDEX");
            this.f7412b = 1;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7477b(String str) {
        int i11;
        try {
            String strM7162a = C5422i.m7160b().m7162a();
            String strM7475a = m7470a(this.f7411a).m7475a(crypto.convert("H6iqxnPZqQ=="));
            if (!C5457z0.m7482b(strM7162a) || !C5457z0.m7482b(strM7475a) || this.f7414d.length() <= 0 || (i11 = this.f7413c) < 0 || i11 >= this.f7414d.length()) {
                return;
            }
            int i12 = this.f7413c;
            C5426k.m7189a().f7296d.execute(new a(strM7162a, strM7475a, this.f7414d.optString(i12, ""), i12, str));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized JSONObject m7478c(String str) {
        String str2;
        String str3;
        int i11;
        JSONObject jSONObject = new JSONObject();
        try {
            long jM7415d = C5447u0.m7415d(this.f7411a, "DVSPDVTTL");
            if (jM7415d != -1 && System.currentTimeMillis() / 1000 > jM7415d) {
                this.f7415e = "";
                jSONObject.put(C33590cg.f69441k, true);
                jSONObject.put(InterfaceC33826o0.f71244p, "");
                return jSONObject;
            }
            if (this.f7414d.length() <= 0 || (i11 = this.f7413c) < 0 || i11 >= this.f7414d.length()) {
                this.f7415e = "";
                jSONObject.put(C33590cg.f69441k, false);
                str2 = InterfaceC33826o0.f71244p;
                str3 = "";
            } else {
                m7477b(str);
                this.f7415e = this.f7414d.optString(this.f7413c, "");
                int i12 = this.f7413c + 1;
                this.f7413c = i12;
                C5447u0.m7406a(this.f7411a, "DVSPPRETOKENINDEX", i12);
                jSONObject.put(C33590cg.f69441k, false);
                str2 = InterfaceC33826o0.f71244p;
                str3 = this.f7415e;
            }
            jSONObject.put(str2, str3);
            return jSONObject;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5455y0 m7470a(Context context) {
        if (f7410f == null) {
            synchronized (C5455y0.class) {
                try {
                    if (f7410f == null) {
                        f7410f = new C5455y0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7410f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m7471b() {
        if ((C5424j.m7188b(this.f7411a) || C5424j.m7187a(this.f7411a)) && C5447u0.m7409a(this.f7411a, "DVSPDVMA")) {
            long jM7415d = C5447u0.m7415d(this.f7411a, "DVSPDVMA");
            if (jM7415d >= 0 && System.currentTimeMillis() <= jM7415d + 2592000000L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m7479c() {
        return this.f7414d.length() - this.f7413c <= 5;
    }

    private C5455y0(Context context) {
        this.f7411a = null;
        this.f7412b = 0;
        if (context != null) {
            this.f7411a = context;
            this.f7412b = 0;
            this.f7413c = 0;
            this.f7414d = new JSONArray();
            this.f7415e = "";
            m7473d();
            return;
        }
        throw new IllegalArgumentException("StorageManager initialization error: mContext is null.");
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m7474a() {
        if (C5457z0.m7482b(this.f7415e)) {
            return this.f7415e;
        }
        JSONObject jSONObjectM7478c = m7478c("");
        if (jSONObjectM7478c != null) {
            return jSONObjectM7478c.optString(InterfaceC33826o0.f71244p, "");
        }
        C5415f0.m7136a("getPreTokenSync jsonObject is null");
        return "";
    }

    /* JADX INFO: renamed from: a */
    public String m7475a(String str) {
        return storage.globalGet(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m7476a(C5437p0 c5437p0) {
        try {
            if (!C5457z0.m7480a(c5437p0.f7341a)) {
                storage.globalSet(crypto.convert("H6i37Q=="), c5437p0.f7341a, 0);
            }
            if (!C5457z0.m7480a(c5437p0.f7342b)) {
                storage.globalSet(crypto.convert("H6iqxnPZqQ=="), c5437p0.f7342b, 0);
                this.f7414d = c5437p0.f7344d;
                this.f7413c = 0;
                C5447u0.m7406a(this.f7411a, "DVSPPRETOKENINDEX", 0);
            }
            if (!C5457z0.m7480a(c5437p0.f7345e)) {
                storage.globalSet(crypto.convert("H6i9/Q=="), c5437p0.f7345e, 0);
            }
            c5437p0.m7262b(this.f7411a, "responsekey");
            c5437p0.m7261a(this.f7411a, ".__pdvk.sys");
        } catch (Throwable unused) {
        }
    }
}
