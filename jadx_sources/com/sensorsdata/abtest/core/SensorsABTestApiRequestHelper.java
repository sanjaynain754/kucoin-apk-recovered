package com.sensorsdata.abtest.core;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.abtest.OnABTestReceivedData;
import com.sensorsdata.abtest.SensorsABTest;
import com.sensorsdata.abtest.SensorsABTestConfigOptions;
import com.sensorsdata.abtest.entity.AppConstants;
import com.sensorsdata.abtest.entity.Experiment;
import com.sensorsdata.abtest.entity.ExperimentRequest;
import com.sensorsdata.abtest.entity.RequestingExperimentInfo;
import com.sensorsdata.abtest.entity.SABErrorEnum;
import com.sensorsdata.abtest.exception.DataInvalidException;
import com.sensorsdata.abtest.util.SensorsDataHelper;
import com.sensorsdata.abtest.util.TaskRunner;
import com.sensorsdata.abtest.util.UrlUtil;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsABTestApiRequestHelper<T> {
    private static final String TAG = "SAB.SensorsABTestApiRequestHelper";
    private String mDistinctId;
    private boolean mHasCallback = false;

    public class TimeoutRunnable implements Runnable {
        private final RequestExperimentTaskRecorder currentTask;

        public TimeoutRunnable(RequestExperimentTaskRecorder requestExperimentTaskRecorder) {
            this.currentTask = requestExperimentTaskRecorder;
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestExperimentTaskRecorderManager.getInstance().removeTask(this.currentTask);
            if (this.currentTask != null && !SensorsABTestApiRequestHelper.this.mHasCallback) {
                List<RequestingExperimentInfo> requestingExperimentList = this.currentTask.getRequestingExperimentList();
                SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "Task merged request size is " + requestingExperimentList.size());
                for (RequestingExperimentInfo requestingExperimentInfo : requestingExperimentList) {
                    OnABTestReceivedData<?> resultCallBack = requestingExperimentInfo.getResultCallBack();
                    Object defaultValue = requestingExperimentInfo.getDefaultValue();
                    SensorsABTestApiRequestHelper.this.doCallbackOnMainThread(resultCallBack, defaultValue);
                    SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "timeout return value: " + defaultValue);
                    SABErrorDispatcher.dispatchSABException(SABErrorEnum.ASYNC_REQUEST_TIMEOUT, defaultValue);
                }
                SensorsABTestApiRequestHelper.this.mHasCallback = true;
            }
        }
    }

    public void requestExperiments(Map<String, String> map, String str, IApiCallback<String> iApiCallback) {
        requestExperiments(map, str, null, iApiCallback);
    }

    public void requestExperimentsAndUpdateCache() {
        requestExperimentsAndUpdateCache(null, null, null);
    }

    public void requestExperimentByParamName(final String str, final String str2, final String str3, String str4, T t11, Map<String, Object> map, int i11, OnABTestReceivedData<T> onABTestReceivedData, boolean z11) {
        Map<String, String> mapCheckPropertiesAndToString;
        RequestExperimentTaskRecorder requestExperimentTaskRecorderCreateRequest;
        if (onABTestReceivedData == null) {
            SALog.m68589i(TAG, "试验 callback 不正确，试验 callback 不能为空！");
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            SALog.m68589i(TAG, String.format("experiment param name：%s，试验参数名不正确，试验参数名必须为非空字符串！", str4));
            if (this.mHasCallback) {
                return;
            }
            SABErrorDispatcher.dispatchSABException(SABErrorEnum.ASYNC_REQUEST_NULL_EXPERIMENT_PARAMETER_NAME, t11);
            this.mHasCallback = true;
            doCallbackOnMainThread(onABTestReceivedData, t11);
            return;
        }
        Context context = SensorsABTest.shareInstance().getContext();
        if (context != null && !NetworkUtils.isNetworkAvailable(context)) {
            if (this.mHasCallback) {
                return;
            }
            SABErrorDispatcher.dispatchSABException(SABErrorEnum.ASYNC_REQUEST_NETWORK_UNAVAILABLE, t11);
            this.mHasCallback = true;
            doCallbackOnMainThread(onABTestReceivedData, t11);
            return;
        }
        if (map == null || map.size() <= 0) {
            mapCheckPropertiesAndToString = null;
        } else {
            try {
                mapCheckPropertiesAndToString = SensorsDataHelper.checkPropertiesAndToString(map);
            } catch (DataInvalidException e11) {
                if (this.mHasCallback) {
                    return;
                }
                SABErrorDispatcher.dispatchSABException(SABErrorEnum.ASYNC_REQUEST_PROPERTIES_NOT_VALID, e11.getMessage());
                this.mHasCallback = true;
                doCallbackOnMainThread(onABTestReceivedData, t11);
                return;
            }
        }
        Map<String, String> map2 = mapCheckPropertiesAndToString;
        if (!z11) {
            requestExperimentTaskRecorderCreateRequest = RequestExperimentTaskRecorderManager.getInstance().createRequest(str2, str3, str4, map, i11, onABTestReceivedData, t11);
        } else {
            if (!SensorsABTestCacheManager.getInstance().isFuzzyExperiments(str4)) {
                if (this.mHasCallback) {
                    return;
                }
                SABErrorDispatcher.dispatchSABException(SABErrorEnum.ASYNC_REQUEST_EXPERIMENT_NOT_IN_FUZZY, t11);
                this.mHasCallback = true;
                doCallbackOnMainThread(onABTestReceivedData, t11);
                return;
            }
            requestExperimentTaskRecorderCreateRequest = RequestExperimentTaskRecorderManager.getInstance().mergeRequest(str2, str3, str4, map, i11, onABTestReceivedData, t11);
        }
        final RequestExperimentTaskRecorder requestExperimentTaskRecorder = requestExperimentTaskRecorderCreateRequest;
        if (requestExperimentTaskRecorder.isMergedTask()) {
            return;
        }
        final TimeoutRunnable timeoutRunnable = new TimeoutRunnable(requestExperimentTaskRecorder);
        TaskRunner.getBackHandler().postDelayed(timeoutRunnable, i11);
        this.mDistinctId = str;
        requestExperimentsAndUpdateCache(map2, str4, new IApiCallback<Map<String, Experiment>>() { // from class: com.sensorsdata.abtest.core.SensorsABTestApiRequestHelper.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.sensorsdata.abtest.core.IApiCallback
            public void onSuccess(Map<String, Experiment> map3) {
                RequestExperimentTaskRecorderManager.getInstance().removeTask(requestExperimentTaskRecorder);
                List<RequestingExperimentInfo> requestingExperimentList = requestExperimentTaskRecorder.getRequestingExperimentList();
                TaskRunner.getBackHandler().removeCallbacks(timeoutRunnable);
                if (SensorsABTestApiRequestHelper.this.mHasCallback) {
                    SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "Request success! but all callbacks has been returned with default value!");
                    return;
                }
                SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "Task merged request size is " + requestingExperimentList.size());
                for (RequestingExperimentInfo requestingExperimentInfo : requestingExperimentList) {
                    OnABTestReceivedData<?> resultCallBack = requestingExperimentInfo.getResultCallBack();
                    String paramName = requestingExperimentInfo.getParamName();
                    Object defaultValue = requestingExperimentInfo.getDefaultValue();
                    if (map3 == null) {
                        try {
                            SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "onSuccess response is empty and return default value: " + defaultValue);
                            SensorsABTestApiRequestHelper.this.doCallbackOnMainThread(resultCallBack, defaultValue);
                        } catch (Exception unused) {
                            SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "onSuccess Exception and return default value: " + defaultValue);
                            SensorsABTestApiRequestHelper.this.doCallbackOnMainThread(resultCallBack, defaultValue);
                        }
                    } else {
                        Experiment experiment = map3.get(paramName);
                        if (experiment == 0) {
                            SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "onSuccess experiment is empty and return default value: " + defaultValue);
                            SensorsABTestApiRequestHelper.this.doCallbackOnMainThread(resultCallBack, defaultValue);
                        } else if (experiment.checkTypeIsValid(paramName, defaultValue)) {
                            Object variableValue = experiment.getVariableValue(paramName, defaultValue);
                            if (variableValue != null) {
                                SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "onSuccess return value: " + variableValue);
                                SensorsABTestApiRequestHelper.this.doCallbackOnMainThread(resultCallBack, variableValue);
                                if (!experiment.isWhiteList) {
                                    SensorsABTestTrackHelper.getInstance().trackABTestTrigger(experiment, str, str2, str3);
                                }
                            }
                        } else {
                            if (defaultValue != null) {
                                Experiment.Variable variableByParamName = experiment.getVariableByParamName(paramName);
                                SABErrorDispatcher.dispatchSABException(SABErrorEnum.ASYNC_REQUEST_PARAMS_TYPE_NOT_VALID, paramName, variableByParamName != null ? variableByParamName.type : "", defaultValue.getClass().toString());
                            }
                            SensorsABTestApiRequestHelper.this.doCallbackOnMainThread(resultCallBack, defaultValue);
                        }
                    }
                }
                SensorsABTestApiRequestHelper.this.mHasCallback = true;
            }

            @Override // com.sensorsdata.abtest.core.IApiCallback
            public void onFailure(int i12, String str5) {
                TaskRunner.getBackHandler().removeCallbacks(timeoutRunnable);
                RequestExperimentTaskRecorderManager.getInstance().removeTask(requestExperimentTaskRecorder);
                if (!SensorsABTestApiRequestHelper.this.mHasCallback) {
                    List<RequestingExperimentInfo> requestingExperimentList = requestExperimentTaskRecorder.getRequestingExperimentList();
                    SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "Task merged request size is " + requestingExperimentList.size());
                    for (RequestingExperimentInfo requestingExperimentInfo : requestingExperimentList) {
                        OnABTestReceivedData<?> resultCallBack = requestingExperimentInfo.getResultCallBack();
                        Object defaultValue = requestingExperimentInfo.getDefaultValue();
                        SensorsABTestApiRequestHelper.this.doCallbackOnMainThread(resultCallBack, defaultValue);
                        SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "onFailure and return default value: " + defaultValue);
                    }
                    SensorsABTestApiRequestHelper.this.mHasCallback = true;
                }
            }
        });
    }

    public void requestExperiments(Map<String, String> map, String str, JSONObject jSONObject, final IApiCallback<String> iApiCallback) {
        String apiBaseUrl;
        String projectKey;
        SensorsABTestConfigOptions configOptions = SensorsABTest.shareInstance().getConfigOptions();
        if (configOptions != null) {
            String url = configOptions.getUrl();
            apiBaseUrl = UrlUtil.getApiBaseUrl(url);
            projectKey = UrlUtil.getProjectKey(url);
        } else {
            apiBaseUrl = null;
            projectKey = null;
        }
        String string = new ExperimentRequest(map, str, jSONObject).createRequestBody().toString();
        if (TextUtils.isEmpty(apiBaseUrl)) {
            SALog.m68589i(TAG, "url is empty and request cancel");
            return;
        }
        if (TextUtils.isEmpty(projectKey)) {
            SALog.m68589i(TAG, "key is empty and request cancel");
        } else {
            if (TextUtils.isEmpty(string)) {
                SALog.m68589i(TAG, "request body is empty and request cancel");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("project-key", projectKey);
            new RequestHelper.Builder(HttpMethod.POST, apiBaseUrl).header(map2).jsonData(string).callback(new HttpCallback.StringCallback() { // from class: com.sensorsdata.abtest.core.SensorsABTestApiRequestHelper.2
                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onFailure(int i11, String str2) {
                    IApiCallback iApiCallback2 = iApiCallback;
                    if (iApiCallback2 != null) {
                        iApiCallback2.onFailure(i11, str2);
                    }
                }

                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onResponse(String str2) {
                    IApiCallback iApiCallback2 = iApiCallback;
                    if (iApiCallback2 != null) {
                        iApiCallback2.onSuccess(str2);
                    }
                }

                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onAfter() {
                }
            }).execute();
        }
    }

    public void requestExperimentsAndUpdateCache(Map<String, String> map, String str, final IApiCallback<Map<String, Experiment>> iApiCallback) {
        requestExperiments(map, str, new IApiCallback<String>() { // from class: com.sensorsdata.abtest.core.SensorsABTestApiRequestHelper.3
            @Override // com.sensorsdata.abtest.core.IApiCallback
            public void onFailure(int i11, String str2) {
                SALog.m68589i(SensorsABTestApiRequestHelper.TAG, "onFailure error_code: " + i11 + ",message: " + str2);
                IApiCallback iApiCallback2 = iApiCallback;
                if (iApiCallback2 != null) {
                    iApiCallback2.onFailure(i11, str2);
                }
            }

            @Override // com.sensorsdata.abtest.core.IApiCallback
            public void onSuccess(String str2) {
                ConcurrentHashMap<String, Experiment> concurrentHashMapLoadExperimentsFromCache;
                JSONObject jSONObject;
                try {
                    SALog.m68589i(SensorsABTestApiRequestHelper.TAG, String.format("试验返回：response：%s", str2));
                    JSONObject jSONObject2 = new JSONObject(str2);
                    String strOptString = jSONObject2.optString("status");
                    if (TextUtils.equals(AppConstants.AB_TEST_SUCCESS, strOptString)) {
                        SALog.m68589i(SensorsABTestApiRequestHelper.TAG, String.format("获取试验成功：results：%s", JSONUtils.formatJson(jSONObject2.toString())));
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("results");
                        if (jSONArrayOptJSONArray != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("experiments", jSONArrayOptJSONArray);
                            jSONObject.put("distinct_id", SensorsABTestApiRequestHelper.this.mDistinctId);
                        } else {
                            jSONObject = null;
                        }
                        concurrentHashMapLoadExperimentsFromCache = SensorsABTestCacheManager.getInstance().loadExperimentsFromCache(jSONObject != null ? jSONObject.toString() : "");
                        SensorsABTestCacheManager.getInstance().saveFuzzyExperiments(jSONObject2.optJSONArray("fuzzy_experiments"));
                    } else {
                        if (TextUtils.equals("FAILED", strOptString)) {
                            SALog.m68589i(SensorsABTestApiRequestHelper.TAG, String.format("获取试验失败：error_type：%s，error：%s", jSONObject2.optString("error_type"), jSONObject2.optString(Constants.IPC_BUNDLE_KEY_SEND_ERROR)));
                        }
                        concurrentHashMapLoadExperimentsFromCache = null;
                    }
                    IApiCallback iApiCallback2 = iApiCallback;
                    if (iApiCallback2 != null) {
                        iApiCallback2.onSuccess(concurrentHashMapLoadExperimentsFromCache);
                    }
                } catch (Exception unused) {
                    SALog.m68589i(SensorsABTestApiRequestHelper.TAG, String.format("试验数据解析失败，response ：%s！", str2));
                    IApiCallback iApiCallback3 = iApiCallback;
                    if (iApiCallback3 != null) {
                        iApiCallback3.onSuccess(null);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCallbackOnMainThread(final OnABTestReceivedData<?> onABTestReceivedData, final Object obj) {
        try {
            final Method method = onABTestReceivedData.getClass().getMethod("onResult", Object.class);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                method.invoke(onABTestReceivedData, obj);
            } else {
                TaskRunner.getUiThreadHandler().post(new Runnable() { // from class: com.sensorsdata.abtest.core.SensorsABTestApiRequestHelper.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            method.invoke(onABTestReceivedData, obj);
                        } catch (Exception e11) {
                            SALog.printStackTrace(e11);
                        }
                    }
                });
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
