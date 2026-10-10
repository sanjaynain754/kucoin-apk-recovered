package com.kubi.mine.lib.startup;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5258a;
import com.kubi.kucoin.startup.RouterStartupTask;
import com.kubi.mine.api.service.IMineService;
import com.kubi.mine.lib.startup.RouterCheckUpgradeTask;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p694vk.AbstractC45585n0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RouterCheckUpgradeTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/mine/lib/startup/RouterCheckUpgradeTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "routerCheckUpgrade", priority = 100, stepType = StartupStepType.Application, threadType = StartupThreadType.Async)
@SourceDebugExtension({"SMAP\nRouterCheckUpgradeTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouterCheckUpgradeTask.kt\ncom/kubi/mine/lib/startup/RouterCheckUpgradeTask\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,42:1\n19#2,2:43\n*S KotlinDebug\n*F\n+ 1 RouterCheckUpgradeTask.kt\ncom/kubi/mine/lib/startup/RouterCheckUpgradeTask\n*L\n31#1:43,2\n*E\n"})
public final class RouterCheckUpgradeTask implements IStartupTask {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$3(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C42917g.m94139e().execute(new Runnable() { // from class: oq.a
            @Override // java.lang.Runnable
            public final void run() {
                RouterCheckUpgradeTask.run$lambda$3$lambda$2();
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        RouterStartupTask.INSTANCE.setErrorHandler(new Function1() { // from class: oq.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RouterCheckUpgradeTask.run$lambda$3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$3$lambda$2() {
        final FragmentActivity fragmentActivity;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) activityM6125h;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            IMineService iMineService = IMineService.f35025a.get();
            AbstractC45585n0.d dVar = new AbstractC45585n0.d();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iMineService.mo41626i(dVar, supportFragmentManager, LifecycleOwnerKt.getLifecycleScope(fragmentActivity), new Function0() { // from class: oq.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(RouterCheckUpgradeTask.run$lambda$3$lambda$2$lambda$1$lambda$0(fragmentActivity));
                }
            }, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean run$lambda$3$lambda$2$lambda$1$lambda$0(FragmentActivity fragmentActivity) {
        if (!fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
            return true;
        }
        return false;
    }
}
