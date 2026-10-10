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
public abstract class NativeSensorTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Sensor";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap fastFetchBoolTest(String str, boolean z11);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap fastFetchIntegerTest(String str, double d11);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap fastFetchJsonTest(String str, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap fastFetchStringTest(String str, String str2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void fetchKcAbTest(String str, String str2, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap sensorsExpose(String str, String str2, String str3, String str4, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap sensorsTrackTurbo(String str, ReadableMap readableMap);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Sensor";
    }

    public NativeSensorTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
