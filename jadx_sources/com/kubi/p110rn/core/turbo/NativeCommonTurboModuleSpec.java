package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeCommonTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Common";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap canIUse(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap close(Boolean bool);

    @ReactMethod
    @InterfaceC44695a
    public abstract void closeDialog(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void copyToClipboard(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getAllBizControlConfig();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getAppInfo();

    @ReactMethod
    @InterfaceC44695a
    public abstract void getAppNotificationPermissionEnabled(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getAppVersion();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getContract(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getDeviceInfo();

    @ReactMethod
    @InterfaceC44695a
    public abstract void getFingerToken(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getFormatSymbol(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getLegalPriceRate();

    @ReactMethod
    @InterfaceC44695a
    public abstract void getPasteBoardContent(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap isUtaTrading();

    @ReactMethod
    @InterfaceC44695a
    public abstract void openAppNotificationSettings(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void openFlutterDialog(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void openScan(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap openSupportTicketPage(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap playAppSound(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap queryBizControlConfig(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void refreshAppSession(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void refreshAppUserInfo(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap reload();

    @ReactMethod
    @InterfaceC44695a
    public abstract void setClipboardReadAccessOpen(boolean z11, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap setNavSwipe(boolean z11);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap setStatusStyle(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void sharePageView(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void showAddHomePageDialog(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap showAppUpgradeAlert();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap showToast(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void submitData(String str, String str2, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap syncCpsFromApp();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap updateRnContainerUi(String str, Boolean bool);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap vibrate();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Common";
    }

    public NativeCommonTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
