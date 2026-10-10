package com.reactnativecommunity.webview;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public abstract class NativeRNCWebViewModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCWebViewModule";

    @ReactMethod
    @InterfaceC44695a
    public abstract void isFileUploadSupported(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shouldStartLoadWithLockIdentifier(boolean z11, double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebViewModule";
    }

    public NativeRNCWebViewModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
