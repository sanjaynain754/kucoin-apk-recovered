package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.NativeCalendarTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.util.C24267r0;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36564c;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: KCTurboCalendarModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\rH\u0016J&\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b0\rH\u0016J.\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b0\rH\u0016J&\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b0\rH\u0016¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboCalendarModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeCalendarTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCalendarModule;", "getPermission", "", "requestPermission", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "queryCalendar", "data", "Lcom/facebook/react/bridge/ReadableMap;", "updateCalendarItem", "eventType", "deleteCalendarItem", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeCalendarTurboModuleAbs.class})
public final class KCTurboCalendarModuleImpl extends NativeCalendarTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboCalendarModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36564c bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36564c) Router.f46192a.m56192n(InterfaceC36564c.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36564c) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getPermission$lambda$2(Ref.ObjectRef objectRef, String str, ProtocolException protocolException) {
        objectRef.element = str;
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCalendarTurboModuleAbs
    public void deleteCalendarItem(@NotNull ReadableMap data, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36564c interfaceC36564cBridge = bridge();
        if (interfaceC36564cBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36564cBridge.mo31539c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, C24267r0.m58526j(data), new Function2() { // from class: com.kubi.rn.core.biz.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCalendarModuleImpl.deleteCalendarItem$lambda$10(callback, (Map) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCalendarTurboModuleAbs
    public void queryCalendar(@NotNull ReadableMap data, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36564c interfaceC36564cBridge = bridge();
        if (interfaceC36564cBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36564cBridge.mo31538b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, C24267r0.m58526j(data), new Function2() { // from class: com.kubi.rn.core.biz.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCalendarModuleImpl.queryCalendar$lambda$6(callback, (Map) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCalendarTurboModuleAbs
    public void requestPermission(@NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36564c interfaceC36564cBridge = bridge();
        if (interfaceC36564cBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36564cBridge.mo31541e(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCalendarModuleImpl.requestPermission$lambda$4(callback, (String) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCalendarTurboModuleAbs
    public void updateCalendarItem(@NotNull String eventType, @NotNull ReadableMap data, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36564c interfaceC36564cBridge = bridge();
        if (interfaceC36564cBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36564cBridge.mo31540d(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, eventType, C24267r0.m58526j(data), new Function2() { // from class: com.kubi.rn.core.biz.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCalendarModuleImpl.updateCalendarItem$lambda$8(callback, (Map) obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCalendarItem$lambda$10(Function1 function1, Map map, ProtocolException protocolException) {
        function1.invoke(C24267r0.m58522f(map));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryCalendar$lambda$6(Function1 function1, Map map, ProtocolException protocolException) {
        function1.invoke(C24267r0.m58522f(map));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$4(Function1 function1, String str, ProtocolException protocolException) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCalendarItem$lambda$8(Function1 function1, Map map, ProtocolException protocolException) {
        function1.invoke(C24267r0.m58522f(map));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeCalendarTurboModuleAbs
    @Nullable
    public String getPermission() {
        InterfaceC36564c interfaceC36564cBridge = bridge();
        if (interfaceC36564cBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36564cBridge.mo31537a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.rn.core.biz.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboCalendarModuleImpl.getPermission$lambda$2(objectRef, (String) obj, (ProtocolException) obj2);
            }
        });
        return (String) objectRef.element;
    }
}
