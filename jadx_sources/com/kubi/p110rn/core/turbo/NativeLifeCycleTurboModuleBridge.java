package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeLifeCycleTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J-\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "pageDidMount", "Lcom/facebook/react/bridge/WritableMap;", "pageType", "dclTime", "", "subPath", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeLifeCycleTurboModuleBridge extends NativeLifeCycleTurboModuleSpec {

    @NotNull
    private final NativeLifeCycleTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLifeCycleTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeLifeCycleTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeLifeCycleTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLifeCycleTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "LifeCycle";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLifeCycleTurboModuleSpec
    @Nullable
    public WritableMap pageDidMount(@Nullable String pageType, @Nullable Double dclTime, @Nullable String subPath) {
        NativeLifeCycleTurboModuleAbs nativeLifeCycleTurboModuleAbs = this.impl;
        return nativeLifeCycleTurboModuleAbs.wrapResult(nativeLifeCycleTurboModuleAbs.pageDidMount(pageType, dclTime, subPath));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
