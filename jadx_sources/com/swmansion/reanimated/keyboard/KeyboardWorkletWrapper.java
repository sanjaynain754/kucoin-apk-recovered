package com.swmansion.reanimated.keyboard;

import com.facebook.jni.HybridData;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44695a
public class KeyboardWorkletWrapper {

    @InterfaceC44695a
    private final HybridData mHybridData;

    public native void invoke(int i11, int i12);

    @InterfaceC44695a
    private KeyboardWorkletWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
