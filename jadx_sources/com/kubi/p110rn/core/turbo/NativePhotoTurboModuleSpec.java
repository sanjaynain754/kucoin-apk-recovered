package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativePhotoTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Photo";

    @ReactMethod
    @InterfaceC44695a
    public abstract void appAlbumSelect(Double d11, String str, Boolean bool, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void takePicture(boolean z11, double d11, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Photo";
    }

    public NativePhotoTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
