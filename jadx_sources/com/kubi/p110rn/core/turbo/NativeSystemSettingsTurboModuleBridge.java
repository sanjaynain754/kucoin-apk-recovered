package com.kubi.p110rn.core.turbo;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeSystemSettingsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0016J \u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010(\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010*\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010+\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010,\u001a\u0004\u0018\u00010\u0010H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006-"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModuleBridge;", "Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModuleSpec;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", C33954u6.f72233d, "Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModuleAbs;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModuleAbs;)V", "getImpl$app_modules_release", "()Lcom/kubi/rn/core/turbo/NativeSystemSettingsTurboModuleAbs;", "getName", "", "initialize", "", "onCatalystInstanceDestroy", "getLanguageList", "Lcom/facebook/react/bridge/WritableMap;", "getCurrencyList", "changeLanguage", "language", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "changeCurrency", FirebaseAnalytics.Param.CURRENCY, "getSoundSettings", "setSoundSetting", "settingKey", "enabled", "", "closeAllSoundSettings", "getSettingsSnapshot", "getAppTheme", "getCacheSize", "setAppTheme", "mode", "setUpDownColor", TtmlNode.TAG_STYLE, "setVolumeUnit", "index", "", "clearCache", "uploadMobileLog", "logout", "getEnvironmentInfo", "getTestFlightConfig", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeSystemSettingsTurboModuleBridge extends NativeSystemSettingsTurboModuleSpec {

    @NotNull
    private final NativeSystemSettingsTurboModuleAbs impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeSystemSettingsTurboModuleBridge(@NotNull ReactApplicationContext ctx, @NotNull NativeSystemSettingsTurboModuleAbs impl) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeCurrency$lambda$1(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, OperationResult operationResult) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(operationResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeLanguage$lambda$0(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, OperationResult operationResult) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(operationResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearCache$lambda$9(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeAllSoundSettings$lambda$3(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCacheSize$lambda$5(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, String str) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSettingsSnapshot$lambda$4(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, SettingsSnapshot settingsSnapshot) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(settingsSnapshot));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logout$lambda$11(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, OperationResult operationResult) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(operationResult));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAppTheme$lambda$6(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSoundSetting$lambda$2(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpDownColor$lambda$7(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setVolumeUnit$lambda$8(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadMobileLog$lambda$10(Promise promise, NativeSystemSettingsTurboModuleBridge nativeSystemSettingsTurboModuleBridge, Boolean bool) {
        if (promise != null) {
            promise.resolve(nativeSystemSettingsTurboModuleBridge.impl.wrapResult(bool));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void changeCurrency(@NotNull String currency, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.changeCurrency(currency, new Function1() { // from class: com.kubi.rn.core.turbo.y4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.changeCurrency$lambda$1(promise, this, (OperationResult) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void changeLanguage(@NotNull String language, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.changeLanguage(language, new Function1() { // from class: com.kubi.rn.core.turbo.x4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.changeLanguage$lambda$0(promise, this, (OperationResult) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void clearCache(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.clearCache(new Function1() { // from class: com.kubi.rn.core.turbo.q4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.clearCache$lambda$9(promise, this, (String) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void closeAllSoundSettings(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.closeAllSoundSettings(new Function1() { // from class: com.kubi.rn.core.turbo.t4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.closeAllSoundSettings$lambda$3(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    @Nullable
    public WritableMap getAppTheme() {
        NativeSystemSettingsTurboModuleAbs nativeSystemSettingsTurboModuleAbs = this.impl;
        return nativeSystemSettingsTurboModuleAbs.wrapResult(nativeSystemSettingsTurboModuleAbs.getAppTheme());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void getCacheSize(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getCacheSize(new Function1() { // from class: com.kubi.rn.core.turbo.z4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.getCacheSize$lambda$5(promise, this, (String) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    @Nullable
    public WritableMap getCurrencyList() {
        NativeSystemSettingsTurboModuleAbs nativeSystemSettingsTurboModuleAbs = this.impl;
        return nativeSystemSettingsTurboModuleAbs.wrapResult(nativeSystemSettingsTurboModuleAbs.getCurrencyList());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    @Nullable
    public WritableMap getEnvironmentInfo() {
        NativeSystemSettingsTurboModuleAbs nativeSystemSettingsTurboModuleAbs = this.impl;
        return nativeSystemSettingsTurboModuleAbs.wrapResult(nativeSystemSettingsTurboModuleAbs.getEnvironmentInfo());
    }

    @NotNull
    /* JADX INFO: renamed from: getImpl$app_modules_release, reason: from getter */
    public final NativeSystemSettingsTurboModuleAbs getImpl() {
        return this.impl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    @Nullable
    public WritableMap getLanguageList() {
        NativeSystemSettingsTurboModuleAbs nativeSystemSettingsTurboModuleAbs = this.impl;
        return nativeSystemSettingsTurboModuleAbs.wrapResult(nativeSystemSettingsTurboModuleAbs.getLanguageList());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "SystemSettings";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void getSettingsSnapshot(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getSettingsSnapshot(new Function1() { // from class: com.kubi.rn.core.turbo.w4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.getSettingsSnapshot$lambda$4(promise, this, (SettingsSnapshot) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    @Nullable
    public WritableMap getSoundSettings() {
        NativeSystemSettingsTurboModuleAbs nativeSystemSettingsTurboModuleAbs = this.impl;
        return nativeSystemSettingsTurboModuleAbs.wrapResult(nativeSystemSettingsTurboModuleAbs.getSoundSettings());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    @Nullable
    public WritableMap getTestFlightConfig() {
        NativeSystemSettingsTurboModuleAbs nativeSystemSettingsTurboModuleAbs = this.impl;
        return nativeSystemSettingsTurboModuleAbs.wrapResult(nativeSystemSettingsTurboModuleAbs.getTestFlightConfig());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void logout(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.logout(new Function1() { // from class: com.kubi.rn.core.turbo.u4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.logout$lambda$11(promise, this, (OperationResult) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.impl.onCatalystInstanceDestroy();
        super.onCatalystInstanceDestroy();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void setAppTheme(@NotNull String mode, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setAppTheme(mode, new Function1() { // from class: com.kubi.rn.core.turbo.a5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.setAppTheme$lambda$6(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void setSoundSetting(@NotNull String settingKey, boolean enabled, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(settingKey, "settingKey");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setSoundSetting(settingKey, enabled, new Function1() { // from class: com.kubi.rn.core.turbo.v4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.setSoundSetting$lambda$2(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void setUpDownColor(@NotNull String style, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setUpDownColor(style, new Function1() { // from class: com.kubi.rn.core.turbo.r4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.setUpDownColor$lambda$7(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void setVolumeUnit(double index, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.setVolumeUnit(index, new Function1() { // from class: com.kubi.rn.core.turbo.s4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.setVolumeUnit$lambda$8(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModuleSpec
    public void uploadMobileLog(@NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.uploadMobileLog(new Function1() { // from class: com.kubi.rn.core.turbo.b5
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeSystemSettingsTurboModuleBridge.uploadMobileLog$lambda$10(promise, this, (Boolean) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.impl.initialize();
    }
}
