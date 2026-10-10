package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.NativeSensorTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.util.C24267r0;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36589x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboSensorModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u001f\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u000eH\u0002¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\u0018*\u0004\u0018\u00010\tH\u0002J!\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u001dJ;\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010#J.\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020%0(H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboSensorModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeSensorTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSensorModule;", "fastFetchJsonTest", "Lcom/facebook/react/bridge/ReadableMap;", "keyName", "", "defaultValue", "fastFetchIntegerTest", "", "(Ljava/lang/String;D)Ljava/lang/Double;", "fastFetchStringTest", "fastFetchBoolTest", "", "(Ljava/lang/String;Z)Ljava/lang/Boolean;", "toLongOrNull", "", "(D)Ljava/lang/Long;", "toNonNullMap", "", "", "sensorsTrackTurbo", "eventId", "properties", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "sensorsExpose", "pageId", "blockId", "locationId", "siteId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "fetchKcAbTest", "", "experimentKey", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeSensorTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboSensorModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboSensorModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboSensorModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n136#2,9:177\n216#2:186\n217#2:189\n145#2:190\n1#3:187\n1#3:188\n*S KotlinDebug\n*F\n+ 1 KCTurboSensorModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboSensorModuleImpl\n*L\n108#1:177,9\n108#1:186\n108#1:189\n108#1:190\n108#1:188\n*E\n"})
public final class KCTurboSensorModuleImpl extends NativeSensorTurboModuleAbs {

    @NotNull
    private final ReactApplicationContext ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboSensorModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
    }

    private final InterfaceC36589x bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36589x) Router.f46192a.m56192n(InterfaceC36589x.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36589x) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fastFetchBoolTest$lambda$4(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = bool != null ? bool.booleanValue() : false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fastFetchIntegerTest$lambda$2(Ref.IntRef intRef, Long l11, ProtocolException protocolException) {
        intRef.element = l11 != null ? (int) l11.longValue() : -1;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fastFetchJsonTest$lambda$1(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        objectRef.element = map;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fastFetchStringTest$lambda$3(Ref.ObjectRef objectRef, String str, ProtocolException protocolException) {
        T t11 = str;
        if (str == null) {
            t11 = "";
        }
        objectRef.element = t11;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchKcAbTest$lambda$10(Function1 function1, String str, String str2, ProtocolException protocolException) {
        if (protocolException != null) {
            C44128b.m97265i("fetchKcAbTest error: " + protocolException.getMessage());
            function1.invoke(str);
        } else {
            if (str2 != null) {
                str = str2;
            }
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sensorsExpose$lambda$8(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sensorsTrackTurbo$lambda$7(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private final Map<String, Object> toNonNullMap(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        if (readableMap != null && (hashMap = readableMap.toHashMap()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Pair pairM90091to = value != null ? TuplesKt.m90091to(key, value) : null;
                if (pairM90091to != null) {
                    arrayList.add(pairM90091to);
                }
            }
            Map<String, Object> map = MapsKt.toMap(arrayList);
            if (map != null) {
                return map;
            }
        }
        return MapsKt.emptyMap();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleAbs
    @Nullable
    public Boolean fastFetchBoolTest(@NotNull String keyName, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        InterfaceC36589x interfaceC36589xBridge = bridge();
        if (interfaceC36589xBridge == null) {
            return Boolean.FALSE;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36589xBridge.mo31558c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, keyName, defaultValue, new Function2() { // from class: com.kubi.rn.core.biz.u0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSensorModuleImpl.fastFetchBoolTest$lambda$4(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleAbs
    @Nullable
    public Double fastFetchIntegerTest(@NotNull String keyName, double defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Long longOrNull = toLongOrNull(defaultValue);
        Double dValueOf = Double.valueOf(-1.0d);
        if (longOrNull == null) {
            return dValueOf;
        }
        long jLongValue = longOrNull.longValue();
        InterfaceC36589x interfaceC36589xBridge = bridge();
        if (interfaceC36589xBridge == null) {
            return dValueOf;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36589xBridge.mo31559d(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, keyName, jLongValue, new Function2() { // from class: com.kubi.rn.core.biz.w0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSensorModuleImpl.fastFetchIntegerTest$lambda$2(intRef, (Long) obj, (ProtocolException) obj2);
            }
        });
        return Double.valueOf(intRef.element);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.Map] */
    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleAbs
    @Nullable
    public ReadableMap fastFetchJsonTest(@NotNull String keyName, @NotNull ReadableMap defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = MapsKt.emptyMap();
        InterfaceC36589x interfaceC36589xBridge = bridge();
        if (interfaceC36589xBridge == null) {
            return C24267r0.m58522f((Map) objectRef.element);
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36589xBridge.mo31561f(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, keyName, toNonNullMap(defaultValue), new Function2() { // from class: com.kubi.rn.core.biz.v0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSensorModuleImpl.fastFetchJsonTest$lambda$1(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        return C24267r0.m58522f((Map) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleAbs
    @Nullable
    public String fastFetchStringTest(@NotNull String keyName, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        InterfaceC36589x interfaceC36589xBridge = bridge();
        if (interfaceC36589xBridge == null) {
            return "";
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36589xBridge.mo31557b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, keyName, defaultValue, new Function2() { // from class: com.kubi.rn.core.biz.z0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSensorModuleImpl.fastFetchStringTest$lambda$3(objectRef, (String) obj, (ProtocolException) obj2);
            }
        });
        return (String) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleAbs
    public void fetchKcAbTest(@NotNull String experimentKey, @NotNull final String defaultValue, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(experimentKey, "experimentKey");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36589x interfaceC36589xBridge = bridge();
        if (interfaceC36589xBridge == null) {
            callback.invoke(defaultValue);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36589xBridge.mo31562g(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, experimentKey, defaultValue, new Function2() { // from class: com.kubi.rn.core.biz.a1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSensorModuleImpl.fetchKcAbTest$lambda$10(callback, defaultValue, (String) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleAbs
    @Nullable
    public Boolean sensorsExpose(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable String siteId, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        InterfaceC36589x interfaceC36589xBridge = bridge();
        if (interfaceC36589xBridge == null) {
            return Boolean.FALSE;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36589xBridge.mo31556a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, pageId, blockId, locationId, siteId, toNonNullMap(properties), new Function2() { // from class: com.kubi.rn.core.biz.x0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSensorModuleImpl.sensorsExpose$lambda$8(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSensorTurboModuleAbs
    @Nullable
    public Boolean sensorsTrackTurbo(@NotNull String eventId, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        InterfaceC36589x interfaceC36589xBridge = bridge();
        if (interfaceC36589xBridge == null) {
            return Boolean.FALSE;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36589xBridge.mo31560e(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, eventId, toNonNullMap(properties), new Function2() { // from class: com.kubi.rn.core.biz.y0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboSensorModuleImpl.sensorsTrackTurbo$lambda$7(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }

    private final Long toLongOrNull(double d11) {
        if (Math.abs(d11) <= Double.MAX_VALUE) {
            return Long.valueOf((long) d11);
        }
        return null;
    }
}
