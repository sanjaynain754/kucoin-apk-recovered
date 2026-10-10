package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Networking";

    @ReactMethod
    @InterfaceC44695a
    public abstract void abortRequest(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void clearCookies(Callback callback);

    @ReactMethod
    @InterfaceC44695a
    public abstract void removeListeners(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void sendRequest(String str, String str2, double d11, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z11, double d12, boolean z12);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeNetworkingAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
