package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeKycTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Kyc";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap gotoBindEmail();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap gotoBindPhone();

    @ReactMethod
    @InterfaceC44695a
    public abstract void openAdvancedCertification(String str, String str2, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Kyc";
    }

    public NativeKycTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
