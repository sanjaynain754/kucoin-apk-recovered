package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
final class SurfaceViewImplementation extends PreviewViewImplementation {
    private static final int SCREENSHOT_TIMEOUT_MILLIS = 100;
    private static final String TAG = "SurfaceViewImpl";
    final SurfaceRequestCallback mSurfaceRequestCallback;
    SurfaceView mSurfaceView;

    public class SurfaceRequestCallback implements SurfaceHolder.Callback {
        private Size mCurrentSurfaceSize;
        private PreviewViewImplementation.OnSurfaceNotInUseListener mOnSurfaceNotInUseListener;
        private SurfaceRequest mSurfaceRequest;
        private SurfaceRequest mSurfaceRequestToBeInvalidated;
        private Size mTargetSize;
        private boolean mWasSurfaceProvided = false;
        private boolean mNeedToInvalidate = false;

        public SurfaceRequestCallback() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2248a(PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener, SurfaceRequest.Result result) {
            Logger.m1866d(SurfaceViewImplementation.TAG, "Safe to release surface.");
            if (onSurfaceNotInUseListener != null) {
                onSurfaceNotInUseListener.onSurfaceNotInUse();
            }
        }

        private boolean canProvideSurface() {
            return (this.mWasSurfaceProvided || this.mSurfaceRequest == null || !Objects.equals(this.mTargetSize, this.mCurrentSurfaceSize)) ? false : true;
        }

        @UiThread
        private void cancelPreviousRequest() {
            PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener;
            if (this.mSurfaceRequest != null) {
                Logger.m1866d(SurfaceViewImplementation.TAG, "Request canceled: " + this.mSurfaceRequest);
                if (!this.mSurfaceRequest.willNotProvideSurface() || (onSurfaceNotInUseListener = this.mOnSurfaceNotInUseListener) == null) {
                    return;
                }
                onSurfaceNotInUseListener.onSurfaceNotInUse();
            }
        }

        @UiThread
        private void closeSurface() {
            if (this.mSurfaceRequest != null) {
                Logger.m1866d(SurfaceViewImplementation.TAG, "Surface closed " + this.mSurfaceRequest);
                this.mSurfaceRequest.getDeferrableSurface().close();
            }
        }

        @UiThread
        private boolean tryToComplete() {
            Surface surface = SurfaceViewImplementation.this.mSurfaceView.getHolder().getSurface();
            if (!canProvideSurface()) {
                return false;
            }
            Logger.m1866d(SurfaceViewImplementation.TAG, "Surface set on Preview.");
            final PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener = this.mOnSurfaceNotInUseListener;
            SurfaceRequest surfaceRequest = this.mSurfaceRequest;
            Objects.requireNonNull(surfaceRequest);
            surfaceRequest.provideSurface(surface, ContextCompat.getMainExecutor(SurfaceViewImplementation.this.mSurfaceView.getContext()), new Consumer() { // from class: androidx.camera.view.d0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    SurfaceViewImplementation.SurfaceRequestCallback.m2248a(onSurfaceNotInUseListener, (SurfaceRequest.Result) obj);
                }
            });
            this.mWasSurfaceProvided = true;
            SurfaceViewImplementation.this.onSurfaceProvided();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            Logger.m1866d(SurfaceViewImplementation.TAG, "Surface changed. Size: " + i12 + "x" + i13);
            this.mCurrentSurfaceSize = new Size(i12, i13);
            tryToComplete();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceRequest surfaceRequest;
            Logger.m1866d(SurfaceViewImplementation.TAG, "Surface created.");
            if (!this.mNeedToInvalidate || (surfaceRequest = this.mSurfaceRequestToBeInvalidated) == null) {
                return;
            }
            surfaceRequest.invalidate();
            this.mSurfaceRequestToBeInvalidated = null;
            this.mNeedToInvalidate = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Logger.m1866d(SurfaceViewImplementation.TAG, "Surface destroyed.");
            if (this.mWasSurfaceProvided) {
                closeSurface();
            } else {
                cancelPreviousRequest();
            }
            this.mNeedToInvalidate = true;
            SurfaceRequest surfaceRequest = this.mSurfaceRequest;
            if (surfaceRequest != null) {
                this.mSurfaceRequestToBeInvalidated = surfaceRequest;
            }
            this.mWasSurfaceProvided = false;
            this.mSurfaceRequest = null;
            this.mOnSurfaceNotInUseListener = null;
            this.mCurrentSurfaceSize = null;
            this.mTargetSize = null;
        }

