package com.jumio.sdk.views;

import android.app.Activity;
import com.jumio.core.interfaces.ActivityAttacherInterface;
import com.jumio.sdk.scanpart.JumioScanPart;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m90084d2 = {"Lcom/jumio/sdk/views/JumioActivityAttacher;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "_activity", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getActivity", "()Landroid/app/Activity;", "attach", "", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioActivityAttacher {

    /* JADX INFO: renamed from: a */
    public final WeakReference f14751a;

    public JumioActivityAttacher(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f14751a = new WeakReference(activity);
    }

    public final void attach(@NotNull JumioScanPart scanPart) {
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        if (scanPart.getScanPart$jumio_core_release() instanceof ActivityAttacherInterface) {
            ((ActivityAttacherInterface) scanPart.getScanPart$jumio_core_release()).setActivityAttacher(this);
        }
    }

    @Nullable
    public final Activity getActivity() {
        return (Activity) this.f14751a.get();
    }
}
