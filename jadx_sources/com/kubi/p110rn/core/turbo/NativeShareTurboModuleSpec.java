package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeShareTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Share";

    @ReactMethod
    @InterfaceC44695a
    public abstract void saveShareImage(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void share(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shareWithOptions(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void showShareView(String str, String str2, Boolean bool, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Share";
    }

    public NativeShareTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
