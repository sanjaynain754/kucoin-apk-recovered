package com.sensorsdata.analytics.android.sdk.internal.rpc;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsDataContentObserver extends ContentObserver {
    public static boolean isDisableFromObserver;
    public static boolean isEnableFromObserver;
    public static boolean isLoginFromObserver;

    public SensorsDataContentObserver() {
        super(new Handler(Looper.getMainLooper()));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11, Uri uri) {
        try {
            if (DbParams.getInstance().getDataCollectUri().equals(uri)) {
                SensorsDataAPI.sharedInstance().enableDataCollect();
                return;
            }
            if (DbParams.getInstance().getSessionTimeUri().equals(uri)) {
                SensorsDataAPI.sharedInstance().setSessionIntervalTime(DbAdapter.getInstance().getSessionIntervalTime());
                return;
            }
            if (DbParams.getInstance().getLoginIdUri().equals(uri)) {
                String loginId = DbAdapter.getInstance().getLoginId();
                if (TextUtils.isEmpty(loginId)) {
                    SensorsDataAPI.sharedInstance().logout();
                    return;
                } else {
                    isLoginFromObserver = true;
                    SensorsDataAPI.sharedInstance().login(loginId);
                    return;
                }
            }
            if (DbParams.getInstance().getDisableSDKUri().equals(uri)) {
                if (!AbstractSensorsDataAPI.getConfigOptions().isDisableSDK()) {
                    isDisableFromObserver = true;
                    SensorsDataAPI.disableSDK();
                    return;
                }
                return;
            }
            if (DbParams.getInstance().getEnableSDKUri().equals(uri) && AbstractSensorsDataAPI.getConfigOptions().isDisableSDK()) {
                isEnableFromObserver = true;
                SensorsDataAPI.enableSDK();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
