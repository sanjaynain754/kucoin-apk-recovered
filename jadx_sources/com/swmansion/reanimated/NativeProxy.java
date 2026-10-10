package com.swmansion.reanimated;

import androidx.annotation.OptIn;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.UIManagerHelper;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder;
import com.swmansion.reanimated.nativeProxy.NativeProxyCommon;
import com.swmansion.worklets.WorkletsModule;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p633t6.InterfaceC44695a;
import wb0.C45787b;

/* JADX INFO: loaded from: classes59.dex */
public class NativeProxy extends NativeProxyCommon {

    @InterfaceC44695a
    private final HybridData mHybridData;
    private final AtomicBoolean mInvalidated;

    @OptIn(markerClass = {FrameworkAPI.class})
    private native HybridData initHybrid(WorkletsModule workletsModule, long j11, CallInvokerHolderImpl callInvokerHolderImpl, LayoutAnimations layoutAnimations, boolean z11, FabricUIManager fabricUIManager);

    private native void invalidateCpp();

    public native boolean isAnyHandlerWaitingForEvent(String str, int i11);

    public native void performOperations();

    public static NativeMethodsHolder createNativeMethodsHolder(LayoutAnimations layoutAnimations) {
        return new NativeMethodsHolder() { // from class: com.swmansion.reanimated.NativeProxy.1
            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int findPrecedingViewTagForTransition(int i11) {
                return -1;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int[] getSharedGroup(int i11) {
                return new int[0];
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean hasAnimation(int i11, int i12) {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean isLayoutAnimationEnabled() {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean shouldAnimateExiting(int i11, boolean z11) {
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void cancelAnimation(int i11) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void clearAnimationConfig(int i11) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void checkDuplicateSharedTag(int i11, int i12) {
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void startAnimation(int i11, int i12, HashMap<String, Object> map) {
            }
        };
    }

    @Override // com.swmansion.reanimated.nativeProxy.NativeProxyCommon
    public HybridData getHybridData() {
        return this.mHybridData;
    }

    public void invalidate() {
        HybridData hybridData;
        if (this.mInvalidated.getAndSet(true) || (hybridData = this.mHybridData) == null || !hybridData.isValid()) {
            return;
        }
        invalidateCpp();
    }

    @OptIn(markerClass = {FrameworkAPI.class})
    public NativeProxy(ReactApplicationContext reactApplicationContext, WorkletsModule workletsModule) {
        super(reactApplicationContext);
        this.mInvalidated = new AtomicBoolean(false);
        ReactFeatureFlagsWrapper.enableMountHooks();
        FabricUIManager fabricUIManager = (FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2);
        LayoutAnimations layoutAnimations = new LayoutAnimations(reactApplicationContext);
        CallInvokerHolderImpl callInvokerHolderImplM101114a = C45787b.m101114a(reactApplicationContext);
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        this.mHybridData = initHybrid(workletsModule, javaScriptContextHolder.get(), callInvokerHolderImplM101114a, layoutAnimations, reactApplicationContext.isBridgeless(), fabricUIManager);
        prepareLayoutAnimations(layoutAnimations);
        installJSIBindings();
    }
}
