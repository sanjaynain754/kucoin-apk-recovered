package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.workaround.CloseCameraBeforeCreateNewSession;
import androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator;
import androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraState;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
final class Camera2CameraImpl implements CameraInternal {
    private static final int ERROR_NONE = 0;
    private static final String TAG = "Camera2CameraImpl";
    final CameraAvailability mCameraAvailability;
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private CameraConfig mCameraConfig;
    final CameraConfigureAvailable mCameraConfigureAvailable;
    private final Camera2CameraControlImpl mCameraControlInternal;
    final CameraCoordinator mCameraCoordinator;
    CameraDevice mCameraDevice;
    int mCameraDeviceError;
    final Camera2CameraInfoImpl mCameraInfoInternal;
    private final CameraManagerCompat mCameraManager;
    private final CameraStateMachine mCameraStateMachine;
    final CameraStateRegistry mCameraStateRegistry;
    private final CameraXConfig mCameraXConfig;
    CaptureSessionInterface mCaptureSession;
    private final SynchronizedCaptureSession.OpenerBuilder mCaptureSessionOpenerBuilder;
    private final CaptureSessionRepository mCaptureSessionRepository;
    private final boolean mConfigAndCloseQuirk;
    private final DisplayInfoManager mDisplayInfoManager;
    private final DynamicRangesCompat mDynamicRangesCompat;
    private final ErrorTimeoutReopenScheduler mErrorTimeoutReopenScheduler;
    private final Executor mExecutor;
    boolean mIsActiveResumingMode;
    private boolean mIsConfigAndCloseRequired;
    private boolean mIsConfiguringForClose;
    private boolean mIsPrimary;
    final Object mLock;
    private MeteringRepeatingSession mMeteringRepeatingSession;
    private final LiveDataObservable<CameraInternal.State> mObservableState;
    final AtomicInteger mReleaseRequestCount;
    final Map<CaptureSessionInterface, ListenableFuture<Void>> mReleasedCaptureSessions;
    private final ScheduledExecutorService mScheduledExecutorService;

    @GuardedBy("mLock")
    private SessionProcessor mSessionProcessor;
    private final Set<String> mSessionStartNotifiedUseCases;
    private final boolean mShouldCloseCameraBeforeCreateNewSession;
    volatile InternalState mState = InternalState.INITIALIZED;
    private final StateCallback mStateCallback;
    private final SupportedSurfaceCombination mSupportedSurfaceCombination;
    private int mTraceStateErrorCount;
    private final UseCaseAttachState mUseCaseAttachState;
    ListenableFuture<Void> mUserReleaseFuture;
    CallbackToFutureAdapter.Completer<Void> mUserReleaseNotifier;

    public final class CameraAvailability extends CameraManager.AvailabilityCallback implements CameraStateRegistry.OnOpenAvailableListener {
        private boolean mCameraAvailable = true;
        private final String mCameraId;

        public CameraAvailability(String str) {
            this.mCameraId = str;
        }

        public boolean isCameraAvailable() {
            return this.mCameraAvailable;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = true;
                if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN || Camera2CameraImpl.this.mState == InternalState.OPENING_WITH_ERROR) {
                    Camera2CameraImpl.this.tryOpenCameraDevice(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = false;
            }
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public void onOpenAvailable() {
            if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN || Camera2CameraImpl.this.mState == InternalState.OPENING_WITH_ERROR) {
                Camera2CameraImpl.this.tryOpenCameraDevice(false);
            }
        }
    }

    public final class CameraConfigureAvailable implements CameraStateRegistry.OnConfigureAvailableListener {
        public CameraConfigureAvailable() {
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener
        public void onConfigureAvailable() {
            if (Camera2CameraImpl.this.mState == InternalState.OPENED) {
                Camera2CameraImpl.this.openCaptureSession();
            }
        }
    }

    public final class ControlUpdateListenerInternal implements CameraControlInternal.ControlUpdateCallback {
        public ControlUpdateListenerInternal() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlCaptureRequests(List<CaptureConfig> list) {
            Camera2CameraImpl.this.submitCaptureRequests((List) Preconditions.checkNotNull(list));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlUpdateSessionConfig() {
            Camera2CameraImpl.this.updateCaptureSessionConfig();
        }
    }

    public class ErrorTimeoutReopenScheduler {
        private static final long ERROR_TIMEOUT_MILLIS = 2000;
        private ScheduleNode mScheduleNode;

        public class ScheduleNode {
            private final AtomicBoolean mIsDone = new AtomicBoolean(false);
            private final ScheduledFuture<?> mScheduledFuture;

            public ScheduleNode() {
                this.mScheduledFuture = Camera2CameraImpl.this.mScheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.camera2.internal.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1471b.execute();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void execute() {
                if (this.mIsDone.getAndSet(true)) {
                    return;
                }
                Camera2CameraImpl.this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1483b.executeInternal();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void executeInternal() {
                if (Camera2CameraImpl.this.mState == InternalState.OPENING) {
                    Camera2CameraImpl.this.debugLog("Camera onError timeout, reopen it.");
                    Camera2CameraImpl.this.setState(InternalState.REOPENING);
                    Camera2CameraImpl.this.mStateCallback.scheduleCameraReopen();
                } else {
                    Camera2CameraImpl.this.debugLog("Camera skip reopen at state: " + Camera2CameraImpl.this.mState);
                }
            }

            public void cancel() {
                this.mIsDone.set(true);
                this.mScheduledFuture.cancel(true);
            }

            public boolean isDone() {
                return this.mIsDone.get();
            }
        }

        private ErrorTimeoutReopenScheduler() {
            this.mScheduleNode = null;
        }

        public void cancel() {
            ScheduleNode scheduleNode = this.mScheduleNode;
            if (scheduleNode != null) {
                scheduleNode.cancel();
            }
            this.mScheduleNode = null;
        }

        public void deviceOnError() {
            Camera2CameraImpl.this.debugLog("Camera receive onErrorCallback");
            cancel();
        }

        public boolean isErrorHandling() {
            ScheduleNode scheduleNode = this.mScheduleNode;
            return (scheduleNode == null || scheduleNode.isDone()) ? false : true;
        }

        public void start() {
            if (Camera2CameraImpl.this.mState != InternalState.OPENING) {
                Camera2CameraImpl.this.debugLog("Don't need the onError timeout handler.");
                return;
            }
            Camera2CameraImpl.this.debugLog("Camera waiting for onError.");
            cancel();
            this.mScheduleNode = new ScheduleNode();
        }
    }

    public enum InternalState {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        OPENING_WITH_ERROR,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    public final class StateCallback extends CameraDevice.StateCallback {
        private final CameraReopenMonitor mCameraReopenMonitor;
        private final Executor mExecutor;
        ScheduledFuture<?> mScheduledReopenHandle;
        private ScheduledReopen mScheduledReopenRunnable;
        private final ScheduledExecutorService mScheduler;

        public class CameraReopenMonitor {
            static final int ACTIVE_REOPEN_DELAY_BASE_MS = 1000;
            static final int ACTIVE_REOPEN_LIMIT_MS = 1800000;
            static final int INVALID_TIME = -1;
            static final int REOPEN_DELAY_MS = 700;
            static final int REOPEN_LIMIT_MS = 10000;
            private final long mCameraOpenRetryMaxTimeoutInMs;
            private long mFirstReopenTime = -1;

            public CameraReopenMonitor(long j11) {
                this.mCameraOpenRetryMaxTimeoutInMs = j11;
            }

            public int getReopenDelayMs() {
                if (!StateCallback.this.shouldActiveResume()) {
                    return 700;
                }
                long elapsedTime = getElapsedTime();
                if (elapsedTime <= 120000) {
                    return 1000;
                }
                if (elapsedTime <= 300000) {
                    return 2000;
                }
                return TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY;
            }

