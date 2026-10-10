package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSiteTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSiteTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeSiteTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeSiteTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeSiteTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeSiteTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "startChangeSite", "siteType", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "startChangeSiteDirectly", "isSiteTypeSupport", "getSupportSiteList", "Lcom/facebook/react/bridge/WritableMap;", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeSiteTurboModuleBridge extends NativeSiteTurboModuleSpec {

    @NotNull
    private final NativeSiteTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSiteTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeSiteTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isSiteTypeSupport$lambda$2(Promise promise, NativeSiteTurboModuleBridge nativeSiteTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSiteTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startChangeSite$lambda$0(Promise promise, NativeSiteTurboModuleBridge nativeSiteTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSiteTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startChangeSiteDirectly$lambda$1(Promise promise, NativeSiteTurboModuleBridge nativeSiteTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSiteTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeSiteTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Site";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleSpec
    @Nullable
    public WritableMap getSupportSiteList() {
        NativeSiteTurboModuleAbs nativeSiteTurboModuleAbs = this.impl;
        return nativeSiteTurboModuleAbs.wrapResult(nativeSiteTurboModuleAbs.getSupportSiteList());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleSpec
    public void isSiteTypeSupport(@NotNull String siteType, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.isSiteTypeSupport(siteType, new Function1() { // from class: com.kubi.rn.core.turbo.x3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSiteTurboModuleBridge.isSiteTypeSupport$lambda$2(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleSpec
    public void startChangeSite(@NotNull String siteType, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.startChangeSite(siteType, new Function1() { // from class: com.kubi.rn.core.turbo.w3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSiteTurboModuleBridge.startChangeSite$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteTurboModuleSpec
    public void startChangeSiteDirectly(@NotNull String siteType, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.startChangeSiteDirectly(siteType, new Function1() { // from class: com.kubi.rn.core.turbo.v3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSiteTurboModuleBridge.startChangeSiteDirectly$lambda$1(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
