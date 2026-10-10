package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.core.turbo.NativeSocketJsTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsHttpActionBinding;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsHybridSocketHttpTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPlainSocketTaskParams;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPollingSocketTaskParams;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36561a0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSocketJsTurboModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0010J\n\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/rn/core/biz/NativeSocketJsTurboModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeSocketJsTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "coinBridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsModule;", "createPlainSocketTask", "Lcom/facebook/react/bridge/ReadableMap;", "task", "createPollingSocketTask", "createHybridSocketHttpTask", "startTask", "pollImmediate", "", "(Ljava/lang/Boolean;)Lcom/facebook/react/bridge/ReadableMap;", "pauseTask", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeSocketJsTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nNativeSocketJsTurboModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSocketJsTurboModuleImpl.kt\ncom/kubi/rn/core/biz/NativeSocketJsTurboModuleImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
public final class NativeSocketJsTurboModuleImpl extends NativeSocketJsTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSocketJsTurboModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36561a0 coinBridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36561a0) Router.f46192a.m56192n(InterfaceC36561a0.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36561a0) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit createHybridSocketHttpTask$lambda$5(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        objectRef.element = map;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit createPlainSocketTask$lambda$1(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        objectRef.element = map;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit createPollingSocketTask$lambda$3(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        objectRef.element = map;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit pauseTask$lambda$9(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        objectRef.element = map;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startTask$lambda$7(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        objectRef.element = map;
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSocketJsTurboModuleAbs
    @Nullable
    public ReadableMap createHybridSocketHttpTask(@NotNull ReadableMap task) {
        Intrinsics.checkNotNullParameter(task, "task");
        InterfaceC36561a0 interfaceC36561a0CoinBridge = coinBridge();
        if (interfaceC36561a0CoinBridge == null) {
            return null;
        }
        ReadableMap map = task.getMap("httpBinding");
        String string = map != null ? map.getString("url") : null;
        if (string == null) {
            string = "";
        }
        String string2 = map != null ? map.getString(FirebaseAnalytics.Param.METHOD) : null;
        if (string2 == null) {
            string2 = "";
        }
        String string3 = map != null ? map.getString("headers") : null;
        if (string3 == null) {
            string3 = "";
        }
        String string4 = map != null ? map.getString(ReportDataTable.COLUMN_PARAMS) : null;
        if (string4 == null) {
            string4 = "";
        }
        String string5 = map != null ? map.getString("parameType") : null;
        KCJSApiSocketJsHttpActionBinding kCJSApiSocketJsHttpActionBinding = new KCJSApiSocketJsHttpActionBinding(string, string2, string3, string4, string5 == null ? "" : string5);
        String string6 = task.getString("topic");
        String str = string6 == null ? "" : string6;
        String string7 = task.getString("pollFrequence");
        if (string7 == null) {
            string7 = "";
        }
        String string8 = task.getString("invalidFrequence");
        if (string8 == null) {
            string8 = "";
        }
        String string9 = task.getString("channelType");
        KCJSApiSocketJsHybridSocketHttpTaskParams kCJSApiSocketJsHybridSocketHttpTaskParams = new KCJSApiSocketJsHybridSocketHttpTaskParams(str, string7, string8, string9 == null ? "" : string9, kCJSApiSocketJsHttpActionBinding);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36561a0CoinBridge.mo31606e(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, kCJSApiSocketJsHybridSocketHttpTaskParams, new Function2() { // from class: com.kubi.rn.core.biz.s1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeSocketJsTurboModuleImpl.createHybridSocketHttpTask$lambda$5(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        Map map2 = (Map) objectRef.element;
        if (map2 != null) {
            return Arguments.makeNativeMap((Map<String, Object>) map2);
        }
        return null;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSocketJsTurboModuleAbs
    @Nullable
    public ReadableMap createPlainSocketTask(@NotNull ReadableMap task) {
        Intrinsics.checkNotNullParameter(task, "task");
        InterfaceC36561a0 interfaceC36561a0CoinBridge = coinBridge();
        if (interfaceC36561a0CoinBridge == null) {
            return null;
        }
        String string = task.getString("topic");
        if (string == null) {
            string = "";
        }
        String string2 = task.getString("channelType");
        KCJSApiSocketJsPlainSocketTaskParams kCJSApiSocketJsPlainSocketTaskParams = new KCJSApiSocketJsPlainSocketTaskParams(string, string2 != null ? string2 : "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36561a0CoinBridge.mo31604c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, kCJSApiSocketJsPlainSocketTaskParams, new Function2() { // from class: com.kubi.rn.core.biz.u1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeSocketJsTurboModuleImpl.createPlainSocketTask$lambda$1(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        Map map = (Map) objectRef.element;
        if (map != null) {
            return Arguments.makeNativeMap((Map<String, Object>) map);
        }
        return null;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSocketJsTurboModuleAbs
    @Nullable
    public ReadableMap createPollingSocketTask(@NotNull ReadableMap task) {
        Intrinsics.checkNotNullParameter(task, "task");
        InterfaceC36561a0 interfaceC36561a0CoinBridge = coinBridge();
        if (interfaceC36561a0CoinBridge == null) {
            return null;
        }
        String string = task.getString("topic");
        if (string == null) {
            string = "";
        }
        String string2 = task.getString("pollFrequence");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = task.getString("invalidFrequence");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = task.getString("channelType");
        KCJSApiSocketJsPollingSocketTaskParams kCJSApiSocketJsPollingSocketTaskParams = new KCJSApiSocketJsPollingSocketTaskParams(string, string2, string3, string4 != null ? string4 : "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36561a0CoinBridge.mo31605d(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, kCJSApiSocketJsPollingSocketTaskParams, new Function2() { // from class: com.kubi.rn.core.biz.w1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeSocketJsTurboModuleImpl.createPollingSocketTask$lambda$3(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        Map map = (Map) objectRef.element;
        if (map != null) {
            return Arguments.makeNativeMap((Map<String, Object>) map);
        }
        return null;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSocketJsTurboModuleAbs
    @Nullable
    public ReadableMap pauseTask() {
        InterfaceC36561a0 interfaceC36561a0CoinBridge = coinBridge();
        if (interfaceC36561a0CoinBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36561a0CoinBridge.mo31602a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.v1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeSocketJsTurboModuleImpl.pauseTask$lambda$9(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        Map map = (Map) objectRef.element;
        if (map == null) {
            return null;
        }
        return Arguments.makeNativeMap((Map<String, Object>) map);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSocketJsTurboModuleAbs
    @Nullable
    public ReadableMap startTask(@Nullable Boolean pollImmediate) {
        InterfaceC36561a0 interfaceC36561a0CoinBridge = coinBridge();
        if (interfaceC36561a0CoinBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36561a0CoinBridge.mo31603b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, pollImmediate, new Function2() { // from class: com.kubi.rn.core.biz.t1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeSocketJsTurboModuleImpl.startTask$lambda$7(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        Map map = (Map) objectRef.element;
        if (map == null) {
            return null;
        }
        return Arguments.makeNativeMap((Map<String, Object>) map);
    }
}
