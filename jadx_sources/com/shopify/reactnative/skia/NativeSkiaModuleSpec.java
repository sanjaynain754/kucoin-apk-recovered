package com.shopify.reactnative.skia;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public abstract class NativeSkiaModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSkiaModule";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract boolean install();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSkiaModule";
    }

    public NativeSkiaModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
