package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeExperimentTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Experiment";

    @ReactMethod
    @InterfaceC44695a
    public abstract void getExperimentResult(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Experiment";
    }

    public NativeExperimentTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
