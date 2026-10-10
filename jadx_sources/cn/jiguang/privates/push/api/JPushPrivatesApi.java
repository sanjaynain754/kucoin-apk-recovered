package cn.jiguang.privates.push.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.JCore;
import cn.jiguang.privates.core.api.JCorePrivatesApi;
import cn.jiguang.privates.push.BuildConfig;
import cn.jiguang.privates.push.JPush;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.utils.NotificationUtil;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class JPushPrivatesApi {
    public static final byte PLATFORM_DEFAULT = 0;
    public static final byte PLATFORM_GOOGLE = 8;
    public static final byte PLATFORM_HUAWEI = 2;
    public static final byte PLATFORM_MEIZU = 3;
    public static final byte PLATFORM_OPPO = 4;
    public static final byte PLATFORM_VIVO = 5;
    public static final byte PLATFORM_XIAOMI = 1;
    public static int SDK_VERSION_CODE = 422;
    public static String SDK_VERSION_NAME = "4.2.2";
    private static final String TAG = "JPushPrivatesApi";

    /* JADX INFO: loaded from: classes34.dex */
    public static class Code {
        public static int CONNECT_NOT_ENABLE = 6012;
        public static int INVALID_ALIAS = 6003;
        public static int INVALID_JSON = 6010;
        public static int INVALID_MOBILE_NUMBER = 6023;
        public static int INVALID_TAGS = 6005;
        public static int INVOKE_TOO_SOON = 6011;
        public static int NULL_TAG_AND_ALIAS = 6001;
        public static final int SUCCESS = 0;
        public static int TIMEOUT = 6002;
        public static int TOO_LONG_ALIAS = 6004;
        public static int TOO_LONG_TAG = 6006;
        public static int TOO_LONG_TAGS = 6008;
        public static int TOO_MANY_TAGS = 6007;
        public static int UNKNOWN_ERROR = 6009;
    }

    public static void clearNotification(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "clearNotification context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Notification.KEY_NOTIFY_ID, i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.CLEAR_NOTIFICATION, bundle);
        }
    }

    public static void reportNotificationArrived(Context context, String str, byte b11, String str2) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "reportNotificationArrived context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "reportNotificationArrived messageId can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b11).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED, bundle);
        }
    }

    public static void reportNotificationOpened(Context context, String str, byte b11, String str2) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "reportNotificationOpened context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "reportNotificationOpened messageId can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b11).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED, bundle);
        }
    }

    public static void addTag(Context context, int i11, String... strArr) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "addTag context can't be null, please check it");
            return;
        }
        if (i11 == 0) {
            JCommonLog.m5431e(TAG, "addTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            JCommonLog.m5431e(TAG, "addTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            JCommonLog.m5431e(TAG, "addTag tag can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            bundle.putStringArray("tag", strArr);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TAG_ADD, bundle);
        }
    }

    @Deprecated
    public static void addTags(Context context, int i11, Set<String> set) {
        if (set == null) {
            JCommonLog.m5431e(TAG, "addTags tags can't be null, please check it");
        } else if (set.isEmpty()) {
            JCommonLog.m5431e(TAG, "addTags tags can't be empty, please check it");
        } else {
            addTag(context, i11, (String[]) set.toArray(new String[set.size()]));
        }
    }

    public static void clearAlias(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "clearAlias context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ALIAS_CLEAR, bundle);
        }
    }

    public static void configOldPushVersion(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "init context can't be null, please check it");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            SDK_VERSION_CODE = BuildConfig.pushOldVersionCode;
            SDK_VERSION_NAME = BuildConfig.pushOldVersionName;
            JCommonLog.m5430d(TAG, "configOldPushVersion " + SDK_VERSION_NAME);
        }
    }

    public static void deleteAllTag(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "deleteAllTag context can't be null, please check it");
            return;
        }
        if (i11 == 0) {
            JCommonLog.m5431e(TAG, "deleteAllTag sequence can't be 0, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TAG_DELETE_ALL, bundle);
        }
    }

    public static void deleteGeofence(Context context, String str) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "deleteGeofence context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "deleteGeofence geofenceId can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.DELETE_GEOFENCE, bundle);
        }
    }

    public static void deleteTag(Context context, int i11, String... strArr) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "deleteTag context can't be null, please check it");
            return;
        }
        if (i11 == 0) {
            JCommonLog.m5431e(TAG, "deleteTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            JCommonLog.m5431e(TAG, "deleteTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            JCommonLog.m5431e(TAG, "deleteTag tag can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            bundle.putStringArray("tag", strArr);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TAG_DELETE, bundle);
        }
    }

    @Deprecated
    public static void deleteTags(Context context, int i11, Set<String> set) {
        if (set == null) {
            JCommonLog.m5431e(TAG, "deleteTags tags can't be null, please check it");
        } else if (set.isEmpty()) {
            JCommonLog.m5431e(TAG, "deleteTags tags can't be empty, please check it");
        } else {
            deleteTag(context, i11, (String[]) set.toArray(new String[set.size()]));
        }
    }

    public static void getAlias(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "getAlias context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ALIAS_GET, bundle);
        }
    }

    public static void goToAppNotificationSettings(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "goToAppNotificationSettings context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationUtil.goToAppNotificationSettings(context.getApplicationContext());
        }
    }

    public static void init(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "init context can't be null, please check it");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.init(context.getApplicationContext(), true);
            if (JGlobal.isMainProcess(context.getApplicationContext())) {
                JCommonPrivatesApi.observer(context.getApplicationContext(), new JCore());
                JCommonPrivatesApi.observer(context.getApplicationContext(), new JPush());
            }
        }
    }

    public static void initObserver(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "init context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.observer(context.getApplicationContext(), new JCore());
            JCommonPrivatesApi.observer(context.getApplicationContext(), new JPush());
        }
    }

    public static void queryAllTag(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "queryAllTag context can't be null, please check it");
            return;
        }
        if (i11 == 0) {
            JCommonLog.m5431e(TAG, "queryAllTag sequence can't be 0, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TAG_QUERY_ALL, bundle);
        }
    }

    public static void queryTag(Context context, int i11, String str) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "queryTag context can't be null, please check it");
            return;
        }
        if (i11 == 0) {
            JCommonLog.m5431e(TAG, "queryTag sequence can't be 0, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "queryTag tag can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            bundle.putString("tag", str);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TAG_QUERY, bundle);
        }
    }

    public static void reportNotificationClicked(Context context, String str, byte b11, String str2) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "reportNotificationClicked context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "reportNotificationClicked messageId can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b11).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED, bundle);
        }
    }

    public static void reportNotificationDeleted(Context context, String str, byte b11, String str2) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "reportNotificationDeleted context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "reportNotificationDeleted messageId can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            NotificationMessage platformMessageId = new NotificationMessage().setMessageId(str).setPlatform(b11).setPlatformMessageId(str2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", platformMessageId);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED, bundle);
        }
    }

    public static void resetNotificationBadge(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "resetNotificationBadge context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.RESET_NOTIFICATION_BADGE, null);
        }
    }

    public static void resetNotificationCount(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "resetNotificationCount context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.RESET_NOTIFICATION_COUNT, null);
        }
    }

    public static void resetNotificationLayout(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "resetNotificationLayout context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.RESET_NOTIFICATION_LAYOUT, bundle);
        }
    }

    public static void resetNotificationShowTime(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "resetNotificationShowTime context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.RESET_NOTIFICATION_SHOW_TIME, null);
        }
    }

    public static void resetNotificationSilenceTime(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "resetNotificationSilenceTime context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.RESET_NOTIFICATION_SILENCE_TIME, null);
        }
    }

    public static void setAlias(Context context, int i11, String str) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setAlias context can't be null, please check it");
            return;
        }
        if (str == null) {
            JCommonLog.m5431e(TAG, "setAlias alias can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            bundle.putString(JPushConstants.Operation.KEY_ALIAS, str);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ALIAS_SET, bundle);
        }
    }

    public static void setGeofenceCount(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setGeofenceCount context can't be null, please check it");
            return;
        }
        if (i11 <= 0 || i11 >= 100) {
            JCommonLog.m5431e(TAG, "setGeofenceCount count must between 0~100, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("count", i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.SET_GEOFENCE_COUNT, bundle);
        }
    }

    public static void setGeofenceInterval(Context context, long j11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setGeofenceInterval context can't be null, please check it");
            return;
        }
        if (j11 < 180000 || j11 > 86400000) {
            JCommonLog.m5431e(TAG, "setGeofenceInterval interval must between 3 * 60 * 1000 ~ 24 * 60 * 60 * 1000, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putLong(JPushConstants.Geofence.KEY_INTERVAL, j11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.SET_GEOFENCE_INTERVAL, bundle);
        }
    }

    public static void setNotificationBadge(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setNotificationBadge context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("notification_badge", i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.SET_NOTIFICATION_BADGE, bundle);
        }
    }

    public static void setNotificationCount(Context context, int i11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setNotificationCount context can't be null, please check it");
            return;
        }
        if (i11 < 0) {
            JCommonLog.m5431e(TAG, "setNotificationCount count can't small than 0, please check it");
            return;
        }
        if (i11 == 0) {
            JCommonLog.m5431e(TAG, "setNotificationCount count can't equal with 0, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.NotificationCount.KEY_COUNT, i11);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.SET_NOTIFICATION_COUNT, bundle);
        }
    }

    public static void setNotificationLayout(Context context, int i11, NotificationLayout notificationLayout) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setNotificationLayout context can't be null, please check it");
            return;
        }
        if (notificationLayout == null) {
            JCommonLog.m5431e(TAG, "setNotificationLayout notificationLayout can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            bundle.putParcelable(JPushConstants.NotificationLayout.KEY_NOTIFICATION_LAYOUT, notificationLayout);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.SET_NOTIFICATION_LAYOUT, bundle);
        }
    }

    public static void setNotificationShowTime(Context context, int i11, int i12, int... iArr) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setNotificationShowTime context can't be null, please check it");
            return;
        }
        if (i11 < 0 || i11 > 23) {
            JCommonLog.m5431e(TAG, "setNotificationShowTime beginHour must between 0~23, please check it");
            return;
        }
        if (i12 < 0 || i12 > 23) {
            JCommonLog.m5431e(TAG, "setNotificationShowTime endHour must between 0~23, please check it");
            return;
        }
        if (i11 > i12) {
            JCommonLog.m5431e(TAG, "setNotificationShowTime beginHour can't large than endHour, please check it");
            return;
        }
        if (i11 == i12) {
            JCommonLog.m5431e(TAG, "setNotificationShowTime beginHour can't equal with endHour, please check it");
            return;
        }
        if (iArr.length > 7) {
            JCommonLog.m5431e(TAG, "setNotificationShowTime weekDays.length must between 0~7, please check it");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.NotificationTime.KEY_BEGIN_HOUR, i11);
            bundle.putInt(JPushConstants.NotificationTime.KEY_END_HOUR, i12);
            bundle.putIntArray(JPushConstants.NotificationTime.KEY_DAYS, iArr);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.SET_NOTIFICATION_SHOW_TIME, bundle);
        }
    }

    public static void setNotificationSilenceTime(Context context, int i11, int i12, int i13, int i14) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setNotificationSilenceTime context can't be null, please check it");
            return;
        }
        if (i11 < 0 || i11 > 23) {
            JCommonLog.m5431e(TAG, "setNotificationSilenceTime beginHour must between 0~23, please check it");
            return;
        }
        if (i12 < 0 || i12 > 59) {
            JCommonLog.m5431e(TAG, "setNotificationSilenceTime beginMinute must between 0~59, please check it");
            return;
        }
        if (i13 < 0 || i13 > 23) {
            JCommonLog.m5431e(TAG, "setNotificationSilenceTime endHour must between 0~23, please check it");
            return;
        }
        if (i14 < 0 || i14 > 59) {
            JCommonLog.m5431e(TAG, "setNotificationSilenceTime endMinute must between 0~59, please check it");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.NotificationTime.KEY_BEGIN_HOUR, i11);
            bundle.putInt(JPushConstants.NotificationTime.KEY_BEGIN_MINUTE, i12);
            bundle.putInt(JPushConstants.NotificationTime.KEY_END_HOUR, i13);
            bundle.putInt(JPushConstants.NotificationTime.KEY_END_MINUTE, i14);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.SET_NOTIFICATION_SILENCE_TIME, bundle);
        }
    }

    @Deprecated
    public static void setPushTime(Context context, Set<Integer> set, int i11, int i12) {
        if (set == null) {
            resetNotificationShowTime(context);
            return;
        }
        if (set.isEmpty()) {
            setNotificationShowTime(context.getApplicationContext(), i11, i12, new int[0]);
            return;
        }
        int size = set.size();
        int[] iArr = new int[size];
        Integer[] numArr = new Integer[set.size()];
        set.toArray(numArr);
        System.arraycopy(numArr, 0, iArr, 0, size);
        setNotificationShowTime(context.getApplicationContext(), i11, i12, iArr);
    }

    @Deprecated
    public static void setTags(Context context, int i11, Set<String> set) {
        if (set == null) {
            JCommonLog.m5431e(TAG, "setTags tags can't be null, please check it");
        } else if (set.isEmpty()) {
            JCommonLog.m5431e(TAG, "setTags tags can't be empty, please check it");
        } else {
            updateTag(context, i11, (String[]) set.toArray(new String[set.size()]));
        }
    }

    public static void showNotification(Context context, NotificationMessage notificationMessage) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "showNotification context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", notificationMessage);
            bundle.putBoolean(JPushConstants.Message.KEY_MESSAGE_LIMIT, false);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.SHOW_NOTIFICATION, bundle);
        }
    }

    public static void turnOffGeofenceSwitch(Context context) {
        if (context == null) {
            JCommonLog.m5431e("JCommonPrivatesApi", "turnOffGeofenceSwitch context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TURN_OFF_GEOFENCESWITCH, null);
        } else {
            JCommonLog.m5431e("JCommonPrivatesApi", "turnOffGeofenceSwitch should be called in main process");
        }
    }

    public static void turnOffPush(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "turnOffPush context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TURN_OFF_PUSH, null);
        }
    }

    public static void turnOnGeofenceSwitch(Context context) {
        if (context == null) {
            JCommonLog.m5431e("JCommonPrivatesApi", "turnOnGeofenceSwitch context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TURN_ON_GEOFENCESWITCH, null);
        } else {
            JCommonLog.m5431e("JCommonPrivatesApi", "turnOnGeofenceSwitch should be called in main process");
        }
    }

    public static void turnOnPush(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "turnOnPush context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TURN_ON_PUSH, null);
        }
    }

    public static void updateTag(Context context, int i11, String... strArr) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "updateTag context can't be null, please check it");
            return;
        }
        if (i11 == 0) {
            JCommonLog.m5431e(TAG, "updateTag sequence can't be 0, please check it");
            return;
        }
        if (strArr == null) {
            JCommonLog.m5431e(TAG, "updateTag tag can't be null, please check it");
            return;
        }
        if (strArr.length == 0) {
            JCommonLog.m5431e(TAG, "updateTag tag can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            bundle.putStringArray("tag", strArr);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.TAG_UPDATE, bundle);
        }
    }

    public static void uploadMobileNumber(Context context, int i11, String str) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "uploadMobileNumber context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "uploadMobileNumber mobileNumber can't be empty, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putInt(JPushConstants.Operation.KEY_SEQUENCE, i11);
            bundle.putString(JPushConstants.Operation.KEY_MOBILE_NUMBER, str);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ON_MOBILE_NUMBER, bundle);
        }
    }

    public static void uploadPlatformToken(Context context, byte b11, String str) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "onPlatformToken context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            PlatformTokenMessage token = new PlatformTokenMessage().setPlatform(b11).setToken(str);
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", token);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.ON_PLATFORM_TOKEN, bundle);
        }
    }

    @Deprecated
    public static void checkTagBindState(Context context, int i11, String str) {
        queryTag(context.getApplicationContext(), i11, str);
    }

    @Deprecated
    public static void cleanTags(Context context, int i11) {
        deleteAllTag(context.getApplicationContext(), i11);
    }

    @Deprecated
    public static void clearAllNotifications(Context context) {
        clearNotification(context);
    }

    @Deprecated
    public static void clearNotificationById(Context context, int i11) {
        clearNotification(context, i11);
    }

    @Deprecated
    public static void deleteAlias(Context context, int i11) {
        clearAlias(context, i11);
    }

    @Deprecated
    public static void getAllTags(Context context, int i11) {
        queryAllTag(context.getApplicationContext(), i11);
    }

    @Deprecated
    public static String getRegistrationID(Context context) {
        return JCorePrivatesApi.getRegistrationId(context);
    }

    @Deprecated
    public static void reportThirdToken(Context context, String str, byte b11) {
        uploadPlatformToken(context.getApplicationContext(), b11, str);
    }

    @Deprecated
    public static void resumePush(Context context) {
        turnOnPush(context.getApplicationContext());
    }

    @Deprecated
    public static void setBadgeNumber(Context context, int i11) {
        setNotificationBadge(context, i11);
    }

    @Deprecated
    public static void setDefaultNotifactionNumber(Context context) {
        resetNotificationCount(context);
    }

    @Deprecated
    public static void setLatestNotificationNumber(Context context, int i11) {
        setNotificationCount(context.getApplicationContext(), i11);
    }

    @Deprecated
    public static void setMaxGeofenceNumber(Context context, int i11) {
        setGeofenceCount(context.getApplicationContext(), i11);
    }

    @Deprecated
    public static void setMobileNumber(Context context, int i11, String str) {
        uploadMobileNumber(context, i11, str);
    }

    @Deprecated
    public static void setSilenceTime(Context context, int i11, int i12, int i13, int i14) {
        setNotificationSilenceTime(context.getApplicationContext(), i11, i12, i13, i14);
    }

    @Deprecated
    public static void stopPush(Context context) {
        turnOffPush(context.getApplicationContext());
    }

    public static void clearNotification(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "clearNotification context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessageToRemoteProcess(context.getApplicationContext(), JPushConstants.RemoteWhat.CLEAR_NOTIFICATION, null);
        }
    }

    @Deprecated
    public static void reportNotificationArrived(Context context, String str, byte b11) {
        reportNotificationArrived(context, str, b11, "");
    }

    @Deprecated
    public static void reportNotificationOpened(Context context, String str, byte b11) {
        reportNotificationOpened(context, str, b11, "");
    }
}
