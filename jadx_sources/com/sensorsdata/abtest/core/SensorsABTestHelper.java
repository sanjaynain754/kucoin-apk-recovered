package com.sensorsdata.abtest.core;

import android.app.Application;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.abtest.entity.Experiment;
import com.sensorsdata.abtest.util.AlarmManagerUtils;
import com.sensorsdata.abtest.util.SPUtils;
import com.sensorsdata.abtest.util.TaskRunner;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.listener.SAEventListener;
import com.sensorsdata.analytics.android.sdk.listener.SAJSListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsABTestHelper implements SAJSListener, SAEventListener, AppStateManager.AppStateChangedListener {
    private static final String TAG = "SensorsABTestHelper";
    private Context mContext;
    private CountDownTimer mCountDownTimer;

    /* JADX INFO: renamed from: com.sensorsdata.abtest.core.SensorsABTestHelper$1 */
    public class RunnableC276371 implements Runnable {
        public RunnableC276371() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC276371 runnableC276371;
            SensorsABTestHelper.this.cancelTimer();
            if (SensorsABTestHelper.this.mCountDownTimer == null) {
                runnableC276371 = this;
                SensorsABTestHelper.this.mCountDownTimer = new CountDownTimer(120000L, 30000L) { // from class: com.sensorsdata.abtest.core.SensorsABTestHelper.1.1
                    @Override // android.os.CountDownTimer
                    public void onTick(long j11) {
                        new SensorsABTestApiRequestHelper().requestExperimentsAndUpdateCache(null, null, new IApiCallback<Map<String, Experiment>>() { // from class: com.sensorsdata.abtest.core.SensorsABTestHelper.1.1.1
                            @Override // com.sensorsdata.abtest.core.IApiCallback
                            public void onSuccess(Map<String, Experiment> map) {
                                SensorsABTestHelper.this.cancelTimer();
                            }

                            @Override // com.sensorsdata.abtest.core.IApiCallback
                            public void onFailure(int i11, String str) {
                            }
                        });
                    }

                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                    }
                };
            } else {
                runnableC276371 = this;
            }
            SensorsABTestHelper.this.mCountDownTimer.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimer() {
        try {
            CountDownTimer countDownTimer = this.mCountDownTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        } finally {
            this.mCountDownTimer = null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
    public void identify() {
        SALog.m68589i(TAG, "identify");
        if (TextUtils.isEmpty(SensorsDataAPI.sharedInstance().getLoginId())) {
            onDistinctIdChanged();
        } else {
            SALog.m68589i(TAG, "User has login, no need change!");
        }
    }

    public void init(Context context) {
        this.mContext = context;
        SPUtils.getInstance().init(context);
        SensorsABTestCacheManager.getInstance().loadExperimentsFromDiskCache();
        SensorsDataAPI.sharedInstance().addSAJSListener(this);
        SensorsDataAPI.sharedInstance().addEventListener(this);
        requestExperimentsAndUpdateCacheWithRetry();
        if (context instanceof Application) {
            AppStateManager appStateManager = new AppStateManager();
            appStateManager.addAppStateChangedListener(this);
            ((Application) context).registerActivityLifecycleCallbacks(appStateManager);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
    public void login() {
        SALog.m68589i(TAG, FirebaseAnalytics.Event.LOGIN);
        onDistinctIdChanged();
    }

    @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
    public void logout() {
        SALog.m68589i(TAG, "logout");
        onDistinctIdChanged();
    }

    @Override // com.sensorsdata.abtest.core.AppStateManager.AppStateChangedListener
    public void onEnterBackground() {
        SALog.m68589i("AppStartupManager", "onEnterBackground");
        AlarmManagerUtils.getInstance(this.mContext).cancelAlarm();
    }

    @Override // com.sensorsdata.abtest.core.AppStateManager.AppStateChangedListener
    public void onEnterForeground(boolean z11) {
        SALog.m68589i("AppStartupManager", "onEnterForeground");
        AlarmManagerUtils.getInstance(this.mContext).setUpAlarm();
    }

    @Override // com.sensorsdata.analytics.android.sdk.listener.SAJSListener
    public void onReceiveJSMessage(WeakReference<View> weakReference, String str) {
        new SensorsABTestH5Helper(weakReference, str).handlerJSMessage();
    }

    @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
    public void resetAnonymousId() {
        SALog.m68589i(TAG, "resetAnonymousId");
        onDistinctIdChanged();
    }

    @Override // com.sensorsdata.analytics.android.sdk.listener.SAEventListener
    public void trackEvent(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            if (TextUtils.equals("$ABTestTrigger", jSONObject.optString("event")) && (jSONObjectOptJSONObject = jSONObject.optJSONObject("properties")) != null) {
                SALog.m68589i(TAG, String.format("distinct_id is %s,login_id is %s,anonymous_id is %s", jSONObjectOptJSONObject.optString("$abtest_distinct_id"), jSONObjectOptJSONObject.optString("$abtest_login_id"), jSONObjectOptJSONObject.optString("$abtest_anonymous_id")));
                if (jSONObjectOptJSONObject.has("$abtest_distinct_id")) {
                    try {
                        jSONObject.put("distinct_id", jSONObjectOptJSONObject.optString("$abtest_distinct_id"));
                        jSONObjectOptJSONObject.remove("$abtest_distinct_id");
                    } catch (JSONException e11) {
                        SALog.printStackTrace(e11);
                    }
                }
                if (jSONObjectOptJSONObject.has("$abtest_login_id")) {
                    try {
                        jSONObject.put("login_id", jSONObjectOptJSONObject.optString("$abtest_login_id"));
                        jSONObjectOptJSONObject.remove("$abtest_login_id");
                    } catch (JSONException e12) {
                        SALog.printStackTrace(e12);
                    }
                }
                if (jSONObjectOptJSONObject.has("$abtest_anonymous_id")) {
                    try {
                        jSONObject.put("anonymous_id", jSONObjectOptJSONObject.optString("$abtest_anonymous_id"));
                        jSONObjectOptJSONObject.remove("$abtest_anonymous_id");
                    } catch (JSONException e13) {
                        SALog.printStackTrace(e13);
                    }
                }
            }
        } catch (Exception e14) {
            SALog.printStackTrace(e14);
        }
    }

    private void onDistinctIdChanged() {
        try {
            SensorsABTestCacheManager.getInstance().clearCache();
            new SensorsABTestApiRequestHelper().requestExperimentsAndUpdateCache();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void requestExperimentsAndUpdateCacheWithRetry() {
        TaskRunner.getBackHandler().post(new RunnableC276371());
    }
}
