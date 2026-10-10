package androidx.camera.video;

import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
final class VideoEncoderSession {
    private static final String TAG = "VideoEncoderSession";
    private final Executor mExecutor;
    private final Executor mSequentialExecutor;
    private final EncoderFactory mVideoEncoderFactory;
    private Encoder mVideoEncoder = null;
    private Surface mActiveSurface = null;
    private SurfaceRequest mSurfaceRequest = null;
    private Executor mOnSurfaceUpdateExecutor = null;
    private Encoder.SurfaceInput.OnSurfaceUpdateListener mOnSurfaceUpdateListener = null;
    private VideoEncoderState mVideoEncoderState = VideoEncoderState.NOT_INITIALIZED;
    private ListenableFuture<Void> mReleasedFuture = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));
    private CallbackToFutureAdapter.Completer<Void> mReleasedCompleter = null;
    private ListenableFuture<Encoder> mReadyToReleaseFuture = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));
    private CallbackToFutureAdapter.Completer<Encoder> mReadyToReleaseCompleter = null;

    public enum VideoEncoderState {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m2154c(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer) {
        videoEncoderSession.mReleasedCompleter = completer;
        return "ReleasedFuture " + videoEncoderSession;
    }

    private void closeInternal() {
        int iOrdinal = this.mVideoEncoderState.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            terminateNow();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            Logger.m1866d(TAG, "closeInternal in " + this.mVideoEncoderState + " state");
            this.mVideoEncoderState = VideoEncoderState.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            Logger.m1866d(TAG, "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.mVideoEncoderState + " is not handled");
    }

    private void configureVideoEncoderInternal(final SurfaceRequest surfaceRequest, VideoEncoderConfig videoEncoderConfig, final CallbackToFutureAdapter.Completer<Encoder> completer) {
        try {
            Encoder encoderCreateEncoder = this.mVideoEncoderFactory.createEncoder(this.mExecutor, videoEncoderConfig, surfaceRequest.getSessionType());
            this.mVideoEncoder = encoderCreateEncoder;
            Encoder.EncoderInput input = encoderCreateEncoder.getInput();
            if (input instanceof Encoder.SurfaceInput) {
                ((Encoder.SurfaceInput) input).setOnSurfaceUpdateListener(this.mSequentialExecutor, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: androidx.camera.video.x0
                    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
                    public final void onSurfaceUpdate(Surface surface) {
                        VideoEncoderSession.m2158g(this.f2120a, completer, surfaceRequest, surface);
                    }
                });
            } else {
                completer.setException(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e11) {
            Logger.m1869e(TAG, "Unable to initialize video encoder.", e11);
            completer.setException(e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m2156e(VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer) {
        videoEncoderSession.mReadyToReleaseCompleter = completer;
        return "ReadyToReleaseFuture " + videoEncoderSession;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2158g(final VideoEncoderSession videoEncoderSession, CallbackToFutureAdapter.Completer completer, SurfaceRequest surfaceRequest, final Surface surface) {
        Executor executor;
        int iOrdinal = videoEncoderSession.mVideoEncoderState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (surfaceRequest.isServiced()) {
                    Logger.m1866d(TAG, "Not provide surface, " + Objects.toString(surfaceRequest, "EMPTY") + " is already serviced.");
                    completer.set(null);
                    videoEncoderSession.closeInternal();
                    return;
                }
                videoEncoderSession.mActiveSurface = surface;
                Logger.m1866d(TAG, "provide surface: " + surface);
                surfaceRequest.provideSurface(surface, videoEncoderSession.mSequentialExecutor, new Consumer() { // from class: androidx.camera.video.c1
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        this.f1949b.onSurfaceRequestComplete((SurfaceRequest.Result) obj);
                    }
                });
                videoEncoderSession.mVideoEncoderState = VideoEncoderState.READY;
                completer.set(videoEncoderSession.mVideoEncoder);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (videoEncoderSession.mOnSurfaceUpdateListener != null && (executor = videoEncoderSession.mOnSurfaceUpdateExecutor) != null) {
                        executor.execute(new Runnable() { // from class: androidx.camera.video.d1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f1953b.mOnSurfaceUpdateListener.onSurfaceUpdate(surface);
                            }
                        });
                    }
                    Logger.m1872w(TAG, "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iOrdinal != 4) {
                    throw new IllegalStateException("State " + videoEncoderSession.mVideoEncoderState + " is not handled");
                }
            }
        }
        Logger.m1866d(TAG, "Not provide surface in " + videoEncoderSession.mVideoEncoderState);
        completer.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceRequestComplete(SurfaceRequest.Result result) {
        Logger.m1866d(TAG, "Surface can be closed: " + result.getSurface().hashCode());
        Surface surface = result.getSurface();
        if (surface != this.mActiveSurface) {
            surface.release();
            return;
        }
        this.mActiveSurface = null;
        this.mReadyToReleaseCompleter.set(this.mVideoEncoder);
        closeInternal();
    }

    public ListenableFuture<Encoder> configure(final SurfaceRequest surfaceRequest, final VideoEncoderConfig videoEncoderConfig) {
        if (this.mVideoEncoderState.ordinal() != 0) {
            return Futures.immediateFailedFuture(new IllegalStateException("configure() shouldn't be called in " + this.mVideoEncoderState));
        }
        this.mVideoEncoderState = VideoEncoderState.INITIALIZING;
        this.mSurfaceRequest = surfaceRequest;
        Logger.m1866d(TAG, "Create VideoEncoderSession: " + this);
        this.mReleasedFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.z0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m2154c(this.f2126a, completer);
            }
        });
        this.mReadyToReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.a1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m2156e(this.f1935a, completer);
            }
        });
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.b1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoEncoderSession.m2157f(this.f1939a, surfaceRequest, videoEncoderConfig, completer);
            }
        });
        Futures.addCallback(future, new FutureCallback<Encoder>() { // from class: androidx.camera.video.VideoEncoderSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                Logger.m1873w(VideoEncoderSession.TAG, "VideoEncoder configuration failed.", th2);
                VideoEncoderSession.this.terminateNow();
            }
        }, this.mSequentialExecutor);
        return Futures.nonCancellationPropagating(future);
    }

    public Surface getActiveSurface() {
        if (this.mVideoEncoderState != VideoEncoderState.READY) {
            return null;
        }
        return this.mActiveSurface;
    }

    public ListenableFuture<Encoder> getReadyToReleaseFuture() {
        return Futures.nonCancellationPropagating(this.mReadyToReleaseFuture);
    }

    public Encoder getVideoEncoder() {
        return this.mVideoEncoder;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    public boolean isConfiguredSurfaceRequest(SurfaceRequest surfaceRequest) {
        int iOrdinal = this.mVideoEncoderState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.mSurfaceRequest == surfaceRequest) {
                    return true;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("State " + this.mVideoEncoderState + " is not handled");
                    }
                } else if (this.mSurfaceRequest == surfaceRequest) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setOnSurfaceUpdateListener(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
        this.mOnSurfaceUpdateExecutor = executor;
        this.mOnSurfaceUpdateListener = onSurfaceUpdateListener;
    }

    public void terminateNow() {
        int iOrdinal = this.mVideoEncoderState.ordinal();
        if (iOrdinal == 0) {
            this.mVideoEncoderState = VideoEncoderState.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.mVideoEncoderState + " is not handled");
            }
            Logger.m1866d(TAG, "terminateNow in " + this.mVideoEncoderState + ", No-op");
            return;
        }
        this.mVideoEncoderState = VideoEncoderState.RELEASED;
        this.mReadyToReleaseCompleter.set(this.mVideoEncoder);
        this.mSurfaceRequest = null;
        if (this.mVideoEncoder == null) {
            Logger.m1872w(TAG, "There's no VideoEncoder to release! Finish release completer.");
            this.mReleasedCompleter.set(null);
            return;
        }
        Logger.m1866d(TAG, "VideoEncoder is releasing: " + this.mVideoEncoder);
        this.mVideoEncoder.release();
        this.mVideoEncoder.getReleasedFuture().addListener(new Runnable() { // from class: androidx.camera.video.y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2124b.mReleasedCompleter.set(null);
            }
        }, this.mSequentialExecutor);
        this.mVideoEncoder = null;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.mSurfaceRequest, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    public VideoEncoderSession(EncoderFactory encoderFactory, Executor executor, Executor executor2) {
        this.mExecutor = executor2;
        this.mSequentialExecutor = executor;
        this.mVideoEncoderFactory = encoderFactory;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m2157f(VideoEncoderSession videoEncoderSession, SurfaceRequest surfaceRequest, VideoEncoderConfig videoEncoderConfig, CallbackToFutureAdapter.Completer completer) {
        videoEncoderSession.configureVideoEncoderInternal(surfaceRequest, videoEncoderConfig, completer);
        return "ConfigureVideoEncoderFuture " + videoEncoderSession;
    }

    public ListenableFuture<Void> signalTermination() {
        closeInternal();
        return Futures.nonCancellationPropagating(this.mReleasedFuture);
    }
}
