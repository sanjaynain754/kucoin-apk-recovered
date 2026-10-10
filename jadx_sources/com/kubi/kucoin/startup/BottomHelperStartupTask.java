package com.kubi.kucoin.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.kucoin.utils.BottomLottieMode;
import com.kubi.kucoin.utils.BottomMenuHelper;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.monitor.utils.DeviceLevel;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import cr.C36522b;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomHelperStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/BottomHelperStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "bottom_helper", priority = 201, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nBottomHelperStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomHelperStartupTask.kt\ncom/kubi/kucoin/startup/BottomHelperStartupTask\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,38:1\n35#2,4:39\n39#2:45\n44#3,2:43\n*S KotlinDebug\n*F\n+ 1 BottomHelperStartupTask.kt\ncom/kubi/kucoin/startup/BottomHelperStartupTask\n*L\n22#1:39,4\n22#1:45\n22#1:43,2\n*E\n"})
public final class BottomHelperStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.BottomHelperStartupTask$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15598a extends TypeToken<Boolean> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean run$lambda$0() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15598a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_startup_bottom_lottie_async", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return (Boolean) objM20457a;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        BottomStartupPolicy bottomStartupPolicy = BottomStartupPolicy.f28395a;
        BottomLottieMode bottomLottieModeM32873b = bottomStartupPolicy.m32873b(new Function0() { // from class: com.kubi.kucoin.startup.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomHelperStartupTask.run$lambda$0();
            }
        });
        boolean z11 = bottomLottieModeM32873b == BottomLottieMode.ASYNC;
        BottomMenuHelper bottomMenuHelper = BottomMenuHelper.f28520a;
        bottomMenuHelper.m33069l(bottomLottieModeM32873b);
        if (C36522b.f79371a.m81777g().getValue() > DeviceLevel.MIDDLE.getValue()) {
            if (z11) {
                bottomMenuHelper.m33071n(application, bottomStartupPolicy.m32872a(DayNightThemeManager.f28592a.m33187l()));
            } else {
                bottomMenuHelper.m33068k(application);
            }
        }
    }
}
