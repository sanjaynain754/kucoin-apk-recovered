package com.swmansion.reanimated.layoutReanimation;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.soloader.SoLoader;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.ref.WeakReference;
import java.util.Map;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public class LayoutAnimations {
    private final WeakReference<ReactApplicationContext> mContext;
    private WeakReference<AnimationsManager> mWeakAnimationsManager = new WeakReference<>(null);

    @InterfaceC44695a
    private final HybridData mHybridData = initHybrid();

    public static class Types {
        static final int ENTERING = 1;
        static final int EXITING = 2;
        static final int LAYOUT = 3;
        static final int SHARED_ELEMENT_TRANSITION = 4;
        static final int SHARED_ELEMENT_TRANSITION_PROGRESS = 5;
    }

    private native HybridData initHybrid();

    public native void cancelAnimationForTag(int i11);

    public native void checkDuplicateSharedTag(int i11, int i12);

    public native void clearAnimationConfigForTag(int i11);

    public native int findPrecedingViewTagForTransition(int i11);

    public native int[] getSharedGroup(int i11);

    public native boolean hasAnimationForTag(int i11, int i12);

    public native boolean isLayoutAnimationEnabled();

    public native boolean shouldAnimateExiting(int i11, boolean z11);

    public native void startAnimationForTag(int i11, int i12, Map<String, String> map);

    private AnimationsManager getAnimationsManager() {
        if (this.mWeakAnimationsManager.get() != null) {
            return this.mWeakAnimationsManager.get();
        }
        ReactApplicationContext reactApplicationContext = this.mContext.get();
        if (reactApplicationContext == null) {
            return null;
        }
        AnimationsManager animationsManager = ((ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
        this.mWeakAnimationsManager = new WeakReference<>(animationsManager);
        return animationsManager;
    }

    static {
        SoLoader.loadLibrary("reanimated");
    }

    public LayoutAnimations(ReactApplicationContext reactApplicationContext) {
        this.mContext = new WeakReference<>(reactApplicationContext);
    }

    private void endLayoutAnimation(int i11, boolean z11) {
        AnimationsManager animationsManager = getAnimationsManager();
        if (animationsManager == null) {
            return;
        }
        animationsManager.endLayoutAnimation(i11, z11);
    }

    private void progressLayoutAnimation(int i11, Map<String, Object> map, boolean z11) {
        AnimationsManager animationsManager = getAnimationsManager();
        if (animationsManager == null) {
            return;
        }
        animationsManager.progressLayoutAnimation(i11, map, z11);
    }
}
