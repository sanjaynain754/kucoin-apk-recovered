package com.kubi.agora;

import android.R;
import android.app.Notification;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.agora.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ScreenCaptureService.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/agora/ScreenCaptureNotificationFactory;", "", "<init>", "()V", "build", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "channelId", "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScreenCaptureNotificationFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ScreenCaptureNotificationFactory f15332a = new ScreenCaptureNotificationFactory();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Notification m14951a(@NotNull Context context, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId);
        int i11 = R$string.kc_screen_share_running;
        Notification notificationBuild = builder.setContentTitle(context.getString(i11)).setContentText(context.getString(i11)).setSmallIcon(R.drawable.ic_menu_camera).setPriority(-1).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        return notificationBuild;
    }
}
