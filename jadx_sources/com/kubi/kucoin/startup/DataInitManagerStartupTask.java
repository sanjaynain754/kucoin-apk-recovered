package com.kubi.kucoin.startup;

import android.app.Application;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.MimeTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.DataInitManager;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37749a;
import org.jetbrains.annotations.NotNull;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataInitManagerStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/DataInitManagerStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "data_init_manager", priority = 200, stepType = StartupStepType.Application, threadType = StartupThreadType.Main)
public final class DataInitManagerStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.DataInitManagerStartupTask$a */
    /* JADX INFO: compiled from: DataInitManagerStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016JL\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0012"}, m90084d2 = {"com/kubi/kucoin/startup/DataInitManagerStartupTask$run$1", "Lcom/kubi/data/DataInitManager$InitInjectData;", "hasLogin", "", "getUserId", "", "getUid", "getUserCurrency", "getAppName", "jumpToTransfer", "", FirebaseAnalytics.Param.CURRENCY, "fromSymbol", "toSymbol", "from", TypedValues.TransitionType.S_TO, "includeContract", "spmId", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15599a implements DataInitManager.a {
        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: c */
        public boolean mo23675c() {
            return UserInfo.a.n();
        }

        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: f */
        public String mo23678f() {
            return C45590s.f102687a.m100675Z();
        }

        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: g */
        public void mo23679g(String str, String str2, String str3, String str4, String str5, boolean z11, String str6) {
            InterfaceC37749a.a.m85117l(C37304a.f82764a, C27041f.m66668h(str), str4, str5, str3, str6, null, null, 96, null);
        }

        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: d */
        public String mo23676d() {
            return UserInfo.c().id;
        }

        @Override // com.kubi.data.DataInitManager.a
        /* JADX INFO: renamed from: e */
        public String mo23677e() {
            return UserInfo.c().getCurrency();
        }

        @Override // com.kubi.data.DataInitManager.a
        public String getUid() {
            return UserInfo.c().uid;
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        DataInitManager.f21486a.m23672t(new C15599a());
    }
}
