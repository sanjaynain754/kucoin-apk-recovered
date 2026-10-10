package com.kubi.advert.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5276j;
import com.kubi.advert.AFOpenIdUtil;
import com.kubi.advert.AppsFlyerUtil;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import org.jetbrains.annotations.NotNull;
import p569qq.C43848i;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppsFlyerStartupTask.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/advert/startup/AppsFlyerStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "apps_flyer", stepType = StartupStepType.Application, threadType = StartupThreadType.Async)
public final class AppsFlyerStartupTask implements IStartupTask {
    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        AppsFlyerUtil.v(application);
        C43848i.m96583k(C5276j.m6247f(), AFOpenIdUtil.f14967a.m14712i());
    }
}
