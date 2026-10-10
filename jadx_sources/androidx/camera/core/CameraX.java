package androidx.camera.core;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraProviderExecutionState;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.StreamSpecsCalculator;
import androidx.camera.core.internal.StreamSpecsCalculatorImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.HandlerCompat;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.bugly.proguard.C33556b3;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalRetryPolicy.class})
@MainThread
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CameraX {
    private static final String RETRY_TOKEN = "retry_token";
    private static final String TAG = "CameraX";
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    private final CameraPresenceProvider mCameraPresenceProvider;
    final CameraRepository mCameraRepository;
    private CameraUseCaseAdapterProvider mCameraUseCaseAdapterProvider;
    private final CameraXConfig mCameraXConfig;
    private final int mConfigImplType;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private final ListenableFuture<Void> mInitInternalFuture;

    @GuardedBy("mInitializeLock")
    private InternalInitState mInitState;
    private final Object mInitializeLock;
    private final Integer mMinLogLevel;
    private final RetryPolicy mRetryPolicy;
    private final Handler mSchedulerHandler;
    private final HandlerThread mSchedulerThread;

    @GuardedBy("mInitializeLock")
    private ListenableFuture<Void> mShutdownInternalFuture;
    private StreamSpecsCalculator mStreamSpecsCalculator;
    private CameraDeviceSurfaceManager mSurfaceManager;
    private static final Object MIN_LOG_LEVEL_LOCK = new Object();

    @GuardedBy("MIN_LOG_LEVEL_LOCK")
    private static final SparseArray<Integer> sMinLogLevelReferenceCountMap = new SparseArray<>();

    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraX(Context context, CameraXConfig.Provider provider) {
        this(context, provider, new QuirkSettingsLoader());
    }

    @VisibleForTesting
    public CameraX(Context context, CameraXConfig.Provider provider, Function<Context, QuirkSettings> function) {
        this.mCameraRepository = new CameraRepository();
        this.mInitializeLock = new Object();
        this.mInitState = InternalInitState.UNINITIALIZED;
        this.mShutdownInternalFuture = Futures.immediateFuture(null);
        if (provider != null) {
            this.mCameraXConfig = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.mCameraXConfig = configProvider.getCameraXConfig();
        }
        updateQuirkSettings(context, this.mCameraXConfig.getQuirkSettings(), function);
        this.mConfigImplType = this.mCameraXConfig.getConfigImplType();
        Executor cameraExecutor = this.mCameraXConfig.getCameraExecutor(null);
        Handler schedulerHandler = this.mCameraXConfig.getSchedulerHandler(null);
        cameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        this.mCameraExecutor = cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = HandlerCompat.createAsync(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        Integer num = (Integer) this.mCameraXConfig.retrieveOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mRetryPolicy = new RetryPolicy.Builder(this.mCameraXConfig.getCameraProviderInitRetryPolicy()).build();
        this.mCameraPresenceProvider = new CameraPresenceProvider(cameraExecutor);
        this.mInitInternalFuture = initInternal(context);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0136  */
    /* JADX WARN: Code duplicated, block: B:39:0x0170 A[Catch: all -> 0x01cc, TryCatch #4 {all -> 0x01cc, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:57:0x01cb, B:41:0x0173, B:42:0x0177), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x017e A[Catch: all -> 0x01cc, TryCatch #4 {all -> 0x01cc, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:57:0x01cb, B:41:0x0173, B:42:0x0177), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0185 A[Catch: all -> 0x01cc, TryCatch #4 {all -> 0x01cc, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:57:0x01cb, B:41:0x0173, B:42:0x0177), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0189 A[Catch: all -> 0x01cc, TryCatch #4 {all -> 0x01cc, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:57:0x01cb, B:41:0x0173, B:42:0x0177), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b5 A[Catch: all -> 0x01cc, TryCatch #4 {all -> 0x01cc, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:57:0x01cb, B:41:0x0173, B:42:0x0177), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b9 A[Catch: all -> 0x01cc, TryCatch #4 {all -> 0x01cc, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:57:0x01cb, B:41:0x0173, B:42:0x0177), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01bd A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #4 {all -> 0x01cc, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:57:0x01cb, B:41:0x0173, B:42:0x0177), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0189, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1845a(final CameraX cameraX, Context context, final Executor executor, final int i11, final CallbackToFutureAdapter.Completer completer, final long j11) {
        RetryPolicy.RetryConfig retryConfigOnRetryDecisionRequested;
        cameraX.getClass();
        Trace.beginSection("CX:initAndRetryRecursively");
        final Context applicationContext = ContextUtil.getApplicationContext(context);
        try {
            try {
                CameraFactory.Provider cameraFactoryProvider = cameraX.mCameraXConfig.getCameraFactoryProvider(null);
                if (cameraFactoryProvider == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                CameraThreadConfig cameraThreadConfigCreate = CameraThreadConfig.create(cameraX.mCameraExecutor, cameraX.mSchedulerHandler);
                CameraSelector availableCamerasLimiter = cameraX.mCameraXConfig.getAvailableCamerasLimiter(null);
                long cameraOpenRetryMaxTimeoutInMillisWhileResuming = cameraX.mCameraXConfig.getCameraOpenRetryMaxTimeoutInMillisWhileResuming();
                UseCaseConfigFactory.Provider useCaseConfigFactoryProvider = cameraX.mCameraXConfig.getUseCaseConfigFactoryProvider(null);
                if (useCaseConfigFactoryProvider == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                cameraX.mDefaultConfigFactory = useCaseConfigFactoryProvider.newInstance(applicationContext);
                StreamSpecsCalculatorImpl streamSpecsCalculatorImpl = new StreamSpecsCalculatorImpl(cameraX.mDefaultConfigFactory, null);
                cameraX.mStreamSpecsCalculator = streamSpecsCalculatorImpl;
                cameraX.mCameraFactory = cameraFactoryProvider.newInstance(applicationContext, cameraThreadConfigCreate, availableCamerasLimiter, cameraOpenRetryMaxTimeoutInMillisWhileResuming, cameraX.mCameraXConfig, streamSpecsCalculatorImpl);
                CameraDeviceSurfaceManager.Provider deviceSurfaceManagerProvider = cameraX.mCameraXConfig.getDeviceSurfaceManagerProvider(null);
                if (deviceSurfaceManagerProvider == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                CameraDeviceSurfaceManager cameraDeviceSurfaceManagerNewInstance = deviceSurfaceManagerProvider.newInstance(applicationContext, cameraX.mCameraFactory.getCameraManager(), cameraX.mCameraFactory.getAvailableCameraIds());
                cameraX.mSurfaceManager = cameraDeviceSurfaceManagerNewInstance;
                cameraX.mStreamSpecsCalculator.setCameraDeviceSurfaceManager(cameraDeviceSurfaceManagerNewInstance);
                if (executor instanceof CameraExecutor) {
                    ((CameraExecutor) executor).init(cameraX.mCameraFactory);
                }
                cameraX.mCameraRepository.init(cameraX.mCameraFactory);
                CameraCoordinator cameraCoordinator = cameraX.mCameraFactory.getCameraCoordinator();
                cameraCoordinator.init(cameraX.mCameraRepository);
                cameraX.mCameraUseCaseAdapterProvider = new CameraUseCaseAdapterProviderImpl(cameraX.mCameraRepository, cameraCoordinator, cameraX.mDefaultConfigFactory, cameraX.mStreamSpecsCalculator);
                Iterator<CameraInternal> it = cameraX.mCameraRepository.getCameras().iterator();
                while (it.hasNext()) {
                    it.next().getCameraInfoInternal().setCameraUseCaseAdapterProvider(cameraX.mCameraUseCaseAdapterProvider);
                }
                cameraX.mCameraPresenceProvider.startup(cameraX.mCameraFactory, cameraX.mCameraRepository);
                cameraX.mCameraPresenceProvider.addDependentInternalListener(cameraX.mSurfaceManager);
                cameraX.mCameraPresenceProvider.addDependentInternalListener(cameraX.mCameraFactory.getCameraCoordinator());
                CameraValidator.validateCameras(applicationContext, cameraX.mCameraRepository, availableCamerasLimiter);
                if (i11 > 1) {
                    cameraX.traceExecutionState(null);
                }
                cameraX.setStateToInitialized();
                completer.set(null);
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (InitializationException e11) {
            e = e11;
            CameraProviderExecutionState cameraProviderExecutionState = new CameraProviderExecutionState(j11, i11, e);
            retryConfigOnRetryDecisionRequested = cameraX.mRetryPolicy.onRetryDecisionRequested(cameraProviderExecutionState);
            cameraX.traceExecutionState(cameraProviderExecutionState);
            cameraX.mCameraPresenceProvider.shutdown();
            if (retryConfigOnRetryDecisionRequested.shouldRetry() || i11 >= Integer.MAX_VALUE) {
                synchronized (cameraX.mInitializeLock) {
                    cameraX.mInitState = InternalInitState.INITIALIZING_ERROR;
                }
                if (retryConfigOnRetryDecisionRequested.shouldCompleteWithoutFailure()) {
                    cameraX.setStateToInitialized();
                    completer.set(null);
                } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount();
                    Logger.m1869e(TAG, str, e);
                    completer.setException(new InitializationException(new CameraUnavailableException(3, str)));
                } else if (e instanceof InitializationException) {
                    completer.setException(e);
                } else {
                    completer.setException(new InitializationException(e));
                }
            } else {
                Logger.m1873w(TAG, "Retry init. Start time " + j11 + " current time " + SystemClock.elapsedRealtime(), e);
                HandlerCompat.postDelayed(cameraX.mSchedulerHandler, new Runnable() { // from class: androidx.camera.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1590b.initAndRetryRecursively(executor, j11, i11 + 1, applicationContext, completer);
                    }
                }, RETRY_TOKEN, retryConfigOnRetryDecisionRequested.getRetryDelayInMillis());
            }
            Trace.endSection();
        } catch (CameraValidator.CameraIdListIncorrectException e12) {
            e = e12;
            CameraProviderExecutionState cameraProviderExecutionState2 = new CameraProviderExecutionState(j11, i11, e);
            retryConfigOnRetryDecisionRequested = cameraX.mRetryPolicy.onRetryDecisionRequested(cameraProviderExecutionState2);
            cameraX.traceExecutionState(cameraProviderExecutionState2);
            cameraX.mCameraPresenceProvider.shutdown();
            if (retryConfigOnRetryDecisionRequested.shouldRetry()) {
                synchronized (cameraX.mInitializeLock) {
                    cameraX.mInitState = InternalInitState.INITIALIZING_ERROR;
                    if (retryConfigOnRetryDecisionRequested.shouldCompleteWithoutFailure()) {
                        cameraX.setStateToInitialized();
                        completer.set(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount();
                        Logger.m1869e(TAG, str2, e);
                        completer.setException(new InitializationException(new CameraUnavailableException(3, str2)));
                    } else if (e instanceof InitializationException) {
                        completer.setException(e);
                    } else {
                        completer.setException(new InitializationException(e));
                    }
                }
            } else {
                synchronized (cameraX.mInitializeLock) {
                    cameraX.mInitState = InternalInitState.INITIALIZING_ERROR;
                    if (retryConfigOnRetryDecisionRequested.shouldCompleteWithoutFailure()) {
                        cameraX.setStateToInitialized();
                        completer.set(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount();
                        Logger.m1869e(TAG, str3, e);
                        completer.setException(new InitializationException(new CameraUnavailableException(3, str3)));
                    } else if (e instanceof InitializationException) {
                        completer.setException(e);
                    } else {
                        completer.setException(new InitializationException(e));
                    }
                }
            }
            Trace.endSection();
        } catch (RuntimeException e13) {
            e = e13;
            CameraProviderExecutionState cameraProviderExecutionState3 = new CameraProviderExecutionState(j11, i11, e);
            retryConfigOnRetryDecisionRequested = cameraX.mRetryPolicy.onRetryDecisionRequested(cameraProviderExecutionState3);
            cameraX.traceExecutionState(cameraProviderExecutionState3);
            cameraX.mCameraPresenceProvider.shutdown();
            if (retryConfigOnRetryDecisionRequested.shouldRetry()) {
                synchronized (cameraX.mInitializeLock) {
                    cameraX.mInitState = InternalInitState.INITIALIZING_ERROR;
                    if (retryConfigOnRetryDecisionRequested.shouldCompleteWithoutFailure()) {
                        cameraX.setStateToInitialized();
                        completer.set(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount();
                        Logger.m1869e(TAG, str4, e);
                        completer.setException(new InitializationException(new CameraUnavailableException(3, str4)));
                    } else if (e instanceof InitializationException) {
                        completer.setException(e);
                    } else {
                        completer.setException(new InitializationException(e));
                    }
                }
            } else {
                synchronized (cameraX.mInitializeLock) {
                    cameraX.mInitState = InternalInitState.INITIALIZING_ERROR;
                    if (retryConfigOnRetryDecisionRequested.shouldCompleteWithoutFailure()) {
                        cameraX.setStateToInitialized();
                        completer.set(null);
                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                        String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount();
                        Logger.m1869e(TAG, str5, e);
                        completer.setException(new InitializationException(new CameraUnavailableException(3, str5)));
                    } else if (e instanceof InitializationException) {
                        completer.setException(e);
                    } else {
                        completer.setException(new InitializationException(e));
                    }
                }
            }
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1846b(CameraX cameraX, CallbackToFutureAdapter.Completer completer) {
        cameraX.mCameraFactory.shutdown();
        if (cameraX.mSchedulerThread != null) {
            Executor executor = cameraX.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            cameraX.mSchedulerThread.quit();
        }
        completer.set(null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m1847c(CameraX cameraX, Context context, CallbackToFutureAdapter.Completer completer) {
        cameraX.initAndRetryRecursively(cameraX.mCameraExecutor, SystemClock.elapsedRealtime(), 1, context, completer);
        return "CameraX initInternal";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m1848d(final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) {
        cameraX.mCameraPresenceProvider.shutdown();
        cameraX.mCameraRepository.deinit().addListener(new Runnable() { // from class: androidx.camera.core.f
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.m1846b(this.f1581b, completer);
            }
        }, cameraX.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    private static void decreaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
                int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                updateOrResetMinLogLevel();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static CameraXConfig.Provider getConfigProvider(Context context) {
        ComponentCallbacks2 applicationFromContext = ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            Bundle bundle = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, (Class<?>) MetadataHolderService.class), C33556b3.f69051i).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (CameraXConfig.Provider) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            Logger.m1868e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            Logger.m1869e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e12) {
            e = e12;
            Logger.m1869e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e13) {
            e = e13;
            Logger.m1869e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e14) {
            e = e14;
            Logger.m1869e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e15) {
            e = e15;
            Logger.m1869e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e16) {
            e = e16;
            Logger.m1869e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e17) {
            e = e17;
            Logger.m1869e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void increaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            try {
                if (num == null) {
                    return;
                }
                Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                updateOrResetMinLogLevel();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAndRetryRecursively(final Executor executor, final long j11, final int i11, final Context context, final CallbackToFutureAdapter.Completer<Void> completer) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.h
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.m1845a(this.f1598b, context, executor, i11, completer, j11);
            }
        });
    }

    private ListenableFuture<Void> initInternal(final Context context) {
        ListenableFuture<Void> future;
        synchronized (this.mInitializeLock) {
            Preconditions.checkState(this.mInitState == InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.mInitState = InternalInitState.INITIALIZING;
            future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.i
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return CameraX.m1847c(this.f1606a, context, completer);
                }
            });
        }
        return future;
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    private ListenableFuture<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            try {
                this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
                int iOrdinal = this.mInitState.ordinal();
                if (iOrdinal == 0) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    return Futures.immediateFuture(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    decreaseMinLogLevelReference(this.mMinLogLevel);
                    this.mShutdownInternalFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.j
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return CameraX.m1848d(this.f1740a, completer);
                        }
                    });
                }
                return this.mShutdownInternalFuture;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("MIN_LOG_LEVEL_LOCK")
    private static void updateOrResetMinLogLevel() {
        SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            Logger.resetMinLogLevel();
            return;
        }
        if (sparseArray.get(3) != null) {
            Logger.setMinLogLevel(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            Logger.setMinLogLevel(6);
        }
    }

    private static void updateQuirkSettings(Context context, QuirkSettings quirkSettings, Function<Context, QuirkSettings> function) {
        if (quirkSettings != null) {
            Logger.m1866d(TAG, "QuirkSettings from CameraXConfig: " + quirkSettings);
        } else {
            quirkSettings = function.apply(context);
            Logger.m1866d(TAG, "QuirkSettings from app metadata: " + quirkSettings);
        }
        if (quirkSettings == null) {
            quirkSettings = QuirkSettingsHolder.DEFAULT;
            Logger.m1866d(TAG, "QuirkSettings by default: " + quirkSettings);
        }
        QuirkSettingsHolder.instance().set(quirkSettings);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraPresenceProvider getCameraAvailabilityProvider() {
        return this.mCameraPresenceProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public CameraUseCaseAdapterProvider getCameraUseCaseAdapterProvider() {
        CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider = this.mCameraUseCaseAdapterProvider;
        if (cameraUseCaseAdapterProvider != null) {
            return cameraUseCaseAdapterProvider;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getConfigImplType() {
        return this.mConfigImplType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ListenableFuture<Void> getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpecsCalculator getStreamSpecsCalculator() {
        StreamSpecsCalculator streamSpecsCalculator = this.mStreamSpecsCalculator;
        if (streamSpecsCalculator != null) {
            return streamSpecsCalculator;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public boolean isInitialized() {
        boolean z11;
        synchronized (this.mInitializeLock) {
            z11 = this.mInitState == InternalInitState.INITIALIZED;
        }
        return z11;
    }

    private void traceExecutionState(RetryPolicy.ExecutionState executionState) {
        int status;
        if (Trace.isEnabled()) {
            if (executionState != null) {
                status = executionState.getStatus();
            } else {
                status = -1;
            }
            Trace.setCounter("CX:CameraProvider-RetryStatus", status);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ListenableFuture<Void> shutdown() {
        return shutdownInternal();
    }
}
