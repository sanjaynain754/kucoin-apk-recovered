package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeFileTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J3\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016JC\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u001fJ6\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006#"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeFileTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeFileTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeFileTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeFileTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeFileTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "pickFile", "fileTypes", BridgeParamKeyKt.MAX_COUNT, "", "maxSize", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/facebook/react/bridge/Promise;)V", "previewFile", "isRemoteUrl", "", "fileUrl", "fileName", "headers", "Lcom/facebook/react/bridge/ReadableMap;", "allowShare", "(ZLjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V", "downloadFile", "url", "target", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeFileTurboModuleBridge extends NativeFileTurboModuleSpec {

    @NotNull
    private final NativeFileTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeFileTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeFileTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadFile$lambda$2(Promise promise, NativeFileTurboModuleBridge nativeFileTurboModuleBridge, FileActionResult fileActionResult) {
        if (promise != null) {
            promise.resolve(nativeFileTurboModuleBridge.impl.wrapResult(fileActionResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pickFile$lambda$0(Promise promise, NativeFileTurboModuleBridge nativeFileTurboModuleBridge, PickFileResult pickFileResult) {
        if (promise != null) {
            promise.resolve(nativeFileTurboModuleBridge.impl.wrapResult(pickFileResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit previewFile$lambda$1(Promise promise, NativeFileTurboModuleBridge nativeFileTurboModuleBridge, FileActionResult fileActionResult) {
        if (promise != null) {
            promise.resolve(nativeFileTurboModuleBridge.impl.wrapResult(fileActionResult));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFileTurboModuleSpec
    public void downloadFile(@NotNull String url, @Nullable String fileName, @Nullable ReadableMap headers, @Nullable String target, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.downloadFile(url, fileName, headers, target, new Function1() { // from class: com.kubi.rn.core.turbo.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeFileTurboModuleBridge.downloadFile$lambda$2(promise, this, (FileActionResult) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeFileTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFileTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "File";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFileTurboModuleSpec
    public void pickFile(@Nullable String fileTypes, @Nullable Double maxCount, @Nullable Double maxSize, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.pickFile(fileTypes, maxCount, maxSize, new Function1() { // from class: com.kubi.rn.core.turbo.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeFileTurboModuleBridge.pickFile$lambda$0(promise, this, (PickFileResult) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFileTurboModuleSpec
    public void previewFile(boolean isRemoteUrl, @NotNull String fileUrl, @Nullable String fileName, @Nullable ReadableMap headers, @Nullable Boolean allowShare, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.previewFile(isRemoteUrl, fileUrl, fileName, headers, allowShare, new Function1() { // from class: com.kubi.rn.core.turbo.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeFileTurboModuleBridge.previewFile$lambda$1(promise, this, (FileActionResult) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
