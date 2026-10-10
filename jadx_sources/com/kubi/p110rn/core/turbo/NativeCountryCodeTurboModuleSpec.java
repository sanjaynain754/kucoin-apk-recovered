package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeCountryCodeTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CountryCode";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getDefaultMobileCode(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap isCountryCodeValid(String str, String str2);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap isMobileCodeValid(String str, String str2);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap isVoiceCodeSupported(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void loadCountries(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void loadIpCountry(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void openPicker(String str, String str2, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CountryCode";
    }

    public NativeCountryCodeTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
