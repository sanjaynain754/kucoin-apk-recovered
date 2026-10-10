package androidx.camera.core.imagecapture;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class TakePictureManagerImpl implements TakePictureManager, ForwardingImageProxy.OnImageCloseListener, TakePictureRequest.RetryControl {
    private static final String TAG = "TakePictureManagerImpl";
    private RequestWithCallback mCapturingRequest;
    final ImageCaptureControl mImageCaptureControl;
    ImagePipeline mImagePipeline;
    private final List<RequestWithCallback> mIncompleteRequests;

    @VisibleForTesting
    final Deque<TakePictureRequest> mNewRequests = new ArrayDeque();
    boolean mPaused = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1927b(TakePictureManagerImpl takePictureManagerImpl) {
        takePictureManagerImpl.mCapturingRequest = null;
        takePictureManagerImpl.issueNextRequest();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @VisibleForTesting
    public RequestWithCallback getCapturingRequest() {
        return this.mCapturingRequest;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @VisibleForTesting
    public ImagePipeline getImagePipeline() {
        return this.mImagePipeline;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @VisibleForTesting
    public List<RequestWithCallback> getIncompleteRequests() {
        return this.mIncompleteRequests;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @VisibleForTesting
    public boolean hasCapturingRequest() {
        return this.mCapturingRequest != null;
    }

    @MainThread
    public TakePictureManagerImpl(ImageCaptureControl imageCaptureControl) {
        Threads.checkMainThread();
        this.mImageCaptureControl = imageCaptureControl;
        this.mIncompleteRequests = new ArrayList();
    }

    @MainThread
    private ListenableFuture<Void> submitCameraRequest(final CameraRequest cameraRequest) {
        Threads.checkMainThread();
        this.mImageCaptureControl.lockFlashMode();
        ListenableFuture<Void> listenableFutureSubmitStillCaptureRequests = this.mImageCaptureControl.submitStillCaptureRequests(cameraRequest.getCaptureConfigs());
        Futures.addCallback(listenableFutureSubmitStillCaptureRequests, new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.TakePictureManagerImpl.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                if (cameraRequest.isAborted()) {
                    return;
                }
                int id2 = cameraRequest.getCaptureConfigs().get(0).getId();
                if (th2 instanceof ImageCaptureException) {
                    TakePictureManagerImpl.this.mImagePipeline.notifyCaptureError(TakePictureManager.CaptureError.m1925of(id2, (ImageCaptureException) th2));
                } else {
                    TakePictureManagerImpl.this.mImagePipeline.notifyCaptureError(TakePictureManager.CaptureError.m1925of(id2, new ImageCaptureException(2, "Failed to submit capture request", th2)));
                }
                TakePictureManagerImpl.this.mImageCaptureControl.unlockFlashMode();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r11) {
                TakePictureManagerImpl.this.mImageCaptureControl.unlockFlashMode();
            }
        }, CameraXExecutors.mainThreadExecutor());
        return listenableFutureSubmitStillCaptureRequests;
    }

    private void trackCurrentRequests(final RequestWithCallback requestWithCallback) {
        Preconditions.checkState(!hasCapturingRequest());
        this.mCapturingRequest = requestWithCallback;
        requestWithCallback.getCaptureFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.w
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureManagerImpl.m1927b(this.f1645b);
            }
        }, CameraXExecutors.directExecutor());
        this.mIncompleteRequests.add(requestWithCallback);
        requestWithCallback.getCompleteFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f1646b.mIncompleteRequests.remove(requestWithCallback);
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @MainThread
    public void abortRequests() {
        Threads.checkMainThread();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Iterator<TakePictureRequest> it = this.mNewRequests.iterator();
        while (it.hasNext()) {
            it.next().onError(imageCaptureException);
        }
        this.mNewRequests.clear();
        Iterator it2 = new ArrayList(this.mIncompleteRequests).iterator();
        while (it2.hasNext()) {
            ((RequestWithCallback) it2.next()).abortAndSendErrorToApp(imageCaptureException);
        }
    }

    @MainThread
    public void issueNextRequest() {
        Threads.checkMainThread();
        Log.d(TAG, "Issue the next TakePictureRequest.");
        if (hasCapturingRequest()) {
            Log.d(TAG, "There is already a request in-flight.");
            return;
        }
        if (this.mPaused) {
            Log.d(TAG, "The class is paused.");
            return;
        }
        if (this.mImagePipeline.getCapacity() == 0) {
            Log.d(TAG, "Too many acquire images. Close image to be able to process next.");
            return;
        }
        TakePictureRequest takePictureRequestPoll = this.mNewRequests.poll();
        if (takePictureRequestPoll == null) {
            Log.d(TAG, "No new request.");
            return;
        }
        RequestWithCallback requestWithCallback = new RequestWithCallback(takePictureRequestPoll, this);
        trackCurrentRequests(requestWithCallback);
        Pair<CameraRequest, ProcessingRequest> pairCreateRequests = this.mImagePipeline.createRequests(takePictureRequestPoll, requestWithCallback, requestWithCallback.getCaptureFuture());
        CameraRequest cameraRequest = pairCreateRequests.first;
        Objects.requireNonNull(cameraRequest);
        ProcessingRequest processingRequest = pairCreateRequests.second;
        Objects.requireNonNull(processingRequest);
        this.mImagePipeline.submitProcessingRequest(processingRequest);
        requestWithCallback.setCaptureRequestFuture(submitCameraRequest(cameraRequest));
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @MainThread
    public void offerRequest(TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        this.mNewRequests.offer(takePictureRequest);
        issueNextRequest();
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(ImageProxy imageProxy) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f1644b.issueNextRequest();
            }
        });
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @MainThread
    public void pause() {
        Threads.checkMainThread();
        this.mPaused = true;
        RequestWithCallback requestWithCallback = this.mCapturingRequest;
        if (requestWithCallback != null) {
            requestWithCallback.abortSilentlyAndRetry();
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @MainThread
    public void resume() {
        Threads.checkMainThread();
        this.mPaused = false;
        issueNextRequest();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.RetryControl
    @MainThread
    public void retryRequest(TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        Logger.m1866d(TAG, "Add a new request for retrying.");
        this.mNewRequests.addFirst(takePictureRequest);
        issueNextRequest();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    @MainThread
    public void setImagePipeline(ImagePipeline imagePipeline) {
        Threads.checkMainThread();
        this.mImagePipeline = imagePipeline;
        imagePipeline.setOnImageCloseListener(this);
    }
}
