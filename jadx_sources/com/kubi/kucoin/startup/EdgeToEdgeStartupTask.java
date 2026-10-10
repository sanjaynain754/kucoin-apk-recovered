package com.kubi.kucoin.startup;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.MimeTypes;
import com.kubi.app.startup.R$color;
import com.kubi.sdk.C23705e3;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.util.IDisableEdgeToEdge;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EdgeToEdgeStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/EdgeToEdgeStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "edge_to_edge", priority = 200, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
public final class EdgeToEdgeStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.EdgeToEdgeStartupTask$a */
    /* JADX INFO: compiled from: EdgeToEdgeStartupTask.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/startup/EdgeToEdgeStartupTask$run$1", "Lcom/kubi/sdk/SimpleActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15600a extends C23705e3 {
        @Override // com.kubi.sdk.C23705e3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            super.onActivityCreated(activity, savedInstanceState);
            if (activity instanceof IDisableEdgeToEdge) {
                return;
            }
            String name = activity.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (C15623d.m32874a(name)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    EdgeToEdgeCompat.f48106a.m58281s(activity, Integer.valueOf(C27046k.m66699n(activity, R$color.c_overlay)));
                    Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
            }
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (Build.VERSION.SDK_INT >= 35) {
            application.registerActivityLifecycleCallbacks(new C15600a());
        }
    }
}
