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
public abstract class NativeTradeTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Trade";

    @ReactMethod
    @InterfaceC44695a
    public abstract void fetchMarginCurrency(String str, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void fetchSymbolOfflineInfoList(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getAlphaCurrencyInfo(double d11, boolean z11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getAlphaCurrencyInfoBatch(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getContractTradeUnit();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getIsolatedMarginConfig(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getIsolatedMarginConfigBatch(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getMarginConfig(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getMarginCurrency(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getMarginCurrencyList(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getSymbolOfflineInfo(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap isUtaGray();

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap isUtaHasOpend();

    @ReactMethod
    @InterfaceC44695a
    public abstract void openNativeMarketsSymbolDialog(String str, String str2, String str3, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void openOrderDetail(String str, String str2, String str3, String str4, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Trade";
    }

    public NativeTradeTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
