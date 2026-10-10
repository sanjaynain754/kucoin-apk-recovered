package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeDevLoadingViewSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevLoadingView";

    @ReactMethod
    @InterfaceC44695a
    public abstract void hide();

    @ReactMethod
    @InterfaceC44695a
    public abstract void showMessage(String str, Double d11, Double d12);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevLoadingView";
    }

    public NativeDevLoadingViewSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
