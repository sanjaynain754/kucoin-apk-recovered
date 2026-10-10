package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeHeadlessJsTaskSupportSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    @ReactMethod
    @InterfaceC44695a
    public abstract void notifyTaskFinished(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void notifyTaskRetry(double d11, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeHeadlessJsTaskSupportSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
