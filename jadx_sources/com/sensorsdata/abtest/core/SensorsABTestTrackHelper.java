package com.sensorsdata.abtest.core;

import android.text.TextUtils;
import com.sensorsdata.abtest.BuildConfig;
import com.sensorsdata.abtest.entity.Experiment;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
class SensorsABTestTrackHelper {
    private static final String TAG = "SAB.SensorsABTestTrackHelper";
    private static volatile SensorsABTestTrackHelper mInstance;
    private HashMap<String, HashSet<String>> mABTestTriggerEventHashMap = null;

    private boolean isTrackABTestTrigger(String str, String str2) {
        HashSet<String> hashSet;
        try {
            HashMap<String, HashSet<String>> map = this.mABTestTriggerEventHashMap;
            return map == null || !map.containsKey(str2) || (hashSet = this.mABTestTriggerEventHashMap.get(str2)) == null || !hashSet.contains(str);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return true;
    }

    private void addExperimentId2HashMap(String str, String str2) {
        if (this.mABTestTriggerEventHashMap == null) {
            this.mABTestTriggerEventHashMap = new HashMap<>();
        }
        SALog.m68589i(TAG, "addExperimentId2HashMap mABTestTriggerEventHashMap old: " + this.mABTestTriggerEventHashMap.toString());
        HashSet<String> hashSet = this.mABTestTriggerEventHashMap.get(str2);
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        hashSet.add(str);
        this.mABTestTriggerEventHashMap.put(str2, hashSet);
        SALog.m68589i(TAG, "addExperimentId2HashMap mABTestTriggerEventHashMap last: " + this.mABTestTriggerEventHashMap.toString());
    }

    public static SensorsABTestTrackHelper getInstance() {
        if (mInstance == null) {
            synchronized (SensorsABTestTrackHelper.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new SensorsABTestTrackHelper();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mInstance;
    }

    private JSONArray getSDKVersion() {
        try {
            if (TextUtils.isEmpty(BuildConfig.SDK_VERSION)) {
                return null;
            }
            SALog.m68589i(TAG, "android plugin version: 0.1.3");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("android_abtesting:0.1.3");
            return jSONArray;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    public void trackABTestTrigger(Experiment experiment, String str, String str2, String str3) {
        JSONArray sDKVersion;
        if (experiment == null || TextUtils.isEmpty(experiment.experimentId)) {
            SALog.m68589i(TAG, "trackABTestTrigger param experiment is invalid");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            SALog.m68589i(TAG, "trackABTestTrigger distinctId is null");
            return;
        }
        if (!isTrackABTestTrigger(experiment.experimentId, str)) {
            SALog.m68589i(TAG, "trackABTestTrigger experimentId: " + experiment.experimentId + " has triggered and return");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$abtest_experiment_id", experiment.experimentId);
            jSONObject.put("$abtest_experiment_group_id", experiment.experimentGroupId);
            if (this.mABTestTriggerEventHashMap == null && (sDKVersion = getSDKVersion()) != null) {
                jSONObject.put("$lib_plugin_version", sDKVersion);
            }
            if (!TextUtils.equals(SensorsDataAPI.sharedInstance().getDistinctId(), str)) {
                jSONObject.put("$abtest_distinct_id", str);
                jSONObject.put("$abtest_login_id", str2);
                jSONObject.put("$abtest_anonymous_id", str3);
            }
            SensorsDataAPI.sharedInstance().track("$ABTestTrigger", jSONObject);
            addExperimentId2HashMap(experiment.experimentId, str);
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    private SensorsABTestTrackHelper() {
    }
}
