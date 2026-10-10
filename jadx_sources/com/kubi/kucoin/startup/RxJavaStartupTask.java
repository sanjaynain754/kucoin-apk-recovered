package com.kubi.kucoin.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.kucoin.startup.exception.StartupException;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RxJavaStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/RxJavaStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "rxjava", priority = 100, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nRxJavaStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxJavaStartupTask.kt\ncom/kubi/kucoin/startup/RxJavaStartupTask\n+ 2 StartupIssue.kt\ncom/kubi/kucoin/startup/exception/StartupIssueKt\n*L\n1#1,32:1\n44#2,2:33\n*S KotlinDebug\n*F\n+ 1 RxJavaStartupTask.kt\ncom/kubi/kucoin/startup/RxJavaStartupTask\n*L\n27#1:33,2\n*E\n"})
public final class RxJavaStartupTask implements IStartupTask {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(Throwable th2) throws Throwable {
        if (th2 instanceof UndeliverableException) {
            C44128b.m97261e("RxJava", C27041f.m66669i(((UndeliverableException) th2).getMessage(), "Unknown"));
            return Unit.INSTANCE;
        }
        if (C45590s.f102687a.m100666Q()) {
            throw th2;
        }
        Intrinsics.checkNotNull(th2);
        C43846g.m96568c(new StartupException(th2, "RxJavaStartupTask", false, null, 8, null), null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.startup.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RxJavaStartupTask.run$lambda$0((Throwable) obj);
            }
        };
        RxJavaPlugins.setErrorHandler(new Consumer() { // from class: com.kubi.kucoin.startup.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
    }
}
