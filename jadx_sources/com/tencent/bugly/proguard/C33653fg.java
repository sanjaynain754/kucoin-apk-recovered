package com.tencent.bugly.proguard;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.base.meta.BaseInfo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.fg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33653fg extends AbstractC34022xe {

    /* JADX INFO: renamed from: g */
    public static final String f69897g = "safe_mode";

    /* JADX INFO: renamed from: f */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ArrayList<String> f69898f = new ArrayList<>();

    @Override // com.tencent.bugly.proguard.AbstractC34022xe
    /* JADX INFO: renamed from: a */
    public String mo72774a() {
        return f69897g;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("crash_protect");
        ArrayList arrayList = new ArrayList();
        String str = BaseInfo.userMeta.sdkVersion;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
            if (str.equals(jSONObject2.getString("sdk_version"))) {
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("feature_names");
                for (int i12 = 0; jSONArrayOptJSONArray != null && i12 < jSONArrayOptJSONArray.length(); i12++) {
                    String string = jSONArrayOptJSONArray.getString(i12);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                break;
            }
        }
        this.f69898f.clear();
        this.f69898f.addAll(arrayList);
    }
}
