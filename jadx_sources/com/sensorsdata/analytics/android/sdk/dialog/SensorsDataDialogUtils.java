package com.sensorsdata.analytics.android.sdk.dialog;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.webkit.internal.AssetHelper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.ThreadNameConstants;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.advert.utils.OaidHelper;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.visual.HeatMapService;
import com.sensorsdata.analytics.android.sdk.visual.VisualizedAutoTrackService;
import com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditDialog;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsDataDialogUtils {
    private static final String TAG = "SA.SensorsDataDialogUtils";
    private static Dialog sDialog;

    /* JADX INFO: loaded from: classes59.dex */
    public static class SendDebugIdThread extends Thread {
        private String distinctId;
        private String infoId;
        private String serverUrl;

        private void closeStream(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream, BufferedOutputStream bufferedOutputStream, HttpURLConnection httpURLConnection) {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e12) {
                    SALog.printStackTrace(e12);
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (Exception e13) {
                    SALog.printStackTrace(e13);
                }
            }
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception e14) {
                    SALog.printStackTrace(e14);
                }
            }
        }

        private void sendHttpRequest(String str, boolean z11) throws Throwable {
            OutputStream outputStream;
            HttpURLConnection httpURLConnection;
            BufferedOutputStream bufferedOutputStream;
            SSLSocketFactory sSLSocketFactory;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                URL url = new URL(String.format(str + "&info_id=%s", this.infoId));
                SALog.info(SensorsDataDialogUtils.TAG, String.format("DebugMode URL:%s", url), null);
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                try {
                    if (httpURLConnection == null) {
                        SALog.info(SensorsDataDialogUtils.TAG, String.format("can not connect %s,shouldn't happen", url.toString()), null);
                        closeStream(null, null, null, httpURLConnection);
                        return;
                    }
                    SAConfigOptions configOptions = AbstractSensorsDataAPI.getConfigOptions();
                    if (configOptions != null && (sSLSocketFactory = configOptions.mSSLSocketFactory) != null && (httpURLConnection instanceof HttpsURLConnection)) {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream2);
                        String str2 = "{\"distinct_id\": \"" + this.distinctId + "\"}";
                        outputStreamWriter.write(str2);
                        outputStreamWriter.flush();
                        SALog.info(SensorsDataDialogUtils.TAG, String.format("DebugMode request body : %s", str2), null);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-type", AssetHelper.DEFAULT_MIME_TYPE);
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            bufferedOutputStream = new BufferedOutputStream(outputStream);
                            try {
                                bufferedOutputStream.write(byteArrayOutputStream2.toString().getBytes("UTF-8"));
                                bufferedOutputStream.flush();
                                byteArrayOutputStream2.close();
                                int responseCode = httpURLConnection.getResponseCode();
                                SALog.info(SensorsDataDialogUtils.TAG, String.format(Locale.CHINA, "DebugMode 后端的响应码是:%d", Integer.valueOf(responseCode)), null);
                                if (!z11 && NetworkUtils.needRedirects(responseCode)) {
                                    String location = NetworkUtils.getLocation(httpURLConnection, str);
                                    if (!TextUtils.isEmpty(location)) {
                                        closeStream(byteArrayOutputStream2, outputStream, bufferedOutputStream, httpURLConnection);
                                        sendHttpRequest(location, true);
                                    }
                                }
                                closeStream(byteArrayOutputStream2, outputStream, bufferedOutputStream, httpURLConnection);
                            } catch (Exception e11) {
                                e = e11;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                try {
                                    SALog.printStackTrace(e);
                                    closeStream(byteArrayOutputStream, outputStream, bufferedOutputStream, httpURLConnection);
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeStream(byteArrayOutputStream, outputStream, bufferedOutputStream, httpURLConnection);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                closeStream(byteArrayOutputStream, outputStream, bufferedOutputStream, httpURLConnection);
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            bufferedOutputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedOutputStream = null;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        outputStream = null;
                        bufferedOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        outputStream = null;
                        bufferedOutputStream = null;
                    }
                } catch (Exception e14) {
                    e = e14;
                    outputStream = null;
                    bufferedOutputStream = null;
                } catch (Throwable th6) {
                    th = th6;
                    outputStream = null;
                    bufferedOutputStream = null;
                }
            } catch (Exception e15) {
                e = e15;
                outputStream = null;
                httpURLConnection = null;
                bufferedOutputStream = null;
            } catch (Throwable th7) {
                th = th7;
                outputStream = null;
                httpURLConnection = null;
                bufferedOutputStream = null;
            }
        }

        public SendDebugIdThread(String str, String str2, String str3, String str4) {
            super(str4);
            this.distinctId = str2;
            this.infoId = str3;
            this.serverUrl = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            super.run();
            sendHttpRequest(this.serverUrl, false);
        }
    }

    public static void showDialog(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setCancelable(false);
        builder.setNegativeButton(str4, onClickListener2);
        builder.setPositiveButton(str3, onClickListener);
        dialogShowDismissOld(builder.create());
    }

    public static void dialogShowDismissOld(Dialog dialog) {
        try {
            Dialog dialog2 = sDialog;
            if (dialog2 != null && dialog2.isShowing()) {
                try {
                    sDialog.dismiss();
                    SALog.m68589i(TAG, "Dialog dismiss");
                } catch (Exception e11) {
                    SALog.printStackTrace(e11);
                }
            }
            sDialog = dialog;
            dialog.show();
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    public static StateListDrawable getDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#dddddd"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(-1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public static boolean isSchemeActivity(Context context) {
        if (context == null) {
            return false;
        }
        return context instanceof SchemeActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestActiveChannel(String str, String str2, String str3, String str4, String str5, boolean z11, HttpCallback httpCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("monitor_id", str2);
            jSONObject.put("distinct_id", SensorsDataAPI.sharedInstance().getDistinctId());
            jSONObject.put("project_id", str3);
            jSONObject.put("account_id", str4);
            jSONObject.put("has_active", z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
            jSONObject.put("device_code", str5);
            new RequestHelper.Builder(HttpMethod.POST, str + "/api/sdk/channel_tool/url").jsonData(jSONObject.toString()).callback(httpCallback).execute();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void showChannelDebugDialog(final Activity activity, final String str, final String str2, final String str3, final String str4) {
        showDialog(activity, "即将开启联调模式", "", "确定", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                Context applicationContext = activity.getApplicationContext();
                boolean zIsTrackInstallation = ChannelUtils.isTrackInstallation(applicationContext);
                if (zIsTrackInstallation && !ChannelUtils.isCorrectTrackInstallation(applicationContext)) {
                    SensorsDataDialogUtils.showChannelDebugErrorDialog(activity);
                    return;
                }
                String androidID = SensorsDataUtils.getAndroidID(applicationContext);
                String oaid = OaidHelper.getOAID(applicationContext);
                if (zIsTrackInstallation && !ChannelUtils.isGetDeviceInfo(applicationContext, androidID, oaid)) {
                    SensorsDataDialogUtils.showChannelDebugErrorDialog(activity);
                    return;
                }
                if (!NetworkUtils.isNetworkAvailable(applicationContext)) {
                    SensorsDataDialogUtils.showDialog(activity, "当前网络不可用，请检查网络！");
                    return;
                }
                String deviceInfo = ChannelUtils.getDeviceInfo(activity, androidID, oaid);
                final SensorsDataLoadingDialog sensorsDataLoadingDialog = new SensorsDataLoadingDialog(activity);
                SensorsDataDialogUtils.dialogShowDismissOld(sensorsDataLoadingDialog);
                SensorsDataDialogUtils.requestActiveChannel(str, str2, str3, str4, deviceInfo, zIsTrackInstallation, new HttpCallback.JsonCallback() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.1.1
                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                    public void onFailure(int i12, String str5) {
                        sensorsDataLoadingDialog.dismiss();
                        SALog.m68589i(SensorsDataDialogUtils.TAG, "ChannelDebug request error:" + str5);
                        SensorsDataDialogUtils.showDialog(activity, "网络异常,请求失败!");
                    }

                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                    public void onResponse(JSONObject jSONObject) {
                        sensorsDataLoadingDialog.dismiss();
                        if (jSONObject == null) {
                            SALog.m68589i(SensorsDataDialogUtils.TAG, "ChannelDebug response error msg: response is null");
                            SensorsDataDialogUtils.showDialog(activity, "添加白名单请求失败，请联系神策技术支持人员排查问题!");
                        } else {
                            if (jSONObject.optInt("code", 0) == 1) {
                                SensorsDataAutoTrackHelper.showChannelDebugActiveDialog(activity);
                                return;
                            }
                            SALog.m68589i(SensorsDataDialogUtils.TAG, "ChannelDebug response error msg:" + jSONObject.optString("message"));
                            SensorsDataDialogUtils.showDialog(activity, "添加白名单请求失败，请联系神策技术支持人员排查问题!");
                        }
                    }
                });
            }
        }, "取消", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showChannelDebugErrorDialog(final Activity activity) {
        showDialog(activity, "检测到 “设备码为空”，可能原因如下，请排查：", "1. 开启 App 时拒绝“电话”授权；\n2. 手机系统权限设置中是否关闭“电话”授权；\n3. 请联系研发人员确认是否“调用 trackInstallation 接口在获取“电话”授权之后。\n\n 排查修复后，请先卸载应用并重新安装，再扫码进行联调。", "确定", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        }, null, null);
    }

    public static void showDebugModeSelectDialog(final Activity activity, final String str, final String str2, final String str3) {
        try {
            DebugModeSelectDialog debugModeSelectDialog = new DebugModeSelectDialog(activity, SensorsDataAPI.sharedInstance().getDebugMode());
            debugModeSelectDialog.setCanceledOnTouchOutside(false);
            debugModeSelectDialog.setOnDebugModeDialogClickListener(new DebugModeSelectDialog.OnDebugModeViewClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.4
                @Override // com.sensorsdata.analytics.android.sdk.dialog.DebugModeSelectDialog.OnDebugModeViewClickListener
                public void onCancel(Dialog dialog) {
                    dialog.cancel();
                }

                @Override // com.sensorsdata.analytics.android.sdk.dialog.DebugModeSelectDialog.OnDebugModeViewClickListener
                public void setDebugMode(Dialog dialog, SensorsDataAPI.DebugMode debugMode) {
                    SensorsDataAPI.sharedInstance().setDebugMode(debugMode);
                    dialog.cancel();
                }
            });
            debugModeSelectDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.5
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    String str4;
                    String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
                    SensorsDataAPI.DebugMode debugMode = SensorsDataAPI.sharedInstance().getDebugMode();
                    if (SensorsDataAPI.sharedInstance().isNetworkRequestEnable() && !TextUtils.isEmpty(serverUrl) && !TextUtils.isEmpty(str) && debugMode != SensorsDataAPI.DebugMode.DEBUG_OFF) {
                        if (TextUtils.isEmpty(str2)) {
                            new SendDebugIdThread(serverUrl, SensorsDataAPI.sharedInstance().getDistinctId(), str, ThreadNameConstants.THREAD_SEND_DISTINCT_ID).start();
                        } else {
                            try {
                                if (!TextUtils.isEmpty(str3)) {
                                    String str5 = str2 + "?project=" + str3;
                                    SALog.m68589i(SensorsDataDialogUtils.TAG, "sf url:" + str5);
                                    new SendDebugIdThread(str5, SensorsDataAPI.sharedInstance().getDistinctId(), str, ThreadNameConstants.THREAD_SEND_DISTINCT_ID).start();
                                }
                            } catch (Exception e11) {
                                SALog.printStackTrace(e11);
                            }
                        }
                    }
                    if (debugMode == SensorsDataAPI.DebugMode.DEBUG_OFF) {
                        str4 = "已关闭调试模式，请重新扫描二维码进行开启";
                    } else if (debugMode == SensorsDataAPI.DebugMode.DEBUG_ONLY) {
                        str4 = "开启调试模式，校验数据，但不进行数据导入；关闭 App 进程后，将自动关闭调试模式";
                    } else if (debugMode == SensorsDataAPI.DebugMode.DEBUG_AND_TRACK) {
                        str4 = "开启调试模式，校验数据，并将数据导入到神策分析中；关闭 App 进程后，将自动关闭调试模式";
                    } else {
                        str4 = "";
                    }
                    Toast.makeText(activity, str4, 1).show();
                    SALog.info(SensorsDataDialogUtils.TAG, "您当前的调试模式是：" + debugMode, null);
                    SensorsDataDialogUtils.startLaunchActivity(activity);
                }
            });
            dialogShowDismissOld(debugModeSelectDialog);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void showPairingCodeInputDialog(final Context context) {
        if (context == null) {
            SALog.m68589i(TAG, "The argument context can't be null");
        } else if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.11
                @Override // java.lang.Runnable
                public void run() {
                    new PairingCodeEditDialog(context).show();
                }
            });
        } else {
            SALog.m68589i(TAG, "The static method showPairingCodeEditDialog(Context context) only accepts Activity as a parameter");
        }
    }

    public static void showPopupWindowDialog(Activity activity, Uri uri) {
        try {
            Class<?> cls = Class.forName("com.sensorsdata.sf.ui.utils.PreviewUtil");
            String queryParameter = uri.getQueryParameter("sf_popup_test");
            cls.getDeclaredMethod("showPreview", Context.class, Boolean.TYPE, String.class).invoke(null, activity, Boolean.valueOf(!TextUtils.isEmpty(queryParameter) ? Boolean.parseBoolean(queryParameter) : false), uri.getQueryParameter("popup_window_id"));
            SchemeActivity.isPopWindow = true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            startLaunchActivity(activity);
        }
    }

    public static void showOpenHeatMapDialog(final Activity activity, final String str, final String str2) {
        boolean zEquals;
        try {
            if (!SensorsDataAPI.sharedInstance().isNetworkRequestEnable()) {
                showDialog(activity, "已关闭网络请求（NetworkRequest），无法使用 App 点击分析，请开启后再试！");
                return;
            }
            if (!SensorsDataAPI.sharedInstance().isHeatMapEnabled()) {
                showDialog(activity, "SDK 没有被正确集成，请联系贵方技术人员开启点击分析。");
                return;
            }
            if (!SensorsDataAPI.sharedInstance().isAppHeatMapConfirmDialogEnabled()) {
                HeatMapService.getInstance().start(activity, str, str2);
                startLaunchActivity(activity);
                return;
            }
            try {
                zEquals = "WIFI".equals(NetworkUtils.networkType(activity));
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                zEquals = false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("提示");
            if (zEquals) {
                builder.setMessage("正在连接 App 点击分析...");
            } else {
                builder.setMessage("正在连接 App 点击分析，建议在 WiFi 环境下使用。");
            }
            builder.setCancelable(false);
            builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.6
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i11) {
                    SensorsDataDialogUtils.startLaunchActivity(activity);
                }
            });
            builder.setPositiveButton("继续", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i11) {
                    HeatMapService.getInstance().start(activity, str, str2);
                    SensorsDataDialogUtils.startLaunchActivity(activity);
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            dialogShowDismissOld(alertDialogCreate);
            try {
                alertDialogCreate.getButton(-2).setTextColor(ViewCompat.MEASURED_STATE_MASK);
                alertDialogCreate.getButton(-2).setBackgroundColor(-1);
                alertDialogCreate.getButton(-1).setTextColor(SupportMenu.CATEGORY_MASK);
                alertDialogCreate.getButton(-1).setBackgroundColor(-1);
                alertDialogCreate.getButton(-2).setBackground(getDrawable());
                alertDialogCreate.getButton(-1).setBackground(getDrawable());
            } catch (Exception e12) {
                SALog.printStackTrace(e12);
            }
        } catch (Exception e13) {
            SALog.printStackTrace(e13);
        }
    }

    public static void showOpenVisualizedAutoTrackDialog(final Activity activity, final String str, final String str2) {
        boolean zEquals;
        try {
            if (!SensorsDataAPI.sharedInstance().isNetworkRequestEnable()) {
                showDialog(activity, "已关闭网络请求（NetworkRequest），无法使用 App 可视化全埋点，请开启后再试！");
                return;
            }
            if (!SensorsDataAPI.sharedInstance().isVisualizedAutoTrackEnabled()) {
                showDialog(activity, "SDK 没有被正确集成，请联系贵方技术人员开启可视化全埋点。");
                return;
            }
            if (!SensorsDataAPI.sharedInstance().isVisualizedAutoTrackConfirmDialogEnabled()) {
                VisualizedAutoTrackService.getInstance().start(activity, str, str2);
                startLaunchActivity(activity);
                return;
            }
            try {
                zEquals = "WIFI".equals(NetworkUtils.networkType(activity));
            } catch (Exception unused) {
                zEquals = false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("提示");
            if (zEquals) {
                builder.setMessage("正在连接 App 可视化全埋点...");
            } else {
                builder.setMessage("正在连接 App 可视化全埋点，建议在 WiFi 环境下使用。");
            }
            builder.setCancelable(false);
            builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.8
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i11) {
                    SensorsDataDialogUtils.startLaunchActivity(activity);
                }
            });
            builder.setPositiveButton("继续", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.9
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i11) {
                    VisualizedAutoTrackService.getInstance().start(activity, str, str2);
                    SensorsDataDialogUtils.startLaunchActivity(activity);
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            dialogShowDismissOld(alertDialogCreate);
            try {
                alertDialogCreate.getButton(-2).setTextColor(ViewCompat.MEASURED_STATE_MASK);
                alertDialogCreate.getButton(-2).setBackgroundColor(-1);
                alertDialogCreate.getButton(-1).setTextColor(SupportMenu.CATEGORY_MASK);
                alertDialogCreate.getButton(-1).setBackgroundColor(-1);
                alertDialogCreate.getButton(-2).setBackground(getDrawable());
                alertDialogCreate.getButton(-1).setBackground(getDrawable());
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    public static void startLaunchActivity(Context context) {
        try {
            if (isSchemeActivity(context)) {
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()));
                ((SchemeActivity) context).finish();
                SALog.m68589i(TAG, "startLaunchActivity");
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void showDialog(final Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("提示").setMessage(str).setCancelable(false).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                SensorsDataDialogUtils.startLaunchActivity(context);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        dialogShowDismissOld(alertDialogCreate);
        try {
            alertDialogCreate.getButton(-1).setTextColor(SupportMenu.CATEGORY_MASK);
            alertDialogCreate.getButton(-1).setBackgroundColor(-1);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
