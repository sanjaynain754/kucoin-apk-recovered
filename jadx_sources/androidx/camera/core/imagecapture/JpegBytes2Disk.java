package androidx.camera.core.imagecapture;

import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class JpegBytes2Disk implements Operation<AbstractC0963In, ImageCapture.OutputFileResults> {

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.JpegBytes2Disk$In */
    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class AbstractC0963In {
        public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

        public abstract Packet<byte[]> getPacket();

        /* JADX INFO: renamed from: of */
        public static AbstractC0963In m1911of(Packet<byte[]> packet, ImageCapture.OutputFileOptions outputFileOptions) {
            return new AutoValue_JpegBytes2Disk_In(packet, outputFileOptions);
        }
    }

    public static void writeBytesToFile(File file, byte[] bArr) throws ImageCaptureException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new InvalidJpegDataParser().getValidDataLength(bArr));
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e11);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    public ImageCapture.OutputFileResults apply(AbstractC0963In abstractC0963In) throws ImageCaptureException {
        Packet<byte[]> packet = abstractC0963In.getPacket();
        ImageCapture.OutputFileOptions outputFileOptions = abstractC0963In.getOutputFileOptions();
        File fileCreateTempFile = FileUtil.createTempFile(outputFileOptions);
        writeBytesToFile(fileCreateTempFile, packet.getData());
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        FileUtil.updateFileExif(fileCreateTempFile, exif, outputFileOptions, packet.getRotationDegrees());
        return new ImageCapture.OutputFileResults(FileUtil.moveFileToTarget(fileCreateTempFile, outputFileOptions), 256);
    }
}
