package com.kubi.p110rn.core.turbo;

import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSecurityTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSecurityTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeSecurityTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeSecurityTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeSecurityTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeSecurityTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "refreshTokenByManual", "refreshTimeLimit", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "advanceLivenessRecognition", AppsFlyerProperties.CHANNEL, "advanceToken", "bizType", "handleSafeSecurityCallback", "Lcom/facebook/react/bridge/WritableMap;", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "hasLogin", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeSecurityTurboModuleBridge extends NativeSecurityTurboModuleSpec {

    @NotNull
    private final NativeSecurityTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSecurityTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeSecurityTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit advanceLivenessRecognition$lambda$1(Promise promise, NativeSecurityTurboModuleBridge nativeSecurityTurboModuleBridge, FaceResultInfo faceResultInfo) {
        if (promise != null) {
            promise.resolve(nativeSecurityTurboModuleBridge.impl.wrapResult(faceResultInfo));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshTokenByManual$lambda$0(Promise promise, NativeSecurityTurboModuleBridge nativeSecurityTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSecurityTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSecurityTurboModuleSpec
    public void advanceLivenessRecognition(@NotNull String channel, @NotNull String advanceToken, @NotNull String bizType, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(advanceToken, "advanceToken");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.advanceLivenessRecognition(channel, advanceToken, bizType, new Function1() { // from class: com.kubi.rn.core.turbo.k3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSecurityTurboModuleBridge.advanceLivenessRecognition$lambda$1(promise, this, (FaceResultInfo) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeSecurityTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSecurityTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Security";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSecurityTurboModuleSpec
    @Nullable
    public WritableMap handleSafeSecurityCallback(@NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        NativeSecurityTurboModuleAbs nativeSecurityTurboModuleAbs = this.impl;
        return nativeSecurityTurboModuleAbs.wrapResult(nativeSecurityTurboModuleAbs.handleSafeSecurityCallback(params));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSecurityTurboModuleSpec
    @Nullable
    public WritableMap hasLogin() {
        NativeSecurityTurboModuleAbs nativeSecurityTurboModuleAbs = this.impl;
        return nativeSecurityTurboModuleAbs.wrapResult(nativeSecurityTurboModuleAbs.hasLogin());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSecurityTurboModuleSpec
    public void refreshTokenByManual(double refreshTimeLimit, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.refreshTokenByManual(refreshTimeLimit, new Function1() { // from class: com.kubi.rn.core.turbo.j3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSecurityTurboModuleBridge.refreshTokenByManual$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
