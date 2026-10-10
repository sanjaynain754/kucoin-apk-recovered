package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeFrameRateLoggerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FrameRateLogger";

    @ReactMethod
    @InterfaceC44695a
    public abstract void beginScroll();

    @ReactMethod
    @InterfaceC44695a
    public abstract void endScroll();

    @ReactMethod
    @InterfaceC44695a
    public abstract void setContext(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setGlobalOptions(ReadableMap readableMap);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeFrameRateLoggerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
