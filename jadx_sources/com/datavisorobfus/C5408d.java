package com.datavisorobfus;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Base64;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.bridge.storage;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.d */
/* JADX INFO: loaded from: classes34.dex */
public class C5408d {

    /* JADX INFO: renamed from: a */
    private static Map<String, String> f7241a = new TreeMap();

    /* JADX INFO: renamed from: b */
    private static String f7242b = "";

    /* JADX INFO: renamed from: c */
    private static long f7243c = 0;

    /* JADX INFO: renamed from: d */
    public static int f7244d = 0;

    /* JADX INFO: renamed from: a */
    private static String m7117a(Context context) {
        PackageInfo packageInfo;
        try {
            JSONObject jSONObjectM7145a = C5417g.m7143a(context).m7145a(crypto.convert("Oo6OwHbPs8EDXJF6"));
            if (jSONObjectM7145a == null) {
                return "empty";
            }
            JSONArray jSONArray = jSONObjectM7145a.getJSONArray(crypto.convert("K5+dwnnbotM="));
            JSONObject jSONObject = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string = jSONArray.getString(i11);
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(string, 0);
                } catch (Throwable unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(packageInfo.firstInstallTime);
                    jSONArray2.put(packageInfo.lastUpdateTime);
                    jSONObject.put(string, jSONArray2);
                }
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized Map<String, String> m7120b(Context context) {
        HashMap map;
        try {
            long jNanoTime = System.nanoTime();
            map = new HashMap();
            map.put(ICustomDataEditor.STRING_ARRAY_PARAM_6, C5399a.m7098a().m7100b());
            map.put("d14", C5440r.m7286q().m7368v());
            map.put("d15", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
            map.put("d19", C5440r.m7286q().m7330d0(context));
            map.put("d35", C5440r.m7286q().m7302K(context));
            map.put("d36", C5440r.m7286q().m7301J(context));
            map.put("d39", C5440r.m7286q().m7340h(context));
            map.put("d40", C5440r.m7286q().m7343i(context));
            map.put("d61", C5440r.m7286q().m7304M(context));
            map.put(ICustomDataEditor.NUMBER_PARAM_10, C5423i0.m7173c().m7179d());
            String strM7338g0 = C5440r.m7286q().m7338g0(context);
            C5415f0.m7136a("dynamic getWebRTCIP:  " + strM7338g0);
            map.put("d128", strM7338g0);
            map.put("v5", f7244d + "");
            String strGlobalGet = storage.globalGet(crypto.convert("H6ih6lT1gu47b6BRO8on"), 0);
            if (C5457z0.m7482b(strGlobalGet)) {
                map.put("v8", strGlobalGet);
            }
            map.put("d95", "default");
            long jM7415d = C5447u0.m7415d(context, "DVSPLASTREAL120WAITTIME");
            if (jM7415d < 0) {
                map.put("d97", "empty");
            } else {
                map.put("d97", jM7415d + "");
            }
            try {
                String str = "empty";
                String str2 = "empty";
                Map<String, String> mapM7133a = C5412e0.m7133a(context);
                if (mapM7133a != null) {
                    str = mapM7133a.get("dv_latitude");
                    if (C5457z0.m7480a(str)) {
                        str = "empty";
                    }
                    str2 = mapM7133a.get("dv_longitude");
                    if (C5457z0.m7480a(str2)) {
                        str2 = "empty";
                    }
                }
                map.put("d22", str2);
                map.put("d23", str);
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
            map.put("d138", C5440r.m7286q().m7361r(context));
            map.put("d609", C5440r.m7286q().m7307P(context));
            map.put("d80", ((System.nanoTime() - jNanoTime) / 1000000) + "");
        } catch (Throwable th3) {
            throw th3;
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized Map<String, String> m7125f(Context context) {
        if (!C5411e.m7129a(f7241a)) {
            return f7241a;
        }
        long jNanoTime = System.nanoTime();
        f7241a.put("d1", C5440r.m7286q().m7369v(context));
        f7241a.put("d2", C5440r.m7286q().m7373x(context));
        f7241a.put("d3", C5440r.m7286q().m7313V(context));
        f7241a.put("d4", C5440r.m7286q().m7295E(context));
        f7241a.put("d5", C5440r.m7286q().m7348k(context));
        f7241a.put("d6", C5440r.m7286q().m7329d(context));
        f7241a.put("d7", C5440r.m7286q().m7324b());
        f7241a.put("d8", C5440r.m7286q().m7318a());
        f7241a.put("d9", C5440r.m7286q().m7366u());
        f7241a.put("d12", C5440r.m7286q().m7329d(context));
        f7241a.put("d13", C5440r.m7286q().m7353n());
        f7241a.put("d14", C5440r.m7286q().m7368v());
        f7241a.put("d15", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        f7241a.put("d16", C5440r.m7286q().m7328d());
        f7241a.put("d17", C5440r.m7286q().m7316Y(context));
        f7241a.put("d18", C5440r.m7286q().m7314W(context));
        f7241a.put("d20", C5440r.m7286q().m7360r());
        f7241a.put("d24", C5440r.m7286q().m7333e0(context));
        f7241a.put("d25", C5440r.m7286q().m7296F());
        f7241a.put("d26", C5440r.m7286q().m7362s());
        f7241a.put("d27", C5440r.m7286q().m7292D());
        f7241a.put("d28", C5440r.m7286q().m7341h0(context));
        f7241a.put("d29", C5440r.m7286q().m7344i0(context));
        f7241a.put("d30", C5440r.m7286q().m7305N(context));
        f7241a.put("d33", C5440r.m7286q().m7350l(context));
        f7241a.put("d34", C5440r.m7286q().m7331e());
        f7241a.put("d38", C5440r.m7286q().m7294E());
        f7241a.put("d41", C5440r.m7286q().m7355o());
        f7241a.put("d42", C5440r.m7286q().m7347k());
        f7241a.put("d43", C5440r.m7286q().m7351m());
        f7241a.put("d44", C5440r.m7286q().m7319a(context));
        f7241a.put("d46", C5440r.m7286q().m7322a0(context));
        f7241a.put("d47", C5440r.m7286q().m7376z());
        f7241a.put("d48", C5440r.m7286q().m7374y());
        f7241a.put("d49", C5440r.m7286q().m7372x());
        f7241a.put("d50", C5440r.m7286q().m7287A());
        f7241a.put("d51", C5440r.m7286q().m7325b0(context));
        f7241a.put("d52", C5440r.m7286q().m7358p(context));
        f7241a.put("d54", C5440r.m7286q().m7288A(context));
        f7241a.put("d58", C5440r.m7286q().m7290C());
        f7241a.put("d59", C5440r.m7286q().m7371w(context));
        f7241a.put("d60", C5440r.m7286q().m7300I(context));
        f7241a.put("d62", C5440r.m7286q().m7310S(context));
        f7241a.put("d63", C5440r.m7286q().m7311T(context));
        f7241a.put("d64", C5440r.m7286q().m7312U(context));
        f7241a.put("d65", C5440r.m7286q().m7308Q(context));
        f7241a.put("d66", C5440r.m7286q().m7309R(context));
        f7241a.put("d68", C5440r.m7286q().m7332e(context));
        f7241a.put("d71", C5440r.m7286q().m7293D(context));
        f7241a.put("d72", C5440r.m7286q().m7321a(context, "wlan0"));
        f7241a.put("d75", C5440r.m7286q().m7321a(context, "wlan1"));
        f7241a.put("d73", C5440r.m7286q().m7299H(context));
        f7241a.put("d74", C5440r.m7286q().m7298G(context));
        f7241a.put("d76", C5440r.m7286q().m7327c0(context));
        f7241a.put("d77", m7122c(context));
        f7241a.put("d78", C5440r.m7286q().m7356o(context));
        f7241a.put("d83", C5440r.m7286q().m7334f());
        f7241a.put("d84", C5440r.m7286q().m7336g());
        f7241a.put("d85", C5440r.m7286q().m7339h());
        f7241a.put("d86", C5440r.m7286q().m7342i());
        f7241a.put("d87", C5440r.m7286q().m7370w());
        f7241a.put("d88", C5440r.m7286q().m7317Z(context));
        f7241a.put("d90", C5440r.m7286q().m7352m(context));
        f7241a.put("d91", C5440r.m7286q().m7289B(context));
        f7241a.put("d92", C5440r.m7286q().m7367u(context));
        f7241a.put("d93", C5440r.m7286q().m7335f(context));
        f7241a.put("d94", C5440r.m7286q().m7364t());
        f7241a.put("d101", C5440r.m7286q().m7326c(context));
        f7241a.put("d102", C5440r.m7286q().m7297G());
        f7241a.put("d103", C5440r.m7286q().m7306O(context));
        f7241a.put("d104", C5440r.m7286q().m7365t(context));
        f7241a.put("d105", m7117a(context));
        f7241a.put("d106", C5440r.m7286q().m7345j(context));
        f7241a.put("d107", C5440r.m7286q().m7337g(context));
        f7241a.put("d108", C5440r.m7286q().m7291C(context));
        f7241a.put("d109", C5440r.m7286q().m7349l());
        f7241a.put("d129", C5440r.m7286q().m7315X(context));
        f7241a.put("d130", C5440r.m7286q().m7359q(context));
        f7241a.put("d132", C5440r.m7286q().m7320a(context, 2));
        f7241a.put("d134", C5440r.m7286q().m7320a(context, 4));
        f7241a.put("d136", C5440r.m7286q().m7357p());
        f7241a.put("d139", C5440r.m7286q().m7375y(context));
        try {
            JSONObject jSONObjectM7272a = C5439q0.m7263a(context).m7272a(false);
            f7241a.put("c1", jSONObjectM7272a.optString(DbParams.KEY_CHANNEL_RESULT, "0"));
            f7241a.put("c2", jSONObjectM7272a.optString("detailedInfo", "empty"));
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            f7241a.put("c1", "0");
            f7241a.put("c2", "exception");
        }
        try {
            JSONObject jSONObjectM7435a = C5452x.m7427a(context).m7435a(false);
            f7241a.put("c3", jSONObjectM7435a.optString(DbParams.KEY_CHANNEL_RESULT, "0"));
            f7241a.put("c4", jSONObjectM7435a.optString("detailedInfo", "empty"));
        } catch (Throwable th3) {
            C5415f0.m7139a(th3);
            f7241a.put("c3", "0");
            f7241a.put("c4", "exception");
        }
        f7241a.put("c6", C5453x0.m7436a(context).m7453a());
        f7241a.put("c8", C5436p.m7250a(context).m7253c());
        f7241a.put("c9", C5421h0.m7148a(context).m7153a(false));
        f7241a.put("c16", C5440r.m7286q().m7377z(context));
        f7241a.put("c20", C5439q0.m7263a(context).m7273f());
        f7241a.put("c21", C5440r.m7286q().m7303L(context));
        f7241a.put("c22", C5421h0.m7148a(context).m7155d());
        f7241a.put("c23", C5421h0.m7148a(context).m7154c());
        f7241a.put(ICustomDataEditor.STRING_ARRAY_PARAM_1, C5399a.m7098a().m7103d(context));
        f7241a.put(ICustomDataEditor.STRING_ARRAY_PARAM_2, C5399a.m7098a().m7105f(context));
        f7241a.put(ICustomDataEditor.STRING_ARRAY_PARAM_3, C5399a.m7098a().m7104e(context));
        f7241a.put(ICustomDataEditor.STRING_ARRAY_PARAM_6, C5399a.m7098a().m7100b());
        f7241a.put(ICustomDataEditor.STRING_ARRAY_PARAM_8, C5399a.m7098a().m7099a(context));
        f7241a.put(ICustomDataEditor.STRING_ARRAY_PARAM_9, C5399a.m7098a().m7101b(context));
        f7241a.put(ICustomDataEditor.STRING_ARRAY_PARAM_10, C5399a.m7098a().m7102c(context));
        f7241a.put("a17", C5399a.m7098a().m7106g(context));
        f7241a.put(ICustomDataEditor.NUMBER_PARAM_1, C5423i0.m7173c().m7182e(context));
        f7241a.put(ICustomDataEditor.NUMBER_PARAM_2, C5423i0.m7173c().m7184g(context));
        f7241a.put(ICustomDataEditor.NUMBER_PARAM_3, C5423i0.m7173c().m7183f(context));
        f7241a.put(ICustomDataEditor.NUMBER_PARAM_4, C5423i0.m7173c().m7185h(context));
        f7241a.put(ICustomDataEditor.NUMBER_PARAM_9, C5423i0.m7173c().m7186i(context));
        f7241a.put("n11", C5423i0.m7173c().m7174a());
        f7241a.put("n12", C5423i0.m7173c().m7181e());
        f7241a.put("n42", C5423i0.m7173c().m7176b());
        f7241a.put("n43", C5423i0.m7173c().m7177b(context));
        f7241a.put("n44", C5423i0.m7173c().m7175a(context));
        f7241a.put("v1", C5455y0.m7470a(context).m7475a(crypto.convert("H6i37Q==")));
        f7241a.put("v2", C5455y0.m7470a(context).m7475a(crypto.convert("H6iqxnPZqQ==")));
        f7241a.put("v4", C5440r.m7286q().m7354n(context));
        f7241a.put("v6", C5440r.m7286q().m7363s(context));
        f7241a.put("v7", C5455y0.m7470a(context).f7412b + "");
        String strGlobalGet = storage.globalGet(crypto.convert("H6ih6lT1gu47b6BRO8on"), 0);
        if (C5457z0.m7482b(strGlobalGet)) {
            f7241a.put("v8", strGlobalGet);
        }
        m7121b(context, f7241a);
        long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
        f7241a.put("d79", jNanoTime2 + "");
        return f7241a;
    }

    /* JADX INFO: renamed from: a */
    public static void m7118a() {
        f7244d = 0;
        f7241a.clear();
    }

    /* JADX INFO: renamed from: b */
    private static void m7121b(Context context, Map<String, String> map) {
        JSONObject jSONObjectM7145a = C5417g.m7143a(context).m7145a(crypto.convert("PJKRy3nQrcEZUQ=="));
        if (jSONObjectM7145a != null) {
            try {
                JSONObject jSONObject = jSONObjectM7145a.getJSONObject(crypto.convert("K4yR2Ws="));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strM7396c = C5444t.m7396c(jSONObject.getString(next));
                    if (C5457z0.m7480a(strM7396c)) {
                        strM7396c = "empty";
                    }
                    map.put(next, strM7396c);
                }
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
            try {
                JSONObject jSONObject2 = jSONObjectM7145a.getJSONObject(crypto.convert("OJOa"));
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    String strM7393a = C5444t.m7393a(jSONObject2.getString(next2));
                    if (C5457z0.m7480a(strM7393a)) {
                        strM7393a = "empty";
                    }
                    map.put(next2, strM7393a);
                }
            } catch (Throwable th3) {
                C5415f0.m7139a(th3);
            }
            try {
                JSONObject jSONObject3 = jSONObjectM7145a.getJSONObject(crypto.convert("PZeSzGs="));
                Iterator<String> itKeys3 = jSONObject3.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    String strM7398e = C5444t.m7398e(jSONObject3.getString(next3));
                    if (C5457z0.m7480a(strM7398e)) {
                        strM7398e = "empty";
                    }
                    map.put(next3, strM7398e);
                }
            } catch (Throwable th4) {
                C5415f0.m7139a(th4);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m7123d(Context context) {
        try {
            if (C5457z0.m7482b(f7242b) && System.currentTimeMillis() < f7243c + 86400000) {
                return f7242b;
            }
            f7242b = "";
            HashMap map = new HashMap();
            map.put("d1", C5440r.m7286q().m7369v(context));
            map.put("d2", C5440r.m7286q().m7373x(context));
            map.put("d3", C5440r.m7286q().m7313V(context));
            map.put("d4", C5440r.m7286q().m7295E(context));
            map.put("d5", C5440r.m7286q().m7348k(context));
            map.put("d6", C5440r.m7286q().m7329d(context));
            map.put("d7", C5440r.m7286q().m7324b());
            map.put("d8", C5440r.m7286q().m7318a());
            map.put("d9", C5440r.m7286q().m7366u());
            map.put("d13", C5440r.m7286q().m7353n());
            map.put("d14", C5440r.m7286q().m7368v());
            map.put("d15", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
            map.put("d16", C5440r.m7286q().m7328d());
            map.put("d17", C5440r.m7286q().m7316Y(context));
            map.put("d18", C5440r.m7286q().m7314W(context));
            map.put("d20", C5440r.m7286q().m7360r());
            map.put("d24", C5440r.m7286q().m7333e0(context));
            map.put("d28", C5440r.m7286q().m7341h0(context));
            map.put("d29", C5440r.m7286q().m7344i0(context));
            map.put("d30", C5440r.m7286q().m7305N(context));
            map.put("d33", C5440r.m7286q().m7350l(context));
            map.put("d34", C5440r.m7286q().m7331e());
            map.put("d38", C5440r.m7286q().m7294E());
            map.put("d41", C5440r.m7286q().m7355o());
            map.put("d42", C5440r.m7286q().m7347k());
            map.put("d43", C5440r.m7286q().m7351m());
            map.put("d44", C5440r.m7286q().m7319a(context));
            map.put("d46", C5440r.m7286q().m7322a0(context));
            map.put("d47", C5440r.m7286q().m7376z());
            map.put("d48", C5440r.m7286q().m7374y());
            map.put("d49", C5440r.m7286q().m7372x());
            map.put("d50", C5440r.m7286q().m7287A());
            map.put("d51", C5440r.m7286q().m7325b0(context));
            map.put("d52", C5440r.m7286q().m7358p(context));
            map.put("d54", C5440r.m7286q().m7288A(context));
            map.put("d58", C5440r.m7286q().m7290C());
            map.put("d59", C5440r.m7286q().m7371w(context));
            map.put("d60", C5440r.m7286q().m7300I(context));
            map.put("d62", C5440r.m7286q().m7310S(context));
            map.put("d63", C5440r.m7286q().m7311T(context));
            map.put("d64", C5440r.m7286q().m7312U(context));
            map.put("d65", C5440r.m7286q().m7308Q(context));
            map.put("d66", C5440r.m7286q().m7309R(context));
            map.put("d68", C5440r.m7286q().m7332e(context));
            map.put("d71", C5440r.m7286q().m7293D(context));
            map.put("d72", C5440r.m7286q().m7321a(context, "wlan0"));
            map.put("d73", C5440r.m7286q().m7299H(context));
            map.put("d74", C5440r.m7286q().m7298G(context));
            map.put("d75", C5440r.m7286q().m7321a(context, "wlan1"));
            map.put("d76", C5440r.m7286q().m7327c0(context));
            map.put("d78", C5440r.m7286q().m7356o(context));
            map.put("d86", C5440r.m7286q().m7342i());
            map.put("d90", C5440r.m7286q().m7352m(context));
            map.put("d91", C5440r.m7286q().m7289B(context));
            map.put("d92", C5440r.m7286q().m7367u(context));
            map.put("d94", C5440r.m7286q().m7364t());
            map.put("d102", C5440r.m7286q().m7297G());
            map.put("d103", C5440r.m7286q().m7306O(context));
            map.put("d109", C5440r.m7286q().m7349l());
            try {
                map.put("c1", C5439q0.m7263a(context).m7272a(false).optString(DbParams.KEY_CHANNEL_RESULT, "0"));
            } catch (Throwable unused) {
                map.put("c1", "0");
            }
            try {
                map.put("c3", C5452x.m7427a(context).m7435a(false).optString(DbParams.KEY_CHANNEL_RESULT, "0"));
            } catch (Throwable unused2) {
                map.put("c3", "0");
            }
            map.put("c6", C5453x0.m7436a(context).m7453a());
            map.put("c8", C5436p.m7250a(context).m7253c());
            map.put("c9", C5421h0.m7148a(context).m7153a(false));
            map.put("c16", C5440r.m7286q().m7377z(context));
            map.put(ICustomDataEditor.STRING_ARRAY_PARAM_1, C5399a.m7098a().m7103d(context));
            map.put(ICustomDataEditor.STRING_ARRAY_PARAM_2, C5399a.m7098a().m7105f(context));
            map.put(ICustomDataEditor.STRING_ARRAY_PARAM_3, C5399a.m7098a().m7104e(context));
            map.put(ICustomDataEditor.STRING_ARRAY_PARAM_6, C5399a.m7098a().m7100b());
            map.put(ICustomDataEditor.STRING_ARRAY_PARAM_8, C5399a.m7098a().m7099a(context));
            map.put(ICustomDataEditor.STRING_ARRAY_PARAM_9, C5399a.m7098a().m7101b(context));
            map.put(ICustomDataEditor.NUMBER_PARAM_1, C5423i0.m7173c().m7182e(context));
            map.put(ICustomDataEditor.NUMBER_PARAM_2, C5423i0.m7173c().m7184g(context));
            map.put("n11", C5423i0.m7173c().m7174a());
            map.put("n12", C5423i0.m7173c().m7181e());
            map.put("v1", C5455y0.m7470a(context).m7475a(crypto.convert("H6i37Q==")));
            map.put("v2", C5455y0.m7470a(context).m7475a(crypto.convert("H6iqxnPZqQ==")));
            map.put("v4", C5440r.m7286q().m7354n(context));
            m7119a(context, map);
            map.put("u1", C5422i.m7160b().m7162a());
            map.put("u2", C5422i.m7160b().m7169c());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if ("default".equals(entry.getValue()) || "para_err".equals(entry.getValue()) || "no_permission".equals(entry.getValue()) || "exception".equals(entry.getValue()) || "empty".equals(entry.getValue()) || "not_supported".equals(entry.getValue())) {
                    it.remove();
                }
            }
            C5430m.a aVarM7220a = C5430m.m7220a(C5411e.m7130b(map).toString(), 3);
            if (aVarM7220a != null && aVarM7220a.f7316a == 0) {
                f7242b = "LT" + Base64.encodeToString(aVarM7220a.f7317b, 11);
                f7243c = System.currentTimeMillis();
            }
            return f7242b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static synchronized JSONObject m7124e(Context context) {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("d20", C5440r.m7286q().m7360r());
            jSONObject.put("d24", C5440r.m7286q().m7333e0(context));
            jSONObject.put("d25", C5440r.m7286q().m7296F());
            jSONObject.put("d28", C5440r.m7286q().m7341h0(context));
            jSONObject.put("d29", C5440r.m7286q().m7344i0(context));
            jSONObject.put("d30", C5440r.m7286q().m7305N(context));
            jSONObject.put("d33", C5440r.m7286q().m7350l(context));
            jSONObject.put("d44", C5440r.m7286q().m7319a(context));
            try {
                jSONObject.put("c1", C5439q0.m7263a(context).m7272a(false).optString(DbParams.KEY_CHANNEL_RESULT, "0"));
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
                jSONObject.put("c1", "0");
            }
            try {
                jSONObject.put("c3", C5452x.m7427a(context).m7435a(false).optString(DbParams.KEY_CHANNEL_RESULT, "0"));
            } catch (Throwable th3) {
                C5415f0.m7139a(th3);
                jSONObject.put("c3", "0");
            }
            jSONObject.put("c6", C5453x0.m7436a(context).m7453a());
            jSONObject.put("c8", C5436p.m7250a(context).m7253c());
            jSONObject.put("c9", C5421h0.m7148a(context).m7153a(false));
            jSONObject.put("c21", C5440r.m7286q().m7303L(context));
            jSONObject.put(ICustomDataEditor.NUMBER_PARAM_1, C5423i0.m7173c().m7182e(context));
            jSONObject.put(ICustomDataEditor.NUMBER_PARAM_2, C5423i0.m7173c().m7184g(context));
            jSONObject.put(ICustomDataEditor.NUMBER_PARAM_3, C5423i0.m7173c().m7183f(context));
            jSONObject.put(ICustomDataEditor.NUMBER_PARAM_4, C5423i0.m7173c().m7185h(context));
            jSONObject.put(ICustomDataEditor.NUMBER_PARAM_9, C5423i0.m7173c().m7186i(context));
            jSONObject.put("n11", C5423i0.m7173c().m7174a());
            jSONObject.put("d39", C5440r.m7286q().m7340h(context));
            jSONObject.put("d40", C5440r.m7286q().m7343i(context));
            jSONObject.put("d136", C5440r.m7286q().m7357p());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static void m7119a(Context context, Map<String, String> map) {
        JSONObject jSONObjectM7145a = C5417g.m7143a(context).m7145a(crypto.convert("PJKRy3nQrcEZUQ=="));
        if (jSONObjectM7145a != null) {
            try {
                String strOptString = jSONObjectM7145a.getJSONObject(crypto.convert("PZeSzGs=")).optString("k2", "");
                if (C5457z0.m7482b(strOptString)) {
                    String strM7398e = C5444t.m7398e(strOptString);
                    if (C5457z0.m7482b(strM7398e)) {
                        map.put("k2", strM7398e);
                    } else {
                        C5415f0.m7140b("k2 result is null");
                    }
                }
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m7122c(Context context) {
        JSONObject jSONObjectM7145a = C5417g.m7143a(context).m7145a(crypto.convert("PZeSzH3ErtMb"));
        if (jSONObjectM7145a != null) {
            try {
                JSONArray jSONArray = jSONObjectM7145a.getJSONArray(crypto.convert("PZeSzGs="));
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    String string = jSONArray.getString(i11);
                    if (C5448v.m7419a(string)) {
                        jSONArray2.put(string);
                    }
                }
                return jSONArray2.toString();
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
                return "exception";
            }
        }
        return "empty";
    }
}
