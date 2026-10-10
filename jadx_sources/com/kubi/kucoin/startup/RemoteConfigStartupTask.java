package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.config.Config;
import com.kubi.config.RemoteConfig;
import com.kubi.config.kcrc.KCRemoteConfigFetcher;
import com.kubi.config.kcrc.KCRemoteConfigParam;
import com.kubi.kucoin.startup.exception.StartupException;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33556b3;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p694vk.C45590s;
import p813yy.C46612b;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RemoteConfigStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/RemoteConfigStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "createCurrentConfig", "Lcom/kubi/config/Config;", "Companion", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = DbParams.TABLE_REMOTE_CONFIG, priority = 11, stepType = StartupStepType.Setup, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nRemoteConfigStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigStartupTask.kt\ncom/kubi/kucoin/startup/RemoteConfigStartupTask\n+ 2 StartupIssue.kt\ncom/kubi/kucoin/startup/exception/StartupIssueKt\n*L\n1#1,70:1\n44#2,2:71\n44#2,2:73\n*S KotlinDebug\n*F\n+ 1 RemoteConfigStartupTask.kt\ncom/kubi/kucoin/startup/RemoteConfigStartupTask\n*L\n38#1:71,2\n63#1:73,2\n*E\n"})
public final class RemoteConfigStartupTask implements IStartupTask {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "AccountContextSwitch";

    /* JADX INFO: compiled from: RemoteConfigStartupTask.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/startup/RemoteConfigStartupTask$Companion;", "", "<init>", "()V", "TAG", "", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.RemoteConfigStartupTask$a */
    /* JADX INFO: compiled from: RemoteConfigStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kucoin/startup/RemoteConfigStartupTask$run$3", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "onLanguageChange", "", "language", "Lcom/kubi/sdk/function/language/LanguageType;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15608a implements MultiLanguageManager.a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Application f28393b;

        public C15608a(Application application) {
            this.f28393b = application;
        }

        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            KCRemoteConfigFetcher.f19652a.m20524B(RemoteConfigStartupTask.this.createCurrentConfig(this.f28393b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Config createCurrentConfig(Application application) {
        String country = C46612b.f104366a.m102772a().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        String strM66668h = C27041f.m66668h(UserInfo.c().uid);
        C45590s c45590s = C45590s.f102687a;
        return new Config.Builder().m20452b(c45590s.m100667R()).m20454d(c45590s.m100666Q() ? 0L : 720L).m20453c(new Function1() { // from class: com.kubi.kucoin.startup.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RemoteConfigStartupTask.createCurrentConfig$lambda$4((Throwable) obj);
            }
        }).m20455e(new KCRemoteConfigParam(300L, 60L, 30L, 3, C33556b3.f68995S, country, strM66668h, MapsKt.mapOf(TuplesKt.m90091to("appConfigChannel", c45590s.m100662M())))).m20456f(CollectionsKt.listOf("host_config")).m20451a(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createCurrentConfig$lambda$4(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43846g.m96568c(new StartupException(it, "Config", false, null, 8, null), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(RemoteConfigStartupTask remoteConfigStartupTask, Application application, AccountEventState accountEventState) {
        C44128b.m97266j("AccountContextSwitch", "fetch remote config, state=" + accountEventState.getState() + ", oldUid=" + accountEventState.getPreUid());
        KCRemoteConfigFetcher.f19652a.m20524B(remoteConfigStartupTask.createCurrentConfig(application));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        RemoteConfig.m20459d(createCurrentConfig(application));
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.startup.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RemoteConfigStartupTask.run$lambda$0(this.f28411b, application, (AccountEventState) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kucoin.startup.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.startup.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RemoteConfigStartupTask.run$lambda$2((Throwable) obj);
            }
        };
        observableA.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.startup.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new C15608a(application));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$2(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C43846g.m96568c(new StartupException(th2, "Config", false, null, 8, null), null, 2, null);
        return Unit.INSTANCE;
    }
}
