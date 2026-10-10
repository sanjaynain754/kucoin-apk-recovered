package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.internal.compat.workaround.TorchStateReset;
import androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes23.dex */
final class CaptureSession implements CaptureSessionInterface {
    private static final String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private final boolean mCanUseMultiResolutionImageReader;

    @GuardedBy("mSessionLock")
    private final List<CaptureConfig> mCaptureConfigs;
    private final Camera2CaptureRequestConfigurator mCaptureRequestConfigurator;

    @GuardedBy("mSessionLock")
    private final StateCallback mCaptureSessionStateCallback;

    @GuardedBy("mSessionLock")
    List<DeferrableSurface> mConfiguredDeferrableSurfaces;

    @GuardedBy("mSessionLock")
    private final Map<DeferrableSurface, Surface> mConfiguredSurfaceMap;
    private final DynamicRangesCompat mDynamicRangesCompat;

    @GuardedBy("mSessionLock")
    State mHighestState;

    @GuardedBy("mSessionLock")
    CallbackToFutureAdapter.Completer<Void> mReleaseCompleter;

    @GuardedBy("mSessionLock")
    ListenableFuture<Void> mReleaseFuture;
    private final RequestMonitor mRequestMonitor;

    @GuardedBy("mSessionLock")
    SessionConfig mSessionConfig;
    final Object mSessionLock;

    @GuardedBy("mSessionLock")
    SynchronizedCaptureSession.Opener mSessionOpener;

    @GuardedBy("mSessionLock")
    State mState;
    private final StillCaptureFlow mStillCaptureFlow;

    @GuardedBy("mSessionLock")
    private Map<DeferrableSurface, Long> mStreamUseCaseMap;

    @GuardedBy("mSessionLock")
    SynchronizedCaptureSession mSynchronizedCaptureSession;
    private final TemplateParamsOverride mTemplateParamsOverride;
    private final TorchStateReset mTorchStateReset;

    public enum State {
        UNINITIALIZED,
        RELEASED,
        INITIALIZED,
        GET_SURFACE,
        RELEASING,
        CLOSED,
        OPENING,
        OPENED
    }

