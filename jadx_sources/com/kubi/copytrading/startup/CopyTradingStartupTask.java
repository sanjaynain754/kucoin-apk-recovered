package com.kubi.copytrading.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.futures.CopyTradingWebSocketConfig;
import com.kubi.copytrading.futures.FutureCopyTradingConfig;
import com.kubi.copytrading.startup.CopyTradingStartupTask;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTradingStartupTask.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"Lcom/kubi/copytrading/startup/CopyTradingStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "copyTrading", priority = 100, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Main)
public final class CopyTradingStartupTask implements IStartupTask {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2() {
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: tc.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CopyTradingStartupTask.run$lambda$2$lambda$0((AccountEventState) obj);
            }
        };
        observableA.subscribe(new Consumer() { // from class: tc.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        CopyTradingConfig.f19710a.m20599p();
        FutureCopyTradingConfig.f19902a.m20872g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2$lambda$0(AccountEventState accountEventState) {
        CopyTradingConfig copyTradingConfig = CopyTradingConfig.f19710a;
        copyTradingConfig.m20599p();
        if (accountEventState.getState() == AccountState.SwitchAccount || accountEventState.getState() == AccountState.Login) {
            CopyTradingWebSocketConfig.f19918a.m20885e();
        } else {
            FutureCopyTradingConfig.m20870f(FutureCopyTradingConfig.f19902a, true, false, 2, null);
            CopyTradingWebSocketConfig.f19918a.m20883b();
            copyTradingConfig.m20596l();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C24129b.m58033e(SiteVisibleConfigKey.CopyTrading, new Function0() { // from class: tc.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingStartupTask.run$lambda$2();
            }
        });
    }
}
