package com.sensorsdata.abtest.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.sensorsdata.abtest.service.GlobalLoopService;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes23.dex */
public class AlarmManagerUtils {
    private static final int TIME_INTERVAL = 600000;
    private static AlarmManagerUtils instance;
    private AlarmManager mAlarm;
    private PendingIntent mPendingIntent;

    public static AlarmManagerUtils getInstance(Context context) {
        if (instance == null) {
            synchronized (AlarmManagerUtils.class) {
                try {
                    if (instance == null) {
                        instance = new AlarmManagerUtils(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return instance;
    }

    public void cancelAlarm() {
        try {
            this.mAlarm.cancel(this.mPendingIntent);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void setUpAlarmOnReceiver() {
        try {
            this.mAlarm.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + 600000, this.mPendingIntent);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private AlarmManagerUtils(Context context) {
        try {
            this.mAlarm = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            this.mPendingIntent = PendingIntent.getService(context, 0, new Intent(context, (Class<?>) GlobalLoopService.class), 67108864);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void setUpAlarm() {
        try {
            cancelAlarm();
            this.mAlarm.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + 600000, this.mPendingIntent);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
