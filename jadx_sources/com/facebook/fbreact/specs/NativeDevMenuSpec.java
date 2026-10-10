package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevMenu";

    @ReactMethod
    @InterfaceC44695a
    public abstract void debugRemotely(boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void reload();

    @ReactMethod
    @InterfaceC44695a
    public abstract void setHotLoadingEnabled(boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setProfilingEnabled(boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void show();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
