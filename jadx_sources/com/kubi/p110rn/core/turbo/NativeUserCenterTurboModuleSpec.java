package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeUserCenterTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "UserCenter";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap fetchTermId(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap fetchTermInfo();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getAccountInfoById(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getAlternativeAccounts();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getReferralCode();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getUserInfo();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap gotoCheckLoginPage(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap handleChooseResidenceCallback(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC44695a
    public abstract void logoutAccounts(ReadableArray readableArray, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void openChooseResidence(ReadableMap readableMap, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap persistUserData(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap removeAccounts(ReadableArray readableArray);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setActiveAccount(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap supportDeactivateAccount();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "UserCenter";
    }

    public NativeUserCenterTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
