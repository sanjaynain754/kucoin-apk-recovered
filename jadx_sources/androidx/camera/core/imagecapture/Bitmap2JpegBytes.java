package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Bitmap2JpegBytes implements Operation<AbstractC0957In, Packet<byte[]>> {

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.Bitmap2JpegBytes$In */
    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class AbstractC0957In {
        public abstract int getJpegQuality();

        public abstract Packet<Bitmap> getPacket();

        /* JADX INFO: renamed from: of */
        public static AbstractC0957In m1898of(Packet<Bitmap> packet, int i11) {
            return new AutoValue_Bitmap2JpegBytes_In(packet, i11);
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static boolean hasGainmap(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    private static int getOutputFormat(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 34 || !Api34Impl.hasGainmap(bitmap)) {
            return 256;
        }
        return JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY;
    }

    @Override // androidx.camera.core.processing.Operation
    public Packet<byte[]> apply(AbstractC0957In abstractC0957In) throws ImageCaptureException {
        Packet<Bitmap> packet = abstractC0957In.getPacket();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        packet.getData().compress(Bitmap.CompressFormat.JPEG, abstractC0957In.getJpegQuality(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        return Packet.m2022of(byteArray, exif, getOutputFormat(packet.getData()), packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
