package com.swmansion.gesturehandler.react;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.soloader.SoLoader;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44695a
public class RNGestureHandlerComponentsRegistry {

    @InterfaceC44695a
    private final HybridData mHybridData;

    @InterfaceC44695a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    static {
        SoLoader.loadLibrary("fabricjni");
        SoLoader.loadLibrary("gesturehandler");
    }

    @InterfaceC44695a
    public static RNGestureHandlerComponentsRegistry register(ComponentFactory componentFactory) {
        return new RNGestureHandlerComponentsRegistry(componentFactory);
    }

    @InterfaceC44695a
    private RNGestureHandlerComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }
}
