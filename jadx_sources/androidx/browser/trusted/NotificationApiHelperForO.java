package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY})
class NotificationApiHelperForO {
    @Nullable
    public static Notification copyNotificationOntoChannel(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(C0671f.m1622a(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        builderRecoverBuilder.setChannelId(str);
        return builderRecoverBuilder.build();
    }

    private NotificationApiHelperForO() {
    }

    public static boolean isChannelEnabled(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null && notificationChannel.getImportance() == 0) {
            return false;
        }
        return true;
    }
}
