package com.kubi.p110rn.kline;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeKlineHybridBridgeSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "KlineHybridBridge";

    @ReactMethod
    @InterfaceC44695a
    public abstract void refreshFlutterMiniTradeOverlays(String str, String str2);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setFlutterMiniVisible(boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void setFlutterStageVisible(boolean z11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KlineHybridBridge";
    }

    public NativeKlineHybridBridgeSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
