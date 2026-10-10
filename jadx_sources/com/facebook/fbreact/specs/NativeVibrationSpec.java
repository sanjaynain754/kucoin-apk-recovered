package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeVibrationSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Vibration";

    @ReactMethod
    @InterfaceC44695a
    public abstract void cancel();

    @ReactMethod
    @InterfaceC44695a
    public abstract void vibrate(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void vibrateByPattern(ReadableArray readableArray, double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Vibration";
    }

    public NativeVibrationSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
