package com.trtc.tuikit.common.foregroundservice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.browser.trusted.C0671f;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.R$string;
import com.trtc.tuikit.common.system.ContextProvider;
import uc0.C45153b;

/* JADX INFO: loaded from: classes2.dex */
public class VideoForegroundService extends Service {

    /* JADX INFO: renamed from: b */
    public static ServiceState f77453b = ServiceState.IDLE;

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        if (intent == null) {
            Log.e("VideoForegroundService", "onStartCommand intent == null, state = " + f77453b);
            return 2;
        }
        Notification notificationM79360c = m79360c(intent.getStringExtra("title"), intent.getStringExtra(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION), intent.getIntExtra(TUIConstants.TUIChat.INPUT_MORE_ICON, ContextProvider.m79397b().getApplicationInfo().icon));
        if (Build.VERSION.SDK_INT >= 30) {
            startForeground(1001, notificationM79360c, 192);
        } else {
            startForeground(1001, notificationM79360c);
        }
        Log.d("VideoForegroundService", "onStartCommand end, state = " + f77453b);
        if (f77453b == ServiceState.STOPPING) {
            stopSelf();
            f77453b = ServiceState.IDLE;
        } else {
            f77453b = ServiceState.RUNNING;
        }
        return 2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79356a(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
    }

    /* JADX INFO: renamed from: d */
    public static void m79357d(Context context, String str, String str2, int i11) {
        ServiceState serviceState = f77453b;
        ServiceState serviceState2 = ServiceState.STARTING;
        if (serviceState == serviceState2 || f77453b == ServiceState.RUNNING) {
            Log.i("VideoForegroundService", "start foreground service，service is running");
            return;
        }
        if (f77453b == ServiceState.STOPPING) {
            f77453b = serviceState2;
            Log.i("VideoForegroundService", "start foreground service，service is stopping");
            return;
        }
        f77453b = serviceState2;
        if (!m79356a(context)) {
            f77453b = ServiceState.IDLE;
            Log.w("VideoForegroundService", "start foreground service failed, please grant camera and microphone permission");
            return;
        }
        Log.d("VideoForegroundService", "start foreground service title=" + str + " description=" + str2);
        Intent intent = new Intent(context, (Class<?>) VideoForegroundService.class);
        intent.putExtra("title", str);
        intent.putExtra(TUIConstants.TUIChat.INPUT_MORE_ICON, i11);
        intent.putExtra(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, str2);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m79358e(Context context) {
        Log.d("VideoForegroundService", "stop foreground service: state = " + f77453b);
        if (ServiceState.RUNNING == f77453b) {
            context.stopService(new Intent(context, (Class<?>) VideoForegroundService.class));
            f77453b = ServiceState.IDLE;
        } else if (ServiceState.STARTING == f77453b) {
            f77453b = ServiceState.STOPPING;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m79359b() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(1001);
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.deleteNotificationChannel("rtc_uikit_foreground_service");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Notification m79360c(String str, String str2, int i11) {
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
        Log.i("VideoForegroundService", "enableNotification: " + (C45153b.m99803c() >= 24 ? notificationManager.areNotificationsEnabled() : true));
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
        m79359b();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        stopSelf();
        f77453b = ServiceState.IDLE;
    }
}
