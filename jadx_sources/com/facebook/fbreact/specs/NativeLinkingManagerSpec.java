package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LinkingManager";

    @ReactMethod
    @InterfaceC44695a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void canOpenURL(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getInitialURL(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void openSettings(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void openURL(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void removeListeners(double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeLinkingManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
