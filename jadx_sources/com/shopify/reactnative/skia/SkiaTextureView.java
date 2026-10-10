package com.shopify.reactnative.skia;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.TextureView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes59.dex */
@SuppressLint({"ViewConstructor"})
public class SkiaTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: b */
    public String f56511b;

    /* JADX INFO: renamed from: c */
    public InterfaceC27774i f56512c;

    /* JADX INFO: renamed from: d */
    public boolean f56513d;

    /* JADX INFO: renamed from: e */
    public long f56514e;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i11, int i12) {
        Log.i(this.f56511b, "onSurfaceTextureAvailable:  " + i11 + "x" + i12);
        this.f56512c.mo68599d(surfaceTexture, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
        this.f56512c.onSurfaceDestroyed();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i11, int i12) {
        Log.i(this.f56511b, "onSurfaceTextureSizeChanged:  " + i11 + "x" + i12);
        this.f56512c.mo68597b(surfaceTexture, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        if (this.f56513d) {
            long timestamp = surfaceTexture.getTimestamp();
            Log.i("SkiaTextureView", "onSurfaceTextureUpdated " + ((timestamp - this.f56514e) / 1000000) + "ms");
            this.f56514e = timestamp;
        }
    }

    public SkiaTextureView(Context context, InterfaceC27774i interfaceC27774i, boolean z11) {
        super(context);
        this.f56511b = "SkiaTextureView";
        this.f56514e = 0L;
        this.f56512c = interfaceC27774i;
        this.f56513d = z11;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }
}
