package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes60.dex */
final class SurfaceTextureSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {

    @NonNull
    private final FlutterJNI flutterJNI;

    @NonNull
    private final Handler handler;

    /* JADX INFO: renamed from: id */
    private final long f86775id;
    private boolean released;
    private int requestBufferWidth;
    private int requestedBufferHeight;

    @Nullable
    private Surface surface;

    @NonNull
    private final TextureRegistry.SurfaceTextureEntry texture;

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public Surface getForcedNewSurface() {
        this.surface = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public boolean handlesCropAndRotation() {
        return true;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            release();
            this.handler.post(new FlutterRenderer.TextureFinalizerRunnable(this.f86775id, this.flutterJNI));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getHeight() {
        return this.requestedBufferHeight;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public Surface getSurface() {
        if (this.surface == null) {
            this.surface = new Surface(this.texture.surfaceTexture());
        }
        return this.surface;
    }

    @Override // io.flutter.view.TextureRegistry.GLTextureConsumer
    @NonNull
    public SurfaceTexture getSurfaceTexture() {
        return this.texture.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getWidth() {
        return this.requestBufferWidth;
    }

    @Override // io.flutter.view.TextureRegistry.TextureEntry
    /* JADX INFO: renamed from: id */
    public long mo87506id() {
        return this.f86775id;
    }

    @Override // io.flutter.view.TextureRegistry.TextureEntry
    public void release() {
        this.texture.release();
        this.surface.release();
        this.surface = null;
        this.released = true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void scheduleFrame() {
        this.flutterJNI.markTextureFrameAvailable(this.f86775id);
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setSize(int i11, int i12) {
        this.requestBufferWidth = i11;
        this.requestedBufferHeight = i12;
        getSurfaceTexture().setDefaultBufferSize(i11, i12);
    }

    public SurfaceTextureSurfaceProducer(long j11, @NonNull Handler handler, @NonNull FlutterJNI flutterJNI, @NonNull TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.f86775id = j11;
        this.handler = handler;
        this.flutterJNI = flutterJNI;
        this.texture = surfaceTextureEntry;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setCallback(TextureRegistry.SurfaceProducer.Callback callback) {
    }
}
