package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33954u6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeTradeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J0\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J8\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010(\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u000bH\u0016J\u0018\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010.\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006/"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeTradeTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeTradeTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeTradeTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeTradeTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeTradeTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "isUtaGray", "Lcom/facebook/react/bridge/WritableMap;", "isUtaHasOpend", "openOrderDetail", "orderId", "symbol", "bussinesType", "content", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "openNativeMarketsSymbolDialog", "level1", "level2", "level3", "data", "Lcom/facebook/react/bridge/ReadableMap;", "getContractTradeUnit", "getAlphaCurrencyInfo", "currencySeq", "", "quoteCurrency", "", "getAlphaCurrencyInfoBatch", "getIsolatedMarginConfig", "getIsolatedMarginConfigBatch", "getMarginCurrencyList", "getMarginConfig", "getMarginCurrency", FirebaseAnalytics.Param.CURRENCY, "fetchMarginCurrency", "fetchSymbolOfflineInfoList", "getSymbolOfflineInfo", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeTradeTurboModuleBridge extends NativeTradeTurboModuleSpec {

    @NotNull
    private final NativeTradeTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeTradeTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeTradeTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchMarginCurrency$lambda$6(Promise promise, NativeTradeTurboModuleBridge nativeTradeTurboModuleBridge, MarginCurrency marginCurrency) {
        if (promise != null) {
            promise.resolve(nativeTradeTurboModuleBridge.impl.wrapResult(marginCurrency));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchSymbolOfflineInfoList$lambda$7(Promise promise, NativeTradeTurboModuleBridge nativeTradeTurboModuleBridge, List list) {
        if (promise != null) {
            promise.resolve(nativeTradeTurboModuleBridge.impl.wrapResult(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAlphaCurrencyInfoBatch$lambda$2(Promise promise, NativeTradeTurboModuleBridge nativeTradeTurboModuleBridge, List list) {
        if (promise != null) {
            promise.resolve(nativeTradeTurboModuleBridge.impl.wrapResult(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getIsolatedMarginConfigBatch$lambda$3(Promise promise, NativeTradeTurboModuleBridge nativeTradeTurboModuleBridge, List list) {
        if (promise != null) {
            promise.resolve(nativeTradeTurboModuleBridge.impl.wrapResult(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMarginConfig$lambda$5(Promise promise, NativeTradeTurboModuleBridge nativeTradeTurboModuleBridge, MarginConfig marginConfig) {
        if (promise != null) {
            promise.resolve(nativeTradeTurboModuleBridge.impl.wrapResult(marginConfig));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMarginCurrencyList$lambda$4(Promise promise, NativeTradeTurboModuleBridge nativeTradeTurboModuleBridge, List list) {
        if (promise != null) {
            promise.resolve(nativeTradeTurboModuleBridge.impl.wrapResult(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openNativeMarketsSymbolDialog$lambda$1(Promise promise, NativeTradeTurboModuleBridge nativeTradeTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeTradeTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openOrderDetail$lambda$0(Promise promise, NativeTradeTurboModuleBridge nativeTradeTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeTradeTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    public void fetchMarginCurrency(@NotNull String currency, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.fetchMarginCurrency(currency, new Function1() { // from class: com.kubi.rn.core.turbo.j5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeTradeTurboModuleBridge.fetchMarginCurrency$lambda$6(promise, this, (MarginCurrency) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    public void fetchSymbolOfflineInfoList(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.fetchSymbolOfflineInfoList(new Function1() { // from class: com.kubi.rn.core.turbo.l5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeTradeTurboModuleBridge.fetchSymbolOfflineInfoList$lambda$7(promise, this, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    @Nullable
    public WritableMap getAlphaCurrencyInfo(double currencySeq, boolean quoteCurrency) {
        NativeTradeTurboModuleAbs nativeTradeTurboModuleAbs = this.impl;
        return nativeTradeTurboModuleAbs.wrapResult(nativeTradeTurboModuleAbs.getAlphaCurrencyInfo(currencySeq, quoteCurrency));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    public void getAlphaCurrencyInfoBatch(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getAlphaCurrencyInfoBatch(new Function1() { // from class: com.kubi.rn.core.turbo.k5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeTradeTurboModuleBridge.getAlphaCurrencyInfoBatch$lambda$2(promise, this, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    @Nullable
    public WritableMap getContractTradeUnit() {
        NativeTradeTurboModuleAbs nativeTradeTurboModuleAbs = this.impl;
        return nativeTradeTurboModuleAbs.wrapResult(nativeTradeTurboModuleAbs.getContractTradeUnit());
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeTradeTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    @Nullable
    public WritableMap getIsolatedMarginConfig(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        NativeTradeTurboModuleAbs nativeTradeTurboModuleAbs = this.impl;
        return nativeTradeTurboModuleAbs.wrapResult(nativeTradeTurboModuleAbs.getIsolatedMarginConfig(symbol));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    public void getIsolatedMarginConfigBatch(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getIsolatedMarginConfigBatch(new Function1() { // from class: com.kubi.rn.core.turbo.f5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeTradeTurboModuleBridge.getIsolatedMarginConfigBatch$lambda$3(promise, this, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    public void getMarginConfig(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getMarginConfig(new Function1() { // from class: com.kubi.rn.core.turbo.i5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeTradeTurboModuleBridge.getMarginConfig$lambda$5(promise, this, (MarginConfig) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    @Nullable
    public WritableMap getMarginCurrency(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        NativeTradeTurboModuleAbs nativeTradeTurboModuleAbs = this.impl;
        return nativeTradeTurboModuleAbs.wrapResult(nativeTradeTurboModuleAbs.getMarginCurrency(currency));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    public void getMarginCurrencyList(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getMarginCurrencyList(new Function1() { // from class: com.kubi.rn.core.turbo.h5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeTradeTurboModuleBridge.getMarginCurrencyList$lambda$4(promise, this, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Trade";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    @Nullable
    public WritableMap getSymbolOfflineInfo(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        NativeTradeTurboModuleAbs nativeTradeTurboModuleAbs = this.impl;
        return nativeTradeTurboModuleAbs.wrapResult(nativeTradeTurboModuleAbs.getSymbolOfflineInfo(symbol));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    @Nullable
    public WritableMap isUtaGray() {
        NativeTradeTurboModuleAbs nativeTradeTurboModuleAbs = this.impl;
        return nativeTradeTurboModuleAbs.wrapResult(nativeTradeTurboModuleAbs.isUtaGray());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    @Nullable
    public WritableMap isUtaHasOpend() {
        NativeTradeTurboModuleAbs nativeTradeTurboModuleAbs = this.impl;
        return nativeTradeTurboModuleAbs.wrapResult(nativeTradeTurboModuleAbs.isUtaHasOpend());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    public void openNativeMarketsSymbolDialog(@Nullable String level1, @Nullable String level2, @Nullable String level3, @Nullable ReadableMap data, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.openNativeMarketsSymbolDialog(level1, level2, level3, data, new Function1() { // from class: com.kubi.rn.core.turbo.g5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeTradeTurboModuleBridge.openNativeMarketsSymbolDialog$lambda$1(promise, this, (String) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleSpec
    public void openOrderDetail(@NotNull String orderId, @NotNull String symbol, @NotNull String bussinesType, @NotNull String content, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bussinesType, "bussinesType");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.openOrderDetail(orderId, symbol, bussinesType, content, new Function1() { // from class: com.kubi.rn.core.turbo.e5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeTradeTurboModuleBridge.openOrderDetail$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
