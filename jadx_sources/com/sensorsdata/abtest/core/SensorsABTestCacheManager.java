package com.sensorsdata.abtest.core;

import android.text.TextUtils;
import com.sensorsdata.abtest.entity.Experiment;
import com.sensorsdata.abtest.entity.SABErrorEnum;
import com.sensorsdata.abtest.util.SPUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsABTestCacheManager implements IExperimentCacheAPI {
    private static final String KEY_EXPERIMENT = "key_experiment_with_distinct_id";
    private static final String TAG = "SAB.SensorsABTestCacheManager";
    private JSONArray mFuzzyExperiments;
    public ConcurrentHashMap<String, Experiment> mHashMap;

    public static class SensorsABTestCacheManagerStaticNestedClass {
        private static final SensorsABTestCacheManager INSTANCE = new SensorsABTestCacheManager();

        private SensorsABTestCacheManagerStaticNestedClass() {
        }
    }

    private SensorsABTestCacheManager() {
        this.mFuzzyExperiments = null;
        this.mHashMap = new ConcurrentHashMap<>();
    }

    private Experiment getExperimentByParamName(String str) {
        if (str == null || !this.mHashMap.containsKey(str)) {
            return null;
        }
        return this.mHashMap.get(str);
    }

    private void parseCache(String str, ConcurrentHashMap<String, Experiment> concurrentHashMap) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null) {
                        Experiment experiment = new Experiment();
                        String strOptString = jSONObjectOptJSONObject.optString("abtest_experiment_id");
                        experiment.experimentId = strOptString;
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        experiment.experimentGroupId = jSONObjectOptJSONObject.optString("abtest_experiment_group_id");
                        experiment.isControlGroup = jSONObjectOptJSONObject.optBoolean("is_control_group");
                        experiment.isWhiteList = jSONObjectOptJSONObject.optBoolean("is_white_list");
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("variables");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i12);
                                Experiment.Variable variable = new Experiment.Variable();
                                variable.type = jSONObjectOptJSONObject2.optString("type");
                                variable.name = jSONObjectOptJSONObject2.optString("name");
                                variable.value = jSONObjectOptJSONObject2.optString("value");
                                arrayList.add(variable);
                                if (!concurrentHashMap.containsKey(variable.name)) {
                                    concurrentHashMap.put(variable.name, experiment);
                                }
                            }
                            experiment.variables = arrayList;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void clearCache() {
        loadExperimentsFromCache("");
        this.mFuzzyExperiments = null;
    }

    @Override // com.sensorsdata.abtest.core.IExperimentCacheAPI
    public ConcurrentHashMap<String, Experiment> getExperimentsFromMemoryCache(String str) {
        ConcurrentHashMap<String, Experiment> concurrentHashMap = new ConcurrentHashMap<>();
        if (TextUtils.isEmpty(str)) {
            this.mHashMap.clear();
            return concurrentHashMap;
        }
        try {
            String strOptString = new JSONObject(str).optString("experiments");
            if (TextUtils.isEmpty(strOptString)) {
                this.mHashMap.clear();
                return concurrentHashMap;
            }
            parseCache(strOptString, concurrentHashMap);
            this.mHashMap.clear();
            this.mHashMap.putAll(concurrentHashMap);
            return concurrentHashMap;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.abtest.core.IExperimentCacheAPI
    public boolean isFuzzyExperiments(String str) {
        JSONArray jSONArray = this.mFuzzyExperiments;
        if (jSONArray == null) {
            return true;
        }
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            try {
                if (str.equals(this.mFuzzyExperiments.getString(i11))) {
                    return true;
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
        return false;
    }

    @Override // com.sensorsdata.abtest.core.IExperimentCacheAPI
    public void saveExperiments2DiskCache(String str) {
        SALog.m68589i(TAG, "更新试验数据成功:\n" + str);
        SPUtils.getInstance().put(KEY_EXPERIMENT, str);
    }

    @Override // com.sensorsdata.abtest.core.IExperimentCacheAPI
    public void saveFuzzyExperiments(JSONArray jSONArray) {
        this.mFuzzyExperiments = jSONArray;
    }

    public static SensorsABTestCacheManager getInstance() {
        return SensorsABTestCacheManagerStaticNestedClass.INSTANCE;
    }

    @Override // com.sensorsdata.abtest.core.IExperimentCacheAPI
    public <T> T getExperimentVariableValue(String str, T t11) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            SALog.m68589i(TAG, String.format("experiment param name：%s，试验参数名不正确，试验参数名必须为非空字符串！", str));
            return null;
        }
        if (t11 != null) {
            SALog.m68589i(TAG, "getExperimentVariableValue param name: " + str + " , type: " + t11.getClass());
        }
        Experiment experimentByParamName = getExperimentByParamName(str);
        if (experimentByParamName != null) {
            if (experimentByParamName.checkTypeIsValid(str, t11)) {
                T t12 = (T) experimentByParamName.getVariableValue(str, t11);
                if (t12 != null) {
                    SALog.m68589i(TAG, "getExperimentVariableValue success and type: " + t12.getClass() + " ,value: " + t12.toString());
                    if (!experimentByParamName.isWhiteList) {
                        SensorsABTestTrackHelper.getInstance().trackABTestTrigger(experimentByParamName, SensorsDataAPI.sharedInstance().getDistinctId(), SensorsDataAPI.sharedInstance().getLoginId(), SensorsDataAPI.sharedInstance().getAnonymousId());
                    }
                }
                return t12;
            }
            if (t11 != null) {
                Experiment.Variable variableByParamName = experimentByParamName.getVariableByParamName(str);
                if (variableByParamName != null) {
                    str2 = variableByParamName.type;
                } else {
                    str2 = "";
                }
                SABErrorDispatcher.dispatchSABException(SABErrorEnum.ASYNC_REQUEST_PARAMS_TYPE_NOT_VALID, str, str2, t11.getClass().toString());
            }
        }
        SALog.m68589i(TAG, "getExperimentVariableValue return null");
        return null;
    }

    @Override // com.sensorsdata.abtest.core.IExperimentCacheAPI
    public ConcurrentHashMap<String, Experiment> loadExperimentsFromCache(String str) {
        ConcurrentHashMap<String, Experiment> experimentsFromMemoryCache = getExperimentsFromMemoryCache(str);
        saveExperiments2DiskCache(str);
        return experimentsFromMemoryCache;
    }

    @Override // com.sensorsdata.abtest.core.IExperimentCacheAPI
    public void loadExperimentsFromDiskCache() {
        String string = SPUtils.getInstance().getString(KEY_EXPERIMENT);
        SALog.m68589i(TAG, "loadExperimentsFromDiskCache | experiments:\n" + JSONUtils.formatJson(string));
        getExperimentsFromMemoryCache(string);
    }
}
