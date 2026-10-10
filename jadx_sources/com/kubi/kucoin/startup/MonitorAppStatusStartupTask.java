package com.kubi.kucoin.startup;

import android.app.Activity;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import org.jetbrains.annotations.NotNull;
import p569qq.C43848i;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import q00.C43572a;

/* JADX INFO: compiled from: MonitorAppStatusStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/MonitorAppStatusStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "monitor_app_status", priority = 100, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
public final class MonitorAppStatusStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.MonitorAppStatusStartupTask$a */
    /* JADX INFO: compiled from: MonitorAppStatusStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/startup/MonitorAppStatusStartupTask$run$1", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onBackground", "", "activity", "Landroid/app/Activity;", "onForeground", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15603a implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            C43848i.m96582j(false);
            try {
                C43572a c43572a = C43572a.f96129a;
                c43572a.m95851d();
                c43572a.m95849b();
            } catch (Throwable unused) {
            }
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            C43848i.m96582j(true);
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C5264d.registerAppStatusChangedListener(new C15603a());
    }
}
