package com.shopify.reactnative.skia;

import android.content.Context;
import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes59.dex */
public class SkiaPictureView extends SkiaBaseView {

    @DoNotStrip
    private HybridData mHybridData;

    private native HybridData initHybrid(SkiaManager skiaManager);

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void registerView(int i11);

    public native void setBgColor(int i11);

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void setDebugMode(boolean z11);

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void surfaceAvailable(Object obj, int i11, int i12, boolean z11);

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void surfaceDestroyed();

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void surfaceSizeChanged(Object obj, int i11, int i12, boolean z11);

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void unregisterView();

    public SkiaPictureView(Context context) {
        super(context);
        this.mHybridData = initHybrid(((RNSkiaModule) ((ReactContext) context).getNativeModule(RNSkiaModule.class)).getSkiaManager());
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.mHybridData.resetNative();
    }
}
