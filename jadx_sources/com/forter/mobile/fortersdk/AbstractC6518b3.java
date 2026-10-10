package com.forter.mobile.fortersdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.b3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6518b3 {
    /* JADX INFO: renamed from: c */
    public static JSONObject m12169c(JSONArray jSONArray, String str) {
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject.getString("featureName").equals(str)) {
                    return jSONObject;
                }
            } catch (Throwable unused) {
                AbstractC6524c3.m12212d();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static C6545h[] m12173g(JSONObject jSONObject) {
        C6545h[] c6545hArr = new C6545h[0];
        if (jSONObject != null) {
            try {
                if (jSONObject.keys().hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObject.getString(next);
                        if (next != null && string != null) {
                            arrayList.add(new C6545h(next, string));
                        }
                    }
                    return (C6545h[]) arrayList.toArray(c6545hArr);
                }
            } catch (Exception unused) {
                AbstractC6524c3.m12212d();
            }
        }
        return c6545hArr;
    }

    /* JADX INFO: renamed from: d */
    public static C44699a m12170d(C44699a c44699a, JSONArray jSONArray) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObjectM12169c = m12169c(jSONArray, "globalConfiguration");
            if (jSONObjectM12169c != null && (jSONObject = jSONObjectM12169c.getJSONObject("keysOverride")) != null && jSONObject.keys().hasNext()) {
                C44699a c44699a2 = new C44699a(c44699a);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = jSONObject.getString(next);
                    if (next != null && string != null) {
                        String.format("Overriding configuration value: %s with %s", next, string);
                        AbstractC6524c3.m12214f();
                        c44699a2.m98898x(EnumC6509ab.valueOf(next), string);
                    }
                }
                return c44699a2;
            }
            return c44699a;
        } catch (Throwable th2) {
            AbstractC6524c3.m12212d();
            C6514b.m12151b().m12159g("RTConfigurationUtils::processSDKConfigurationArray got exception", th2.getMessage());
            return c44699a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12171e(int i11) {
        return i11 >= 500;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static JSONObject m12174h(@NonNull C6545h[] c6545hArr, @NonNull String str) {
        return (JSONObject) m12168b(c6545hArr, str, JSONObject.class);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static JSONArray m12175i(@NonNull C6545h[] c6545hArr, @NonNull String str) {
        return (JSONArray) m12168b(c6545hArr, str, JSONArray.class);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static C6545h m12167a(C6545h[] c6545hArr, String str) {
        try {
            if (!AbstractC6539f3.m12287u(c6545hArr)) {
                for (C6545h c6545h : c6545hArr) {
                    if (c6545h.f10959a.equals(str)) {
                        return c6545h;
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static <T> T m12168b(@NonNull C6545h[] c6545hArr, @NonNull String str, @NonNull Class<T> cls) {
        C6514b c6514bM12151b;
        String str2;
        C6545h c6545hM12167a = m12167a(c6545hArr, str);
        if (c6545hM12167a != null) {
            if (JSONObject.class == cls) {
                try {
                    return cls.cast(new JSONObject(c6545hM12167a.f10960b));
                } catch (JSONException e11) {
                    e = e11;
                    c6514bM12151b = C6514b.m12151b();
                    str2 = String.format("Failed parsing %s config JSON", str);
                }
            } else if (JSONArray.class == cls) {
                try {
                    return cls.cast(new JSONArray(c6545hM12167a.f10960b));
                } catch (JSONException e12) {
                    e = e12;
                    c6514bM12151b = C6514b.m12151b();
                    str2 = String.format("Failed parsing %s config JSON", str);
                }
            } else {
                return null;
            }
            c6514bM12151b.m12159g(str2, e.toString());
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12172f(String str) {
        try {
            return m12171e(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
