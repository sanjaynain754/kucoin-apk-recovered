package com.ishumei.smantifraud.l1111l111111Il;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l111l1111l1Il {
    private static l111l1111l1Il l1111l111111Il;
    private l111l11111Il l111l11111lIl;

    private static l111l11111Il l1111l111111Il(String str) {
        l111l11111Il l111l11111il = new l111l11111Il();
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (jSONObject.has("usrappcnt")) {
                    l111l11111il.l111l1111lI1l(jSONObject.getInt("usrappcnt"));
                }
                if (jSONObject.has("sysappcnt")) {
                    l111l11111il.l111l1111lIl(jSONObject.getInt("sysappcnt"));
                }
            } catch (Exception unused) {
            }
            try {
                if (jSONObject.has("risk_dirs")) {
                    l111l11111il.l111l11111lIl(l1111l111111Il(jSONObject.getJSONArray("risk_dirs")));
                }
            } catch (Exception unused2) {
            }
            try {
                if (jSONObject.has("white_apps")) {
                    l111l11111il.l1111l111111Il(l111l11111lIl(jSONObject.getJSONArray("white_apps")));
                }
            } catch (Exception unused3) {
            }
            try {
                l111l11111il.l1111l111111Il(l111l11111lIl(jSONObject));
            } catch (Exception unused4) {
            }
            try {
                if (jSONObject.has("core_atamper")) {
                    l111l11111il.l1111l111111Il(jSONObject.getBoolean("core_atamper"));
                }
            } catch (Exception unused5) {
            }
            try {
                if (jSONObject.has("all_atamper")) {
                    l111l11111il.l111l11111lIl(jSONObject.getBoolean("all_atamper"));
                }
            } catch (Exception unused6) {
            }
            try {
                if (jSONObject.has("risk_file_switch")) {
                    l111l11111il.l111l11111I1l(jSONObject.getBoolean("risk_file_switch"));
                }
            } catch (Exception unused7) {
            }
            try {
                if (jSONObject.has("upload_checker_switch")) {
                    l111l11111il.l111l11111Il(jSONObject.getBoolean("upload_checker_switch"));
                }
            } catch (Exception unused8) {
            }
            try {
                if (jSONObject.has("hook_switch")) {
                    l111l11111il.l111l1111l1Il(jSONObject.getBoolean("hook_switch"));
                }
            } catch (Exception unused9) {
            }
            try {
                if (jSONObject.has("hook_java_switch")) {
                    l111l11111il.l111l1111llIl(jSONObject.getBoolean("hook_java_switch"));
                }
            } catch (Exception unused10) {
            }
            try {
                if (jSONObject.has("net_max")) {
                    l111l11111il.l1111l111111Il(jSONObject.getInt("net_max"));
                }
            } catch (Exception unused11) {
            }
            try {
                if (jSONObject.has("re_max")) {
                    l111l11111il.l111l11111lIl(jSONObject.getInt("re_max"));
                }
            } catch (Exception unused12) {
            }
            try {
                if (jSONObject.has("up_max")) {
                    l111l11111il.l111l1111llIl(jSONObject.getInt("up_max"));
                }
            } catch (Exception unused13) {
            }
            try {
                l111l11111il.l111l11111I1l(jSONObject.optInt("weventt", 60));
                l111l11111il.l111l11111Il(jSONObject.optInt("weventc", 100));
                l111l11111il.l111l1111l1Il(jSONObject.optInt("weventmax", 10));
            } catch (Exception unused14) {
            }
            l111l11111il.l111l11111I1l(str);
            l111l11111il.l1111l111111Il(com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l111l11111I1l(str));
            return l111l11111il;
        } catch (Exception unused15) {
            return null;
        }
    }

    private l111l11111Il l111l11111I1l() {
        l111l11111Il l111l11111Il = l111l11111Il();
        if (l111l11111Il != null) {
            l111l11111Il.l111l11111lIl("code");
        }
        return l111l11111Il;
    }

    public final l111l11111Il l111l11111lIl() {
        l111l11111Il l111l11111il = this.l111l11111lIl;
        if (l111l11111il != null) {
            return l111l11111il;
        }
        l111l11111Il l111l11111Il = l111l11111Il();
        if (l111l11111Il != null) {
            l111l11111Il.l111l11111lIl("code");
        }
        this.l111l11111lIl = l111l11111Il;
        return l111l11111Il;
    }

    public static synchronized l111l1111l1Il l1111l111111Il() {
        try {
            if (l1111l111111Il == null) {
                l1111l111111Il = new l111l1111l1Il();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return l1111l111111Il;
    }

    private static Set<String> l111l11111I1l(JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (jSONObject.getBoolean(next)) {
                    hashSet.add(next);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private static Map<String, l111l11111Il.l111l11111lIl> l111l11111lIl(JSONArray jSONArray) {
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                l111l11111Il.l111l11111lIl l111l11111lil = new l111l11111Il.l111l11111lIl();
                String next = jSONObject.keys().next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                l111l11111lil.l1111l111111Il(next);
                l111l11111lil.l111l11111lIl(jSONObject2.getString("pn"));
                map.put(l111l11111lil.l1111l111111Il(), l111l11111lil);
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    private l111l1111l1Il() {
    }

    private static Map<String, l111l11111Il.l1111l111111Il> l1111l111111Il(JSONArray jSONArray) {
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                l111l11111Il.l1111l111111Il l1111l111111il = new l111l11111Il.l1111l111111Il();
                String next = jSONObject.keys().next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                l1111l111111il.l1111l111111Il(next);
                if (TextUtils.equals("sdcard", jSONObject2.getString("type"))) {
                    l1111l111111il.l1111l111111Il(0);
                } else {
                    if (TextUtils.equals("absolute", jSONObject2.getString("type"))) {
                        l1111l111111il.l1111l111111Il(1);
                    }
                }
                l1111l111111il.l111l11111lIl(jSONObject2.getString("dir"));
                map.put(l1111l111111il.l1111l111111Il(), l1111l111111il);
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    private static l111l11111Il l111l11111Il() {
        try {
            return l1111l111111Il("{\n    \"risk_file_switch\": true,\n    \"hook_switch\": false,\n    \"core_atamper\": true,\n    \"sensitive.mac\": true,\n    \"all_atamper\": true,\n    \"sensitive.camera\": true,\n    \"sensitive.cell\": true,\n    \"sensitive.ssid\": true,\n    \"sensitive.gps\": false,\n    \"sensitive.bssid\": true,\n    \"sensitive.ainfo\": true,\n    \"sensitive.aps\": true,\n    \"risk_files\": \"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\",\n    \"hook_java_switch\": true,\n    \"sensitive.tel\": false\n  }");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Set<String> l111l11111lIl(JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (next.startsWith("sensitive.") && jSONObject.getBoolean(next)) {
                    hashSet.add(next.split("\\.")[1]);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private static Map<String, l111l11111Il.l111l11111lIl> l1111l111111Il(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                l111l11111Il.l111l11111lIl l111l11111lil = new l111l11111Il.l111l11111lIl();
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                l111l11111lil.l1111l111111Il(next);
                l111l11111lil.l111l11111lIl(jSONObject2.getString("pn"));
                map.put(l111l11111lil.l1111l111111Il(), l111l11111lil);
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
