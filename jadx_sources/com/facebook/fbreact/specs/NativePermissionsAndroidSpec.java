package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativePermissionsAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PermissionsAndroid";

    @ReactMethod
    @InterfaceC44695a
    public abstract void checkPermission(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void requestMultiplePermissions(ReadableArray readableArray, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void requestPermission(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shouldShowRequestPermissionRationale(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PermissionsAndroid";
    }

    public NativePermissionsAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
