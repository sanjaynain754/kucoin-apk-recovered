package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeSystemSettingsTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SystemSettings";

    @ReactMethod
    @InterfaceC44695a
    public abstract void changeCurrency(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void changeLanguage(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void clearCache(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void closeAllSoundSettings(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getAppTheme();

    @ReactMethod
    @InterfaceC44695a
    public abstract void getCacheSize(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getCurrencyList();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getEnvironmentInfo();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getLanguageList();

    @ReactMethod
    @InterfaceC44695a
    public abstract void getSettingsSnapshot(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getSoundSettings();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getTestFlightConfig();

    @ReactMethod
    @InterfaceC44695a
    public abstract void logout(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setAppTheme(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setSoundSetting(String str, boolean z11, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setUpDownColor(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setVolumeUnit(double d11, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void uploadMobileLog(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SystemSettings";
    }

    public NativeSystemSettingsTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
