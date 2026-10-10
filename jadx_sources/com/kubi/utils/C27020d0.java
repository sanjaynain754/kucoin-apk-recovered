package com.kubi.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.d0 */
/* JADX INFO: compiled from: NotificationUtil.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/utils/d0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Z", "", "b", "(Landroid/content/Context;)V", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27020d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27020d0 f54313a = new C27020d0();

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: a */
    public final boolean m66520a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(context)");
        return notificationManagerCompatFrom.areNotificationsEnabled();
    }

    /* JADX INFO: renamed from: b */
    public final void m66521b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
