package com.sensorsdata.analytics.android.sdk;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public final class PropertyBuilder {
    private static final String TAG = "PropertyBuilder";
    private final LinkedHashMap<String, Object> innerPropertyMap = new LinkedHashMap<>();

    public PropertyBuilder append(String str, Object obj) {
        this.innerPropertyMap.put(str, obj);
        return this;
    }

    public static PropertyBuilder newInstance() {
        return new PropertyBuilder();
    }

    public PropertyBuilder append(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            this.innerPropertyMap.putAll(map);
        }
        return this;
    }

    public void clear() {
        this.innerPropertyMap.clear();
    }

    public Object remove(String str) {
        return this.innerPropertyMap.remove(str);
    }

    public int size() {
        return this.innerPropertyMap.size();
    }

    public JSONObject toJSONObject() {
        this.innerPropertyMap.remove(null);
        if (this.innerPropertyMap.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : this.innerPropertyMap.keySet()) {
            try {
                jSONObject.put(str, this.innerPropertyMap.get(str));
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
        return jSONObject;
    }

    private PropertyBuilder() {
    }

    public PropertyBuilder append(Object... objArr) {
        if (objArr == null || objArr.length <= 1) {
            SALog.m68589i(TAG, "The key value pair is incorrect.");
            return this;
        }
        for (int i11 = 0; i11 < objArr.length; i11 += 2) {
            Object obj = objArr[i11];
            int i12 = i11 + 1;
            if (i12 >= objArr.length) {
                SALog.m68589i(TAG, "this element key[index= " + i12 + "] will be ignored, because no element can pair with it. ");
                return this;
            }
            Object obj2 = objArr[i12];
            if (!(obj instanceof String)) {
                SALog.m68589i(TAG, "this element key[index= " + i12 + "] is not a String, the method will ignore the element and the next element. ");
            } else {
                this.innerPropertyMap.put((String) obj, obj2);
            }
        }
        return this;
    }
}
