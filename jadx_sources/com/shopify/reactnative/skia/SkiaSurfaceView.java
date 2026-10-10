package com.shopify.reactnative.skia;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes59.dex */
@SuppressLint({"ViewConstructor"})
public class SkiaSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: b */
    public InterfaceC27774i f56509b;

    /* JADX INFO: renamed from: c */
    public boolean f56510c;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
        this.f56509b.mo68596a(surfaceHolder.getSurface(), getWidth(), getHeight());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        this.f56509b.mo68598c(surfaceHolder.getSurface(), getWidth(), getHeight());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        this.f56509b.onSurfaceDestroyed();
    }

    public SkiaSurfaceView(Context context, InterfaceC27774i interfaceC27774i, boolean z11) {
        super(context);
        this.f56509b = interfaceC27774i;
        this.f56510c = z11;
        getHolder().addCallback(this);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56509b.onSurfaceDestroyed();
    }
}
