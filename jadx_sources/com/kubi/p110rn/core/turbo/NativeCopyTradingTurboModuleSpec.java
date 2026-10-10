package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeCopyTradingTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CopyTrading";

    @ReactMethod
    @InterfaceC44695a
    public abstract void requestFutureMarketClosePosition(String str, String str2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void requestFuturePositionTpSl(String str, String str2, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap requestRefreshCopyTradingAccountInfo();

    @ReactMethod
    @InterfaceC44695a
    public abstract void shareCopyTraderFollowOneTraderPnl(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shareCopyTraderTotalPnl(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shareCopyTradingPosition(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shareLeadTraderTotalPnl(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shareLeadUserInfo(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void shareOptionPosition(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CopyTrading";
    }

    public NativeCopyTradingTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
