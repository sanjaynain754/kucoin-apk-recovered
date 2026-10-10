package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeKrnSocketTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "startSocketTask", "Lcom/facebook/react/bridge/WritableMap;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "endSocketTask", "taskId", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeKrnSocketTurboModuleBridge extends NativeKrnSocketTurboModuleSpec {

    @NotNull
    private final NativeKrnSocketTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeKrnSocketTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeKrnSocketTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKrnSocketTurboModuleSpec
    @Nullable
    public WritableMap endSocketTask(@NotNull String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        NativeKrnSocketTurboModuleAbs nativeKrnSocketTurboModuleAbs = this.impl;
        return nativeKrnSocketTurboModuleAbs.wrapResult(nativeKrnSocketTurboModuleAbs.endSocketTask(taskId));
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeKrnSocketTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKrnSocketTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KrnSocket";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKrnSocketTurboModuleSpec
    @Nullable
    public WritableMap startSocketTask(@NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        NativeKrnSocketTurboModuleAbs nativeKrnSocketTurboModuleAbs = this.impl;
        return nativeKrnSocketTurboModuleAbs.wrapResult(nativeKrnSocketTurboModuleAbs.startSocketTask(config));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
