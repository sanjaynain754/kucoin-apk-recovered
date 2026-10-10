package com.kubi.kucoin.startup;

import android.app.Activity;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SocketAppStatusStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/SocketAppStatusStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "socket_app_status", priority = 100, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
public final class SocketAppStatusStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.SocketAppStatusStartupTask$a */
    /* JADX INFO: compiled from: SocketAppStatusStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/startup/SocketAppStatusStartupTask$run$1", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onBackground", "", "activity", "Landroid/app/Activity;", "onForeground", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15615a implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            KuCoinLooper.INSTANCE.startLoop();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C5264d.registerAppStatusChangedListener(new C15615a());
    }
}
