package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeAssetsTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Assets";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getHideAssetsEyeStatus();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getPnlCalcMethod();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getPnlDaysRange();

    @ReactMethod
    @InterfaceC44695a
    public abstract void goBindEmail(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void goBindGoogle(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void goBindPhone(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void goSetPassword(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void jumpHoldEarnDialog(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void jumpMultiAccountSelectDialog(String str, String str2, String str3, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void jumpMultiAccountUseDialog(String str, String str2, String str3, String str4, String str5, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void jumpMultiAddFundsDialog(String str, String str2, String str3, String str4, String str5, String str6, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void openPnlDietalDialog(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap setHideAssetsEyeStatus(boolean z11);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap setPnlCalcMethod(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap setPnlDaysRange(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setPricingCurrency(String str, String str2, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Assets";
    }

    public NativeAssetsTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
