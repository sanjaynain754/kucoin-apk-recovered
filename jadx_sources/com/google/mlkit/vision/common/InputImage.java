package com.google.mlkit.vision.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes56.dex */
public class InputImage implements MLTaskInput {

    @KeepForSdk
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;

    @Nullable
    private volatile Bitmap zza;

    @Nullable
    private volatile ByteBuffer zzb;

    @Nullable
    private volatile zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;

    @ImageFormat
    private final int zzg;

    @Nullable
    private final Matrix zzh;

    /* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface ImageFormat {
    }

    private InputImage(@NonNull Bitmap bitmap, int i11) {
        this.zza = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        zza(i11);
        this.zzf = i11;
        this.zzg = -1;
        this.zzh = null;
    }

    @NonNull
    public static InputImage fromMediaImage(@NonNull Image image, int i11) {
        return zzb(image, i11, null);
    }

    private static int zza(int i11) {
        boolean z11 = true;
        if (i11 != 0 && i11 != 90 && i11 != 180) {
            if (i11 == 270) {
                i11 = 270;
            } else {
                z11 = false;
            }
        }
        Preconditions.checkArgument(z11, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i11;
    }

    @NonNull
    public static InputImage fromFilePath(@NonNull Context context, @NonNull Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapZza = ImageUtils.getInstance().zza(context.getContentResolver(), uri);
        InputImage inputImage = new InputImage(bitmapZza, 0);
        zzc(-1, 4, jElapsedRealtime, bitmapZza.getHeight(), bitmapZza.getWidth(), bitmapZza.getAllocationByteCount(), 0);
        return inputImage;
    }

    @NonNull
    @KeepForSdk
    public static InputImage fromMediaImage(@NonNull Image image, int i11, @NonNull Matrix matrix) {
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return zzb(image, i11, matrix);
    }

    private static void zzc(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzmu.zza(zzms.zzb("vision-common"), i11, i12, j11, i13, i14, i15, i16);
    }

    @Nullable
    @KeepForSdk
    public Bitmap getBitmapInternal() {
        return this.zza;
    }

    @Nullable
    @KeepForSdk
    public ByteBuffer getByteBuffer() {
        return this.zzb;
    }

    @Nullable
    @KeepForSdk
    public Matrix getCoordinatesMatrix() {
        return this.zzh;
    }

    @KeepForSdk
    @ImageFormat
    public int getFormat() {
        return this.zzg;
    }

    @KeepForSdk
    public int getHeight() {
        return this.zze;
    }

    @Nullable
    @KeepForSdk
    public Image getMediaImage() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zza();
    }

    @Nullable
    @KeepForSdk
    public Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zzb();
    }

    @KeepForSdk
    public int getRotationDegrees() {
        return this.zzf;
    }

    @KeepForSdk
    public int getWidth() {
        return this.zzd;
    }

    @NonNull
    public static InputImage fromBitmap(@NonNull Bitmap bitmap, int i11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i11);
        zzc(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i11);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteArray(@NonNull byte[] bArr, int i11, int i12, int i13, @ImageFormat int i14) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), i11, i12, i13, i14);
        zzc(i14, 2, jElapsedRealtime, i12, i11, bArr.length, i13);
        return inputImage;
    }

    @NonNull
    public static InputImage fromByteBuffer(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13, @ImageFormat int i14) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i11, i12, i13, i14);
        zzc(i14, 3, jElapsedRealtime, i12, i11, byteBuffer.limit(), i13);
        return inputImage;
    }

    private static InputImage zzb(@NonNull Image image, int i11, @Nullable Matrix matrix) {
        Image image2;
        int i12;
        int iLimit;
        InputImage inputImage;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        zza(i11);
        boolean z11 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i12 = i11;
            inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i11), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i12 = i11;
            InputImage inputImage2 = new InputImage(image2, image.getWidth(), image.getHeight(), i12, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            inputImage = inputImage2;
        }
        zzc(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i12);
        return inputImage;
    }

    private InputImage(@NonNull Image image, int i11, int i12, int i13, @Nullable Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.zzc = new zzb(image);
        this.zzd = i11;
        this.zze = i12;
        zza(i13);
        this.zzf = i13;
        this.zzg = 35;
        this.zzh = matrix;
    }

    private InputImage(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13, @ImageFormat int i14) {
        boolean z11;
        if (i14 == 842094169) {
            z11 = true;
        } else if (i14 == 17) {
            i14 = 17;
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        this.zzb = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i11 * i12, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.zzd = i11;
        this.zze = i12;
        zza(i13);
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = null;
    }
}
