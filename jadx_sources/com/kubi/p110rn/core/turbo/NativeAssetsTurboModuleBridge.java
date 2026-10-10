package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeAssetsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016JB\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J:\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u001c2\u0006\u0010&\u001a\u00020\u000bH\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020\u000bH\u0016J$\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006."}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeAssetsTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeAssetsTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeAssetsTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeAssetsTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeAssetsTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "jumpMultiAddFundsDialog", "sceneCode", FirebaseAnalytics.Param.CURRENCY, "fiatMoney", "defaultAccount", "defaultAccountAmount", "toAccountTag", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "jumpMultiAccountUseDialog", "jumpHoldEarnDialog", "jumpMultiAccountSelectDialog", "getHideAssetsEyeStatus", "Lcom/facebook/react/bridge/WritableMap;", "setHideAssetsEyeStatus", "isHide", "", "goBindEmail", "goBindGoogle", "goBindPhone", "goSetPassword", "getPnlCalcMethod", "setPnlCalcMethod", "methodName", "getPnlDaysRange", "setPnlDaysRange", "daysRange", "setPricingCurrency", "pricingCrypto", "pricingFiat", "openPnlDietalDialog", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeAssetsTurboModuleBridge extends NativeAssetsTurboModuleSpec {

    @NotNull
    private final NativeAssetsTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAssetsTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeAssetsTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goBindEmail$lambda$4(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goBindGoogle$lambda$5(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goBindPhone$lambda$6(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goSetPassword$lambda$7(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpHoldEarnDialog$lambda$2(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpMultiAccountSelectDialog$lambda$3(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpMultiAccountUseDialog$lambda$1(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpMultiAddFundsDialog$lambda$0(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPnlDietalDialog$lambda$9(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPricingCurrency$lambda$8(Promise promise, NativeAssetsTurboModuleBridge nativeAssetsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAssetsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    @Nullable
    public WritableMap getHideAssetsEyeStatus() {
        NativeAssetsTurboModuleAbs nativeAssetsTurboModuleAbs = this.impl;
        return nativeAssetsTurboModuleAbs.wrapResult(nativeAssetsTurboModuleAbs.getHideAssetsEyeStatus());
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeAssetsTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Assets";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    @Nullable
    public WritableMap getPnlCalcMethod() {
        NativeAssetsTurboModuleAbs nativeAssetsTurboModuleAbs = this.impl;
        return nativeAssetsTurboModuleAbs.wrapResult(nativeAssetsTurboModuleAbs.getPnlCalcMethod());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    @Nullable
    public WritableMap getPnlDaysRange() {
        NativeAssetsTurboModuleAbs nativeAssetsTurboModuleAbs = this.impl;
        return nativeAssetsTurboModuleAbs.wrapResult(nativeAssetsTurboModuleAbs.getPnlDaysRange());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void goBindEmail(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.goBindEmail(new Function1() { // from class: com.kubi.rn.core.turbo.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.goBindEmail$lambda$4(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void goBindGoogle(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.goBindGoogle(new Function1() { // from class: com.kubi.rn.core.turbo.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.goBindGoogle$lambda$5(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void goBindPhone(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.goBindPhone(new Function1() { // from class: com.kubi.rn.core.turbo.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.goBindPhone$lambda$6(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void goSetPassword(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.goSetPassword(new Function1() { // from class: com.kubi.rn.core.turbo.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.goSetPassword$lambda$7(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void jumpHoldEarnDialog(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.jumpHoldEarnDialog(new Function1() { // from class: com.kubi.rn.core.turbo.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.jumpHoldEarnDialog$lambda$2(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void jumpMultiAccountSelectDialog(@NotNull String sceneCode, @NotNull String currency, @Nullable String toAccountTag, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.jumpMultiAccountSelectDialog(sceneCode, currency, toAccountTag, new Function1() { // from class: com.kubi.rn.core.turbo.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.jumpMultiAccountSelectDialog$lambda$3(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void jumpMultiAccountUseDialog(@NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccountAmount, @Nullable String toAccountTag, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fiatMoney, "fiatMoney");
        Intrinsics.checkNotNullParameter(defaultAccountAmount, "defaultAccountAmount");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.jumpMultiAccountUseDialog(sceneCode, currency, fiatMoney, defaultAccountAmount, toAccountTag, new Function1() { // from class: com.kubi.rn.core.turbo.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.jumpMultiAccountUseDialog$lambda$1(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void jumpMultiAddFundsDialog(@NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccount, @NotNull String defaultAccountAmount, @Nullable String toAccountTag, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fiatMoney, "fiatMoney");
        Intrinsics.checkNotNullParameter(defaultAccount, "defaultAccount");
        Intrinsics.checkNotNullParameter(defaultAccountAmount, "defaultAccountAmount");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.jumpMultiAddFundsDialog(sceneCode, currency, fiatMoney, defaultAccount, defaultAccountAmount, toAccountTag, new Function1() { // from class: com.kubi.rn.core.turbo.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.jumpMultiAddFundsDialog$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void openPnlDietalDialog(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.openPnlDietalDialog(new Function1() { // from class: com.kubi.rn.core.turbo.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.openPnlDietalDialog$lambda$9(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    @Nullable
    public WritableMap setHideAssetsEyeStatus(boolean isHide) {
        NativeAssetsTurboModuleAbs nativeAssetsTurboModuleAbs = this.impl;
        return nativeAssetsTurboModuleAbs.wrapResult(nativeAssetsTurboModuleAbs.setHideAssetsEyeStatus(isHide));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    @Nullable
    public WritableMap setPnlCalcMethod(@NotNull String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        NativeAssetsTurboModuleAbs nativeAssetsTurboModuleAbs = this.impl;
        return nativeAssetsTurboModuleAbs.wrapResult(nativeAssetsTurboModuleAbs.setPnlCalcMethod(methodName));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    @Nullable
    public WritableMap setPnlDaysRange(@NotNull String daysRange) {
        Intrinsics.checkNotNullParameter(daysRange, "daysRange");
        NativeAssetsTurboModuleAbs nativeAssetsTurboModuleAbs = this.impl;
        return nativeAssetsTurboModuleAbs.wrapResult(nativeAssetsTurboModuleAbs.setPnlDaysRange(daysRange));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleSpec
    public void setPricingCurrency(@Nullable String pricingCrypto, @Nullable String pricingFiat, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setPricingCurrency(pricingCrypto, pricingFiat, new Function1() { // from class: com.kubi.rn.core.turbo.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAssetsTurboModuleBridge.setPricingCurrency$lambda$8(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
