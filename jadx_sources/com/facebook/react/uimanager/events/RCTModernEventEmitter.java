package com.facebook.react.uimanager.events;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes45.dex */
public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int i11, int i12, String str, @Nullable WritableMap writableMap);

    void receiveEvent(int i11, int i12, String str, boolean z11, int i13, @Nullable WritableMap writableMap, int i14);

    @Deprecated
    void receiveTouches(TouchEvent touchEvent);
}
