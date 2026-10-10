package com.kubi.kucoin.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.data.DataInitManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p454mf.InterfaceC42530a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataInitManagerStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/DataInitManagerFetchStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "data_init_manager_fetch", priority = 200, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Async)
public final class DataInitManagerFetchStartupTask implements IStartupTask {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(String str) {
        InterfaceC42530a interfaceC42530a = (InterfaceC42530a) Router.f46192a.m56192n(InterfaceC42530a.class);
        Intrinsics.checkNotNull(str);
        interfaceC42530a.m93246a(str);
        DataInitManager.f21486a.m23670k();
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        DataInitManager.f21486a.m23671o(new Consumer() { // from class: com.kubi.kucoin.startup.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DataInitManagerFetchStartupTask.run$lambda$0((String) obj);
            }
        });
    }
}
