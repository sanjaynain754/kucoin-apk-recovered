package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "WebSocketModule";

    @ReactMethod
    @InterfaceC44695a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void close(double d11, String str, double d12);

    @ReactMethod
    @InterfaceC44695a
    public abstract void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void ping(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void removeListeners(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void send(String str, double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void sendBinary(String str, double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeWebSocketModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
