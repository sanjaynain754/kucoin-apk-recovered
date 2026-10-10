package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeAppearanceSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Appearance";

    @ReactMethod
    @InterfaceC44695a
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract String getColorScheme();

    @ReactMethod
    @InterfaceC44695a
    public abstract void removeListeners(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setColorScheme(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Appearance";
    }

    public NativeAppearanceSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
