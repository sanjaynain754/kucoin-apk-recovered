package com.kubi.lite.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.lite.interceptor.LiteDialogInterceptor;
import com.kubi.lite.startup.LiteStartupTask;
import com.kubi.lite.utils.LiteState;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiteStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/lite/startup/LiteStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "lifecycleProvider", "Lkotlin/Function0;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "lite", priority = 200, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Main)
public final class LiteStartupTask implements IStartupTask {

    @NotNull
    private final Function0<Application.ActivityLifecycleCallbacks> lifecycleProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public LiteStartupTask() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiteStartupTask(@NotNull Function0<? extends Application.ActivityLifecycleCallbacks> lifecycleProvider) {
        Intrinsics.checkNotNullParameter(lifecycleProvider, "lifecycleProvider");
        this.lifecycleProvider = lifecycleProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiteState.a _init_$lambda$0() {
        return new LiteState.a();
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        GlobalDialogManager.f43651a.m54336a(new LiteDialogInterceptor());
        application.registerActivityLifecycleCallbacks(this.lifecycleProvider.invoke());
    }

    public /* synthetic */ LiteStartupTask(Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Function0() { // from class: zn.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiteStartupTask._init_$lambda$0();
            }
        } : function0);
    }
}
