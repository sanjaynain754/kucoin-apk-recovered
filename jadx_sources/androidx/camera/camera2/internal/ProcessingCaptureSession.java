package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.OptIn;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.OutputSurfaceConfiguration;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
final class ProcessingCaptureSession implements CaptureSessionInterface {
    private static final String TAG = "ProcessingCaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private static List<DeferrableSurface> sHeldProcessorSurfaces = new ArrayList();
    private static int sNextInstanceId = 0;
    private final Camera2CameraInfoImpl mCamera2CameraInfoImpl;
    private final CaptureSession mCaptureSession;
    final Executor mExecutor;
    private int mInstanceId;
    private SessionConfig mProcessorSessionConfig;
    private ProcessorState mProcessorState;
    private Camera2RequestProcessor mRequestProcessor;
    private final ScheduledExecutorService mScheduledExecutorService;
    private SessionConfig mSessionConfig;
    private final SessionProcessor mSessionProcessor;
    private final SessionProcessorCaptureCallback mSessionProcessorCaptureCallback;
    private List<DeferrableSurface> mOutputSurfaces = new ArrayList();
    private volatile List<CaptureConfig> mPendingCaptureConfigs = null;
    private CaptureRequestOptions mSessionOptions = new CaptureRequestOptions.Builder().build();
    private CaptureRequestOptions mStillCaptureOptions = new CaptureRequestOptions.Builder().build();

    public static class CaptureCallbackAdapter implements SessionProcessor.CaptureCallback {
        private List<CameraCaptureCallback> mCameraCaptureCallbacks;
        private final int mCaptureConfigId;
        private CameraCaptureResult mCaptureResult;

