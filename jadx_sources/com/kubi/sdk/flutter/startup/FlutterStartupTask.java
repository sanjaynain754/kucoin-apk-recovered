package com.kubi.sdk.flutter.startup;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MimeTypes;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.sdk.flutter.delegate.FlutterImpellerConfig;
import com.kubi.sdk.flutter.delegate.FlutterShellArgsHelper;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import io.flutter.FlutterInjector;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlutterStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/flutter/startup/FlutterStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "mainHandler", "Landroid/os/Handler;", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER, priority = 200, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Main)
public final class FlutterStartupTask implements IStartupTask {

    @NotNull
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        FlutterInjector.instance().flutterLoader().startInitialization(application);
        if (FlutterImpellerConfig.f46678a.m56819f()) {
            FlutterInjector.instance().flutterLoader().ensureInitializationCompleteAsync(application, FlutterShellArgsHelper.f46683a.m56821b(), this.mainHandler, new Runnable() { // from class: vy.a
                @Override // java.lang.Runnable
                public final void run() {
                    C43840a.m96550d("flutterLoader perload", ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER);
                }
            });
        } else {
            FlutterInjector.instance().flutterLoader().ensureInitializationCompleteAsync(application, null, this.mainHandler, new Runnable() { // from class: vy.b
                @Override // java.lang.Runnable
                public final void run() {
                    C43840a.m96550d("flutterLoader perload", ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER);
                }
            });
        }
    }
}
