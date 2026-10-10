package com.forter.mobile.fortersdk;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6571m0 {
    /* JADX INFO: renamed from: a */
    public static <T> void m12427a(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull C6635z.a<T> aVar, @NonNull T t11) {
        try {
            jSONObject.put(str, C6635z.m12513a(aVar, t11));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m12428b(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull T t11) {
        try {
            jSONObject.put(str, t11);
        } catch (JSONException unused) {
        }
    }
}
