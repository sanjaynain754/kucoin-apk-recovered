package com.sensorsdata.analytics.android.sdk.remote;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.ServerUrl;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataLoadingDialog;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import com.tencent.bugly.proguard.C33556b3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class SensorsDataRemoteManagerDebug extends BaseSensorsDataSDKRemoteManager {
    private static final String TAG = "SA.SensorsDataRemoteManagerDebug";
    private String errorMsg;

    /* JADX INFO: renamed from: com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManagerDebug$1 */
    public class DialogInterfaceOnClickListenerC277451 implements DialogInterface.OnClickListener {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Uri val$uri;

        public DialogInterfaceOnClickListenerC277451(Activity activity, Uri uri) {
            this.val$activity = activity;
            this.val$uri = uri;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            final SensorsDataLoadingDialog sensorsDataLoadingDialog = new SensorsDataLoadingDialog(this.val$activity);
            SensorsDataDialogUtils.dialogShowDismissOld(sensorsDataLoadingDialog);
            SensorsDataRemoteManagerDebug.this.requestRemoteConfig(false, new HttpCallback.StringCallback() { // from class: com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManagerDebug.1.1
                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onFailure(int i12, String str) {
                    sensorsDataLoadingDialog.dismiss();
                    SensorsDataDialogUtils.showDialog(DialogInterfaceOnClickListenerC277451.this.val$activity, "远程配置获取失败，请稍后重新扫描二维码");
                    SALog.m68589i(SensorsDataRemoteManagerDebug.TAG, "remote config: Remote request was failed,code is " + i12 + ",errorMessage is" + str);
                }

                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onResponse(String str) {
                    sensorsDataLoadingDialog.dismiss();
                    if (TextUtils.isEmpty(str)) {
                        SensorsDataDialogUtils.showDialog(DialogInterfaceOnClickListenerC277451.this.val$activity, "远程配置获取失败，请稍后再试");
                    } else {
                        SensorsDataSDKRemoteConfig sDKRemoteConfig = SensorsDataRemoteManagerDebug.this.toSDKRemoteConfig(str);
                        String queryParameter = DialogInterfaceOnClickListenerC277451.this.val$uri.getQueryParameter("nv");
                        if (sDKRemoteConfig.getNewVersion().equals(queryParameter)) {
                            SensorsDataDialogUtils.showDialog(DialogInterfaceOnClickListenerC277451.this.val$activity, "采集控制加载完成，可以通过 Android Studio 控制台日志来调试");
                            SensorsDataRemoteManagerDebug.this.setSDKRemoteConfig(sDKRemoteConfig);
                        } else {
                            SensorsDataDialogUtils.showDialog(DialogInterfaceOnClickListenerC277451.this.val$activity, "信息版本不一致", "获取到采集控制信息的版本：" + sDKRemoteConfig.getNewVersion() + "，二维码信息的版本：" + queryParameter + "，请稍后重新扫描二维码", "确认", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManagerDebug.1.1.1
                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface2, int i12) {
                                    SensorsDataDialogUtils.startLaunchActivity(DialogInterfaceOnClickListenerC277451.this.val$activity);
                                }
                            }, null, null);
                        }
                    }
                    SALog.m68589i(SensorsDataRemoteManagerDebug.TAG, "remote config: Remote request was successful,response data is " + str);
                }

                @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                public void onAfter() {
                }
            });
        }
    }

    private boolean verifyRemoteRequestParameter(Uri uri, Activity activity) {
        boolean z11;
        String queryParameter = uri.getQueryParameter("app_id");
        String queryParameter2 = uri.getQueryParameter(C33556b3.f69078o2);
        String queryParameter3 = uri.getQueryParameter("project");
        String queryParameter4 = uri.getQueryParameter("nv");
        String serverUrl = this.mSensorsDataAPI.getServerUrl();
        String project = !TextUtils.isEmpty(serverUrl) ? new ServerUrl(serverUrl).getProject() : "";
        SALog.m68589i(TAG, "remote config: ServerUrl is " + serverUrl);
        if (NetworkUtils.isNetworkAvailable(this.mContext)) {
            SensorsDataAPI sensorsDataAPI = this.mSensorsDataAPI;
            if (sensorsDataAPI != null && !sensorsDataAPI.isNetworkRequestEnable()) {
                this.errorMsg = "SDK 网络权限已关闭，请允许 SDK 访问网络";
                SALog.m68589i(TAG, "enableNetworkRequest is false");
            } else if (this.mDisableDefaultRemoteConfig) {
                this.errorMsg = "采集控制网络权限已关闭，请允许采集控制访问网络";
                SALog.m68589i(TAG, "disableDefaultRemoteConfig is true");
            } else if (!project.equals(queryParameter3)) {
                this.errorMsg = "App 集成的项目与二维码对应的项目不同，无法进行调试";
            } else if (!KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID.equals(queryParameter2)) {
                this.errorMsg = "App 与二维码对应的操作系统不同，无法进行调试";
            } else {
                if (AppInfoUtils.getProcessName(activity).equals(queryParameter)) {
                    if (TextUtils.isEmpty(queryParameter4)) {
                        this.errorMsg = "二维码信息校验失败，请检查采集控制是否配置正确";
                    } else {
                        z11 = true;
                    }
                    SALog.m68589i(TAG, "remote config: Uri is " + uri.toString());
                    SALog.m68589i(TAG, "remote config: The verification result is " + z11);
                    return z11;
                }
                this.errorMsg = "当前 App 与二维码对应的 App 不同，无法进行调试";
            }
        } else {
            this.errorMsg = "网络连接失败，请检查设备网络，确认网络畅通后，请重新扫描二维码进行调试";
        }
        z11 = false;
        SALog.m68589i(TAG, "remote config: Uri is " + uri.toString());
        SALog.m68589i(TAG, "remote config: The verification result is " + z11);
        return z11;
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void applySDKConfigFromCache() {
        SALog.m68589i(TAG, "remote config: Running applySDKConfigFromCache");
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void pullSDKConfigFromServer() {
        SALog.m68589i(TAG, "remote config: Running pullSDKConfigFromServer");
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void requestRemoteConfig(BaseSensorsDataSDKRemoteManager.RandomTimeType randomTimeType, boolean z11) {
        SALog.m68589i(TAG, "remote config: Running requestRemoteConfig");
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void resetPullSDKConfigTimer() {
        SALog.m68589i(TAG, "remote config: Running resetPullSDKConfigTimer");
    }

    @Override // com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager
    public void setSDKRemoteConfig(SensorsDataSDKRemoteConfig sensorsDataSDKRemoteConfig) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$app_remote_config", sensorsDataSDKRemoteConfig.toJson().put("debug", true).toString());
            SensorsDataAPI.sharedInstance().trackInternal("$AppRemoteConfigChanged", jSONObject);
            SensorsDataAPI.sharedInstance().flush();
            BaseSensorsDataSDKRemoteManager.mSDKRemoteConfig = sensorsDataSDKRemoteConfig;
            SALog.m68589i(TAG, "remote config: The remote configuration takes effect immediately");
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public SensorsDataRemoteManagerDebug(SensorsDataAPI sensorsDataAPI) {
        super(sensorsDataAPI);
        this.errorMsg = "";
        SALog.m68589i(TAG, "remote config: Construct a SensorsDataRemoteManagerDebug");
    }

    public void checkRemoteConfig(Uri uri, final Activity activity) {
        if (verifyRemoteRequestParameter(uri, activity)) {
            SensorsDataDialogUtils.showDialog(activity, "提示", "开始获取采集控制信息", "继续", new DialogInterfaceOnClickListenerC277451(activity, uri), "取消", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.remote.SensorsDataRemoteManagerDebug.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i11) {
                    SensorsDataDialogUtils.startLaunchActivity(activity);
                }
            });
        } else {
            SensorsDataDialogUtils.showDialog(activity, this.errorMsg);
        }
    }
}
