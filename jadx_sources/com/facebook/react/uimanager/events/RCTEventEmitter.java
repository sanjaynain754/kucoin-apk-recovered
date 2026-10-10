package com.facebook.react.uimanager.events;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@Deprecated
@InterfaceC44695a
public interface RCTEventEmitter extends JavaScriptModule {
    @Deprecated
    void receiveEvent(int i11, String str, @Nullable WritableMap writableMap);

    @Deprecated
    void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2);
}
