package com.kubi.p110rn.core.turbo;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeCommonTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b-\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J!\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020\u000bH\u0016J\u0018\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010)\u001a\u0004\u0018\u00010\u0010H\u0016J\u0014\u0010*\u001a\u0004\u0018\u00010\u00102\b\u0010+\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010,\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010-\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010.\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u00100\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u00101\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u001a\u00102\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u00104\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u00105\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u00108\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u000b2\b\u00109\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010:\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010;\u001a\u0004\u0018\u00010\u00102\u0006\u0010<\u001a\u00020\u000bH\u0016J\n\u0010=\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010>\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010A\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010B\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010D\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010E\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010F\u001a\u0004\u0018\u00010\u00102\u0006\u0010G\u001a\u00020\u000bH\u0016J\u0012\u0010H\u001a\u0004\u0018\u00010\u00102\u0006\u0010G\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006I"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeCommonTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeCommonTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeCommonTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeCommonTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeCommonTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "getAppInfo", "Lcom/facebook/react/bridge/WritableMap;", "refreshAppSession", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getAppVersion", "showToast", "content", "setStatusStyle", TtmlNode.TAG_STYLE, "updateRnContainerUi", "type", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/facebook/react/bridge/WritableMap;", "close", "animated", "(Ljava/lang/Boolean;)Lcom/facebook/react/bridge/WritableMap;", "setNavSwipe", "canSwipe", "canIUse", "apiName", "openFlutterDialog", "route", "getAppNotificationPermissionEnabled", "openAppNotificationSettings", "showAppUpgradeAlert", "openSupportTicketPage", "formId", "refreshAppUserInfo", "reload", "sharePageView", "qrCodeUrl", "vibrate", "playAppSound", "showAddHomePageDialog", "shortcutId", "getPasteBoardContent", "copyToClipboard", "closeDialog", "dialogId", "submitData", "data", "getAllBizControlConfig", "queryBizControlConfig", "uiSpmId", "syncCpsFromApp", "getDeviceInfo", "setClipboardReadAccessOpen", "enabled", "getLegalPriceRate", "getFingerToken", "event", "openScan", "isUtaTrading", "getFormatSymbol", "symbol", "getContract", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeCommonTurboModuleBridge extends NativeCommonTurboModuleSpec {

    @NotNull
    private final NativeCommonTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCommonTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeCommonTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeDialog$lambda$9(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyToClipboard$lambda$8(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAppNotificationPermissionEnabled$lambda$2(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFingerToken$lambda$12(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPasteBoardContent$lambda$7(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openAppNotificationSettings$lambda$3(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openFlutterDialog$lambda$1(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, ReadableMap readableMap) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(readableMap));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openScan$lambda$13(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, OpenScanResult openScanResult) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(openScanResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAppSession$lambda$0(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAppUserInfo$lambda$4(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setClipboardReadAccessOpen$lambda$11(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sharePageView$lambda$5(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAddHomePageDialog$lambda$6(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitData$lambda$10(Promise promise, NativeCommonTurboModuleBridge nativeCommonTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeCommonTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap canIUse(@NotNull String apiName) {
        Intrinsics.checkNotNullParameter(apiName, "apiName");
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.canIUse(apiName));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap close(@Nullable Boolean animated) {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.close(animated));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void closeDialog(@Nullable String dialogId, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.closeDialog(dialogId, new Function1() { // from class: com.kubi.rn.core.turbo.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.closeDialog$lambda$9(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void copyToClipboard(@NotNull String content, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.copyToClipboard(content, new Function1() { // from class: com.kubi.rn.core.turbo.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.copyToClipboard$lambda$8(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap getAllBizControlConfig() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.getAllBizControlConfig());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap getAppInfo() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.getAppInfo());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void getAppNotificationPermissionEnabled(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getAppNotificationPermissionEnabled(new Function1() { // from class: com.kubi.rn.core.turbo.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.getAppNotificationPermissionEnabled$lambda$2(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap getAppVersion() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.getAppVersion());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap getContract(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.getContract(symbol));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap getDeviceInfo() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.getDeviceInfo());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void getFingerToken(@Nullable String event, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getFingerToken(event, new Function1() { // from class: com.kubi.rn.core.turbo.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.getFingerToken$lambda$12(promise, this, (String) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap getFormatSymbol(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.getFormatSymbol(symbol));
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeCommonTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap getLegalPriceRate() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.getLegalPriceRate());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Common";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void getPasteBoardContent(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getPasteBoardContent(new Function1() { // from class: com.kubi.rn.core.turbo.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.getPasteBoardContent$lambda$7(promise, this, (String) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap isUtaTrading() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.isUtaTrading());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void openAppNotificationSettings(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.openAppNotificationSettings(new Function1() { // from class: com.kubi.rn.core.turbo.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.openAppNotificationSettings$lambda$3(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void openFlutterDialog(@NotNull String route, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.openFlutterDialog(route, new Function1() { // from class: com.kubi.rn.core.turbo.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.openFlutterDialog$lambda$1(promise, this, (ReadableMap) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void openScan(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.openScan(new Function1() { // from class: com.kubi.rn.core.turbo.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.openScan$lambda$13(promise, this, (OpenScanResult) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap openSupportTicketPage(@Nullable String formId) {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.openSupportTicketPage(formId));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap playAppSound(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.playAppSound(type));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap queryBizControlConfig(@NotNull String uiSpmId) {
        Intrinsics.checkNotNullParameter(uiSpmId, "uiSpmId");
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.queryBizControlConfig(uiSpmId));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void refreshAppSession(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.refreshAppSession(new Function1() { // from class: com.kubi.rn.core.turbo.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.refreshAppSession$lambda$0(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void refreshAppUserInfo(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.refreshAppUserInfo(new Function1() { // from class: com.kubi.rn.core.turbo.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.refreshAppUserInfo$lambda$4(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap reload() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.reload());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void setClipboardReadAccessOpen(boolean enabled, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setClipboardReadAccessOpen(enabled, new Function1() { // from class: com.kubi.rn.core.turbo.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.setClipboardReadAccessOpen$lambda$11(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap setNavSwipe(boolean canSwipe) {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.setNavSwipe(canSwipe));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap setStatusStyle(@NotNull String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.setStatusStyle(style));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void sharePageView(@Nullable String qrCodeUrl, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.sharePageView(qrCodeUrl, new Function1() { // from class: com.kubi.rn.core.turbo.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.sharePageView$lambda$5(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void showAddHomePageDialog(@Nullable String shortcutId, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.showAddHomePageDialog(shortcutId, new Function1() { // from class: com.kubi.rn.core.turbo.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.showAddHomePageDialog$lambda$6(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap showAppUpgradeAlert() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.showAppUpgradeAlert());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap showToast(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.showToast(content));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    public void submitData(@Nullable String dialogId, @Nullable String data, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.submitData(dialogId, data, new Function1() { // from class: com.kubi.rn.core.turbo.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeCommonTurboModuleBridge.submitData$lambda$10(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap syncCpsFromApp() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.syncCpsFromApp());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap updateRnContainerUi(@NotNull String type, @Nullable Boolean enable) {
        Intrinsics.checkNotNullParameter(type, "type");
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.updateRnContainerUi(type, enable));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeCommonTurboModuleSpec
    @Nullable
    public WritableMap vibrate() {
        NativeCommonTurboModuleAbs nativeCommonTurboModuleAbs = this.impl;
        return nativeCommonTurboModuleAbs.wrapResult(nativeCommonTurboModuleAbs.vibrate());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
