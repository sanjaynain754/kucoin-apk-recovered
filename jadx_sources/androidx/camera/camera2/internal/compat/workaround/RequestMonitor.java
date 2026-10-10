package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class RequestMonitor {
    private static final String TAG = "RequestMonitor";
    private final boolean mQuirkEnabled;
    private final List<ListenableFuture<Void>> mRequestTasks = Collections.synchronizedList(new ArrayList());

    public static class RequestCompleteListener extends CameraCaptureSession.CaptureCallback {
        CallbackToFutureAdapter.Completer<Void> mStartRequestCompleter;
        final ListenableFuture<Void> mStartRequestFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.compat.workaround.e
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return RequestMonitor.RequestCompleteListener.m1818a(this.f1318a, completer);
            }
        });

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m1818a(RequestCompleteListener requestCompleteListener, CallbackToFutureAdapter.Completer completer) {
            requestCompleteListener.mStartRequestCompleter = completer;
            return "RequestCompleteListener[" + requestCompleteListener + "]";
        }

        private void completeFuture() {
            CallbackToFutureAdapter.Completer<Void> completer = this.mStartRequestCompleter;
            if (completer != null) {
                completer.set(null);
                this.mStartRequestCompleter = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i11) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i11, long j11) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j11, long j12) {
            completeFuture();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m1817b(List list) {
        return null;
    }

    public CameraCaptureSession.CaptureCallback createMonitorListener(CameraCaptureSession.CaptureCallback captureCallback) {
        return shouldMonitorRequest() ? Camera2CaptureCallbacks.createComboCallback(createMonitorListener(), captureCallback) : captureCallback;
    }

    public ListenableFuture<Void> getRequestsProcessedFuture() {
        return this.mRequestTasks.isEmpty() ? Futures.immediateFuture(null) : Futures.nonCancellationPropagating(Futures.transform(Futures.successfulAsList(new ArrayList(this.mRequestTasks)), new Function() { // from class: androidx.camera.camera2.internal.compat.workaround.d
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return RequestMonitor.m1817b((List) obj);
            }
        }, CameraXExecutors.directExecutor()));
    }

    public boolean shouldMonitorRequest() {
        return this.mQuirkEnabled;
    }

    public void stop() {
        LinkedList linkedList = new LinkedList(this.mRequestTasks);
        while (!linkedList.isEmpty()) {
            ListenableFuture listenableFuture = (ListenableFuture) linkedList.poll();
            Objects.requireNonNull(listenableFuture);
            listenableFuture.cancel(true);
        }
    }

    public RequestMonitor(boolean z11) {
        this.mQuirkEnabled = z11;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1816a(RequestMonitor requestMonitor, RequestCompleteListener requestCompleteListener, ListenableFuture listenableFuture) {
        requestMonitor.getClass();
        Log.d(TAG, "RequestListener " + requestCompleteListener + " done " + requestMonitor);
        requestMonitor.mRequestTasks.remove(listenableFuture);
    }

    private CameraCaptureSession.CaptureCallback createMonitorListener() {
        final RequestCompleteListener requestCompleteListener = new RequestCompleteListener();
        final ListenableFuture<Void> listenableFuture = requestCompleteListener.mStartRequestFuture;
        this.mRequestTasks.add(listenableFuture);
        Log.d(TAG, "RequestListener " + requestCompleteListener + " monitoring " + this);
        listenableFuture.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.compat.workaround.c
            @Override // java.lang.Runnable
            public final void run() {
                RequestMonitor.m1816a(this.f1315b, requestCompleteListener, listenableFuture);
            }
        }, CameraXExecutors.directExecutor());
        return requestCompleteListener;
    }
}
