package cn.jiguang.privates.push.business.message.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.JCore;
import cn.jiguang.privates.core.api.JReporter;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.push.api.JPushPrivatesApi;
import cn.jiguang.privates.push.api.NotificationMessage;
import cn.jiguang.privates.push.business.JPushBusiness;
import cn.jiguang.privates.push.business.message.JMessageBusiness;
import cn.jiguang.privates.push.cache.JPushConfig;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.utils.NotificationChannelUtil;
import cn.jiguang.privates.push.utils.NotificationUtil;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p544q0.C43570a;
import p544q0.C43571b;

/* JADX INFO: loaded from: classes34.dex */
public class JNotificationBusiness extends JMessageBusiness {
    private static final String KEY_FOREGROUND = "isForeground";
    private static final int MESSAGE_ID_SIZE = 50;
    private static final String TAG = "JNotificationBusiness";
    private static ConcurrentHashMap<String, Integer> messageMap = new ConcurrentHashMap<>();
    private static volatile JNotificationBusiness instance = null;

    public void clearNotification(Context context, Bundle bundle) {
        if (bundle != null) {
            clearNotification(context, bundle.getInt(JPushConstants.Notification.KEY_NOTIFY_ID));
            return;
        }
        if (messageMap.isEmpty()) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        for (Map.Entry<String, Integer> entry : messageMap.entrySet()) {
            notificationManager.cancel(entry.getValue().intValue());
            JCommonLog.m5430d(TAG, "clear notification which messageId:" + entry.getKey() + ", notificationId:" + entry.getValue());
        }
        messageMap.clear();
        JCommonLog.m5430d(TAG, "current messageMap size " + messageMap.size());
    }

