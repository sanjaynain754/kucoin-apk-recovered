package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ImageProcessingUtil {
    public static final String JNI_LIB_NAME = "image_processing_util_jni";
    private static final String TAG = "ImageProcessingUtil";
    private static int sImageCount;

    public static class NV21ImageProxy extends ForwardingImageProxy {
        private final int mHeight;
        private final ImageProxy.PlaneProxy[] mPlanes;
        private final int mWidth;

        private ImageProxy.PlaneProxy[] createPlanes(final ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, final int i11) {
            return new ImageProxy.PlaneProxy[]{new ImageProxy.PlaneProxy() { // from class: androidx.camera.core.ImageProcessingUtil.NV21ImageProxy.1
                @Override // androidx.camera.core.ImageProxy.PlaneProxy
                public int getPixelStride() {
                    return 1;
                }

                @Override // androidx.camera.core.ImageProxy.PlaneProxy
                public ByteBuffer getBuffer() {
                    return byteBuffer;
                }

                @Override // androidx.camera.core.ImageProxy.PlaneProxy
                public int getRowStride() {
                    return i11;
                }
            }, new NV21PlaneProxy(byteBuffer2, i11), new NV21PlaneProxy(byteBuffer3, i11)};
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
            return this.mHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public ImageProxy.PlaneProxy[] getPlanes() {
            return this.mPlanes;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
            return this.mWidth;
        }

        public NV21ImageProxy(ImageProxy imageProxy, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11, int i12, @IntRange(from = 0, m1553to = 359) int i13) {
            super(imageProxy);
            this.mPlanes = createPlanes(byteBuffer, byteBuffer2, byteBuffer3, i11);
            this.mWidth = i11;
            this.mHeight = i12;
        }
    }

    public static class NV21PlaneProxy implements ImageProxy.PlaneProxy {
        private final ByteBuffer mByteBuffer;
        private final int mRowStride;

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
            return 2;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public ByteBuffer getBuffer() {
            return this.mByteBuffer;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
            return this.mRowStride;
        }

        public NV21PlaneProxy(ByteBuffer byteBuffer, int i11) {
            this.mByteBuffer = byteBuffer;
            this.mRowStride = i11;
        }
    }

    public enum Result {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    public static boolean convertYuvToJpegBytesIntoSurface(Image image, @IntRange(from = 1, m1553to = 100) int i11, int i12, Surface surface) {
        return convertYuvToJpegBytesIntoSurface(new AndroidImageProxy(image), i11, i12, surface);
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, int i14, int i15, Surface surface, ByteBuffer byteBuffer4, int i16, int i17, int i18, int i19, int i21, int i22);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, int i14, int i15, Bitmap bitmap, int i16, int i17, int i18);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, boolean z11);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i11, int i12);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, int i14, ByteBuffer byteBuffer4, int i15, int i16, ByteBuffer byteBuffer5, int i17, int i18, ByteBuffer byteBuffer6, int i19, int i21, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i22, int i23, int i24);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    static {
        System.loadLibrary(JNI_LIB_NAME);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1864a(ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3) {
        if (imageProxy == null || imageProxy2 == null) {
            return;
        }
        imageProxy2.close();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1865b(ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3) {
        if (imageProxy == null || imageProxy2 == null) {
            return;
        }
        imageProxy2.close();
    }

    public static boolean convertYuvToJpegBytesIntoSurface(ImageProxy imageProxy, @IntRange(from = 1, m1553to = 100) int i11, int i12, Surface surface) {
        try {
            return writeJpegBytesToSurface(surface, ImageUtil.yuvImageToJpegByteArray(imageProxy, null, i11, i12));
        } catch (ImageUtil.CodecFailedException e11) {
            Logger.m1869e(TAG, "Failed to encode YUV to JPEG", e11);
            return false;
        }
    }

    private static boolean isSupportedRotationDegrees(@IntRange(from = 0, m1553to = 359) int i11) {
        return i11 == 0 || i11 == 90 || i11 == 180 || i11 == 270;
    }

    public static ImageProxy rotateYUVAndConvertToNV21(ImageProxy imageProxy, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, @IntRange(from = 0, m1553to = 359) int i11) {
        if (!isSupportedYUVFormat(imageProxy)) {
            Logger.m1868e(TAG, "Unsupported format for rotate YUV");
            return null;
        }
        if (!isSupportedRotationDegrees(i11)) {
            Logger.m1868e(TAG, "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i11 == 0 && isNV21FormatImage(imageProxy)) {
            return null;
        }
        int i12 = i11 % 180;
        int width = i12 == 0 ? imageProxy.getWidth() : imageProxy.getHeight();
        int height = i12 == 0 ? imageProxy.getHeight() : imageProxy.getWidth();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        int i13 = height;
        if (nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride(), imageProxy.getPlanes()[1].getBuffer(), imageProxy.getPlanes()[1].getRowStride(), imageProxy.getPlanes()[2].getBuffer(), imageProxy.getPlanes()[2].getRowStride(), imageProxy.getPlanes()[2].getPixelStride(), byteBuffer4, width, 1, byteBufferNativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, imageProxy.getWidth(), imageProxy.getHeight(), i11) == 0) {
            return new SingleCloseImageProxy(new NV21ImageProxy(imageProxy, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, width, i13, i11));
        }
        Logger.m1868e(TAG, "rotate YUV failure");
        return null;
    }

    private ImageProcessingUtil() {
    }

    public static boolean applyPixelShiftForYUV(ImageProxy imageProxy) {
        if (!isSupportedYUVFormat(imageProxy)) {
            Logger.m1868e(TAG, "Unsupported format for YUV to RGB");
            return false;
        }
        if (applyPixelShiftInternal(imageProxy) == Result.ERROR_CONVERSION) {
            Logger.m1868e(TAG, "One pixel shift for YUV failure");
            return false;
        }
        return true;
    }

    private static Result applyPixelShiftInternal(ImageProxy imageProxy) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        if (nativeShiftPixel(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, width, height, pixelStride, pixelStride2, pixelStride2) != 0) {
            return Result.ERROR_CONVERSION;
        }
        return Result.SUCCESS;
    }

    public static ImageProxy convertJpegBytesToImage(ImageReaderProxy imageReaderProxy, byte[] bArr) {
        boolean z11;
        if (imageReaderProxy.getImageFormat() == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        Preconditions.checkNotNull(bArr);
        Surface surface = imageReaderProxy.getSurface();
        Preconditions.checkNotNull(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            Logger.m1868e(TAG, "Failed to enqueue JPEG image.");
            return null;
        }
        ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (imageProxyAcquireLatestImage == null) {
            Logger.m1868e(TAG, "Failed to get acquire JPEG image.");
        }
        return imageProxyAcquireLatestImage;
    }

    public static Bitmap convertYUVToBitmap(ImageProxy imageProxy) {
        if (imageProxy.getFormat() == 35) {
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            int rowStride = imageProxy.getPlanes()[0].getRowStride();
            int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
            int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
            int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
            int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
            if (nativeConvertAndroid420ToBitmap(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
                return bitmapCreateBitmap;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static ImageProxy convertYUVToRGB(final ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ByteBuffer byteBuffer, @IntRange(from = 0, m1553to = 359) int i11, boolean z11) {
        if (!isSupportedYUVFormat(imageProxy)) {
            Logger.m1868e(TAG, "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!isSupportedRotationDegrees(i11)) {
            Logger.m1868e(TAG, "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (convertYUVToRGBInternal(imageProxy, imageReaderProxy.getSurface(), byteBuffer, i11, z11) == Result.ERROR_CONVERSION) {
            Logger.m1868e(TAG, "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Logger.m1866d(TAG, String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(sImageCount)));
            sImageCount++;
        }
        final ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (imageProxyAcquireLatestImage == null) {
            Logger.m1868e(TAG, "YUV to RGB acquireLatestImage failure");
            return null;
        }
        SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxyAcquireLatestImage);
        singleCloseImageProxy.addOnImageCloseListener(new ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.g0
            @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
            public final void onImageClose(ImageProxy imageProxy2) {
                ImageProcessingUtil.m1865b(imageProxyAcquireLatestImage, imageProxy, imageProxy2);
            }
        });
        return singleCloseImageProxy;
    }

    private static Result convertYUVToRGBInternal(ImageProxy imageProxy, Surface surface, ByteBuffer byteBuffer, int i11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        if (z11) {
            i12 = pixelStride;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = pixelStride2;
        } else {
            i13 = 0;
        }
        if (z11) {
            i14 = pixelStride2;
        } else {
            i14 = 0;
        }
        if (nativeConvertAndroid420ToABGR(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, surface, byteBuffer, width, height, i12, i13, i14, i11) != 0) {
            return Result.ERROR_CONVERSION;
        }
        return Result.SUCCESS;
    }

    public static void copyBitmapToByteBuffer(Bitmap bitmap, ByteBuffer byteBuffer, int i11) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i11, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void copyByteBufferToBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i11) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i11, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean isNV21FormatImage(ImageProxy imageProxy) {
        if (imageProxy.getPlanes().length != 3 || imageProxy.getPlanes()[1].getPixelStride() != 2 || nativeGetYUVImageVUOff(imageProxy.getPlanes()[2].getBuffer(), imageProxy.getPlanes()[1].getBuffer()) != -1) {
            return false;
        }
        return true;
    }

    private static boolean isSupportedYUVFormat(ImageProxy imageProxy) {
        if (imageProxy.getFormat() == 35 && imageProxy.getPlanes().length == 3) {
            return true;
        }
        return false;
    }

    public static ImageProxy rotateYUV(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, @IntRange(from = 0, m1553to = 359) int i11) {
        final ImageProxy imageProxy2;
        Result resultRotateYUVInternal;
        if (!isSupportedYUVFormat(imageProxy)) {
            Logger.m1868e(TAG, "Unsupported format for rotate YUV");
            return null;
        }
        if (!isSupportedRotationDegrees(i11)) {
            Logger.m1868e(TAG, "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        Result result = Result.ERROR_CONVERSION;
        if (i11 > 0) {
            imageProxy2 = imageProxy;
            resultRotateYUVInternal = rotateYUVInternal(imageProxy2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i11);
        } else {
            imageProxy2 = imageProxy;
            resultRotateYUVInternal = result;
        }
        if (resultRotateYUVInternal == result) {
            Logger.m1868e(TAG, "rotate YUV failure");
            return null;
        }
        final ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (imageProxyAcquireLatestImage == null) {
            Logger.m1868e(TAG, "YUV rotation acquireLatestImage failure");
            return null;
        }
        SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxyAcquireLatestImage);
        singleCloseImageProxy.addOnImageCloseListener(new ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.h0
            @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
            public final void onImageClose(ImageProxy imageProxy3) {
                ImageProcessingUtil.m1864a(imageProxyAcquireLatestImage, imageProxy2, imageProxy3);
            }
        });
        return singleCloseImageProxy;
    }

    @RequiresApi(23)
    private static Result rotateYUVInternal(ImageProxy imageProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[1].getPixelStride();
        Image imageDequeueInputImage = ImageWriterCompat.dequeueInputImage(imageWriter);
        if (imageDequeueInputImage == null) {
            return Result.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i11) != 0) {
            return Result.ERROR_CONVERSION;
        }
        ImageWriterCompat.queueInputImage(imageWriter, imageDequeueInputImage);
        return Result.SUCCESS;
    }

    public static boolean writeJpegBytesToSurface(Surface surface, byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkNotNull(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            Logger.m1868e(TAG, "Failed to enqueue JPEG image.");
            return false;
        }
        return true;
    }
}
