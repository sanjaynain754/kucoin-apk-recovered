package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCaptureException;
import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface TakePictureManager {

    @AutoValue
    public static abstract class CaptureError {
        public abstract ImageCaptureException getImageCaptureException();

        public abstract int getRequestId();

        /* JADX INFO: renamed from: of */
        public static CaptureError m1925of(int i11, ImageCaptureException imageCaptureException) {
            return new AutoValue_TakePictureManager_CaptureError(i11, imageCaptureException);
        }
    }

    public interface Provider {
        TakePictureManager newInstance(ImageCaptureControl imageCaptureControl);
    }

    @MainThread
    void abortRequests();

    @VisibleForTesting
    RequestWithCallback getCapturingRequest();

    @VisibleForTesting
    ImagePipeline getImagePipeline();

    @VisibleForTesting
    List<RequestWithCallback> getIncompleteRequests();

    @VisibleForTesting
    boolean hasCapturingRequest();

    @MainThread
    void offerRequest(TakePictureRequest takePictureRequest);

    @MainThread
    void pause();

    @MainThread
    void resume();

    @MainThread
    void setImagePipeline(ImagePipeline imagePipeline);
}
