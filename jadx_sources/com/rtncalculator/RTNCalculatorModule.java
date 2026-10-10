package com.rtncalculator;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes59.dex */
public class RTNCalculatorModule extends NativeRTNCalculatorSpec {
    public static final String NAME = "RTNCalculator";

    @Override // com.rtncalculator.NativeRTNCalculatorSpec
    public void add(double d11, double d12, Promise promise) {
        System.out.println("MRQ add: " + d11 + " + " + d12);
        promise.resolve(Double.valueOf(d11 + d12));
    }

    @Override // com.rtncalculator.NativeRTNCalculatorSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RTNCalculator";
    }

    public RTNCalculatorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
