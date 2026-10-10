package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.ExifOutputStream;
import androidx.core.util.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageUtil {
    public static final int DEFAULT_RGBA_PIXEL_STRIDE = 4;
    private static final String TAG = "ImageUtil";

    public static final class CodecFailedException extends Exception {
        private final FailureType mFailureType;

        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(String str) {
            super(str);
            this.mFailureType = FailureType.UNKNOWN;
        }

        public FailureType getFailureType() {
            return this.mFailureType;
        }

        public CodecFailedException(String str, FailureType failureType) {
            super(str);
            this.mFailureType = failureType;
        }
    }

    public static Bitmap createBitmapFromPlane(ImageProxy.PlaneProxy[] planeProxyArr, int i11, int i12) {
        Preconditions.checkArgument(planeProxyArr.length == 1, "Expect a single plane");
        Preconditions.checkArgument(planeProxyArr[0].getPixelStride() == 4, "Expect pixelStride=4");
        Preconditions.checkArgument(planeProxyArr[0].getRowStride() == i11 * 4, "Expect rowStride=width*4");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        planeProxyArr[0].getBuffer().rewind();
        ImageProcessingUtil.copyByteBufferToBitmap(bitmapCreateBitmap, planeProxyArr[0].getBuffer(), planeProxyArr[0].getRowStride());
        return bitmapCreateBitmap;
    }

    public static boolean isAspectRatioValid(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static byte[] jpegImageToJpegByteArray(ImageProxy imageProxy) {
        if (!isJpegFormats(imageProxy.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
        }
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }

    public static boolean shouldCropImage(int i11, int i12, int i13, int i14) {
        return (i11 == i13 && i12 == i14) ? false : true;
    }

    public static Rect computeCropRectFromDispatchInfo(Rect rect, int i11, Size size, int i12) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i12 - i11);
        float[] fArrSizeToVertexes = sizeToVertexes(size);
        matrix.mapPoints(fArrSizeToVertexes);
        matrix.postTranslate(-min(fArrSizeToVertexes[0], fArrSizeToVertexes[2], fArrSizeToVertexes[4], fArrSizeToVertexes[6]), -min(fArrSizeToVertexes[1], fArrSizeToVertexes[3], fArrSizeToVertexes[5], fArrSizeToVertexes[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static byte[] cropJpegByteArray(byte[] bArr, Rect rect, @IntRange(from = 1, m1553to = 100) int i11) throws CodecFailedException {
        try {
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, new BitmapFactory.Options());
            bitmapRegionDecoderNewInstance.recycle();
            if (bitmapDecodeRegion == null) {
                throw new CodecFailedException("Decode byte array failed.", CodecFailedException.FailureType.DECODE_FAILED);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (!bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream)) {
                throw new CodecFailedException("Encode bitmap failed.", CodecFailedException.FailureType.ENCODE_FAILED);
            }
            bitmapDecodeRegion.recycle();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.FailureType.DECODE_FAILED);
        } catch (IllegalArgumentException e11) {
            throw new CodecFailedException("Decode byte array failed with illegal argument." + e11, CodecFailedException.FailureType.DECODE_FAILED);
        }
    }

    public static Rational getRotatedAspectRatio(@IntRange(from = 0, m1553to = 359) int i11, Rational rational) {
        return (i11 == 90 || i11 == 270) ? inverseRational(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational inverseRational(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean isAspectRatioValid(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && isCropAspectRatioHasEffect(size, rational) && !rational.isNaN();
    }

    public static boolean isJpegFormats(int i11) {
        return i11 == 256 || i11 == 4101;
    }

    public static boolean isRawFormats(int i11) {
        return i11 == 32;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static boolean shouldCropImage(ImageProxy imageProxy) {
        return shouldCropImage(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getCropRect().width(), imageProxy.getCropRect().height());
    }

    private ImageUtil() {
    }

    public static Rect computeCropRectFromAspectRatio(Size size, Rational rational) {
        int i11;
        if (!isAspectRatioValid(rational)) {
            Logger.m1872w(TAG, "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f11 = width;
        float f12 = height;
        float f13 = f11 / f12;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i12 = 0;
        if (rational.floatValue() > f13) {
            int iRound = Math.round((f11 / numerator) * denominator);
            i11 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f12 / denominator) * numerator);
            int i13 = (width - iRound2) / 2;
            width = iRound2;
            i11 = 0;
            i12 = i13;
        }
        return new Rect(i12, i11, width + i12, height + i11);
    }

    public static Bitmap createBitmapFromImageProxy(ImageProxy imageProxy) {
        int format = imageProxy.getFormat();
        if (format != 1) {
            if (format != 35) {
                if (format != 256 && format != 4101) {
                    throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
                }
                return createBitmapFromJpegImage(imageProxy);
            }
            return ImageProcessingUtil.convertYUVToBitmap(imageProxy);
        }
        return createBitmapFromRgbaImage(imageProxy);
    }

    private static Bitmap createBitmapFromJpegImage(ImageProxy imageProxy) {
        byte[] bArrJpegImageToJpegByteArray = jpegImageToJpegByteArray(imageProxy);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrJpegImageToJpegByteArray, 0, bArrJpegImageToJpegByteArray.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    private static Bitmap createBitmapFromRgbaImage(ImageProxy imageProxy) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
        imageProxy.getPlanes()[0].getBuffer().rewind();
        ImageProcessingUtil.copyByteBufferToBitmap(bitmapCreateBitmap, imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer createDirectByteBuffer(Bitmap bitmap) {
        boolean z11;
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.copyBitmapToByteBuffer(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    private static boolean isCropAspectRatioHasEffect(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        if (height == Math.round((width / numerator) * denominator) && width == Math.round((height / denominator) * numerator)) {
            return false;
        }
        return true;
    }

    public static float min(float f11, float f12, float f13, float f14) {
        return Math.min(Math.min(f11, f12), Math.min(f13, f14));
    }

    public static float[] sizeToVertexes(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] yuvImageToJpegByteArray(ImageProxy imageProxy, Rect rect, @IntRange(from = 1, m1553to = 100) int i11, int i12) throws CodecFailedException {
        if (imageProxy.getFormat() == 35) {
            YuvImage yuvImage = new YuvImage(yuv_420_888toNv21(imageProxy), 17, imageProxy.getWidth(), imageProxy.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ExifOutputStream exifOutputStream = new ExifOutputStream(byteArrayOutputStream, ExifData.create(imageProxy, i12));
            if (rect == null) {
                rect = new Rect(0, 0, imageProxy.getWidth(), imageProxy.getHeight());
            }
            if (yuvImage.compressToJpeg(rect, i11, exifOutputStream)) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.FailureType.ENCODE_FAILED);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
    }

    public static byte[] yuv_420_888toNv21(ImageProxy imageProxy) {
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        ImageProxy.PlaneProxy planeProxy2 = imageProxy.getPlanes()[1];
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[2];
        ByteBuffer buffer = planeProxy.getBuffer();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        ByteBuffer buffer3 = planeProxy3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[((imageProxy.getWidth() * imageProxy.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i11 = 0; i11 < imageProxy.getHeight(); i11++) {
            buffer.get(bArr, width, imageProxy.getWidth());
            width += imageProxy.getWidth();
            buffer.position(Math.min(iRemaining, (buffer.position() - imageProxy.getWidth()) + planeProxy.getRowStride()));
        }
        int height = imageProxy.getHeight() / 2;
        int width2 = imageProxy.getWidth() / 2;
        int rowStride = planeProxy3.getRowStride();
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride = planeProxy3.getPixelStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        for (int i12 = 0; i12 < height; i12++) {
            buffer3.get(bArr2, 0, Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(rowStride2, buffer2.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < width2; i15++) {
                int i16 = width + 1;
                bArr[width] = bArr2[i13];
                width += 2;
                bArr[i16] = bArr3[i14];
                i13 += pixelStride;
                i14 += pixelStride2;
            }
        }
        return bArr;
    }

    public static byte[] jpegImageToJpegByteArray(ImageProxy imageProxy, Rect rect, @IntRange(from = 1, m1553to = 100) int i11) throws CodecFailedException {
        if (isJpegFormats(imageProxy.getFormat())) {
            return cropJpegByteArray(jpegImageToJpegByteArray(imageProxy), rect, i11);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
    }
}
