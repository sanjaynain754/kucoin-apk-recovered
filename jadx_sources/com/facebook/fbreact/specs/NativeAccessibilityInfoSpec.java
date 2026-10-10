package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AccessibilityInfo";

    @ReactMethod
    @InterfaceC44695a
    public abstract void announceForAccessibility(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void isReduceMotionEnabled(Callback callback);

    @ReactMethod
    @InterfaceC44695a
    public abstract void isTouchExplorationEnabled(Callback callback);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setAccessibilityFocus(double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AccessibilityInfo";
    }

    public NativeAccessibilityInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC44695a
    public void isAccessibilityServiceEnabled(Callback callback) {
    }

    @ReactMethod
    @InterfaceC44695a
    public void isGrayscaleEnabled(Callback callback) {
    }

    @ReactMethod
    @InterfaceC44695a
    public void isHighTextContrastEnabled(Callback callback) {
    }

    @ReactMethod
    @InterfaceC44695a
    public void isInvertColorsEnabled(Callback callback) {
    }

    @ReactMethod
    @InterfaceC44695a
    public void getRecommendedTimeoutMillis(double d11, Callback callback) {
    }
}
