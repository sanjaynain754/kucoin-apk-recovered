package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes56.dex */
@KeepForSdk
public class ImageConvertUtils {
    private static final ImageConvertUtils zza = new ImageConvertUtils();

    @NonNull
    @KeepForSdk
    public static Bitmap yv12ToBitmap(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13) throws MlKitException {
        byte[] bArrZzb = zzb(yv12ToNv21Buffer(byteBuffer, true).array(), i11, i12);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
        return zza(bitmapDecodeByteArray, i13, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public static ImageConvertUtils getInstance() {
        return zza;
    }

    @NonNull
    public static Bitmap zza(@NonNull Bitmap bitmap, int i11, int i12, int i13) {
        if (i11 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
    }

    private static byte[] zzb(@NonNull byte[] bArr, int i11, int i12) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i11, i12), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        throw th2;
                    } catch (Exception unused) {
                        throw th2;
                    }
                }
            }
        } catch (IOException e11) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException("Image conversion error from NV21 format", 13, e11);
        }
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer convertToNv21Buffer(@NonNull InputImage inputImage, boolean z11) throws MlKitException {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format == 17) {
                return z11 ? bufferWithBackingArray((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())) : (ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer());
            }
            if (format == 35) {
                return yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight());
            }
            if (format == 842094169) {
                return yv12ToNv21Buffer((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), z11);
            }
            throw new MlKitException("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal());
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i11;
        ByteBuffer byteBufferAllocate = z11 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14++) {
            int i15 = 0;
            while (i15 < width) {
                int i16 = iArr[i13];
                int i17 = i16 >> 16;
                int i18 = i16 >> 8;
                int i19 = i16 & 255;
                int i21 = i12 + 1;
                int i22 = i17 & 255;
                int i23 = i18 & 255;
                byteBufferAllocate.put(i12, (byte) Math.min(255, (((((i22 * 66) + (i23 * 129)) + (i19 * 25)) + 128) >> 8) + 16));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    int i24 = ((((i22 * 112) - (i23 * 94)) - (i19 * 18)) + 128) >> 8;
                    int i25 = (((((i22 * (-38)) - (i23 * 74)) + (i19 * 112)) + 128) >> 8) + 128;
                    int i26 = i11 + 1;
                    byteBufferAllocate.put(i11, (byte) Math.min(255, i24 + 128));
                    i11 += 2;
                    byteBufferAllocate.put(i26, (byte) Math.min(255, i25));
                }
                i13++;
                i15++;
                i12 = i21;
            }
        }
        return byteBufferAllocate;
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer yuv420ThreePlanesToNV21(@NonNull Image.Plane[] planeArr, int i11, int i12) {
        int i13 = i11 * i12;
        int i14 = i13 / 4;
        byte[] bArr = new byte[i14 + i14 + i13];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i15 = (i13 + i13) / 4;
        boolean z11 = buffer2.remaining() == i15 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z11) {
            planeArr[0].getBuffer().get(bArr, 0, i13);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i13, 1);
            buffer3.get(bArr, i13 + 1, i15 - 1);
        } else {
            zzc(planeArr[0], i11, i12, bArr, 0, 1);
            zzc(planeArr[1], i11, i12, bArr, i13 + 1, 2);
            zzc(planeArr[2], i11, i12, bArr, i13, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    private ImageConvertUtils() {
    }

    @NonNull
    @KeepForSdk
    public static ByteBuffer bufferWithBackingArray(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @NonNull
    @KeepForSdk
    public static ByteBuffer yv12ToNv21Buffer(@NonNull ByteBuffer byteBuffer, boolean z11) {
        ByteBuffer byteBufferAllocateDirect;
        int i11;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit / 6;
        if (z11) {
            byteBufferAllocateDirect = ByteBuffer.allocate(iLimit);
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iLimit);
        }
        int i13 = 0;
        while (true) {
            i11 = i12 * 4;
            if (i13 >= i11) {
                break;
            }
            byteBufferAllocateDirect.put(i13, byteBuffer.get(i13));
            i13++;
        }
        for (int i14 = 0; i14 < i12 + i12; i14++) {
            byteBufferAllocateDirect.put(i11 + i14, byteBuffer.get(((i14 % 2) * i12) + i11 + (i14 / 2)));
        }
        return byteBufferAllocateDirect;
    }

    private static final void zzc(Image.Plane plane, int i11, int i12, byte[] bArr, int i13, int i14) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit != 0) {
            int i15 = i11 / (i12 / iLimit);
            int rowStride = 0;
            for (int i16 = 0; i16 < iLimit; i16++) {
                int pixelStride = rowStride;
                for (int i17 = 0; i17 < i15; i17++) {
                    bArr[i13] = buffer.get(pixelStride);
                    i13 += i14;
                    pixelStride += plane.getPixelStride();
                }
                rowStride += plane.getRowStride();
            }
        }
    }

    @NonNull
    @KeepForSdk
    public byte[] byteBufferToByteArray(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    @NonNull
    @KeepForSdk
    public ByteBuffer cloneByteBuffer(@NonNull ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate;
        Preconditions.checkNotNull(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            byteBufferAllocate = ByteBuffer.allocateDirect(iCapacity);
        } else {
            byteBufferAllocate = ByteBuffer.allocate(iCapacity);
        }
        byteBufferAllocate.limit(byteBuffer.limit());
        byteBufferAllocate.put((ByteBuffer) byteBuffer.rewind());
        byteBufferAllocate.position(iPosition);
        byteBuffer.position(iPosition);
        return byteBufferAllocate;
    }

    @NonNull
    @KeepForSdk
    public Bitmap convertJpegToUpRightBitmap(@NonNull Image image, int i11) {
        boolean z11;
        if (image.getFormat() == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes != null && planes.length == 1) {
            ByteBuffer buffer = planes[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            return zza(bitmapDecodeByteArray, i11, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
        }
        throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
    }

    @NonNull
    @KeepForSdk
    public Bitmap convertToUpRightBitmap(@NonNull InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format != 17) {
                if (format != 35) {
                    if (format == 842094169) {
                        return yv12ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                return nv21ToBitmap(yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
            }
            return nv21ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        return zza((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()), inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
    }

    @NonNull
    @KeepForSdk
    public Bitmap getUpRightBitmap(@NonNull InputImage inputImage) throws MlKitException {
        Bitmap bitmapInternal = inputImage.getBitmapInternal();
        if (bitmapInternal != null) {
            return zza(bitmapInternal, inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
        }
        return convertToUpRightBitmap(inputImage);
    }

    @NonNull
    @KeepForSdk
    public Bitmap nv21ToBitmap(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13) throws MlKitException {
        byte[] bArrZzb = zzb(byteBufferToByteArray(byteBuffer), i11, i12);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
        return zza(bitmapDecodeByteArray, i13, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }
}
