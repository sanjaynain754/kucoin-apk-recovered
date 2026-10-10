package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeDeviceEventManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DeviceEventManager";

    @ReactMethod
    @InterfaceC44695a
    public abstract void invokeDefaultBackPressHandler();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DeviceEventManager";
    }

    public NativeDeviceEventManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
