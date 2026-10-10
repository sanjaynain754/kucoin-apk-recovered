package com.tencent.rtmp.video;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Binder;
import android.os.IBinder;
import androidx.browser.trusted.C0671f;

/* JADX INFO: loaded from: classes56.dex */
public class ScreenCaptureService extends Service {
    private static final String CHANNEL_ID = "notification_id";
    private static final int NOTIFICATION_ID = 13957237;
    private static final String TAG = "ScreenCaptureService";

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f75437b = 0;

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        BaseBridge.printLog(TAG, "Service on bind");
        return new Binder();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        MediaProjection mediaProjection;
        int intExtra = intent.getIntExtra("code", -1);
        Intent intent2 = (Intent) intent.getParcelableExtra("data");
        BaseBridge.printLog(TAG, "On Start server command, code:" + intExtra + ", data:" + intent2);
        if (intent2 == null) {
            stopSelf();
            return 2;
        }
        try {
            if (BaseBridge.getSystemOSVersion() >= 29) {
                startForeground(NOTIFICATION_ID, createNotification(), 32);
            } else if (BaseBridge.getSystemOSVersion() >= 26) {
                startForeground(NOTIFICATION_ID, createNotification());
            }
        } catch (Throwable th2) {
            BaseBridge.printLog(TAG, "start foreground failed.".concat(String.valueOf(th2)));
        }
        if (BaseBridge.getSystemOSVersion() >= 21) {
            try {
                mediaProjection = (BaseBridge.getAppContext() != null ? (MediaProjectionManager) BaseBridge.getAppContext().getSystemService("media_projection") : (MediaProjectionManager) getSystemService("media_projection")).getMediaProjection(intExtra, intent2);
            } catch (Throwable th3) {
                BaseBridge.printLog(TAG, "onStartCommand mediaProjectionManager getMediaProjection fail.".concat(String.valueOf(th3)));
                mediaProjection = null;
            }
            VirtualDisplayManagerProxy.getInstance().signalSessionRequestFinish(mediaProjection);
        }
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        BaseBridge.printLog(TAG, "Service on unbind");
        return super.onUnbind(intent);
    }

    private Notification createNotification() {
        if (BaseBridge.getSystemOSVersion() >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(C0671f.m1622a("notification_id", "notification_name", 2));
        }
        Notification.Builder defaults = new Notification.Builder(this).setDefaults(1);
        if (BaseBridge.getSystemOSVersion() >= 26) {
            defaults.setChannelId("notification_id");
        }
        return defaults.build();
    }
}
