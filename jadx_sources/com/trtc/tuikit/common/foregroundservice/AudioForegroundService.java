package com.trtc.tuikit.common.foregroundservice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.browser.trusted.C0671f;
import androidx.core.app.NotificationCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.R$string;
import com.trtc.tuikit.common.system.ContextProvider;
import uc0.C45153b;

/* JADX INFO: loaded from: classes2.dex */
public class AudioForegroundService extends Service {

    /* JADX INFO: renamed from: b */
    public static ServiceState f77450b = ServiceState.IDLE;

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        if (intent == null) {
            Log.e("AudioForegroundService", "onStartCommand intent == null, state = " + f77450b);
            return 2;
        }
        Notification notificationM79352b = m79352b(intent.getStringExtra("title"), intent.getStringExtra(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION), intent.getIntExtra(TUIConstants.TUIChat.INPUT_MORE_ICON, ContextProvider.m79397b().getApplicationInfo().icon));
        if (Build.VERSION.SDK_INT >= 30) {
            startForeground(1001, notificationM79352b, 128);
        } else {
            startForeground(1001, notificationM79352b);
        }
        Log.d("AudioForegroundService", "onStartCommand end, state = " + f77450b);
        if (f77450b == ServiceState.STOPPING) {
            stopSelf();
            f77450b = ServiceState.IDLE;
        } else {
            f77450b = ServiceState.RUNNING;
        }
        return 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m79351a() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(1001);
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.deleteNotificationChannel("rtc_uikit_foreground_service");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Notification m79352b(String str, String str2, int i11) {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (C45153b.m99803c() >= 26) {
            String string = getApplicationContext().getString(R$string.common_rtc_channel_name);
            String string2 = getApplicationContext().getString(R$string.common_rtc_channel_description);
            NotificationChannel notificationChannelM1622a = C0671f.m1622a("rtc_uikit_foreground_service", string, 2);
            notificationChannelM1622a.setDescription(string2);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelM1622a);
            }
        }
        Log.i("AudioForegroundService", "enableNotification: " + (C45153b.m99803c() >= 24 ? notificationManager.areNotificationsEnabled() : true));
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), "rtc_uikit_foreground_service");
        builder.setSmallIcon(i11);
        builder.setContentTitle(str);
        builder.setContentText(str2);
        builder.setWhen(System.currentTimeMillis());
        return builder.build();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m79351a();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        stopSelf();
        f77450b = ServiceState.IDLE;
    }
}
