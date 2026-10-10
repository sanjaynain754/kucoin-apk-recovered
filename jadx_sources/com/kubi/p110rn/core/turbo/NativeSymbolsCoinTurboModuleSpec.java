package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes39.dex */
public abstract class NativeSymbolsCoinTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SymbolsCoin";

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getFuturesCoinInfo(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getFuturesCoinInfoBatch(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getFuturesCoinInfoBatchByPage(String str, String str2, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getFuturesSymbolInfo(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getFuturesSymbolInfoBatch(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getFuturesSymbolInfoBatchByPage(String str, String str2, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getSpotCoinInfo(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getSpotCoinInfoBatch(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getSpotCoinInfoBatchByPage(String str, String str2, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC44695a
    public abstract WritableMap getSpotSymbol(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getSpotSymbolBatch(Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void getSpotSymbolBatchByPage(String str, String str2, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SymbolsCoin";
    }

    public NativeSymbolsCoinTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
