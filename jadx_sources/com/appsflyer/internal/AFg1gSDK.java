package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class AFg1gSDK {
    public static JSONObject getMonetizationNetwork(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), getMonetizationNetwork(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static List<Object> AFAdRevenueData(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            Object mediationNetwork = jSONArray.get(i11);
            if (mediationNetwork instanceof JSONArray) {
                mediationNetwork = AFAdRevenueData((JSONArray) mediationNetwork);
            } else if (mediationNetwork instanceof JSONObject) {
                mediationNetwork = getMediationNetwork((JSONObject) mediationNetwork);
            }
            arrayList.add(mediationNetwork);
        }
        return arrayList;
    }

    public static Map<String, Object> getMediationNetwork(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object mediationNetwork = jSONObject.get(next);
            if (mediationNetwork instanceof JSONArray) {
                mediationNetwork = AFAdRevenueData((JSONArray) mediationNetwork);
            } else if (mediationNetwork instanceof JSONObject) {
                mediationNetwork = getMediationNetwork((JSONObject) mediationNetwork);
            }
            map.put(next, mediationNetwork);
        }
        return map;
    }

    @Nullable
    public static JSONObject getMonetizationNetwork(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Object getMonetizationNetwork(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(getMonetizationNetwork(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < length; i11++) {
                    jSONArray2.put(getMonetizationNetwork(Array.get(obj, i11)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                return getMonetizationNetwork((Map<String, ?>) obj);
            }
            return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }
}
