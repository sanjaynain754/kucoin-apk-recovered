package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeRedBoxSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RedBox";

    @ReactMethod
    @InterfaceC44695a
    public abstract void dismiss();

    @ReactMethod
    @InterfaceC44695a
    public abstract void setExtraData(ReadableMap readableMap, String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeRedBoxSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
