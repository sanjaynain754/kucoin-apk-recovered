package com.sensorsdata.analytics.android.sdk.aop.push;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPIEmptyImplementation;
import com.sensorsdata.analytics.android.sdk.util.ReflectUtil;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class PushAutoTrackHelper {
    private static final String TAG = "SA.PushAutoTrackHelper";
    private static long lastPushClickTime;

    private static boolean isTrackPushEnabled() {
        try {
            if (!(SensorsDataAPI.sharedInstance() instanceof SensorsDataAPIEmptyImplementation) && AbstractSensorsDataAPI.getConfigOptions() != null && AbstractSensorsDataAPI.getConfigOptions().mEnableTrackPush) {
                return true;
            }
            SALog.m68589i(TAG, "SDK or push disabled.");
            return false;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public static void onNotify(NotificationManager notificationManager, String str, int i11, Notification notification) {
        if (isTrackPushEnabled()) {
            try {
                PushProcess.getInstance().onNotify(str, i11, notification);
                SALog.m68589i(TAG, "onNotify");
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void trackNotificationOpenedEvent(String str, String str2, String str3, String str4, String str5) {
        trackNotificationOpenedEvent(str, str2, str3, str4, str5, 0L);
    }

    private static String getSFData(String str) {
        try {
            return new JSONObject(str).optString("sf_data");
        } catch (Exception unused) {
            SALog.m68589i(TAG, "get sf_data failed");
            return null;
        }
    }

    public static void onGeTuiNotificationClicked(Object obj) {
        if (obj == null) {
            SALog.m68589i(TAG, "gtNotificationMessage is null");
            return;
        }
        if (isTrackPushEnabled()) {
            try {
                String str = (String) ReflectUtil.callMethod(obj, "getMessageId", new Object[0]);
                String str2 = (String) ReflectUtil.callMethod(obj, "getTitle", new Object[0]);
                String str3 = (String) ReflectUtil.callMethod(obj, "getContent", new Object[0]);
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                    return;
                }
                PushProcess.getInstance().trackGTClickDelayed(str, str2, str3);
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void onGeTuiReceiveMessageData(Object obj) {
        if (obj == null) {
            SALog.m68589i(TAG, "gtNotificationMessage is null");
            return;
        }
        if (isTrackPushEnabled()) {
            try {
                byte[] bArr = (byte[]) ReflectUtil.callMethod(obj, "getPayload", new Object[0]);
                String str = (String) ReflectUtil.callMethod(obj, "getMessageId", new Object[0]);
                if (bArr == null || TextUtils.isEmpty(str)) {
                    return;
                }
                PushProcess.getInstance().trackReceiveMessageData(new String(bArr), str);
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void onUMengActivityMessage(Intent intent) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        if (intent == null) {
            SALog.m68589i(TAG, "intent is null");
            return;
        }
        if (isTrackPushEnabled()) {
            try {
                String stringExtra = intent.getStringExtra(TtmlNode.TAG_BODY);
                if (TextUtils.isEmpty(stringExtra) || (jSONObjectOptJSONObject = (jSONObject = new JSONObject(stringExtra)).optJSONObject(TtmlNode.TAG_BODY)) == null) {
                    return;
                }
                String strOptString = jSONObject.optString(JAnalysisConstants.ACCOUNT_EXTRA_ATTR);
                String strOptString2 = jSONObjectOptJSONObject.optString("title");
                String strOptString3 = jSONObjectOptJSONObject.optString("text");
                trackNotificationOpenedEvent(getSFData(strOptString), strOptString2, strOptString3, "UMeng", intent.getStringExtra("message_source"));
                SALog.m68589i(TAG, String.format("onUMengActivityMessage is called, title is %s, content is %s, extras is %s", strOptString2, strOptString3, strOptString));
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void onUMengNotificationClick(Object obj) {
        if (obj == null) {
            SALog.m68589i(TAG, "UMessage is null");
            return;
        }
        if (isTrackPushEnabled()) {
            try {
                JSONObject jSONObject = (JSONObject) ReflectUtil.callMethod(obj, "getRaw", new Object[0]);
                if (jSONObject == null) {
                    SALog.m68589i(TAG, "onUMengNotificationClick:raw is null");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_BODY);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObject.optString(JAnalysisConstants.ACCOUNT_EXTRA_ATTR);
                    String strOptString2 = jSONObjectOptJSONObject.optString("title");
                    String strOptString3 = jSONObjectOptJSONObject.optString("text");
                    trackNotificationOpenedEvent(getSFData(strOptString), strOptString2, strOptString3, "UMeng", null);
                    SALog.m68589i(TAG, String.format("onUMengNotificationClick is called, title is %s, content is %s, extras is %s", strOptString2, strOptString3, strOptString));
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void trackGeTuiNotificationClicked(String str, String str2, String str3, long j11) {
        trackNotificationOpenedEvent(str3, str, str2, "GeTui", null, j11);
    }

    public static void trackJPushOpenActivity(Intent intent) {
        if (intent != null && isTrackPushEnabled()) {
            JSONObject jSONObject = null;
            String string = intent.getData() != null ? intent.getData().toString() : null;
            if (TextUtils.isEmpty(string) && intent.getExtras() != null) {
                string = intent.getExtras().getString("JMessageExtra");
            }
            SALog.m68589i(TAG, "trackJPushOpenActivity is called, Intent data is " + string);
            try {
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                try {
                    jSONObject = new JSONObject(string);
                } catch (Exception unused) {
                    SALog.m68589i(TAG, "Failed to construct JSON");
                }
                if (jSONObject != null) {
                    String strOptString = jSONObject.optString("n_title");
                    String strOptString2 = jSONObject.optString("n_content");
                    String strOptString3 = jSONObject.optString("n_extras");
                    String jPushSDKName = PushUtils.getJPushSDKName((byte) jSONObject.optInt("rom_type"));
                    SALog.m68589i(TAG, String.format("trackJPushOpenActivity is called, title is %s, content is %s, extras is %s, appPushChannel is %s", strOptString, strOptString2, strOptString3, jPushSDKName));
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(jPushSDKName)) {
                        trackNotificationOpenedEvent(getSFData(strOptString3), strOptString, strOptString2, "JPush", jPushSDKName);
                    }
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void trackMeizuAppOpenNotification(String str, String str2, String str3, String str4) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        if (!isTrackPushEnabled()) {
            return;
        }
        SALog.m68589i(TAG, String.format("trackMeizuAppOpenNotification is called, title is %s, content is %s, extras is %s, appPushChannel is %s, appPushServiceName is %s", str2, str3, str, "Meizu", str4));
        try {
            try {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception unused) {
                    SALog.m68589i(TAG, "Failed to construct JSON");
                    jSONObject = null;
                }
                if (jSONObject != null && jSONObject.has("JMessageExtra")) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("JMessageExtra");
                    if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("m_content")) != null) {
                        str = jSONObjectOptJSONObject.optString("n_extras");
                    }
                    str4 = "JPush";
                }
                trackNotificationOpenedEvent(getSFData(str), str2, str3, str4, "Meizu");
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    private static void trackNotificationOpenedEvent(String str, String str2, String str3, String str4, String str5, long j11) {
        JSONObject jSONObject;
        try {
            if (isRepeatEvent()) {
                SALog.m68589i(TAG, String.format("$AppPushClick Repeat trigger, title is %s, content is %s, extras is %s, appPushChannel is %s, appPushServiceName is %s", str2, str3, str, str5, str4));
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("$app_push_msg_title", str2);
            jSONObject2.put("$app_push_msg_content", str3);
            jSONObject2.put("$app_push_service_name", str4);
            if (!TextUtils.isEmpty(str5)) {
                jSONObject2.put("$app_push_channel", str5.toUpperCase());
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    jSONObject = null;
                    if (jSONObject != null) {
                        jSONObject2.put("$sf_msg_title", str2);
                        jSONObject2.put("$sf_msg_content", str3);
                        jSONObject2.put("$sf_msg_id", jSONObject.opt("sf_msg_id"));
                        jSONObject2.put("$sf_plan_id", jSONObject.opt("sf_plan_id"));
                        jSONObject2.put("$sf_audience_id", jSONObject.opt("sf_audience_id"));
                        jSONObject2.put("$sf_link_url", jSONObject.opt("sf_link_url"));
                        jSONObject2.put("$sf_plan_strategy_id", jSONObject.opt("sf_plan_strategy_id"));
                        jSONObject2.put("$sf_plan_type", jSONObject.opt("sf_plan_type"));
                        jSONObject2.put("$sf_strategy_unit_id", jSONObject.opt("sf_strategy_unit_id"));
                        jSONObject2.put("$sf_enter_plan_time", jSONObject.opt("sf_enter_plan_time"));
                        jSONObject2.put("$sf_channel_id", jSONObject.opt("sf_channel_id"));
                        jSONObject2.put("$sf_channel_category", jSONObject.opt("sf_channel_category"));
                        jSONObject2.put("$sf_channel_service_name", jSONObject.opt("sf_channel_service_name"));
                    }
                } else {
                    try {
                        SALog.m68589i(TAG, "sfData is " + str);
                        jSONObject = new JSONObject(str);
                    } catch (Exception unused) {
                        SALog.m68589i(TAG, "Failed to construct JSON");
                        jSONObject = null;
                    }
                    if (jSONObject != null && jSONObject.has("sf_plan_id")) {
                        jSONObject2.put("$sf_msg_title", str2);
                        jSONObject2.put("$sf_msg_content", str3);
                        jSONObject2.put("$sf_msg_id", jSONObject.opt("sf_msg_id"));
                        jSONObject2.put("$sf_plan_id", jSONObject.opt("sf_plan_id"));
                        jSONObject2.put("$sf_audience_id", jSONObject.opt("sf_audience_id"));
                        jSONObject2.put("$sf_link_url", jSONObject.opt("sf_link_url"));
                        jSONObject2.put("$sf_plan_strategy_id", jSONObject.opt("sf_plan_strategy_id"));
                        jSONObject2.put("$sf_plan_type", jSONObject.opt("sf_plan_type"));
                        jSONObject2.put("$sf_strategy_unit_id", jSONObject.opt("sf_strategy_unit_id"));
                        jSONObject2.put("$sf_enter_plan_time", jSONObject.opt("sf_enter_plan_time"));
                        jSONObject2.put("$sf_channel_id", jSONObject.opt("sf_channel_id"));
                        jSONObject2.put("$sf_channel_category", jSONObject.opt("sf_channel_category"));
                        jSONObject2.put("$sf_channel_service_name", jSONObject.opt("sf_channel_service_name"));
                    }
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
            if (j11 > 0) {
                try {
                    jSONObject2.put("$time", new Date(j11));
                } catch (Exception e12) {
                    SALog.printStackTrace(e12);
                }
            }
            SensorsDataAPI.sharedInstance().track("$AppPushClick", jSONObject2);
        } catch (Exception e13) {
            SALog.printStackTrace(e13);
        }
    }

    private static void hookIntent(Intent intent) {
        if (isTrackPushEnabled()) {
            try {
                PushProcess.getInstance().hookIntent(intent);
                SALog.m68589i(TAG, "hookIntent");
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void hookIntentGetActivity(Context context, int i11, Intent intent, int i12) {
        hookIntent(intent);
    }

    public static void hookIntentGetActivityBundle(Context context, int i11, Intent intent, int i12, Bundle bundle) {
        hookIntent(intent);
    }

    public static void hookIntentGetBroadcast(Context context, int i11, Intent intent, int i12) {
        hookIntent(intent);
    }

    public static void hookIntentGetForegroundService(Context context, int i11, Intent intent, int i12) {
        hookIntent(intent);
    }

    public static void hookIntentGetService(Context context, int i11, Intent intent, int i12) {
        hookIntent(intent);
    }

    private static void hookPendingIntent(Intent intent, PendingIntent pendingIntent) {
        if (isTrackPushEnabled()) {
            try {
                PushProcess.getInstance().hookPendingIntent(intent, pendingIntent);
                SALog.m68589i(TAG, "hookPendingIntent");
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void hookPendingIntentGetActivity(PendingIntent pendingIntent, Context context, int i11, Intent intent, int i12) {
        hookPendingIntent(intent, pendingIntent);
    }

    public static void hookPendingIntentGetActivityBundle(PendingIntent pendingIntent, Context context, int i11, Intent intent, int i12, Bundle bundle) {
        hookPendingIntent(intent, pendingIntent);
    }

    public static void hookPendingIntentGetBroadcast(PendingIntent pendingIntent, Context context, int i11, Intent intent, int i12) {
        hookPendingIntent(intent, pendingIntent);
    }

    public static void hookPendingIntentGetForegroundService(PendingIntent pendingIntent, Context context, int i11, Intent intent, int i12) {
        hookPendingIntent(intent, pendingIntent);
    }

    public static void hookPendingIntentGetService(PendingIntent pendingIntent, Context context, int i11, Intent intent, int i12) {
        hookPendingIntent(intent, pendingIntent);
    }

    private static boolean isRepeatEvent() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        SALog.m68589i(TAG, "currentTime: " + jElapsedRealtime + ",lastPushClickTime: " + lastPushClickTime);
        if (jElapsedRealtime - lastPushClickTime > 2000) {
            lastPushClickTime = jElapsedRealtime;
            return false;
        }
        return true;
    }

    public static void onBroadcastReceiver(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        onBroadcastServiceIntent(intent);
    }

    private static void onBroadcastServiceIntent(Intent intent) {
        if (isTrackPushEnabled()) {
            try {
                PushProcess.getInstance().onNotificationClick(null, intent);
                SALog.m68589i(TAG, "onBroadcastServiceIntent");
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void onNewIntent(Object obj, Intent intent) {
        if (isTrackPushEnabled()) {
            try {
                if (obj instanceof Activity) {
                    PushProcess.getInstance().onNotificationClick((Activity) obj, intent);
                    SALog.m68589i(TAG, "onNewIntent");
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public static void onServiceStart(Service service, Intent intent, int i11) {
        onBroadcastServiceIntent(intent);
    }

    public static void onServiceStartCommand(Service service, Intent intent, int i11, int i12) {
        onBroadcastServiceIntent(intent);
    }

    public static void trackJPushAppOpenNotification(String str, String str2, String str3, String str4) {
        if (!isTrackPushEnabled()) {
            return;
        }
        SALog.m68589i(TAG, String.format("trackJPushAppOpenNotification is called, title is %s, content is %s, extras is %s, appPushChannel is %s, appPushServiceName is %s", str2, str3, str, str4, "JPush"));
        trackNotificationOpenedEvent(getSFData(str), str2, str3, "JPush", str4);
    }

    public static void onNotify(NotificationManager notificationManager, int i11, Notification notification) {
        if (isTrackPushEnabled()) {
            try {
                onNotify(notificationManager, null, i11, notification);
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }
}
