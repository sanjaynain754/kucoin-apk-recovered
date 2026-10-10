package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.OperationCanceledException;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.OnImageAvailableListener {
    private static final String TAG = "ImageAnalysisAnalyzer";

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mNV21UVDelegatedBuffer;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mNV21YDelegatedBuffer;
    private volatile boolean mOnePixelShiftEnabled;
    private volatile boolean mOutputImageRotationEnabled;

    @IntRange(from = 0, m1553to = 359)
    private volatile int mPrevBufferRotationDegrees;

    @GuardedBy("mAnalyzerLock")
    private SafeCloseImageReaderProxy mProcessedImageReaderProxy;

    @GuardedBy("mAnalyzerLock")
    private ImageWriter mProcessedImageWriter;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mRGBConvertedBuffer;

    @IntRange(from = 0, m1553to = 359)
    private volatile int mRelativeRotation;

    @GuardedBy("mAnalyzerLock")
    private ImageAnalysis.Analyzer mSubscribedAnalyzer;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mURotatedBuffer;

    @GuardedBy("mAnalyzerLock")
    private Executor mUserExecutor;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mVRotatedBuffer;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    ByteBuffer mYRotatedBuffer;
    private volatile int mOutputImageFormat = 1;

    @GuardedBy("mAnalyzerLock")
    private Rect mOriginalViewPortCropRect = new Rect();

    @GuardedBy("mAnalyzerLock")
    private Rect mUpdatedViewPortCropRect = new Rect();

    @GuardedBy("mAnalyzerLock")
    private Matrix mOriginalSensorToBufferTransformMatrix = new Matrix();

    @GuardedBy("mAnalyzerLock")
    private Matrix mUpdatedSensorToBufferTransformMatrix = new Matrix();
    private final Object mAnalyzerLock = new Object();
    protected boolean mIsAttached = true;

    public abstract ImageProxy acquireImage(ImageReaderProxy imageReaderProxy);

    public void attach() {
        this.mIsAttached = true;
    }

    public abstract void clearCache();

    public void detach() {
        this.mIsAttached = false;
        clearCache();
    }

    public abstract void onValidImageAvailable(ImageProxy imageProxy);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1854a(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, ImageAnalysis.Analyzer analyzer, CallbackToFutureAdapter.Completer completer) {
        if (!imageAnalysisAbstractAnalyzer.mIsAttached) {
            completer.setException(new OperationCanceledException("ImageAnalysis is detached"));
            return;
        }
        SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy2, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), imageAnalysisAbstractAnalyzer.mOutputImageRotationEnabled ? 0 : imageAnalysisAbstractAnalyzer.mRelativeRotation, matrix, imageProxy.getImageInfo().getFlashState()));
        if (!rect.isEmpty()) {
            settableImageProxy.setCropRect(rect);
        }
        analyzer.analyze(settableImageProxy);
        completer.set(null);
    }

    @GuardedBy("mAnalyzerLock")
    private void createHelperBuffer(ImageProxy imageProxy) {
        if (this.mOutputImageFormat != 1 && this.mOutputImageFormat != 3) {
            if (this.mOutputImageFormat == 2 && this.mRGBConvertedBuffer == null) {
                this.mRGBConvertedBuffer = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.mYRotatedBuffer == null) {
            this.mYRotatedBuffer = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
        }
        this.mYRotatedBuffer.position(0);
        if (this.mURotatedBuffer == null) {
            this.mURotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
        }
        this.mURotatedBuffer.position(0);
        if (this.mVRotatedBuffer == null) {
            this.mVRotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
        }
        this.mVRotatedBuffer.position(0);
        if (this.mOutputImageFormat == 3) {
            if (this.mNV21YDelegatedBuffer == null) {
                this.mNV21YDelegatedBuffer = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
            }
            this.mNV21YDelegatedBuffer.position(0);
            if (this.mNV21UVDelegatedBuffer == null) {
                this.mNV21UVDelegatedBuffer = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 2);
            }
            this.mNV21UVDelegatedBuffer.position(0);
        }
    }

    private static SafeCloseImageReaderProxy createImageReaderProxy(int i11, int i12, int i13, int i14, int i15) {
        boolean z11 = i13 == 90 || i13 == 270;
        int i16 = z11 ? i12 : i11;
        if (!z11) {
            i11 = i12;
        }
        return new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(i16, i11, i14, i15));
    }

    @VisibleForTesting
    public static Matrix getAdditionalTransformMatrixAppliedByProcessor(int i11, int i12, int i13, int i14, @IntRange(from = 0, m1553to = 359) int i15) {
        Matrix matrix = new Matrix();
        if (i15 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i11, i12), TransformUtils.NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i15);
            matrix.postConcat(TransformUtils.getNormalizedToBuffer(new RectF(0.0f, 0.0f, i13, i14)));
        }
        return matrix;
    }

    public static Rect getUpdatedCropRect(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @GuardedBy("mAnalyzerLock")
    private void recalculateTransformMatrixAndCropRect(int i11, int i12, int i13, int i14) {
        Matrix additionalTransformMatrixAppliedByProcessor = getAdditionalTransformMatrixAppliedByProcessor(i11, i12, i13, i14, this.mRelativeRotation);
        this.mUpdatedViewPortCropRect = getUpdatedCropRect(this.mOriginalViewPortCropRect, additionalTransformMatrixAppliedByProcessor);
        this.mUpdatedSensorToBufferTransformMatrix.setConcat(this.mOriginalSensorToBufferTransformMatrix, additionalTransformMatrixAppliedByProcessor);
    }

    @GuardedBy("mAnalyzerLock")
    private void recreateImageReaderProxy(ImageProxy imageProxy, @IntRange(from = 0, m1553to = 359) int i11) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mProcessedImageReaderProxy;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.safeClose();
        this.mProcessedImageReaderProxy = createImageReaderProxy(imageProxy.getWidth(), imageProxy.getHeight(), i11, this.mProcessedImageReaderProxy.getImageFormat(), this.mProcessedImageReaderProxy.getMaxImages());
        if (this.mOutputImageFormat == 1) {
            ImageWriter imageWriter = this.mProcessedImageWriter;
            if (imageWriter != null) {
                ImageWriterCompat.close(imageWriter);
            }
            this.mProcessedImageWriter = ImageWriterCompat.newInstance(this.mProcessedImageReaderProxy.getSurface(), this.mProcessedImageReaderProxy.getMaxImages());
        }
    }

    public ListenableFuture<Void> analyzeImage(final ImageProxy imageProxy) throws Throwable {
        Object obj;
        final Executor executor;
        final ImageAnalysis.Analyzer analyzer;
        boolean z11;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        ImageProxy imageProxyRotateYUVAndConvertToNV21;
        ImageProxy imageProxy2;
        int i11 = this.mOutputImageRotationEnabled ? this.mRelativeRotation : 0;
        Object obj2 = this.mAnalyzerLock;
        synchronized (obj2) {
            try {
                try {
                    executor = this.mUserExecutor;
                    analyzer = this.mSubscribedAnalyzer;
                    z11 = this.mOutputImageRotationEnabled && i11 != this.mPrevBufferRotationDegrees;
                    if (z11) {
                        recreateImageReaderProxy(imageProxy, i11);
                    }
                    if (this.mOutputImageRotationEnabled || this.mOutputImageFormat == 3) {
                        createHelperBuffer(imageProxy);
                    }
                    try {
                        safeCloseImageReaderProxy = this.mProcessedImageReaderProxy;
                        try {
                            imageWriter = this.mProcessedImageWriter;
                            byteBuffer = this.mRGBConvertedBuffer;
                            byteBuffer2 = this.mYRotatedBuffer;
                            byteBuffer3 = this.mURotatedBuffer;
                            byteBuffer4 = this.mVRotatedBuffer;
                            byteBuffer5 = this.mNV21YDelegatedBuffer;
                            byteBuffer6 = this.mNV21UVDelegatedBuffer;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
        if (analyzer == null || executor == null || !this.mIsAttached) {
            return Futures.immediateFailedFuture(new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (safeCloseImageReaderProxy != null) {
            if (this.mOutputImageFormat == 2) {
                imageProxyRotateYUVAndConvertToNV21 = ImageProcessingUtil.convertYUVToRGB(imageProxy, safeCloseImageReaderProxy, byteBuffer, i11, this.mOnePixelShiftEnabled);
            } else {
                if (this.mOutputImageFormat == 1) {
                    if (this.mOnePixelShiftEnabled) {
                        ImageProcessingUtil.applyPixelShiftForYUV(imageProxy);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        imageProxyRotateYUVAndConvertToNV21 = ImageProcessingUtil.rotateYUV(imageProxy, safeCloseImageReaderProxy, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i11);
                    }
                }
                imageProxy2 = null;
            }
            imageProxy2 = imageProxyRotateYUVAndConvertToNV21;
        } else {
            if (this.mOutputImageFormat == 3) {
                if (this.mOnePixelShiftEnabled) {
                    ImageProcessingUtil.applyPixelShiftForYUV(imageProxy);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    imageProxyRotateYUVAndConvertToNV21 = ImageProcessingUtil.rotateYUVAndConvertToNV21(imageProxy, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i11);
                    imageProxy2 = imageProxyRotateYUVAndConvertToNV21;
                }
            }
            imageProxy2 = null;
        }
        boolean z12 = imageProxy2 == null;
        final ImageProxy imageProxy3 = z12 ? imageProxy : imageProxy2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.mAnalyzerLock) {
            if (z11 && !z12) {
                try {
                    recalculateTransformMatrixAndCropRect(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy3.getWidth(), imageProxy3.getHeight());
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            this.mPrevBufferRotationDegrees = i11;
            rect.set(this.mUpdatedViewPortCropRect);
            matrix.set(this.mUpdatedSensorToBufferTransformMatrix);
        }
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.u
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ImageAnalysisAbstractAnalyzer.m1855b(this.f1867a, executor, imageProxy, matrix, imageProxy3, rect, analyzer, completer);
            }
        });
    }

    public void setAnalyzer(Executor executor, ImageAnalysis.Analyzer analyzer) {
        if (analyzer == null) {
            clearCache();
        }
        synchronized (this.mAnalyzerLock) {
            this.mSubscribedAnalyzer = analyzer;
            this.mUserExecutor = executor;
        }
    }

    public void setOnePixelShiftEnabled(boolean z11) {
        this.mOnePixelShiftEnabled = z11;
    }

    public void setOutputImageFormat(int i11) {
        this.mOutputImageFormat = i11;
    }

    public void setOutputImageRotationEnabled(boolean z11) {
        this.mOutputImageRotationEnabled = z11;
    }

    public void setProcessedImageReaderProxy(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        synchronized (this.mAnalyzerLock) {
            this.mProcessedImageReaderProxy = safeCloseImageReaderProxy;
        }
    }

    public void setRelativeRotation(int i11) {
        this.mRelativeRotation = i11;
    }

    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalSensorToBufferTransformMatrix = matrix;
            this.mUpdatedSensorToBufferTransformMatrix = new Matrix(this.mOriginalSensorToBufferTransformMatrix);
        }
    }

    public void setViewPortCropRect(Rect rect) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalViewPortCropRect = rect;
            this.mUpdatedViewPortCropRect = new Rect(this.mOriginalViewPortCropRect);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1855b(final ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, Executor executor, final ImageProxy imageProxy, final Matrix matrix, final ImageProxy imageProxy2, final Rect rect, final ImageAnalysis.Analyzer analyzer, final CallbackToFutureAdapter.Completer completer) {
        imageAnalysisAbstractAnalyzer.getClass();
        executor.execute(new Runnable() { // from class: androidx.camera.core.t
            @Override // java.lang.Runnable
            public final void run() {
                ImageAnalysisAbstractAnalyzer.m1854a(this.f1860b, imageProxy, matrix, imageProxy2, rect, analyzer, completer);
            }
        });
        return "analyzeImage";
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireImage = acquireImage(imageReaderProxy);
            if (imageProxyAcquireImage != null) {
                onValidImageAvailable(imageProxyAcquireImage);
            }
        } catch (IllegalStateException e11) {
            Logger.m1869e(TAG, "Failed to acquire image.", e11);
        }
    }
}
