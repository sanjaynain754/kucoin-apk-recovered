package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeSoundManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SoundManager";

    @ReactMethod
    @InterfaceC44695a
    public abstract void playTouchSound();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SoundManager";
    }

    public NativeSoundManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
