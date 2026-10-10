package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.Threads;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class RequestWithCallback implements TakePictureCallback {
    private CallbackToFutureAdapter.Completer<Void> mCaptureCompleter;
    private ListenableFuture<Void> mCaptureRequestFuture;
    private CallbackToFutureAdapter.Completer<Void> mCompleteCompleter;
    private final TakePictureRequest.RetryControl mRetryControl;
    private final TakePictureRequest mTakePictureRequest;
    private boolean mIsAborted = false;
    private boolean mIsStarted = false;
    private final ListenableFuture<Void> mCaptureFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.imagecapture.t
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
            return RequestWithCallback.m1923a(this.f1642a, completer);
        }
    });
    private final ListenableFuture<Void> mCompleteFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.imagecapture.u
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
            return RequestWithCallback.m1924b(this.f1643a, completer);
        }
    });

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @MainThread
    public void onFinalResult(ImageCapture.OutputFileResults outputFileResults) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        checkOnImageCaptured();
        markComplete();
        this.mTakePictureRequest.onResult(outputFileResults);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m1923a(RequestWithCallback requestWithCallback, CallbackToFutureAdapter.Completer completer) {
        requestWithCallback.mCaptureCompleter = completer;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1924b(RequestWithCallback requestWithCallback, CallbackToFutureAdapter.Completer completer) {
        requestWithCallback.mCompleteCompleter = completer;
        return "RequestCompleteFuture";
    }

    private void checkOnImageCaptured() {
        Preconditions.checkState(this.mCaptureFuture.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    private void markComplete() {
        if (!this.mTakePictureRequest.isSimultaneousCapture() || this.mTakePictureRequest.isFormatProcessedInSimultaneousCapture()) {
            if (!this.mTakePictureRequest.isSimultaneousCapture()) {
                Preconditions.checkState(!this.mCompleteFuture.isDone(), "The callback can only complete once.");
            }
            this.mCompleteCompleter.set(null);
        }
    }

    @VisibleForTesting
    public TakePictureRequest getTakePictureRequest() {
        return this.mTakePictureRequest;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public boolean isAborted() {
        return this.mIsAborted;
    }

    public RequestWithCallback(TakePictureRequest takePictureRequest, TakePictureRequest.RetryControl retryControl) {
        this.mTakePictureRequest = takePictureRequest;
        this.mRetryControl = retryControl;
    }

    @MainThread
    private void abort(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        this.mIsAborted = true;
        ListenableFuture<Void> listenableFuture = this.mCaptureRequestFuture;
        Objects.requireNonNull(listenableFuture);
        listenableFuture.cancel(true);
        this.mCaptureCompleter.setException(imageCaptureException);
        this.mCompleteCompleter.set(null);
    }

    @MainThread
    private void onFailure(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        this.mTakePictureRequest.onError(imageCaptureException);
    }

    @MainThread
    public void abortAndSendErrorToApp(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (this.mCompleteFuture.isDone()) {
            return;
        }
        abort(imageCaptureException);
        onFailure(imageCaptureException);
    }

    @MainThread
    public void abortSilentlyAndRetry() {
        Threads.checkMainThread();
        if (this.mCompleteFuture.isDone()) {
            return;
        }
        abort(new ImageCaptureException(3, "The request is aborted silently and retried.", null));
        this.mRetryControl.retryRequest(this.mTakePictureRequest);
    }

    @MainThread
    public ListenableFuture<Void> getCaptureFuture() {
        Threads.checkMainThread();
        return this.mCaptureFuture;
    }

    @MainThread
    public ListenableFuture<Void> getCompleteFuture() {
        Threads.checkMainThread();
        return this.mCompleteFuture;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @MainThread
    public void onCaptureFailure(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (!this.mIsAborted) {
            boolean zDecrementRetryCounter = this.mTakePictureRequest.decrementRetryCounter();
            if (!zDecrementRetryCounter) {
                onFailure(imageCaptureException);
            }
            markComplete();
            this.mCaptureCompleter.setException(imageCaptureException);
            if (zDecrementRetryCounter) {
                this.mRetryControl.retryRequest(this.mTakePictureRequest);
            }
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureProcessProgressed(int i11) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        this.mTakePictureRequest.onCaptureProcessProgressed(i11);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @MainThread
    public void onCaptureStarted() {
        Threads.checkMainThread();
        if (!this.mIsAborted && !this.mIsStarted) {
            this.mIsStarted = true;
            ImageCapture.OnImageCapturedCallback inMemoryCallback = this.mTakePictureRequest.getInMemoryCallback();
            if (inMemoryCallback != null) {
                inMemoryCallback.onCaptureStarted();
            }
            ImageCapture.OnImageSavedCallback onDiskCallback = this.mTakePictureRequest.getOnDiskCallback();
            if (onDiskCallback != null) {
                onDiskCallback.onCaptureStarted();
            }
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @MainThread
    public void onImageCaptured() {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        if (!this.mIsStarted) {
            onCaptureStarted();
        }
        this.mCaptureCompleter.set(null);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        this.mTakePictureRequest.onPostviewBitmapAvailable(bitmap);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @MainThread
    public void onProcessFailure(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        checkOnImageCaptured();
        markComplete();
        onFailure(imageCaptureException);
    }

    @MainThread
    public void setCaptureRequestFuture(ListenableFuture<Void> listenableFuture) {
        boolean z11;
        Threads.checkMainThread();
        if (this.mCaptureRequestFuture == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "CaptureRequestFuture can only be set once.");
        this.mCaptureRequestFuture = listenableFuture;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @MainThread
    public void onFinalResult(ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            imageProxy.close();
            return;
        }
        checkOnImageCaptured();
        markComplete();
        this.mTakePictureRequest.onResult(imageProxy);
    }
}
