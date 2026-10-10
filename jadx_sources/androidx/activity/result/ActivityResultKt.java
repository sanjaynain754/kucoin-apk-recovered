package androidx.activity.result;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ActivityResult.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\u0002\u001a\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0086\u0002¨\u0006\u0005"}, m90084d2 = {"component1", "", "Landroidx/activity/result/ActivityResult;", "component2", "Landroid/content/Intent;", "activity-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ActivityResultKt {
    public static final int component1(@NotNull ActivityResult activityResult) {
        return activityResult.getResultCode();
    }

    @Nullable
    public static final Intent component2(@NotNull ActivityResult activityResult) {
        return activityResult.getData();
    }
}
