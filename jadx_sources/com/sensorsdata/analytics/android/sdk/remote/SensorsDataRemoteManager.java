package com.sensorsdata.analytics.android.sdk.remote;

import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.encrypt.SensorsDataEncrypt;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.tencent.rmonitor.p145fd.FdLeakMonitor;
import java.security.SecureRandom;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsDataRemoteManager extends BaseSensorsDataSDKRemoteManager {
    private static final String SHARED_PREF_REQUEST_TIME = "sensorsdata.request.time";
    private static final String SHARED_PREF_REQUEST_TIME_RANDOM = "sensorsdata.request.time.random";
    private static final String TAG = "SA.SensorsDataRemoteManager";
    private CountDownTimer mPullSDKConfigCountDownTimer;
    private SharedPreferences mSharedPreferences;

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void resetPullSDKConfigTimer() {
        try {
            CountDownTimer countDownTimer = this.mPullSDKConfigCountDownTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        } finally {
            this.mPullSDKConfigCountDownTimer = null;
        }
    }

    /* JADX INFO: renamed from: com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManager$2 */
    /* JADX INFO: loaded from: classes59.dex */
    public static /* synthetic */ class C277442 {

        /* JADX INFO: renamed from: $SwitchMap$com$sensorsdata$analytics$android$sdk$remote$BaseSensorsDataSDKRemoteManager$RandomTimeType */
        static final /* synthetic */ int[] f56492xd1fcc16c;

        static {
            int[] iArr = new int[BaseSensorsDataSDKRemoteManager.RandomTimeType.values().length];
            f56492xd1fcc16c = iArr;
            try {
                iArr[BaseSensorsDataSDKRemoteManager.RandomTimeType.RandomTimeTypeWrite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56492xd1fcc16c[BaseSensorsDataSDKRemoteManager.RandomTimeType.RandomTimeTypeClean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private SharedPreferences getSharedPreferences() {
        if (this.mSharedPreferences == null) {
            this.mSharedPreferences = SensorsDataUtils.getSharedPreferences(this.mContext);
        }
        return this.mSharedPreferences;
    }

    private void writeRemoteRequestRandomTime() {
        SAConfigOptions sAConfigOptions = this.mSAConfigOptions;
        if (sAConfigOptions == null) {
            return;
        }
        int iNextInt = sAConfigOptions.mMinRequestInterval;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        SAConfigOptions sAConfigOptions2 = this.mSAConfigOptions;
        if (sAConfigOptions2.mMaxRequestInterval > sAConfigOptions2.mMinRequestInterval) {
            SecureRandom secureRandom = new SecureRandom();
            SAConfigOptions sAConfigOptions3 = this.mSAConfigOptions;
            iNextInt += secureRandom.nextInt((sAConfigOptions3.mMaxRequestInterval - sAConfigOptions3.mMinRequestInterval) + 1);
        }
        getSharedPreferences().edit().putLong(SHARED_PREF_REQUEST_TIME, jElapsedRealtime).putInt(SHARED_PREF_REQUEST_TIME_RANDOM, iNextInt).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void pullSDKConfigFromServer() {
        SAConfigOptions sAConfigOptions = this.mSAConfigOptions;
        if (sAConfigOptions == null) {
            return;
        }
        if (sAConfigOptions.mDisableRandomTimeRequestRemoteConfig || sAConfigOptions.mMinRequestInterval > sAConfigOptions.mMaxRequestInterval) {
            requestRemoteConfig(BaseSensorsDataSDKRemoteManager.RandomTimeType.RandomTimeTypeClean, true);
            SALog.m68589i(TAG, "remote config: Request remote config because disableRandomTimeRequestRemoteConfig or minHourInterval greater than maxHourInterval");
            return;
        }
        SensorsDataEncrypt sensorsDataEncrypt = this.mSensorsDataEncrypt;
        if (sensorsDataEncrypt != null && sensorsDataEncrypt.isPublicSecretKeyNull()) {
            requestRemoteConfig(BaseSensorsDataSDKRemoteManager.RandomTimeType.RandomTimeTypeWrite, false);
            SALog.m68589i(TAG, "remote config: Request remote config because encrypt key is null");
        } else if (isRequestValid()) {
            requestRemoteConfig(BaseSensorsDataSDKRemoteManager.RandomTimeType.RandomTimeTypeWrite, true);
            SALog.m68589i(TAG, "remote config: Request remote config because satisfy the random request condition");
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void requestRemoteConfig(BaseSensorsDataSDKRemoteManager.RandomTimeType randomTimeType, final boolean z11) {
        SensorsDataAPI sensorsDataAPI = this.mSensorsDataAPI;
        if (sensorsDataAPI != null && !sensorsDataAPI.isNetworkRequestEnable()) {
            SALog.m68589i(TAG, "Close network request");
            return;
        }
        if (this.mDisableDefaultRemoteConfig) {
            SALog.m68589i(TAG, "disableDefaultRemoteConfig is true");
            return;
        }
        int i11 = C277442.f56492xd1fcc16c[randomTimeType.ordinal()];
        if (i11 == 1) {
            writeRemoteRequestRandomTime();
        } else if (i11 == 2) {
            cleanRemoteRequestRandomTime();
        }
        CountDownTimer countDownTimer = this.mPullSDKConfigCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mPullSDKConfigCountDownTimer = null;
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(FdLeakMonitor.f75245i, 30000L) { // from class: com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManager.1
            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
                SensorsDataRemoteManager.this.requestRemoteConfig(z11, new HttpCallback.StringCallback() { // from class: com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManager.1.1
                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                    public void onFailure(int i12, String str) {
                        if (i12 == 304 || i12 == 404) {
                            SensorsDataRemoteManager.this.resetPullSDKConfigTimer();
                        }
                        SALog.m68589i(SensorsDataRemoteManager.TAG, "Remote request failed,responseCode is " + i12 + ",errorMessage is " + str);
                    }

                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                    public void onResponse(String str) {
                        SensorsDataRemoteManager.this.resetPullSDKConfigTimer();
                        if (!TextUtils.isEmpty(str)) {
                            SensorsDataSDKRemoteConfig sDKRemoteConfig = SensorsDataRemoteManager.this.toSDKRemoteConfig(str);
                            try {
                                SensorsDataEncrypt sensorsDataEncrypt = SensorsDataRemoteManager.this.mSensorsDataEncrypt;
                                if (sensorsDataEncrypt != null) {
                                    sensorsDataEncrypt.saveSecretKey(sDKRemoteConfig.getSecretKey());
                                }
                            } catch (Exception e11) {
                                SALog.printStackTrace(e11);
                            }
                            SensorsDataRemoteManager.this.setSDKRemoteConfig(sDKRemoteConfig);
                        }
                        SALog.m68589i(SensorsDataRemoteManager.TAG, "Remote request was successful,response data is " + str);
                    }

                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                    public void onAfter() {
                    }
                });
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
            }
        };
        this.mPullSDKConfigCountDownTimer = countDownTimer2;
        countDownTimer2.start();
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void setSDKRemoteConfig(SensorsDataSDKRemoteConfig sensorsDataSDKRemoteConfig) {
        try {
            JSONObject jSONObject = new JSONObject();
            String string = sensorsDataSDKRemoteConfig.toJson().toString();
            jSONObject.put("$app_remote_config", string);
            SensorsDataAPI.sharedInstance().trackInternal("$AppRemoteConfigChanged", jSONObject);
            SensorsDataAPI.sharedInstance().flush();
            DbAdapter.getInstance().commitRemoteConfig(string);
            SALog.m68589i(TAG, "Save remote data");
            if (1 == sensorsDataSDKRemoteConfig.getEffectMode()) {
                applySDKConfigFromCache();
                SALog.m68589i(TAG, "The remote configuration takes effect immediately");
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public SensorsDataRemoteManager(SensorsDataAPI sensorsDataAPI) {
        super(sensorsDataAPI);
        SALog.m68589i(TAG, "Construct a SensorsDataRemoteManager");
    }

    private void cleanRemoteRequestRandomTime() {
        getSharedPreferences().edit().putLong(SHARED_PREF_REQUEST_TIME, 0L).putInt(SHARED_PREF_REQUEST_TIME_RANDOM, 0).apply();
    }

    private boolean isRequestValid() {
        try {
            long j11 = getSharedPreferences().getLong(SHARED_PREF_REQUEST_TIME, 0L);
            int i11 = getSharedPreferences().getInt(SHARED_PREF_REQUEST_TIME_RANDOM, 0);
            if (j11 != 0 && i11 != 0) {
                float fElapsedRealtime = SystemClock.elapsedRealtime() - j11;
                if (fElapsedRealtime > 0.0f && fElapsedRealtime / 1000.0f < i11 * 3600) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return true;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void applySDKConfigFromCache() {
        try {
            SensorsDataSDKRemoteConfig sDKRemoteConfig = toSDKRemoteConfig(DbAdapter.getInstance().getRemoteConfig());
            if (SALog.isLogEnabled()) {
                SALog.m68589i(TAG, "Cache remote config is " + sDKRemoteConfig.toString());
            }
            if (this.mSensorsDataAPI != null) {
                if (sDKRemoteConfig.isDisableDebugMode()) {
                    this.mSensorsDataAPI.setDebugMode(SensorsDataAPI.DebugMode.DEBUG_OFF);
                    SALog.m68589i(TAG, "Set DebugOff Mode");
                }
                if (sDKRemoteConfig.isDisableSDK()) {
                    try {
                        this.mSensorsDataAPI.flush();
                        SALog.m68589i(TAG, "DisableSDK is true");
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            }
            BaseSensorsDataSDKRemoteManager.mSDKRemoteConfig = sDKRemoteConfig;
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }
}
