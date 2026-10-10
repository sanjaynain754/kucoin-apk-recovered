package com.rtncalculator;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public abstract class NativeRTNCalculatorSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RTNCalculator";

    @ReactMethod
    @InterfaceC44695a
    public abstract void add(double d11, double d12, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNCalculator";
    }

    public NativeRTNCalculatorSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
