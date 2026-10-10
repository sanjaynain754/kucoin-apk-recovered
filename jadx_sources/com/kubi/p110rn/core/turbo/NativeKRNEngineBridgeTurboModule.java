package com.kubi.p110rn.core.turbo;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.api.error.KRNContainerDelegate;
import com.kubi.p110rn.api.error.KRNContainerDelegateRegistry;
import com.kubi.p110rn.core.KrnFcpTracker;
import com.kubi.p110rn.core.KrnFcpTrackerRegistry;
import com.kubi.p110rn.core.pageopen.KrnPageOpenBridgeHandler;
import com.kubi.p110rn.core.pageopen.KrnPageOpenBridgeResult;
import com.kubi.p110rn.core.pageopen.KrnPageOpenEventHandler;
import com.kubi.p110rn.core.pageopen.KrnPageOpenRegistry;
import com.kubi.sdk.pkg.bundle.BundleManager;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.InterfaceC41781z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: NativeKRNEngineBridgeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002J\u001c\u0010\"\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0002J\u001c\u0010&\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u001c\u0010'\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeKRNEngineBridgeTurboModule;", "Lcom/kubi/rn/core/turbo/NativeKRNEngineBridgeSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "pageOpenEventHandler", "Lcom/kubi/rn/core/pageopen/KrnPageOpenEventHandler;", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/pageopen/KrnPageOpenEventHandler;)V", "moduleJob", "Lkotlinx/coroutines/CompletableJob;", "pageOpenOwnerToken", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getName", "", "invalidate", "", "callNative", "name", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "handleGetBundleList", "buildReleaseBundleList", "Lcom/facebook/react/bridge/WritableMap;", "context", "Landroid/content/Context;", "handleLifecycleRender", "recordPageOpenRenderReady", "rootTag", "", "handleLifecycleDataReady", "buildPageOpenAck", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;", "handleFetchChunk", "handleLoadChunk", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeKRNEngineBridgeTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeKRNEngineBridgeTurboModule.kt\ncom/kubi/rn/core/turbo/NativeKRNEngineBridgeTurboModule\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n47#2,4:299\n216#3:303\n216#3:304\n217#3:307\n217#3:308\n1869#4,2:305\n1#5:309\n*S KotlinDebug\n*F\n+ 1 NativeKRNEngineBridgeTurboModule.kt\ncom/kubi/rn/core/turbo/NativeKRNEngineBridgeTurboModule\n*L\n53#1:299,4\n140#1:303\n142#1:304\n142#1:307\n140#1:308\n144#1:305,2\n*E\n"})
public final class NativeKRNEngineBridgeTurboModule extends NativeKRNEngineBridgeSpec {

    @NotNull
    private static final String EVENT_FETCH_CHUNK = "KRN_FETCH_CHUNK";

    @NotNull
    private static final String EVENT_LIFECYCLE_DATA_READY = "KRN_LIFECYCLE_DATA_READY";

    @NotNull
    private static final String EVENT_LIFECYCLE_RENDER = "KRN_LIFECYCLE_RENDER";

    @NotNull
    private static final String EVENT_LOAD_CHUNK = "KRN_LOAD_CHUNK";

    @NotNull
    private static final String KRN_PANEL_GET_BUNDLE_LIST = "KRN_PANEL_GET_BUNDLE_LIST";

    @NotNull
    public static final String NAME = "KRNEngineBridge";

    @NotNull
    private static final String PARAM_PATH = "path";

    @NotNull
    private static final String PARAM_ROOT_TAG = "RootTag";

    @NotNull
    private static final String PARAM_SUBPACKAGES = "subpackages";

    @NotNull
    private static final String PARAM_SUB_PACKAGE_NAME = "SubPackageName";

    @NotNull
    private static final String TAG = "KRNEngineBridge";

    @NotNull
    private final InterfaceC41781z moduleJob;

    @NotNull
    private KrnPageOpenEventHandler pageOpenEventHandler;

    @NotNull
    private final Object pageOpenOwnerToken;

    @NotNull
    private final InterfaceC41709m0 scope;

