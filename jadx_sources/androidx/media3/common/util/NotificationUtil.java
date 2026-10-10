package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.browser.trusted.C0671f;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes34.dex */
@SuppressLint({"InlinedApi"})
@UnstableApi
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Importance {
    }

    public static void createNotificationChannel(Context context, String str, @StringRes int i11, @StringRes int i12, int i13) {
        if (Util.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) Assertions.checkNotNull((NotificationManager) context.getSystemService("notification"));
            C2818i.m2978a();
            NotificationChannel notificationChannelM1622a = C0671f.m1622a(str, context.getString(i11), i13);
            if (i12 != 0) {
                notificationChannelM1622a.setDescription(context.getString(i12));
            }
            notificationManager.createNotificationChannel(notificationChannelM1622a);
        }
    }

    public static void setNotification(Context context, int i11, @Nullable Notification notification) {
        NotificationManager notificationManager = (NotificationManager) Assertions.checkNotNull((NotificationManager) context.getSystemService("notification"));
        if (notification != null) {
            notificationManager.notify(i11, notification);
        } else {
            notificationManager.cancel(i11);
        }
    }

    private NotificationUtil() {
    }
}
