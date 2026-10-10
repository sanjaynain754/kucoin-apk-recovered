package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeRouterTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Router";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap navigateTo(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Router";
    }

    public NativeRouterTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
