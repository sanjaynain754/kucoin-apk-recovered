package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeSecurityTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Security";

    @ReactMethod
    @InterfaceC44695a
    public abstract void advanceLivenessRecognition(String str, String str2, String str3, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap handleSafeSecurityCallback(ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap hasLogin();

    @ReactMethod
    @InterfaceC44695a
    public abstract void refreshTokenByManual(double d11, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Security";
    }

    public NativeSecurityTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
