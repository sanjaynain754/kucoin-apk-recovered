package com.tencent.bugly.proguard;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.z4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34052z4 extends AbstractC34022xe {

    /* JADX INFO: renamed from: h */
    public static final String f72596h = "emulator_model_feature";

    /* JADX INFO: renamed from: i */
    public static final String f72597i = "emulator_files_feature";

    /* JADX INFO: renamed from: j */
    public static final String f72598j = "path";

    /* JADX INFO: renamed from: k */
    public static final String f72599k = "feature";

    /* JADX INFO: renamed from: l */
    public static final String f72600l = "emulator";

    /* JADX INFO: renamed from: f */
    public String f72601f = null;

    /* JADX INFO: renamed from: g */
    public String f72602g = null;

    /* JADX INFO: renamed from: a */
    public static String m75585a(JSONArray jSONArray) {
        StringBuilder sb2 = new StringBuilder();
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    sb2.append(jSONObject.optString("path"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray(f72599k);
                    for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                        sb2.append(",");
                        sb2.append(jSONArray2.get(i12).toString());
                    }
                    if (i11 != jSONArray.length() - 1) {
                        sb2.append("%");
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m75586b(JSONArray jSONArray) {
        StringBuilder sb2 = new StringBuilder();
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    sb2.append(jSONArray.get(i11).toString());
                    if (i11 != jSONArray.length() - 1) {
                        sb2.append("%");
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m75588c() {
        return this.f72601f;
    }

    /* JADX INFO: renamed from: b */
    public String m75587b() {
        return this.f72602g;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(f72596h)) {
            this.f72601f = m75586b(jSONObject.getJSONArray(f72596h));
        }
        if (jSONObject.has(f72597i)) {
            this.f72602g = m75585a(jSONObject.getJSONArray(f72597i));
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return f72600l;
    }
}
