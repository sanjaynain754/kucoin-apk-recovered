package cn.jiguang.privates.push.utils;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import android.widget.RemoteViews;
import cn.jiguang.privates.common.component.JCommonActivity;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.push.api.NotificationLayout;
import cn.jiguang.privates.push.api.NotificationMessage;
import cn.jiguang.privates.push.business.JPushBusiness;
import cn.jiguang.privates.push.cache.JPushConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.Adler32;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class NotificationUtil {
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String NOTIFICATION_COLOR = "jpush_notification_color";
    public static final String NOTIFICATION_ICON = "jpush_notification_icon";
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String TAG = "NotificationUtil";

    public static String[] convertJsonToArray(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            String[] strArr = new String[jSONObject.length()];
            int i11 = 0;
            while (itKeys.hasNext()) {
                strArr[i11] = jSONObject.optString(itKeys.next());
                i11++;
            }
            return strArr;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "convertJsonToArray failed " + th2.getMessage());
            return null;
        }
    }

    public static Bundle convertJsonToBundle(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(jSONObject.toString())) {
                return null;
            }
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next));
            }
            return bundle;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "convertJsonToBundle failed " + th2.getMessage());
            return null;
        }
    }

    public static Notification.BigPictureStyle getBigPictureStyle(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            Bitmap pictureBitmap = getPictureBitmap(context, str);
            if (pictureBitmap == null) {
                return null;
            }
            return bigPictureStyle.bigPicture(pictureBitmap);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "get bigPictureStyle failed " + th2.getMessage());
            return null;
        }
    }

    public static Notification.InboxStyle getInboxStyle(Context context, String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
                    for (String str : strArr) {
                        inboxStyle.addLine(str);
                    }
                    inboxStyle.setSummaryText(" + " + strArr.length + " new messages");
                    return inboxStyle;
                }
            } catch (Throwable th2) {
                JCommonLog.m5433w(TAG, "getInboxStyle failed " + th2.getMessage());
            }
        }
        return null;
    }

    public static boolean getNotificationState(Context context) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                return false;
            }
            return notificationManager.areNotificationsEnabled();
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getNotificationState failed " + th2.getMessage());
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i11 = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class cls2 = Integer.TYPE;
                Method method = cls.getMethod(CHECK_OP_NO_THROW, cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class);
                num.intValue();
                return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i11), packageName)).intValue() == 0;
            } catch (Throwable th3) {
                JCommonLog.m5433w(TAG, "getNotificationState failed " + th3.getMessage());
                return false;
            }
        }
    }

    public static int getPriority(Context context, boolean z11, NotificationMessage notificationMessage) {
        if (z11) {
            return -1;
        }
        int priority = notificationMessage.getPriority();
        if (priority == -2 || priority == -1 || priority == 0 || priority == 1 || priority == 2) {
            return notificationMessage.getPriority();
        }
        return 0;
    }

    public static int getSmallIcon(Context context) {
        int identifier = context.getResources().getIdentifier(NOTIFICATION_ICON, "drawable", context.getPackageName());
        if (identifier > 0) {
            return identifier;
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "get getSmallIcon failed " + th2.getMessage());
            JCommonLog.m5431e(TAG, "please put icon [jpush_notification_icon] in res/drawable");
            return 0;
        }
    }

    public static int getVisibility(Context context, boolean z11, NotificationMessage notificationMessage) {
        int priority;
        if (z11 || (priority = notificationMessage.getPriority()) == -2 || priority == -1) {
            return -1;
        }
        return (priority == 1 || priority == 2) ? 1 : 0;
    }

    public static Bundle convertMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static int getDefaults(Context context, boolean z11, NotificationMessage notificationMessage) {
        if (z11) {
            return (notificationMessage.getDefaults() & 1) == 0 ? notificationMessage.getDefaults() : notificationMessage.getDefaults() - 1;
        }
        switch (notificationMessage.getDefaults()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return notificationMessage.getDefaults();
            default:
                return -1;
        }
    }

    public static String getMessageId(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("ad_id");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObject.optString("msg_id");
        }
        return TextUtils.isEmpty(strOptString) ? jSONObject.optString("_jmsgid_") : strOptString;
    }

    public static RemoteViews getNotificationLayout(Context context, NotificationMessage notificationMessage) {
        try {
            NotificationLayout notificationLayout = JPushBusiness.getInstance().getNotificationLayout(context, notificationMessage.getBuilderId());
            if (notificationLayout == null) {
                JCommonLog.m5430d(TAG, "getNotificationLayout builderId:" + notificationMessage.getBuilderId() + ", notificationLayout is null");
                return null;
            }
            JCommonLog.m5430d(TAG, "getNotificationLayout builderId:" + notificationMessage.getBuilderId() + ", notificationLayout:" + notificationLayout.toString());
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), notificationLayout.getLayoutId());
            if (notificationLayout.getIconViewId() > 0) {
                remoteViews.setImageViewResource(notificationLayout.getIconViewId(), getSmallIcon(context));
                Icon smallIcon = getSmallIcon(context, notificationMessage);
                if (smallIcon != null) {
                    remoteViews.setImageViewIcon(notificationLayout.getIconViewId(), smallIcon);
                }
            }
            if (notificationLayout.getTitleViewId() > 0) {
                remoteViews.setTextViewText(notificationLayout.getTitleViewId(), getTitle(context, notificationMessage));
            }
            if (notificationLayout.getContentViewId() > 0) {
                remoteViews.setTextViewText(notificationLayout.getContentViewId(), getContent(context, notificationMessage));
            }
            if (notificationLayout.getTimeViewId() > 0) {
                remoteViews.setLong(notificationLayout.getTimeViewId(), "setTime", System.currentTimeMillis());
            }
            return remoteViews;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getNotificationLayout failed " + th2.getMessage());
            return null;
        }
    }

    public static PendingIntent getPendingIntent(Context context, String str, NotificationMessage notificationMessage) {
        Intent intent = new Intent();
        intent.setClass(context, JCommonActivity.class);
        intent.setAction(str);
        intent.addFlags(276824064);
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", notificationMessage);
        intent.putExtras(bundle);
        return PendingIntent.getActivity(context, notificationMessage.getNotificationId(), intent, 67108864);
    }

    public static Bitmap getPictureBitmap(Context context, String str) {
        Bitmap bitmapDecodeByteArray;
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                byte[] bArr = new HttpUtils().get(context, str);
                if (bArr == null) {
                    JCommonLog.m5430d(TAG, "getPicture bytes is null");
                    return null;
                }
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            } else {
                bitmapDecodeByteArray = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier(str, "drawable", context.getPackageName()));
            }
            Runtime.getRuntime().gc();
            return bitmapDecodeByteArray;
        } catch (Throwable th2) {
            try {
                JCommonLog.m5433w(TAG, "get pictureBitmap failed " + th2.getMessage());
            } finally {
                Runtime.getRuntime().gc();
            }
        }
    }

    public static Uri getSoundUri(Context context, boolean z11, NotificationMessage notificationMessage) {
        if (z11) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(notificationMessage.getSound())) {
                return null;
            }
            if (context.getResources().getIdentifier(notificationMessage.getSound(), "raw", context.getPackageName()) == 0) {
                JCommonLog.m5430d(TAG, "there are no sound resource");
                return null;
            }
            return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + notificationMessage.getSound());
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getSoundUri failed " + th2.getMessage());
            return null;
        }
    }

    public static boolean goToAppNotificationSettings(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
                intent.setFlags(268435456);
                context.startActivity(intent);
                return true;
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("app_package", context.getPackageName());
            intent2.putExtra("app_uid", context.getApplicationInfo().uid);
            intent2.setFlags(268435456);
            context.startActivity(intent2);
            return true;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "goToAppNotificationSettings failed " + th2.getMessage());
            return false;
        }
    }

    public static void setHuaweiBadgeNumber(Context context, int i11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString(TPDownloadProxyEnum.DLPARAM_PACKAGE, context.getPackageName());
            String launchActivityClassName = getLaunchActivityClassName(context);
            if (TextUtils.isEmpty(launchActivityClassName)) {
                return;
            }
            JCommonLog.m5430d(TAG, "setHuaweiBadgeNumber " + i11);
            bundle.putString("class", launchActivityClassName);
            bundle.putInt("badgenumber", i11);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "setHuaweiBadgeNumber failed " + th2.getMessage());
        }
    }

    public static void setNotificationBadge(Context context, Notification notification, int i11) {
        if (i11 == 0) {
            return;
        }
        int notificationBadge = JPushBusiness.getInstance().getNotificationBadge(context);
        int i12 = notificationBadge + i11;
        JPushConfig.setNotificationBadge(context, i12);
        JCommonLog.m5430d(TAG, "setNotificationBadge cacheNotificationBadge[" + notificationBadge + "]+currentNotificationBadge[" + i11 + "]");
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "huawei":
            case "honor":
                setHuaweiBadgeNumber(context, i12);
                break;
            case "xiaomi":
                setXiaomiBadgeNumber(context, notification, i11);
                break;
        }
    }

    public static void setXiaomiBadgeNumber(Context context, Notification notification, int i11) {
        if (notification == null) {
            return;
        }
        if (i11 <= 0) {
            i11 = 0;
        }
        try {
            Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
            obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i11));
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "setXiaomiBadgeNumber failed " + th2.getMessage());
        }
    }

    public static Notification.BigTextStyle getBigTextStyle(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Notification.BigTextStyle().bigText(str);
    }

    public static String getContent(Context context, NotificationMessage notificationMessage) {
        if (TextUtils.isEmpty(notificationMessage.getContent())) {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        }
        return notificationMessage.getContent();
    }

    public static int getIconColor(Context context) {
        int identifier = context.getResources().getIdentifier(NOTIFICATION_COLOR, "color", context.getPackageName());
        if (identifier > 0) {
            return context.getColor(identifier);
        }
        JCommonLog.m5431e(TAG, "please put icon [jpush_notification_color] in res/color");
        return 0;
    }

    public static Bitmap getLargeIcon(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getPictureBitmap(context, str);
    }

    private static String getLaunchActivityClassName(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null && launchIntentForPackage.getComponent() != null) {
                return launchIntentForPackage.getComponent().getClassName();
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage(context.getPackageName());
            intent.addCategory("android.intent.category.LAUNCHER");
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null) {
                resolveInfoResolveActivity = packageManager.resolveActivity(launchIntentForPackage, 0);
            }
            if (resolveInfoResolveActivity != null) {
                return resolveInfoResolveActivity.activityInfo.name;
            }
            return "";
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getLaunchActivityClassName failed " + th2.getMessage());
            return "";
        }
    }

    public static int getNotificationId(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            JCommonLog.m5430d(TAG, "the messageId [" + str + "] will convert to adler32");
            try {
                Adler32 adler32 = new Adler32();
                adler32.update(str.getBytes());
                int value = (int) adler32.getValue();
                if (value < 0) {
                    return Math.abs(value);
                }
                return value;
            } catch (Throwable th2) {
                JCommonLog.m5433w(TAG, "getNotificationId failed " + th2.getMessage());
                return 0;
            }
        }
    }

    public static Notification.Style getStyle(Context context, NotificationMessage notificationMessage) {
        int style = notificationMessage.getStyle();
        if (style != 1) {
            if (style != 2) {
                if (style != 3) {
                    return null;
                }
                return getBigPictureStyle(context, notificationMessage.getBigPicture());
            }
            return getInboxStyle(context, notificationMessage.getInbox());
        }
        return getBigTextStyle(context, notificationMessage.getBigText());
    }

    public static String getTitle(Context context, NotificationMessage notificationMessage) {
        if (TextUtils.isEmpty(notificationMessage.getTitle())) {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        }
        return notificationMessage.getTitle();
    }

    public static Icon getSmallIcon(Context context, NotificationMessage notificationMessage) {
        Bitmap pictureBitmap;
        try {
            if (TextUtils.isEmpty(notificationMessage.getSmallIcon()) || (pictureBitmap = getPictureBitmap(context, notificationMessage.getSmallIcon())) == null) {
                return null;
            }
            return Icon.createWithBitmap(pictureBitmap);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getSmallIcon failed " + th2.getMessage());
            return null;
        }
    }
}
