package com.kubi.p110rn.core;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RNEventDispatcher.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fJ\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/core/RNEventDispatcher;", "", "<init>", "()V", "TAG", "", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "emitOpenRoute", "", "route", ReportDataTable.COLUMN_PARAMS, "", "emitEvent", "eventName", "data", "directEmitEvent", "Lcom/facebook/react/bridge/WritableMap;", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUsableInstance", "", "instanceManager", "Lcom/facebook/react/ReactInstanceManager;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "onDestroy", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RNEventDispatcher {

    @NotNull
    private static final String TAG = "RNEventDispatcher";

    @NotNull
    public static final RNEventDispatcher INSTANCE = new RNEventDispatcher();

    @NotNull
    private static final InterfaceC41709m0 mainScope = C41713n0.m91126b();

    /* JADX INFO: renamed from: com.kubi.rn.core.RNEventDispatcher$directEmitEvent$2 */
    /* JADX INFO: compiled from: RNEventDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.RNEventDispatcher$directEmitEvent$2", m90122f = "RNEventDispatcher.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C232182 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ WritableMap $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C232182(String str, WritableMap writableMap, Continuation<? super C232182> continuation) {
            super(2, continuation);
            this.$eventName = str;
            this.$params = writableMap;
        }

        /* JADX INFO: renamed from: f */
        public static final void m55700f(ReactContext reactContext, ReactInstanceManager reactInstanceManager, String str, WritableMap writableMap) {
            Object objM103844constructorimpl;
            ReactInstanceManager currentInstanceManager = RNInstanceManagerHolder.INSTANCE.getCurrentInstanceManager();
            if (!RNEventDispatcher.INSTANCE.isUsableInstance(currentInstanceManager, reactContext) || currentInstanceManager != reactInstanceManager) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("directEmitEvent skipped in JS queue: eventName=");
                sb2.append(str);
                sb2.append(" expected=");
                sb2.append(reactInstanceManager != null ? Integer.valueOf(reactInstanceManager.hashCode()) : null);
                sb2.append(" latest=");
                sb2.append(currentInstanceManager != null ? Integer.valueOf(currentInstanceManager.hashCode()) : null);
                C44128b.m97266j(RNEventDispatcher.TAG, sb2.toString());
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97266j(RNEventDispatcher.TAG, "directEmitEvent failed: eventName=" + str + " error=" + thM103847exceptionOrNullimpl.getMessage());
            }
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232182(this.$eventName, this.$params, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C232182) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ReactContext currentReactContext;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                final ReactInstanceManager currentInstanceManager = RNInstanceManagerHolder.INSTANCE.getCurrentInstanceManager();
                if (currentInstanceManager != null) {
                    currentReactContext = currentInstanceManager.getCurrentReactContext();
                } else {
                    currentReactContext = null;
                }
                if (RNEventDispatcher.INSTANCE.isUsableInstance(currentInstanceManager, currentReactContext)) {
                    if (currentReactContext == null) {
                        return Unit.INSTANCE;
                    }
                    final String str = this.$eventName;
                    final WritableMap writableMap = this.$params;
                    Boxing.boxBoolean(currentReactContext.runOnJSQueueThread(new Runnable() { // from class: com.kubi.rn.core.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            RNEventDispatcher.C232182.m55700f(currentReactContext, currentInstanceManager, str, writableMap);
                        }
                    }));
                } else {
                    C44128b.m97266j(RNEventDispatcher.TAG, "directEmitEvent skipped: eventName=" + this.$eventName + " reactContext is null or no active instance");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.RNEventDispatcher$emitEvent$1 */
    /* JADX INFO: compiled from: RNEventDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.RNEventDispatcher$emitEvent$1", m90122f = "RNEventDispatcher.kt", m90123i = {0, 0, 0}, m90124l = {60}, m90125m = "invokeSuspend", m90126n = {"instanceManager", "reactContext", ReportDataTable.COLUMN_PARAMS}, m90127s = {"L$0", "L$1", "L$2"})
    public static final class C232191 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $data;
        final /* synthetic */ String $eventName;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C232191(String str, String str2, Continuation<? super C232191> continuation) {
            super(2, continuation);
            this.$eventName = str;
            this.$data = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232191(this.$eventName, this.$data, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C232191) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReactContext currentReactContext;
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
                ReactInstanceManager currentInstanceManager = RNInstanceManagerHolder.INSTANCE.getCurrentInstanceManager();
                Integer numBoxInt = null;
                if (currentInstanceManager != null) {
                    currentReactContext = currentInstanceManager.getCurrentReactContext();
                } else {
                    currentReactContext = null;
                }
                RNEventDispatcher rNEventDispatcher = RNEventDispatcher.INSTANCE;
                if (rNEventDispatcher.isUsableInstance(currentInstanceManager, currentReactContext)) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    String str = this.$data;
                    if (str == null) {
                        str = "";
                    }
                    writableMapCreateMap.putString("data", str);
                    String str2 = this.$eventName;
                    Intrinsics.checkNotNull(writableMapCreateMap);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(currentInstanceManager);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(currentReactContext);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(writableMapCreateMap);
                    this.label = 1;
                    if (rNEventDispatcher.directEmitEvent(str2, writableMapCreateMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("emitEvent skipped: eventName=");
                    sb2.append(this.$eventName);
                    sb2.append(" manager=");
                    if (currentInstanceManager != null) {
                        numBoxInt = Boxing.boxInt(currentInstanceManager.hashCode());
                    }
                    sb2.append(numBoxInt);
                    C44128b.m97266j(RNEventDispatcher.TAG, sb2.toString());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.core.RNEventDispatcher$emitOpenRoute$1 */
    /* JADX INFO: compiled from: RNEventDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.core.RNEventDispatcher$emitOpenRoute$1", m90122f = "RNEventDispatcher.kt", m90123i = {0, 0, 0}, m90124l = {39}, m90125m = "invokeSuspend", m90126n = {"instanceManager", "reactContext", "content"}, m90127s = {"L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nRNEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNEventDispatcher.kt\ncom/kubi/rn/core/RNEventDispatcher$emitOpenRoute$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
    public static final class C232201 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $params;
        final /* synthetic */ String $route;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C232201(String str, Map<String, ? extends Object> map, Continuation<? super C232201> continuation) {
            super(2, continuation);
            this.$route = str;
            this.$params = map;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C232201(this.$route, this.$params, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C232201) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReactContext currentReactContext;
            boolean z11;
            ReadableMap readableMapCreateMap;
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
                RNInstanceManagerHolder rNInstanceManagerHolder = RNInstanceManagerHolder.INSTANCE;
                ReactInstanceManager currentInstanceManager = rNInstanceManagerHolder.getCurrentInstanceManager();
                Integer numBoxInt = null;
                if (currentInstanceManager != null) {
                    currentReactContext = currentInstanceManager.getCurrentReactContext();
                } else {
                    currentReactContext = null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("emitOpenRoute: manager=");
                if (currentInstanceManager != null) {
                    numBoxInt = Boxing.boxInt(currentInstanceManager.hashCode());
                }
                sb2.append(numBoxInt);
                sb2.append(" alive=");
                sb2.append(rNInstanceManagerHolder.isAliveInstance(currentInstanceManager));
                sb2.append(" contextOk=");
                if (currentReactContext != null && currentReactContext.hasActiveReactInstance()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sb2.append(z11);
                C44128b.m97266j(RNEventDispatcher.TAG, sb2.toString());
                RNEventDispatcher rNEventDispatcher = RNEventDispatcher.INSTANCE;
                if (rNEventDispatcher.isUsableInstance(currentInstanceManager, currentReactContext)) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    String str = this.$route;
                    Map<String, Object> map = this.$params;
                    writableMapCreateMap.putString("route", str);
                    if (map == null || (readableMapCreateMap = Arguments.makeNativeMap(map)) == null) {
                        readableMapCreateMap = Arguments.createMap();
                    }
                    writableMapCreateMap.putMap(ReportDataTable.COLUMN_PARAMS, readableMapCreateMap);
                    C44128b.m97266j(RNEventDispatcher.TAG, "from RouteUtil, emitOpenRoute, content = " + writableMapCreateMap);
                    Intrinsics.checkNotNull(writableMapCreateMap);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(currentInstanceManager);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(currentReactContext);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(writableMapCreateMap);
                    this.label = 1;
                    if (rNEventDispatcher.directEmitEvent(RNRouteEmitterModule.EVENT_OPEN_ROUTE, writableMapCreateMap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    C44128b.m97266j(RNEventDispatcher.TAG, "from RouteUtil, emitOpenRoute skipped: reactContext is null or no active instance");
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void emitEvent$default(RNEventDispatcher rNEventDispatcher, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        rNEventDispatcher.emitEvent(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void emitOpenRoute$default(RNEventDispatcher rNEventDispatcher, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        rNEventDispatcher.emitOpenRoute(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUsableInstance(ReactInstanceManager instanceManager, ReactContext reactContext) {
        return RNInstanceManagerHolder.INSTANCE.isAliveInstance(instanceManager) && reactContext != null && reactContext.hasActiveReactInstance();
    }

    public final void emitEvent(@NotNull String eventName, @Nullable String data) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C41696j.m91104d(mainScope, null, null, new C232191(eventName, data, null), 3, null);
    }

    public final void emitOpenRoute(@NotNull String route, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(route, "route");
        C44128b.m97266j(TAG, "from RouteUtil, emitOpenRoute: begin");
        C41696j.m91104d(mainScope, null, null, new C232201(route, params, null), 3, null);
    }

    public final void onDestroy() {
        C41713n0.m91129e(mainScope, null, 1, null);
    }

    private RNEventDispatcher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object directEmitEvent(String str, WritableMap writableMap, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C41782z0.m91393c(), new C232182(str, writableMap, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
