package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGestureHandlerModule";

    @ReactMethod
    @InterfaceC44695a
    public abstract void attachGestureHandler(double d11, double d12, double d13);

    @ReactMethod
    @InterfaceC44695a
    public abstract void createGestureHandler(String str, double d11, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC44695a
    public abstract void dropGestureHandler(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void flushOperations();

    @ReactMethod
    @InterfaceC44695a
    public abstract void handleClearJSResponder();

    @ReactMethod
    @InterfaceC44695a
    public abstract void handleSetJSResponder(double d11, boolean z11);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract boolean install();

    @ReactMethod
    @InterfaceC44695a
    public abstract void updateGestureHandler(double d11, ReadableMap readableMap);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
