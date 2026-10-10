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

/* JADX INFO: compiled from: NativeAuthTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006 "}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeAuthTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeAuthTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeAuthTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeAuthTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeAuthTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "captchaAuthorize", "bizType", "overrideHeaderAppToken", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "captchaAuthorizeV2", "appleAuthorize", "appleAuthorizeV2", "telegramAuthorize", "telegramAuthorizeV2", "passkeyAuthorize", "options", "passkeyAuthorizeV2", "isPasskeyEnabled", "Lcom/facebook/react/bridge/WritableMap;", "googleAuthorizeV2", "isGoogleSignInAvailable", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeAuthTurboModuleBridge extends NativeAuthTurboModuleSpec {

    @NotNull
    private final NativeAuthTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAuthTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeAuthTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appleAuthorize$lambda$2(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appleAuthorizeV2$lambda$3(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit captchaAuthorize$lambda$0(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit captchaAuthorizeV2$lambda$1(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit googleAuthorizeV2$lambda$8(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit passkeyAuthorize$lambda$6(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit passkeyAuthorizeV2$lambda$7(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit telegramAuthorize$lambda$4(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit telegramAuthorizeV2$lambda$5(Promise promise, NativeAuthTurboModuleBridge nativeAuthTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeAuthTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void appleAuthorize(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.appleAuthorize(new Function1() { // from class: com.kubi.rn.core.turbo.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.appleAuthorize$lambda$2(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void appleAuthorizeV2(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.appleAuthorizeV2(new Function1() { // from class: com.kubi.rn.core.turbo.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.appleAuthorizeV2$lambda$3(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void captchaAuthorize(@NotNull String bizType, @Nullable String overrideHeaderAppToken, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.captchaAuthorize(bizType, overrideHeaderAppToken, new Function1() { // from class: com.kubi.rn.core.turbo.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.captchaAuthorize$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void captchaAuthorizeV2(@NotNull String bizType, @Nullable String overrideHeaderAppToken, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.captchaAuthorizeV2(bizType, overrideHeaderAppToken, new Function1() { // from class: com.kubi.rn.core.turbo.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.captchaAuthorizeV2$lambda$1(promise, this, (ReadableMap) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeAuthTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Auth";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void googleAuthorizeV2(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.googleAuthorizeV2(new Function1() { // from class: com.kubi.rn.core.turbo.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.googleAuthorizeV2$lambda$8(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    @Nullable
    public WritableMap isGoogleSignInAvailable() {
        NativeAuthTurboModuleAbs nativeAuthTurboModuleAbs = this.impl;
        return nativeAuthTurboModuleAbs.wrapResult(nativeAuthTurboModuleAbs.isGoogleSignInAvailable());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    @Nullable
    public WritableMap isPasskeyEnabled() {
        NativeAuthTurboModuleAbs nativeAuthTurboModuleAbs = this.impl;
        return nativeAuthTurboModuleAbs.wrapResult(nativeAuthTurboModuleAbs.isPasskeyEnabled());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void passkeyAuthorize(@NotNull String options, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.passkeyAuthorize(options, new Function1() { // from class: com.kubi.rn.core.turbo.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.passkeyAuthorize$lambda$6(promise, this, (String) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void passkeyAuthorizeV2(@NotNull String options, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.passkeyAuthorizeV2(options, new Function1() { // from class: com.kubi.rn.core.turbo.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.passkeyAuthorizeV2$lambda$7(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void telegramAuthorize(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.telegramAuthorize(new Function1() { // from class: com.kubi.rn.core.turbo.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.telegramAuthorize$lambda$4(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleSpec
    public void telegramAuthorizeV2(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.telegramAuthorizeV2(new Function1() { // from class: com.kubi.rn.core.turbo.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeAuthTurboModuleBridge.telegramAuthorizeV2$lambda$5(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
