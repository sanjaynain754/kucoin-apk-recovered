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
public abstract class NativeFuturesTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Futures";

    @ReactMethod
    @InterfaceC44695a
    public abstract void getFeaturesConfig(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap handleMenuAction(String str, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shareFuturesPositionPnl(ReadableMap readableMap, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Futures";
    }

    public NativeFuturesTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
