package com.reactnativeimageresizer;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public abstract class NativeImageResizerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageResizer";

    @ReactMethod
    @InterfaceC44695a
    public abstract void createResizedImage(String str, double d11, double d12, String str2, double d13, String str3, boolean z11, Double d14, String str4, Boolean bool, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageResizer";
    }

    public NativeImageResizerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
