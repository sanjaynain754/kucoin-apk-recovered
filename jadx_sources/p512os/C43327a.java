package p512os;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.kubi.sdk.BaseApplication;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: os.a */
/* JADX INFO: compiled from: SystemSettingUtils.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/notice/lib/utils/SystemSettingUtils;", "", "<init>", "()V", "jumpToSystemNoticeSetting", "", "getPermission", "", "type", "", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43327a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43327a f95643a = new C43327a();

    /* JADX INFO: renamed from: a */
    public final boolean m95361a(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = type.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "notification")) {
            return NotificationManagerCompat.from(BaseApplication.INSTANCE.get()).areNotificationsEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m95362b() {
        Application application = BaseApplication.INSTANCE.get();
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.addFlags(268435456);
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", application.getPackageName());
        } else {
            intent.addFlags(268435456);
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", application.getPackageName());
            intent.putExtra("app_uid", application.getApplicationInfo().uid);
        }
        application.startActivity(intent);
    }
}