    public void showNotification(Context context, Bundle bundle) {
        try {
            bundle.setClassLoader(NotificationMessage.class.getClassLoader());
            NotificationMessage notificationMessage = (NotificationMessage) bundle.getParcelable("message");
            if (notificationMessage == null) {
                return;
            }
            showNotification(context, notificationMessage, bundle.getBoolean(JPushConstants.Message.KEY_MESSAGE_LIMIT, true));
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "showNotification failed " + th2.getMessage());
        }
    }

    public static JNotificationBusiness getInstance() {
        if (instance == null) {
            synchronized (JNotificationBusiness.class) {
                instance = new JNotificationBusiness();
            }
        }
        return instance;
    }

    private boolean isNotificationShowing(Context context, int i11, boolean z11) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService("notification")).getActiveNotifications()) {
            JCommonLog.m5430d(TAG, "statusBarNotification:" + statusBarNotification.getId());
            if (statusBarNotification.getId() == i11) {
                return true;
            }
        }
        return false;
    }

    private void launch(Context context) {
        try {
            if (JGlobal.getLifecycleState()) {
                JCommonLog.m5430d(TAG, "pushSdkVersionName:" + JPushPrivatesApi.SDK_VERSION_NAME + ", isForeground, no need launch");
                return;
            }
            JCommonLog.m5430d(TAG, "pushSdkVersionName:" + JPushPrivatesApi.SDK_VERSION_NAME + ", isBackground, need launch");
            String currentActivityName = JGlobal.getCurrentActivityName();
            if (TextUtils.isEmpty(currentActivityName)) {
                launchMainActivity(context);
            } else {
                launchCurrentActivity(context, currentActivityName);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "launch failed " + th2.getMessage());
        }
    }

    private void launchCurrentActivity(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), str);
            intent.setFlags(872415232);
            context.startActivity(intent);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "launchCurrentActivity failed " + th2.getMessage());
        }
    }

    private void reportRevokeMessage(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", str);
            jSONObject.put(DbParams.KEY_CHANNEL_RESULT, JPushConstants.Message.CODE_MESSAGE_REVOKE);
            JReporter content = new JReporter().setType("msg_status").setContent(jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putParcelable("protocol", content);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString(JPushConstants.Analysis.KEY_JSON, jSONObject.toString());
            JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.REPORT_MESSAGE_STATE, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "reportRevokeMessage failed " + th2.getMessage());
        }
    }

    private void reportRevokePlatformMessage(Context context, String str, byte b11, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", str);
            jSONObject.put("sdk_type", (int) b11);
            jSONObject.put("tmsg_id", str2);
            jSONObject.put(DbParams.KEY_CHANNEL_RESULT, JPushConstants.Message.CODE_REVOKE_PLATFORM_MESSAGE);
            JReporter content = new JReporter().setType("third_msg_status").setContent(jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putParcelable("protocol", content);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString(JPushConstants.Analysis.KEY_JSON, jSONObject.toString());
            JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.REPORT_PLATFORM_MESSAGE_STATE, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "reportRevokeMessage failed " + th2.getMessage());
        }
    }

    private void revokeNotification(Context context, String str, String str2) {
        JCommonLog.m5430d(TAG, "revokeNotification reportMessageId:" + str + ",revokeMessageId:" + str2);
        addRevokeMessageId(context, str2, JPushConfig.getRevokeMessageIdSet(context));
        int notificationId = NotificationUtil.getNotificationId(str2);
        Set<String> messageIdSet = JPushConfig.getMessageIdSet(context, (byte) 0);
        if (messageIdSet != null && messageIdSet.contains(str)) {
            if (isNotificationShowing(context, notificationId, true)) {
                clearNotification(context, notificationId);
                reportRevokeMessage(context, str);
                return;
            }
            JCommonLog.m5430d(TAG, "the message [" + str2 + "] is not showing");
            return;
        }
        JCommonLog.m5430d(TAG, "there are no messageId [" + str + "] in cache messageIdSet");
        Set<String> messageIdSet2 = JPushConfig.getMessageIdSet(context, (byte) 8);
        if (messageIdSet2 != null && messageIdSet2.contains(str)) {
            if (isNotificationShowing(context, notificationId, true)) {
                clearNotification(context, notificationId);
                reportRevokePlatformMessage(context, str, (byte) 8, "");
                return;
            }
            JCommonLog.m5430d(TAG, "the message [" + str2 + "] is not showing");
            return;
        }
        JCommonLog.m5430d(TAG, "there are no messageId [" + str + "] in cache googleMessageIdSet");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("revoke third message ");
        sb2.append(str);
        JCommonLog.m5430d(TAG, sb2.toString());
        Bundle bundle = new Bundle();
        bundle.putInt(JPushConstants.Message.KEY_NOTIFICATION_ID, notificationId);
        JCommonPrivatesApi.sendMessageToMainProcess(context, JPushConstants.MainWhat.CLEAR_PLATFORM_NOTIFICATION, bundle);
    }

    private void transfer(Context context, NotificationMessage notificationMessage) {
        try {
            String intentUri = notificationMessage.getIntentUri();
            if (TextUtils.isEmpty(intentUri)) {
                JCommonLog.m5430d(TAG, "pushSdkVersionName:" + JPushPrivatesApi.SDK_VERSION_NAME + ", there is no intentUri, no need transfer");
                launch(context);
                return;
            }
            JCommonLog.m5430d(TAG, "pushSdkVersionName:" + JPushPrivatesApi.SDK_VERSION_NAME + ", there is intentUri, need transfer");
            Intent uri = parseUri(intentUri);
            uri.addFlags(335544320);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", notificationMessage);
            uri.putExtras(bundle);
            context.startActivity(uri);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "transfer failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.message.JMessageBusiness
    public void onMessage(Context context, Bundle bundle) {
        String str;
        try {
            String string = bundle.getString("message");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            String messageId = NotificationUtil.getMessageId(jSONObject);
            if (TextUtils.isEmpty(messageId)) {
                JCommonLog.m5430d(TAG, "notificationMessage's messageId is null, can't show this notification");
                return;
            }
            String strOptString = jSONObject.optString("override_msg_id");
            int notificationId = TextUtils.isEmpty(strOptString) ? NotificationUtil.getNotificationId(messageId) : NotificationUtil.getNotificationId(strOptString);
            int iOptInt = jSONObject.optInt("n_builder_id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("m_content");
            if (jSONObjectOptJSONObject == null) {
                JCommonLog.m5430d(TAG, "onMessage failed, can't parse content");
                return;
            }
            String strOptString2 = jSONObjectOptJSONObject.optString("n_title");
            String strOptString3 = jSONObjectOptJSONObject.optString("n_content");
            Bundle bundleConvertJsonToBundle = NotificationUtil.convertJsonToBundle(jSONObjectOptJSONObject.optJSONObject("n_extras"));
            String strOptString4 = jSONObjectOptJSONObject.optString("n_small_icon");
            String strOptString5 = jSONObjectOptJSONObject.optString("n_large_icon");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("n_alert_type", -1);
            int iOptInt3 = jSONObjectOptJSONObject.optInt("n_priority");
            str = TAG;
            try {
                String strOptString6 = jSONObjectOptJSONObject.optString("n_category");
                int iOptInt4 = jSONObjectOptJSONObject.optInt("n_style");
                String strOptString7 = jSONObjectOptJSONObject.optString("n_big_text");
                NotificationMessage badge = new NotificationMessage().setMessageId(messageId).setOverrideMessageId(strOptString).setPlatform((byte) 0).setNotificationId(notificationId).setSmallIcon(strOptString4).setLargeIcon(strOptString5).setTitle(strOptString2).setContent(strOptString3).setBuilderId(iOptInt).setExtras(bundleConvertJsonToBundle).setStyle(iOptInt4).setBigText(strOptString7).setInbox(NotificationUtil.convertJsonToArray(jSONObjectOptJSONObject.optString("n_inbox"))).setBigPicture(jSONObjectOptJSONObject.optString("n_big_pic_path")).setDefaults(iOptInt2).setPriority(iOptInt3).setCategory(strOptString6).setSound(jSONObjectOptJSONObject.optString("n_sound")).setChannelId(jSONObjectOptJSONObject.optString("n_channel_id")).setIntentUri(jSONObjectOptJSONObject.optString("intent_uri")).setBadge(jSONObjectOptJSONObject.optInt("n_badge_add_num"));
                try {
                    showNotification(context, badge, bundle.getBoolean(JPushConstants.Message.KEY_MESSAGE_LIMIT, true));
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("message", badge);
                    JCommonPrivatesApi.sendMessageToMainProcess(context, 3002, bundle2);
                } catch (Throwable th2) {
                    th = th2;
                    JCommonLog.m5430d(str, "onMessage failed " + th.getMessage());
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            str = TAG;
        }
    }

    public void onMessageRevoke(Context context, Bundle bundle) {
        try {
            String string = bundle.getString("protocol");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            JCommonLog.m5430d(TAG, "revokeMessage:" + JCommonLog.toLogString(jSONObject));
            String strOptString = jSONObject.optString("ids");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            String[] strArrSplit = strOptString.split(",");
            if (strArrSplit.length == 1) {
                String str = strArrSplit[0];
                revokeNotification(context, str, str);
            } else if (strArrSplit.length == 2) {
                revokeNotification(context, strArrSplit[0], strArrSplit[1]);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "revokeMessage failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.message.JMessageBusiness
    public void processMainMessage(Context context, int i11, Bundle bundle) {
        JCommonReceiver commonReceiver;
        try {
            bundle.setClassLoader(NotificationMessage.class.getClassLoader());
            NotificationMessage notificationMessage = (NotificationMessage) bundle.getParcelable("message");
            if (notificationMessage != null && (commonReceiver = JGlobal.getCommonReceiver(context)) != null) {
                switch (i11) {
                    case 3002:
                        commonReceiver.onNotificationArrived(context, notificationMessage);
                        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED, bundle);
                        break;
                    case 3003:
                        if (JPushPrivatesApi.SDK_VERSION_NAME.startsWith("3")) {
                            if (notificationMessage.getPlatform() == 0) {
                                launch(context);
                            }
                            if (notificationMessage.getPlatform() == 8) {
                                transfer(context, notificationMessage);
                            }
                        } else {
                            transfer(context, notificationMessage);
                        }
                        commonReceiver.onNotificationClicked(context, notificationMessage);
                        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED, bundle);
                        break;
                    case 3004:
                        commonReceiver.onNotificationDeleted(context, notificationMessage);
                        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED, bundle);
                        break;
                    case 3005:
                        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED, bundle);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processMainMessage failed " + th2.getMessage());
        }
    }

    @Override // cn.jiguang.privates.push.business.message.JMessageBusiness
    public void processRemoteMessage(Context context, int i11, Bundle bundle) {
        int i12;
        try {
            bundle.setClassLoader(NotificationMessage.class.getClassLoader());
            NotificationMessage notificationMessage = (NotificationMessage) bundle.getParcelable("message");
            if (notificationMessage == null) {
                return;
            }
            String str = "msg_status";
            int i13 = bundle.getInt("isForeground", 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg_id", notificationMessage.getMessageId());
            jSONObject.put("itime", bundle.getLong("itime", System.currentTimeMillis() / 1000));
            if (notificationMessage.getPlatform() != 0) {
                str = "third_msg_status";
                jSONObject.put("sdk_type", (int) notificationMessage.getPlatform());
                jSONObject.put("tmsg_id", notificationMessage.getPlatformMessageId());
                i12 = JPushConstants.MainWhat.REPORT_PLATFORM_MESSAGE_STATE;
            } else {
                i12 = JPushConstants.MainWhat.REPORT_MESSAGE_STATE;
            }
            switch (i11) {
                case JPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED /* 3995 */:
                    JCommonLog.m5430d(TAG, "onNotificationOpened " + notificationMessage.toString());
                    jSONObject.put(DbParams.KEY_CHANNEL_RESULT, 1028);
                    break;
                case JPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED /* 3996 */:
                    JCommonLog.m5430d(TAG, "onNotificationDeleted " + notificationMessage.toString());
                    jSONObject.put(DbParams.KEY_CHANNEL_RESULT, JPushConstants.Message.CODE_MESSAGE_DELETED);
                    break;
                case JPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED /* 3997 */:
                    JCommonLog.m5430d(TAG, "onNotificationClicked " + notificationMessage.toString());
                    jSONObject.put(DbParams.KEY_CHANNEL_RESULT, 1000);
                    break;
                case JPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED /* 3998 */:
                    JCommonLog.m5430d(TAG, "onNotificationArrived " + notificationMessage.toString());
                    jSONObject.put(DbParams.KEY_CHANNEL_RESULT, 1018);
                    jSONObject.put("is_foreground", i13);
                    long j11 = bundle.getLong(JPushConstants.Message.TYPE_PLATFORM_SENT_TIME, 0L);
                    if (j11 > 0) {
                        jSONObject.put("channel_time", j11);
                    }
                    break;
            }
            if ("1".equals(notificationMessage.getExtras().getString(JPushConstants.Message.KEY_ENABLE_REPORT, "1")) || JGlobal.getDebugMode()) {
                String string = notificationMessage.getExtras().getString(JPushConstants.Message.KEY_SNIFF_MSG, "");
                if (!string.isEmpty()) {
                    jSONObject.put("sniff_msg_type", string);
                    JCommonLog.m5432i(TAG, "processRemoteMessage sniffMsgType=" + string);
                }
                JReporter content = new JReporter().setType(str).setContent(jSONObject.toString());
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("protocol", content);
                if (i11 == 3998 && i13 == 2) {
                    if (string.isEmpty()) {
                        JCommonPrivatesApi.sendMessage(context, JCore.THREAD_REPORT, 2103, bundle2);
                        return;
                    } else {
                        JCommonPrivatesApi.sendMessage(context, JCore.THREAD_REPORT, 2104, bundle2);
                        return;
                    }
                }
                JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle2);
                Bundle bundle3 = new Bundle();
                bundle3.putString(JPushConstants.Analysis.KEY_JSON, jSONObject.toString());
                JCommonPrivatesApi.sendMessageToMainProcess(context, i12, bundle3);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processRemoteMessage failed " + th2.getMessage());
        }
    }

    public void removeNotificationInMap(int i11) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = messageMap;
        if (concurrentHashMap == null) {
            JCommonLog.m5430d(TAG, "there are no jiguang notification");
            return;
        }
        if (!concurrentHashMap.containsValue(Integer.valueOf(i11))) {
            JCommonLog.m5430d(TAG, "there are no jiguang notification " + i11);
            return;
        }
        Iterator<Map.Entry<String, Integer>> it = messageMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().intValue() == i11) {
                it.remove();
                break;
            }
        }
        JCommonLog.m5430d(TAG, "after remove, current messageMap size " + messageMap.size());
    }

    private void addMessageId(Context context, byte b11, String str, Set<String> set) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (set == null) {
            set = new LinkedHashSet<>();
        } else if (set.size() >= 50) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                it.next();
                if (set.size() >= 50) {
                    it.remove();
                }
            }
        }
        set.add(str);
        JCommonLog.m5430d(TAG, "addMessageId " + str);
        JPushConfig.setMessageIdSet(context, b11, set);
    }

    private void addOverrideMessageId(Context context, String str, Set<String> set) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (set == null) {
            set = new LinkedHashSet<>();
        } else if (set.size() >= 50) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                it.next();
                if (set.size() >= 50) {
                    it.remove();
                }
            }
        }
        set.add(str);
        JCommonLog.m5430d(TAG, "addOverrideMessageId " + str);
        JPushConfig.setOverrideMessageIdSet(context, set);
    }

    private void addRevokeMessageId(Context context, String str, Set<String> set) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (set == null) {
            set = new LinkedHashSet<>();
        } else if (set.size() >= 50) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                it.next();
                if (set.size() >= 50) {
                    it.remove();
                }
            }
        }
        set.add(str);
        JCommonLog.m5430d(TAG, "addRevokeMessageId " + str);
        JPushConfig.setRevokeMessageIdSet(context, set);
    }

    private boolean isNotificationCanShow(Context context, byte b11, String str, String str2) {
        Set<String> messageIdSet = JPushConfig.getMessageIdSet(context, b11);
        if (messageIdSet != null && !messageIdSet.isEmpty() && !TextUtils.isEmpty(str) && messageIdSet.contains(str)) {
            JCommonLog.m5430d(TAG, "the message [" + str + "] had been show");
            return false;
        }
        Set<String> overrideMessageIdSet = JPushConfig.getOverrideMessageIdSet(context);
        if (overrideMessageIdSet != null && !overrideMessageIdSet.isEmpty() && !TextUtils.isEmpty(str) && str2.contains(str)) {
            JCommonLog.m5430d(TAG, "the message [" + str + "] had been override");
            return false;
        }
        Set<String> revokeMessageIdSet = JPushConfig.getRevokeMessageIdSet(context);
        if (revokeMessageIdSet != null && !revokeMessageIdSet.isEmpty() && !TextUtils.isEmpty(str) && revokeMessageIdSet.contains(str)) {
            JCommonLog.m5430d(TAG, "the message [" + str + "] had been revoke");
            reportRevokeMessage(context, str);
            return false;
        }
        if (messageIdSet != null && !messageIdSet.isEmpty() && !TextUtils.isEmpty(str2) && messageIdSet.contains(str2)) {
            JCommonLog.m5430d(TAG, "the overrideMessage [" + str2 + "] had been show");
            if (!isNotificationShowing(context, NotificationUtil.getNotificationId(str2), true)) {
                return false;
            }
            JCommonLog.m5430d(TAG, "the overrideMessage [" + str2 + "] is showing, need override");
            addMessageId(context, b11, str, messageIdSet);
            addOverrideMessageId(context, str2, overrideMessageIdSet);
            return true;
        }
        addMessageId(context, b11, str, messageIdSet);
        addOverrideMessageId(context, str2, overrideMessageIdSet);
        return true;
    }

    private void launchMainActivity(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            launchIntentForPackage.setFlags(872415232);
            context.startActivity(launchIntentForPackage);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "launchMainActivity failed " + th2.getMessage());
        }
    }

    private Intent parseUri(String str) throws URISyntaxException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Intent intent = new Intent(Intent.parseUri(str, 4));
        intent.addCategory("JPUSH_LAUNCHER");
        intent.setComponent(null);
        intent.setSelector(null);
        return intent;
    }

    private void showNotification(Context context, NotificationMessage notificationMessage, boolean z11) {
        Notification.Builder builder;
        int i11 = Build.VERSION.SDK_INT;
        JCommonLog.m5430d(TAG, "showNotification " + notificationMessage.toString());
        byte platform = notificationMessage.getPlatform();
        String messageId = notificationMessage.getMessageId();
        String overrideMessageId = notificationMessage.getOverrideMessageId();
        if (!z11 || isNotificationCanShow(context, platform, messageId, overrideMessageId)) {
            if (!JPushBusiness.getInstance().isNotificationShowTime(context)) {
                JCommonLog.m5433w(TAG, "is not notificationShowTime, notificationShowTime:" + JPushConfig.getNotificationShowTime(context));
                return;
            }
            if (TextUtils.isEmpty(notificationMessage.getContent())) {
                JCommonLog.m5433w(TAG, "notificationMessage's content is null, can't show this notification " + notificationMessage.toString());
                return;
            }
            boolean zIsNotificationSilenceTime = JPushBusiness.getInstance().isNotificationSilenceTime(context);
            if (i11 >= 26) {
                C43571b.m95847a();
                builder = C43570a.m95846a(context, NotificationChannelUtil.getChannel(context, zIsNotificationSilenceTime, notificationMessage));
            } else {
                builder = new Notification.Builder(context);
            }
            builder.setAutoCancel(true);
            builder.setWhen(System.currentTimeMillis());
            String title = NotificationUtil.getTitle(context, notificationMessage);
            builder.setContentTitle(title);
            notificationMessage.setTitle(title);
            String content = NotificationUtil.getContent(context, notificationMessage);
            builder.setContentText(NotificationUtil.getContent(context, notificationMessage));
            notificationMessage.setContent(content);
            int defaults = NotificationUtil.getDefaults(context, zIsNotificationSilenceTime, notificationMessage);
            builder.setDefaults(defaults);
            notificationMessage.setDefaults(defaults);
            builder.setContentIntent(NotificationUtil.getPendingIntent(context, String.valueOf(3003), notificationMessage));
            builder.setDeleteIntent(NotificationUtil.getPendingIntent(context, String.valueOf(3004), notificationMessage));
            int smallIcon = NotificationUtil.getSmallIcon(context);
            if (smallIcon > 0) {
                builder.setSmallIcon(smallIcon);
                builder.setColor(NotificationUtil.getIconColor(context));
            }
            Bitmap largeIcon = NotificationUtil.getLargeIcon(context, notificationMessage.getLargeIcon());
            if (largeIcon != null) {
                builder.setLargeIcon(largeIcon);
            }
            Uri soundUri = NotificationUtil.getSoundUri(context, zIsNotificationSilenceTime, notificationMessage);
            if (soundUri != null) {
                builder.setSound(soundUri);
            }
            RemoteViews notificationLayout = NotificationUtil.getNotificationLayout(context, notificationMessage);
            if (notificationLayout != null) {
                builder.setContent(notificationLayout);
            }
            builder.setPriority(NotificationUtil.getPriority(context, zIsNotificationSilenceTime, notificationMessage));
            builder.setStyle(NotificationUtil.getStyle(context, notificationMessage));
            builder.setVisibility(NotificationUtil.getVisibility(context, zIsNotificationSilenceTime, notificationMessage));
            if (!TextUtils.isEmpty(notificationMessage.getCategory())) {
                builder.setCategory(notificationMessage.getCategory());
            }
            Icon smallIcon2 = NotificationUtil.getSmallIcon(context, notificationMessage);
            if (smallIcon2 != null) {
                builder.setSmallIcon(smallIcon2);
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            int notificationCount = JPushBusiness.getInstance().getNotificationCount(context);
            if (messageMap.size() >= notificationCount) {
                Iterator<Map.Entry<String, Integer>> it = messageMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Integer> next = it.next();
                    JCommonLog.m5430d(TAG, "currentNotificationCount is " + messageMap.size() + ", limit notificationCount [" + notificationCount + "], need remove messageId[" + next.getKey() + "]:notificationId[" + next.getValue() + "]");
                    notificationManager.cancel(next.getValue().intValue());
                    it.remove();
                    if (messageMap.size() < notificationCount) {
                        break;
                    }
                }
            }
            messageMap.put(notificationMessage.getMessageId(), Integer.valueOf(notificationMessage.getNotificationId()));
            JCommonLog.m5430d(TAG, "after add, current messageMap size " + messageMap.size());
            Notification notificationBuild = builder.build();
            NotificationUtil.setNotificationBadge(context, notificationBuild, notificationMessage.getBadge());
            notificationManager.notify(notificationMessage.getNotificationId(), notificationBuild);
            JCommonLog.m5430d(TAG, "showNotification notificationId:" + notificationMessage.getNotificationId());
        }
    }

    private void clearNotification(Context context, int i11) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        JCommonLog.m5430d(TAG, "cancel notificationId:" + i11);
        notificationManager.cancel(i11);
        removeNotificationInMap(i11);
    }
}
