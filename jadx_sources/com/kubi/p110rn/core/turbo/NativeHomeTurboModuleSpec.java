package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeHomeTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Home";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap recordStartupTrace(String str, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setHomeBottomTabScrollToTopState(boolean z11, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setHomeFeedRouteReadyState(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Home";
    }

    public NativeHomeTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
