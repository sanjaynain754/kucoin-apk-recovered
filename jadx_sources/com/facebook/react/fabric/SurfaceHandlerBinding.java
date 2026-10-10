package com.facebook.react.fabric;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.interfaces.fabric.SurfaceHandler;

/* JADX INFO: loaded from: classes45.dex */
public class SurfaceHandlerBinding extends HybridClassBase implements SurfaceHandler {
    public static final int DISPLAY_MODE_HIDDEN = 2;
    public static final int DISPLAY_MODE_SUSPENDED = 1;
    public static final int DISPLAY_MODE_VISIBLE = 0;
    private static final int NO_SURFACE_ID = 0;

    private native void initHybrid(int i11, String str);

    private native void setDisplayMode(int i11);

    private native void setLayoutConstraintsNative(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, boolean z12, float f17);

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public native String getModuleName();

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public native int getSurfaceId();

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public native boolean isRunning();

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public native void setProps(NativeMap nativeMap);

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public void setMountable(boolean z11) {
        setDisplayMode(!z11 ? 1 : 0);
    }

    static {
        FabricSoLoader.staticInit();
    }

    public SurfaceHandlerBinding(String str) {
        initHybrid(0, str);
    }

    @Override // com.facebook.react.interfaces.fabric.SurfaceHandler
    public void setLayoutConstraints(int i11, int i12, int i13, int i14, boolean z11, boolean z12, float f11) {
        setLayoutConstraintsNative(LayoutMetricsConversions.getMinSize(i11) / f11, LayoutMetricsConversions.getMaxSize(i11) / f11, LayoutMetricsConversions.getMinSize(i12) / f11, LayoutMetricsConversions.getMaxSize(i12) / f11, i13 / f11, i14 / f11, z11, z12, f11);
    }
}
