package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeLocaleTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeLocaleTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeLocaleTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeLocaleTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeLocaleTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeLocaleTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "getPrefetchedLocales", "data", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "setKeyboardManagerOptionEnabled", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "enabled", "", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeLocaleTurboModuleBridge extends NativeLocaleTurboModuleSpec {

    @NotNull
    private final NativeLocaleTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLocaleTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeLocaleTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPrefetchedLocales$lambda$0(Promise promise, NativeLocaleTurboModuleBridge nativeLocaleTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeLocaleTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setKeyboardManagerOptionEnabled$lambda$1(Promise promise, NativeLocaleTurboModuleBridge nativeLocaleTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeLocaleTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeLocaleTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLocaleTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Locale";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLocaleTurboModuleSpec
    public void getPrefetchedLocales(@NotNull ReadableMap data, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getPrefetchedLocales(data, new Function1() { // from class: com.kubi.rn.core.turbo.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeLocaleTurboModuleBridge.getPrefetchedLocales$lambda$0(promise, this, (String) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLocaleTurboModuleSpec
    public void setKeyboardManagerOptionEnabled(@NotNull String option, boolean enabled, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setKeyboardManagerOptionEnabled(option, enabled, new Function1() { // from class: com.kubi.rn.core.turbo.e2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeLocaleTurboModuleBridge.setKeyboardManagerOptionEnabled$lambda$1(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
