package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    @ReactMethod
    @InterfaceC44695a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void addMenuItem(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void reload();

    @ReactMethod
    @InterfaceC44695a
    public abstract void removeListeners(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setHotLoadingEnabled(boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setIsDebuggingRemotely(boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setProfilingEnabled(boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void toggleElementInspector();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC44695a
    public void onFastRefresh() {
    }

    @ReactMethod
    @InterfaceC44695a
    public void openDebugger() {
    }

    @ReactMethod
    @InterfaceC44695a
    public void reloadWithReason(String str) {
    }
}
