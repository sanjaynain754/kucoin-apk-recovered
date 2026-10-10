package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSymbolsCoinTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010 \u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeSymbolsCoinTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "getSpotCoinInfo", "Lcom/facebook/react/bridge/WritableMap;", "code", "getSpotCoinInfoBatch", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getSpotCoinInfoBatchByPage", "pageIndex", "pageSize", "getSpotSymbol", "getSpotSymbolBatch", "getSpotSymbolBatchByPage", "getFuturesCoinInfo", "getFuturesCoinInfoBatch", "getFuturesCoinInfoBatchByPage", "getFuturesSymbolInfo", "getFuturesSymbolInfoBatch", "getFuturesSymbolInfoBatchByPage", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeSymbolsCoinTurboModuleBridge extends NativeSymbolsCoinTurboModuleSpec {

    @NotNull
    private final NativeSymbolsCoinTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSymbolsCoinTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeSymbolsCoinTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFuturesCoinInfoBatch$lambda$4(Promise promise, NativeSymbolsCoinTurboModuleBridge nativeSymbolsCoinTurboModuleBridge, List list) {
        if (promise != null) {
            promise.resolve(nativeSymbolsCoinTurboModuleBridge.impl.wrapResult(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFuturesCoinInfoBatchByPage$lambda$5(Promise promise, NativeSymbolsCoinTurboModuleBridge nativeSymbolsCoinTurboModuleBridge, FuturesCoinInfoPageResult futuresCoinInfoPageResult) {
        if (promise != null) {
            promise.resolve(nativeSymbolsCoinTurboModuleBridge.impl.wrapResult(futuresCoinInfoPageResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFuturesSymbolInfoBatch$lambda$6(Promise promise, NativeSymbolsCoinTurboModuleBridge nativeSymbolsCoinTurboModuleBridge, List list) {
        if (promise != null) {
            promise.resolve(nativeSymbolsCoinTurboModuleBridge.impl.wrapResult(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFuturesSymbolInfoBatchByPage$lambda$7(Promise promise, NativeSymbolsCoinTurboModuleBridge nativeSymbolsCoinTurboModuleBridge, FuturesSymbolInfoPageResult futuresSymbolInfoPageResult) {
        if (promise != null) {
            promise.resolve(nativeSymbolsCoinTurboModuleBridge.impl.wrapResult(futuresSymbolInfoPageResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSpotCoinInfoBatch$lambda$0(Promise promise, NativeSymbolsCoinTurboModuleBridge nativeSymbolsCoinTurboModuleBridge, List list) {
        if (promise != null) {
            promise.resolve(nativeSymbolsCoinTurboModuleBridge.impl.wrapResult(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSpotCoinInfoBatchByPage$lambda$1(Promise promise, NativeSymbolsCoinTurboModuleBridge nativeSymbolsCoinTurboModuleBridge, SpotCoinInfoPageResult spotCoinInfoPageResult) {
        if (promise != null) {
            promise.resolve(nativeSymbolsCoinTurboModuleBridge.impl.wrapResult(spotCoinInfoPageResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSpotSymbolBatch$lambda$2(Promise promise, NativeSymbolsCoinTurboModuleBridge nativeSymbolsCoinTurboModuleBridge, List list) {
        if (promise != null) {
            promise.resolve(nativeSymbolsCoinTurboModuleBridge.impl.wrapResult(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSpotSymbolBatchByPage$lambda$3(Promise promise, NativeSymbolsCoinTurboModuleBridge nativeSymbolsCoinTurboModuleBridge, SpotSymbolPageResult spotSymbolPageResult) {
        if (promise != null) {
            promise.resolve(nativeSymbolsCoinTurboModuleBridge.impl.wrapResult(spotSymbolPageResult));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    @Nullable
    public WritableMap getFuturesCoinInfo(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        NativeSymbolsCoinTurboModuleAbs nativeSymbolsCoinTurboModuleAbs = this.impl;
        return nativeSymbolsCoinTurboModuleAbs.wrapResult(nativeSymbolsCoinTurboModuleAbs.getFuturesCoinInfo(code));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    public void getFuturesCoinInfoBatch(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getFuturesCoinInfoBatch(new Function1() { // from class: com.kubi.rn.core.turbo.j4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSymbolsCoinTurboModuleBridge.getFuturesCoinInfoBatch$lambda$4(promise, this, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    public void getFuturesCoinInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getFuturesCoinInfoBatchByPage(pageIndex, pageSize, new Function1() { // from class: com.kubi.rn.core.turbo.o4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSymbolsCoinTurboModuleBridge.getFuturesCoinInfoBatchByPage$lambda$5(promise, this, (FuturesCoinInfoPageResult) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    @Nullable
    public WritableMap getFuturesSymbolInfo(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        NativeSymbolsCoinTurboModuleAbs nativeSymbolsCoinTurboModuleAbs = this.impl;
        return nativeSymbolsCoinTurboModuleAbs.wrapResult(nativeSymbolsCoinTurboModuleAbs.getFuturesSymbolInfo(code));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    public void getFuturesSymbolInfoBatch(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getFuturesSymbolInfoBatch(new Function1() { // from class: com.kubi.rn.core.turbo.l4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSymbolsCoinTurboModuleBridge.getFuturesSymbolInfoBatch$lambda$6(promise, this, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    public void getFuturesSymbolInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getFuturesSymbolInfoBatchByPage(pageIndex, pageSize, new Function1() { // from class: com.kubi.rn.core.turbo.i4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSymbolsCoinTurboModuleBridge.getFuturesSymbolInfoBatchByPage$lambda$7(promise, this, (FuturesSymbolInfoPageResult) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeSymbolsCoinTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "SymbolsCoin";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    @Nullable
    public WritableMap getSpotCoinInfo(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        NativeSymbolsCoinTurboModuleAbs nativeSymbolsCoinTurboModuleAbs = this.impl;
        return nativeSymbolsCoinTurboModuleAbs.wrapResult(nativeSymbolsCoinTurboModuleAbs.getSpotCoinInfo(code));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    public void getSpotCoinInfoBatch(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getSpotCoinInfoBatch(new Function1() { // from class: com.kubi.rn.core.turbo.m4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSymbolsCoinTurboModuleBridge.getSpotCoinInfoBatch$lambda$0(promise, this, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    public void getSpotCoinInfoBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getSpotCoinInfoBatchByPage(pageIndex, pageSize, new Function1() { // from class: com.kubi.rn.core.turbo.h4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSymbolsCoinTurboModuleBridge.getSpotCoinInfoBatchByPage$lambda$1(promise, this, (SpotCoinInfoPageResult) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    @Nullable
    public WritableMap getSpotSymbol(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        NativeSymbolsCoinTurboModuleAbs nativeSymbolsCoinTurboModuleAbs = this.impl;
        return nativeSymbolsCoinTurboModuleAbs.wrapResult(nativeSymbolsCoinTurboModuleAbs.getSpotSymbol(code));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    public void getSpotSymbolBatch(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getSpotSymbolBatch(new Function1() { // from class: com.kubi.rn.core.turbo.n4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSymbolsCoinTurboModuleBridge.getSpotSymbolBatch$lambda$2(promise, this, (List) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModuleSpec
    public void getSpotSymbolBatchByPage(@NotNull String pageIndex, @NotNull String pageSize, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getSpotSymbolBatchByPage(pageIndex, pageSize, new Function1() { // from class: com.kubi.rn.core.turbo.k4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSymbolsCoinTurboModuleBridge.getSpotSymbolBatchByPage$lambda$3(promise, this, (SpotSymbolPageResult) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
