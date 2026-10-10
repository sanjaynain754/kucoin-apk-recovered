package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeJSCSamplingProfilerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "JSCSamplingProfiler";

    @ReactMethod
    @InterfaceC44695a
    public abstract void operationComplete(double d11, String str, String str2);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeJSCSamplingProfilerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
