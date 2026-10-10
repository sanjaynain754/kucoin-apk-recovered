package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeSiteTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Site";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getSupportSiteList();

    @ReactMethod
    @InterfaceC44695a
    public abstract void isSiteTypeSupport(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void startChangeSite(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void startChangeSiteDirectly(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Site";
    }

    public NativeSiteTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
