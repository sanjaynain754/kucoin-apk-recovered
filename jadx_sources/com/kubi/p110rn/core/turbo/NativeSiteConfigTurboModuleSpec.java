package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeSiteConfigTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SiteConfig";

    @ReactMethod
    @InterfaceC44695a
    public abstract void getSiteConfig(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SiteConfig";
    }

    public NativeSiteConfigTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
