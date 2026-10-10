package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeFileReaderModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FileReaderModule";

    @ReactMethod
    @InterfaceC44695a
    public abstract void readAsDataURL(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void readAsText(ReadableMap readableMap, String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeFileReaderModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
