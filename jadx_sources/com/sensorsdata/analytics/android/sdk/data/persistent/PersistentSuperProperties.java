package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.SharedPreferences;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class PersistentSuperProperties extends PersistentIdentity<JSONObject> {
    public PersistentSuperProperties(Future<SharedPreferences> future) {
        super(future, PersistentLoader.PersistentName.SUPER_PROPERTIES, new PersistentIdentity.PersistentSerializer<JSONObject>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentSuperProperties.1
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public JSONObject create() {
                return new JSONObject();
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public JSONObject load(String str) {
                try {
                    return new JSONObject(str);
                } catch (JSONException e11) {
                    SALog.m68588d("Persistent", "failed to load SuperProperties from SharedPreferences.", e11);
                    return new JSONObject();
                }
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String save(JSONObject jSONObject) {
                return jSONObject == null ? create().toString() : jSONObject.toString();
            }
        });
    }
}
