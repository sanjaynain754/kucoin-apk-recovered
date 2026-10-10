package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.android.gms.internal.mlkit_vision_common.zzmw;
import com.google.android.odml.image.BitmapExtractor;
import com.google.android.odml.image.ByteBufferExtractor;
import com.google.android.odml.image.ImageProperties;
import com.google.android.odml.image.MediaImageExtractor;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes56.dex */
@KeepForSdk
public class CommonConvertUtils {
    @KeepForSdk
    public static void transformPointArray(@NonNull Point[] pointArr, @NonNull Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i11 = 0; i11 < pointArr.length; i11++) {
            Point point = pointArr[i11];
            int i12 = i11 + i11;
            fArr[i12] = point.x;
            fArr[i12 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i13 = 0; i13 < pointArr.length; i13++) {
            int i14 = i13 + i13;
            pointArr[i13].set((int) fArr[i14], (int) fArr[i14 + 1]);
        }
    }

    @KeepForSdk
    public static int convertToAndroidImageFormat(@InputImage.ImageFormat int i11) {
        int i12 = 17;
        if (i11 != 17) {
            i12 = 35;
            if (i11 != 35) {
                i12 = InputImage.IMAGE_FORMAT_YV12;
                if (i11 != 842094169) {
                    return 0;
                }
            }
        }
        return i12;
    }

    @KeepForSdk
    public static int convertToMVRotation(int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 90) {
            return 1;
        }
        if (i11 == 180) {
            return 2;
        }
        if (i11 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i11);
    }

    @KeepForSdk
    public static void transformPointF(@NonNull PointF pointF, @NonNull Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    @KeepForSdk
    public static void transformRect(@NonNull Rect rect, @NonNull Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    private static void zza(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzmu.zzb(zzms.zzb("vision-common"), i11, i12, j11, i13, i14, i15, i16);
    }

    @Nullable
    @KeepForSdk
    public static InputImage convertMlImagetoInputImage(@NonNull MlImage mlImage) {
        InputImage inputImageFromBitmap;
        Integer numValueOf;
        int iLimit;
        ImageProperties imageProperties = mlImage.getContainedImageProperties().get(0);
        int storageType = imageProperties.getStorageType();
        if (storageType != 1) {
            inputImageFromBitmap = null;
            if (storageType != 2) {
                if (storageType == 3) {
                    Image imageExtract = MediaImageExtractor.extract(mlImage);
                    if (imageExtract.getFormat() == 256) {
                        iLimit = imageExtract.getPlanes()[0].getBuffer().limit();
                    } else {
                        iLimit = (imageExtract.getPlanes()[0].getBuffer().limit() * 3) / 2;
                    }
                    zza(imageExtract.getFormat(), 5, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), iLimit, mlImage.getRotation());
                    inputImageFromBitmap = InputImage.fromMediaImage(imageExtract, mlImage.getRotation());
                }
            } else {
                ByteBuffer byteBufferExtract = ByteBufferExtractor.extract(mlImage);
                int imageFormat = imageProperties.getImageFormat();
                if (imageFormat != 4) {
                    if (imageFormat != 5) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(InputImage.IMAGE_FORMAT_YV12);
                    }
                } else {
                    numValueOf = 17;
                }
                if (numValueOf != null) {
                    zza(numValueOf.intValue(), 3, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), byteBufferExtract.limit(), mlImage.getRotation());
                    inputImageFromBitmap = InputImage.fromByteBuffer(byteBufferExtract, mlImage.getWidth(), mlImage.getHeight(), mlImage.getRotation(), numValueOf.intValue());
                }
            }
        } else {
            Bitmap bitmapExtract = BitmapExtractor.extract(mlImage);
            zza(-1, 1, SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), bitmapExtract.getAllocationByteCount(), mlImage.getRotation());
            inputImageFromBitmap = InputImage.fromBitmap(bitmapExtract, mlImage.getRotation());
        }
        if (inputImageFromBitmap != null) {
            zzmw.zza();
        }
        return inputImageFromBitmap;
    }

    @KeepForSdk
    public static void transformPointList(@NonNull List<PointF> list, @NonNull Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = i11 + i11;
            fArr[i12] = list.get(i11).x;
            fArr[i12 + 1] = list.get(i11).y;
        }
        matrix.mapPoints(fArr);
        for (int i13 = 0; i13 < list.size(); i13++) {
            int i14 = i13 + i13;
            list.get(i13).set(fArr[i14], fArr[i14 + 1]);
        }
    }
}
