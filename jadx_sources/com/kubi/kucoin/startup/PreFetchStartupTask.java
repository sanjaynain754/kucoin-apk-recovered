package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.config.kcrc.KCRemoteConfigFetcher;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import org.jetbrains.annotations.NotNull;
import p799yj.C46510b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreFetchStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/PreFetchStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "pre-fetch", priority = 200, stepType = StartupStepType.PreFirstPage, threadType = StartupThreadType.Main)
public final class PreFetchStartupTask implements IStartupTask {
    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C46510b.m102597a();
        KCRemoteConfigFetcher.f19652a.m20532L();
    }
}