            public int getReopenLimitMs() {
                if (StateCallback.this.shouldActiveResume()) {
                    long j11 = this.mCameraOpenRetryMaxTimeoutInMs;
                    return j11 > 0 ? Math.min((int) j11, ACTIVE_REOPEN_LIMIT_MS) : ACTIVE_REOPEN_LIMIT_MS;
                }
                long j12 = this.mCameraOpenRetryMaxTimeoutInMs;
                if (j12 > 0) {
                    return Math.min((int) j12, 10000);
                }
                return 10000;
            }

            public void reset() {
                this.mFirstReopenTime = -1L;
            }

            public boolean canScheduleCameraReopen() {
                if (getElapsedTime() >= getReopenLimitMs()) {
                    reset();
                    return false;
                }
                return true;
            }

            public long getElapsedTime() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.mFirstReopenTime == -1) {
                    this.mFirstReopenTime = jUptimeMillis;
                }
                return jUptimeMillis - this.mFirstReopenTime;
            }
        }

        public class ScheduledReopen implements Runnable {
            private boolean mCancelled = false;
            private Executor mExecutor;

            public void cancel() {
                this.mCancelled = true;
            }

            public ScheduledReopen(Executor executor) {
                this.mExecutor = executor;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m1684a(ScheduledReopen scheduledReopen) {
                if (scheduledReopen.mCancelled) {
                    return;
                }
                Preconditions.checkState(Camera2CameraImpl.this.mState == InternalState.REOPENING || Camera2CameraImpl.this.mState == InternalState.REOPENING_QUIRK);
                if (StateCallback.this.shouldActiveResume()) {
                    Camera2CameraImpl.this.tryForceOpenCameraDevice(true);
                } else {
                    Camera2CameraImpl.this.tryOpenCameraDevice(true);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.StateCallback.ScheduledReopen.m1684a(this.f1492b);
                    }
                });
            }
        }

        public StateCallback(Executor executor, ScheduledExecutorService scheduledExecutorService, long j11) {
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraReopenMonitor = new CameraReopenMonitor(j11);
        }

        private void handleErrorOnOpen(CameraDevice cameraDevice, int i11) {
            Preconditions.checkState(Camera2CameraImpl.this.mState == InternalState.OPENING || Camera2CameraImpl.this.mState == InternalState.OPENED || Camera2CameraImpl.this.mState == InternalState.CONFIGURED || Camera2CameraImpl.this.mState == InternalState.REOPENING || Camera2CameraImpl.this.mState == InternalState.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + Camera2CameraImpl.this.mState);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                Logger.m1866d(Camera2CameraImpl.TAG, String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i11)));
                reopenCameraAfterError(i11);
                return;
            }
            Logger.m1868e(Camera2CameraImpl.TAG, "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + Camera2CameraImpl.getErrorMessage(i11) + " closing camera.");
            Camera2CameraImpl.this.setState(InternalState.CLOSING, CameraState.StateError.create(i11 == 3 ? 5 : 6));
            Camera2CameraImpl.this.closeCamera(false);
        }

        private void reopenCameraAfterError(int i11) {
            int i12 = 1;
            Preconditions.checkState(Camera2CameraImpl.this.mCameraDeviceError != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i11 == 1) {
                i12 = 2;
            } else if (i11 != 2) {
                i12 = 3;
            }
            Camera2CameraImpl.this.setState(InternalState.REOPENING, CameraState.StateError.create(i12));
            Camera2CameraImpl.this.closeCamera(false);
        }

