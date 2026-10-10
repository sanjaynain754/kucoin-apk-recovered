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

/* JADX INFO: compiled from: NativeHomeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeHomeTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeHomeTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeHomeTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeHomeTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeHomeTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "setHomeFeedRouteReadyState", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "recordStartupTrace", "Lcom/facebook/react/bridge/WritableMap;", "eventName", "properties", "Lcom/facebook/react/bridge/ReadableMap;", "setHomeBottomTabScrollToTopState", "enabled", "", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeHomeTurboModuleBridge extends NativeHomeTurboModuleSpec {

    @NotNull
    private final NativeHomeTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeHomeTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeHomeTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHomeBottomTabScrollToTopState$lambda$1(Promise promise, NativeHomeTurboModuleBridge nativeHomeTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeHomeTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHomeFeedRouteReadyState$lambda$0(Promise promise, NativeHomeTurboModuleBridge nativeHomeTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeHomeTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeHomeTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Home";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeTurboModuleSpec
    @Nullable
    public WritableMap recordStartupTrace(@NotNull String eventName, @Nullable ReadableMap properties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        NativeHomeTurboModuleAbs nativeHomeTurboModuleAbs = this.impl;
        return nativeHomeTurboModuleAbs.wrapResult(nativeHomeTurboModuleAbs.recordStartupTrace(eventName, properties));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeTurboModuleSpec
    public void setHomeBottomTabScrollToTopState(boolean enabled, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setHomeBottomTabScrollToTopState(enabled, new Function1() { // from class: com.kubi.rn.core.turbo.p1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeHomeTurboModuleBridge.setHomeBottomTabScrollToTopState$lambda$1(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeHomeTurboModuleSpec
    public void setHomeFeedRouteReadyState(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setHomeFeedRouteReadyState(new Function1() { // from class: com.kubi.rn.core.turbo.o1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeHomeTurboModuleBridge.setHomeFeedRouteReadyState$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
