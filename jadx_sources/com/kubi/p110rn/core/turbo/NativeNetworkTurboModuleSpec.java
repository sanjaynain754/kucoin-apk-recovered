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
public abstract class NativeNetworkTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Network";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getClientNetworkConfig();

    @ReactMethod
    @InterfaceC44695a
    public abstract void httpRequest(String str, String str2, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void request(String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void uploadFile(String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void uploadFileV2(String str, ReadableMap readableMap, String str2, ReadableMap readableMap2, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Network";
    }

    public NativeNetworkTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
