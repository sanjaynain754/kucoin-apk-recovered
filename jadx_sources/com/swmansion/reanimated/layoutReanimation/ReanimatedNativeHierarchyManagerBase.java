package com.swmansion.reanimated.layoutReanimation;

import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.yoga.YogaDirection;

/* JADX INFO: loaded from: classes59.dex */
public abstract class ReanimatedNativeHierarchyManagerBase extends NativeViewHierarchyManager {
    /* JADX WARN: Bottom block not found for handler: all -> 0x000f */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void updateLayout(int i11, int i12, int i13, int i14, int i15, int i16, YogaDirection yogaDirection) throws Throwable {
        try {
            super.updateLayout(i11, i12, i13, i14, i15, i16, yogaDirection);
            updateLayoutCommon(i11, i12, i13, i14, i15, i16);
        } catch (Throwable th2) {
            th = th2;
            while (true) {
                throw th;
            }
        }
    }

    public abstract void updateLayoutCommon(int i11, int i12, int i13, int i14, int i15, int i16);

    public ReanimatedNativeHierarchyManagerBase(ViewManagerRegistry viewManagerRegistry) {
        super(viewManagerRegistry);
    }
}
