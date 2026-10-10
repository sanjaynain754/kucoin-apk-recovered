package com.shopify.reactnative.skia;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes59.dex */
@RequiresApi(api = 29)
@SuppressLint({"ViewConstructor"})
public class SkiaAHBView extends View implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: b */
    public ImageReader f56500b;

    /* JADX INFO: renamed from: c */
    public Bitmap f56501c;

    /* JADX INFO: renamed from: d */
    public final Matrix f56502d;

    /* JADX INFO: renamed from: e */
    public InterfaceC27774i f56503e;

    /* JADX INFO: renamed from: f */
    public boolean f56504f;

    /* JADX INFO: renamed from: g */
    public long f56505g;

    /* JADX INFO: renamed from: b */
    public void m68595b(long j11) {
        Log.i("SkiaAHBView", "onSurfaceTextureUpdated " + ((j11 - this.f56505g) / 1000000) + "ms");
        this.f56505g = j11;
    }

    /* JADX INFO: renamed from: a */
    public final ImageReader m68594a() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(getWidth(), getHeight(), 1, 2, 768L);
        imageReaderNewInstance.setOnImageAvailableListener(this, null);
        return imageReaderNewInstance;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56503e.onSurfaceDestroyed();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f56501c != null) {
            float width = getWidth();
            float height = getHeight();
            float width2 = width / this.f56501c.getWidth();
            float height2 = height / this.f56501c.getHeight();
            this.f56502d.reset();
            this.f56502d.setScale(width2, height2);
            canvas.drawBitmap(this.f56501c, this.f56502d, null);
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        Bitmap bitmapWrapHardwareBuffer;
        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            try {
                HardwareBuffer hardwareBuffer = imageAcquireLatestImage.getHardwareBuffer();
                if (this.f56504f) {
                    m68595b(imageAcquireLatestImage.getTimestamp());
                }
                if (hardwareBuffer != null && (bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null)) != null) {
                    this.f56501c = bitmapWrapHardwareBuffer;
                    hardwareBuffer.close();
                    invalidate();
                }
            } catch (Throwable th2) {
                try {
                    imageAcquireLatestImage.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (imageAcquireLatestImage != null) {
            imageAcquireLatestImage.close();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int width = getWidth();
        int height = getHeight();
        if (this.f56500b == null) {
            ImageReader imageReaderM68594a = m68594a();
            this.f56500b = imageReaderM68594a;
            this.f56503e.mo68598c(imageReaderM68594a.getSurface(), width, height);
        } else {
            ImageReader imageReaderM68594a2 = m68594a();
            this.f56500b = imageReaderM68594a2;
            this.f56503e.mo68596a(imageReaderM68594a2.getSurface(), width, height);
        }
    }
}
