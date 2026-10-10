package com.sensorsdata.analytics.android.sdk.visual.property;

import android.content.Context;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.tencent.rmonitor.p145fd.FdLeakMonitor;

/* JADX INFO: loaded from: classes59.dex */
public class VisualConfigRequestHelper {
    private static final String TAG = "SA.VP.VisualConfigRequestHelper";
    private CountDownTimer mCountDownTimer;

    public interface IApiCallback {
        void onSuccess(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimer() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public String getRequestUrl(Context context, String str) {
        String str2;
        if (context == null) {
            SALog.m68589i(TAG, "getRequestUrl context is null and return");
            return null;
        }
        String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
        if (TextUtils.isEmpty(serverUrl)) {
            SALog.m68589i(TAG, "visualConfigRequest server url is null and return");
            return null;
        }
        int iLastIndexOf = serverUrl.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            str2 = serverUrl.substring(0, iLastIndexOf) + "/config/visualized/Android.conf";
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str2).buildUpon();
        if (!TextUtils.isEmpty(str)) {
            builderBuildUpon.appendQueryParameter("v", str);
        }
        String queryParameter = Uri.parse(serverUrl).getQueryParameter("project");
        if (!TextUtils.isEmpty(queryParameter)) {
            builderBuildUpon.appendQueryParameter("project", queryParameter);
        }
        String processName = AppInfoUtils.getProcessName(context);
        if (!TextUtils.isEmpty(processName)) {
            builderBuildUpon.appendQueryParameter("app_id", processName);
        }
        return builderBuildUpon.build().toString();
    }

    public void requestVisualConfig(final Context context, final String str, final IApiCallback iApiCallback) {
        if (!SensorsDataAPI.sharedInstance().isNetworkRequestEnable()) {
            SALog.m68589i(TAG, "Close network request");
            return;
        }
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mCountDownTimer = null;
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(FdLeakMonitor.f75245i, 30000L) { // from class: com.sensorsdata.analytics.android.sdk.visual.property.VisualConfigRequestHelper.1
            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
                try {
                    if (!TextUtils.isEmpty(SensorsDataAPI.sharedInstance().getServerUrl())) {
                        String requestUrl = VisualConfigRequestHelper.this.getRequestUrl(context, str);
                        if (TextUtils.isEmpty(requestUrl)) {
                            SALog.m68589i(VisualConfigRequestHelper.TAG, "visualConfigRequest request url is null and return");
                            return;
                        } else {
                            new RequestHelper.Builder(HttpMethod.GET, requestUrl).callback(new HttpCallback.StringCallback() { // from class: com.sensorsdata.analytics.android.sdk.visual.property.VisualConfigRequestHelper.1.1
                                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                                public void onFailure(int i11, String str2) {
                                    if (i11 == 304 || i11 == 404 || i11 == 205) {
                                        VisualConfigRequestHelper.this.resetTimer();
                                        if (i11 == 205) {
                                            VisualPropertiesManager.getInstance().save2Cache("");
                                        }
                                        SALog.m68589i(VisualConfigRequestHelper.TAG, "requestVisualConfig return 304 Or 404");
                                    }
                                }

                                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                                public void onResponse(String str2) {
                                    VisualConfigRequestHelper.this.resetTimer();
                                    IApiCallback iApiCallback2 = iApiCallback;
                                    if (iApiCallback2 != null) {
                                        iApiCallback2.onSuccess(str2);
                                    }
                                    SALog.m68589i(VisualConfigRequestHelper.TAG, "requestVisualConfig success response is " + str2);
                                }

                                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                                public void onAfter() {
                                }
                            }).execute();
                            return;
                        }
                    }
                    SALog.m68589i(VisualConfigRequestHelper.TAG, "visualConfigRequest server url is null and return");
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
            }
        };
        this.mCountDownTimer = countDownTimer2;
        countDownTimer2.start();
    }
}
