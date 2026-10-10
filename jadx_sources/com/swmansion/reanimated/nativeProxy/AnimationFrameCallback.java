package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44695a
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {

    @InterfaceC44695a
    private final HybridData mHybridData;

    @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
    public native void onAnimationFrame(double d11);

    @InterfaceC44695a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
