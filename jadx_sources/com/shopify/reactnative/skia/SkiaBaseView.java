package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes59.dex */
public abstract class SkiaBaseView extends ReactViewGroup implements InterfaceC27774i {

    /* JADX INFO: renamed from: b */
    public View f56506b;

    /* JADX INFO: renamed from: c */
    public final boolean f56507c;

    /* JADX INFO: renamed from: d */
    public final String f56508d;

    @Override // com.shopify.reactnative.skia.InterfaceC27774i
    /* JADX INFO: renamed from: c */
    public void mo68598c(Surface surface, int i11, int i12) {
        surfaceAvailable(surface, i11, i12, true);
    }

    @Override // com.shopify.reactnative.skia.InterfaceC27774i
    /* JADX INFO: renamed from: d */
    public void mo68599d(SurfaceTexture surfaceTexture, int i11, int i12) {
        surfaceAvailable(surfaceTexture, i11, i12, false);
    }

    public abstract void registerView(int i11);

    public abstract void setDebugMode(boolean z11);

    public void setOpaque(boolean z11) {
        if (z11) {
            View view = this.f56506b;
            if (view instanceof SkiaTextureView) {
                removeView(view);
                SkiaSurfaceView skiaSurfaceView = new SkiaSurfaceView(getContext(), this, false);
                this.f56506b = skiaSurfaceView;
                addView(skiaSurfaceView);
                return;
            }
        }
        if (z11) {
            return;
        }
        View view2 = this.f56506b;
        if (view2 instanceof SkiaSurfaceView) {
            removeView(view2);
            SkiaTextureView skiaTextureView = new SkiaTextureView(getContext(), this, false);
            this.f56506b = skiaTextureView;
            addView(skiaTextureView);
        }
    }

    public abstract void surfaceAvailable(Object obj, int i11, int i12, boolean z11);

    public abstract void surfaceDestroyed();

    public abstract void surfaceSizeChanged(Object obj, int i11, int i12, boolean z11);

    public abstract void unregisterView();

    @Override // com.shopify.reactnative.skia.InterfaceC27774i
    /* JADX INFO: renamed from: a */
    public void mo68596a(Surface surface, int i11, int i12) {
        Log.i("SkiaView", "onSurfaceTextureSizeChanged " + i11 + "/" + i12);
        surfaceSizeChanged(surface, i11, i12, true);
    }

    @Override // com.shopify.reactnative.skia.InterfaceC27774i
    /* JADX INFO: renamed from: b */
    public void mo68597b(SurfaceTexture surfaceTexture, int i11, int i12) {
        Log.i("SkiaView", "onSurfaceTextureSizeChanged " + i11 + "/" + i12);
        surfaceSizeChanged(surfaceTexture, i11, i12, false);
    }

    public SkiaBaseView(Context context) {
        super(context);
        this.f56507c = false;
        this.f56508d = "SkiaView";
        SkiaTextureView skiaTextureView = new SkiaTextureView(context, this, false);
        this.f56506b = skiaTextureView;
        addView(skiaTextureView);
    }

    /* JADX INFO: renamed from: f */
    public void m68600f() {
        unregisterView();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f56506b.layout(0, 0, i13 - i11, i14 - i12);
    }

    @Override // com.shopify.reactnative.skia.InterfaceC27774i
    public void onSurfaceDestroyed() {
        surfaceDestroyed();
    }
}
