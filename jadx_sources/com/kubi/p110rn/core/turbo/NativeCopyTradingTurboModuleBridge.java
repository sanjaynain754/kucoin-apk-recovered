package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeCopyTradingTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006%"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeCopyTradingTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "shareOptionPosition", "optionShareInfo", "Lcom/facebook/react/bridge/ReadableMap;", "footerInfo", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "shareCopyTradingPosition", "copyTradingData", "shareLeadTraderTotalPnl", "leadTraderTotalPnlData", "shareCopyTraderTotalPnl", "copyTraderTotalPnlData", "shareCopyTraderFollowOneTraderPnl", "copyTraderFollowOneTraderPnlData", "shareLeadUserInfo", "leadTradingUserInfo", "requestFutureMarketClosePosition", "subUid", "positionJson", "requestFuturePositionTpSl", "requestRefreshCopyTradingAccountInfo", "Lcom/facebook/react/bridge/WritableMap;", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeCopyTradingTurboModuleBridge extends NativeCopyTradingTurboModuleSpec {

    @NotNull
    private final NativeCopyTradingTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCopyTradingTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeCopyTradingTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestFutureMarketClosePosition$lambda$6(Promise promise, NativeCopyTradingTurboModuleBridge nativeCopyTradingTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCopyTradingTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestFuturePositionTpSl$lambda$7(Promise promise, NativeCopyTradingTurboModuleBridge nativeCopyTradingTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCopyTradingTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCopyTraderFollowOneTraderPnl$lambda$4(Promise promise, NativeCopyTradingTurboModuleBridge nativeCopyTradingTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCopyTradingTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCopyTraderTotalPnl$lambda$3(Promise promise, NativeCopyTradingTurboModuleBridge nativeCopyTradingTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCopyTradingTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCopyTradingPosition$lambda$1(Promise promise, NativeCopyTradingTurboModuleBridge nativeCopyTradingTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCopyTradingTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareLeadTraderTotalPnl$lambda$2(Promise promise, NativeCopyTradingTurboModuleBridge nativeCopyTradingTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCopyTradingTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareLeadUserInfo$lambda$5(Promise promise, NativeCopyTradingTurboModuleBridge nativeCopyTradingTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCopyTradingTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareOptionPosition$lambda$0(Promise promise, NativeCopyTradingTurboModuleBridge nativeCopyTradingTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCopyTradingTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeCopyTradingTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "CopyTrading";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    public void requestFutureMarketClosePosition(@NotNull String subUid, @NotNull String positionJson, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.requestFutureMarketClosePosition(subUid, positionJson, new Function1() { // from class: com.kubi.rn.core.turbo.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCopyTradingTurboModuleBridge.requestFutureMarketClosePosition$lambda$6(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    public void requestFuturePositionTpSl(@NotNull String subUid, @NotNull String positionJson, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        Intrinsics.checkNotNullParameter(positionJson, "positionJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.requestFuturePositionTpSl(subUid, positionJson, new Function1() { // from class: com.kubi.rn.core.turbo.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCopyTradingTurboModuleBridge.requestFuturePositionTpSl$lambda$7(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    @Nullable
    public WritableMap requestRefreshCopyTradingAccountInfo() {
        NativeCopyTradingTurboModuleAbs nativeCopyTradingTurboModuleAbs = this.impl;
        return nativeCopyTradingTurboModuleAbs.wrapResult(nativeCopyTradingTurboModuleAbs.requestRefreshCopyTradingAccountInfo());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    public void shareCopyTraderFollowOneTraderPnl(@NotNull ReadableMap copyTraderFollowOneTraderPnlData, @NotNull ReadableMap footerInfo, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(copyTraderFollowOneTraderPnlData, "copyTraderFollowOneTraderPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.shareCopyTraderFollowOneTraderPnl(copyTraderFollowOneTraderPnlData, footerInfo, new Function1() { // from class: com.kubi.rn.core.turbo.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCopyTradingTurboModuleBridge.shareCopyTraderFollowOneTraderPnl$lambda$4(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    public void shareCopyTraderTotalPnl(@NotNull ReadableMap copyTraderTotalPnlData, @NotNull ReadableMap footerInfo, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(copyTraderTotalPnlData, "copyTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.shareCopyTraderTotalPnl(copyTraderTotalPnlData, footerInfo, new Function1() { // from class: com.kubi.rn.core.turbo.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCopyTradingTurboModuleBridge.shareCopyTraderTotalPnl$lambda$3(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    public void shareCopyTradingPosition(@NotNull ReadableMap copyTradingData, @NotNull ReadableMap footerInfo, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(copyTradingData, "copyTradingData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.shareCopyTradingPosition(copyTradingData, footerInfo, new Function1() { // from class: com.kubi.rn.core.turbo.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCopyTradingTurboModuleBridge.shareCopyTradingPosition$lambda$1(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    public void shareLeadTraderTotalPnl(@NotNull ReadableMap leadTraderTotalPnlData, @NotNull ReadableMap footerInfo, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(leadTraderTotalPnlData, "leadTraderTotalPnlData");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.shareLeadTraderTotalPnl(leadTraderTotalPnlData, footerInfo, new Function1() { // from class: com.kubi.rn.core.turbo.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCopyTradingTurboModuleBridge.shareLeadTraderTotalPnl$lambda$2(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    public void shareLeadUserInfo(@NotNull ReadableMap leadTradingUserInfo, @NotNull ReadableMap footerInfo, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(leadTradingUserInfo, "leadTradingUserInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.shareLeadUserInfo(leadTradingUserInfo, footerInfo, new Function1() { // from class: com.kubi.rn.core.turbo.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCopyTradingTurboModuleBridge.shareLeadUserInfo$lambda$5(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModuleSpec
    public void shareOptionPosition(@NotNull ReadableMap optionShareInfo, @NotNull ReadableMap footerInfo, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(optionShareInfo, "optionShareInfo");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.shareOptionPosition(optionShareInfo, footerInfo, new Function1() { // from class: com.kubi.rn.core.turbo.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCopyTradingTurboModuleBridge.shareOptionPosition$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
