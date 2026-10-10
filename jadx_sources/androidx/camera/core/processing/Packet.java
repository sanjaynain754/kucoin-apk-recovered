package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class Packet<T> {
    /* JADX INFO: renamed from: of */
    public static Packet<Bitmap> m2019of(Bitmap bitmap, Exif exif, Rect rect, int i11, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bitmap, exif, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i11, matrix, cameraCaptureResult);
    }

    public abstract CameraCaptureResult getCameraCaptureResult();

    public abstract Rect getCropRect();

    public abstract T getData();

    public abstract Exif getExif();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    public abstract Matrix getSensorToBufferTransform();

    public abstract Size getSize();

    /* JADX INFO: renamed from: of */
    public static Packet<ImageProxy> m2020of(ImageProxy imageProxy, Exif exif, Rect rect, int i11, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        return m2021of(imageProxy, exif, new Size(imageProxy.getWidth(), imageProxy.getHeight()), rect, i11, matrix, cameraCaptureResult);
    }

    public boolean hasCropping() {
        return TransformUtils.hasCropping(getCropRect(), getSize());
    }

    /* JADX INFO: renamed from: of */
    public static Packet<ImageProxy> m2021of(ImageProxy imageProxy, Exif exif, Size size, Rect rect, int i11, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (ImageUtil.isJpegFormats(imageProxy.getFormat())) {
            Preconditions.checkNotNull(exif, "JPEG image must have Exif.");
        }
        return new AutoValue_Packet(imageProxy, exif, imageProxy.getFormat(), size, rect, i11, matrix, cameraCaptureResult);
    }

    /* JADX INFO: renamed from: of */
    public static Packet<byte[]> m2022of(byte[] bArr, Exif exif, int i11, Size size, Rect rect, int i12, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bArr, exif, i11, size, rect, i12, matrix, cameraCaptureResult);
    }
}
