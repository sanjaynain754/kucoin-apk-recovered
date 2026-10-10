package cn.jiguang.privates.push.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.trusted.C0671f;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.push.api.NotificationMessage;
import com.kubi.otc.entity.OtcAd;

/* JADX INFO: loaded from: classes34.dex */
public class NotificationChannelUtil {
    private static final String CHANNEL_DEFAULT = "jiguang_channel_default";
    private static final String CHANNEL_HIGH = "jiguang_privates_channel_high";
    private static final String CHANNEL_LOW = "jiguang_privates_channel_low";
    private static final String TAG = "NotificationChannelUtil";

    private static int getChannelImportance(Context context, boolean z11, NotificationMessage notificationMessage) {
        int priority;
        if (z11 || (priority = notificationMessage.getPriority()) == -2 || priority == -1) {
            return 2;
        }
        return (priority == 1 || priority == 2) ? 4 : 3;
    }

    public static String getChannel(Context context, boolean z11, NotificationMessage notificationMessage) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        String channelId = getChannelId(context, z11, notificationMessage);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager.getNotificationChannel(channelId) != null) {
            return channelId;
        }
        String channelName = getChannelName(context, z11, notificationMessage);
        int channelImportance = getChannelImportance(context, z11, notificationMessage);
        NotificationChannel notificationChannelM1622a = C0671f.m1622a(channelId, channelName, channelImportance);
        Uri soundUri = NotificationUtil.getSoundUri(context, z11, notificationMessage);
        int defaults = NotificationUtil.getDefaults(context, z11, notificationMessage);
        notificationChannelM1622a.setLockscreenVisibility(NotificationUtil.getVisibility(context, z11, notificationMessage));
        notificationChannelM1622a.setSound(soundUri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        notificationChannelM1622a.enableLights((defaults & 4) != 0);
        notificationChannelM1622a.enableVibration((defaults & 2) != 0);
        notificationManager.createNotificationChannel(notificationChannelM1622a);
        JCommonLog.m5430d(TAG, "build channel channelId:" + channelId + ", channelName:" + channelName + ", channelImportance:" + channelImportance);
        return channelId;
    }

    private static String getChannelId(Context context, boolean z11, NotificationMessage notificationMessage) {
        if (z11) {
            return CHANNEL_LOW;
        }
        if (!TextUtils.isEmpty(notificationMessage.getChannelId())) {
            return notificationMessage.getChannelId();
        }
        int priority = notificationMessage.getPriority();
        if (priority == -2 || priority == -1) {
            return CHANNEL_LOW;
        }
        if (priority == 1 || priority == 2) {
            if (TextUtils.isEmpty(notificationMessage.getSound())) {
                return "jiguang_privates_channel_high_" + notificationMessage.getDefaults();
            }
            return "jiguang_privates_channel_high_" + notificationMessage.getDefaults() + "_" + notificationMessage.getSound();
        }
        if (TextUtils.isEmpty(notificationMessage.getSound())) {
            return "jiguang_channel_default_" + notificationMessage.getDefaults();
        }
        return "jiguang_channel_default_" + notificationMessage.getDefaults() + "_" + notificationMessage.getSound();
    }

    private static String getChannelName(Context context, boolean z11, NotificationMessage notificationMessage) {
        String str = CHANNEL_LOW;
        if (z11) {
            return context.getString(context.getResources().getIdentifier(CHANNEL_LOW, TypedValues.Custom.S_STRING, context.getPackageName()));
        }
        int priority = notificationMessage.getPriority();
        if (priority != -2 && priority != -1) {
            str = (priority == 1 || priority == 2) ? CHANNEL_HIGH : CHANNEL_DEFAULT;
        }
        int identifier = context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName());
        if (identifier > 0) {
            return context.getString(identifier);
        }
        return OtcAd.STATUS_NORMAL;
    }
}
