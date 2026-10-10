package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeAuthTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Auth";

    @ReactMethod
    @InterfaceC44695a
    public abstract void appleAuthorize(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void appleAuthorizeV2(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void captchaAuthorize(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void captchaAuthorizeV2(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void googleAuthorizeV2(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap isGoogleSignInAvailable();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap isPasskeyEnabled();

    @ReactMethod
    @InterfaceC44695a
    public abstract void passkeyAuthorize(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void passkeyAuthorizeV2(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void telegramAuthorize(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void telegramAuthorizeV2(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Auth";
    }

    public NativeAuthTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
