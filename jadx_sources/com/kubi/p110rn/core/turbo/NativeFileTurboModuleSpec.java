package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeFileTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "File";

    @ReactMethod
    @InterfaceC44695a
    public abstract void downloadFile(String str, String str2, ReadableMap readableMap, String str3, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void pickFile(String str, Double d11, Double d12, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void previewFile(boolean z11, String str, String str2, ReadableMap readableMap, Boolean bool, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "File";
    }

    public NativeFileTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
