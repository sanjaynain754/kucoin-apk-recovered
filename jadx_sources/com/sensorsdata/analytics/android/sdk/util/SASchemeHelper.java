package com.sensorsdata.analytics.android.sdk.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.sensorsdata.abtest.core.SensorsABTestSchemeHandler;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.ServerUrl;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils;
import com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager;
import com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManagerDebug;

/* JADX INFO: loaded from: classes23.dex */
public class SASchemeHelper {
    private static final String TAG = "SA.SASchemeUtil";

    private static boolean checkProjectIsValid(String str) {
        String queryParameter;
        Uri uri;
        Uri uri2;
        String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
        String queryParameter2 = null;
        if (!TextUtils.isEmpty(str) && (uri2 = Uri.parse(str)) != null) {
            queryParameter = uri2.getQueryParameter("project");
        } else {
            queryParameter = null;
        }
        if (!TextUtils.isEmpty(serverUrl) && (uri = Uri.parse(serverUrl)) != null) {
            queryParameter2 = uri.getQueryParameter("project");
        }
        if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2) && TextUtils.equals(queryParameter, queryParameter2)) {
            return true;
        }
        return false;
    }

    public static void handleSchemeUrl(Activity activity, Intent intent) {
        Uri data;
        String strCheckPublicSecretKey;
        if (AbstractSensorsDataAPI.isSDKDisabled()) {
            SALog.m68589i(TAG, "SDK is disabled,scan code function has been turned off");
            return;
        }
        if (activity != null && intent != null) {
            try {
                data = intent.getData();
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                return;
            }
        } else {
            data = null;
        }
        if (data != null) {
            SensorsDataAPI sensorsDataAPISharedInstance = SensorsDataAPI.sharedInstance();
            String host = data.getHost();
            if ("heatmap".equals(host)) {
                String queryParameter = data.getQueryParameter("feature_code");
                String queryParameter2 = data.getQueryParameter("url");
                if (checkProjectIsValid(queryParameter2)) {
                    SensorsDataDialogUtils.showOpenHeatMapDialog(activity, queryParameter, queryParameter2);
                } else {
                    SensorsDataDialogUtils.showDialog(activity, "App 集成的项目与电脑浏览器打开的项目不同，无法进行点击分析");
                }
                intent.setData(null);
                return;
            }
            if ("debugmode".equals(host)) {
                SensorsDataDialogUtils.showDebugModeSelectDialog(activity, data.getQueryParameter("info_id"), data.getQueryParameter("sf_push_distinct_id"), data.getQueryParameter("project"));
                intent.setData(null);
                return;
            }
            if ("visualized".equals(host)) {
                String queryParameter3 = data.getQueryParameter("feature_code");
                String queryParameter4 = data.getQueryParameter("url");
                if (checkProjectIsValid(queryParameter4)) {
                    SensorsDataDialogUtils.showOpenVisualizedAutoTrackDialog(activity, queryParameter3, queryParameter4);
                } else {
                    SensorsDataDialogUtils.showDialog(activity, "App 集成的项目与电脑浏览器打开的项目不同，无法进行可视化全埋点。");
                }
                intent.setData(null);
                return;
            }
            if ("popupwindow".equals(host)) {
                SensorsDataDialogUtils.showPopupWindowDialog(activity, data);
                intent.setData(null);
                return;
            }
            if ("encrypt".equals(host)) {
                String queryParameter5 = data.getQueryParameter("v");
                String strDecode = Uri.decode(data.getQueryParameter("key"));
                String strDecode2 = Uri.decode(data.getQueryParameter("symmetricEncryptType"));
                String strDecode3 = Uri.decode(data.getQueryParameter("asymmetricEncryptType"));
                SALog.m68587d(TAG, "Encrypt, version = " + queryParameter5 + ", key = " + strDecode + ", symmetricEncryptType = " + strDecode2 + ", asymmetricEncryptType = " + strDecode3);
                if (!TextUtils.isEmpty(queryParameter5) && !TextUtils.isEmpty(strDecode)) {
                    if (sensorsDataAPISharedInstance.getSensorsDataEncrypt() != null) {
                        strCheckPublicSecretKey = sensorsDataAPISharedInstance.getSensorsDataEncrypt().checkPublicSecretKey(queryParameter5, strDecode, strDecode2, strDecode3);
                    } else {
                        strCheckPublicSecretKey = "当前 App 未开启加密，请开启加密后再试";
                    }
                } else {
                    strCheckPublicSecretKey = "密钥验证不通过，所选密钥无效";
                }
                Toast.makeText(activity, strCheckPublicSecretKey, 1).show();
                SensorsDataDialogUtils.startLaunchActivity(activity);
                intent.setData(null);
                return;
            }
            if ("channeldebug".equals(host)) {
                if (ChannelUtils.hasUtmByMetaData(activity)) {
                    SensorsDataDialogUtils.showDialog(activity, "当前为渠道包，无法使用联调诊断工具");
                    return;
                }
                String queryParameter6 = data.getQueryParameter("monitor_id");
                if (TextUtils.isEmpty(queryParameter6)) {
                    SensorsDataDialogUtils.startLaunchActivity(activity);
                    return;
                }
                String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
                if (TextUtils.isEmpty(serverUrl)) {
                    SensorsDataDialogUtils.showDialog(activity, "数据接收地址错误，无法使用联调诊断工具");
                    return;
                }
                ServerUrl serverUrl2 = new ServerUrl(serverUrl);
                if (serverUrl2.getProject().equals(data.getQueryParameter("project_name"))) {
                    String queryParameter7 = data.getQueryParameter("project_id");
                    String queryParameter8 = data.getQueryParameter("account_id");
                    if ("1".equals(data.getQueryParameter("is_relink"))) {
                        if (ChannelUtils.checkDeviceInfo(activity, data.getQueryParameter("device_code"))) {
                            SensorsDataAutoTrackHelper.showChannelDebugActiveDialog(activity);
                        } else {
                            SensorsDataDialogUtils.showDialog(activity, "无法重连，请检查是否更换了联调手机");
                        }
                    } else {
                        SensorsDataDialogUtils.showChannelDebugDialog(activity, serverUrl2.getBaseUrl(), queryParameter6, queryParameter7, queryParameter8);
                    }
                } else {
                    SensorsDataDialogUtils.showDialog(activity, "App 集成的项目与电脑浏览器打开的项目不同，无法使用联调诊断工具");
                }
                intent.setData(null);
                return;
            }
            if ("abtest".equals(host)) {
                try {
                    ReflectUtil.callStaticMethod(SensorsABTestSchemeHandler.class, "handleSchemeUrl", data.toString());
                } catch (Exception e12) {
                    SALog.printStackTrace(e12);
                }
                SensorsDataDialogUtils.startLaunchActivity(activity);
                intent.setData(null);
                return;
            }
            if ("sensorsdataremoteconfig".equals(host)) {
                SensorsDataAPI.sharedInstance().enableLog(true);
                BaseSensorsDataSDKRemoteManager remoteManager = sensorsDataAPISharedInstance.getRemoteManager();
                if (remoteManager != null) {
                    remoteManager.resetPullSDKConfigTimer();
                }
                SensorsDataRemoteManagerDebug sensorsDataRemoteManagerDebug = new SensorsDataRemoteManagerDebug(sensorsDataAPISharedInstance);
                sensorsDataAPISharedInstance.setRemoteManager(sensorsDataRemoteManagerDebug);
                SALog.m68589i(TAG, "Start debugging remote config");
                sensorsDataRemoteManagerDebug.checkRemoteConfig(data, activity);
                intent.setData(null);
                return;
            }
            if ("assistant".equals(host)) {
                SAConfigOptions configOptions = AbstractSensorsDataAPI.getConfigOptions();
                if ((configOptions == null || !configOptions.mDisableDebugAssistant) && "pairingCode".equals(data.getQueryParameter(NotificationCompat.CATEGORY_SERVICE))) {
                    SensorsDataDialogUtils.showPairingCodeInputDialog(activity);
                    return;
                }
                return;
            }
            SensorsDataDialogUtils.startLaunchActivity(activity);
        }
    }
}