    public final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        public StateCallback() {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    switch (CaptureSession.this.mState) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.mState);
                        case RELEASED:
                            Logger.m1866d(CaptureSession.TAG, "ConfigureFailed callback after change to RELEASED state");
                            break;
                        case RELEASING:
                        case CLOSED:
                        case OPENING:
                            CaptureSession.this.finishClose();
                            break;
                    }
                    Logger.m1868e(CaptureSession.TAG, "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.mState);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    switch (CaptureSession.this.mState) {
                        case UNINITIALIZED:
                        case RELEASED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                        case RELEASING:
                            synchronizedCaptureSession.close();
                            break;
                        case CLOSED:
                            CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                            break;
                        case OPENING:
                            CaptureSession.this.setState(State.OPENED);
                            CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                            Logger.m1866d(CaptureSession.TAG, "Attempting to send capture request onConfigured");
                            CaptureSession captureSession = CaptureSession.this;
                            captureSession.issueRepeatingCaptureRequests(captureSession.mSessionConfig);
                            CaptureSession.this.issuePendingCaptureRequest();
                            break;
                    }
                    Logger.m1866d(CaptureSession.TAG, "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    if (CaptureSession.this.mState.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                    }
                    Logger.m1866d(CaptureSession.TAG, "CameraCaptureSession.onReady() " + CaptureSession.this.mState);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: onSessionFinished */
        public void m1762e(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    if (CaptureSession.this.mState == State.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.mState);
                    }
                    Logger.m1866d(CaptureSession.TAG, "onSessionFinished()");
                    CaptureSession.this.finishClose();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat) {
        this(dynamicRangesCompat, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public ListenableFuture<Void> openCaptureSession(List<Surface> list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.mSessionLock) {
            try {
                int iOrdinal = this.mState.ordinal();
                if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                    return Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
                }
                if (iOrdinal != 3) {
                    return Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.mState));
                }
                this.mConfiguredSurfaceMap.clear();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i11), list.get(i11));
                }
                setState(State.OPENING);
                Logger.m1866d(TAG, "Opening capture session.");
                SynchronizedCaptureSession.StateCallback stateCallbackCreateComboCallback = SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(sessionConfig.getImplementationOptions());
                CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                Map map = new HashMap();
                if (this.mCanUseMultiResolutionImageReader && Build.VERSION.SDK_INT >= 35) {
                    map = createMultiResolutionOutputConfigurationCompats(groupMrirOutputConfigs(sessionConfig.getOutputConfigs()), this.mConfiguredSurfaceMap);
                }
                ArrayList arrayList = new ArrayList();
                String physicalCameraId = camera2ImplConfig.getPhysicalCameraId(null);
                for (SessionConfig.OutputConfig outputConfig : sessionConfig.getOutputConfigs()) {
                    OutputConfigurationCompat outputConfigurationCompat = (!this.mCanUseMultiResolutionImageReader || Build.VERSION.SDK_INT < 35) ? null : (OutputConfigurationCompat) map.get(outputConfig);
                    if (outputConfigurationCompat == null) {
                        outputConfigurationCompat = getOutputConfigurationCompat(outputConfig, this.mConfiguredSurfaceMap, physicalCameraId);
                        if (this.mStreamUseCaseMap.containsKey(outputConfig.getSurface())) {
                            outputConfigurationCompat.setStreamUseCase(this.mStreamUseCaseMap.get(outputConfig.getSurface()).longValue());
                        }
                    }
                    arrayList.add(outputConfigurationCompat);
                }
                SessionConfigurationCompat sessionConfigurationCompatCreateSessionConfigurationCompat = this.mSessionOpener.createSessionConfigurationCompat(sessionConfig.getSessionType(), getUniqueOutputConfigurations(arrayList), stateCallbackCreateComboCallback);
                if (sessionConfig.getTemplateType() == 5 && sessionConfig.getInputConfiguration() != null) {
                    sessionConfigurationCompatCreateSessionConfigurationCompat.setInputConfiguration(InputConfigurationCompat.wrap(sessionConfig.getInputConfiguration()));
                }
                try {
                    CaptureRequest captureRequestBuildWithoutTarget = Camera2CaptureRequestBuilder.buildWithoutTarget(builderFrom.build(), cameraDevice, this.mTemplateParamsOverride);
                    if (captureRequestBuildWithoutTarget != null) {
                        Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator = this.mCaptureRequestConfigurator;
                        if (camera2CaptureRequestConfigurator != null) {
                            camera2CaptureRequestConfigurator.configureWith(captureRequestBuildWithoutTarget);
                        }
                        sessionConfigurationCompatCreateSessionConfigurationCompat.setSessionParameters(captureRequestBuildWithoutTarget);
                    }
                    return this.mSessionOpener.openCaptureSession(cameraDevice, sessionConfigurationCompatCreateSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                } catch (CameraAccessException e11) {
                    return Futures.immediateFailedFuture(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, boolean z11) {
        this(dynamicRangesCompat, new Quirks(Collections.EMPTY_LIST), z11, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1717a(CaptureSession captureSession) {
        synchronized (captureSession.mSessionLock) {
            if (captureSession.mCaptureConfigs.isEmpty()) {
                return;
            }
            try {
                captureSession.issueBurstCaptureRequest(captureSession.mCaptureConfigs);
                captureSession.mCaptureConfigs.clear();
            } catch (Throwable th2) {
                captureSession.mCaptureConfigs.clear();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1718b(CaptureSession captureSession, CallbackToFutureAdapter.Completer completer) {
        String str;
        synchronized (captureSession.mSessionLock) {
            Preconditions.checkState(captureSession.mReleaseCompleter == null, "Release completer expected to be null");
            captureSession.mReleaseCompleter = completer;
            str = "Release[session=" + captureSession + "]";
        }
        return str;
    }

    @GuardedBy("mSessionLock")
    private int captureHighSpeedBurst(List<CaptureRequest> list, CameraBurstCaptureCallback cameraBurstCaptureCallback) throws CameraAccessException {
        CameraBurstCaptureCallback cameraBurstCaptureCallback2 = new CameraBurstCaptureCallback();
        int iCaptureBurstRequests = -1;
        for (CaptureRequest captureRequest : list) {
            SynchronizedCaptureSession synchronizedCaptureSession = this.mSynchronizedCaptureSession;
            Objects.requireNonNull(synchronizedCaptureSession);
            List<CaptureRequest> listCreateHighSpeedRequestList = synchronizedCaptureSession.createHighSpeedRequestList(captureRequest);
            Iterator<CaptureRequest> it = listCreateHighSpeedRequestList.iterator();
            while (it.hasNext()) {
                cameraBurstCaptureCallback2.addCamera2Callbacks(it.next(), Collections.singletonList(new RequestForwardingCaptureCallback(captureRequest, cameraBurstCaptureCallback)));
            }
            iCaptureBurstRequests = this.mSynchronizedCaptureSession.captureBurstRequests(listCreateHighSpeedRequestList, cameraBurstCaptureCallback2);
        }
        return iCaptureBurstRequests;
    }

    @GuardedBy("mSessionLock")
    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<CameraCaptureCallback> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback(arrayList);
    }

    @RequiresApi(35)
    private static Map<SessionConfig.OutputConfig, OutputConfigurationCompat> createMultiResolutionOutputConfigurationCompats(Map<Integer, List<SessionConfig.OutputConfig>> map, Map<DeferrableSurface, Surface> map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (SessionConfig.OutputConfig outputConfig : map.get(num)) {
                SurfaceUtil.SurfaceInfo surfaceInfo = SurfaceUtil.getSurfaceInfo(map2.get(outputConfig.getSurface()));
                if (i11 == 0) {
                    i11 = surfaceInfo.format;
                }
                C0797h2.m1824a();
                int i12 = surfaceInfo.width;
                int i13 = surfaceInfo.height;
                String physicalCameraId = outputConfig.getPhysicalCameraId();
                Objects.requireNonNull(physicalCameraId);
                arrayList.add(C0791g2.m1823a(i12, i13, physicalCameraId));
            }
            if (i11 == 0 || arrayList.isEmpty()) {
                Logger.m1868e(TAG, "Skips to create instances for multi-resolution output. imageFormat: " + i11 + ", streamInfos size: " + arrayList.size());
            } else {
                List listCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i11);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (SessionConfig.OutputConfig outputConfig2 : map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface(map2.get(outputConfig2.getSurface()));
                        map3.put(outputConfig2, new OutputConfigurationCompat(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1720d(CaptureSession captureSession, CameraCaptureSession cameraCaptureSession, int i11, boolean z11) {
        synchronized (captureSession.mSessionLock) {
            try {
                if (captureSession.mState == State.OPENED) {
                    captureSession.issueRepeatingCaptureRequests(captureSession.mSessionConfig);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private List<OutputConfigurationCompat> getUniqueOutputConfigurations(List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OutputConfigurationCompat outputConfigurationCompat : list) {
            if (!arrayList.contains(outputConfigurationCompat.getSurface())) {
                arrayList.add(outputConfigurationCompat.getSurface());
                arrayList2.add(outputConfigurationCompat);
            }
        }
        return arrayList2;
    }

    private static Map<Integer, List<SessionConfig.OutputConfig>> groupMrirOutputConfigs(Collection<SessionConfig.OutputConfig> collection) {
        HashMap map = new HashMap();
        for (SessionConfig.OutputConfig outputConfig : collection) {
            if (outputConfig.getSurfaceGroupId() > 0 && outputConfig.getSharedSurfaces().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(outputConfig.getSurfaceGroupId()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(outputConfig.getSurfaceGroupId()), arrayList);
                }
                arrayList.add(outputConfig);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public void abortCaptures() {
        synchronized (this.mSessionLock) {
            if (this.mState == State.OPENED) {
                try {
                    this.mSynchronizedCaptureSession.abortCaptures();
                } catch (CameraAccessException e11) {
                    Logger.m1869e(TAG, "Unable to abort captures.", e11);
                }
            } else {
                Logger.m1868e(TAG, "Unable to abort captures. Incorrect state:" + this.mState);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        ArrayList<CaptureConfig> arrayList;
        synchronized (this.mSessionLock) {
            try {
                if (this.mCaptureConfigs.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.mCaptureConfigs);
                    this.mCaptureConfigs.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (CaptureConfig captureConfig : arrayList) {
                Iterator<CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCancelled(captureConfig.getId());
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        synchronized (this.mSessionLock) {
            try {
                int iOrdinal = this.mState.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.mState);
                }
                if (iOrdinal == 2) {
                    setState(State.RELEASED);
                } else if (iOrdinal == 3) {
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                    setState(State.RELEASED);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                    setState(State.CLOSED);
                    this.mRequestMonitor.stop();
                    this.mSessionConfig = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("mSessionLock")
    public void finishClose() {
        State state = this.mState;
        State state2 = State.RELEASED;
        if (state == state2) {
            Logger.m1866d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        setState(state2);
        this.mSynchronizedCaptureSession = null;
        CallbackToFutureAdapter.Completer<Void> completer = this.mReleaseCompleter;
        if (completer != null) {
            completer.set(null);
            this.mReleaseCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> listUnmodifiableList;
        synchronized (this.mSessionLock) {
            listUnmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return listUnmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mSessionLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    public State getState() {
        State state;
        synchronized (this.mSessionLock) {
            state = this.mState;
        }
        return state;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public boolean isInOpenState() {
        boolean z11;
        synchronized (this.mSessionLock) {
            try {
                State state = this.mState;
                z11 = state == State.OPENED || state == State.OPENING;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public int issueBurstCaptureRequest(List<CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            try {
                if (this.mState != State.OPENED) {
                    Logger.m1866d(TAG, "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    CameraBurstCaptureCallback cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                    ArrayList arrayList = new ArrayList();
                    Logger.m1866d(TAG, "Issuing capture request.");
                    boolean z11 = false;
                    for (CaptureConfig captureConfig : list) {
                        if (!captureConfig.getSurfaces().isEmpty()) {
                            Iterator<DeferrableSurface> it = captureConfig.getSurfaces().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    if (captureConfig.getTemplateType() == 2) {
                                        z11 = true;
                                    }
                                    CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
                                    if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                                        builderFrom.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                                    }
                                    SessionConfig sessionConfig = this.mSessionConfig;
                                    if (sessionConfig != null) {
                                        builderFrom.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                                    }
                                    builderFrom.addImplementationOptions(captureConfig.getImplementationOptions());
                                    CaptureRequest captureRequestBuild = Camera2CaptureRequestBuilder.build(builderFrom.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, false, this.mTemplateParamsOverride);
                                    if (captureRequestBuild != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator<CameraCaptureCallback> it2 = captureConfig.getCameraCaptureCallbacks().iterator();
                                        while (it2.hasNext()) {
                                            CaptureCallbackConverter.toCaptureCallback(it2.next(), arrayList2);
                                        }
                                        cameraBurstCaptureCallback.addCamera2Callbacks(captureRequestBuild, arrayList2);
                                        arrayList.add(captureRequestBuild);
                                        break;
                                    }
                                    Logger.m1866d(TAG, "Skipping issuing request without surface.");
                                    return -1;
                                }
                                DeferrableSurface next = it.next();
                                if (!this.mConfiguredSurfaceMap.containsKey(next)) {
                                    Logger.m1866d(TAG, "Skipping capture request with invalid surface: " + next);
                                    break;
                                }
                            }
                        } else {
                            Logger.m1866d(TAG, "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Logger.m1866d(TAG, "Skipping issuing burst request due to no valid request elements");
                        return -1;
                    }
                    if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z11)) {
                        this.mSynchronizedCaptureSession.stopRepeating();
                        cameraBurstCaptureCallback.setCaptureSequenceCallback(new CameraBurstCaptureCallback.CaptureSequenceCallback() { // from class: androidx.camera.camera2.internal.i2
                            @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
                            public final void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i11, boolean z12) {
                                CaptureSession.m1720d(this.f1364a, cameraCaptureSession, i11, z12);
                            }
                        });
                    }
                    if (this.mTorchStateReset.isTorchResetRequired(arrayList, z11)) {
                        cameraBurstCaptureCallback.addCamera2Callbacks(arrayList.get(arrayList.size() - 1), Collections.singletonList(new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession.2
                            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                                synchronized (CaptureSession.this.mSessionLock) {
                                    try {
                                        SessionConfig sessionConfig2 = CaptureSession.this.mSessionConfig;
                                        if (sessionConfig2 == null) {
                                            return;
                                        }
                                        CaptureConfig repeatingCaptureConfig = sessionConfig2.getRepeatingCaptureConfig();
                                        Logger.m1866d(CaptureSession.TAG, "Submit FLASH_MODE_OFF request");
                                        CaptureSession captureSession = CaptureSession.this;
                                        captureSession.issueCaptureRequests(Collections.singletonList(captureSession.mTorchStateReset.createTorchResetRequest(repeatingCaptureConfig)));
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }));
                    }
                    if (this.mCaptureRequestConfigurator != null) {
                        Iterator<CaptureRequest> it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            this.mCaptureRequestConfigurator.configureWith(it3.next());
                        }
                    }
                    SessionConfig sessionConfig2 = this.mSessionConfig;
                    if (sessionConfig2 == null || sessionConfig2.getSessionType() != 1) {
                        return this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
                    }
                    return captureHighSpeedBurst(arrayList, cameraBurstCaptureCallback);
                } catch (CameraAccessException e11) {
                    Logger.m1868e(TAG, "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(List<CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            try {
                switch (this.mState) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.mCaptureConfigs.addAll(list);
                        break;
                    case OPENED:
                        this.mCaptureConfigs.addAll(list);
                        issuePendingCaptureRequest();
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("mSessionLock")
    public void issuePendingCaptureRequest() {
        this.mRequestMonitor.getRequestsProcessedFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.l2
            @Override // java.lang.Runnable
            public final void run() {
                CaptureSession.m1717a(this.f1394b);
            }
        }, CameraXExecutors.directExecutor());
    }

    public int issueRepeatingCaptureRequests(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            try {
                if (sessionConfig == null) {
                    Logger.m1866d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return -1;
                }
                if (this.mState != State.OPENED) {
                    Logger.m1866d(TAG, "Skipping issueRepeatingCaptureRequests due to session closed");
                    return -1;
                }
                CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
                if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                    Logger.m1866d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.mSynchronizedCaptureSession.stopRepeating();
                    } catch (CameraAccessException e11) {
                        Logger.m1868e(TAG, "Unable to access camera: " + e11.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    Logger.m1866d(TAG, "Issuing request for session.");
                    CaptureRequest captureRequestBuild = Camera2CaptureRequestBuilder.build(repeatingCaptureConfig, this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, true, this.mTemplateParamsOverride);
                    if (captureRequestBuild == null) {
                        Logger.m1866d(TAG, "Skipping issuing empty request for session.");
                        return -1;
                    }
                    CameraCaptureSession.CaptureCallback captureCallbackCreateMonitorListener = this.mRequestMonitor.createMonitorListener(createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), new CameraCaptureSession.CaptureCallback[0]));
                    Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator = this.mCaptureRequestConfigurator;
                    if (camera2CaptureRequestConfigurator != null) {
                        camera2CaptureRequestConfigurator.configureWith(captureRequestBuild);
                    }
                    if (sessionConfig.getSessionType() != 1) {
                        return this.mSynchronizedCaptureSession.setSingleRepeatingRequest(captureRequestBuild, captureCallbackCreateMonitorListener);
                    }
                    return this.mSynchronizedCaptureSession.setRepeatingBurstRequests(this.mSynchronizedCaptureSession.createHighSpeedRequestList(captureRequestBuild), captureCallbackCreateMonitorListener);
                } catch (CameraAccessException e12) {
                    Logger.m1868e(TAG, "Unable to access camera: " + e12.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public ListenableFuture<Void> open(final SessionConfig sessionConfig, final CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        synchronized (this.mSessionLock) {
            try {
                if (this.mState.ordinal() == 2) {
                    setState(State.GET_SURFACE);
                    ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
                    this.mConfiguredDeferrableSurfaces = arrayList;
                    this.mSessionOpener = opener;
                    FutureChain futureChainTransformAsync = FutureChain.from(opener.startWithDeferrableSurface(arrayList, 5000L)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.k2
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final ListenableFuture apply(Object obj) {
                            return this.f1383a.openCaptureSession((List) obj, sessionConfig, cameraDevice);
                        }
                    }, this.mSessionOpener.getExecutor());
                    Futures.addCallback(futureChainTransformAsync, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.CaptureSession.1
                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public void onSuccess(Void r11) {
                        }

                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public void onFailure(Throwable th2) {
                            synchronized (CaptureSession.this.mSessionLock) {
                                try {
                                    CaptureSession.this.mSessionOpener.stop();
                                    int iOrdinal = CaptureSession.this.mState.ordinal();
                                    if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th2 instanceof CancellationException)) {
                                        Logger.m1873w(CaptureSession.TAG, "Opening session with fail " + CaptureSession.this.mState, th2);
                                        CaptureSession.this.finishClose();
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                    }, this.mSessionOpener.getExecutor());
                    return Futures.nonCancellationPropagating(futureChainTransformAsync);
                }
                Logger.m1868e(TAG, "Open not allowed in state: " + this.mState);
                return Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.mState));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ad), top: B:38:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ad), top: B:38:0x0003, inners: #0 }] */
    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public ListenableFuture<Void> release(boolean z11) {
        synchronized (this.mSessionLock) {
            int iOrdinal = this.mState.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("release() should not be possible in state: " + this.mState);
            }
            switch (iOrdinal) {
                case 2:
                    setState(State.RELEASED);
                    return Futures.immediateFuture(null);
                case 3:
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                    setState(State.RELEASED);
                    return Futures.immediateFuture(null);
                case 4:
                    if (this.mReleaseFuture == null) {
                        this.mReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.j2
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return CaptureSession.m1718b(this.f1372a, completer);
                            }
                        });
                    }
                    return this.mReleaseFuture;
                case 5:
                case 7:
                    SynchronizedCaptureSession synchronizedCaptureSession = this.mSynchronizedCaptureSession;
                    if (synchronizedCaptureSession != null) {
                        if (z11) {
                            try {
                                synchronizedCaptureSession.abortCaptures();
                            } catch (CameraAccessException e11) {
                                Logger.m1869e(TAG, "Unable to abort captures.", e11);
                            }
                        }
                        this.mSynchronizedCaptureSession.close();
                        break;
                    }
                    setState(State.RELEASING);
                    this.mRequestMonitor.stop();
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    if (this.mSessionOpener.stop()) {
                        finishClose();
                        return Futures.immediateFuture(null);
                    }
                    if (this.mReleaseFuture == null) {
                        this.mReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.j2
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return CaptureSession.m1718b(this.f1372a, completer);
                            }
                        });
                    }
                    return this.mReleaseFuture;
                case 6:
                    setState(State.RELEASING);
                    this.mRequestMonitor.stop();
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    if (this.mSessionOpener.stop()) {
                        finishClose();
                        return Futures.immediateFuture(null);
                    }
                    if (this.mReleaseFuture == null) {
                        this.mReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.j2
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return CaptureSession.m1718b(this.f1372a, completer);
                            }
                        });
                    }
                    return this.mReleaseFuture;
                default:
                    return Futures.immediateFuture(null);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            try {
                switch (this.mState) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.mState);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.mSessionConfig = sessionConfig;
                        break;
                    case OPENED:
                        this.mSessionConfig = sessionConfig;
                        if (sessionConfig == null) {
                            return;
                        }
                        if (!this.mConfiguredSurfaceMap.keySet().containsAll(sessionConfig.getSurfaces())) {
                            Logger.m1868e(TAG, "Does not have the proper configured lists");
                            return;
                        } else {
                            Logger.m1866d(TAG, "Attempting to submit CaptureRequest after setting");
                            issueRepeatingCaptureRequests(this.mSessionConfig);
                        }
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(Map<DeferrableSurface, Long> map) {
        synchronized (this.mSessionLock) {
            this.mStreamUseCaseMap = map;
        }
    }

    public void stopRepeating() {
        synchronized (this.mSessionLock) {
            if (this.mState == State.OPENED) {
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e11) {
                    Logger.m1869e(TAG, "Unable to stop repeating.", e11);
                }
            } else {
                Logger.m1868e(TAG, "Unable to stop repeating. Incorrect state:" + this.mState);
            }
        }
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, Quirks quirks) {
        this(dynamicRangesCompat, quirks, false, null);
    }

    private OutputConfigurationCompat getOutputConfigurationCompat(SessionConfig.OutputConfig outputConfig, Map<DeferrableSurface, Surface> map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfiles;
        Surface surface = map.get(outputConfig.getSurface());
        Preconditions.checkNotNull(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        OutputConfigurationCompat outputConfigurationCompat = new OutputConfigurationCompat(outputConfig.getSurfaceGroupId(), surface);
        if (str != null) {
            outputConfigurationCompat.setPhysicalCameraId(str);
        } else {
            outputConfigurationCompat.setPhysicalCameraId(outputConfig.getPhysicalCameraId());
        }
        if (outputConfig.getMirrorMode() == 0) {
            outputConfigurationCompat.setMirrorMode(1);
        } else if (outputConfig.getMirrorMode() == 1) {
            outputConfigurationCompat.setMirrorMode(2);
        }
        if (!outputConfig.getSharedSurfaces().isEmpty()) {
            outputConfigurationCompat.enableSurfaceSharing();
            Iterator<DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                Preconditions.checkNotNull(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                outputConfigurationCompat.addSurface(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfiles = this.mDynamicRangesCompat.toDynamicRangeProfiles()) != null) {
            DynamicRange dynamicRange = outputConfig.getDynamicRange();
            Long lDynamicRangeToFirstSupportedProfile = DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
            if (lDynamicRangeToFirstSupportedProfile == null) {
                Logger.m1868e(TAG, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRange);
                jLongValue = 1;
            } else {
                jLongValue = lDynamicRangeToFirstSupportedProfile.longValue();
            }
        } else {
            jLongValue = 1;
        }
        outputConfigurationCompat.setDynamicRangeProfile(jLongValue);
        return outputConfigurationCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mSessionLock")
    public void setState(State state) {
        if (state.ordinal() > this.mHighestState.ordinal()) {
            this.mHighestState = state;
        }
        this.mState = state;
        if (Trace.isEnabled() && this.mHighestState.ordinal() >= State.GET_SURFACE.ordinal()) {
            Trace.setCounter("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", state.ordinal());
        }
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, boolean z11, Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator) {
        this(dynamicRangesCompat, new Quirks(Collections.EMPTY_LIST), z11, camera2CaptureRequestConfigurator);
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, Quirks quirks, Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator) {
        this(dynamicRangesCompat, quirks, false, camera2CaptureRequestConfigurator);
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, Quirks quirks, boolean z11, Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator) {
        this.mSessionLock = new Object();
        this.mCaptureConfigs = new ArrayList();
        this.mConfiguredSurfaceMap = new HashMap();
        this.mConfiguredDeferrableSurfaces = Collections.EMPTY_LIST;
        State state = State.UNINITIALIZED;
        this.mHighestState = state;
        this.mState = state;
        this.mStreamUseCaseMap = new HashMap();
        this.mStillCaptureFlow = new StillCaptureFlow();
        this.mTorchStateReset = new TorchStateReset();
        setState(State.INITIALIZED);
        this.mDynamicRangesCompat = dynamicRangesCompat;
        this.mCaptureSessionStateCallback = new StateCallback();
        this.mRequestMonitor = new RequestMonitor(quirks.contains(CaptureNoResponseQuirk.class));
        this.mTemplateParamsOverride = new TemplateParamsOverride(quirks);
        this.mCanUseMultiResolutionImageReader = z11;
        this.mCaptureRequestConfigurator = camera2CaptureRequestConfigurator;
    }
}
