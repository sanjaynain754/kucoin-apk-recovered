package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeShareTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0081\u0001\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J1\u0010\"\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010%J\u0018\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006("}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeShareTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeShareTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeShareTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeShareTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeShareTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", FirebaseAnalytics.Event.SHARE, "category", "utmSource", "rcode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "onlyDarkMode", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "data", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "saveShareImage", "imgData", "showShareView", SignTermItem.LINK, "isCopyText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V", "shareWithOptions", "options", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeShareTurboModuleBridge extends NativeShareTurboModuleSpec {

    @NotNull
    private final NativeShareTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShareTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeShareTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveShareImage$lambda$1(Promise promise, NativeShareTurboModuleBridge nativeShareTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeShareTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit share$lambda$0(Promise promise, NativeShareTurboModuleBridge nativeShareTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeShareTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareWithOptions$lambda$3(Promise promise, NativeShareTurboModuleBridge nativeShareTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeShareTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showShareView$lambda$2(Promise promise, NativeShareTurboModuleBridge nativeShareTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeShareTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeShareTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Share";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleSpec
    public void saveShareImage(@NotNull String imgData, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(imgData, "imgData");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.saveShareImage(imgData, new Function1() { // from class: com.kubi.rn.core.turbo.o3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeShareTurboModuleBridge.saveShareImage$lambda$1(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleSpec
    public void share(@NotNull String category, @Nullable String utmSource, @Nullable String rcode, @Nullable String pic, @Nullable String qrCodeUrl, @Nullable Boolean needQrCode, @Nullable Boolean onlyDarkMode, @Nullable String title, @Nullable String content, @Nullable String linkUrl, @Nullable ReadableMap data, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.share(category, utmSource, rcode, pic, qrCodeUrl, needQrCode, onlyDarkMode, title, content, linkUrl, data, new Function1() { // from class: com.kubi.rn.core.turbo.p3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeShareTurboModuleBridge.share$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleSpec
    public void shareWithOptions(@NotNull ReadableMap options, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.shareWithOptions(options, new Function1() { // from class: com.kubi.rn.core.turbo.q3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeShareTurboModuleBridge.shareWithOptions$lambda$3(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeShareTurboModuleSpec
    public void showShareView(@NotNull String content, @Nullable String link, @Nullable Boolean isCopyText, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.showShareView(content, link, isCopyText, new Function1() { // from class: com.kubi.rn.core.turbo.r3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeShareTurboModuleBridge.showShareView$lambda$2(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
