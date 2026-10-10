package com.kubi.kucoin.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.tencent.bugly.proguard.C33786m2;
import cr.C36522b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46396e;

/* JADX INFO: compiled from: DeviceLevelTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/DeviceLevelTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "device_level", priority = 300, stepType = StartupStepType.MainPage, threadType = StartupThreadType.Async)
public final class DeviceLevelTask implements IStartupTask {
    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C36522b c36522b = C36522b.f79371a;
        SensorsDataAPI.sharedInstance().profileSet("device_level", Integer.valueOf(c36522b.m81777g().getValue()));
        if (C46396e.m102347d(C33786m2.f70892t, "isdDeviceReported", false)) {
            return;
        }
        c36522b.m81783m();
        C46396e.m102354k(C33786m2.f70892t, "isdDeviceReported", true);
    }
}
