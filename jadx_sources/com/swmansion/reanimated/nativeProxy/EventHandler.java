package com.swmansion.reanimated.nativeProxy;

import androidx.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44695a
public class EventHandler implements RCTEventEmitter {
    UIManagerModule.CustomEventNamesResolver mCustomEventNamesResolver;

    @InterfaceC44695a
    private final HybridData mHybridData;

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i11, String str, @Nullable WritableMap writableMap) {
        receiveEvent(this.mCustomEventNamesResolver.resolveCustomEventName(str), i11, writableMap);
    }

    public native void receiveEvent(String str, int i11, @Nullable WritableMap writableMap);

    @InterfaceC44695a
    private EventHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
    }
}
