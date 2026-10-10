package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmName;

/* JADX INFO: compiled from: ActivityResultLauncher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a#\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {InterfaceC33617e1.f69659h, "", "Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "options", "Landroidx/core/app/ActivityOptionsCompat;", "launchUnit", "activity-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ActivityResultLauncherKt {
    public static final void launch(@NotNull ActivityResultLauncher<Void> activityResultLauncher, @Nullable ActivityOptionsCompat activityOptionsCompat) {
        activityResultLauncher.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(activityResultLauncher, activityOptionsCompat);
    }

    @JvmName(name = "launchUnit")
    public static final void launchUnit(@NotNull ActivityResultLauncher<Unit> activityResultLauncher, @Nullable ActivityOptionsCompat activityOptionsCompat) {
        activityResultLauncher.launch(Unit.INSTANCE, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(activityResultLauncher, activityOptionsCompat);
    }
}
