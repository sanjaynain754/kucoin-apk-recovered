package com.kubi.p110rn.core;

import android.app.Application;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.MimeTypes;
import com.facebook.react.PackageList;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.mvi.common.MviExKt;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.debug.RnMetroConfigManager;
import com.kubi.p110rn.exception.RNException;
import com.kubi.p110rn.kline.KlineHybridBridgePackage;
import com.kubi.p110rn.kline.KlineMiniReactPackage;
import com.kubi.p110rn.modules.BusinessPackage;
import com.kubi.sdk.pkg.bundle.BundleManager;
import com.kubi.sdk.pkg.bundle.LoadBundleConfig;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.utils.C27100x0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p393k5.C40909a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.TextStreamsKt;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: BundleLoader.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u00011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0017J0\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002J\u0006\u0010\u001e\u001a\u00020\u0011J6\u0010\u001f\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0086@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0017J&\u0010(\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020'H\u0086@¢\u0006\u0002\u0010+J.\u0010(\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u00020-H\u0086@¢\u0006\u0002\u0010.J\f\u0010/\u001a\u00020'*\u00020\u0015H\u0002J\f\u00100\u001a\u00020\u0011*\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/rn/core/BundleLoader;", "", "<init>", "()V", "TAG", "", "METRO_CHECK_TIMEOUT_MS", "", "instanceCache", "", "Lcom/kubi/rn/core/BundleLoader$CacheItem;", "instanceCreationMutex", "Lkotlinx/coroutines/sync/Mutex;", "popCache", "Lcom/facebook/react/ReactInstanceManager;", "path", "afterInBackground", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "param", "Lcom/kubi/rn/core/ReactInitParam;", "prepare", "(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "report", "code", "version", TypedValues.TransitionType.S_DURATION, "", "errorMessage", "clearCache", "loadAsync", "Lcom/kubi/rn/core/SplitBundleLoader;", "fcpTracker", "Lcom/kubi/rn/core/KrnFcpTracker;", "ownerExceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "(Landroid/app/Application;Lcom/kubi/rn/core/ReactInitParam;Lcom/kubi/rn/core/KrnFcpTracker;Lcom/facebook/react/bridge/JSExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMetroRunning", "", "createReactInstance", "bundleFilePath", "isDebug", "(Landroid/app/Application;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exceptionHandler", "Lcom/kubi/rn/core/EngineExceptionHandler;", "(Landroid/app/Application;Ljava/lang/String;ZLcom/kubi/rn/core/EngineExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLocalServerDebug", "logMetroSourceUrlIfNeeded", "CacheItem", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundleLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,474:1\n295#2,2:475\n47#3,4:477\n71#4,2:481\n73#4,2:484\n1#5:483\n116#6,11:486\n*S KotlinDebug\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader\n*L\n64#1:475,2\n80#1:477,4\n133#1:481,2\n133#1:484,2\n241#1:486,11\n*E\n"})
public final class BundleLoader {
    private static final int METRO_CHECK_TIMEOUT_MS = 300;

    @NotNull
    private static final String TAG = "BundleLoader";

    @NotNull
    public static final BundleLoader INSTANCE = new BundleLoader();

    @NotNull
    private static final List<C23211a> instanceCache = new ArrayList();

    @NotNull
    private static final InterfaceC44082a instanceCreationMutex = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$a */
    /* JADX INFO: compiled from: BundleLoader.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/rn/core/BundleLoader$CacheItem;", "", "path", "", "instanceManager", "Lcom/facebook/react/ReactInstanceManager;", "<init>", "(Ljava/lang/String;Lcom/facebook/react/ReactInstanceManager;)V", "getPath", "()Ljava/lang/String;", "getInstanceManager", "()Lcom/facebook/react/ReactInstanceManager;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23211a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f45548a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final ReactInstanceManager f45549b;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ReactInstanceManager getF45549b() {
            return this.f45549b;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF45548a() {
            return this.f45548a;
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$afterInBackground$1 */
    /* JADX INFO: compiled from: BundleLoader.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.BundleLoader$afterInBackground$1", m90122f = "BundleLoader.kt", m90123i = {}, m90124l = {82, 83, 85}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C232131 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $application;
        final /* synthetic */ ReactInitParam $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C232131(Application application, ReactInitParam reactInitParam, Continuation<? super C232131> continuation) {
            super(2, continuation);
            this.$application = application;
            this.$param = reactInitParam;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232131(this.$application, this.$param, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C232131) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if (com.kubi.sdk.pkg.bundle.BundleManager.m57447Y(r3, r4, r5, r6, null, r11, 8, null) == r0) goto L20;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        BundleManager bundleManager = BundleManager.f47277a;
                        Application application = this.$application;
                        String biz = this.$param.getBiz();
                        String entry = this.$param.getEntry();
                        this.label = 3;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.m90350b(10000L, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            BundleLoader bundleLoader = BundleLoader.INSTANCE;
            Application application2 = this.$application;
            this.label = 2;
            if (bundleLoader.prepare(application2, this) != coroutine_suspended) {
                BundleManager bundleManager2 = BundleManager.f47277a;
                Application application3 = this.$application;
                String biz2 = this.$param.getBiz();
                String entry2 = this.$param.getEntry();
                this.label = 3;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$createReactInstance$3 */
    /* JADX INFO: compiled from: BundleLoader.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/facebook/react/ReactInstanceManager;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.BundleLoader$createReactInstance$3", m90122f = "BundleLoader.kt", m90123i = {1, 1, 1, 1}, m90124l = {306, 477}, m90125m = "invokeSuspend", m90126n = {"reactInstanceManager", "contextListener", "managerDestroyed", "$i$f$suspendCancellableCoroutine"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
    @SourceDebugExtension({"SMAP\nBundleLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader$createReactInstance$3\n+ 2 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,474:1\n45#2,2:475\n45#2,2:486\n45#2,2:490\n426#3,9:477\n435#3,2:488\n*S KotlinDebug\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader$createReactInstance$3\n*L\n308#1:475,2\n445#1:486,2\n452#1:490,2\n325#1:477,9\n325#1:488,2\n*E\n"})
    public static final class C232143 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super ReactInstanceManager>, Object> {
        final /* synthetic */ Application $application;
        final /* synthetic */ String $bundleFilePath;
        final /* synthetic */ EngineExceptionHandler $exceptionHandler;
        final /* synthetic */ boolean $isDebug;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$createReactInstance$3$a */
        /* JADX INFO: compiled from: BundleLoader.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ OnceCallback<ReactInstanceManager> f45550b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Ref.ObjectRef<ContextInitializedListenerWrapper> f45551c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Ref.ObjectRef<ReactInstanceManager> f45552d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ AtomicBoolean f45553e;

            /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$createReactInstance$3$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BundleLoader.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            public static final class C46981a implements Function0<Unit> {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Ref.ObjectRef<ReactInstanceManager> f45554b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ContextInitializedListenerWrapper f45555c;

                public C46981a(Ref.ObjectRef<ReactInstanceManager> objectRef, ContextInitializedListenerWrapper contextInitializedListenerWrapper) {
                    this.f45554b = objectRef;
                    this.f45555c = contextInitializedListenerWrapper;
                }

                /* JADX INFO: renamed from: a */
                public final void m55692a() {
                    ReactInstanceManager reactInstanceManager = this.f45554b.element;
                    if (reactInstanceManager != null) {
                        reactInstanceManager.removeReactInstanceEventListener(this.f45555c);
                    }
                }

                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    m55692a();
                    return Unit.INSTANCE;
                }
            }

            public a(OnceCallback<ReactInstanceManager> onceCallback, Ref.ObjectRef<ContextInitializedListenerWrapper> objectRef, Ref.ObjectRef<ReactInstanceManager> objectRef2, AtomicBoolean atomicBoolean) {
                this.f45550b = onceCallback;
                this.f45551c = objectRef;
                this.f45552d = objectRef2;
                this.f45553e = atomicBoolean;
            }

            /* JADX INFO: renamed from: a */
            public final void m55691a(Throwable th2) {
                this.f45550b.cancel();
                ContextInitializedListenerWrapper contextInitializedListenerWrapper = this.f45551c.element;
                if (contextInitializedListenerWrapper != null) {
                    C27100x0.m66924e(new C46981a(this.f45552d, contextInitializedListenerWrapper));
                }
                C232143.m55689f(this.f45552d, this.f45553e);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                m55691a(th2);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$createReactInstance$3$b */
        /* JADX INFO: compiled from: BundleLoader.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b implements Function1<Exception, Unit> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f45556b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ OnceCallback<ReactInstanceManager> f45557c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Ref.ObjectRef<ReactInstanceManager> f45558d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ AtomicBoolean f45559e;

            public b(String str, OnceCallback<ReactInstanceManager> onceCallback, Ref.ObjectRef<ReactInstanceManager> objectRef, AtomicBoolean atomicBoolean) {
                this.f45556b = str;
                this.f45557c = onceCallback;
                this.f45558d = objectRef;
                this.f45559e = atomicBoolean;
            }

            /* JADX INFO: renamed from: a */
            public final void m55693a(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C23985b.m57873d(C23985b.f47489a, "loadBundle", "createReactInstance " + this.f45556b + " SafeJSBundleLoader 初始化失败", null, 4, null);
                C232143.m55689f(this.f45558d, this.f45559e);
                this.f45557c.resumeWithException(it);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                m55693a(exc);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$createReactInstance$3$c */
        /* JADX INFO: compiled from: BundleLoader.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class c implements Function0<Unit> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReactInstanceManager f45560b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ContextInitializedListenerWrapper f45561c;

            public c(ReactInstanceManager reactInstanceManager, ContextInitializedListenerWrapper contextInitializedListenerWrapper) {
                this.f45560b = reactInstanceManager;
                this.f45561c = contextInitializedListenerWrapper;
            }

            /* JADX INFO: renamed from: a */
            public final void m55694a() {
                this.f45560b.removeReactInstanceEventListener(this.f45561c);
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m55694a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$createReactInstance$3$d */
        /* JADX INFO: compiled from: BundleLoader.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class d implements Function1<ReactInstanceManager, Unit> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f45562b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ OnceCallback<ReactInstanceManager> f45563c;

            public d(String str, OnceCallback<ReactInstanceManager> onceCallback) {
                this.f45562b = str;
                this.f45563c = onceCallback;
            }

            /* JADX INFO: renamed from: a */
            public final void m55695a(ReactInstanceManager reactInstanceManager) {
                if (reactInstanceManager != null && reactInstanceManager.getCurrentReactContext() != null) {
                    C23985b.f47489a.m57877e("loadBundle", "createReactInstance " + this.f45562b + " 初始化成功");
                    this.f45563c.resume(reactInstanceManager);
                    return;
                }
                C23985b.m57873d(C23985b.f47489a, "loadBundle", "createReactInstance " + this.f45562b + " 初始化失败", null, 4, null);
                this.f45563c.resumeWithException(new ReactHostException(401, this.f45562b + " 初始化失败"));
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ReactInstanceManager reactInstanceManager) {
                m55695a(reactInstanceManager);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$createReactInstance$3$e */
        /* JADX INFO: compiled from: BundleLoader.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class e implements Function0<Unit> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ EngineExceptionHandler f45564b;

            public e(EngineExceptionHandler engineExceptionHandler) {
                this.f45564b = engineExceptionHandler;
            }

            /* JADX INFO: renamed from: a */
            public final void m55696a() {
                this.f45564b.endInitialization();
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m55696a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C232143(Application application, String str, EngineExceptionHandler engineExceptionHandler, boolean z11, Continuation<? super C232143> continuation) {
            super(2, continuation);
            this.$application = application;
            this.$bundleFilePath = str;
            this.$exceptionHandler = engineExceptionHandler;
            this.$isDebug = z11;
        }

        /* JADX INFO: renamed from: f */
        public static final void m55689f(Ref.ObjectRef<ReactInstanceManager> objectRef, AtomicBoolean atomicBoolean) {
            final ReactInstanceManager reactInstanceManager = objectRef.element;
            if (reactInstanceManager != null && atomicBoolean.compareAndSet(false, true)) {
                C27100x0.m66924e(new Function0() { // from class: com.kubi.rn.core.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BundleLoader.C232143.m55690g(reactInstanceManager);
                    }
                });
            }
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232143(this.$application, this.$bundleFilePath, this.$exceptionHandler, this.$isDebug, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super ReactInstanceManager> continuation) {
            return ((C232143) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: g */
        public static final Unit m55690g(ReactInstanceManager reactInstanceManager) {
            reactInstanceManager.destroy();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v9, types: [T, com.facebook.react.ReactInstanceManager] */
        /* JADX WARN: Type inference failed for: r8v13, types: [T, com.facebook.react.ReactInstanceEventListener, com.kubi.rn.core.ContextInitializedListenerWrapper] */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            AtomicBoolean atomicBoolean;
            Ref.ObjectRef objectRef3;
            Throwable th2;
            AtomicBoolean atomicBoolean2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                try {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                atomicBoolean2 = (AtomicBoolean) this.L$2;
                                objectRef3 = (Ref.ObjectRef) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    return (ReactInstanceManager) obj;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    C43846g.m96568c(new RNException(th2, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
                                    m55689f(objectRef3, atomicBoolean2);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        RNApplicationInitGate rNApplicationInitGate = RNApplicationInitGate.INSTANCE;
                        Application application = this.$application;
                        this.label = 1;
                        if (rNApplicationInitGate.awaitReady(application, "BundleLoader.createReactInstance", this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    EngineExceptionHandler engineExceptionHandler = this.$exceptionHandler;
                    final Application application2 = this.$application;
                    String str = this.$bundleFilePath;
                    final boolean z11 = this.$isDebug;
                    this.L$0 = objectRef;
                    this.L$1 = objectRef2;
                    this.L$2 = atomicBoolean;
                    this.L$3 = engineExceptionHandler;
                    this.L$4 = application2;
                    this.L$5 = str;
                    this.Z$0 = z11;
                    this.I$0 = 0;
                    this.label = 2;
                    C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
                    c41716o.m91142E();
                    OnceCallback onceCallback = new OnceCallback(c41716o, new e(engineExceptionHandler));
                    if (engineExceptionHandler.beginInitialization(onceCallback)) {
                        c41716o.mo91119t(new a(onceCallback, objectRef2, objectRef, atomicBoolean));
                        if (c41716o.isActive()) {
                            try {
                                final ArrayList<ReactPackage> packages = new PackageList(application2).getPackages();
                                Intrinsics.checkNotNullExpressionValue(packages, "getPackages(...)");
                                packages.add(new BusinessPackage());
                                packages.add(new KlineMiniReactPackage());
                                packages.add(new KlineHybridBridgePackage());
                                DefaultReactNativeHost defaultReactNativeHost = new DefaultReactNativeHost(application2) { // from class: com.kubi.rn.core.BundleLoader$createReactInstance$3$1$host$1
                                    private final boolean isNewArchEnabled = true;
                                    private final boolean isHermesEnabled = true;

                                    @Override // com.facebook.react.ReactNativeHost
                                    public String getJSMainModuleName() {
                                        return "index";
                                    }

                                    @Override // com.facebook.react.ReactNativeHost
                                    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
                                        return new C40909a();
                                    }

                                    @Override // com.facebook.react.ReactNativeHost
                                    public List<ReactPackage> getPackages() {
                                        return packages;
                                    }

                                    @Override // com.facebook.react.ReactNativeHost
                                    /* JADX INFO: renamed from: getUseDeveloperSupport, reason: from getter */
                                    public boolean get$isDebug() {
                                        return z11;
                                    }

                                    @Override // com.facebook.react.defaults.DefaultReactNativeHost
                                    public Boolean isHermesEnabled() {
                                        return Boolean.valueOf(this.isHermesEnabled);
                                    }

                                    @Override // com.facebook.react.defaults.DefaultReactNativeHost
                                    /* JADX INFO: renamed from: isNewArchEnabled, reason: from getter */
                                    public boolean getIsNewArchEnabled() {
                                        return this.isNewArchEnabled;
                                    }

                                    @Override // com.facebook.react.defaults.DefaultReactNativeHost, com.facebook.react.ReactNativeHost
                                    public ReactPackageTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
                                        return super.getReactPackageTurboModuleManagerDelegateBuilder();
                                    }

                                    @Override // com.facebook.react.defaults.DefaultReactNativeHost, com.facebook.react.ReactNativeHost
                                    public UIManagerProvider getUIManagerProvider() {
                                        return super.getUIManagerProvider();
                                    }
                                };
                                objectRef.element = ReactInstanceManager.builder().setApplication(application2).addPackages(packages).setJSMainModulePath("index").setJSBundleLoader(new SafeJSBundleLoader(str, new b(str, onceCallback, objectRef, atomicBoolean))).setUseDeveloperSupport(z11).setInitialLifecycleState(LifecycleState.BEFORE_CREATE).setJSExceptionHandler(engineExceptionHandler).setReactPackageTurboModuleManagerDelegateBuilder(defaultReactNativeHost.getReactPackageTurboModuleManagerDelegateBuilder()).setUIManagerProvider(defaultReactNativeHost.getUIManagerProvider()).setJavaScriptExecutorFactory(defaultReactNativeHost.getJavaScriptExecutorFactory()).build();
                                if (!c41716o.isActive()) {
                                    m55689f(objectRef, atomicBoolean);
                                } else {
                                    T t11 = objectRef.element;
                                    if (t11 != 0) {
                                        ReactInstanceManager reactInstanceManager = (ReactInstanceManager) t11;
                                        if (z11) {
                                            BundleLoader.INSTANCE.logMetroSourceUrlIfNeeded(reactInstanceManager);
                                        }
                                        ?? contextInitializedListenerWrapper = new ContextInitializedListenerWrapper(reactInstanceManager, new d(str, onceCallback));
                                        objectRef2.element = contextInitializedListenerWrapper;
                                        if (!c41716o.isActive()) {
                                            m55689f(objectRef, atomicBoolean);
                                        } else {
                                            reactInstanceManager.addReactInstanceEventListener(contextInitializedListenerWrapper);
                                            if (!c41716o.isActive()) {
                                                C27100x0.m66924e(new c(reactInstanceManager, contextInitializedListenerWrapper));
                                                m55689f(objectRef, atomicBoolean);
                                            } else {
                                                reactInstanceManager.createReactContextInBackground();
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            } catch (Throwable th4) {
                                C43846g.m96568c(new RNException(th4, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
                                onceCallback.resumeWithException(th4);
                            }
                        }
                        Object objM91171w = c41716o.m91171w();
                        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(this);
                        }
                        if (objM91171w != coroutine_suspended) {
                            objectRef3 = objectRef;
                            obj = objM91171w;
                            atomicBoolean2 = atomicBoolean;
                            return (ReactInstanceManager) obj;
                        }
                        return coroutine_suspended;
                    }
                    throw new IllegalStateException("ReactInstanceManager initialization handler is already registered");
                } catch (Throwable th5) {
                    objectRef3 = objectRef;
                    th2 = th5;
                    atomicBoolean2 = atomicBoolean;
                    C43846g.m96568c(new RNException(th2, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
                    m55689f(objectRef3, atomicBoolean2);
                    throw th2;
                }
                objectRef = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                atomicBoolean = new AtomicBoolean(false);
            } catch (Throwable th6) {
                C43846g.m96568c(new RNException(th6, "awaitApplicationInitInCreateReactInstance", false, null, 8, null), null, 2, null);
                C23985b.m57873d(C23985b.f47489a, "loadBundle", "createReactInstance " + this.$bundleFilePath + " 等待 RN 初始化失败: " + th6.getMessage(), null, 4, null);
                String message = th6.getMessage();
                if (message == null) {
                    message = "RN runtime 初始化失败";
                }
                throw new ReactHostException(302, message);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$isMetroRunning$2 */
    /* JADX INFO: compiled from: BundleLoader.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.BundleLoader$isMetroRunning$2", m90122f = "BundleLoader.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nBundleLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader$isMetroRunning$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,474:1\n1#2:475\n*E\n"})
    public static final class C232152 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Application $application;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C232152(Application application, Continuation<? super C232152> continuation) {
            super(2, continuation);
            this.$application = application;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232152(this.$application, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
            return ((C232152) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HttpURLConnection httpURLConnection;
            Throwable th2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = "http://" + RnMetroConfigManager.INSTANCE.getCurrentHostPort(this.$application).toDebugServerHost() + "/status";
            boolean z11 = false;
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(300);
                httpURLConnection.setReadTimeout(300);
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                    try {
                        String text = TextStreamsKt.readText(bufferedReader);
                        CloseableKt.closeFinally(bufferedReader, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        boolean z12 = true;
                        if (responseCode != 200 || !StringsKt.contains$default((CharSequence) text, (CharSequence) "packager-status:running", false, 2, (Object) null)) {
                            z12 = false;
                        }
                        C44128b.m97266j(BundleLoader.TAG, "isMetroRunning url=" + str + ", responseCode=" + responseCode + ", isRunning=" + z12);
                        httpURLConnection.disconnect();
                        z11 = z12;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(bufferedReader, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    try {
                        C44128b.m97266j(BundleLoader.TAG, "isMetroRunning failed, url=" + str + ", message=" + th2.getMessage());
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            } catch (Throwable th6) {
                httpURLConnection = null;
                th2 = th6;
            }
            return Boxing.boxBoolean(z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$loadAsync$1 */
    /* JADX INFO: compiled from: BundleLoader.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.BundleLoader", m90122f = "BundleLoader.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m90124l = {165, 174, 481, 242}, m90125m = "loadAsync", m90126n = {MimeTypes.BASE_TYPE_APPLICATION, "param", "fcpTracker", "ownerExceptionHandler", "isDebug", MimeTypes.BASE_TYPE_APPLICATION, "param", "fcpTracker", "ownerExceptionHandler", "isDebug", "fetchBundleStartTime", MimeTypes.BASE_TYPE_APPLICATION, "param", "fcpTracker", "ownerExceptionHandler", "loadBundleConfig", "exceptionHandler", "$this$withLock_u24default$iv", "isDebug", "$i$f$withLock", MimeTypes.BASE_TYPE_APPLICATION, "param", "fcpTracker", "ownerExceptionHandler", "loadBundleConfig", "exceptionHandler", "$this$withLock_u24default$iv", "isDebug", "$i$f$withLock", "$i$a$-withLock$default-BundleLoader$loadAsync$newInstance$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2"})
    public static final class C232161 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C232161(Continuation<? super C232161> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BundleLoader.this.loadAsync(null, null, null, null, this);
        }
    }

    @Nullable
    public final Object createReactInstance(@NotNull Application application, @NotNull String str, boolean z11, @NotNull Continuation<? super ReactInstanceManager> continuation) {
        return createReactInstance(application, str, z11, new EngineExceptionHandler(null, 1, null), continuation);
    }

    public static /* synthetic */ Object loadAsync$default(BundleLoader bundleLoader, Application application, ReactInitParam reactInitParam, KrnFcpTracker krnFcpTracker, JSExceptionHandler jSExceptionHandler, Continuation continuation, int i11, Object obj) throws ReactHostException {
        if ((i11 & 4) != 0) {
            krnFcpTracker = null;
        }
        if ((i11 & 8) != 0) {
            jSExceptionHandler = null;
        }
        return bundleLoader.loadAsync(application, reactInitParam, krnFcpTracker, jSExceptionHandler, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logMetroSourceUrlIfNeeded(final ReactInstanceManager reactInstanceManager) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.rn.core.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BundleLoader.logMetroSourceUrlIfNeeded$lambda$16(reactInstanceManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMetroSourceUrlIfNeeded$lambda$16(ReactInstanceManager reactInstanceManager) {
        C23985b c23985b = C23985b.f47489a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Metro sourceUrl=");
        String sourceUrl = reactInstanceManager.getDevSupportManager().getSourceUrl();
        if (sourceUrl == null) {
            sourceUrl = "";
        }
        sb2.append(sourceUrl);
        c23985b.m57877e(TAG, sb2.toString());
        return Unit.INSTANCE;
    }

    private final ReactInstanceManager popCache(String path) {
        ReactInstanceManager f45549b;
        Object next;
        List<C23211a> list = instanceCache;
        synchronized (list) {
            try {
                Iterator<T> it = list.iterator();
                do {
                    f45549b = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((C23211a) next).getF45548a(), path));
                C23211a c23211a = (C23211a) next;
                if (c23211a != null) {
                    instanceCache.remove(c23211a);
                    f45549b = c23211a.getF45549b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f45549b;
    }

    private final void report(int code, String version, long duration, String errorMessage) {
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", code);
        if (version != null) {
            eventParametersBuilderAcquire.m42393d("version", version);
        }
        if (duration > 0) {
            eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, duration);
        }
        if (errorMessage != null) {
            eventParametersBuilderAcquire.m42393d("error_message", errorMessage);
        }
        TechnologyEvent.m42388d("krn_prepare_rate", eventParametersBuilderAcquire);
    }

    public static /* synthetic */ void report$default(BundleLoader bundleLoader, int i11, String str, long j11, String str2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        bundleLoader.report(i11, str, j12, str2);
    }

    public final void afterInBackground(@NotNull Application application, @NotNull ReactInitParam param) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(param, "param");
        if (ReactNativeEngine.INSTANCE.isDisable$BReactNativeLib_googleRelease()) {
            return;
        }
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("react_native_init").plus(C42911a.m94120b()).plus(new C23212x174f5947(CoroutineExceptionHandler.INSTANCE))), null, null, new C232131(application, param, null), 3, null);
    }

    public final void clearCache() {
        List<C23211a> list = instanceCache;
        synchronized (list) {
            list.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0335  */
    /* JADX WARN: Code duplicated, block: B:113:0x035e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0381  */
    /* JADX WARN: Code duplicated, block: B:120:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:121:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c2 A[Catch: TaskException -> 0x0216, TryCatch #6 {TaskException -> 0x0216, blocks: (B:51:0x01bd, B:53:0x01c2, B:57:0x01ec, B:60:0x01f8, B:63:0x021b), top: B:139:0x01bd }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0224  */
    /* JADX WARN: Code duplicated, block: B:68:0x0239  */
    /* JADX WARN: Code duplicated, block: B:71:0x0247  */
    /* JADX WARN: Code duplicated, block: B:75:0x0284  */
    /* JADX WARN: Code duplicated, block: B:78:0x0295  */
    /* JADX WARN: Code duplicated, block: B:79:0x0297  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:92:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:95:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e9  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        if (r7 == r6) goto L84;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x035e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x03b1, please report this as an issue */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAsync(@NotNull Application application, @NotNull ReactInitParam reactInitParam, @Nullable KrnFcpTracker krnFcpTracker, @Nullable JSExceptionHandler jSExceptionHandler, @NotNull Continuation<? super SplitBundleLoader> continuation) throws Throwable {
        C232161 c232161;
        int i11;
        KrnFcpTracker krnFcpTracker2;
        ReactInitParam reactInitParam2;
        long j11;
        Object objM57480T;
        KrnFcpTracker krnFcpTracker3;
        Object objIsMetroRunning;
        LoadBundleConfig loadBundleConfigMock;
        ReactInitParam reactInitParam3;
        Application application2;
        JSExceptionHandler jSExceptionHandler2;
        int code;
        String message;
        Throwable cause;
        String str;
        EngineExceptionHandler engineExceptionHandler;
        InterfaceC44082a interfaceC44082a;
        Object obj;
        EngineExceptionHandler engineExceptionHandler2;
        InterfaceC44082a interfaceC44082a2;
        int i12;
        LoadBundleConfig loadBundleConfig;
        ReactInitParam reactInitParam4;
        KrnFcpTracker krnFcpTracker4;
        int i13;
        LoadBundleConfig loadBundleConfig2;
        String strM57538e;
        String str2;
        String strM57535b;
        Object obj2;
        boolean z11;
        int i14;
        Object objCreateReactInstance;
        KrnFcpTracker krnFcpTracker5;
        InterfaceC44082a interfaceC44082a3;
        int i15;
        Application application3 = application;
        ReactInitParam reactInitParam5 = reactInitParam;
        KrnFcpTracker krnFcpTracker6 = krnFcpTracker;
        JSExceptionHandler jSExceptionHandler3 = jSExceptionHandler;
        if (continuation instanceof C232161) {
            c232161 = (C232161) continuation;
            int i16 = c232161.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c232161.label = i16 - Integer.MIN_VALUE;
            } else {
                c232161 = new C232161(continuation);
            }
        } else {
            c232161 = new C232161(continuation);
        }
        C232161 c232162 = c232161;
        Object obj3 = c232162.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i17 = c232162.label;
        String str3 = "";
        if (i17 == 0) {
            ResultKt.throwOnFailure(obj3);
            i11 = (ReactConstKt.getDeveloperSupport() && reactInitParam5.isDebug()) ? 1 : 0;
            if (i11 != 0) {
                RnMetroConfigManager.INSTANCE.restoreManagedHostIfNeeded(application3, true, isLocalServerDebug(reactInitParam5));
            }
            if (i11 != 0) {
                c232162.L$0 = application3;
                c232162.L$1 = reactInitParam5;
                c232162.L$2 = krnFcpTracker6;
                c232162.L$3 = jSExceptionHandler3;
                c232162.I$0 = i11;
                c232162.label = 1;
                objIsMetroRunning = isMetroRunning(application3, c232162);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    BundleManager bundleManager = BundleManager.f47277a;
                    String biz = reactInitParam5.getBiz();
                    String entry = reactInitParam5.getEntry();
                    c232162.L$0 = application3;
                    c232162.L$1 = reactInitParam5;
                    c232162.L$2 = krnFcpTracker6;
                    c232162.L$3 = jSExceptionHandler3;
                    c232162.I$0 = i11;
                    c232162.J$0 = jCurrentTimeMillis;
                    c232162.label = 2;
                    objM57480T = bundleManager.m57480T(application3, biz, entry, c232162);
                    if (objM57480T != coroutine_suspended) {
                        krnFcpTracker3 = krnFcpTracker6;
                        reactInitParam2 = reactInitParam5;
                        j11 = jCurrentTimeMillis;
                        loadBundleConfig2 = (LoadBundleConfig) objM57480T;
                        if (krnFcpTracker3 != null) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j11;
                            String biz2 = reactInitParam2.getBiz();
                            String strM57542i = loadBundleConfig2.m57542i();
                            int iM57537d = loadBundleConfig2.m57537d();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(Constants.COMPONENT, reactInitParam2.getComponent());
                            strM57538e = loadBundleConfig2.m57538e();
                            if (strM57538e == null) {
                                str2 = "";
                            } else {
                                str2 = strM57538e;
                            }
                            jSONObject.put("bundle_url", str2);
                            strM57535b = loadBundleConfig2.m57535b();
                            if (strM57535b == null) {
                                strM57535b = "";
                            }
                            jSONObject.put("base_version", strM57535b);
                            jSONObject.put("base_bundle_path", loadBundleConfig2.getBaseBundleFilePath());
                            Unit unit = Unit.INSTANCE;
                            KrnFcpTracker.reportFetchBundle$default(krnFcpTracker3, true, jCurrentTimeMillis2, biz2, strM57542i, iM57537d, null, jSONObject.toString(), 32, null);
                        }
                        loadBundleConfigMock = (LoadBundleConfig) objM57480T;
                        reactInitParam3 = reactInitParam2;
                        krnFcpTracker6 = krnFcpTracker3;
                        jSExceptionHandler2 = jSExceptionHandler3;
                        application2 = application3;
                        if (krnFcpTracker6 != null) {
                            krnFcpTracker6.recordBundleConfig(loadBundleConfigMock.m57542i(), loadBundleConfigMock.m57535b(), loadBundleConfigMock.getBaseBundleFilePath(), loadBundleConfigMock.getChildBundleFilePath());
                        }
                        if (krnFcpTracker6 != null) {
                            krnFcpTracker6.setFetchBundleEnd(System.currentTimeMillis());
                        }
                        RnBreadcrumbs.INSTANCE.bundleConfig(reactInitParam3, loadBundleConfigMock);
                        if (krnFcpTracker6 != null) {
                            krnFcpTracker6.setLoadBaseBundleStart(System.currentTimeMillis());
                        }
                        C23985b.f47489a.m57877e("loadBundle", "新创建rn容器实例");
                        engineExceptionHandler = new EngineExceptionHandler(jSExceptionHandler2);
                        interfaceC44082a = instanceCreationMutex;
                        c232162.L$0 = application2;
                        c232162.L$1 = SpillingKt.nullOutSpilledVariable(reactInitParam3);
                        c232162.L$2 = krnFcpTracker6;
                        c232162.L$3 = SpillingKt.nullOutSpilledVariable(jSExceptionHandler2);
                        c232162.L$4 = loadBundleConfigMock;
                        c232162.L$5 = engineExceptionHandler;
                        c232162.L$6 = interfaceC44082a;
                        c232162.I$0 = i11;
                        c232162.I$1 = 0;
                        c232162.label = 3;
                        obj = null;
                        if (interfaceC44082a.mo91344d(null, c232162) != coroutine_suspended) {
                            engineExceptionHandler2 = engineExceptionHandler;
                            interfaceC44082a2 = interfaceC44082a;
                            i12 = i11;
                            loadBundleConfig = loadBundleConfigMock;
                            reactInitParam4 = reactInitParam3;
                            krnFcpTracker4 = krnFcpTracker6;
                            i13 = 0;
                            BundleLoader bundleLoader = INSTANCE;
                            ReactInitParam reactInitParam6 = reactInitParam4;
                            String baseBundleFilePath = loadBundleConfig.getBaseBundleFilePath();
                            if (i12 != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c232162.L$0 = SpillingKt.nullOutSpilledVariable(application2);
                            c232162.L$1 = SpillingKt.nullOutSpilledVariable(reactInitParam6);
                            c232162.L$2 = krnFcpTracker4;
                            c232162.L$3 = SpillingKt.nullOutSpilledVariable(jSExceptionHandler2);
                            c232162.L$4 = loadBundleConfig;
                            c232162.L$5 = engineExceptionHandler2;
                            c232162.L$6 = interfaceC44082a2;
                            c232162.I$0 = i12;
                            c232162.I$1 = i13;
                            i14 = 0;
                            c232162.I$2 = 0;
                            c232162.label = 4;
                            obj2 = null;
                            objCreateReactInstance = bundleLoader.createReactInstance(application2, baseBundleFilePath, z11, engineExceptionHandler2, c232162);
                            if (objCreateReactInstance != coroutine_suspended) {
                                krnFcpTracker5 = krnFcpTracker4;
                                ReactInstanceManager reactInstanceManager = (ReactInstanceManager) objCreateReactInstance;
                                interfaceC44082a2.mo91345e(obj2);
                                if (krnFcpTracker5 != null) {
                                    krnFcpTracker5.setLoadBaseBundleEnd(System.currentTimeMillis());
                                }
                                RNInstanceManagerHolder.INSTANCE.setCurrentInstanceManager(reactInstanceManager);
                                if (i12 == 0) {
                                    BundleManager.f47277a.m57487b0(loadBundleConfig);
                                }
                                if (loadBundleConfig.getFromRemote()) {
                                    i15 = 2;
                                } else {
                                    i15 = i14;
                                }
                                return new SplitBundleLoader(reactInstanceManager, i15, loadBundleConfig, engineExceptionHandler2);
                            }
                        }
                    }
                } catch (TaskException e11) {
                    e = e11;
                    krnFcpTracker2 = krnFcpTracker6;
                    reactInitParam2 = reactInitParam5;
                    j11 = jCurrentTimeMillis;
                    C23985b.m57873d(C23985b.f47489a, "loadBundle", "code: " + e.getCode() + ", message: " + e.getMessage(), null, 4, null);
                    if (krnFcpTracker2 != null) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - j11;
                        String biz3 = reactInitParam2.getBiz();
                        String message2 = e.getMessage();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(Constants.COMPONENT, reactInitParam2.getComponent());
                        jSONObject2.put("task_code", e.getCode());
                        cause = e.getCause();
                        if (cause != null) {
                            str = cause.getClass().getSimpleName() + ": " + cause.getMessage();
                            if (str != null) {
                                str3 = str;
                            }
                        }
                        jSONObject2.put("cause", str3);
                        Unit unit2 = Unit.INSTANCE;
                        KrnFcpTracker.reportFetchBundle$default(krnFcpTracker2, false, jCurrentTimeMillis3, biz3, null, 0, message2, jSONObject2.toString(), 8, null);
                    }
                    if (e.getCode() == 1404) {
                        code = 400;
                    } else {
                        code = e.getCode();
                    }
                    message = e.getMessage();
                    if (message == null) {
                        message = reactInitParam2.getBiz() + " 找不到配置文件";
                    }
                    throw new ReactHostException(code, message);
                }
            }
            return coroutine_suspended;
        }
        if (i17 == 1) {
            int i18 = c232162.I$0;
            JSExceptionHandler jSExceptionHandler4 = (JSExceptionHandler) c232162.L$3;
            krnFcpTracker6 = (KrnFcpTracker) c232162.L$2;
            ReactInitParam reactInitParam7 = (ReactInitParam) c232162.L$1;
            Application application4 = (Application) c232162.L$0;
            ResultKt.throwOnFailure(obj3);
            i11 = i18;
            application3 = application4;
            objIsMetroRunning = obj3;
            jSExceptionHandler3 = jSExceptionHandler4;
            reactInitParam5 = reactInitParam7;
            if (!((Boolean) objIsMetroRunning).booleanValue()) {
                C23985b.m57873d(C23985b.f47489a, "loadBundle", "debug metro is not running, biz=" + reactInitParam5.getBiz() + ", entry=" + reactInitParam5.getEntry(), null, 4, null);
                throw new ReactHostException(400, "Metro 未启动或不可达，请确认本地调试服务已开启");
            }
            C44128b.m97266j(TAG, "loadAsync debug mode uses local mock bundle, biz=" + reactInitParam5.getBiz() + ", entry=" + reactInitParam5.getEntry());
            loadBundleConfigMock = LoadBundleConfig.INSTANCE.mock(application3, reactInitParam5.getBiz(), reactInitParam5.getEntry());
            reactInitParam3 = reactInitParam5;
            application2 = application3;
            jSExceptionHandler2 = jSExceptionHandler3;
            if (krnFcpTracker6 != null) {
                krnFcpTracker6.recordBundleConfig(loadBundleConfigMock.m57542i(), loadBundleConfigMock.m57535b(), loadBundleConfigMock.getBaseBundleFilePath(), loadBundleConfigMock.getChildBundleFilePath());
            }
            if (krnFcpTracker6 != null) {
                krnFcpTracker6.setFetchBundleEnd(System.currentTimeMillis());
            }
            RnBreadcrumbs.INSTANCE.bundleConfig(reactInitParam3, loadBundleConfigMock);
            if (krnFcpTracker6 != null) {
                krnFcpTracker6.setLoadBaseBundleStart(System.currentTimeMillis());
            }
            C23985b.f47489a.m57877e("loadBundle", "新创建rn容器实例");
            engineExceptionHandler = new EngineExceptionHandler(jSExceptionHandler2);
            interfaceC44082a = instanceCreationMutex;
            c232162.L$0 = application2;
            c232162.L$1 = SpillingKt.nullOutSpilledVariable(reactInitParam3);
            c232162.L$2 = krnFcpTracker6;
            c232162.L$3 = SpillingKt.nullOutSpilledVariable(jSExceptionHandler2);
            c232162.L$4 = loadBundleConfigMock;
            c232162.L$5 = engineExceptionHandler;
            c232162.L$6 = interfaceC44082a;
            c232162.I$0 = i11;
            c232162.I$1 = 0;
            c232162.label = 3;
            obj = null;
            if (interfaceC44082a.mo91344d(null, c232162) != coroutine_suspended) {
                engineExceptionHandler2 = engineExceptionHandler;
                interfaceC44082a2 = interfaceC44082a;
                i12 = i11;
                loadBundleConfig = loadBundleConfigMock;
                reactInitParam4 = reactInitParam3;
                krnFcpTracker4 = krnFcpTracker6;
                i13 = 0;
                BundleLoader bundleLoader2 = INSTANCE;
                ReactInitParam reactInitParam8 = reactInitParam4;
                String baseBundleFilePath2 = loadBundleConfig.getBaseBundleFilePath();
                if (i12 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c232162.L$0 = SpillingKt.nullOutSpilledVariable(application2);
                c232162.L$1 = SpillingKt.nullOutSpilledVariable(reactInitParam8);
                c232162.L$2 = krnFcpTracker4;
                c232162.L$3 = SpillingKt.nullOutSpilledVariable(jSExceptionHandler2);
                c232162.L$4 = loadBundleConfig;
                c232162.L$5 = engineExceptionHandler2;
                c232162.L$6 = interfaceC44082a2;
                c232162.I$0 = i12;
                c232162.I$1 = i13;
                i14 = 0;
                c232162.I$2 = 0;
                c232162.label = 4;
                obj2 = null;
                objCreateReactInstance = bundleLoader2.createReactInstance(application2, baseBundleFilePath2, z11, engineExceptionHandler2, c232162);
                if (objCreateReactInstance != coroutine_suspended) {
                    krnFcpTracker5 = krnFcpTracker4;
                }
            }
            return coroutine_suspended;
        }
        if (i17 == 2) {
            j11 = c232162.J$0;
            int i19 = c232162.I$0;
            jSExceptionHandler3 = (JSExceptionHandler) c232162.L$3;
            KrnFcpTracker krnFcpTracker7 = (KrnFcpTracker) c232162.L$2;
            reactInitParam2 = (ReactInitParam) c232162.L$1;
            Application application5 = (Application) c232162.L$0;
            try {
                ResultKt.throwOnFailure(obj3);
                krnFcpTracker3 = krnFcpTracker7;
                objM57480T = obj3;
                i11 = i19;
                application3 = application5;
                try {
                    loadBundleConfig2 = (LoadBundleConfig) objM57480T;
                    if (krnFcpTracker3 != null) {
                        long jCurrentTimeMillis4 = System.currentTimeMillis() - j11;
                        String biz4 = reactInitParam2.getBiz();
                        String strM57542i2 = loadBundleConfig2.m57542i();
                        int iM57537d2 = loadBundleConfig2.m57537d();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(Constants.COMPONENT, reactInitParam2.getComponent());
                        strM57538e = loadBundleConfig2.m57538e();
                        if (strM57538e == null) {
                            str2 = "";
                        } else {
                            str2 = strM57538e;
                        }
                        jSONObject3.put("bundle_url", str2);
                        strM57535b = loadBundleConfig2.m57535b();
                        if (strM57535b == null) {
                            strM57535b = "";
                        }
                        jSONObject3.put("base_version", strM57535b);
                        jSONObject3.put("base_bundle_path", loadBundleConfig2.getBaseBundleFilePath());
                        Unit unit3 = Unit.INSTANCE;
                        KrnFcpTracker.reportFetchBundle$default(krnFcpTracker3, true, jCurrentTimeMillis4, biz4, strM57542i2, iM57537d2, null, jSONObject3.toString(), 32, null);
                    }
                    loadBundleConfigMock = (LoadBundleConfig) objM57480T;
                    reactInitParam3 = reactInitParam2;
                    krnFcpTracker6 = krnFcpTracker3;
                    jSExceptionHandler2 = jSExceptionHandler3;
                    application2 = application3;
                    if (krnFcpTracker6 != null) {
                        krnFcpTracker6.recordBundleConfig(loadBundleConfigMock.m57542i(), loadBundleConfigMock.m57535b(), loadBundleConfigMock.getBaseBundleFilePath(), loadBundleConfigMock.getChildBundleFilePath());
                    }
                    if (krnFcpTracker6 != null) {
                        krnFcpTracker6.setFetchBundleEnd(System.currentTimeMillis());
                    }
                    RnBreadcrumbs.INSTANCE.bundleConfig(reactInitParam3, loadBundleConfigMock);
                    if (krnFcpTracker6 != null) {
                        krnFcpTracker6.setLoadBaseBundleStart(System.currentTimeMillis());
                    }
                    C23985b.f47489a.m57877e("loadBundle", "新创建rn容器实例");
                    engineExceptionHandler = new EngineExceptionHandler(jSExceptionHandler2);
                    interfaceC44082a = instanceCreationMutex;
                    c232162.L$0 = application2;
                    c232162.L$1 = SpillingKt.nullOutSpilledVariable(reactInitParam3);
                    c232162.L$2 = krnFcpTracker6;
                    c232162.L$3 = SpillingKt.nullOutSpilledVariable(jSExceptionHandler2);
                    c232162.L$4 = loadBundleConfigMock;
                    c232162.L$5 = engineExceptionHandler;
                    c232162.L$6 = interfaceC44082a;
                    c232162.I$0 = i11;
                    c232162.I$1 = 0;
                    c232162.label = 3;
                    obj = null;
                    if (interfaceC44082a.mo91344d(null, c232162) != coroutine_suspended) {
                        engineExceptionHandler2 = engineExceptionHandler;
                        interfaceC44082a2 = interfaceC44082a;
                        i12 = i11;
                        loadBundleConfig = loadBundleConfigMock;
                        reactInitParam4 = reactInitParam3;
                        krnFcpTracker4 = krnFcpTracker6;
                        i13 = 0;
                        BundleLoader bundleLoader3 = INSTANCE;
                        ReactInitParam reactInitParam9 = reactInitParam4;
                        String baseBundleFilePath3 = loadBundleConfig.getBaseBundleFilePath();
                        if (i12 != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c232162.L$0 = SpillingKt.nullOutSpilledVariable(application2);
                        c232162.L$1 = SpillingKt.nullOutSpilledVariable(reactInitParam9);
                        c232162.L$2 = krnFcpTracker4;
                        c232162.L$3 = SpillingKt.nullOutSpilledVariable(jSExceptionHandler2);
                        c232162.L$4 = loadBundleConfig;
                        c232162.L$5 = engineExceptionHandler2;
                        c232162.L$6 = interfaceC44082a2;
                        c232162.I$0 = i12;
                        c232162.I$1 = i13;
                        i14 = 0;
                        c232162.I$2 = 0;
                        c232162.label = 4;
                        obj2 = null;
                        objCreateReactInstance = bundleLoader3.createReactInstance(application2, baseBundleFilePath3, z11, engineExceptionHandler2, c232162);
                        if (objCreateReactInstance != coroutine_suspended) {
                            krnFcpTracker5 = krnFcpTracker4;
                        }
                    }
                    return coroutine_suspended;
                } catch (TaskException e12) {
                    e = e12;
                    krnFcpTracker2 = krnFcpTracker3;
                    C23985b.m57873d(C23985b.f47489a, "loadBundle", "code: " + e.getCode() + ", message: " + e.getMessage(), null, 4, null);
                    if (krnFcpTracker2 != null) {
                        long jCurrentTimeMillis5 = System.currentTimeMillis() - j11;
                        String biz5 = reactInitParam2.getBiz();
                        String message3 = e.getMessage();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(Constants.COMPONENT, reactInitParam2.getComponent());
                        jSONObject4.put("task_code", e.getCode());
                        cause = e.getCause();
                        if (cause != null) {
                            str = cause.getClass().getSimpleName() + ": " + cause.getMessage();
                            if (str != null) {
                                str3 = str;
                            }
                        }
                        jSONObject4.put("cause", str3);
                        Unit unit4 = Unit.INSTANCE;
                        KrnFcpTracker.reportFetchBundle$default(krnFcpTracker2, false, jCurrentTimeMillis5, biz5, null, 0, message3, jSONObject4.toString(), 8, null);
                    }
                    if (e.getCode() == 1404) {
                        code = 400;
                    } else {
                        code = e.getCode();
                    }
                    message = e.getMessage();
                    if (message == null) {
                        message = reactInitParam2.getBiz() + " 找不到配置文件";
                    }
                    throw new ReactHostException(code, message);
                }
            } catch (TaskException e13) {
                e = e13;
                krnFcpTracker2 = krnFcpTracker7;
                C23985b.m57873d(C23985b.f47489a, "loadBundle", "code: " + e.getCode() + ", message: " + e.getMessage(), null, 4, null);
                if (krnFcpTracker2 != null) {
                    long jCurrentTimeMillis6 = System.currentTimeMillis() - j11;
                    String biz6 = reactInitParam2.getBiz();
                    String message4 = e.getMessage();
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(Constants.COMPONENT, reactInitParam2.getComponent());
                    jSONObject5.put("task_code", e.getCode());
                    cause = e.getCause();
                    if (cause != null) {
                        str = cause.getClass().getSimpleName() + ": " + cause.getMessage();
                        if (str != null) {
                            str3 = str;
                        }
                    }
                    jSONObject5.put("cause", str3);
                    Unit unit5 = Unit.INSTANCE;
                    KrnFcpTracker.reportFetchBundle$default(krnFcpTracker2, false, jCurrentTimeMillis6, biz6, null, 0, message4, jSONObject5.toString(), 8, null);
                }
                if (e.getCode() == 1404) {
                    code = 400;
                } else {
                    code = e.getCode();
                }
                message = e.getMessage();
                if (message == null) {
                    message = reactInitParam2.getBiz() + " 找不到配置文件";
                }
                throw new ReactHostException(code, message);
            }
        }
        if (i17 == 3) {
            int i21 = c232162.I$1;
            int i22 = c232162.I$0;
            InterfaceC44082a interfaceC44082a4 = (InterfaceC44082a) c232162.L$6;
            EngineExceptionHandler engineExceptionHandler3 = (EngineExceptionHandler) c232162.L$5;
            LoadBundleConfig loadBundleConfig3 = (LoadBundleConfig) c232162.L$4;
            jSExceptionHandler2 = (JSExceptionHandler) c232162.L$3;
            KrnFcpTracker krnFcpTracker8 = (KrnFcpTracker) c232162.L$2;
            ReactInitParam reactInitParam10 = (ReactInitParam) c232162.L$1;
            application2 = (Application) c232162.L$0;
            ResultKt.throwOnFailure(obj3);
            loadBundleConfig = loadBundleConfig3;
            reactInitParam4 = reactInitParam10;
            krnFcpTracker4 = krnFcpTracker8;
            engineExceptionHandler2 = engineExceptionHandler3;
            interfaceC44082a2 = interfaceC44082a4;
            i13 = i21;
            i12 = i22;
            obj = null;
            try {
                BundleLoader bundleLoader4 = INSTANCE;
                ReactInitParam reactInitParam11 = reactInitParam4;
                String baseBundleFilePath4 = loadBundleConfig.getBaseBundleFilePath();
                if (i12 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                try {
                    c232162.L$0 = SpillingKt.nullOutSpilledVariable(application2);
                    c232162.L$1 = SpillingKt.nullOutSpilledVariable(reactInitParam11);
                    c232162.L$2 = krnFcpTracker4;
                    c232162.L$3 = SpillingKt.nullOutSpilledVariable(jSExceptionHandler2);
                    c232162.L$4 = loadBundleConfig;
                    c232162.L$5 = engineExceptionHandler2;
                    c232162.L$6 = interfaceC44082a2;
                    c232162.I$0 = i12;
                    c232162.I$1 = i13;
                    i14 = 0;
                    c232162.I$2 = 0;
                    c232162.label = 4;
                    obj2 = null;
                    try {
                        objCreateReactInstance = bundleLoader4.createReactInstance(application2, baseBundleFilePath4, z11, engineExceptionHandler2, c232162);
                        if (objCreateReactInstance != coroutine_suspended) {
                            krnFcpTracker5 = krnFcpTracker4;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC44082a3 = interfaceC44082a2;
                        interfaceC44082a3.mo91345e(obj2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj2 = null;
                    interfaceC44082a3 = interfaceC44082a2;
                    interfaceC44082a3.mo91345e(obj2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                obj2 = obj;
            }
        } else {
            if (i17 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = c232162.I$0;
            interfaceC44082a3 = (InterfaceC44082a) c232162.L$6;
            EngineExceptionHandler engineExceptionHandler4 = (EngineExceptionHandler) c232162.L$5;
            LoadBundleConfig loadBundleConfig4 = (LoadBundleConfig) c232162.L$4;
            krnFcpTracker5 = (KrnFcpTracker) c232162.L$2;
            try {
                ResultKt.throwOnFailure(obj3);
                engineExceptionHandler2 = engineExceptionHandler4;
                objCreateReactInstance = obj3;
                obj2 = null;
                loadBundleConfig = loadBundleConfig4;
                interfaceC44082a2 = interfaceC44082a3;
                i14 = 0;
            } catch (Throwable th5) {
                th = th5;
                obj2 = null;
            }
        }
        ReactInstanceManager reactInstanceManager2 = (ReactInstanceManager) objCreateReactInstance;
        interfaceC44082a2.mo91345e(obj2);
        if (krnFcpTracker5 != null) {
            krnFcpTracker5.setLoadBaseBundleEnd(System.currentTimeMillis());
        }
        RNInstanceManagerHolder.INSTANCE.setCurrentInstanceManager(reactInstanceManager2);
        if (i12 == 0) {
            BundleManager.f47277a.m57487b0(loadBundleConfig);
        }
        if (loadBundleConfig.getFromRemote()) {
            i15 = 2;
        } else {
            i15 = i14;
        }
        return new SplitBundleLoader(reactInstanceManager2, i15, loadBundleConfig, engineExceptionHandler2);
        interfaceC44082a3.mo91345e(obj2);
        throw th;
    }

    private BundleLoader() {
    }

    private final boolean isLocalServerDebug(ReactInitParam reactInitParam) {
        Object obj;
        Bundle customParameters = reactInitParam.getCustomParameters();
        if (customParameters != null) {
            obj = customParameters.get(RnMetroConfigManager.LOCAL_SERVER_DEBUG_KEY);
        } else {
            obj = null;
        }
        if (Intrinsics.areEqual(obj, Boolean.TRUE) || Intrinsics.areEqual(obj, CredentialEntry.TRUE_STRING)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isMetroRunning(Application application, Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new C232152(application, null), continuation);
    }

    @Nullable
    public final Object createReactInstance(@NotNull Application application, @NotNull String str, boolean z11, @NotNull EngineExceptionHandler engineExceptionHandler, @NotNull Continuation<? super ReactInstanceManager> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new C232143(application, str, engineExceptionHandler, z11, null), continuation);
    }

    @Nullable
    public final Object prepare(@NotNull Application application, @NotNull Continuation<? super Unit> continuation) {
        if (MviExKt.m42517m()) {
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
