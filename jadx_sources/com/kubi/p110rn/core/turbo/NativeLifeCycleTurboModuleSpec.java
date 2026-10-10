package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeLifeCycleTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LifeCycle";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap pageDidMount(String str, Double d11, String str2);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LifeCycle";
    }

    public NativeLifeCycleTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
