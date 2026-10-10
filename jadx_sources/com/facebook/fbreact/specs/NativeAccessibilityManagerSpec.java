package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeAccessibilityManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AccessibilityManager";

    @ReactMethod
    @InterfaceC44695a
    public abstract void announceForAccessibility(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getCurrentBoldTextState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getCurrentGrayscaleState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getCurrentInvertColorsState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getCurrentReduceMotionState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getCurrentReduceTransparencyState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getCurrentVoiceOverState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setAccessibilityContentSizeMultipliers(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setAccessibilityFocus(double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeAccessibilityManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC44695a
    public void announceForAccessibilityWithOptions(String str, ReadableMap readableMap) {
    }

    @ReactMethod
    @InterfaceC44695a
    public void getCurrentDarkerSystemColorsState(Callback callback, Callback callback2) {
    }

    @ReactMethod
    @InterfaceC44695a
    public void getCurrentPrefersCrossFadeTransitionsState(Callback callback, Callback callback2) {
    }
}
