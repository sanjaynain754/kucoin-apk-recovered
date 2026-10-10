package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes23.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @RequiresApi(29)
    public static class Api29Impl {
        public static void startForeground(Service service, int i11, Notification notification, int i12) {
            if (i12 == 0 || i12 == -1) {
                service.startForeground(i11, notification, i12);
            } else {
                service.startForeground(i11, notification, i12 & 255);
            }
        }

        private Api29Impl() {
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        public static void startForeground(Service service, int i11, Notification notification, int i12) {
            if (i12 == 0 || i12 == -1) {
                service.startForeground(i11, notification, i12);
            } else {
                service.startForeground(i11, notification, i12 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            }
        }

        private Api34Impl() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface StopForegroundFlags {
    }

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static void stopForeground(Service service, int i11) {
            service.stopForeground(i11);
        }
    }

    public static void startForeground(@NonNull Service service, int i11, @NonNull Notification notification, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            Api34Impl.startForeground(service, i11, notification, i12);
        } else if (i13 >= 29) {
            Api29Impl.startForeground(service, i11, notification, i12);
        } else {
            service.startForeground(i11, notification);
        }
    }

    private ServiceCompat() {
    }

    public static void stopForeground(@NonNull Service service, int i11) {
        Api24Impl.stopForeground(service, i11);
    }
}