        private CaptureCallbackAdapter(int i11, List<CameraCaptureCallback> list) {
            this.mCaptureResult = null;
            this.mCaptureConfigId = i11;
            this.mCameraCaptureCallbacks = list;
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureCompleted(long j11, int i11, CameraCaptureResult cameraCaptureResult) {
            this.mCaptureResult = cameraCaptureResult;
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i11) {
            Iterator<CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(this.mCaptureConfigId, new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureProcessProgressed(int i11) {
            Iterator<CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProcessProgressed(this.mCaptureConfigId, i11);
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i11) {
            CameraCaptureResult emptyCameraCaptureResult = this.mCaptureResult;
            if (emptyCameraCaptureResult == null) {
                emptyCameraCaptureResult = new CameraCaptureResult.EmptyCameraCaptureResult();
            }
            Iterator<CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(this.mCaptureConfigId, emptyCameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureStarted(int i11, long j11) {
            Iterator<CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(this.mCaptureConfigId);
            }
        }
    }

    public enum ProcessorState {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    private boolean isTemplateTypeForStillCapture(int i11) {
        return i11 == 2 || i11 == 4;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m1749a(ProcessingCaptureSession processingCaptureSession, Void r11) {
        processingCaptureSession.onConfigured(processingCaptureSession.mCaptureSession);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1751c(ProcessingCaptureSession processingCaptureSession, DeferrableSurface deferrableSurface) {
        DeferrableSurfaces.decrementAll(processingCaptureSession.mOutputSurfaces);
        if (deferrableSurface != null) {
            deferrableSurface.decrementUseCount();
        }
    }

    private static List<SessionProcessorSurface> getSessionProcessorSurfaceList(List<DeferrableSurface> list) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            Preconditions.checkArgument(deferrableSurface instanceof SessionProcessorSurface, "Surface must be SessionProcessorSurface");
            arrayList.add((SessionProcessorSurface) deferrableSurface);
        }
        return arrayList;
    }

    private void updateParameters(CaptureRequestOptions captureRequestOptions, CaptureRequestOptions captureRequestOptions2) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(captureRequestOptions);
        builder.insertAllOptions(captureRequestOptions2);
        this.mSessionProcessor.setParameters(builder.build());
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        Logger.m1866d(TAG, "cancelIssuedCaptureRequests (id=" + this.mInstanceId + ")");
        if (this.mPendingCaptureConfigs != null) {
            for (CaptureConfig captureConfig : this.mPendingCaptureConfigs) {
                Iterator<CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCancelled(captureConfig.getId());
                }
            }
            this.mPendingCaptureConfigs = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        Logger.m1866d(TAG, "close (id=" + this.mInstanceId + ") state=" + this.mProcessorState);
        if (this.mProcessorState == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            Logger.m1866d(TAG, "== onCaptureSessionEnd (id = " + this.mInstanceId + ")");
            this.mSessionProcessor.onCaptureSessionEnd();
            Camera2RequestProcessor camera2RequestProcessor = this.mRequestProcessor;
            if (camera2RequestProcessor != null) {
                camera2RequestProcessor.close();
            }
            this.mProcessorState = ProcessorState.ON_CAPTURE_SESSION_ENDED;
        }
        this.mCaptureSession.close();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public List<CaptureConfig> getCaptureConfigs() {
        return this.mPendingCaptureConfigs != null ? this.mPendingCaptureConfigs : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public boolean isInOpenState() {
        return this.mCaptureSession.isInOpenState();
    }

    public void issueTriggerRequest(CaptureConfig captureConfig) {
        Logger.m1866d(TAG, "issueTriggerRequest");
        CaptureRequestOptions captureRequestOptionsBuild = CaptureRequestOptions.Builder.from(captureConfig.getImplementationOptions()).build();
        Iterator<Config.Option<?>> it = captureRequestOptionsBuild.listOptions().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().getToken();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.mSessionProcessor.startTrigger(captureRequestOptionsBuild, captureConfig.getTagBundle(), new CaptureCallbackAdapter(captureConfig.getId(), captureConfig.getCameraCaptureCallbacks()));
                return;
            }
        }
        cancelRequests(Arrays.asList(captureConfig));
    }

    public void onConfigured(CaptureSession captureSession) {
        if (this.mProcessorState != ProcessorState.SESSION_INITIALIZED) {
            return;
        }
        this.mRequestProcessor = new Camera2RequestProcessor(captureSession, getSessionProcessorSurfaceList(this.mProcessorSessionConfig.getSurfaces()));
        Logger.m1866d(TAG, "== onCaptureSessinStarted (id = " + this.mInstanceId + ")");
        this.mSessionProcessor.onCaptureSessionStart(this.mRequestProcessor);
        this.mProcessorState = ProcessorState.ON_CAPTURE_SESSION_STARTED;
        SessionConfig sessionConfig = this.mSessionConfig;
        if (sessionConfig != null) {
            setSessionConfig(sessionConfig);
        }
        if (this.mPendingCaptureConfigs != null) {
            issueCaptureRequests(this.mPendingCaptureConfigs);
            this.mPendingCaptureConfigs = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public ListenableFuture<Void> open(final SessionConfig sessionConfig, final CameraDevice cameraDevice, final SynchronizedCaptureSession.Opener opener) {
        Preconditions.checkArgument(this.mProcessorState == ProcessorState.UNINITIALIZED, "Invalid state state:" + this.mProcessorState);
        Preconditions.checkArgument(sessionConfig.getSurfaces().isEmpty() ^ true, "SessionConfig contains no surfaces");
        Logger.m1866d(TAG, "open (id=" + this.mInstanceId + ")");
        List<DeferrableSurface> surfaces = sessionConfig.getSurfaces();
        this.mOutputSurfaces = surfaces;
        return FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(surfaces, false, 5000L, this.mExecutor, this.mScheduledExecutorService)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.q3
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return ProcessingCaptureSession.m1752d(this.f1452a, sessionConfig, cameraDevice, opener, (List) obj);
            }
        }, this.mExecutor).transform(new Function() { // from class: androidx.camera.camera2.internal.r3
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ProcessingCaptureSession.m1749a(this.f1465a, (Void) obj);
            }
        }, this.mExecutor);
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public ListenableFuture<Void> release(boolean z11) {
        Logger.m1866d(TAG, "release (id=" + this.mInstanceId + ") mProcessorState=" + this.mProcessorState);
        ListenableFuture<Void> listenableFutureRelease = this.mCaptureSession.release(z11);
        int iOrdinal = this.mProcessorState.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            listenableFutureRelease.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.p3
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.m1753e(this.f1438b);
                }
            }, CameraXExecutors.directExecutor());
        }
        this.mProcessorState = ProcessorState.DE_INITIALIZED;
        return listenableFutureRelease;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(SessionConfig sessionConfig) {
        Logger.m1866d(TAG, "setSessionConfig (id=" + this.mInstanceId + ")");
        this.mSessionConfig = sessionConfig;
        if (sessionConfig == null) {
            return;
        }
        Camera2RequestProcessor camera2RequestProcessor = this.mRequestProcessor;
        if (camera2RequestProcessor != null) {
            camera2RequestProcessor.updateSessionConfig(sessionConfig);
        }
        if (this.mProcessorState == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            CaptureRequestOptions.Builder builderFrom = CaptureRequestOptions.Builder.from(sessionConfig.getImplementationOptions());
            Integer videoStabilizationModeFromCaptureConfig = Camera2CaptureRequestBuilder.getVideoStabilizationModeFromCaptureConfig(sessionConfig.getRepeatingCaptureConfig());
            if (videoStabilizationModeFromCaptureConfig != null) {
                builderFrom.setCaptureRequestOption(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, videoStabilizationModeFromCaptureConfig);
            }
            CaptureRequestOptions captureRequestOptionsBuild = builderFrom.build();
            this.mSessionOptions = captureRequestOptionsBuild;
            updateParameters(captureRequestOptionsBuild, this.mStillCaptureOptions);
            if (hasPreviewSurface(sessionConfig.getRepeatingCaptureConfig())) {
                this.mSessionProcessor.startRepeating(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), this.mSessionProcessorCaptureCallback);
            } else {
                this.mSessionProcessor.stopRepeating();
            }
        }
    }

    public ProcessingCaptureSession(SessionProcessor sessionProcessor, Camera2CameraInfoImpl camera2CameraInfoImpl, DynamicRangesCompat dynamicRangesCompat, Executor executor, ScheduledExecutorService scheduledExecutorService, Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator) {
        this.mInstanceId = 0;
        this.mCaptureSession = new CaptureSession(dynamicRangesCompat, DeviceQuirks.get(CaptureSessionShouldUseMrirQuirk.class) != null, camera2CaptureRequestConfigurator);
        this.mSessionProcessor = sessionProcessor;
        this.mCamera2CameraInfoImpl = camera2CameraInfoImpl;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
        this.mProcessorState = ProcessorState.UNINITIALIZED;
        this.mSessionProcessorCaptureCallback = new SessionProcessorCaptureCallback();
        int i11 = sNextInstanceId;
        sNextInstanceId = i11 + 1;
        this.mInstanceId = i11;
        Logger.m1866d(TAG, "New ProcessingCaptureSession (id=" + this.mInstanceId + ")");
    }

    private static void cancelRequests(List<CaptureConfig> list) {
        for (CaptureConfig captureConfig : list) {
            Iterator<CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled(captureConfig.getId());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ListenableFuture m1752d(final ProcessingCaptureSession processingCaptureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener, List list) {
        OutputSurface outputSurfaceCreate;
        processingCaptureSession.getClass();
        Logger.m1866d(TAG, "-- getSurfaces done, start init (id=" + processingCaptureSession.mInstanceId + ")");
        if (processingCaptureSession.mProcessorState == ProcessorState.DE_INITIALIZED) {
            return Futures.immediateFailedFuture(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final DeferrableSurface surface = null;
        if (list.contains(null)) {
            return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", sessionConfig.getSurfaces().get(list.indexOf(null))));
        }
        OutputSurface outputSurfaceCreate2 = null;
        OutputSurface outputSurfaceCreate3 = null;
        OutputSurface outputSurfaceCreate4 = null;
        for (int i11 = 0; i11 < sessionConfig.getSurfaces().size(); i11++) {
            DeferrableSurface deferrableSurface = sessionConfig.getSurfaces().get(i11);
            if (!isPreview(deferrableSurface) && !isStreamSharing(deferrableSurface)) {
                if (isImageCapture(deferrableSurface)) {
                    outputSurfaceCreate3 = OutputSurface.create(deferrableSurface.getSurface().get(), deferrableSurface.getPrescribedSize(), deferrableSurface.getPrescribedStreamFormat());
                } else if (isImageAnalysis(deferrableSurface)) {
                    outputSurfaceCreate4 = OutputSurface.create(deferrableSurface.getSurface().get(), deferrableSurface.getPrescribedSize(), deferrableSurface.getPrescribedStreamFormat());
                }
            } else {
                outputSurfaceCreate2 = OutputSurface.create(deferrableSurface.getSurface().get(), deferrableSurface.getPrescribedSize(), deferrableSurface.getPrescribedStreamFormat());
            }
        }
        if (sessionConfig.getPostviewOutputConfig() != null) {
            surface = sessionConfig.getPostviewOutputConfig().getSurface();
            outputSurfaceCreate = OutputSurface.create(surface.getSurface().get(), surface.getPrescribedSize(), surface.getPrescribedStreamFormat());
        } else {
            outputSurfaceCreate = null;
        }
        processingCaptureSession.mProcessorState = ProcessorState.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(processingCaptureSession.mOutputSurfaces);
            if (surface != null) {
                arrayList.add(surface);
            }
            DeferrableSurfaces.incrementAll(arrayList);
            Logger.m1872w(TAG, "== initSession (id=" + processingCaptureSession.mInstanceId + ")");
            try {
                SessionConfig sessionConfigInitSession = processingCaptureSession.mSessionProcessor.initSession(processingCaptureSession.mCamera2CameraInfoImpl, OutputSurfaceConfiguration.create(outputSurfaceCreate2, outputSurfaceCreate3, outputSurfaceCreate4, outputSurfaceCreate));
                processingCaptureSession.mProcessorSessionConfig = sessionConfigInitSession;
                sessionConfigInitSession.getSurfaces().get(0).getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.s3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProcessingCaptureSession.m1751c(this.f1476b, surface);
                    }
                }, CameraXExecutors.directExecutor());
                for (final DeferrableSurface deferrableSurface2 : processingCaptureSession.mProcessorSessionConfig.getSurfaces()) {
                    sHeldProcessorSurfaces.add(deferrableSurface2);
                    deferrableSurface2.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.t3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProcessingCaptureSession.sHeldProcessorSurfaces.remove(deferrableSurface2);
                        }
                    }, processingCaptureSession.mExecutor);
                }
                SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                validatingBuilder.add(sessionConfig);
                validatingBuilder.clearSurfaces();
                validatingBuilder.add(processingCaptureSession.mProcessorSessionConfig);
                Preconditions.checkArgument(validatingBuilder.isValid(), "Cannot transform the SessionConfig");
                ListenableFuture<Void> listenableFutureOpen = processingCaptureSession.mCaptureSession.open(validatingBuilder.build(), (CameraDevice) Preconditions.checkNotNull(cameraDevice), opener);
                Futures.addCallback(listenableFutureOpen, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r11) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th2) {
                        Logger.m1869e(ProcessingCaptureSession.TAG, "open session failed ", th2);
                        ProcessingCaptureSession.this.close();
                        ProcessingCaptureSession.this.release(false);
                    }
                }, processingCaptureSession.mExecutor);
                return listenableFutureOpen;
            } catch (Throwable th2) {
                Logger.m1869e(TAG, "initSession failed", th2);
                DeferrableSurfaces.decrementAll(processingCaptureSession.mOutputSurfaces);
                if (surface != null) {
                    surface.decrementUseCount();
                }
                throw th2;
            }
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            return Futures.immediateFailedFuture(e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1753e(ProcessingCaptureSession processingCaptureSession) {
        processingCaptureSession.getClass();
        Logger.m1866d(TAG, "== deInitSession (id=" + processingCaptureSession.mInstanceId + ")");
        processingCaptureSession.mSessionProcessor.deInitSession();
    }

    private static boolean hasPreviewSurface(CaptureConfig captureConfig) {
        for (DeferrableSurface deferrableSurface : captureConfig.getSurfaces()) {
            if (isPreview(deferrableSurface) || isStreamSharing(deferrableSurface)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isImageAnalysis(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.getContainerClass(), ImageAnalysis.class);
    }

    private static boolean isImageCapture(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.getContainerClass(), ImageCapture.class);
    }

    private static boolean isPreview(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.getContainerClass(), Preview.class);
    }

    private static boolean isStreamSharing(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.getContainerClass(), StreamSharing.class);
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(List<CaptureConfig> list) {
        if (!list.isEmpty()) {
            Logger.m1866d(TAG, "issueCaptureRequests (id=" + this.mInstanceId + ") + state =" + this.mProcessorState);
            int iOrdinal = this.mProcessorState.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3 || iOrdinal == 4) {
                        Logger.m1866d(TAG, "Run issueCaptureRequests in wrong state, state = " + this.mProcessorState);
                        cancelRequests(list);
                        return;
                    }
                    return;
                }
                for (CaptureConfig captureConfig : list) {
                    if (isTemplateTypeForStillCapture(captureConfig.getTemplateType())) {
                        issueStillCaptureRequest(captureConfig);
                    } else {
                        issueTriggerRequest(captureConfig);
                    }
                }
                return;
            }
            if (this.mPendingCaptureConfigs != null) {
                cancelRequests(list);
                Logger.m1866d(TAG, "cancel the request because are pending un-submitted request");
            } else {
                this.mPendingCaptureConfigs = list;
            }
        }
    }

    public void issueStillCaptureRequest(CaptureConfig captureConfig) {
        CaptureRequestOptions.Builder builderFrom = CaptureRequestOptions.Builder.from(captureConfig.getImplementationOptions());
        Config implementationOptions = captureConfig.getImplementationOptions();
        Config.Option<Integer> option = CaptureConfig.OPTION_ROTATION;
        if (implementationOptions.containsOption(option)) {
            builderFrom.setCaptureRequestOption(CaptureRequest.JPEG_ORIENTATION, (Integer) captureConfig.getImplementationOptions().retrieveOption(option));
        }
        Config implementationOptions2 = captureConfig.getImplementationOptions();
        Config.Option<Integer> option2 = CaptureConfig.OPTION_JPEG_QUALITY;
        if (implementationOptions2.containsOption(option2)) {
            builderFrom.setCaptureRequestOption(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) captureConfig.getImplementationOptions().retrieveOption(option2)).byteValue()));
        }
        CaptureRequestOptions captureRequestOptionsBuild = builderFrom.build();
        this.mStillCaptureOptions = captureRequestOptionsBuild;
        updateParameters(this.mSessionOptions, captureRequestOptionsBuild);
        this.mSessionProcessor.startCapture(captureConfig.isPostviewEnabled(), captureConfig.getTagBundle(), new CaptureCallbackAdapter(captureConfig.getId(), captureConfig.getCameraCaptureCallbacks()));
    }

    public static class SessionProcessorCaptureCallback implements SessionProcessor.CaptureCallback {
        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureProcessStarted(int i11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceAborted(int i11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureStarted(int i11, long j11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureCompleted(long j11, int i11, CameraCaptureResult cameraCaptureResult) {
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(Map<DeferrableSurface, Long> map) {
    }
}
