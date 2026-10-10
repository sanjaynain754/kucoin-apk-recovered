package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    private final PreviewImageProcessorImpl mPreviewImageProcessor;
    private final CaptureResultImageMatcher mCaptureResultImageMatcher = new CaptureResultImageMatcher();
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private boolean mIsClosed = false;

    @GuardedBy("mLock")
    private boolean mIsPaused = false;

    public interface OnCaptureResultCallback {
        void onCaptureResult(long j11, List<Pair<CaptureResult.Key, Object>> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    imageReference.decrement();
                    Logger.m1866d(TAG, "Ignore image in closed or paused state");
                    return;
                }
                try {
                    Version version = Version.VERSION_1_3;
                    if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
                        this.mPreviewImageProcessor.process(imageReference.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j11, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j11, list);
                            }

                            public void onCaptureProcessProgressed(int i12) {
                            }
                        }, CameraXExecutors.ioExecutor());
                    } else {
                        this.mPreviewImageProcessor.process(imageReference.get(), totalCaptureResult);
                    }
                    imageReference.decrement();
                } catch (Throwable th2) {
                    imageReference.decrement();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.clear();
            this.mCaptureResultImageMatcher.clearImageReferenceListener();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.captureResultIncoming(totalCaptureResult);
    }

    public void notifyImage(ImageReference imageReference) {
        this.mCaptureResultImageMatcher.imageIncoming(imageReference);
    }

    public void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    public void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    public void start(final OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.setImageReferenceListener(new CaptureResultImageMatcher.ImageReferenceListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.c
            @Override // androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener
            public final void onImageReferenceIncoming(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i11) {
                this.f1907a.lambda$start$0(onCaptureResultCallback, imageReference, totalCaptureResult, i11);
            }
        });
    }

    public PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }
}
