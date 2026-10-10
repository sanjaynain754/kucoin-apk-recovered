package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.Constants;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeStorageTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J$\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeStorageTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeStorageTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeStorageTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeStorageTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeStorageTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "setItem", "Lcom/facebook/react/bridge/WritableMap;", "key", "value", "Lcom/facebook/react/bridge/ReadableMap;", Constants.BIZ, "getItem", "removeItem", "containsKey", "getAllKeys", "clear", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeStorageTurboModuleBridge extends NativeStorageTurboModuleSpec {

    @NotNull
    private final NativeStorageTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeStorageTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeStorageTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @Nullable
    public WritableMap clear(@Nullable String biz) {
        NativeStorageTurboModuleAbs nativeStorageTurboModuleAbs = this.impl;
        return nativeStorageTurboModuleAbs.wrapResult(nativeStorageTurboModuleAbs.clear(biz));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @Nullable
    public WritableMap containsKey(@NotNull String key, @Nullable String biz) {
        Intrinsics.checkNotNullParameter(key, "key");
        NativeStorageTurboModuleAbs nativeStorageTurboModuleAbs = this.impl;
        return nativeStorageTurboModuleAbs.wrapResult(nativeStorageTurboModuleAbs.containsKey(key, biz));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @Nullable
    public WritableMap getAllKeys(@Nullable String biz) {
        NativeStorageTurboModuleAbs nativeStorageTurboModuleAbs = this.impl;
        return nativeStorageTurboModuleAbs.wrapResult(nativeStorageTurboModuleAbs.getAllKeys(biz));
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeStorageTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @Nullable
    public WritableMap getItem(@NotNull String key, @Nullable String biz) {
        Intrinsics.checkNotNullParameter(key, "key");
        NativeStorageTurboModuleAbs nativeStorageTurboModuleAbs = this.impl;
        return nativeStorageTurboModuleAbs.wrapResult(nativeStorageTurboModuleAbs.getItem(key, biz));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Storage";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @Nullable
    public WritableMap removeItem(@NotNull String key, @Nullable String biz) {
        Intrinsics.checkNotNullParameter(key, "key");
        NativeStorageTurboModuleAbs nativeStorageTurboModuleAbs = this.impl;
        return nativeStorageTurboModuleAbs.wrapResult(nativeStorageTurboModuleAbs.removeItem(key, biz));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @Nullable
    public WritableMap setItem(@NotNull String key, @NotNull ReadableMap value, @Nullable String biz) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        NativeStorageTurboModuleAbs nativeStorageTurboModuleAbs = this.impl;
        return nativeStorageTurboModuleAbs.wrapResult(nativeStorageTurboModuleAbs.setItem(key, value, biz));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
