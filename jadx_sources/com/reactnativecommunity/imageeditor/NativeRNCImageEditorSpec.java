package com.reactnativecommunity.imageeditor;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public abstract class NativeRNCImageEditorSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCImageEditor";

    @ReactMethod
    @InterfaceC44695a
    public abstract void cropImage(String str, ReadableMap readableMap, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCImageEditor";
    }

    public NativeRNCImageEditorSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
