package com.sensorsdata.analytics.android.sdk.aop.push;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.ThreadNameConstants;
import com.sensorsdata.analytics.android.sdk.util.FileUtils;
import com.tencent.bugly.proguard.C33820nf;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class PushProcess {
    private static final String DIR_NAME = "sensors.push";
    private static final int GT_PUSH_MSG = 1;
    private static PushProcess INSTANCE = null;
    private static final String SA_PUSH_ID = "SA_PUSH_ID";
    private static final String TAG = "SA.NotificationProcessor";
    private final boolean customizeEnable;
    private final Map<String, NotificationInfo> mGeTuiPushInfoMap;
    private WeakReference<Intent> mLastIntentRef;
    private final WeakHashMap<PendingIntent, String> mPendingIntent2Ids;
    private File mPushFile;
    private final Handler mPushHandler;
    private final AtomicInteger mSAIntentId;
    private final int myPid;

    public static class NotificationInfo {
        String content;
        long time;
        String title;

        public static NotificationInfo fromJson(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new NotificationInfo(jSONObject.optString("title"), jSONObject.optString("content"), jSONObject.optLong("time"));
            } catch (JSONException e11) {
                SALog.printStackTrace(e11);
                return null;
            }
        }

        public String toJson() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", this.title);
                jSONObject.put("content", this.content);
                jSONObject.put("time", this.time);
                return jSONObject.toString();
            } catch (JSONException e11) {
                SALog.printStackTrace(e11);
                return null;
            }
        }

        public String toString() {
            return "NotificationInfo{title='" + this.title + "', content='" + this.content + "', time=" + this.time + '}';
        }

        public NotificationInfo(String str, String str2, long j11) {
            this.title = str;
            this.content = str2;
            this.time = j11;
        }
    }

    private NotificationInfo getNotificationInfo(Notification notification) {
        NotificationInfo notificationInfo = null;
        try {
            String string = notification.extras.getString(NotificationCompat.EXTRA_TITLE);
            String string2 = notification.extras.getString(NotificationCompat.EXTRA_TEXT);
            NotificationInfo notificationInfo2 = new NotificationInfo(string, string2, 0L);
            try {
                SALog.m68589i(TAG, "NotificationInfo: title = " + string + "content = " + string2);
                return notificationInfo2;
            } catch (Exception e11) {
                e = e11;
                notificationInfo = notificationInfo2;
                SALog.printStackTrace(e);
                return notificationInfo;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private synchronized void initAndCleanDir() {
        try {
            try {
                if (!this.mPushFile.exists()) {
                    this.mPushFile.mkdirs();
                }
                File[] fileArrListFiles = this.mPushFile.listFiles();
                if (fileArrListFiles != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (File file : fileArrListFiles) {
                        if (jCurrentTimeMillis - file.lastModified() > 86400000) {
                            SALog.m68589i(TAG, "clean file: " + file.toString());
                            file.delete();
                        }
                    }
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndStoreNotificationInfo(PendingIntent pendingIntent, NotificationInfo notificationInfo) throws Throwable {
        if (pendingIntent == null) {
            SALog.m68589i(TAG, "pendingIntent is null");
            return;
        }
        try {
            String str = this.mPendingIntent2Ids.get(pendingIntent);
            if (str != null) {
                storeNotificationInfo(notificationInfo, str);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static synchronized PushProcess getInstance() {
        try {
            if (INSTANCE == null) {
                INSTANCE = new PushProcess();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return INSTANCE;
    }

    private boolean isHooked(Intent intent) {
        try {
            return intent.hasExtra(SA_PUSH_ID);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    private void storeNotificationInfo(NotificationInfo notificationInfo, String str) throws Throwable {
        SALog.m68589i(TAG, "storeNotificationInfo: id=" + str + ", actionInfo" + notificationInfo);
        try {
            initAndCleanDir();
            File file = new File(this.mPushFile, str);
            if (file.exists()) {
                SALog.m68589i(TAG, "toFile exists");
                file.delete();
            }
            FileUtils.writeToFile(file, notificationInfo.toJson());
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void trackCustomizeClick(Intent intent) {
        if (this.customizeEnable) {
            try {
                if (isHooked(intent)) {
                    final String stringExtra = intent.getStringExtra(SA_PUSH_ID);
                    intent.removeExtra(SA_PUSH_ID);
                    if (TextUtils.isEmpty(stringExtra)) {
                        SALog.m68589i(TAG, "intent tag is null");
                    } else {
                        this.mPushHandler.post(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.aop.push.PushProcess.3
                            @Override // java.lang.Runnable
                            public void run() throws Throwable {
                                NotificationInfo notificationInfo = PushProcess.this.getNotificationInfo(stringExtra);
                                if (notificationInfo != null) {
                                    PushAutoTrackHelper.trackNotificationOpenedEvent(null, notificationInfo.title, notificationInfo.content, "Local", null);
                                }
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public void hookIntent(Intent intent) {
        if (this.customizeEnable) {
            try {
                if (isHooked(intent)) {
                    return;
                }
                intent.putExtra(SA_PUSH_ID, this.myPid + C33820nf.f71144W + this.mSAIntentId.getAndIncrement());
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public void hookPendingIntent(Intent intent, PendingIntent pendingIntent) {
        if (this.customizeEnable) {
            this.mPendingIntent2Ids.put(pendingIntent, intent.getStringExtra(SA_PUSH_ID));
        }
    }

    public void onNotificationClick(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            WeakReference<Intent> weakReference = this.mLastIntentRef;
            if (weakReference != null && weakReference.get() == intent) {
                return;
            }
            this.mLastIntentRef = new WeakReference<>(intent);
            if (this.customizeEnable) {
                trackCustomizeClick(intent);
            }
            if (context instanceof Activity) {
                PushAutoTrackHelper.trackJPushOpenActivity(intent);
            }
            SALog.m68589i(TAG, "onNotificationClick");
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void onNotify(String str, int i11, final Notification notification) {
        if (this.customizeEnable) {
            try {
                if (notification.contentIntent != null) {
                    SALog.m68589i(TAG, "onNotify, tag: " + str + ", id=" + i11);
                    final NotificationInfo notificationInfo = getNotificationInfo(notification);
                    if (notificationInfo != null) {
                        this.mPushHandler.post(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.aop.push.PushProcess.2
                            @Override // java.lang.Runnable
                            public void run() throws Throwable {
                                PushProcess.this.checkAndStoreNotificationInfo(notification.contentIntent, notificationInfo);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    public void trackReceiveMessageData(String str, String str2) {
        try {
            if (this.mPushHandler.hasMessages(1) && this.mGeTuiPushInfoMap.containsKey(str2)) {
                this.mPushHandler.removeMessages(1);
                SALog.m68589i(TAG, "remove GeTui Push Message");
                NotificationInfo notificationInfo = this.mGeTuiPushInfoMap.get(str2);
                if (notificationInfo != null) {
                    PushAutoTrackHelper.trackGeTuiNotificationClicked(notificationInfo.title, notificationInfo.content, str, notificationInfo.time);
                }
                this.mGeTuiPushInfoMap.remove(str2);
                SALog.m68589i(TAG, " onGeTuiReceiveMessage:msg id : " + str2);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private PushProcess() {
        Context context = SensorsDataAPI.sharedInstance().getContext();
        if (context != null) {
            this.mPushFile = new File(context.getFilesDir(), DIR_NAME);
        }
        this.mSAIntentId = new AtomicInteger();
        this.myPid = Process.myPid();
        this.customizeEnable = true;
        this.mPendingIntent2Ids = new WeakHashMap<>();
        this.mGeTuiPushInfoMap = new HashMap();
        HandlerThread handlerThread = new HandlerThread(ThreadNameConstants.THREAD_PUSH_HANDLER);
        handlerThread.start();
        this.mPushHandler = new Handler(handlerThread.getLooper()) { // from class: com.sensorsdata.analytics.android.sdk.aop.push.PushProcess.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    try {
                        String str = (String) message.obj;
                        if (TextUtils.isEmpty(str) || !PushProcess.this.mGeTuiPushInfoMap.containsKey(str)) {
                            return;
                        }
                        NotificationInfo notificationInfo = (NotificationInfo) PushProcess.this.mGeTuiPushInfoMap.get(str);
                        PushProcess.this.mGeTuiPushInfoMap.remove(str);
                        if (notificationInfo != null) {
                            PushAutoTrackHelper.trackGeTuiNotificationClicked(notificationInfo.title, notificationInfo.content, null, notificationInfo.time);
                        }
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            }
        };
    }

    public void trackGTClickDelayed(String str, String str2, String str3) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = str;
            this.mGeTuiPushInfoMap.put(str, new NotificationInfo(str2, str3, System.currentTimeMillis()));
            this.mPushHandler.sendMessageDelayed(messageObtain, 200L);
            SALog.m68589i(TAG, "sendMessageDelayed,msgId = " + str);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NotificationInfo getNotificationInfo(String str) throws Throwable {
        try {
            initAndCleanDir();
            File file = new File(this.mPushFile, str);
            if (!file.exists()) {
                return null;
            }
            String fileToString = FileUtils.readFileToString(file);
            if (TextUtils.isEmpty(fileToString)) {
                return null;
            }
            SALog.m68589i(TAG, "cache local notification info:" + fileToString);
            return NotificationInfo.fromJson(fileToString);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }
}
