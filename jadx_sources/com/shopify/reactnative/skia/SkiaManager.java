package com.shopify.reactnative.skia;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44695a
public class SkiaManager {

    @InterfaceC44695a
    private ReactContext mContext;

    @InterfaceC44695a
    private HybridData mHybridData;

    @InterfaceC44695a
    private PlatformContext mPlatformContext;

    private native HybridData initHybrid(long j11, RuntimeExecutor runtimeExecutor, PlatformContext platformContext);

    private native void initializeRuntime();

    public native void invalidate();

    /* JADX INFO: renamed from: a */
    public void m68601a() {
        this.mHybridData.resetNative();
    }

    @InterfaceC44695a
    public SkiaManager(ReactContext reactContext) {
        this.mContext = reactContext;
        RuntimeExecutor runtimeExecutorM68610a = C27771f.m68610a(reactContext);
        this.mPlatformContext = new PlatformContext(reactContext);
        this.mHybridData = initHybrid(reactContext.getJavaScriptContextHolder().get(), runtimeExecutorM68610a, this.mPlatformContext);
        initializeRuntime();
    }
}
