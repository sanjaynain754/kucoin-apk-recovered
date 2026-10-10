package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public abstract class NativeAsyncStorageModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCAsyncStorage";

    @ReactMethod
    @InterfaceC44695a
    public abstract void clear(Callback callback);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getAllKeys(Callback callback);

    @ReactMethod
    @InterfaceC44695a
    public abstract void multiGet(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC44695a
    public abstract void multiMerge(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC44695a
    public abstract void multiRemove(ReadableArray readableArray, Callback callback);

    @ReactMethod
    @InterfaceC44695a
    public abstract void multiSet(ReadableArray readableArray, Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    public NativeAsyncStorageModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
