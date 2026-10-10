package com.kubi.futures.jsapi;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.futures.jsapi.NativeFuturesTurboModuleImpl;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.p110rn.core.turbo.NativeFuturesTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36572g;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeFuturesTurboModuleImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016J\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000e2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\t0\rH\u0016J\u0018\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u000eH\u0002¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/jsapi/NativeFuturesTurboModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeFuturesTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "coinBridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFuturesModule;", "getFeaturesConfig", "", "tabType", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMap;", "handleMenuAction", "", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, ReportDataTable.COLUMN_PARAMS, "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/Boolean;", "shareFuturesPositionPnl", "data", "toNonNullMap", "", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeFuturesTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nNativeFuturesTurboModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeFuturesTurboModuleImpl.kt\ncom/kubi/futures/jsapi/NativeFuturesTurboModuleImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,61:1\n1#2:62\n1#2:73\n136#3,9:63\n216#3:72\n217#3:74\n145#3:75\n*S KotlinDebug\n*F\n+ 1 NativeFuturesTurboModuleImpl.kt\ncom/kubi/futures/jsapi/NativeFuturesTurboModuleImpl\n*L\n59#1:73\n59#1:63,9\n59#1:72\n59#1:74\n59#1:75\n*E\n"})
public final class NativeFuturesTurboModuleImpl extends NativeFuturesTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeFuturesTurboModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36572g coinBridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36572g) Router.f46192a.m56192n(InterfaceC36572g.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36572g) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFeaturesConfig$lambda$3(Function1 function1, Map map, ProtocolException protocolException) {
        function1.invoke(map != null ? Arguments.makeNativeMap((Map<String, Object>) map) : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMenuAction$lambda$4(Boolean bool, ProtocolException protocolException) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareFuturesPositionPnl$lambda$5(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(Boolean.valueOf(Intrinsics.areEqual(bool, Boolean.TRUE)));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFuturesTurboModuleAbs
    public void getFeaturesConfig(@NotNull String tabType, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36572g interfaceC36572gCoinBridge = coinBridge();
        if (interfaceC36572gCoinBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36572gCoinBridge.mo81863f(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, tabType, new Function2() { // from class: ei.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeFuturesTurboModuleImpl.getFeaturesConfig$lambda$3(callback, (Map) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFuturesTurboModuleAbs
    @Nullable
    public Boolean handleMenuAction(@NotNull String actionId, @NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(params, "params");
        InterfaceC36572g interfaceC36572gCoinBridge = coinBridge();
        if (interfaceC36572gCoinBridge == null) {
            return null;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36572gCoinBridge.mo81862a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, actionId, toNonNullMap(params), new Function2() { // from class: ei.f
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeFuturesTurboModuleImpl.handleMenuAction$lambda$4((Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.TRUE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFuturesTurboModuleAbs
    public void shareFuturesPositionPnl(@NotNull ReadableMap data, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IKuMexService iKuMexService = IKuMexService.f28731a.get();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        iKuMexService.mo33273X(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, toNonNullMap(data), new Function2() { // from class: ei.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeFuturesTurboModuleImpl.shareFuturesPositionPnl$lambda$5(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    private final Map<String, Object> toNonNullMap(ReadableMap readableMap) {
        Pair pairM90091to;
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                pairM90091to = TuplesKt.m90091to(key, value);
            } else {
                pairM90091to = null;
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
