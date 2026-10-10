package com.kubi.quotefacade.jsapi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs;
import com.kubi.p110rn.core.turbo.VisitorFavoriteEntity;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiMarketVisitorFavoriteEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36578m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboMarketModuleImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\u0010\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u001f0\t¨\u0006 "}, m90084d2 = {"Lcom/kubi/quotefacade/jsapi/KCTurboMarketModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeMarketTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiMarketModule;", "getAlphaFavoriteList", "", "Lcom/kubi/rn/core/turbo/VisitorFavoriteEntity;", "isAlphaFavorite", "", "tokenChain", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "changeAlphaFavorite", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "getSpotFavoriteList", "isSpotFavorite", "symbol", "changeSpotFavorite", "getFutureFavoriteList", "isFutureFavorite", "changeFutureFavorite", "getFutureTag", "Lcom/facebook/react/bridge/ReadableMap;", "getUsStockExcludes", "toVisitorFavoriteEntityList", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiMarketVisitorFavoriteEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeMarketTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboMarketModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboMarketModuleImpl.kt\ncom/kubi/quotefacade/jsapi/KCTurboMarketModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1563#2:200\n1634#2,3:201\n*S KotlinDebug\n*F\n+ 1 KCTurboMarketModuleImpl.kt\ncom/kubi/quotefacade/jsapi/KCTurboMarketModuleImpl\n*L\n191#1:200\n191#1:201,3\n*E\n"})
public final class KCTurboMarketModuleImpl extends NativeMarketTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboMarketModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36578m bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36578m) Router.f46192a.m56192n(InterfaceC36578m.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36578m) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit changeFutureFavorite$lambda$18(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit changeSpotFavorite$lambda$12(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getAlphaFavoriteList$lambda$2(Ref.ObjectRef objectRef, KCTurboMarketModuleImpl kCTurboMarketModuleImpl, List list, ProtocolException protocolException) {
        objectRef.element = list != null ? kCTurboMarketModuleImpl.toVisitorFavoriteEntityList(list) : 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getFutureFavoriteList$lambda$14(Ref.ObjectRef objectRef, KCTurboMarketModuleImpl kCTurboMarketModuleImpl, List list, ProtocolException protocolException) {
        objectRef.element = list != null ? kCTurboMarketModuleImpl.toVisitorFavoriteEntityList(list) : 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.facebook.react.bridge.ReadableMap] */
    public static final Unit getFutureTag$lambda$20(Ref.ObjectRef objectRef, Map map, ProtocolException protocolException) {
        objectRef.element = (ReadableMap) map;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getSpotFavoriteList$lambda$8(Ref.ObjectRef objectRef, KCTurboMarketModuleImpl kCTurboMarketModuleImpl, List list, ProtocolException protocolException) {
        objectRef.element = list != null ? kCTurboMarketModuleImpl.toVisitorFavoriteEntityList(list) : 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isAlphaFavorite$lambda$4(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isFutureFavorite$lambda$16(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isSpotFavorite$lambda$10(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    public void changeAlphaFavorite(@NotNull String tokenChain, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52144j(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, tokenChain, new Function2() { // from class: com.kubi.quotefacade.jsapi.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.changeAlphaFavorite$lambda$6(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public Boolean changeFutureFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return Boolean.FALSE;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52145k(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, symbol, new Function2() { // from class: com.kubi.quotefacade.jsapi.k
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.changeFutureFavorite$lambda$18(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public Boolean changeSpotFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return Boolean.FALSE;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52136b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, symbol, new Function2() { // from class: com.kubi.quotefacade.jsapi.m
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.changeSpotFavorite$lambda$12(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public ReadableMap getFutureTag(@NotNull List<String> symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52138d(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, symbol, new Function2() { // from class: com.kubi.quotefacade.jsapi.f
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.getFutureTag$lambda$20(objectRef, (Map) obj, (ProtocolException) obj2);
            }
        });
        return (ReadableMap) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public String getUsStockExcludes() {
        return QuoteBusinessConfigHelp.f41933a.m51845i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public Boolean isAlphaFavorite(@NotNull String tokenChain) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return Boolean.FALSE;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52140f(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, tokenChain, new Function2() { // from class: com.kubi.quotefacade.jsapi.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.isAlphaFavorite$lambda$4(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public Boolean isFutureFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return Boolean.FALSE;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52141g(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, symbol, new Function2() { // from class: com.kubi.quotefacade.jsapi.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.isFutureFavorite$lambda$16(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public Boolean isSpotFavorite(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return Boolean.FALSE;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52139e(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, symbol, new Function2() { // from class: com.kubi.quotefacade.jsapi.j
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.isSpotFavorite$lambda$10(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return (Boolean) objectRef.element;
    }

    @NotNull
    public final List<VisitorFavoriteEntity> toVisitorFavoriteEntityList(@NotNull List<KCJSApiMarketVisitorFavoriteEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (KCJSApiMarketVisitorFavoriteEntity kCJSApiMarketVisitorFavoriteEntity : list) {
            String currencyType = kCJSApiMarketVisitorFavoriteEntity.getCurrencyType();
            String symbol = kCJSApiMarketVisitorFavoriteEntity.getSymbol();
            Long timestamp = kCJSApiMarketVisitorFavoriteEntity.getTimestamp();
            arrayList.add(new VisitorFavoriteEntity(currencyType, symbol, timestamp != null ? Double.valueOf(timestamp.longValue()) : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeAlphaFavorite$lambda$6(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public List<VisitorFavoriteEntity> getAlphaFavoriteList() {
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52143i(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.quotefacade.jsapi.l
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.getAlphaFavoriteList$lambda$2(objectRef, this, (List) obj, (ProtocolException) obj2);
            }
        });
        return (List) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public List<VisitorFavoriteEntity> getFutureFavoriteList() {
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52137c(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.quotefacade.jsapi.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.getFutureFavoriteList$lambda$14(objectRef, this, (List) obj, (ProtocolException) obj2);
            }
        });
        return (List) objectRef.element;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeMarketTurboModuleAbs
    @Nullable
    public List<VisitorFavoriteEntity> getSpotFavoriteList() {
        InterfaceC36578m interfaceC36578mBridge = bridge();
        if (interfaceC36578mBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36578mBridge.mo52142h(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: com.kubi.quotefacade.jsapi.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboMarketModuleImpl.getSpotFavoriteList$lambda$8(objectRef, this, (List) obj, (ProtocolException) obj2);
            }
        });
        return (List) objectRef.element;
    }
}
