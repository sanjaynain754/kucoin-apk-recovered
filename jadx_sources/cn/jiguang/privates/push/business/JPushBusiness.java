package cn.jiguang.privates.push.business;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.api.JReporter;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.push.api.NotificationLayout;
import cn.jiguang.privates.push.cache.JPushConfig;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.utils.NotificationUtil;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33844oi;
import java.util.Arrays;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JPushBusiness {
    private static final String TAG = "JPushBusiness";
    private static volatile JPushBusiness instance;
    private int lastNotificationState = -1;

    public void resetNotificationBadge(Context context) {
        JPushConfig.setNotificationBadge(context, 0);
        String str = Build.MANUFACTURER;
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str.toLowerCase();
        lowerCase2.getClass();
        if (lowerCase2.equals(JPushConstants.Manufacturer.HUAWEI) || lowerCase2.equals(JPushConstants.Manufacturer.HONOR)) {
            NotificationUtil.setHuaweiBadgeNumber(context, 0);
            return;
        }
        JCommonLog.m5430d(TAG, "setNotificationBadge not support " + lowerCase);
    }

    public static JPushBusiness getInstance() {
        if (instance == null) {
            synchronized (JPushBusiness.class) {
                instance = new JPushBusiness();
            }
        }
        return instance;
    }

    private void processNotificationState(Context context, int i11, boolean z11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(JPushConstants.NotificationState.KEY_STATE, z11);
            JCommonPrivatesApi.sendMessageToMainProcess(context, 3006, bundle);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JPushConstants.NotificationState.KEY_STATE, z11);
            jSONObject.put("trigger_scene", i11);
            JReporter content = new JReporter().setType("android_notification_state").setContent(jSONObject.toString());
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("protocol", content);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle2);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.REPORT_NOTIFICATION_STATE, bundle2);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onNotificationState failed " + th2.getMessage());
        }
    }

    public NotificationLayout getNotificationLayout(Context context, int i11) {
        try {
            String notificationLayout = JPushConfig.getNotificationLayout(context, i11);
            if (TextUtils.isEmpty(notificationLayout)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(notificationLayout);
            if (jSONObject.length() == 0) {
                return null;
            }
            int iOptInt = jSONObject.optInt(JPushConstants.NotificationLayout.KEY_LAYOUT_ID);
            int iOptInt2 = jSONObject.optInt(JPushConstants.NotificationLayout.KEY_ICON_VIEW_ID);
            int iOptInt3 = jSONObject.optInt(JPushConstants.NotificationLayout.KEY_ICON_RESOURCE_ID);
            int iOptInt4 = jSONObject.optInt(JPushConstants.NotificationLayout.KEY_TITLE_VIEW_ID);
            NotificationLayout timeViewId = new NotificationLayout().setLayoutId(iOptInt).setIconViewId(iOptInt2).setIconResourceId(iOptInt3).setTitleViewId(iOptInt4).setContentViewId(jSONObject.optInt(JPushConstants.NotificationLayout.KEY_CONTENT_VIEW_ID)).setTimeViewId(jSONObject.optInt(JPushConstants.NotificationLayout.KEY_TIME_VIEW_ID));
            JCommonLog.m5430d(TAG, "getNotificationLayout builderId:" + i11 + timeViewId.toString());
            return timeViewId;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getNotificationLayout builderId:" + i11 + " failed " + th2.getMessage());
            return null;
        }
    }

    public boolean isNotificationShowTime(Context context) {
        try {
            String notificationShowTime = JPushConfig.getNotificationShowTime(context);
            if (TextUtils.isEmpty(notificationShowTime)) {
                return true;
            }
            JCommonLog.m5430d(TAG, "isNotificationShowTime showTime:" + notificationShowTime);
            String[] strArrSplit = notificationShowTime.split("_");
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            char[] charArray = str.toCharArray();
            String[] strArrSplit2 = str2.split("\\^");
            Calendar calendar = Calendar.getInstance();
            int i11 = calendar.get(7);
            int i12 = calendar.get(11);
            JCommonLog.m5430d(TAG, "isNotificationShowTime currentHour:" + i12 + ",currentDay:" + i11);
            int length = charArray.length;
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = Integer.parseInt(String.valueOf(charArray[i13]));
                JCommonLog.m5430d(TAG, "settingDay:" + i14);
                if (i11 != i14 + 1) {
                    break;
                }
                int i15 = Integer.parseInt(strArrSplit2[0]);
                int i16 = Integer.parseInt(strArrSplit2[1]);
                if (i12 >= i15 && i12 <= i16) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "isNotificationShowTime failed " + th2.getMessage());
            return true;
        }
    }

    public boolean isNotificationSilenceTime(Context context) {
        try {
            String notificationSilenceTime = JPushConfig.getNotificationSilenceTime(context);
            if (TextUtils.isEmpty(notificationSilenceTime)) {
                return false;
            }
            JCommonLog.m5430d(TAG, "isNotificationSilenceTime cacheSilenceTime:" + notificationSilenceTime);
            JSONObject jSONObject = new JSONObject(notificationSilenceTime);
            int iOptInt = jSONObject.optInt(JPushConstants.NotificationTime.KEY_BEGIN_HOUR);
            int iOptInt2 = jSONObject.optInt(JPushConstants.NotificationTime.KEY_BEGIN_MINUTE);
            int iOptInt3 = jSONObject.optInt(JPushConstants.NotificationTime.KEY_END_HOUR);
            int iOptInt4 = jSONObject.optInt(JPushConstants.NotificationTime.KEY_END_MINUTE);
            Calendar calendar = Calendar.getInstance();
            int i11 = calendar.get(11);
            int i12 = calendar.get(12);
            JCommonLog.m5430d(TAG, "isNotificationSilenceTime currentTime:" + i11 + C33844oi.f71346o + i12 + ", silenceTime:" + iOptInt + C33844oi.f71346o + iOptInt2 + C33820nf.f71144W + iOptInt3 + C33844oi.f71346o + iOptInt4);
            if (iOptInt < iOptInt3) {
                if (i11 > iOptInt && i11 < iOptInt3) {
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 1");
                    return true;
                }
                if (i11 == iOptInt && i12 >= iOptInt2) {
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 2");
                    return true;
                }
                if (i11 != iOptInt3 || i12 > iOptInt4) {
                    JCommonLog.m5430d(TAG, "not notificationSilenceTime 1");
                    return false;
                }
                JCommonLog.m5430d(TAG, "is notificationSilenceTime 3");
                return true;
            }
            if (iOptInt == iOptInt3) {
                if (iOptInt2 < iOptInt4) {
                    if (i11 != iOptInt || i12 < iOptInt2 || i12 > iOptInt4) {
                        JCommonLog.m5430d(TAG, "not notificationSilenceTime 3");
                        return false;
                    }
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 7");
                    return true;
                }
                if (i11 != iOptInt) {
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 4");
                    return true;
                }
                if (i12 >= iOptInt2) {
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 5");
                    return true;
                }
                if (i12 <= iOptInt4) {
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 6");
                    return true;
                }
                JCommonLog.m5430d(TAG, "not notificationSilenceTime 2");
                return false;
            }
            if (iOptInt > iOptInt3) {
                if (i11 > iOptInt && i11 <= 23) {
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 8");
                    return true;
                }
                if (i11 >= 0 && i11 < iOptInt3) {
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 9");
                    return true;
                }
                if (i11 == iOptInt && i12 >= iOptInt2) {
                    JCommonLog.m5430d(TAG, "is notificationSilenceTime 10");
                    return true;
                }
                if (i11 != iOptInt3 || i12 > iOptInt4) {
                    JCommonLog.m5430d(TAG, "not notificationSilenceTime 4");
                    return false;
                }
                JCommonLog.m5430d(TAG, "is notificationSilenceTime 11");
                return true;
            }
            JCommonLog.m5430d(TAG, "not notificationSilenceTime 5");
            return false;
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "isNotificationSilenceTime failed " + th2.getMessage());
        }
    }

    public void resetNotificationCount(Context context) {
        JCommonLog.m5430d(TAG, "resetNotificationCount");
        JPushConfig.setNotificationCount(context, 5);
    }

    public void resetNotificationLayout(Context context, Bundle bundle) {
        int i11 = bundle.getInt("id");
        JCommonLog.m5430d(TAG, "resetNotificationLayout builderId:" + i11);
        JPushConfig.setNotificationLayout(context, i11, "");
    }

    public void resetNotificationShowTime(Context context) {
        JCommonLog.m5430d(TAG, "resetNotificationShowTime");
        JPushConfig.setNotificationShowTime(context, "");
    }

    public void resetNotificationSilenceTime(Context context) {
        JCommonLog.m5430d(TAG, "resetNotificationSilenceTime");
        JPushConfig.setNotificationSilenceTime(context, "");
    }

    public void setNotificationBadge(Context context, Bundle bundle) {
        int i11 = bundle.getInt("notification_badge");
        if (i11 < 0) {
            JCommonLog.m5431e(TAG, "setNotificationBadge error: number count must >= 0");
            return;
        }
        JPushConfig.setNotificationBadge(context, i11);
        String str = Build.MANUFACTURER;
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str.toLowerCase();
        lowerCase2.getClass();
        if (lowerCase2.equals(JPushConstants.Manufacturer.HUAWEI) || lowerCase2.equals(JPushConstants.Manufacturer.HONOR)) {
            NotificationUtil.setHuaweiBadgeNumber(context, i11);
            return;
        }
        JCommonLog.m5430d(TAG, "setNotificationBadge not support " + lowerCase);
    }

    public void setNotificationCount(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i11 = bundle.getInt(JPushConstants.NotificationCount.KEY_COUNT);
        if (i11 <= 0) {
            JCommonLog.m5431e(TAG, "setNotificationCount error: count must > 0");
            return;
        }
        JCommonLog.m5431e(TAG, "setNotificationCount " + i11);
        JPushConfig.setNotificationCount(context, i11);
    }

    public void setNotificationLayout(Context context, Bundle bundle) {
        try {
            bundle.setClassLoader(NotificationLayout.class.getClassLoader());
            int i11 = bundle.getInt("id");
            NotificationLayout notificationLayout = (NotificationLayout) bundle.getParcelable(JPushConstants.NotificationLayout.KEY_NOTIFICATION_LAYOUT);
            JCommonLog.m5430d(TAG, "setNotificationLayout id:" + i11 + notificationLayout.toString());
            int layoutId = notificationLayout.getLayoutId();
            int iconViewId = notificationLayout.getIconViewId();
            int iconResourceId = notificationLayout.getIconResourceId();
            int titleViewId = notificationLayout.getTitleViewId();
            int contentViewId = notificationLayout.getContentViewId();
            int timeViewId = notificationLayout.getTimeViewId();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JPushConstants.NotificationLayout.KEY_LAYOUT_ID, layoutId);
            jSONObject.put(JPushConstants.NotificationLayout.KEY_ICON_VIEW_ID, iconViewId);
            jSONObject.put(JPushConstants.NotificationLayout.KEY_ICON_RESOURCE_ID, iconResourceId);
            jSONObject.put(JPushConstants.NotificationLayout.KEY_TITLE_VIEW_ID, titleViewId);
            jSONObject.put(JPushConstants.NotificationLayout.KEY_CONTENT_VIEW_ID, contentViewId);
            jSONObject.put(JPushConstants.NotificationLayout.KEY_TIME_VIEW_ID, timeViewId);
            JPushConfig.setNotificationLayout(context, i11, jSONObject.toString());
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "setNotificationLayout failed " + th2.getMessage());
        }
    }

    public void setNotificationShowTime(Context context, Bundle bundle) {
        try {
            JCommonLog.m5430d(TAG, "setNotificationShowTime:" + JCommonLog.toLogString(bundle));
            int[] intArray = bundle.getIntArray(JPushConstants.NotificationTime.KEY_DAYS);
            if (intArray.length == 0) {
                JCommonLog.m5430d(TAG, "setNotificationShowTime weekDays.length is 0, can't show notification everyTime");
                JPushConfig.setNotificationShowTime(context, "");
                return;
            }
            int i11 = bundle.getInt(JPushConstants.NotificationTime.KEY_BEGIN_HOUR);
            int i12 = bundle.getInt(JPushConstants.NotificationTime.KEY_END_HOUR);
            JCommonLog.m5430d(TAG, "setNotificationShowTime startHour:" + i11 + ",endHour:" + i12 + ",weekDays:" + Arrays.toString(intArray));
            StringBuilder sb2 = new StringBuilder();
            for (int i13 : intArray) {
                sb2.append(Integer.valueOf(i13));
            }
            sb2.append("_");
            sb2.append(i11);
            sb2.append("^");
            sb2.append(i12);
            if (Pattern.compile("([0-6]{0,7})_((([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3]))|(([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3])-)+(([0-9]|1[0-9]|2[0-3])\\^([0-9]|1[0-9]|2[0-3])))").matcher(sb2).matches()) {
                JPushConfig.setNotificationShowTime(context, sb2.toString());
                return;
            }
            JCommonLog.m5431e(TAG, "setNotificationShowTime invalid time format - " + ((Object) sb2));
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "setNotificationPushTime failed " + th2.getMessage());
        }
    }

    public void setNotificationSilenceTime(Context context, Bundle bundle) {
        try {
            int i11 = bundle.getInt(JPushConstants.NotificationTime.KEY_BEGIN_HOUR);
            int i12 = bundle.getInt(JPushConstants.NotificationTime.KEY_BEGIN_MINUTE);
            int i13 = bundle.getInt(JPushConstants.NotificationTime.KEY_END_HOUR);
            int i14 = bundle.getInt(JPushConstants.NotificationTime.KEY_END_MINUTE);
            JCommonLog.m5430d(TAG, "setNotificationSilenceTime:" + i11 + C33844oi.f71346o + i12 + C33820nf.f71144W + i13 + C33844oi.f71346o + i14);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JPushConstants.NotificationTime.KEY_BEGIN_HOUR, i11);
            jSONObject.put(JPushConstants.NotificationTime.KEY_BEGIN_MINUTE, i12);
            jSONObject.put(JPushConstants.NotificationTime.KEY_END_HOUR, i13);
            jSONObject.put(JPushConstants.NotificationTime.KEY_END_MINUTE, i14);
            JPushConfig.setNotificationSilenceTime(context, jSONObject.toString());
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "setNotificationSilenceTime failed " + th2.getMessage());
        }
    }

    public int getNotificationBadge(Context context) {
        return JPushConfig.getNotificationBadge(context);
    }

    public int getNotificationCount(Context context) {
        return JPushConfig.getNotificationCount(context);
    }

    public void processMainNotificationState(Context context, Bundle bundle) {
        try {
            JCommonReceiver commonReceiver = JGlobal.getCommonReceiver(context);
            if (commonReceiver != null) {
                commonReceiver.onNotificationStatus(context, bundle.getBoolean(JPushConstants.NotificationState.KEY_STATE));
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "processMainNotificationState failed " + th2.getMessage());
        }
    }

    public void processRemoteNotificationState(Context context, int i11) {
        boolean notificationState = NotificationUtil.getNotificationState(context);
        int i12 = this.lastNotificationState;
        if (i12 == -1) {
            JCommonLog.m5430d(TAG, "notification state is " + notificationState);
            this.lastNotificationState = notificationState ? 1 : 0;
            processNotificationState(context, i11, notificationState);
            return;
        }
        if (i12 == notificationState) {
            JCommonLog.m5430d(TAG, "no need update notification state lastNotificationState:" + this.lastNotificationState + ",currentNotificationState:" + (notificationState ? 1 : 0));
            return;
        }
        JCommonLog.m5430d(TAG, "notification state is " + notificationState);
        this.lastNotificationState = notificationState ? 1 : 0;
        processNotificationState(context, i11, notificationState);
    }
}
