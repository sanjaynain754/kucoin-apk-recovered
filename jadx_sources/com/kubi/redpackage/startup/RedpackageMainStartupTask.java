package com.kubi.redpackage.startup;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.p109ui.RedPacketSendActivity;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.utils.C27012a;
import com.kubi.utils.ToastCompat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedpackageStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/redpackage/startup/RedpackageMainStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "onAppStatusChangedListener", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "getOnAppStatusChangedListener$annotations", "getOnAppStatusChangedListener", "()Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "redpackage_main", priority = 100, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
public final class RedpackageMainStartupTask implements IStartupTask {

    @NotNull
    private final C5287o0.b onAppStatusChangedListener = new C22731a();

    /* JADX INFO: renamed from: com.kubi.redpackage.startup.RedpackageMainStartupTask$a */
    /* JADX INFO: compiled from: RedpackageStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/redpackage/startup/RedpackageMainStartupTask$onAppStatusChangedListener$1", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onForeground", "", "activity", "Landroid/app/Activity;", "onBackground", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22731a implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            if (C27012a.m66486i().m66494h() instanceof RedPacketSendActivity) {
                ToastCompat.m66437C(R$string.app_is_background_tips);
            }
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
        }
    }

    @NotNull
    public final C5287o0.b getOnAppStatusChangedListener() {
        return this.onAppStatusChangedListener;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C5264d.registerAppStatusChangedListener(this.onAppStatusChangedListener);
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnAppStatusChangedListener$annotations() {
    }
}
