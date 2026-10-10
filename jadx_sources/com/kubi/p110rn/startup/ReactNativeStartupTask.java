package com.kubi.p110rn.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.C5276j;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.host.HostManager;
import com.kubi.p110rn.config.RnWhitePageCheckConfig;
import com.kubi.p110rn.core.BundleLoader;
import com.kubi.p110rn.core.ReactNativeEngine;
import com.kubi.p110rn.utils.RNConfigHelper;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.pkg.bundle.BundleManager;
import com.kubi.sdk.pkg.bundle.i18n.RnI18nLocaleContext;
import com.kubi.sdk.pkg.task.PackageDownloadSetting;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.web.api.IWebService;
import com.kubi.widget.web.helper.PackageConfigHelper;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p569qq.C43851l;
import p694vk.C45590s;
import p848zz.C46951a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ReactNativeStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/rn/startup/ReactNativeStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "downloadPriorityEnabled", "", "getDownloadPriorityEnabled", "()Z", "downloadPriorityEnabled$delegate", "Lkotlin/Lazy;", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "react_native", stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Async)
@SourceDebugExtension({"SMAP\nReactNativeStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeStartupTask.kt\ncom/kubi/rn/startup/ReactNativeStartupTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,166:1\n2746#2,3:167\n47#3,4:170\n35#4,4:174\n39#4:180\n35#4,4:181\n39#4:187\n44#5,2:178\n44#5,2:185\n*S KotlinDebug\n*F\n+ 1 ReactNativeStartupTask.kt\ncom/kubi/rn/startup/ReactNativeStartupTask\n*L\n75#1:167,3\n122#1:170,4\n50#1:174,4\n50#1:180\n109#1:181,4\n109#1:187\n50#1:178,2\n109#1:185,2\n*E\n"})
public final class ReactNativeStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: downloadPriorityEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy downloadPriorityEnabled = LazyKt.lazy(new Function0() { // from class: com.kubi.rn.startup.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ReactNativeStartupTask.downloadPriorityEnabled_delegate$lambda$0());
        }
    });

    /* JADX INFO: renamed from: com.kubi.rn.startup.ReactNativeStartupTask$run$5 */
    /* JADX INFO: compiled from: ReactNativeStartupTask.kt */
    /* JADX INFO: loaded from: classes39.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.startup.ReactNativeStartupTask$run$5", m90122f = "ReactNativeStartupTask.kt", m90123i = {2}, m90124l = {125, 136, 139, 145}, m90125m = "invokeSuspend", m90126n = {"taskLimit"}, m90127s = {"I$0"})
    public static final class C235905 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $application;
        final /* synthetic */ boolean $pkgPlatformEnabled;
        final /* synthetic */ C43851l.a $watcher;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C235905(Application application, boolean z11, C43851l.a aVar, Continuation<? super C235905> continuation) {
            super(2, continuation);
            this.$application = application;
            this.$pkgPlatformEnabled = z11;
            this.$watcher = aVar;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235905(this.$application, this.$pkgPlatformEnabled, this.$watcher, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C235905) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0072  */
        /* JADX WARN: Code duplicated, block: B:32:0x008b  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        
            if (r7.prepare(r1, r6) == r0) goto L34;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ReactNativeEngine reactNativeEngine;
            int iM67270b;
            BundleManager bundleManager;
            Application application;
            List<String> criticalBizList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            BundleLoader bundleLoader = BundleLoader.INSTANCE;
                            Application application2 = this.$application;
                            this.label = 4;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        reactNativeEngine = ReactNativeEngine.INSTANCE;
                        if (reactNativeEngine.getAutoStartDownload()) {
                            iM67270b = PackageConfigHelper.f55151a.m67270b();
                            bundleManager = BundleManager.f47277a;
                            application = this.$application;
                            criticalBizList = reactNativeEngine.getCriticalBizList();
                            this.I$0 = iM67270b;
                            this.label = 3;
                            if (bundleManager.m57485Z(application, iM67270b, criticalBizList, this) != coroutine_suspended) {
                                BundleLoader bundleLoader2 = BundleLoader.INSTANCE;
                                Application application3 = this.$application;
                                this.label = 4;
                            }
                        } else {
                            BundleLoader bundleLoader3 = BundleLoader.INSTANCE;
                            Application application4 = this.$application;
                            this.label = 4;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                this.$watcher.stop();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            BundleManager bundleManager2 = BundleManager.f47277a;
            Application application5 = this.$application;
            this.label = 1;
            if (bundleManager2.m57483W(application5, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            if (!this.$pkgPlatformEnabled) {
                C44128b.m97266j("ReactNativeStartupTask", "enableBundleManagerServer=false，清理包管理平台残留本地包");
                BundleManager.f47277a.m57490z(this.$application);
            }
            if (ReactNativeEngine.INSTANCE.isDisable$BReactNativeLib_googleRelease()) {
                return Unit.INSTANCE;
            }
            IWebService iWebService = IWebService.f54644a.get();
            this.label = 2;
            if (iWebService.mo36739b(false, this) != coroutine_suspended) {
                reactNativeEngine = ReactNativeEngine.INSTANCE;
                if (reactNativeEngine.getAutoStartDownload()) {
                    iM67270b = PackageConfigHelper.f55151a.m67270b();
                    bundleManager = BundleManager.f47277a;
                    application = this.$application;
                    criticalBizList = reactNativeEngine.getCriticalBizList();
                    this.I$0 = iM67270b;
                    this.label = 3;
                    if (bundleManager.m57485Z(application, iM67270b, criticalBizList, this) != coroutine_suspended) {
                        BundleLoader bundleLoader4 = BundleLoader.INSTANCE;
                        Application application6 = this.$application;
                        this.label = 4;
                    }
                } else {
                    BundleLoader bundleLoader5 = BundleLoader.INSTANCE;
                    Application application7 = this.$application;
                    this.label = 4;
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean downloadPriorityEnabled_delegate$lambda$0() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new TypeToken<Boolean>() { // from class: com.kubi.rn.startup.ReactNativeStartupTask$downloadPriorityEnabled_delegate$lambda$0$$inlined$getConfig$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_download_priority_switch", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    private final boolean getDownloadPriorityEnabled() {
        return ((Boolean) this.downloadPriorityEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map run$lambda$2() {
        Pair pairM90091to = TuplesKt.m90091to("X-DEVICE-NO", C5276j.m6247f());
        Pair pairM90091to2 = TuplesKt.m90091to("X-APP-VERSION", C45590s.f102687a.m100675Z());
        UserInfo userInfo = UserInfo.a;
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("X-USER-ID", userInfo.i()), TuplesKt.m90091to("X-APP-TOKEN", C27041f.m66668h(userInfo.l())), TuplesKt.m90091to("X-SITE", SiteType.INSTANCE.getCurrentSiteType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean run$lambda$3(boolean z11) {
        Object objM20457a;
        if (z11) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new TypeToken<Boolean>() { // from class: com.kubi.rn.startup.ReactNativeStartupTask$run$lambda$3$$inlined$getConfig$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("app_krn_lang_prefetch", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            if (C27025c.m66567e((Boolean) objM20457a, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RnI18nLocaleContext run$lambda$4() {
        return new RnI18nLocaleContext(SiteType.INSTANCE.getCurrentSiteType(), MultiLanguageManager.f46811g.getLocalString());
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C43851l.a aVarM96588a = C43851l.m96588a("krn_init_time", true);
        RNConfigHelper.INSTANCE.initConfig(application);
        I18nUtil.INSTANCE.DEPRECATED$getInstance().allowRTL(application, false);
        final boolean enableBundleManagerServer = ReactNativeEngine.INSTANCE.getEnableBundleManagerServer();
        C46951a c46951a = C46951a.f104822a;
        c46951a.m103439d(getDownloadPriorityEnabled());
        if (enableBundleManagerServer) {
            ArrayList<Interceptor> arrayListM57786a = PackageDownloadSetting.f47421a.m57786a();
            if (arrayListM57786a != null && arrayListM57786a.isEmpty()) {
                PackageDownloadSetting.f47421a.m57786a().add(new CalcBundleHostInterceptor());
                break;
            }
            Iterator<T> it = arrayListM57786a.iterator();
            do {
                if (!it.hasNext()) {
                    PackageDownloadSetting.f47421a.m57786a().add(new CalcBundleHostInterceptor());
                    break;
                }
            } while (!(((Interceptor) it.next()) instanceof CalcBundleHostInterceptor));
            C46951a.f104822a.m103437b(HostManager.a.f(), "Kucoin", new Function0() { // from class: com.kubi.rn.startup.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReactNativeStartupTask.run$lambda$2();
                }
            });
        } else {
            c46951a.m103440e(false);
            C44128b.m97266j("ReactNativeStartupTask", "enableBundleManagerServer=false，包管理平台已禁用");
        }
        C46951a.f104822a.m103438c(application, new Function0() { // from class: com.kubi.rn.startup.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ReactNativeStartupTask.run$lambda$3(enableBundleManagerServer));
            }
        }, new Function0() { // from class: com.kubi.rn.startup.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReactNativeStartupTask.run$lambda$4();
            }
        });
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("react_native_init").plus(C42911a.m94120b()).plus(new ReactNativeStartupTask$run$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE))), null, null, new C235905(application, enableBundleManagerServer, aVarM96588a, null), 3, null);
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new MultiLanguageManager.a() { // from class: com.kubi.rn.startup.ReactNativeStartupTask.run.6
            @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
            public void onLanguageChange(LanguageType language) {
                Intrinsics.checkNotNullParameter(language, "language");
                if (LanguageType.f46785AR == language || LanguageType.f46801UR == language) {
                    I18nUtil.INSTANCE.DEPRECATED$getInstance().forceRTL(application, true);
                } else {
                    I18nUtil.INSTANCE.DEPRECATED$getInstance().forceRTL(application, false);
                }
                C44128b.m97266j("ReactNativeStartupTask", "onLanguageChange: " + language);
            }
        });
        RnWhitePageCheckConfig.INSTANCE.load$BReactNativeLib_googleRelease();
    }
}
