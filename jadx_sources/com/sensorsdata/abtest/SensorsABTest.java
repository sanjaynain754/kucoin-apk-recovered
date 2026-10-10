package com.sensorsdata.abtest;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.sensorsdata.abtest.core.SABErrorDispatcher;
import com.sensorsdata.abtest.core.SensorsABTestApiRequestHelper;
import com.sensorsdata.abtest.core.SensorsABTestCacheManager;
import com.sensorsdata.abtest.core.SensorsABTestHelper;
import com.sensorsdata.abtest.entity.SABErrorEnum;
import com.sensorsdata.abtest.util.AppInfoUtils;
import com.sensorsdata.abtest.util.TaskRunner;
import com.sensorsdata.abtest.util.UrlUtil;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.TrackTaskManager;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsABTest implements ISensorsABTestApi {
    private static final String TAG = "SAB.SensorsABTest";
    protected static final int TIMEOUT_REQUEST = 30000;
    private static SensorsABTest sInstance;
    private SensorsABTestConfigOptions mConfigOptions;
    private Context mContext;

    private SensorsABTest(Context context, SensorsABTestConfigOptions sensorsABTestConfigOptions) {
        try {
            this.mContext = context.getApplicationContext();
            this.mConfigOptions = sensorsABTestConfigOptions;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void asyncFetchABTest(String str, T t11, OnABTestReceivedData<T> onABTestReceivedData) {
        asyncFetchABTestInner(str, t11, null, 30000, onABTestReceivedData);
    }

    @Override // com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void fastFetchABTest(String str, T t11, OnABTestReceivedData<T> onABTestReceivedData) {
        fastFetchABTestInner(str, t11, null, 30000, onABTestReceivedData);
    }

    private <T> void asyncFetchABTestInner(final String str, final T t11, final Map<String, Object> map, final int i11, final OnABTestReceivedData<T> onABTestReceivedData) {
        try {
            addTrackEventTask(new Runnable() { // from class: com.sensorsdata.abtest.SensorsABTest.1
                @Override // java.lang.Runnable
                public void run() {
                    SensorsABTest.this.requestExperimentWithParams(str, t11, map, i11, onABTestReceivedData, false);
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private <T> void fastFetchABTestInner(final String str, final T t11, final Map<String, Object> map, final int i11, final OnABTestReceivedData<T> onABTestReceivedData) {
        try {
            addTrackEventTask(new Runnable() { // from class: com.sensorsdata.abtest.SensorsABTest.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        final Object experimentVariableValue = SensorsABTestCacheManager.getInstance().getExperimentVariableValue(str, t11);
                        if (experimentVariableValue == null || onABTestReceivedData == null) {
                            SensorsABTest.this.requestExperimentWithParams(str, t11, map, i11, onABTestReceivedData, true);
                        } else {
                            TaskRunner.getUiThreadHandler().post(new Runnable() { // from class: com.sensorsdata.abtest.SensorsABTest.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    onABTestReceivedData.onResult(experimentVariableValue);
                                }
                            });
                        }
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void requestExperimentWithParams(String str, T t11, Map<String, Object> map, int i11, OnABTestReceivedData<T> onABTestReceivedData, boolean z11) {
        int iMax;
        try {
            if (i11 > 0) {
                SALog.m68589i(TAG, "timeoutMillSeconds minimum value is 1000ms");
                iMax = Math.max(1000, i11);
            } else {
                SALog.m68589i(TAG, "timeoutMillSeconds params is not valid: <= 0 and set default value: 30000");
                iMax = 30000;
            }
            int i12 = iMax;
            SALog.m68589i(TAG, "asyncFetchABTest request param name: " + str + ",default value: " + t11 + ",timeoutMillSeconds: " + i12);
            new SensorsABTestApiRequestHelper().requestExperimentByParamName(SensorsDataAPI.sharedInstance().getDistinctId(), SensorsDataAPI.sharedInstance().getLoginId(), SensorsDataAPI.sharedInstance().getAnonymousId(), str, t11, map, i12, onABTestReceivedData, z11);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static SensorsABTest shareInstance() {
        SensorsABTest sensorsABTest = sInstance;
        if (sensorsABTest != null) {
            return sensorsABTest;
        }
        Log.i(TAG, "startWithConfigOptions(Context context, SensorsABTestConfigOptions configOptions) 接口调用失败，A/B Testing SDK 未初始化");
        return new SensorsABTestEmptyImplementation();
    }

    public static synchronized void startWithConfigOptions(Context context, SensorsABTestConfigOptions sensorsABTestConfigOptions) {
        if (sInstance != null) {
            SALog.m68589i(TAG, "A/B Testing SDK 重复初始化！只有第一次初始化有效！");
            return;
        }
        if (context == null) {
            SABErrorDispatcher.dispatchSABException(SABErrorEnum.SDK_NULL_CONTEXT, new Object[0]);
            return;
        }
        if (sensorsABTestConfigOptions == null) {
            SABErrorDispatcher.dispatchSABException(SABErrorEnum.SDK_NULL_SENSORS_AB_TEST_CONFIG_OPTIONS, new Object[0]);
            return;
        }
        String url = sensorsABTestConfigOptions.getUrl();
        String apiBaseUrl = UrlUtil.getApiBaseUrl(url);
        if (!TextUtils.isEmpty(apiBaseUrl) && !apiBaseUrl.trim().equals("")) {
            String projectKey = UrlUtil.getProjectKey(url);
            if (!TextUtils.isEmpty(projectKey) && !projectKey.trim().equals("")) {
                if (AppInfoUtils.checkSASDKVersionIsValid()) {
                    try {
                        SALog.m68589i(TAG, String.format("A/B Testing SDK 初始化成功，试验 URL：%s", sensorsABTestConfigOptions.getUrl()));
                        sInstance = new SensorsABTest(context.getApplicationContext(), sensorsABTestConfigOptions);
                        new SensorsABTestHelper().init(context.getApplicationContext());
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                    return;
                }
                return;
            }
            SABErrorDispatcher.dispatchSABException(SABErrorEnum.SDK_NULL_KEY_OF_SENSORS_AB_TEST_CONFIG_OPTIONS, new Object[0]);
            return;
        }
        SABErrorDispatcher.dispatchSABException(SABErrorEnum.SDK_NULL_BASE_URL_OF_SENSORS_AB_TEST_CONFIG_OPTIONS, new Object[0]);
    }

    @Override // com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void asyncFetchABTest(String str, T t11, int i11, OnABTestReceivedData<T> onABTestReceivedData) {
        asyncFetchABTestInner(str, t11, null, i11, onABTestReceivedData);
    }

    @Override // com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void fastFetchABTest(String str, T t11, int i11, OnABTestReceivedData<T> onABTestReceivedData) {
        fastFetchABTestInner(str, t11, null, i11, onABTestReceivedData);
    }

    @Override // com.sensorsdata.abtest.ISensorsABTestApi
    public <T> T fetchCacheABTest(String str, T t11) {
        try {
            SALog.m68589i(TAG, "fetchCacheABTest param name: " + str + ",default value: " + t11);
            T t12 = (T) SensorsABTestCacheManager.getInstance().getExperimentVariableValue(str, t11);
            return t12 != null ? t12 : t11;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return t11;
        }
    }

    public SensorsABTestConfigOptions getConfigOptions() {
        return this.mConfigOptions;
    }

    public Context getContext() {
        return this.mContext;
    }

    private static void addTrackEventTask(Runnable runnable) {
        try {
            TrackTaskManager trackTaskManager = TrackTaskManager.getInstance();
            if (trackTaskManager != null) {
                Method declaredMethod = trackTaskManager.getClass().getDeclaredMethod("addTrackEventTask", Runnable.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(trackTaskManager, runnable);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void asyncFetchABTest(SensorsABTestExperiment<T> sensorsABTestExperiment, OnABTestReceivedData<T> onABTestReceivedData) {
        if (sensorsABTestExperiment == null) {
            SALog.m68589i(TAG, "experiment is null, check your param please!");
        } else {
            asyncFetchABTestInner(sensorsABTestExperiment.paramName, sensorsABTestExperiment.defaultValue, sensorsABTestExperiment.properties, sensorsABTestExperiment.timeoutMillSeconds, onABTestReceivedData);
        }
    }

    @Override // com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void fastFetchABTest(SensorsABTestExperiment<T> sensorsABTestExperiment, OnABTestReceivedData<T> onABTestReceivedData) {
        if (sensorsABTestExperiment == null) {
            SALog.m68589i(TAG, "experiment is null, check your param please!");
        } else {
            fastFetchABTestInner(sensorsABTestExperiment.paramName, sensorsABTestExperiment.defaultValue, sensorsABTestExperiment.properties, sensorsABTestExperiment.timeoutMillSeconds, onABTestReceivedData);
        }
    }

    public SensorsABTest() {
    }
}
