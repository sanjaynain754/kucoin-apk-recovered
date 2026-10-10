package cn.jiguang.privates.push.platform.google.callback;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.push.JPush;
import cn.jiguang.privates.push.api.CustomMessage;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.api.NotificationMessage;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.platform.google.business.JGoogleBusiness;
import cn.jiguang.privates.push.utils.NotificationUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JGoogleCallback extends FirebaseMessagingService {
    private static final String TAG = "JGoogleCallback";

    private CustomMessage buildCustomMessage(@NonNull RemoteMessage remoteMessage) {
        try {
            String messageId = remoteMessage.getMessageId();
            String str = remoteMessage.getData().get("JMessageExtra");
            if (str == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            JCommonLog.m5430d(TAG, "onMessage:" + JCommonLog.toLogString(jSONObject));
            String messageId2 = NotificationUtil.getMessageId(jSONObject);
            String strOptString = jSONObject.optString("title");
            String strOptString2 = jSONObject.optString("message");
            return new CustomMessage().setMessageId(messageId2).setPlatform((byte) 8).setPlatformMessageId(messageId).setTitle(strOptString).setContent(strOptString2).setContentType(jSONObject.optString(FirebaseAnalytics.Param.CONTENT_TYPE)).setExtras(NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("extras")));
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onMessage failed " + th2.getMessage());
            return null;
        }
    }

    private NotificationMessage buildNotificationMessage(RemoteMessage remoteMessage) {
        String strOptString;
        try {
            String messageId = remoteMessage.getMessageId();
            Map<String, String> data = remoteMessage.getData();
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            String str = data.get("JMessageExtra");
            if (str == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            JCommonLog.m5430d(TAG, "onMessage:" + JCommonLog.toLogString(jSONObject));
            String messageId2 = NotificationUtil.getMessageId(jSONObject);
            RemoteMessage.Notification notification = remoteMessage.getNotification();
            JCommonLog.m5430d(TAG, "is notification");
            int notificationId = NotificationUtil.getNotificationId(messageId2);
            String title = notification.getTitle();
            String body = notification.getBody();
            Bundle bundleConvertJsonToBundle = NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("n_extras"));
            int iOptInt = jSONObject.optInt("n_alert_type");
            int iOptInt2 = jSONObject.optInt("n_priority");
            String strOptString2 = jSONObject.optString("n_sound");
            String strOptString3 = jSONObject.optString("n_channel_id");
            try {
                if (JPushPrivatesApi.SDK_VERSION_NAME.startsWith("3")) {
                    String clickAction = notification.getClickAction();
                    if (TextUtils.isEmpty(clickAction)) {
                        strOptString = "";
                    } else {
                        Intent intent = new Intent();
                        intent.setAction(clickAction);
                        intent.putExtras(bundle);
                        intent.setPackage(getApplicationContext().getPackageName());
                        strOptString = intent.toURI();
                    }
                } else {
                    strOptString = jSONObject.optString("n_intent_uri");
                }
                return new NotificationMessage().setMessageId(messageId2).setPlatform((byte) 8).setPlatformMessageId(messageId).setNotificationId(notificationId).setTitle(title).setContent(body).setExtras(bundleConvertJsonToBundle).setDefaults(iOptInt).setPriority(iOptInt2).setSound(strOptString2).setChannelId(strOptString3).setIntentUri(strOptString);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        JCommonLog.m5433w(TAG, "onMessage failed " + th.getMessage());
        return 0;
    }

    @NonNull
    private static Bundle getArrivedBundle(@NonNull RemoteMessage remoteMessage, NotificationMessage notificationMessage, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", notificationMessage);
        bundle.putBoolean(JPushConstants.Message.KEY_MESSAGE_LIMIT, true);
        bundle.putLong("itime", System.currentTimeMillis() / 1000);
        bundle.putInt(JPushConstants.Message.KEY_FOREGROUND, z11 ? 1 : 2);
        bundle.putLong(JPushConstants.Message.TYPE_PLATFORM_SENT_TIME, remoteMessage.getSentTime());
        return bundle;
    }

    public void onMessageArrived(@NonNull RemoteMessage remoteMessage) {
        try {
            if (remoteMessage.getNotification() == null) {
                JCommonLog.m5430d(TAG, "is data");
                return;
            }
            NotificationMessage notificationMessageBuildNotificationMessage = buildNotificationMessage(remoteMessage);
            if (notificationMessageBuildNotificationMessage == null) {
                return;
            }
            Bundle arrivedBundle = getArrivedBundle(remoteMessage, notificationMessageBuildNotificationMessage, false);
            JPushPrivatesApi.initObserver(this);
            JCommonPrivatesApi.sendMessage(getApplicationContext(), JPush.THREAD_PUSH, JPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED, arrivedBundle);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onMessage failed " + th2.getMessage());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        try {
            if (remoteMessage.getNotification() == null) {
                JCommonLog.m5430d(TAG, "is data");
                CustomMessage customMessageBuildCustomMessage = buildCustomMessage(remoteMessage);
                if (customMessageBuildCustomMessage == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("message", customMessageBuildCustomMessage);
                JCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), 3001, bundle);
                return;
            }
            NotificationMessage notificationMessageBuildNotificationMessage = buildNotificationMessage(remoteMessage);
            if (notificationMessageBuildNotificationMessage == null) {
                return;
            }
            JGoogleMessageHelper.addMessageId(remoteMessage.getMessageId());
            JPushPrivatesApi.init(this);
            Bundle arrivedBundle = getArrivedBundle(remoteMessage, notificationMessageBuildNotificationMessage, true);
            JCommonPrivatesApi.sendMessageToRemoteProcess(getApplicationContext(), JPushConstants.RemoteWhat.SHOW_NOTIFICATION, arrivedBundle);
            JCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), 3002, arrivedBundle);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onMessage failed " + th2.getMessage());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(@NonNull Intent intent) {
        try {
            super.handleIntent(intent);
            RemoteMessage remoteMessageHandleMessageIntent = JGoogleMessageHelper.handleMessageIntent(this, intent);
            if (remoteMessageHandleMessageIntent != null) {
                onMessageArrived(remoteMessageHandleMessageIntent);
            }
        } catch (Throwable unused) {
            JCommonLog.m5431e(TAG, "handleIntent failed");
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5430d(TAG, "onTokenFailed:get token is empty");
            JGoogleBusiness.getInstance().onNode(getApplicationContext(), 3004, 0, JPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 2);
            return;
        }
        JCommonLog.m5430d(TAG, "onTokenSuccess:callback token is " + str);
        JGoogleBusiness.getInstance().onToken(getApplicationContext(), str, 2);
    }
}
