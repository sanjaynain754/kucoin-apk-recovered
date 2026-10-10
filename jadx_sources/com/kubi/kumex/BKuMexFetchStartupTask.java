package com.kubi.kumex;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.BKuMexFetchStartupTask;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import org.jetbrains.annotations.NotNull;
import p236em.C37214b;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BKuMexFetchStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0003J\b\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/BKuMexFetchStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "mDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "initFutures", "subscribe", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "b_kumex_fetch", priority = 300, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Async)
public final class BKuMexFetchStartupTask implements IStartupTask {

    @NotNull
    private final CompositeDisposable mDisposable = new CompositeDisposable();

    /* JADX INFO: renamed from: com.kubi.kumex.BKuMexFetchStartupTask$a */
    /* JADX INFO: compiled from: BKuMexFetchStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/BKuMexFetchStartupTask$initFutures$2", "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;", "last", "Lcom/kubi/sdk/function/language/LanguageType;", "onLanguageChange", "", "language", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15762a implements MultiLanguageManager.a {

        /* JADX INFO: renamed from: a */
        public LanguageType f28650a = MultiLanguageManager.f46811g;

        @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
        public void onLanguageChange(LanguageType language) {
            Intrinsics.checkNotNullParameter(language, "language");
            if (this.f28650a != language) {
                this.f28650a = language;
                RepositoryServiceLocator.f19236a.m20288g().mo25012h();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.BKuMexFetchStartupTask$b */
    /* JADX INFO: compiled from: BKuMexFetchStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kumex/BKuMexFetchStartupTask$initFutures$3", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onForeground", "", "activity", "Landroid/app/Activity;", "onBackground", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15763b implements C5287o0.b {
        public C15763b() {
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            BKuMexFetchStartupTask.this.mDisposable.clear();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            BKuMexFetchStartupTask.this.subscribe();
        }
    }

    @SuppressLint({"CheckResult"})
    private final void initFutures() {
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: wl.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BKuMexFetchStartupTask.initFutures$lambda$3((Boolean) obj);
            }
        };
        observableE.subscribe(new Consumer() { // from class: wl.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new C15762a());
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        repositoryServiceLocator.m20288g().mo25006e();
        repositoryServiceLocator.m20290i().mo99983e();
        repositoryServiceLocator.m20290i().mo99984f();
        C5264d.registerAppStatusChangedListener(new C15763b());
        subscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initFutures$lambda$3$lambda$2() throws Throwable {
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        repositoryServiceLocator.m20288g().mo25005d0(Boolean.TRUE);
        repositoryServiceLocator.m20290i().mo99971a(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0() {
        RepositoryServiceLocator.f19236a.m20288g().mo24979F();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribe() {
        try {
            this.mDisposable.clear();
            DisposableKt.addTo(RepositoryServiceLocator.f19236a.m20288g().mo24984K(), this.mDisposable);
        } catch (Throwable th2) {
            C37214b.m83255a(th2, "BKuMexFetchStartupTask.subscribe");
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C27100x0.m66921b("fetchRobotSiteConfig", true, new Function0() { // from class: wl.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BKuMexFetchStartupTask.run$lambda$0();
            }
        });
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: wl.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BKuMexFetchStartupTask.run$lambda$1(this.f103328b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initFutures$lambda$3(Boolean bool) {
        if (bool.booleanValue()) {
            C27100x0.m66921b("symbol_config", true, new Function0() { // from class: wl.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BKuMexFetchStartupTask.initFutures$lambda$3$lambda$2();
                }
            });
        } else {
            C46894j.f104736a.m103271h();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$1(BKuMexFetchStartupTask bKuMexFetchStartupTask) {
        bKuMexFetchStartupTask.initFutures();
        return Unit.INSTANCE;
    }
}