        @UiThread
        public void setSurfaceRequest(SurfaceRequest surfaceRequest, PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
            cancelPreviousRequest();
            if (this.mNeedToInvalidate) {
                this.mNeedToInvalidate = false;
                surfaceRequest.invalidate();
                return;
            }
            this.mSurfaceRequest = surfaceRequest;
            this.mOnSurfaceNotInUseListener = onSurfaceNotInUseListener;
            Size resolution = surfaceRequest.getResolution();
            this.mTargetSize = resolution;
            this.mWasSurfaceProvided = false;
            if (!tryToComplete()) {
                Logger.m1866d(SurfaceViewImplementation.TAG, "Wait for new Surface creation.");
                SurfaceViewImplementation.this.mSurfaceView.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
            }
        }
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public ListenableFuture<Void> waitForNextFrame() {
        return Futures.immediateFuture(null);
    }

    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static void pixelCopyRequest(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2247b(Semaphore semaphore, int i11) {
        if (i11 == 0) {
            Logger.m1866d(TAG, "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            Logger.m1868e(TAG, "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i11);
        }
        semaphore.release();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public View getPreview() {
        return this.mSurfaceView;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @RequiresApi(24)
    public Bitmap getPreviewBitmap() {
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.mSurfaceView.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.mSurfaceView.getWidth(), this.mSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        Api24Impl.pixelCopyRequest(this.mSurfaceView, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.c0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i11) {
                SurfaceViewImplementation.m2247b(semaphore, i11);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                Logger.m1868e(TAG, "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e11) {
            Logger.m1869e(TAG, "Interrupted while trying to acquire screenshot.", e11);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void initializePreview() {
        Preconditions.checkNotNull(this.mParent);
        Preconditions.checkNotNull(this.mResolution);
        SurfaceView surfaceView = new SurfaceView(this.mParent.getContext());
        this.mSurfaceView = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
        this.mParent.removeAllViews();
        this.mParent.addView(this.mSurfaceView);
        this.mSurfaceView.getHolder().addCallback(this.mSurfaceRequestCallback);
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void onSurfaceRequested(final SurfaceRequest surfaceRequest, final PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
        if (!shouldReusePreview(this.mSurfaceView, this.mResolution, surfaceRequest)) {
            this.mResolution = surfaceRequest.getResolution();
            initializePreview();
        }
        if (onSurfaceNotInUseListener != null) {
            surfaceRequest.addRequestCancellationListener(ContextCompat.getMainExecutor(this.mSurfaceView.getContext()), new Runnable() { // from class: androidx.camera.view.a0
                @Override // java.lang.Runnable
                public final void run() {
                    onSurfaceNotInUseListener.onSurfaceNotInUse();
                }
            });
        }
        this.mSurfaceView.post(new Runnable() { // from class: androidx.camera.view.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2130b.mSurfaceRequestCallback.setSurfaceRequest(surfaceRequest, onSurfaceNotInUseListener);
            }
        });
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void setFrameUpdateListener(Executor executor, PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    public SurfaceViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
        this.mSurfaceRequestCallback = new SurfaceRequestCallback();
    }

    private static boolean shouldReusePreview(SurfaceView surfaceView, Size size, SurfaceRequest surfaceRequest) {
        boolean zEquals = Objects.equals(size, surfaceRequest.getResolution());
        if (surfaceView != null && zEquals) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void onAttachedToWindow() {
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void onDetachedFromWindow() {
    }
}