    /* JADX INFO: renamed from: com.kubi.rn.core.turbo.NativeKRNEngineBridgeTurboModule$handleFetchChunk$1 */
    /* JADX INFO: compiled from: NativeKRNEngineBridgeTurboModule.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.turbo.NativeKRNEngineBridgeTurboModule$handleFetchChunk$1", m90122f = "NativeKRNEngineBridgeTurboModule.kt", m90123i = {}, m90124l = {231}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C233431 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $subPackageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C233431(String str, Context context, Promise promise, Continuation<? super C233431> continuation) {
            super(2, continuation);
            this.$subPackageName = str;
            this.$appContext = context;
            this.$promise = promise;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C233431(this.$subPackageName, this.$appContext, this.$promise, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C233431) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C44128b.m97259c("KRNEngineBridge", "handleFetchChunk: downloading subPackage=" + this.$subPackageName);
                    BundleManager bundleManager = BundleManager.f47277a;
                    Context context = this.$appContext;
                    Intrinsics.checkNotNull(context);
                    String str = this.$subPackageName;
                    this.label = 1;
                    obj = bundleManager.m57471D(context, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                TaskStatus taskStatus = (TaskStatus) obj;
                if (taskStatus.m57807h()) {
                    C44128b.m97259c("KRNEngineBridge", "handleFetchChunk: download success subPackage=" + this.$subPackageName);
                    Promise promise = this.$promise;
                    if (promise != null) {
                        promise.resolve(null);
                    }
                } else {
                    C44128b.m97270n("KRNEngineBridge", "handleFetchChunk: download failed subPackage=" + this.$subPackageName + " code=" + taskStatus.getCode());
                    Promise promise2 = this.$promise;
                    if (promise2 != null) {
                        promise2.reject("fetch_chunk_failed", "下载分包失败: " + this.$subPackageName + ", code=" + taskStatus.getCode() + ", msg=" + taskStatus.getMessage());
                    }
                }
            } catch (Exception e11) {
                C44128b.m97270n("KRNEngineBridge", "handleFetchChunk: exception subPackage=" + this.$subPackageName + " msg=" + e11.getMessage());
                Promise promise3 = this.$promise;
                if (promise3 != null) {
                    promise3.reject("fetch_chunk_error", e11.getMessage(), e11);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.turbo.NativeKRNEngineBridgeTurboModule$handleGetBundleList$1 */
    /* JADX INFO: compiled from: NativeKRNEngineBridgeTurboModule.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.turbo.NativeKRNEngineBridgeTurboModule$handleGetBundleList$1", m90122f = "NativeKRNEngineBridgeTurboModule.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C233441 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C233441(Context context, Promise promise, Continuation<? super C233441> continuation) {
            super(2, continuation);
            this.$appContext = context;
            this.$promise = promise;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NativeKRNEngineBridgeTurboModule.this.new C233441(this.$appContext, this.$promise, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C233441) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    NativeKRNEngineBridgeTurboModule nativeKRNEngineBridgeTurboModule = NativeKRNEngineBridgeTurboModule.this;
                    Context context = this.$appContext;
                    Intrinsics.checkNotNull(context);
                    this.$promise.resolve(nativeKRNEngineBridgeTurboModule.buildReleaseBundleList(context));
                } catch (Exception e11) {
                    C44128b.m97270n("KRNEngineBridge", "KRN_PANEL_GET_BUNDLE_LIST: exception=" + e11.getMessage());
                    this.$promise.reject("get_bundle_list_error", e11.getMessage(), e11);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.turbo.NativeKRNEngineBridgeTurboModule$handleLoadChunk$1 */
    /* JADX INFO: compiled from: NativeKRNEngineBridgeTurboModule.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.turbo.NativeKRNEngineBridgeTurboModule$handleLoadChunk$1", m90122f = "NativeKRNEngineBridgeTurboModule.kt", m90123i = {}, m90124l = {264}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C233451 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $subPackageName;
        int label;
        final /* synthetic */ NativeKRNEngineBridgeTurboModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C233451(Context context, String str, Promise promise, NativeKRNEngineBridgeTurboModule nativeKRNEngineBridgeTurboModule, Continuation<? super C233451> continuation) {
            super(2, continuation);
            this.$appContext = context;
            this.$subPackageName = str;
            this.$promise = promise;
            this.this$0 = nativeKRNEngineBridgeTurboModule;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C233451(this.$appContext, this.$subPackageName, this.$promise, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C233451) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00c4 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:5:0x000f, B:17:0x0056, B:19:0x005e, B:21:0x0084, B:22:0x00b2, B:24:0x00b5, B:26:0x00c4, B:28:0x00de, B:29:0x00f4, B:31:0x00f7, B:33:0x0121, B:35:0x013b, B:36:0x0151, B:38:0x0154, B:40:0x0172, B:12:0x0021, B:14:0x0030), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:28:0x00de A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:5:0x000f, B:17:0x0056, B:19:0x005e, B:21:0x0084, B:22:0x00b2, B:24:0x00b5, B:26:0x00c4, B:28:0x00de, B:29:0x00f4, B:31:0x00f7, B:33:0x0121, B:35:0x013b, B:36:0x0151, B:38:0x0154, B:40:0x0172, B:12:0x0021, B:14:0x0030), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00f7 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:5:0x000f, B:17:0x0056, B:19:0x005e, B:21:0x0084, B:22:0x00b2, B:24:0x00b5, B:26:0x00c4, B:28:0x00de, B:29:0x00f4, B:31:0x00f7, B:33:0x0121, B:35:0x013b, B:36:0x0151, B:38:0x0154, B:40:0x0172, B:12:0x0021, B:14:0x0030), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0121 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:5:0x000f, B:17:0x0056, B:19:0x005e, B:21:0x0084, B:22:0x00b2, B:24:0x00b5, B:26:0x00c4, B:28:0x00de, B:29:0x00f4, B:31:0x00f7, B:33:0x0121, B:35:0x013b, B:36:0x0151, B:38:0x0154, B:40:0x0172, B:12:0x0021, B:14:0x0030), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:35:0x013b A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:5:0x000f, B:17:0x0056, B:19:0x005e, B:21:0x0084, B:22:0x00b2, B:24:0x00b5, B:26:0x00c4, B:28:0x00de, B:29:0x00f4, B:31:0x00f7, B:33:0x0121, B:35:0x013b, B:36:0x0151, B:38:0x0154, B:40:0x0172, B:12:0x0021, B:14:0x0030), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0154 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:5:0x000f, B:17:0x0056, B:19:0x005e, B:21:0x0084, B:22:0x00b2, B:24:0x00b5, B:26:0x00c4, B:28:0x00de, B:29:0x00f4, B:31:0x00f7, B:33:0x0121, B:35:0x013b, B:36:0x0151, B:38:0x0154, B:40:0x0172, B:12:0x0021, B:14:0x0030), top: B:47:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0172 A[Catch: Exception -> 0x0013, TRY_LEAVE, TryCatch #0 {Exception -> 0x0013, blocks: (B:5:0x000f, B:17:0x0056, B:19:0x005e, B:21:0x0084, B:22:0x00b2, B:24:0x00b5, B:26:0x00c4, B:28:0x00de, B:29:0x00f4, B:31:0x00f7, B:33:0x0121, B:35:0x013b, B:36:0x0151, B:38:0x0154, B:40:0x0172, B:12:0x0021, B:14:0x0030), top: B:47:0x000b }] */
        /* JADX WARN: Instruction removed from duplicated block: B:26:0x00c4, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:28:0x00de, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:31:0x00f7, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:33:0x0121, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x013b, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:38:0x0154, please report this as an issue */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strM57476P;
            CatalystInstance catalystInstance;
            Promise promise;
            Promise promise2;
            Promise promise3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    BundleManager bundleManager = BundleManager.f47277a;
                    Context context = this.$appContext;
                    Intrinsics.checkNotNull(context);
                    if (!bundleManager.m57478R(context, this.$subPackageName)) {
                        C44128b.m97259c("KRNEngineBridge", "handleLoadChunk: subPackage not downloaded, fetching: " + this.$subPackageName);
                        Context context2 = this.$appContext;
                        Intrinsics.checkNotNull(context2);
                        String str = this.$subPackageName;
                        this.label = 1;
                        obj = bundleManager.m57471D(context2, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        BundleManager bundleManager2 = BundleManager.f47277a;
                        Context context3 = this.$appContext;
                        Intrinsics.checkNotNull(context3);
                        strM57476P = bundleManager2.m57476P(context3, this.$subPackageName);
                        if (strM57476P == null) {
                            C44128b.m97270n("KRNEngineBridge", "handleLoadChunk: bundle file not found after download: " + this.$subPackageName);
                            promise3 = this.$promise;
                            if (promise3 != null) {
                                promise3.reject("load_chunk_failed", "分包文件不存在: " + this.$subPackageName);
                            }
                            return Unit.INSTANCE;
                        }
                        C44128b.m97259c("KRNEngineBridge", "handleLoadChunk: loading subPackage=" + this.$subPackageName + " path=" + strM57476P);
                        catalystInstance = this.this$0.getReactApplicationContext().getCatalystInstance();
                        if (catalystInstance == null) {
                            C44128b.m97270n("KRNEngineBridge", "handleLoadChunk: catalystInstance is null, cannot load subPackage=" + this.$subPackageName);
                            promise2 = this.$promise;
                            if (promise2 != null) {
                                promise2.reject("load_chunk_failed", "RN 上下文不可用，无法加载分包: " + this.$subPackageName);
                            }
                            return Unit.INSTANCE;
                        }
                        catalystInstance.loadScriptFromFile(strM57476P, strM57476P, false);
                        C44128b.m97259c("KRNEngineBridge", "handleLoadChunk: loadScriptFromFile dispatched for subPackage=" + this.$subPackageName);
                        promise = this.$promise;
                        if (promise != null) {
                            promise.resolve(null);
                        }
                    }
                    return Unit.INSTANCE;
                }
                TaskStatus taskStatus = (TaskStatus) obj;
                if (!taskStatus.m57807h()) {
                    C44128b.m97270n("KRNEngineBridge", "handleLoadChunk: download failed subPackage=" + this.$subPackageName + " code=" + taskStatus.getCode());
                    Promise promise4 = this.$promise;
                    if (promise4 != null) {
                        promise4.reject("load_chunk_failed", "下载分包失败: " + this.$subPackageName + ", code=" + taskStatus.getCode() + ", msg=" + taskStatus.getMessage());
                    }
                    return Unit.INSTANCE;
                }
                BundleManager bundleManager3 = BundleManager.f47277a;
                Context context4 = this.$appContext;
                Intrinsics.checkNotNull(context4);
                strM57476P = bundleManager3.m57476P(context4, this.$subPackageName);
                if (strM57476P == null) {
                    C44128b.m97270n("KRNEngineBridge", "handleLoadChunk: bundle file not found after download: " + this.$subPackageName);
                    promise3 = this.$promise;
                    if (promise3 != null) {
                        promise3.reject("load_chunk_failed", "分包文件不存在: " + this.$subPackageName);
                    }
                    return Unit.INSTANCE;
                }
                C44128b.m97259c("KRNEngineBridge", "handleLoadChunk: loading subPackage=" + this.$subPackageName + " path=" + strM57476P);
                catalystInstance = this.this$0.getReactApplicationContext().getCatalystInstance();
                if (catalystInstance == null) {
                    C44128b.m97270n("KRNEngineBridge", "handleLoadChunk: catalystInstance is null, cannot load subPackage=" + this.$subPackageName);
                    promise2 = this.$promise;
                    if (promise2 != null) {
                        promise2.reject("load_chunk_failed", "RN 上下文不可用，无法加载分包: " + this.$subPackageName);
                    }
                    return Unit.INSTANCE;
                }
                catalystInstance.loadScriptFromFile(strM57476P, strM57476P, false);
                C44128b.m97259c("KRNEngineBridge", "handleLoadChunk: loadScriptFromFile dispatched for subPackage=" + this.$subPackageName);
                promise = this.$promise;
                if (promise != null) {
                    promise.resolve(null);
                }
                return Unit.INSTANCE;
            } catch (Exception e11) {
                C44128b.m97270n("KRNEngineBridge", "handleLoadChunk: exception subPackage=" + this.$subPackageName + " msg=" + e11.getMessage());
                Promise promise5 = this.$promise;
                if (promise5 != null) {
                    promise5.reject("load_chunk_error", e11.getMessage(), e11);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeKRNEngineBridgeTurboModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        InterfaceC41781z interfaceC41781zM91192b = C41727q2.m91192b(null, 1, null);
        this.moduleJob = interfaceC41781zM91192b;
        this.pageOpenOwnerToken = reactContext;
        this.pageOpenEventHandler = new KrnPageOpenBridgeHandler(reactContext, null, null, 6, null);
        this.scope = C41713n0.m91125a(C41782z0.m91392b().plus(interfaceC41781zM91192b).plus(new C23346x147420e3(CoroutineExceptionHandler.INSTANCE)));
    }

    private final void handleFetchChunk(ReadableMap params, Promise promise) {
        String string = params != null ? params.getString(PARAM_SUB_PACKAGE_NAME) : null;
        if (string != null && string.length() != 0) {
            C41696j.m91104d(this.scope, null, null, new C233431(string, getReactApplicationContext().getApplicationContext(), promise, null), 3, null);
            return;
        }
        C44128b.m97270n("KRNEngineBridge", "KRN_FETCH_CHUNK: missing SubPackageName in params");
        if (promise != null) {
            promise.reject("invalid_params", "KRN_FETCH_CHUNK: SubPackageName is required");
        }
    }

    private final void handleGetBundleList(Promise promise) {
        if (promise == null) {
            return;
        }
        C41696j.m91104d(this.scope, null, null, new C233441(getReactApplicationContext().getApplicationContext(), promise, null), 3, null);
    }

    private final void handleLifecycleDataReady(ReadableMap params, Promise promise) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(this.pageOpenEventHandler.handle(params));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n("KRNEngineBridge", "PageOpen data ready handling failed");
            objM103844constructorimpl = KrnPageOpenBridgeResult.INSTANCE.rejected("internal_error");
        }
        KrnPageOpenBridgeResult krnPageOpenBridgeResult = (KrnPageOpenBridgeResult) objM103844constructorimpl;
        if (!krnPageOpenBridgeResult.getAccepted()) {
            C44128b.m97270n("KRNEngineBridge", "PageOpen data ready event ignored, code=" + krnPageOpenBridgeResult.getCode());
        }
        if (promise != null) {
            promise.resolve(buildPageOpenAck(krnPageOpenBridgeResult));
        }
    }

    private final void handleLifecycleRender(ReadableMap params) throws JSONException {
        Unit unit;
        if (params == null) {
            C44128b.m97270n("KRNEngineBridge", "KRN_LIFECYCLE_RENDER: missing RootTag in params");
            return;
        }
        int i11 = params.getInt(PARAM_ROOT_TAG);
        KrnFcpTracker krnFcpTrackerFind = KrnFcpTrackerRegistry.INSTANCE.find(i11);
        if (krnFcpTrackerFind == null) {
            recordPageOpenRenderReady(i11);
            C44128b.m97270n("KRNEngineBridge", "KRN_LIFECYCLE_RENDER: no tracker found for rootTag=" + i11);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        krnFcpTrackerFind.setPageRenderEnd(jCurrentTimeMillis);
        krnFcpTrackerFind.setPageFirstRenderStart(jCurrentTimeMillis);
        recordPageOpenRenderReady(i11);
        KrnFcpTracker.reportLoadResult$default(krnFcpTrackerFind, true, null, null, 6, null);
        krnFcpTrackerFind.reportFcp();
        try {
            Result.Companion companion = Result.INSTANCE;
            KRNContainerDelegate kRNContainerDelegate = KRNContainerDelegateRegistry.INSTANCE.get(i11);
            if (kRNContainerDelegate != null) {
                kRNContainerDelegate.didSuccess();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        KrnFcpTrackerRegistry.INSTANCE.unregister(i11);
    }

    private final void handleLoadChunk(ReadableMap params, Promise promise) {
        String string = params != null ? params.getString(PARAM_SUB_PACKAGE_NAME) : null;
        if (string != null && string.length() != 0) {
            C41696j.m91104d(this.scope, null, null, new C233451(getReactApplicationContext().getApplicationContext(), string, promise, this, null), 3, null);
            return;
        }
        C44128b.m97270n("KRNEngineBridge", "KRN_LOAD_CHUNK: missing SubPackageName in params");
        if (promise != null) {
            promise.reject("invalid_params", "KRN_LOAD_CHUNK: SubPackageName is required");
        }
    }

    private final void recordPageOpenRenderReady(int rootTag) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(KrnPageOpenRegistry.INSTANCE.recordRenderReady(rootTag, this.pageOpenOwnerToken)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97270n("KRNEngineBridge", "PageOpen render ready processing failed");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.kubi.p110rn.core.turbo.NativeKRNEngineBridgeSpec
    public void callNative(@NotNull String name, @Nullable ReadableMap params, @Nullable Promise promise) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.areEqual(name, EVENT_LIFECYCLE_DATA_READY)) {
            C44128b.m97259c("KRNEngineBridge", "callNative name=" + name);
        } else {
            C44128b.m97259c("KRNEngineBridge", "callNative name=" + name + " params=" + params);
        }
        switch (name.hashCode()) {
            case -2061540052:
                if (name.equals(EVENT_LOAD_CHUNK)) {
                    handleLoadChunk(params, promise);
                    return;
                }
                break;
            case 512872432:
                if (name.equals(EVENT_FETCH_CHUNK)) {
                    handleFetchChunk(params, promise);
                    return;
                }
                break;
            case 517454243:
                if (name.equals(EVENT_LIFECYCLE_RENDER)) {
                    try {
                        handleLifecycleRender(params);
                        if (promise != null) {
                            promise.resolve(null);
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        if (promise != null) {
                            promise.reject("callNative_error", e11.getMessage(), e11);
                            Unit unit2 = Unit.INSTANCE;
                            return;
                        }
                        return;
                    }
                }
                break;
            case 1665727035:
                if (name.equals(EVENT_LIFECYCLE_DATA_READY)) {
                    handleLifecycleDataReady(params, promise);
                    return;
                }
                break;
            case 1679258591:
                if (name.equals(KRN_PANEL_GET_BUNDLE_LIST)) {
                    handleGetBundleList(promise);
                    return;
                }
                break;
        }
        C44128b.m97270n("KRNEngineBridge", "callNative: unhandled event name=" + name);
        if (promise != null) {
            promise.resolve(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEngineBridgeSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KRNEngineBridge";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        InterfaceC41775x1.a.m91377a(this.moduleJob, null, 1, null);
        super.invalidate();
    }

    private final WritableMap buildPageOpenAck(KrnPageOpenBridgeResult result) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("supported", true);
        writableMapCreateMap.putBoolean("accepted", result.getAccepted());
        String pageTraceId = result.getPageTraceId();
        if (pageTraceId != null) {
            writableMapCreateMap.putString("pageTraceId", pageTraceId);
        }
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap buildReleaseBundleList(Context context) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, Map<String, List<String>>> entry : BundleManager.f47277a.m57475L(context).entrySet()) {
            String key = entry.getKey();
            Map<String, List<String>> value = entry.getValue();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            for (Map.Entry<String, List<String>> entry2 : value.entrySet()) {
                String key2 = entry2.getKey();
                List<String> value2 = entry2.getValue();
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                Iterator<T> it = value2.iterator();
                while (it.hasNext()) {
                    writableMapCreateMap3.putMap((String) it.next(), Arguments.createMap());
                }
                WritableMap writableMapCreateMap4 = Arguments.createMap();
                writableMapCreateMap4.putMap(PARAM_SUBPACKAGES, writableMapCreateMap3);
                Unit unit = Unit.INSTANCE;
                writableMapCreateMap2.putMap(key2, writableMapCreateMap4);
            }
            writableMapCreateMap.putMap(key, writableMapCreateMap2);
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeKRNEngineBridgeTurboModule(@NotNull ReactApplicationContext reactContext, @NotNull KrnPageOpenEventHandler pageOpenEventHandler) {
        this(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(pageOpenEventHandler, "pageOpenEventHandler");
        this.pageOpenEventHandler = pageOpenEventHandler;
    }
}
