package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeNetworkTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J4\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J(\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J4\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J4\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeNetworkTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeNetworkTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeNetworkTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeNetworkTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeNetworkTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "request", "url", FirebaseAnalytics.Param.METHOD, "data", "Lcom/facebook/react/bridge/ReadableMap;", "headers", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "httpRequest", "config", "getClientNetworkConfig", "Lcom/facebook/react/bridge/WritableMap;", "uploadFile", "file", ReportDataTable.COLUMN_PARAMS, "uploadFileV2", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeNetworkTurboModuleBridge extends NativeNetworkTurboModuleSpec {

    @NotNull
    private final NativeNetworkTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeNetworkTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeNetworkTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit httpRequest$lambda$1(Promise promise, NativeNetworkTurboModuleBridge nativeNetworkTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeNetworkTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit request$lambda$0(Promise promise, NativeNetworkTurboModuleBridge nativeNetworkTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeNetworkTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadFile$lambda$2(Promise promise, NativeNetworkTurboModuleBridge nativeNetworkTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeNetworkTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadFileV2$lambda$3(Promise promise, NativeNetworkTurboModuleBridge nativeNetworkTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeNetworkTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleSpec
    @Nullable
    public WritableMap getClientNetworkConfig() {
        NativeNetworkTurboModuleAbs nativeNetworkTurboModuleAbs = this.impl;
        return nativeNetworkTurboModuleAbs.wrapResult(nativeNetworkTurboModuleAbs.getClientNetworkConfig());
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeNetworkTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Network";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleSpec
    public void httpRequest(@NotNull String url, @NotNull String method, @NotNull ReadableMap config, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.httpRequest(url, method, config, new Function1() { // from class: com.kubi.rn.core.turbo.m2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeNetworkTurboModuleBridge.httpRequest$lambda$1(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleSpec
    public void request(@NotNull String url, @NotNull String method, @Nullable ReadableMap data, @Nullable ReadableMap headers, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.request(url, method, data, headers, new Function1() { // from class: com.kubi.rn.core.turbo.k2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeNetworkTurboModuleBridge.request$lambda$0(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleSpec
    public void uploadFile(@NotNull String url, @NotNull ReadableMap file, @Nullable ReadableMap params, @Nullable ReadableMap headers, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.uploadFile(url, file, params, headers, new Function1() { // from class: com.kubi.rn.core.turbo.l2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeNetworkTurboModuleBridge.uploadFile$lambda$2(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeNetworkTurboModuleSpec
    public void uploadFileV2(@NotNull String url, @NotNull ReadableMap file, @Nullable String method, @Nullable ReadableMap config, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.uploadFileV2(url, file, method, config, new Function1() { // from class: com.kubi.rn.core.turbo.j2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeNetworkTurboModuleBridge.uploadFileV2$lambda$3(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
