package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ExceptionsManager";

    @ReactMethod
    @InterfaceC44695a
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeExceptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC44695a
    public void dismissRedbox() {
    }

    @ReactMethod
    @InterfaceC44695a
    public void reportException(ReadableMap readableMap) {
    }
}