        public boolean cancelScheduledReopen() {
            if (this.mScheduledReopenHandle == null) {
                return false;
            }
            Camera2CameraImpl.this.debugLog("Cancelling scheduled re-open: " + this.mScheduledReopenRunnable);
            this.mScheduledReopenRunnable.cancel();
            this.mScheduledReopenRunnable = null;
            this.mScheduledReopenHandle.cancel(false);
            this.mScheduledReopenHandle = null;
            return true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onClosed()");
            Preconditions.checkState(Camera2CameraImpl.this.mCameraDevice == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = Camera2CameraImpl.this.mState.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                Preconditions.checkState(Camera2CameraImpl.this.isSessionCloseComplete());
                Camera2CameraImpl.this.configAndCloseIfNeeded();
                return;
            }
            if (iOrdinal != 6 && iOrdinal != 7) {
                throw new IllegalStateException("Camera closed while in state: " + Camera2CameraImpl.this.mState);
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            if (camera2CameraImpl.mCameraDeviceError == 0) {
                camera2CameraImpl.tryOpenCameraDevice(false);
                return;
            }
            camera2CameraImpl.debugLog("Camera closed due to error: " + Camera2CameraImpl.getErrorMessage(Camera2CameraImpl.this.mCameraDeviceError));
            scheduleCameraReopen();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i11) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = i11;
            camera2CameraImpl.mErrorTimeoutReopenScheduler.deviceOnError();
            int iOrdinal = Camera2CameraImpl.this.mState.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        Logger.m1866d(Camera2CameraImpl.TAG, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i11), Camera2CameraImpl.this.mState.name()));
                        handleErrorOnOpen(cameraDevice, i11);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + Camera2CameraImpl.this.mState);
                }
            }
            Logger.m1868e(Camera2CameraImpl.TAG, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i11), Camera2CameraImpl.this.mState.name()));
            Camera2CameraImpl.this.closeCamera(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onOpened()");
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = 0;
            resetReopenMonitor();
            int iOrdinal = Camera2CameraImpl.this.mState.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                Preconditions.checkState(Camera2CameraImpl.this.isSessionCloseComplete());
                Camera2CameraImpl.this.mCameraDevice.close();
                Camera2CameraImpl.this.mCameraDevice = null;
            } else {
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + Camera2CameraImpl.this.mState);
                }
                Camera2CameraImpl.this.setState(InternalState.OPENED);
                CameraStateRegistry cameraStateRegistry = Camera2CameraImpl.this.mCameraStateRegistry;
                String id2 = cameraDevice.getId();
                Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                if (cameraStateRegistry.tryOpenCaptureSession(id2, camera2CameraImpl2.mCameraCoordinator.getPairedConcurrentCameraId(camera2CameraImpl2.mCameraDevice.getId()))) {
                    Camera2CameraImpl.this.openCaptureSession();
                }
            }
        }

        public void resetReopenMonitor() {
            this.mCameraReopenMonitor.reset();
        }

        public void scheduleCameraReopen() {
            Preconditions.checkState(this.mScheduledReopenRunnable == null);
            Preconditions.checkState(this.mScheduledReopenHandle == null);
            if (!this.mCameraReopenMonitor.canScheduleCameraReopen()) {
                Logger.m1868e(Camera2CameraImpl.TAG, "Camera reopening attempted for " + this.mCameraReopenMonitor.getReopenLimitMs() + "ms without success.");
                Camera2CameraImpl.this.setState(InternalState.PENDING_OPEN, null, false);
                return;
            }
            this.mScheduledReopenRunnable = new ScheduledReopen(this.mExecutor);
            Camera2CameraImpl.this.debugLog("Attempting camera re-open in " + this.mCameraReopenMonitor.getReopenDelayMs() + "ms: " + this.mScheduledReopenRunnable + " activeResuming = " + Camera2CameraImpl.this.mIsActiveResumingMode);
            this.mScheduledReopenHandle = this.mScheduler.schedule(this.mScheduledReopenRunnable, (long) this.mCameraReopenMonitor.getReopenDelayMs(), TimeUnit.MILLISECONDS);
        }

        public boolean shouldActiveResume() {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            if (!camera2CameraImpl.mIsActiveResumingMode) {
                return false;
            }
            int i11 = camera2CameraImpl.mCameraDeviceError;
            return i11 == 1 || i11 == 2;
        }
    }

    @AutoValue
    public static abstract class UseCaseInfo {
        public abstract List<UseCaseConfigFactory.CaptureType> getCaptureTypes();

        public abstract SessionConfig getSessionConfig();

        public abstract StreamSpec getStreamSpec();

        public abstract Size getSurfaceResolution();

        public abstract UseCaseConfig<?> getUseCaseConfig();

        public abstract String getUseCaseId();

        public abstract Class<?> getUseCaseType();

        public static UseCaseInfo create(String str, Class<?> cls, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig, Size size, StreamSpec streamSpec, List<UseCaseConfigFactory.CaptureType> list) {
            return new AutoValue_Camera2CameraImpl_UseCaseInfo(str, cls, sessionConfig, useCaseConfig, size, streamSpec, list);
        }

        public static UseCaseInfo from(UseCase useCase, boolean z11) {
            SessionConfig secondarySessionConfig;
            String useCaseId = Camera2CameraImpl.getUseCaseId(useCase);
            Class<?> cls = useCase.getClass();
            if (z11) {
                secondarySessionConfig = useCase.getSessionConfig();
            } else {
                secondarySessionConfig = useCase.getSecondarySessionConfig();
            }
            return create(useCaseId, cls, secondarySessionConfig, useCase.getCurrentConfig(), useCase.getAttachedSurfaceResolution(), useCase.getAttachedStreamSpec(), Camera2CameraImpl.getCaptureTypes(useCase));
        }
    }

    @SuppressLint({"NullAnnotationGroup"})
    public Camera2CameraImpl(Context context, CameraManagerCompat cameraManagerCompat, String str, Camera2CameraInfoImpl camera2CameraInfoImpl, CameraCoordinator cameraCoordinator, CameraStateRegistry cameraStateRegistry, Executor executor, Handler handler, DisplayInfoManager displayInfoManager, long j11, CameraXConfig cameraXConfig) throws CameraUnavailableException {
        LiveDataObservable<CameraInternal.State> liveDataObservable = new LiveDataObservable<>();
        this.mObservableState = liveDataObservable;
        this.mCameraDeviceError = 0;
        this.mReleaseRequestCount = new AtomicInteger(0);
        this.mReleasedCaptureSessions = new LinkedHashMap();
        this.mTraceStateErrorCount = 0;
        this.mIsConfigAndCloseRequired = false;
        this.mIsConfiguringForClose = false;
        this.mIsPrimary = true;
        this.mSessionStartNotifiedUseCases = new HashSet();
        this.mCameraConfig = CameraConfigs.defaultConfig();
        this.mLock = new Object();
        this.mIsActiveResumingMode = false;
        this.mErrorTimeoutReopenScheduler = new ErrorTimeoutReopenScheduler();
        this.mCameraManager = cameraManagerCompat;
        this.mCameraCoordinator = cameraCoordinator;
        this.mCameraStateRegistry = cameraStateRegistry;
        ScheduledExecutorService scheduledExecutorServiceNewHandlerExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mScheduledExecutorService = scheduledExecutorServiceNewHandlerExecutor;
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = executorNewSequentialExecutor;
        this.mStateCallback = new StateCallback(executorNewSequentialExecutor, scheduledExecutorServiceNewHandlerExecutor, j11);
        this.mUseCaseAttachState = new UseCaseAttachState(str);
        liveDataObservable.postValue(CameraInternal.State.CLOSED);
        CameraStateMachine cameraStateMachine = new CameraStateMachine(cameraStateRegistry);
        this.mCameraStateMachine = cameraStateMachine;
        CaptureSessionRepository captureSessionRepository = new CaptureSessionRepository(executorNewSequentialExecutor);
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mDisplayInfoManager = displayInfoManager;
        this.mCameraXConfig = cameraXConfig;
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
            this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(cameraCharacteristicsCompat, scheduledExecutorServiceNewHandlerExecutor, executorNewSequentialExecutor, new ControlUpdateListenerInternal(), camera2CameraInfoImpl.getCameraQuirks());
            this.mCameraControlInternal = camera2CameraControlImpl;
            this.mCameraInfoInternal = camera2CameraInfoImpl;
            camera2CameraInfoImpl.linkWithCameraControl(camera2CameraControlImpl);
            camera2CameraInfoImpl.setCameraStateSource(cameraStateMachine.getStateLiveData());
            this.mDynamicRangesCompat = DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
            this.mCaptureSession = newCaptureSession();
            this.mCaptureSessionOpenerBuilder = new SynchronizedCaptureSession.OpenerBuilder(executorNewSequentialExecutor, scheduledExecutorServiceNewHandlerExecutor, handler, captureSessionRepository, camera2CameraInfoImpl.getCameraQuirks(), DeviceQuirks.getAll());
            this.mShouldCloseCameraBeforeCreateNewSession = CloseCameraBeforeCreateNewSession.shouldCloseCamera(camera2CameraInfoImpl.getCameraQuirks());
            this.mConfigAndCloseQuirk = camera2CameraInfoImpl.getCameraQuirks().contains(LegacyCameraSurfaceCleanupQuirk.class);
            CameraAvailability cameraAvailability = new CameraAvailability(str);
            this.mCameraAvailability = cameraAvailability;
            CameraConfigureAvailable cameraConfigureAvailable = new CameraConfigureAvailable();
            this.mCameraConfigureAvailable = cameraConfigureAvailable;
            cameraStateRegistry.registerCamera(this, executorNewSequentialExecutor, cameraConfigureAvailable, cameraAvailability);
            cameraManagerCompat.registerAvailabilityCallback(executorNewSequentialExecutor, cameraAvailability);
            this.mSupportedSurfaceCombination = new SupportedSurfaceCombination(context, str, cameraManagerCompat, new CamcorderProfileHelper() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.1
                @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
                public CamcorderProfile get(int i11, int i12) {
                    return CamcorderProfile.get(i11, i12);
                }

                @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
                public boolean hasProfile(int i11, int i12) {
                    return CamcorderProfile.hasProfile(i11, i12);
                }
            }, FeatureCombinationQuery.NO_OP_FEATURE_COMBINATION_QUERY);
        } catch (CameraAccessExceptionCompat e11) {
            throw CameraUnavailableExceptionHelper.createFrom(e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1662d(Camera2CameraImpl camera2CameraImpl) {
        camera2CameraImpl.mIsConfiguringForClose = false;
        camera2CameraImpl.mIsConfigAndCloseRequired = false;
        camera2CameraImpl.debugLog("OpenCameraConfigAndClose is done, state: " + camera2CameraImpl.mState);
        int iOrdinal = camera2CameraImpl.mState.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            Preconditions.checkState(camera2CameraImpl.isSessionCloseComplete());
            camera2CameraImpl.finishClose();
            return;
        }
        if (iOrdinal != 7) {
            camera2CameraImpl.debugLog("OpenCameraConfigAndClose finished while in state: " + camera2CameraImpl.mState);
            return;
        }
        if (camera2CameraImpl.mCameraDeviceError == 0) {
            camera2CameraImpl.tryOpenCameraDevice(false);
            return;
        }
        camera2CameraImpl.debugLog("OpenCameraConfigAndClose in error: " + getErrorMessage(camera2CameraImpl.mCameraDeviceError));
        camera2CameraImpl.mStateCallback.scheduleCameraReopen();
    }

    public void debugLog(String str) {
        debugLog(str, null);
    }

    public void setState(InternalState internalState) {
        setState(internalState, null);
    }

    private void addMeteringRepeating() {
        MeteringRepeatingSession meteringRepeatingSession = this.mMeteringRepeatingSession;
        if (meteringRepeatingSession != null) {
            String meteringRepeatingId = getMeteringRepeatingId(meteringRepeatingSession);
            UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
            SessionConfig sessionConfig = this.mMeteringRepeatingSession.getSessionConfig();
            UseCaseConfig<?> useCaseConfig = this.mMeteringRepeatingSession.getUseCaseConfig();
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.METERING_REPEATING;
            useCaseAttachState.setUseCaseAttached(meteringRepeatingId, sessionConfig, useCaseConfig, null, Collections.singletonList(captureType));
            this.mUseCaseAttachState.setUseCaseActive(meteringRepeatingId, this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig(), null, Collections.singletonList(captureType));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    private void addOrRemoveMeteringRepeatingUseCase() {
        SessionConfig sessionConfigBuild = this.mUseCaseAttachState.getAttachedBuilder().build();
        int size = sessionConfigBuild.getRepeatingCaptureConfig().getSurfaces().size();
        int size2 = sessionConfigBuild.getSurfaces().size();
        boolean z11 = false;
        if (isMeteringRepeatingAttachedInternal()) {
            boolean z12 = size != 1 || size2 == 1;
            if (z12 || isMeteringRepeatingRestricted(this.mMeteringRepeatingSession)) {
                removeMeteringRepeating();
                if (z12) {
                    z11 = true;
                }
            } else {
                z11 = true;
            }
        } else if (size != 0 || size2 <= 0) {
            z11 = true;
        } else {
            if (this.mMeteringRepeatingSession == null) {
                this.mMeteringRepeatingSession = new MeteringRepeatingSession(this.mCameraInfoInternal.getCameraCharacteristicsCompat(), this.mDisplayInfoManager, new MeteringRepeatingSession.SurfaceResetCallback() { // from class: androidx.camera.camera2.internal.x
                    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback
                    public final void onSurfaceReset() {
                        Camera2CameraImpl.m1661c(this.f1514a);
                    }
                });
            }
            if (!isMeteringRepeatingRestricted(this.mMeteringRepeatingSession)) {
                addMeteringRepeating();
                z11 = true;
            }
        }
        this.mCameraControlInternal.setIsRepeatingRequestAvailable(z11);
        if (z11) {
            return;
        }
        Logger.m1868e(TAG, "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeInternal() {
        debugLog("Closing camera.");
        boolean z11 = true;
        switch (this.mState.ordinal()) {
            case 3:
            case 4:
                Preconditions.checkState(this.mCameraDevice == null);
                setState(InternalState.INITIALIZED);
                break;
            case 5:
            default:
                debugLog("close() ignored due to being in state: " + this.mState);
                break;
            case 6:
            case 7:
            case 8:
                if (!this.mStateCallback.cancelScheduledReopen() && !this.mErrorTimeoutReopenScheduler.isErrorHandling()) {
                    z11 = false;
                }
                this.mErrorTimeoutReopenScheduler.cancel();
                setState(InternalState.CLOSING);
                if (z11) {
                    Preconditions.checkState(isSessionCloseComplete());
                    configAndCloseIfNeeded();
                }
                break;
            case 9:
            case 10:
                setState(InternalState.CLOSING);
                closeCamera(false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ListenableFuture<Void> configAndClose(CameraDevice cameraDevice) {
        final CaptureSession captureSession = new CaptureSession(this.mDynamicRangesCompat);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(C33556b3.f69051i, TXVodDownloadDataSource.QUALITY_480P);
        final Surface surface = new Surface(surfaceTexture);
        final ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        immediateSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.e0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m1663e(surface, surfaceTexture);
            }
        }, CameraXExecutors.directExecutor());
        SessionConfig.Builder builder = new SessionConfig.Builder();
        builder.addNonRepeatingSurface(immediateSurface);
        builder.setTemplateType(1);
        debugLog("Start configAndClose.");
        return FutureChain.from(Futures.transformAsyncOnCompletion(captureSession.open(builder.build(), cameraDevice, this.mCaptureSessionOpenerBuilder.build()))).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.g0
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return Camera2CameraImpl.m1667i(captureSession, immediateSurface, (Void) obj);
            }
        }, this.mExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configAndCloseIfNeeded() {
        Preconditions.checkState(this.mState == InternalState.RELEASING || this.mState == InternalState.CLOSING);
        Preconditions.checkState(this.mReleasedCaptureSessions.isEmpty());
        if (!this.mIsConfigAndCloseRequired) {
            finishClose();
            return;
        }
        if (this.mIsConfiguringForClose) {
            debugLog("Ignored since configAndClose is processing");
            return;
        }
        if (!this.mCameraAvailability.isCameraAvailable()) {
            this.mIsConfigAndCloseRequired = false;
            finishClose();
            debugLog("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            debugLog("Open camera to configAndClose");
            ListenableFuture<Void> listenableFutureOpenCameraConfigAndClose = openCameraConfigAndClose();
            this.mIsConfiguringForClose = true;
            listenableFutureOpenCameraConfigAndClose.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.k0
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.m1662d(this.f1381b);
                }
            }, this.mExecutor);
        }
    }

    private CameraDevice.StateCallback createDeviceStateCallback() {
        ArrayList arrayList = new ArrayList(this.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.mCaptureSessionRepository.getCameraStateCallback());
        arrayList.add(this.mStateCallback);
        return CameraDeviceStateCallbacks.createComboCallback(arrayList);
    }

    private void debugLog(String str, Throwable th2) {
        Logger.m1867d(TAG, String.format("{%s} %s", toString(), str), th2);
    }

    private int getCameraMode() {
        synchronized (this.mLock) {
            try {
                return this.mCameraCoordinator.getCameraOperatingMode() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String getErrorMessage(int i11) {
        if (i11 == 0) {
            return "ERROR_NONE";
        }
        if (i11 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i11 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i11 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i11 != 4) {
            return i11 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    public static String getMeteringRepeatingId(MeteringRepeatingSession meteringRepeatingSession) {
        return meteringRepeatingSession.getName() + meteringRepeatingSession.hashCode();
    }

    private ListenableFuture<Void> getOrCreateUserReleaseFuture() {
        if (this.mUserReleaseFuture == null) {
            if (this.mState != InternalState.RELEASED) {
                this.mUserReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.z
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CameraImpl.m1681w(this.f1534a, completer);
                    }
                });
            } else {
                this.mUserReleaseFuture = Futures.immediateFuture(null);
            }
        }
        return this.mUserReleaseFuture;
    }

    public static String getUseCaseId(UseCase useCase) {
        return useCase.getName() + useCase.hashCode();
    }

    private boolean isMeteringRepeatingAttachedInternal() {
        MeteringRepeatingSession meteringRepeatingSession = this.mMeteringRepeatingSession;
        if (meteringRepeatingSession == null) {
            return false;
        }
        return this.mUseCaseAttachState.isUseCaseAttached(getMeteringRepeatingId(meteringRepeatingSession));
    }

    private boolean isMeteringRepeatingDisabled() {
        CameraXConfig cameraXConfig = this.mCameraXConfig;
        return (cameraXConfig == null || cameraXConfig.isRepeatingStreamForced()) ? false : true;
    }

    private boolean isSurfaceCombinationWithMeteringRepeatingSupported(MeteringRepeatingSession meteringRepeatingSession) {
        ArrayList arrayList = new ArrayList();
        int cameraMode = getCameraMode();
        for (UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo : this.mUseCaseAttachState.getAttachedUseCaseInfo()) {
            if (useCaseAttachInfo.getCaptureTypes() == null || useCaseAttachInfo.getCaptureTypes().get(0) != UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                if (useCaseAttachInfo.getStreamSpec() == null || useCaseAttachInfo.getCaptureTypes() == null) {
                    Logger.m1872w(TAG, "Invalid stream spec or capture types in " + useCaseAttachInfo);
                    return false;
                }
                SessionConfig sessionConfig = useCaseAttachInfo.getSessionConfig();
                UseCaseConfig<?> useCaseConfig = useCaseAttachInfo.getUseCaseConfig();
                for (DeferrableSurface deferrableSurface : sessionConfig.getSurfaces()) {
                    arrayList.add(AttachedSurfaceInfo.create(this.mSupportedSurfaceCombination.transformSurfaceConfig(cameraMode, useCaseConfig.getInputFormat(), deferrableSurface.getPrescribedSize(), useCaseConfig.getStreamUseCase()), useCaseConfig.getInputFormat(), deferrableSurface.getPrescribedSize(), useCaseAttachInfo.getStreamSpec().getDynamicRange(), useCaseAttachInfo.getCaptureTypes(), useCaseAttachInfo.getStreamSpec().getImplementationOptions(), useCaseAttachInfo.getStreamSpec().getSessionType(), useCaseAttachInfo.getStreamSpec().getExpectedFrameRateRange(), useCaseConfig.isStrictFrameRateRequired()));
                }
            }
        }
        Preconditions.checkNotNull(meteringRepeatingSession);
        HashMap map = new HashMap();
        map.put(meteringRepeatingSession.getUseCaseConfig(), Collections.singletonList(meteringRepeatingSession.getMeteringRepeatingSize()));
        try {
            this.mSupportedSurfaceCombination.getSuggestedStreamSpecifications(cameraMode, arrayList, map, false, false, false, false);
            debugLog("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e11) {
            debugLog("Surface combination with metering repeating  not supported!", e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m1668j(Camera2CameraImpl camera2CameraImpl, boolean z11) {
        camera2CameraImpl.mIsActiveResumingMode = z11;
        if (z11) {
            if (camera2CameraImpl.mState == InternalState.PENDING_OPEN || camera2CameraImpl.mState == InternalState.OPENING_WITH_ERROR) {
                camera2CameraImpl.tryForceOpenCameraDevice(false);
            }
        }
    }

    private CaptureSessionInterface newCaptureSession() {
        synchronized (this.mLock) {
            try {
                CameraXConfig cameraXConfig = this.mCameraXConfig;
                Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator = cameraXConfig == null ? null : Camera2CaptureRequestConfiguratorKt.getCamera2CaptureRequestConfigurator(cameraXConfig);
                if (this.mSessionProcessor == null) {
                    return new CaptureSession(this.mDynamicRangesCompat, this.mCameraInfoInternal.getCameraQuirks(), camera2CaptureRequestConfigurator);
                }
                return new ProcessingCaptureSession(this.mSessionProcessor, this.mCameraInfoInternal, this.mDynamicRangesCompat, this.mExecutor, this.mScheduledExecutorService, camera2CaptureRequestConfigurator);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private ListenableFuture<Void> openCameraConfigAndClose() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.j0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraImpl.m1659a(this.f1370a, completer);
            }
        });
    }

    @SuppressLint({"MissingPermission"})
    private void openCameraDevice(boolean z11) {
        if (!z11) {
            this.mStateCallback.resetReopenMonitor();
        }
        this.mStateCallback.cancelScheduledReopen();
        this.mErrorTimeoutReopenScheduler.cancel();
        debugLog("Opening camera.");
        setState(InternalState.OPENING);
        try {
            this.mCameraManager.openCamera(this.mCameraInfoInternal.getCameraId(), this.mExecutor, createDeviceStateCallback());
        } catch (CameraAccessExceptionCompat e11) {
            debugLog("Unable to open camera due to " + e11.getMessage());
            if (e11.getReason() != 10001) {
                this.mErrorTimeoutReopenScheduler.start();
            } else {
                setState(InternalState.INITIALIZED, CameraState.StateError.create(7, e11));
            }
        } catch (SecurityException e12) {
            debugLog("Unable to open camera due to " + e12.getMessage());
            setState(InternalState.REOPENING);
            this.mStateCallback.scheduleCameraReopen();
        } catch (RuntimeException e13) {
            debugLog("Unexpected error occurred when opening camera.", e13);
            setState(InternalState.OPENING_WITH_ERROR, CameraState.StateError.create(6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInternal() {
        int iOrdinal = this.mState.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            tryForceOpenCameraDevice(false);
            return;
        }
        if (iOrdinal != 5) {
            debugLog("open() ignored due to being in state: " + this.mState);
            return;
        }
        setState(InternalState.REOPENING);
        if (isSessionCloseComplete() || this.mIsConfiguringForClose || this.mCameraDeviceError != 0) {
            return;
        }
        Preconditions.checkState(this.mCameraDevice != null, "Camera Device should be open if session close is not complete");
        setState(InternalState.OPENED);
        openCaptureSession();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m1675q(final Camera2CameraImpl camera2CameraImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.d0
            @Override // java.lang.Runnable
            public final void run() {
                Futures.propagate(this.f1325b.releaseInternal(), completer);
            }
        });
        return "Release[request=" + camera2CameraImpl.mReleaseRequestCount.getAndIncrement() + "]";
    }

    private void removeMeteringRepeating() {
        if (this.mMeteringRepeatingSession != null) {
            this.mUseCaseAttachState.setUseCaseDetached(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mUseCaseAttachState.setUseCaseInactive(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mMeteringRepeatingSession.clear();
            this.mMeteringRepeatingSession = null;
        }
    }

    private void resetUseCase(final String str, final SessionConfig sessionConfig, final UseCaseConfig<?> useCaseConfig, final StreamSpec streamSpec, final List<UseCaseConfigFactory.CaptureType> list) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m1674p(this.f1237b, str, sessionConfig, useCaseConfig, streamSpec, list);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m1678t(Camera2CameraImpl camera2CameraImpl) {
        camera2CameraImpl.debugLog("Camera is removed. Updating state and cleaning up.");
        InternalState internalState = camera2CameraImpl.mState;
        InternalState internalState2 = InternalState.RELEASING;
        if (internalState == internalState2 || camera2CameraImpl.mState == InternalState.RELEASED) {
            return;
        }
        CameraState.StateError stateErrorCreate = CameraState.StateError.create(8);
        camera2CameraImpl.mCameraStateMachine.updateState(CameraInternal.State.CLOSED, stateErrorCreate);
        camera2CameraImpl.setState(internalState2, stateErrorCreate);
        camera2CameraImpl.mStateCallback.cancelScheduledReopen();
        camera2CameraImpl.mErrorTimeoutReopenScheduler.cancel();
        if (camera2CameraImpl.mCameraDevice != null) {
            camera2CameraImpl.closeCamera(false);
        } else {
            camera2CameraImpl.finishClose();
        }
    }

    private Collection<UseCaseInfo> toUseCaseInfos(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<UseCase> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(UseCaseInfo.from(it.next(), this.mIsPrimary));
        }
        return arrayList;
    }

    private void tryAttachUseCases(Collection<UseCaseInfo> collection) {
        Size surfaceResolution;
        boolean zIsEmpty = this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (UseCaseInfo useCaseInfo : collection) {
            if (!this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.setUseCaseAttached(useCaseInfo.getUseCaseId(), useCaseInfo.getSessionConfig(), useCaseInfo.getUseCaseConfig(), useCaseInfo.getStreamSpec(), useCaseInfo.getCaptureTypes());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == Preview.class && (surfaceResolution = useCaseInfo.getSurfaceResolution()) != null) {
                    rational = new Rational(surfaceResolution.getWidth(), surfaceResolution.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.mCameraControlInternal.setActive(true);
            this.mCameraControlInternal.incrementUseCount();
        }
        addOrRemoveMeteringRepeatingUseCase();
        updateZslDisabledByUseCaseConfigStatus();
        updateLowLightBoostDisabledByUseCaseSessionConfigStatus();
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        } else {
            openInternal();
        }
        if (rational != null) {
            this.mCameraControlInternal.setPreviewAspectRatio(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryDetachUseCases(Collection<UseCaseInfo> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (UseCaseInfo useCaseInfo : collection) {
            if (this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.removeUseCase(useCaseInfo.getUseCaseId());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == Preview.class) {
                    z11 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z11) {
            this.mCameraControlInternal.setPreviewAspectRatio(null);
        }
        addOrRemoveMeteringRepeatingUseCase();
        if (this.mUseCaseAttachState.getAttachedUseCaseConfigs().isEmpty()) {
            this.mCameraControlInternal.setZslDisabledByUserCaseConfig(false);
            this.mCameraControlInternal.setLowLightBoostDisabledByUseCaseSessionConfig(false);
        } else {
            updateZslDisabledByUseCaseConfigStatus();
            updateLowLightBoostDisabledByUseCaseSessionConfigStatus();
        }
        if (this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty()) {
            this.mCameraControlInternal.decrementUseCount();
            resetCaptureSession(false);
            this.mCameraControlInternal.setActive(false);
            this.mCaptureSession = newCaptureSession();
            closeInternal();
            return;
        }
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        }
    }

    private void updateLowLightBoostDisabledByUseCaseSessionConfigStatus() {
        if (this.mCameraInfoInternal.isLowLightBoostSupported()) {
            SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.mUseCaseAttachState.getActiveAndAttachedBuilder();
            if (activeAndAttachedBuilder.isValid()) {
                if (((Integer) activeAndAttachedBuilder.build().getExpectedFrameRateRange().getUpper()).intValue() > 30) {
                    this.mCameraControlInternal.setLowLightBoostDisabledByUseCaseSessionConfig(true);
                } else {
                    this.mCameraControlInternal.setLowLightBoostDisabledByUseCaseSessionConfig(false);
                }
            }
        }
    }

    private void updateZslDisabledByUseCaseConfigStatus() {
        Iterator<UseCaseConfig<?>> it = this.mUseCaseAttachState.getAttachedUseCaseConfigs().iterator();
        boolean zIsZslDisabled = false;
        while (it.hasNext()) {
            zIsZslDisabled |= it.next().isZslDisabled(false);
        }
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(zIsZslDisabled);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Object m1681w(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer) {
        Preconditions.checkState(camera2CameraImpl.mUserReleaseNotifier == null, "Camera can only be released once, so release completer should be null on creation.");
        camera2CameraImpl.mUserReleaseNotifier = completer;
        return "Release[camera=" + camera2CameraImpl + "]";
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.mCameraControlInternal.incrementUseCount();
        notifySessionStartedAndCameraControlReady(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(toUseCaseInfos(arrayList));
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m0
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.m1680v(this.f1401b, arrayList2);
                }
            });
        } catch (RejectedExecutionException e11) {
            debugLog("Unable to attach use cases.", e11);
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1393b.closeInternal();
            }
        });
    }

    public void closeCamera(boolean z11) {
        Preconditions.checkState(this.mState == InternalState.CLOSING || this.mState == InternalState.RELEASING || (this.mState == InternalState.REOPENING && this.mCameraDeviceError != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.mState + " (error: " + getErrorMessage(this.mCameraDeviceError) + ")");
        resetCaptureSession(z11);
        this.mCaptureSession.cancelIssuedCaptureRequests();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(toUseCaseInfos(arrayList));
        notifySessionStoppedToUseCases(new ArrayList(arrayList));
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1231b.tryDetachUseCases(arrayList2);
            }
        });
    }

    public SessionConfig findSessionConfigForSurface(DeferrableSurface deferrableSurface) {
        for (SessionConfig sessionConfig : this.mUseCaseAttachState.getAttachedSessionConfigs()) {
            if (sessionConfig.getSurfaces().contains(deferrableSurface)) {
                return sessionConfig;
            }
        }
        return null;
    }

    public void finishClose() {
        Preconditions.checkState(this.mState == InternalState.RELEASING || this.mState == InternalState.CLOSING);
        Preconditions.checkState(this.mReleasedCaptureSessions.isEmpty());
        this.mCameraDevice = null;
        if (this.mState == InternalState.CLOSING) {
            setState(InternalState.INITIALIZED);
            return;
        }
        this.mCameraManager.unregisterAvailabilityCallback(this.mCameraAvailability);
        setState(InternalState.RELEASED);
        CallbackToFutureAdapter.Completer<Void> completer = this.mUserReleaseNotifier;
        if (completer != null) {
            completer.set(null);
            this.mUserReleaseNotifier = null;
        }
    }

    @VisibleForTesting
    public CameraAvailability getCameraAvailability() {
        return this.mCameraAvailability;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraControlInternal getCameraControlInternal() {
        return this.mCameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraInfoInternal getCameraInfoInternal() {
        return this.mCameraInfoInternal;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public Observable<CameraInternal.State> getCameraState() {
        return this.mObservableState;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.mCameraConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public boolean isMeteringRepeatingAttached() {
        try {
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.n0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CameraImpl.m1660b(this.f1411a, completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e11);
        }
    }

    public boolean isSessionCloseComplete() {
        return this.mReleasedCaptureSessions.isEmpty();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void onRemoved() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.h0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m1678t(this.f1357b);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1342b.openInternal();
            }
        });
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void openCaptureSession() {
        Preconditions.checkState(this.mState == InternalState.OPENED);
        SessionConfig.ValidatingBuilder attachedBuilder = this.mUseCaseAttachState.getAttachedBuilder();
        if (!attachedBuilder.isValid()) {
            debugLog("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.mCameraStateRegistry.tryOpenCaptureSession(this.mCameraDevice.getId(), this.mCameraCoordinator.getPairedConcurrentCameraId(this.mCameraDevice.getId()))) {
            debugLog("Unable to create capture session in camera operating mode = " + this.mCameraCoordinator.getCameraOperatingMode());
            return;
        }
        HashMap map = new HashMap();
        StreamUseCaseUtil.populateSurfaceToStreamUseCaseMapping(this.mUseCaseAttachState.getAttachedSessionConfigs(), this.mUseCaseAttachState.getAttachedUseCaseConfigs(), map);
        this.mCaptureSession.setStreamUseCaseMap(map);
        final CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        Futures.addCallback(captureSessionInterface.open(attachedBuilder.build(), (CameraDevice) Preconditions.checkNotNull(this.mCameraDevice), this.mCaptureSessionOpenerBuilder.build()), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.4
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                    SessionConfig sessionConfigFindSessionConfigForSurface = Camera2CameraImpl.this.findSessionConfigForSurface(((DeferrableSurface.SurfaceClosedException) th2).getDeferrableSurface());
                    if (sessionConfigFindSessionConfigForSurface != null) {
                        Camera2CameraImpl.this.postSurfaceClosedError(sessionConfigFindSessionConfigForSurface);
                        return;
                    }
                    return;
                }
                if (th2 instanceof CancellationException) {
                    Camera2CameraImpl.this.debugLog("Unable to configure camera cancelled");
                    return;
                }
                InternalState internalState = Camera2CameraImpl.this.mState;
                InternalState internalState2 = InternalState.OPENED;
                if (internalState == internalState2) {
                    Camera2CameraImpl.this.setState(internalState2, CameraState.StateError.create(4, th2));
                }
                Logger.m1869e(Camera2CameraImpl.TAG, "Unable to configure camera " + Camera2CameraImpl.this, th2);
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                if (camera2CameraImpl.mCaptureSession == captureSessionInterface) {
                    camera2CameraImpl.resetCaptureSession(false);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r11) {
                if (Camera2CameraImpl.this.mCameraCoordinator.getCameraOperatingMode() == 2 && Camera2CameraImpl.this.mState == InternalState.OPENED) {
                    Camera2CameraImpl.this.setState(InternalState.CONFIGURED);
                }
            }
        }, this.mExecutor);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public ListenableFuture<Void> release() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.v
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraImpl.m1675q(this.f1498a, completer);
            }
        });
    }

    public void resetCaptureSession(boolean z11) {
        Preconditions.checkState(this.mCaptureSession != null);
        debugLog("Resetting Capture Session");
        CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        SessionConfig sessionConfig = captureSessionInterface.getSessionConfig();
        List<CaptureConfig> captureConfigs = captureSessionInterface.getCaptureConfigs();
        CaptureSessionInterface captureSessionInterfaceNewCaptureSession = newCaptureSession();
        this.mCaptureSession = captureSessionInterfaceNewCaptureSession;
        captureSessionInterfaceNewCaptureSession.setSessionConfig(sessionConfig);
        this.mCaptureSession.issueCaptureRequests(captureConfigs);
        if (this.mState.ordinal() != 9) {
            debugLog("Skipping Capture Session state check due to current camera state: " + this.mState + " and previous session status: " + captureSessionInterface.isInOpenState());
        } else if (this.mShouldCloseCameraBeforeCreateNewSession && captureSessionInterface.isInOpenState()) {
            debugLog("Close camera before creating new session");
            setState(InternalState.REOPENING_QUIRK);
        }
        if (this.mConfigAndCloseQuirk && captureSessionInterface.isInOpenState()) {
            debugLog("ConfigAndClose is required when close the camera.");
            this.mIsConfigAndCloseRequired = true;
        }
        releaseSession(captureSessionInterface, z11);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(final boolean z11) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m1668j(this.f1248b, z11);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setExtendedConfig(CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = CameraConfigs.defaultConfig();
        }
        SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
        this.mCameraConfig = cameraConfig;
        synchronized (this.mLock) {
            this.mSessionProcessor = sessionProcessor;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setPrimary(boolean z11) {
        this.mIsPrimary = z11;
    }

    public void setState(InternalState internalState, CameraState.StateError stateError) {
        setState(internalState, stateError, true);
    }

    public void submitCaptureRequests(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig captureConfig : list) {
            CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
            if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                builderFrom.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
            }
            if (!captureConfig.getSurfaces().isEmpty() || !captureConfig.isUseRepeatingSurface() || checkAndAttachRepeatingSurface(builderFrom)) {
                arrayList.add(builderFrom.build());
            }
        }
        debugLog("Issue capture request");
        this.mCaptureSession.issueCaptureRequests(arrayList);
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.mCameraInfoInternal.getCameraId());
    }

    public void tryForceOpenCameraDevice(boolean z11) {
        debugLog("Attempting to force open the camera.");
        if (this.mCameraStateRegistry.tryOpenCamera(this)) {
            openCameraDevice(z11);
        } else {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
        }
    }

    public void tryOpenCameraDevice(boolean z11) {
        debugLog("Attempting to open the camera.");
        if (this.mCameraAvailability.isCameraAvailable() && this.mCameraStateRegistry.tryOpenCamera(this)) {
            openCameraDevice(z11);
        } else {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
        }
    }

    public void updateCaptureSessionConfig() {
        SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.mUseCaseAttachState.getActiveAndAttachedBuilder();
        if (!activeAndAttachedBuilder.isValid()) {
            this.mCameraControlInternal.resetTemplate();
            this.mCaptureSession.setSessionConfig(this.mCameraControlInternal.getSessionConfig());
            return;
        }
        this.mCameraControlInternal.setTemplate(activeAndAttachedBuilder.build().getTemplateType());
        activeAndAttachedBuilder.add(this.mCameraControlInternal.getSessionConfig());
        this.mCaptureSession.setSessionConfig(activeAndAttachedBuilder.build());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m1659a(Camera2CameraImpl camera2CameraImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.getClass();
        try {
            ArrayList arrayList = new ArrayList(camera2CameraImpl.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
            arrayList.add(camera2CameraImpl.mCaptureSessionRepository.getCameraStateCallback());
            arrayList.add(new CameraDevice.StateCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.2
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onClosed(CameraDevice cameraDevice) {
                    Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera closed");
                    completer.set(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onDisconnected(CameraDevice cameraDevice) {
                    Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera disconnected");
                    completer.set(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onError(CameraDevice cameraDevice, int i11) {
                    Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera error " + i11);
                    completer.set(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onOpened(final CameraDevice cameraDevice) {
                    Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera opened");
                    ListenableFuture listenableFutureConfigAndClose = Camera2CameraImpl.this.configAndClose(cameraDevice);
                    Objects.requireNonNull(cameraDevice);
                    listenableFutureConfigAndClose.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraDevice.close();
                        }
                    }, Camera2CameraImpl.this.mExecutor);
                }
            });
            camera2CameraImpl.mCameraManager.openCamera(camera2CameraImpl.mCameraInfoInternal.getCameraId(), camera2CameraImpl.mExecutor, CameraDeviceStateCallbacks.createComboCallback(arrayList));
            return "configAndCloseTask";
        } catch (CameraAccessExceptionCompat | RuntimeException e11) {
            camera2CameraImpl.debugLog("Unable to open camera for configAndClose: " + e11.getMessage(), e11);
            completer.setException(e11);
            return "configAndCloseTask";
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1660b(final Camera2CameraImpl camera2CameraImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.getClass();
        try {
            camera2CameraImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.i0
                @Override // java.lang.Runnable
                public final void run() {
                    completer.set(Boolean.valueOf(this.f1361b.isMeteringRepeatingAttachedInternal()));
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1661c(Camera2CameraImpl camera2CameraImpl) {
        if (!camera2CameraImpl.isMeteringRepeatingAttached()) {
            return;
        }
        camera2CameraImpl.resetUseCase(getMeteringRepeatingId(camera2CameraImpl.mMeteringRepeatingSession), camera2CameraImpl.mMeteringRepeatingSession.getSessionConfig(), camera2CameraImpl.mMeteringRepeatingSession.getUseCaseConfig(), null, Collections.singletonList(UseCaseConfigFactory.CaptureType.METERING_REPEATING));
    }

    private boolean checkAndAttachRepeatingSurface(CaptureConfig.Builder builder) {
        if (!builder.getSurfaces().isEmpty()) {
            Logger.m1872w(TAG, "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<SessionConfig> it = this.mUseCaseAttachState.getActiveAndAttachedSessionConfigs().iterator();
        while (it.hasNext()) {
            CaptureConfig repeatingCaptureConfig = it.next().getRepeatingCaptureConfig();
            List<DeferrableSurface> surfaces = repeatingCaptureConfig.getSurfaces();
            if (!surfaces.isEmpty()) {
                if (repeatingCaptureConfig.getPreviewStabilizationMode() != 0) {
                    builder.setPreviewStabilization(repeatingCaptureConfig.getPreviewStabilizationMode());
                }
                if (repeatingCaptureConfig.getVideoStabilizationMode() != 0) {
                    builder.setVideoStabilization(repeatingCaptureConfig.getVideoStabilizationMode());
                }
                Iterator<DeferrableSurface> it2 = surfaces.iterator();
                while (it2.hasNext()) {
                    builder.addSurface(it2.next());
                }
            }
        }
        if (builder.getSurfaces().isEmpty()) {
            Logger.m1872w(TAG, "Unable to find a repeating surface to attach to CaptureConfig");
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1663e(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1664f(Camera2CameraImpl camera2CameraImpl, String str) {
        camera2CameraImpl.getClass();
        camera2CameraImpl.debugLog("Use case " + str + " INACTIVE");
        camera2CameraImpl.mUseCaseAttachState.setUseCaseInactive(str);
        camera2CameraImpl.updateCaptureSessionConfig();
    }

    public static List<UseCaseConfigFactory.CaptureType> getCaptureTypes(UseCase useCase) {
        if (useCase.getCamera() == null) {
            return null;
        }
        return StreamSharing.getCaptureTypes(useCase);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m1666h(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        camera2CameraImpl.getClass();
        camera2CameraImpl.debugLog("Use case " + str + " UPDATED");
        camera2CameraImpl.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        camera2CameraImpl.updateCaptureSessionConfig();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ ListenableFuture m1667i(CaptureSession captureSession, DeferrableSurface deferrableSurface, Void r11) {
        captureSession.close();
        deferrableSurface.close();
        return captureSession.release(false);
    }

    private boolean isMeteringRepeatingRestricted(MeteringRepeatingSession meteringRepeatingSession) {
        Preconditions.checkNotNull(meteringRepeatingSession);
        if (isSurfaceCombinationWithMeteringRepeatingSupported(meteringRepeatingSession) && !isMeteringRepeatingDisabled()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1671m(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        camera2CameraImpl.getClass();
        camera2CameraImpl.debugLog("Use case " + str + " ACTIVE");
        camera2CameraImpl.mUseCaseAttachState.setUseCaseActive(str, sessionConfig, useCaseConfig, streamSpec, list);
        camera2CameraImpl.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        camera2CameraImpl.updateCaptureSessionConfig();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m1672n(final Camera2CameraImpl camera2CameraImpl, final String str, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.getClass();
        try {
            camera2CameraImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    completer.set(Boolean.valueOf(this.f1489b.mUseCaseAttachState.isUseCaseAttached(str)));
                }
            });
            return "isUseCaseAttached";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if use case is attached. Camera executor shut down."));
            return "isUseCaseAttached";
        }
    }

    private void notifySessionStartedAndCameraControlReady(List<UseCase> list) {
        for (UseCase useCase : list) {
            String useCaseId = getUseCaseId(useCase);
            if (!this.mSessionStartNotifiedUseCases.contains(useCaseId)) {
                this.mSessionStartNotifiedUseCases.add(useCaseId);
                useCase.onSessionStart();
                useCase.onCameraControlReady();
            }
        }
    }

    private void notifySessionStoppedToUseCases(List<UseCase> list) {
        for (UseCase useCase : list) {
            String useCaseId = getUseCaseId(useCase);
            if (this.mSessionStartNotifiedUseCases.contains(useCaseId)) {
                useCase.onSessionStop();
                this.mSessionStartNotifiedUseCases.remove(useCaseId);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1674p(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        camera2CameraImpl.getClass();
        camera2CameraImpl.debugLog("Use case " + str + " RESET");
        camera2CameraImpl.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        camera2CameraImpl.addOrRemoveMeteringRepeatingUseCase();
        camera2CameraImpl.resetCaptureSession(false);
        camera2CameraImpl.updateCaptureSessionConfig();
        if (camera2CameraImpl.mState == InternalState.OPENED) {
            camera2CameraImpl.openCaptureSession();
        }
    }

    private ListenableFuture<Void> releaseInternal() {
        ListenableFuture<Void> orCreateUserReleaseFuture = getOrCreateUserReleaseFuture();
        boolean z11 = true;
        switch (this.mState.ordinal()) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!this.mStateCallback.cancelScheduledReopen() && !this.mErrorTimeoutReopenScheduler.isErrorHandling()) {
                    z11 = false;
                }
                this.mErrorTimeoutReopenScheduler.cancel();
                setState(InternalState.RELEASING);
                if (z11) {
                    Preconditions.checkState(isSessionCloseComplete());
                    configAndCloseIfNeeded();
                }
                break;
            case 2:
            case 3:
            case 4:
                if (this.mCameraDevice != null) {
                    z11 = false;
                }
                Preconditions.checkState(z11);
                setState(InternalState.RELEASING);
                Preconditions.checkState(isSessionCloseComplete());
                configAndCloseIfNeeded();
                break;
            case 9:
            case 10:
                setState(InternalState.RELEASING);
                closeCamera(false);
                break;
            default:
                debugLog("release() ignored due to being in state: " + this.mState);
                break;
        }
        return orCreateUserReleaseFuture;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m1680v(Camera2CameraImpl camera2CameraImpl, List list) {
        camera2CameraImpl.getClass();
        try {
            camera2CameraImpl.tryAttachUseCases(list);
        } finally {
            camera2CameraImpl.mCameraControlInternal.decrementUseCount();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public boolean isUseCaseAttached(UseCase useCase) {
        try {
            final String useCaseId = getUseCaseId(useCase);
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.y
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CameraImpl.m1672n(this.f1521a, useCaseId, completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException("Unable to check if use case is attached.", e11);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(UseCase useCase) {
        SessionConfig secondarySessionConfig;
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        if (this.mIsPrimary) {
            secondarySessionConfig = useCase.getSessionConfig();
        } else {
            secondarySessionConfig = useCase.getSecondarySessionConfig();
        }
        final SessionConfig sessionConfig = secondarySessionConfig;
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        final StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
        final List<UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.q0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m1671m(this.f1443b, useCaseId, sessionConfig, currentConfig, attachedStreamSpec, captureTypes);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.p0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m1664f(this.f1433b, useCaseId);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(UseCase useCase) {
        SessionConfig secondarySessionConfig;
        Preconditions.checkNotNull(useCase);
        if (this.mIsPrimary) {
            secondarySessionConfig = useCase.getSessionConfig();
        } else {
            secondarySessionConfig = useCase.getSecondarySessionConfig();
        }
        SessionConfig sessionConfig = secondarySessionConfig;
        resetUseCase(getUseCaseId(useCase), sessionConfig, useCase.getCurrentConfig(), useCase.getAttachedStreamSpec(), getCaptureTypes(useCase));
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(UseCase useCase) {
        SessionConfig secondarySessionConfig;
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        if (this.mIsPrimary) {
            secondarySessionConfig = useCase.getSessionConfig();
        } else {
            secondarySessionConfig = useCase.getSecondarySessionConfig();
        }
        final SessionConfig sessionConfig = secondarySessionConfig;
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        final StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
        final List<UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.o0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m1666h(this.f1419b, useCaseId, sessionConfig, currentConfig, attachedStreamSpec, captureTypes);
            }
        });
    }

    public void postSurfaceClosedError(final SessionConfig sessionConfig) {
        ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
        final SessionConfig.ErrorListener errorListener = sessionConfig.getErrorListener();
        if (errorListener != null) {
            debugLog("Posting surface closed", new Throwable());
            scheduledExecutorServiceMainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.w
                @Override // java.lang.Runnable
                public final void run() {
                    errorListener.onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    public ListenableFuture<Void> releaseSession(final CaptureSessionInterface captureSessionInterface, boolean z11) {
        captureSessionInterface.close();
        ListenableFuture<Void> listenableFutureRelease = captureSessionInterface.release(z11);
        debugLog("Releasing session in state " + this.mState.name());
        this.mReleasedCaptureSessions.put(captureSessionInterface, listenableFutureRelease);
        Futures.addCallback(listenableFutureRelease, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r11) {
                Camera2CameraImpl.this.mReleasedCaptureSessions.remove(captureSessionInterface);
                int iOrdinal = Camera2CameraImpl.this.mState.ordinal();
                if (iOrdinal != 1 && iOrdinal != 5) {
                    if (iOrdinal != 6 && (iOrdinal != 7 || Camera2CameraImpl.this.mCameraDeviceError == 0)) {
                        return;
                    } else {
                        Camera2CameraImpl.this.debugLog("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (Camera2CameraImpl.this.isSessionCloseComplete()) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.mCameraDevice != null) {
                        camera2CameraImpl.debugLog("closing camera");
                        ApiCompat.Api21Impl.close(Camera2CameraImpl.this.mCameraDevice);
                        Camera2CameraImpl.this.mCameraDevice = null;
                    }
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
            }
        }, CameraXExecutors.directExecutor());
        return listenableFutureRelease;
    }

    public void setState(InternalState internalState, CameraState.StateError stateError, boolean z11) {
        CameraInternal.State state;
        debugLog("Transitioning camera internal state: " + this.mState + " --> " + internalState);
        traceInternalState(internalState, stateError);
        this.mState = internalState;
        switch (internalState) {
            case RELEASED:
                state = CameraInternal.State.RELEASED;
                break;
            case RELEASING:
                state = CameraInternal.State.RELEASING;
                break;
            case INITIALIZED:
                state = CameraInternal.State.CLOSED;
                break;
            case PENDING_OPEN:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case OPENING_WITH_ERROR:
            case CLOSING:
            case REOPENING_QUIRK:
                state = CameraInternal.State.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                state = CameraInternal.State.OPENING;
                break;
            case OPENED:
                state = CameraInternal.State.OPEN;
                break;
            case CONFIGURED:
                state = CameraInternal.State.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.mCameraStateRegistry.markCameraState(this, state, z11);
        this.mObservableState.postValue(state);
        this.mCameraStateMachine.updateState(state, stateError);
    }

    public void traceInternalState(InternalState internalState, CameraState.StateError stateError) {
        int code;
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:C2State[" + this + "]", internalState.ordinal());
            if (stateError != null) {
                this.mTraceStateErrorCount++;
            }
            if (this.mTraceStateErrorCount > 0) {
                String str = "CX:C2StateErrorCode[" + this + "]";
                if (stateError != null) {
                    code = stateError.getCode();
                } else {
                    code = 0;
                }
                Trace.setCounter(str, code);
            }
        }
    }
}
