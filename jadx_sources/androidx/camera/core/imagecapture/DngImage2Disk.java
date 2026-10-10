package androidx.camera.core.imagecapture;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.processing.Operation;
import com.google.auto.value.AutoValue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public class DngImage2Disk implements Operation<AbstractC0961In, ImageCapture.OutputFileResults> {
    private DngCreator mDngCreator;

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.DngImage2Disk$In */
    @AutoValue
    public static abstract class AbstractC0961In {
        public abstract ImageProxy getImageProxy();

        public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

        public abstract int getRotationDegrees();

        /* JADX INFO: renamed from: of */
        public static AbstractC0961In m1909of(ImageProxy imageProxy, int i11, ImageCapture.OutputFileOptions outputFileOptions) {
            return new AutoValue_DngImage2Disk_In(imageProxy, i11, outputFileOptions);
        }
    }

    public DngImage2Disk(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult) {
        this(new DngCreator(cameraCharacteristics, captureResult));
    }

    @OptIn(markerClass = {ExperimentalGetImage.class})
    private void writeImageToFile(File file, ImageProxy imageProxy, int i11) throws ImageCaptureException {
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.mDngCreator.setOrientation(computeExifOrientation(i11));
                    this.mDngCreator.writeImage(fileOutputStream, imageProxy.getImage());
                    fileOutputStream.close();
                    imageProxy.close();
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
            } catch (IllegalArgumentException e12) {
                throw new ImageCaptureException(1, "Image with an unsupported format was used", e12);
            } catch (IllegalStateException e13) {
                throw new ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e13);
            }
        } catch (Throwable th4) {
            imageProxy.close();
            throw th4;
        }
    }

    @VisibleForTesting
    public DngImage2Disk(DngCreator dngCreator) {
        this.mDngCreator = dngCreator;
    }

    public static int computeExifOrientation(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 90) {
            return 6;
        }
        if (i11 != 180) {
            return i11 != 270 ? 0 : 8;
        }
        return 3;
    }

    @Override // androidx.camera.core.processing.Operation
    public ImageCapture.OutputFileResults apply(AbstractC0961In abstractC0961In) throws ImageCaptureException {
        ImageCapture.OutputFileOptions outputFileOptions = abstractC0961In.getOutputFileOptions();
        File fileCreateTempFile = FileUtil.createTempFile(outputFileOptions);
        writeImageToFile(fileCreateTempFile, abstractC0961In.getImageProxy(), abstractC0961In.getRotationDegrees());
        return new ImageCapture.OutputFileResults(FileUtil.moveFileToTarget(fileCreateTempFile, outputFileOptions), 32);
    }
}
