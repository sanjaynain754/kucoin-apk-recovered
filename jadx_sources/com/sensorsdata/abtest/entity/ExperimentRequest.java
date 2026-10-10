package com.sensorsdata.abtest.entity;

import android.text.TextUtils;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.sensorsdata.abtest.BuildConfig;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class ExperimentRequest {
    private static final String TAG = "SAB.RequestParams";
    private JSONObject mJSONObject;
    private String mParamName;
    private Map<String, String> mProperties;

    public JSONObject createRequestBody() {
        JSONObject jSONObject = new JSONObject();
        try {
            String loginId = SensorsDataAPI.sharedInstance().getLoginId();
            if (!TextUtils.isEmpty(loginId)) {
                jSONObject.put("login_id", loginId);
            }
            jSONObject.put("anonymous_id", SensorsDataAPI.sharedInstance().getAnonymousId());
            jSONObject.put("platform", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
            jSONObject.put("properties", getPresetProperties());
            jSONObject.put("abtest_lib_version", BuildConfig.SDK_VERSION);
            Map<String, String> map = this.mProperties;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(this.mParamName)) {
                jSONObject.put("custom_properties", new JSONObject(this.mProperties));
                jSONObject.put("param_name", this.mParamName);
            }
            try {
                JSONObject jSONObject2 = this.mJSONObject;
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = this.mJSONObject.optString(next);
                        if (!TextUtils.isEmpty(next)) {
                            jSONObject.put(next, strOptString);
                        }
                    }
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
            SALog.m68589i(TAG, "getRequestParams | request:\n" + JSONUtils.formatJson(jSONObject.toString()));
        } catch (JSONException e12) {
            SALog.printStackTrace(e12);
        } catch (Exception e13) {
            SALog.printStackTrace(e13);
        }
        return jSONObject;
    }

    public ExperimentRequest(Map<String, String> map, String str, JSONObject jSONObject) {
        this.mProperties = map;
        this.mJSONObject = jSONObject;
        this.mParamName = str;
    }

    private JSONObject getPresetProperties() {
        try {
            return SensorsDataAPI.sharedInstance().getPresetProperties();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }
}
