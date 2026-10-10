package com.kubi.sdk;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.sdk.safemode.CrashGuardian;
import com.kubi.sdk.thread.KThreadException;
import com.kubi.sdk.util.AppInstallStatusManager;
import com.kubi.sdk.util.StartupMinorTraceUtils;
import com.kubi.sdk.util.StartupTrace;
import com.kubi.sdk.web.C24300a;
import com.kubi.utils.C27058k0;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27100x0;
import dh0.C36686b;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import ky.C42003b;
import o00.C42916f;
import org.aspectj.lang.InterfaceC43175a;
import org.jetbrains.annotations.NotNull;
import p324hy.C38363a;
import p518oy.C43337a;
import p813yy.C46611a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import q00.C43572a;
import q00.C43573b;
import q00.C43576e;
import ro.C44128b;
import y70.C46396e;

/* JADX INFO: compiled from: BaseApplication.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/BaseApplication;", "Landroid/app/Application;", "<init>", "()V", "delegate", "Lcom/kubi/sdk/delegate/AppDelegate;", "getDelegate", "()Lcom/kubi/sdk/delegate/AppDelegate;", "setDelegate", "(Lcom/kubi/sdk/delegate/AppDelegate;)V", "isMainProcess", "", "()Z", "isMainProcess$delegate", "Lkotlin/Lazy;", "attachBaseContext", "", TtmlNode.RUBY_BASE, "Landroid/content/Context;", "onCreate", "onTerminate", "getResources", "Landroid/content/res/Resources;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "Companion", "FontScaleException", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class BaseApplication extends Application {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String TAG = "BaseApplication";
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_1;
    private static Application instance;

    @NotNull
    private C42003b delegate = new C42003b();

    /* JADX INFO: renamed from: isMainProcess$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isMainProcess = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(BaseApplication.isMainProcess_delegate$lambda$0(this.f46446b));
        }
    });

    /* JADX INFO: compiled from: BaseApplication.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/BaseApplication$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Landroid/app/Application;", "get", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final Application get() {
            Application application = BaseApplication.instance;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                return null;
            }
            return application;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.BaseApplication$onCreate$2 */
    /* JADX INFO: compiled from: BaseApplication.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.BaseApplication$onCreate$2", m90122f = "BaseApplication.kt", m90123i = {}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C236522 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C236522(Throwable th2, Continuation<? super C236522> continuation) {
            super(2, continuation);
            this.$throwable = th2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C236522(this.$throwable, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C236522) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C43337a.m95403a(this.$throwable, BaseApplication.TAG);
                this.label = 1;
                if (DelayKt.m90350b(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Process.killProcess(Process.myPid());
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("BaseApplication.kt", BaseApplication.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("4", "attachBaseContext", "com.kubi.sdk.BaseApplication", "android.content.Context", TtmlNode.RUBY_BASE, "", "void"), 0);
        ajc$tjp_1 = c36686b.m82128h("method-execution", c36686b.m82127g("1", "onConfigurationChanged", "com.kubi.sdk.BaseApplication", "android.content.res.Configuration", "newConfig", "", "void"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachBaseContext$lambda$1(KThreadException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43572a.f96129a.m95850c(it);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void attachBaseContext_aroundBody0(BaseApplication baseApplication, Context base, InterfaceC43175a interfaceC43175a) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        StartupTrace startupTrace = StartupTrace.f48194a;
        startupTrace.m58460t(baseApplication.isMainProcess(), baseApplication);
        C24300a.m58588c(base);
        if (baseApplication.isMainProcess()) {
            C23848k2.m57047a();
            C43576e.m95854d(new C43573b(false, 1, null));
            C43576e.m95853c(new Function1() { // from class: com.kubi.sdk.z
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseApplication.attachBaseContext$lambda$1((KThreadException) obj);
                }
            });
        }
        instance = baseApplication;
        baseApplication.getDelegate().m92079a(base, baseApplication.isMainProcess());
        startupTrace.m58450j("duration1");
    }

    @JvmStatic
    @NotNull
    public static final Application get() {
        return INSTANCE.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(BaseApplication baseApplication) {
        C38363a.f86124a.m86561a(baseApplication);
        return Unit.INSTANCE;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context base) throws Throwable {
        C46611a.m102764b().m102766d(new C23689c0(new Object[]{this, base, C36686b.m82123c(ajc$tjp_0, this, this, base)}).linkClosureAndJoinPoint(69648));
    }

    @NotNull
    public C42003b getDelegate() {
        return this.delegate;
    }

    public final boolean isMainProcess() {
        return ((Boolean) this.isMainProcess.getValue()).booleanValue();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) throws Throwable {
        InterfaceC43175a interfaceC43175aM82123c = C36686b.m82123c(ajc$tjp_1, this, this, newConfig);
        try {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            super.onConfigurationChanged(newConfig);
        } finally {
            C46611a.m102764b().m102769g(interfaceC43175aM82123c);
        }
    }

    @Override // android.app.Application
    public void onCreate() throws InterruptedException {
        StartupTrace.f48194a.m58450j("duration2");
        super.onCreate();
        C42916f.m94129h();
        if (isMainProcess()) {
            try {
                C46396e.m102353j(this, false);
                C44128b.m97261e(TAG, "mmkv-init success");
                AppInstallStatusManager.f48140a.m58375a();
                C27100x0.m66923d(new Function0() { // from class: com.kubi.sdk.b0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseApplication.onCreate$lambda$2(this.f46487b);
                    }
                });
                CrashGuardian.f47695a.m57970u();
                setTheme(C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null) == 0 ? R$style.kucoin_AppTheme_1 : R$style.kucoin_AppTheme_2);
            } catch (Throwable th2) {
                C44128b.m97262f(TAG, "mmkv-init crash", th2);
                C41690i.m91067b(null, new C236522(th2, null), 1, null);
            }
        } else {
            C44128b.m97261e(TAG, "mmkv-init skipped:not-main");
        }
        StartupMinorTraceUtils.f48182a.m58419b("app_oncreate_end");
        getDelegate().m92080b(this, isMainProcess());
        StartupTrace.f48194a.m58450j("duration3");
    }

    public void setDelegate(@NotNull C42003b c42003b) {
        Intrinsics.checkNotNullParameter(c42003b, "<set-?>");
        this.delegate = c42003b;
    }

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMainProcess_delegate$lambda$0(BaseApplication baseApplication) {
        String strM66754d;
        String packageName = baseApplication.getPackageName();
        if (Build.VERSION.SDK_INT >= 28) {
            strM66754d = Application.getProcessName();
        } else {
            strM66754d = C27058k0.f54342a.m66754d(baseApplication);
        }
        boolean zAreEqual = Intrinsics.areEqual(strM66754d, packageName);
        Log.i(TAG, "process-check expected=" + packageName + " current=" + strM66754d + " isMain=" + zAreEqual);
        return zAreEqual;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Configuration configuration = resources.getConfiguration();
        configuration.fontScale = 1.0f;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return resources;
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        getDelegate().m92081c(this);
    }
}
