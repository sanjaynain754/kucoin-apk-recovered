package androidx.media3.exoplayer.offline;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.C2912R;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DownloadNotificationHelper {

    @StringRes
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    private Notification buildEndStateNotification(Context context, @DrawableRes int i11, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i12) {
        return buildNotification(context, i11, pendingIntent, str, i12, 0, 0, false, false, true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    public Notification buildProgressNotification(Context context, @DrawableRes int i11, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list, int i12) {
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        boolean z12;
        float percentDownloaded;
        boolean z13;
        float f11 = 0.0f;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        int i17 = 0;
        boolean z19 = true;
        for (int i18 = 0; i18 < list.size(); i18++) {
            Download download = list.get(i18);
            int i19 = download.state;
            if (i19 == 0) {
                z16 = true;
            } else if (i19 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f11 += percentDownloaded;
                    z19 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z17 |= z13;
                i17++;
                z15 = true;
            } else if (i19 == 5) {
                z18 = true;
            } else if (i19 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f11 += percentDownloaded;
                    z19 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z17 |= z13;
                i17++;
                z15 = true;
            }
        }
        if (!z15) {
            if (!z16 || i12 == 0) {
                if (z18) {
                    i14 = C2912R.string.exo_download_removing;
                } else {
                    i13 = 0;
                }
                z11 = true;
            } else {
                i13 = (i12 & 2) != 0 ? C2912R.string.exo_download_paused_for_wifi : (i12 & 1) != 0 ? C2912R.string.exo_download_paused_for_network : C2912R.string.exo_download_paused;
                z11 = false;
            }
            if (z11) {
                if (z15) {
                    int i21 = (int) (f11 / i17);
                    if (z19 && z17) {
                        z14 = true;
                    }
                    i16 = i21;
                    z12 = z14;
                } else {
                    i16 = 0;
                    z12 = true;
                }
                i15 = 100;
            } else {
                i15 = 0;
                i16 = 0;
                z12 = false;
            }
            return buildNotification(context, i11, pendingIntent, str, i13, i15, i16, z12, true, false);
        }
        i14 = C2912R.string.exo_download_downloading;
        i13 = i14;
        z11 = true;
        if (z11) {
            if (z15) {
                int i22 = (int) (f11 / i17);
                if (z19) {
                    z14 = true;
                }
                i16 = i22;
                z12 = z14;
            } else {
                i16 = 0;
                z12 = true;
            }
            i15 = 100;
        } else {
            i15 = 0;
            i16 = 0;
            z12 = false;
        }
        return buildNotification(context, i11, pendingIntent, str, i13, i15, i16, z12, true, false);
    }

    @RequiresApi(31)
    public static final class Api31 {
        @SuppressLint({"WrongConstant"})
        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }

        private Api31() {
        }
    }

    private Notification buildNotification(Context context, @DrawableRes int i11, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i12, int i13, int i14, boolean z11, boolean z12, boolean z13) {
        this.notificationBuilder.setSmallIcon(i11);
        this.notificationBuilder.setContentTitle(i12 == 0 ? null : context.getResources().getString(i12));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i13, i14, z11);
        this.notificationBuilder.setOngoing(z12);
        this.notificationBuilder.setShowWhen(z13);
        if (Util.SDK_INT >= 31) {
            Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.build();
    }

    public Notification buildDownloadCompletedNotification(Context context, @DrawableRes int i11, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i11, pendingIntent, str, C2912R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, @DrawableRes int i11, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i11, pendingIntent, str, C2912R.string.exo_download_failed);
    }

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }
}
