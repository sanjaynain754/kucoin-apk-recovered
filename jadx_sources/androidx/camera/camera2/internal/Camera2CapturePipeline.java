package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
class Camera2CapturePipeline {
    private static final String TAG = "Camera2CapturePipeline";
    private final Camera2CameraControlImpl mCameraControl;
    private final Quirks mCameraQuirk;
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private final boolean mIsLegacyDevice;
    private final ScheduledExecutorService mScheduler;
    private int mTemplate = 1;
    private final UseTorchAsFlash mUseTorchAsFlash;

    public static class AePreCaptureTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m1687b(AePreCaptureTask aePreCaptureTask, CallbackToFutureAdapter.Completer completer) {
            aePreCaptureTask.mCameraControl.getFocusMeteringControl().triggerAePrecapture(completer);
            aePreCaptureTask.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.m1866d(Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            if (this.mCameraControl.isLowLightBoostOn() || !Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                return Futures.immediateFuture(Boolean.FALSE);
            }
            Logger.m1866d(Camera2CapturePipeline.TAG, "Trigger AE");
            this.mIsExecuted = true;
            return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.x0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.AePreCaptureTask.m1687b(this.f1515a, completer);
                }
            })).transform(new Function() { // from class: androidx.camera.camera2.internal.y0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, CameraXExecutors.directExecutor());
        }

        public AePreCaptureTask(Camera2CameraControlImpl camera2CameraControlImpl, int i11, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i11;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }
    }

    public static class AfTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.m1866d(Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            ListenableFuture<Boolean> listenableFutureImmediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                Logger.m1866d(Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.m1866d(Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf(null, false);
                }
            }
            return listenableFutureImmediateFuture;
        }

        public AfTask(Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }
    }

    public static class CameraCapturePipelineImpl implements CameraCapturePipeline {
        private final Executor mExecutor;
        private int mFlashMode;
        private final Pipeline mPipelineDelegate;

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Void m1689b(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m1688a(CameraCapturePipelineImpl cameraCapturePipelineImpl, CallbackToFutureAdapter.Completer completer) {
            cameraCapturePipelineImpl.mPipelineDelegate.executePostCapture();
            completer.set(null);
            return "invokePostCaptureFuture";
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public ListenableFuture<Void> invokePostCapture() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.z0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.CameraCapturePipelineImpl.m1688a(this.f1535a, completer);
                }
            });
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public ListenableFuture<Void> invokePreCapture() {
            Logger.m1866d(Camera2CapturePipeline.TAG, "invokePreCapture");
            return FutureChain.from(this.mPipelineDelegate.executePreCapture(this.mFlashMode)).transform(new Function() { // from class: androidx.camera.camera2.internal.a1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Camera2CapturePipeline.CameraCapturePipelineImpl.m1689b((TotalCaptureResult) obj);
                }
            }, this.mExecutor);
        }

        public CameraCapturePipelineImpl(Pipeline pipeline, Executor executor, int i11) {
            this.mPipelineDelegate = pipeline;
            this.mExecutor = executor;
            this.mFlashMode = i11;
        }
    }

    @VisibleForTesting
    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final ScheduledExecutorService mScheduler;
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;
        final List<PipelineTask> mTasks = new ArrayList();
        private final PipelineTask mPipelineSubTask = new C06981();

        /* JADX INFO: renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1 */
        public class C06981 implements PipelineTask {
            public C06981() {
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    if (it.next().isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    it.next().postCapture();
                }
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().preCapture(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new Function() { // from class: androidx.camera.camera2.internal.h1
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, CameraXExecutors.directExecutor());
            }
        }

        public ListenableFuture<TotalCaptureResult> executePreCapture(final int i11) {
            ListenableFuture<TotalCaptureResult> listenableFutureImmediateFuture = Futures.immediateFuture(null);
            if (this.mTasks.isEmpty()) {
                return listenableFutureImmediateFuture;
            }
            return FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? Camera2CapturePipeline.waitForResult(this.mCameraControl, null) : Futures.immediateFuture(null)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.e1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.Pipeline.m1690a(this.f1337a, i11, (TotalCaptureResult) obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.f1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.Pipeline.m1693d(this.f1343a, (Boolean) obj);
                }
            }, this.mExecutor);
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
            CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5L);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ListenableFuture m1690a(Pipeline pipeline, int i11, TotalCaptureResult totalCaptureResult) {
            if (!pipeline.mCameraControl.isLowLightBoostOn() && Camera2CapturePipeline.isFlashRequired(i11, totalCaptureResult)) {
                pipeline.setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return pipeline.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        @OptIn(markerClass = {ExperimentalCamera2Interop.class})
        private void applyAeModeQuirk(CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private void applyStillCaptureTemplate(CaptureConfig.Builder builder, CaptureConfig captureConfig) {
            int i11;
            if (this.mTemplate != 3 || this.mIsLegacyDevice) {
                i11 = (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1;
            } else {
                i11 = 4;
            }
            if (i11 != -1) {
                builder.setTemplateType(i11);
            }
            Logger.m1866d(Camera2CapturePipeline.TAG, "applyStillCaptureTemplate: templateToModify = " + i11);
        }

        private void setTimeout3A(long j11) {
            this.mTimeout3A = j11;
        }

        public void addTask(PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        public void executePostCapture() {
            this.mPipelineSubTask.postCapture();
        }

        public ListenableFuture<List<Void>> submitConfigsInternal(List<CaptureConfig> list, int i11) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureConfig captureConfig : list) {
                final CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
                CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult = null;
                if (captureConfig.getTemplateType() == 5 && !this.mCameraControl.getZslControl().isZslDisabledByFlashMode() && !this.mCameraControl.getZslControl().isZslDisabledByUserCaseConfig()) {
                    ImageProxy imageProxyDequeueImageFromBuffer = this.mCameraControl.getZslControl().dequeueImageFromBuffer();
                    if (imageProxyDequeueImageFromBuffer != null) {
                        if (this.mCameraControl.getZslControl().enqueueImageToImageWriter(imageProxyDequeueImageFromBuffer)) {
                            cameraCaptureResultRetrieveCameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(imageProxyDequeueImageFromBuffer.getImageInfo());
                        } else {
                            Logger.m1868e(Camera2CapturePipeline.TAG, "Failed to enqueue image to image writer");
                        }
                        if (cameraCaptureResultRetrieveCameraCaptureResult == null) {
                            imageProxyDequeueImageFromBuffer.close();
                        }
                    } else {
                        Logger.m1866d(Camera2CapturePipeline.TAG, "ZSL capture skipped due to no valid buffer image");
                    }
                }
                if (cameraCaptureResultRetrieveCameraCaptureResult != null) {
                    builderFrom.setCameraCaptureResult(cameraCaptureResultRetrieveCameraCaptureResult);
                } else {
                    applyStillCaptureTemplate(builderFrom, captureConfig);
                }
                if (this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i11)) {
                    applyAeModeQuirk(builderFrom);
                }
                arrayList.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.b1
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CapturePipeline.Pipeline.m1694e(this.f1243a, builderFrom, completer);
                    }
                }));
                arrayList2.add(builderFrom.build());
            }
            this.mCameraControl.submitCaptureRequestsInternal(arrayList2);
            return Futures.allAsList(arrayList);
        }

        public Pipeline(int i11, Executor executor, ScheduledExecutorService scheduledExecutorService, Camera2CameraControlImpl camera2CameraControlImpl, boolean z11, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i11;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z11;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ ListenableFuture m1693d(Pipeline pipeline, Boolean bool) {
            pipeline.getClass();
            if (Boolean.TRUE.equals(bool)) {
                return Camera2CapturePipeline.waitForResult(pipeline.mTimeout3A, pipeline.mScheduler, pipeline.mCameraControl, new ResultListener.Checker() { // from class: androidx.camera.camera2.internal.g1
                    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                    public final boolean check(TotalCaptureResult totalCaptureResult) {
                        return Camera2CapturePipeline.is3AConverged(totalCaptureResult, false);
                    }
                });
            }
            return Futures.immediateFuture(null);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Object m1694e(Pipeline pipeline, CaptureConfig.Builder builder, final CallbackToFutureAdapter.Completer completer) {
            pipeline.getClass();
            builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCancelled(int i11) {
                    completer.setException(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCompleted(int i11, CameraCaptureResult cameraCaptureResult) {
                    completer.set(null);
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureFailed(int i11, CameraCaptureFailure cameraCaptureFailure) {
                    completer.setException(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
                }
            });
            return "submitStillCapture";
        }

        public ListenableFuture<List<Void>> executeCapture(final List<CaptureConfig> list, final int i11) {
            FutureChain futureChainTransformAsync = FutureChain.from(executePreCapture(i11)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.c1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f1250a.submitConfigsInternal(list, i11);
                }
            }, this.mExecutor);
            futureChainTransformAsync.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.d1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1327b.executePostCapture();
                }
            }, this.mExecutor);
            return futureChainTransformAsync;
        }
    }

    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult);
    }

    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {
        private final Checker mChecker;
        private CallbackToFutureAdapter.Completer<TotalCaptureResult> mCompleter;
        private final ListenableFuture<TotalCaptureResult> mFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.i1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CapturePipeline.ResultListener.m1696a(this.f1363a, completer);
            }
        });

        public interface Checker {
            boolean check(TotalCaptureResult totalCaptureResult);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m1696a(ResultListener resultListener, CallbackToFutureAdapter.Completer completer) {
            resultListener.mCompleter = completer;
            return "waitFor3AResult";
        }

        public ListenableFuture<TotalCaptureResult> getFuture() {
            return this.mFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            Checker checker = this.mChecker;
            if (checker != null && !checker.check(totalCaptureResult)) {
                return false;
            }
            this.mCompleter.set(totalCaptureResult);
            return true;
        }

        public ResultListener(Checker checker) {
            this.mChecker = checker;
        }
    }

    public static class ScreenFlashTask implements PipelineTask {
        private static final long CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final ScheduledExecutorService mScheduler;
        private final ImageCapture.ScreenFlash mScreenFlash;
        private final UseFlashModeTorchFor3aUpdate mUseFlashModeTorchFor3aUpdate;

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m1704h(CallbackToFutureAdapter.Completer completer) {
            Logger.m1866d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: UI change applied");
            completer.set(null);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ Object m1705i(ScreenFlashTask screenFlashTask, CallbackToFutureAdapter.Completer completer) {
            if (!screenFlashTask.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                completer.set(null);
                return "EnableTorchInternal";
            }
            Logger.m1866d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: enable torch");
            screenFlashTask.mCameraControl.enableTorchInternal(2);
            completer.set(null);
            return "EnableTorchInternal";
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ Object m1707k(AtomicReference atomicReference, final CallbackToFutureAdapter.Completer completer) {
            atomicReference.set(new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.camera2.internal.q1
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    Camera2CapturePipeline.ScreenFlashTask.m1704h(completer);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            Logger.m1866d(Camera2CapturePipeline.TAG, "ScreenFlashTask#postCapture");
            if (this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                this.mCameraControl.enableTorchInternal(0);
            }
            this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(false).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.m1
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d(Camera2CapturePipeline.TAG, "enableExternalFlashAeMode disabled");
                }
            }, this.mExecutor);
            this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
            ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
            final ImageCapture.ScreenFlash screenFlash = this.mScreenFlash;
            Objects.requireNonNull(screenFlash);
            scheduledExecutorServiceMainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.n1
                @Override // java.lang.Runnable
                public final void run() {
                    screenFlash.clear();
                }
            });
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            Logger.m1866d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.r1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.m1707k(atomicReference, completer);
                }
            });
            return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.s1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.m1703g(this.f1472a, atomicReference, completer);
                }
            })).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.t1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f1484a.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(true);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.u1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.ScreenFlashTask.m1701e(this.f1493a, (Void) obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.v1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.ScreenFlashTask.m1709m(this.f1500a, future, obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.w1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f1511a.mCameraControl.getFocusMeteringControl().triggerAePrecapture();
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.k1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    Camera2CapturePipeline.ScreenFlashTask screenFlashTask = this.f1382a;
                    return Camera2CapturePipeline.waitForResult(Camera2CapturePipeline.ScreenFlashTask.CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS, screenFlashTask.mScheduler, screenFlashTask.mCameraControl, new Camera2CapturePipeline.ResultListener.Checker() { // from class: androidx.camera.camera2.internal.p1
                        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                        public final boolean check(TotalCaptureResult totalCaptureResult2) {
                            return Camera2CapturePipeline.is3AConverged(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.mExecutor).transform(new Function() { // from class: androidx.camera.camera2.internal.l1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, CameraXExecutors.directExecutor());
        }

        public ScreenFlashTask(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor, ScheduledExecutorService scheduledExecutorService, UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mUseFlashModeTorchFor3aUpdate = useFlashModeTorchFor3aUpdate;
            ImageCapture.ScreenFlash screenFlash = camera2CameraControlImpl.getScreenFlash();
            Objects.requireNonNull(screenFlash);
            this.mScreenFlash = screenFlash;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m1697a(ScreenFlashTask screenFlashTask, AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
            screenFlashTask.getClass();
            Logger.m1866d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            screenFlashTask.mScreenFlash.apply(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (ImageCapture.ScreenFlashListener) atomicReference.get());
            completer.set(null);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ ListenableFuture m1701e(final ScreenFlashTask screenFlashTask, Void r11) {
            screenFlashTask.getClass();
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.j1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.m1705i(this.f1371a, completer);
                }
            });
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ Object m1703g(final ScreenFlashTask screenFlashTask, final AtomicReference atomicReference, final CallbackToFutureAdapter.Completer completer) {
            screenFlashTask.getClass();
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.camera2.internal.o1
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CapturePipeline.ScreenFlashTask.m1697a(this.f1425b, atomicReference, completer);
                }
            });
            return "OnScreenFlashStart";
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ ListenableFuture m1709m(ScreenFlashTask screenFlashTask, ListenableFuture listenableFuture, Object obj) {
            screenFlashTask.getClass();
            return Futures.makeTimeoutFuture(TimeUnit.SECONDS.toMillis(3L), screenFlashTask.mScheduler, null, true, listenableFuture);
        }
    }

    public static class TorchTask implements PipelineTask {
        private static final long CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final ScheduledExecutorService mScheduler;
        private final boolean mTriggerAePrecapture;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ListenableFuture m1710a(TorchTask torchTask, Void r11) {
            return torchTask.mTriggerAePrecapture ? torchTask.mCameraControl.getFocusMeteringControl().triggerAePrecapture() : Futures.immediateFuture(null);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m1711b(TorchTask torchTask, CallbackToFutureAdapter.Completer completer) {
            torchTask.mCameraControl.getTorchControl().enableTorchInternal(completer, 2);
            return "TorchOn";
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().enableTorchInternal(null, 0);
                Logger.m1866d(Camera2CapturePipeline.TAG, "Turning off torch");
                if (this.mTriggerAePrecapture) {
                    this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                }
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            Logger.m1866d(Camera2CapturePipeline.TAG, "TorchTask#preCapture: isFlashRequired = " + Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult));
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (this.mCameraControl.isLowLightBoostOn()) {
                    Logger.m1866d(Camera2CapturePipeline.TAG, "Low-light boost already on, not turn on");
                } else {
                    if (!this.mCameraControl.isTorchOn()) {
                        Logger.m1866d(Camera2CapturePipeline.TAG, "Turn on torch");
                        this.mIsExecuted = true;
                        return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.y1
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return Camera2CapturePipeline.TorchTask.m1711b(this.f1523a, completer);
                            }
                        })).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.z1
                            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                            public final ListenableFuture apply(Object obj) {
                                return Camera2CapturePipeline.TorchTask.m1710a(this.f1536a, (Void) obj);
                            }
                        }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.a2
                            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                            public final ListenableFuture apply(Object obj) {
                                Camera2CapturePipeline.TorchTask torchTask = this.f1233a;
                                return Camera2CapturePipeline.waitForResult(Camera2CapturePipeline.TorchTask.CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS, torchTask.mScheduler, torchTask.mCameraControl, new Camera2CapturePipeline.ResultListener.Checker() { // from class: androidx.camera.camera2.internal.x1
                                    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                                    public final boolean check(TotalCaptureResult totalCaptureResult2) {
                                        return Camera2CapturePipeline.is3AConverged(totalCaptureResult2, true);
                                    }
                                });
                            }
                        }, this.mExecutor).transform(new Function() { // from class: androidx.camera.camera2.internal.b2
                            @Override // androidx.arch.core.util.Function
                            public final Object apply(Object obj) {
                                return Boolean.FALSE;
                            }
                        }, CameraXExecutors.directExecutor());
                    }
                    Logger.m1866d(Camera2CapturePipeline.TAG, "Torch already on, not turn on");
                }
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }

        public TorchTask(Camera2CameraControlImpl camera2CameraControlImpl, int i11, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z11) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i11;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mTriggerAePrecapture = z11;
        }
    }

    public static ListenableFuture<TotalCaptureResult> waitForResult(long j11, ScheduledExecutorService scheduledExecutorService, Camera2CameraControlImpl camera2CameraControlImpl, ResultListener.Checker checker) {
        return Futures.makeTimeoutFuture(TimeUnit.NANOSECONDS.toMillis(j11), scheduledExecutorService, null, true, waitForResult(camera2CameraControlImpl, checker));
    }

    public static boolean is3AConverged(TotalCaptureResult totalCaptureResult, boolean z11) {
        if (totalCaptureResult == null) {
            return false;
        }
        return ConvergenceUtils.is3AConverged(new Camera2CameraCaptureResult(totalCaptureResult), z11);
    }

    public static boolean isFlashRequired(int i11, TotalCaptureResult totalCaptureResult) {
        Logger.m1866d(TAG, "isFlashRequired: flashMode = " + i11);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return false;
                }
                if (i11 != 3) {
                    throw new AssertionError(i11);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        Logger.m1866d(TAG, "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean isTorchAsFlash(int i11) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i11 == 1;
    }

    @VisibleForTesting
    public Pipeline createPipeline(int i11, int i12, int i13) {
        int i14;
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.mCameraQuirk);
        Pipeline pipeline = new Pipeline(this.mTemplate, this.mExecutor, this.mScheduler, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i11 == 0) {
            pipeline.addTask(new AfTask(this.mCameraControl));
        }
        if (i12 != 3) {
            if (this.mHasFlashUnit) {
                if (isTorchAsFlash(i13)) {
                    i14 = i12;
                    pipeline.addTask(new TorchTask(this.mCameraControl, i14, this.mExecutor, this.mScheduler, (this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mCameraControl.isInVideoUsage()) ? false : true));
                } else {
                    i14 = i12;
                    pipeline.addTask(new AePreCaptureTask(this.mCameraControl, i14, overrideAeModeForStillCapture));
                }
            }
            Logger.m1866d(TAG, "createPipeline: captureMode = " + i11 + ", flashMode = " + i14 + ", flashType = " + i13 + ", pipeline tasks = " + pipeline.mTasks);
            return pipeline;
        }
        pipeline.addTask(new ScreenFlashTask(this.mCameraControl, this.mExecutor, this.mScheduler, new UseFlashModeTorchFor3aUpdate(this.mCameraQuirk)));
        i14 = i12;
        Logger.m1866d(TAG, "createPipeline: captureMode = " + i11 + ", flashMode = " + i14 + ", flashType = " + i13 + ", pipeline tasks = " + pipeline.mTasks);
        return pipeline;
    }

    public CameraCapturePipeline getCameraCapturePipeline(int i11, int i12, int i13) {
        return new CameraCapturePipelineImpl(createPipeline(i11, i12, i13), this.mExecutor, i12);
    }

    public void setTemplate(int i11) {
        this.mTemplate = i11;
    }

    public Camera2CapturePipeline(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Quirks quirks, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.mCameraControl = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = num != null && num.intValue() == 2;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new UseTorchAsFlash(quirks);
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(new C0879v0(cameraCharacteristicsCompat));
    }

    public ListenableFuture<List<Void>> submitStillCaptures(List<CaptureConfig> list, int i11, int i12, int i13) {
        return Futures.nonCancellationPropagating(createPipeline(i11, i12, i13).executeCapture(list, i12));
    }

    public static ListenableFuture<TotalCaptureResult> waitForResult(final Camera2CameraControlImpl camera2CameraControlImpl, ResultListener.Checker checker) {
        final ResultListener resultListener = new ResultListener(checker);
        camera2CameraControlImpl.addCaptureResultListener(resultListener);
        ListenableFuture<TotalCaptureResult> future = resultListener.getFuture();
        future.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.w0
            @Override // java.lang.Runnable
            public final void run() {
                camera2CameraControlImpl.removeCaptureResultListener(resultListener);
            }
        }, camera2CameraControlImpl.mExecutor);
        return future;
    }
}
