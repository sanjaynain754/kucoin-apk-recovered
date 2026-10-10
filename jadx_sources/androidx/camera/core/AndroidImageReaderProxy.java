package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
class AndroidImageReaderProxy implements ImageReaderProxy {

    @GuardedBy("mLock")
    private final ImageReader mImageReader;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mIsImageAvailableListenerCleared = true;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1839a(final AndroidImageReaderProxy androidImageReaderProxy, Executor executor, final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReader imageReader) {
        synchronized (androidImageReaderProxy.mLock) {
            try {
                if (!androidImageReaderProxy.mIsImageAvailableListenerCleared) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidImageReaderProxy.m1840b(this.f1559b, onImageAvailableListener);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean isImageReaderContextNotInitializedException(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireLatestImage() {
        Image imageAcquireLatestImage;
        synchronized (this.mLock) {
            try {
                imageAcquireLatestImage = this.mImageReader.acquireLatestImage();
            } catch (RuntimeException e11) {
                if (!isImageReaderContextNotInitializedException(e11)) {
                    throw e11;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new AndroidImageProxy(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireNextImage() {
        Image imageAcquireNextImage;
        synchronized (this.mLock) {
            try {
                imageAcquireNextImage = this.mImageReader.acquireNextImage();
            } catch (RuntimeException e11) {
                if (!isImageReaderContextNotInitializedException(e11)) {
                    throw e11;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new AndroidImageProxy(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mIsImageAvailableListenerCleared = true;
            this.mImageReader.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            this.mImageReader.close();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReader.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReader.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReader.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReader.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReader.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final Executor executor) {
        synchronized (this.mLock) {
            this.mIsImageAvailableListenerCleared = false;
            this.mImageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    AndroidImageReaderProxy.m1839a(this.f1564b, executor, onImageAvailableListener, imageReader);
                }
            }, MainThreadAsyncHandler.getInstance());
        }
    }

    public AndroidImageReaderProxy(ImageReader imageReader) {
        this.mImageReader = imageReader;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1840b(AndroidImageReaderProxy androidImageReaderProxy, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        androidImageReaderProxy.getClass();
        onImageAvailableListener.onImageAvailable(androidImageReaderProxy);
    }
}
