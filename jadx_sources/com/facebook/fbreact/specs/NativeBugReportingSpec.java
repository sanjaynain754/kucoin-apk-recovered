package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeBugReportingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BugReporting";

    @ReactMethod
    @InterfaceC44695a
    public abstract void setExtraData(ReadableMap readableMap, ReadableMap readableMap2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void startReportAProblemFlow();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeBugReportingSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
