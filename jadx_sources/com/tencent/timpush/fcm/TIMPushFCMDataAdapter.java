package com.tencent.timpush.fcm;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.browser.trusted.C0671f;
import androidx.media3.common.util.C2818i;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes2.dex */
public class TIMPushFCMDataAdapter {

    /* JADX INFO: renamed from: a */
    public static final String f76627a = "TIMPushFCMDataAdapter";

    /* JADX INFO: renamed from: c */
    public void m78950c(final Context context) {
        final TIMPushErrorBean tIMPushErrorBean = new TIMPushErrorBean();
        try {
            String str = f76627a;
            TIMPushLog.m78958i(str, "FCM request token start");
            int iM78949b = m78949b(context);
            if (iM78949b == 0) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() { // from class: com.tencent.timpush.fcm.TIMPushFCMDataAdapter.1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public void onComplete(@NonNull Task<String> task) {
                        int length;
                        if (!task.isSuccessful()) {
                            Exception exception = task.getException();
                            TIMPushLog.m78957e(TIMPushFCMDataAdapter.f76627a, "FCM getToken exception: " + exception);
                            tIMPushErrorBean.m78941a(-1L);
                            tIMPushErrorBean.m78942a(TIMPushFCMDataAdapter.this.m78947a("FCM getToken failed", exception));
                            TIMPushFCMService.getInstance().callbackData(tIMPushErrorBean);
                            return;
                        }
                        String result = task.getResult();
                        String str2 = TIMPushFCMDataAdapter.f76627a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("FCM get token success, tokenLength = ");
                        if (result == null) {
                            length = 0;
                        } else {
                            length = result.length();
                        }
                        sb2.append(length);
                        TIMPushLog.m78958i(str2, sb2.toString());
                        TIMPushFCMDataAdapter.this.m78948a(context);
                        if (result != null && result.length() != 0) {
                            tIMPushErrorBean.m78941a(0L);
                            tIMPushErrorBean.m78942a(result);
                        } else {
                            tIMPushErrorBean.m78941a(-1L);
                            tIMPushErrorBean.m78942a("FCM token empty");
                        }
                        TIMPushFCMService.getInstance().callbackData(tIMPushErrorBean);
                    }
                });
                return;
            }
            TIMPushLog.m78957e(str, "Google Service not support, code = " + iM78949b);
            tIMPushErrorBean.m78941a((long) iM78949b);
            tIMPushErrorBean.m78942a("FCM unavailable code=" + iM78949b);
            TIMPushFCMService.getInstance().callbackData(tIMPushErrorBean);
        } catch (Exception e11) {
            TIMPushLog.m78957e(f76627a, "registerPush exception: " + e11);
            tIMPushErrorBean.m78941a(-1L);
            tIMPushErrorBean.m78942a(m78947a("FCM register exception", e11));
            TIMPushFCMService.getInstance().callbackData(tIMPushErrorBean);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m78947a(String str, Exception exc) {
        if (exc == null) {
            return str;
        }
        String message = exc.getMessage();
        if (message == null || message.length() == 0) {
            message = exc.getClass().getSimpleName();
        }
        String str2 = str + ": " + message;
        if (m78946a(str2) <= 120) {
            return str2;
        }
        return str + ": " + exc.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: b */
    public int m78949b(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Exception e11) {
            TIMPushLog.m78957e(f76627a, "getGoogleServiceStatusCode e = " + e11);
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m78946a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (Exception unused) {
            return str.length();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m78948a(Context context) {
        NotificationManager notificationManager;
        if (context == null) {
            TIMPushLog.m78957e(f76627a, "context is null");
            return;
        }
        if (!TIMPushFCMService.getInstance().isEnableRing() || Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) context.getSystemService("notification")) == null) {
            return;
        }
        notificationManager.createNotificationChannelGroup(C35446c.m78963a("MyGroupId", "CustomGroup"));
        C2818i.m2978a();
        NotificationChannel notificationChannelM1622a = C0671f.m1622a(TIMPushFCMService.getInstance().getFcmChannelId(), "CustomGroup", 4);
        notificationChannelM1622a.setGroup("MyGroupId");
        notificationChannelM1622a.enableLights(true);
        notificationChannelM1622a.enableVibration(true);
        notificationChannelM1622a.setSound(Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + TIMPushFCMService.getInstance().getFcmChanneSoundName()), null);
        notificationManager.createNotificationChannel(notificationChannelM1622a);
    }
}
