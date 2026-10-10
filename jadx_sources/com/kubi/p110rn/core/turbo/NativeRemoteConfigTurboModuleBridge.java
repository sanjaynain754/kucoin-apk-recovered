package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeRemoteConfigTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeRemoteConfigTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeRemoteConfigTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeRemoteConfigTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeRemoteConfigTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeRemoteConfigTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "fastFetchAbTest", "Lcom/facebook/react/bridge/WritableMap;", "paramName", "defaultValue", "getRemoteConfig", "key", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeRemoteConfigTurboModuleBridge extends NativeRemoteConfigTurboModuleSpec {

    @NotNull
    private final NativeRemoteConfigTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeRemoteConfigTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeRemoteConfigTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeRemoteConfigTurboModuleSpec
    @Nullable
    public WritableMap fastFetchAbTest(@NotNull String paramName, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        NativeRemoteConfigTurboModuleAbs nativeRemoteConfigTurboModuleAbs = this.impl;
        return nativeRemoteConfigTurboModuleAbs.wrapResult(nativeRemoteConfigTurboModuleAbs.fastFetchAbTest(paramName, defaultValue));
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeRemoteConfigTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeRemoteConfigTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RemoteConfig";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeRemoteConfigTurboModuleSpec
    @Nullable
    public WritableMap getRemoteConfig(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        NativeRemoteConfigTurboModuleAbs nativeRemoteConfigTurboModuleAbs = this.impl;
        return nativeRemoteConfigTurboModuleAbs.wrapResult(nativeRemoteConfigTurboModuleAbs.getRemoteConfig(key));
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
