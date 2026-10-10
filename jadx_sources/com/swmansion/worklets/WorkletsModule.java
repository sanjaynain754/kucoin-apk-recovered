package com.swmansion.worklets;

import androidx.annotation.OptIn;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import com.swmansion.reanimated.NativeWorkletsModuleSpec;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p633t6.InterfaceC44695a;
import wb0.C45787b;

/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = NativeWorkletsModuleSpec.NAME)
public class WorkletsModule extends NativeWorkletsModuleSpec {
    private final AndroidUIScheduler mAndroidUIScheduler;

    @InterfaceC44695a
    private HybridData mHybridData;
    private final AtomicBoolean mInvalidated;
    private final WorkletsMessageQueueThread mMessageQueueThread;

    @OptIn(markerClass = {FrameworkAPI.class})
    private native HybridData initHybrid(long j11, String str, MessageQueueThread messageQueueThread, CallInvokerHolderImpl callInvokerHolderImpl, AndroidUIScheduler androidUIScheduler);

    private native void invalidateCpp();

    public AndroidUIScheduler getAndroidUIScheduler() {
        return this.mAndroidUIScheduler;
    }

    public HybridData getHybridData() {
        return this.mHybridData;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        if (this.mInvalidated.getAndSet(true)) {
            return;
        }
        HybridData hybridData = this.mHybridData;
        if (hybridData != null && hybridData.isValid()) {
            invalidateCpp();
        }
        this.mAndroidUIScheduler.m72130c();
    }

    static {
        SoLoader.loadLibrary("worklets");
    }

    public WorkletsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mMessageQueueThread = new WorkletsMessageQueueThread();
        this.mInvalidated = new AtomicBoolean(false);
        this.mAndroidUIScheduler = new AndroidUIScheduler(reactApplicationContext);
    }

    @Override // com.swmansion.reanimated.NativeWorkletsModuleSpec
    @OptIn(markerClass = {FrameworkAPI.class})
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule(String str) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        this.mHybridData = initHybrid(javaScriptContextHolder.get(), str, this.mMessageQueueThread, C45787b.m101114a(reactApplicationContext), this.mAndroidUIScheduler);
        return true;
    }
}
