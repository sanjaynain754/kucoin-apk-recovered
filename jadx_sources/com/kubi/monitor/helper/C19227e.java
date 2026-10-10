package com.kubi.monitor.helper;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p569qq.InterfaceC43845f;
import p734wq.C45916a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.monitor.helper.e */
/* JADX INFO: compiled from: PageLifecycleHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Landroidx/fragment/app/Fragment;", "fragment", "", "b", "(Landroidx/fragment/app/Fragment;)Ljava/lang/String;", "Landroid/app/Activity;", "activity", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/app/Activity;)Ljava/lang/String;", "Monitor_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19227e {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m42478a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            String f79322n = null;
            InterfaceC43845f interfaceC43845f = activity instanceof InterfaceC43845f ? (InterfaceC43845f) activity : null;
            if (interfaceC43845f != null) {
                f79322n = interfaceC43845f.getF79322n();
            }
            if (f79322n != null) {
                return f79322n;
            }
            String simpleName = activity.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "activity.javaClass.simpleName");
            return simpleName;
        } catch (Throwable th2) {
            C45916a.m101366a(th2, "PageLifecycleHelper");
            return "unknown";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m42479b(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        try {
            String f79322n = null;
            InterfaceC43845f interfaceC43845f = fragment instanceof InterfaceC43845f ? (InterfaceC43845f) fragment : null;
            if (interfaceC43845f != null) {
                f79322n = interfaceC43845f.getF79322n();
            }
            if (f79322n != null) {
                return f79322n;
            }
            String simpleName = fragment.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "fragment.javaClass.simpleName");
            return simpleName;
        } catch (Throwable th2) {
            C45916a.m101366a(th2, "track");
            return "unknown";
        }
    }
}
