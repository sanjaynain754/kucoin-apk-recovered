package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Timing";

    @ReactMethod
    @InterfaceC44695a
    public abstract void createTimer(double d11, double d12, double d13, boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void deleteTimer(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setSendIdleEvents(boolean z11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Timing";
    }

    public NativeTimingSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
