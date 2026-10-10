package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44695a
public class SensorSetter {

    @InterfaceC44695a
    private final HybridData mHybridData;

    public native void sensorSetter(float[] fArr, int i11);

    @InterfaceC44695a
    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
