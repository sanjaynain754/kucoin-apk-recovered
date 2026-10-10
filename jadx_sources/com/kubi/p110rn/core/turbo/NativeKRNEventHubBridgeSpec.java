package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeKRNEventHubBridgeSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "KRNEventHubBridge";

    @ReactMethod
    @InterfaceC44695a
    public abstract void getContext(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void publish(String str, ReadableMap readableMap, ReadableMap readableMap2, String str2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void subscribe(String str, boolean z11, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void unsubscribe(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KRNEventHubBridge";
    }

    public NativeKRNEventHubBridgeSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
