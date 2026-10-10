package androidx.camera.extensions.internal.compat.workaround;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalGetImage.class})
public class CaptureOutputSurfaceForCaptureProcessor {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "CaptureOutputSurface";
    private static final long UNSPECIFIED_TIMESTAMP = -1;

    @GuardedBy("mLock")
    private final ImageWriter mImageWriter;

    @GuardedBy("mLock")
    private final ImageReaderProxy mIntermediateImageReader;
    private final boolean mNeedIntermediaSurface;
    private final boolean mNeedOverrideTimestamp;
    private final Surface mOutputSurface;
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mIsClosed = false;
    long mOutputImageTimeStamp = -1;

    @RequiresApi(23)
    public static final class Api23Impl {
        private Api23Impl() {
        }

        public static void setImageTimestamp(Image image, long j11) {
            image.setTimestamp(j11);
        }
    }

    @RequiresApi(29)
    public static final class ImageWriterCompat {
        private ImageWriterCompat() {
        }

        public static void close(ImageWriter imageWriter) {
            imageWriter.close();
        }

        public static ImageWriter newInstance(Surface surface, int i11, int i12) {
            return ImageWriter.newInstance(surface, i11, i12);
        }

        public static void queueInputImage(ImageWriter imageWriter, Image image) {
            imageWriter.queueInputImage(image);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2073a(CaptureOutputSurfaceForCaptureProcessor captureOutputSurfaceForCaptureProcessor, ImageReaderProxy imageReaderProxy) {
        Image image;
        synchronized (captureOutputSurfaceForCaptureProcessor.mLock) {
            try {
                if (captureOutputSurfaceForCaptureProcessor.mIsClosed) {
                    return;
                }
                ImageProxy imageProxyAcquireNextImage = imageReaderProxy.acquireNextImage();
                if (imageProxyAcquireNextImage != null && (image = imageProxyAcquireNextImage.getImage()) != null) {
                    if (captureOutputSurfaceForCaptureProcessor.mNeedOverrideTimestamp) {
                        long j11 = captureOutputSurfaceForCaptureProcessor.mOutputImageTimeStamp;
                        if (j11 != -1) {
                            Api23Impl.setImageTimestamp(image, j11);
                        }
                    }
                    ImageWriterCompat.queueInputImage(captureOutputSurfaceForCaptureProcessor.mImageWriter, image);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            try {
                this.mIsClosed = true;
                if (Build.VERSION.SDK_INT >= 29 && this.mNeedIntermediaSurface) {
                    this.mIntermediateImageReader.clearOnImageAvailableListener();
                    this.mIntermediateImageReader.close();
                    ImageWriterCompat.close(this.mImageWriter);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Surface getSurface() {
        return this.mOutputSurface;
    }

    public void setOutputImageTimestamp(long j11) {
        if (this.mNeedOverrideTimestamp) {
            this.mOutputImageTimeStamp = j11;
        }
    }

    public CaptureOutputSurfaceForCaptureProcessor(Surface surface, Size size, boolean z11) {
        this.mNeedOverrideTimestamp = z11;
        boolean z12 = DeviceQuirks.get(CaptureOutputSurfaceOccupiedQuirk.class) != null || z11;
        this.mNeedIntermediaSurface = z12;
        if (Build.VERSION.SDK_INT >= 29 && z12) {
            Logger.m1866d(TAG, "Enabling intermediate surface");
            ImageReaderProxy imageReaderProxyCreateIsolatedReader = ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), 35, 2);
            this.mIntermediateImageReader = imageReaderProxyCreateIsolatedReader;
            this.mOutputSurface = imageReaderProxyCreateIsolatedReader.getSurface();
            this.mImageWriter = ImageWriterCompat.newInstance(surface, 2, 35);
            imageReaderProxyCreateIsolatedReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.compat.workaround.a
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    CaptureOutputSurfaceForCaptureProcessor.m2073a(this.f1897a, imageReaderProxy);
                }
            }, CameraXExecutors.directExecutor());
            return;
        }
        this.mOutputSurface = surface;
        this.mIntermediateImageReader = null;
        this.mImageWriter = null;
    }
}
