package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes23.dex */
class SynchronizedCaptureSessionBaseImpl extends SynchronizedCaptureSession.StateCallback implements SynchronizedCaptureSession, SynchronizedCaptureSession.Opener {
    private static final String TAG = "SyncCaptureSessionBase";
    CameraCaptureSessionCompat mCameraCaptureSessionCompat;
    final CaptureSessionRepository mCaptureSessionRepository;
    SynchronizedCaptureSession.StateCallback mCaptureSessionStateCallback;
    final Handler mCompatHandler;
    final Executor mExecutor;

    @GuardedBy("mLock")
    CallbackToFutureAdapter.Completer<Void> mOpenCaptureSessionCompleter;

    @GuardedBy("mLock")
    ListenableFuture<Void> mOpenCaptureSessionFuture;
    private final ScheduledExecutorService mScheduledExecutorService;

    @GuardedBy("mLock")
    private ListenableFuture<List<Surface>> mStartingSurface;
    final Object mLock = new Object();

    @GuardedBy("mLock")
    private List<DeferrableSurface> mHeldDeferrableSurfaces = null;

    @GuardedBy("mLock")
    private boolean mClosed = false;

    @GuardedBy("mLock")
    private boolean mOpenerDisabled = false;

    @GuardedBy("mLock")
    private boolean mSessionFinished = false;

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureSingleRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public ListenableFuture<Void> getOpeningBlocker() {
        return Futures.immediateFuture(null);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setRepeatingBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public boolean stop() {
        boolean z11;
        ListenableFuture<List<Surface>> listenableFuture = null;
        try {
            synchronized (this.mLock) {
                try {
                    if (!this.mOpenerDisabled) {
                        ListenableFuture<List<Surface>> listenableFuture2 = this.mStartingSurface;
                        listenableFuture = listenableFuture2 != null ? listenableFuture2 : null;
                        this.mOpenerDisabled = true;
                    }
                    z11 = !isCameraCaptureSessionOpen();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            return z11;
        } catch (Throwable th3) {
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            throw th3;
        }
    }

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static List<CaptureRequest> createHighSpeedRequestList(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, CaptureRequest captureRequest) throws CameraAccessException {
            return cameraConstrainedHighSpeedCaptureSession.createHighSpeedRequestList(captureRequest);
        }

        public static Surface getInputSurface(CameraCaptureSession cameraCaptureSession) {
            return cameraCaptureSession.getInputSurface();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1758a(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronizedCaptureSessionBaseImpl.mCaptureSessionRepository.onCaptureSessionClosed(synchronizedCaptureSessionBaseImpl);
        synchronizedCaptureSessionBaseImpl.m1762e(synchronizedCaptureSession);
        if (synchronizedCaptureSessionBaseImpl.mCameraCaptureSessionCompat != null) {
            Objects.requireNonNull(synchronizedCaptureSessionBaseImpl.mCaptureSessionStateCallback);
            synchronizedCaptureSessionBaseImpl.mCaptureSessionStateCallback.onClosed(synchronizedCaptureSession);
            return;
        }
        Logger.m1872w(TAG, "[" + synchronizedCaptureSessionBaseImpl + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1759b(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, List list, CameraDeviceCompat cameraDeviceCompat, SessionConfigurationCompat sessionConfigurationCompat, CallbackToFutureAdapter.Completer completer) {
        String str;
        synchronized (synchronizedCaptureSessionBaseImpl.mLock) {
            synchronizedCaptureSessionBaseImpl.holdDeferrableSurfaces(list);
            Preconditions.checkState(synchronizedCaptureSessionBaseImpl.mOpenCaptureSessionCompleter == null, "The openCaptureSessionCompleter can only set once!");
            synchronizedCaptureSessionBaseImpl.mOpenCaptureSessionCompleter = completer;
            cameraDeviceCompat.createCaptureSession(sessionConfigurationCompat);
            str = "openCaptureSession[session=" + synchronizedCaptureSessionBaseImpl + "]";
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1760c(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(synchronizedCaptureSessionBaseImpl.mCaptureSessionStateCallback);
        synchronizedCaptureSessionBaseImpl.mCaptureSessionStateCallback.m1762e(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void abortCaptures() throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCaptureSessionRepository.onCaptureSessionClosing(this);
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().close();
        getExecutor().execute(new Runnable() { // from class: androidx.camera.camera2.internal.a4
            @Override // java.lang.Runnable
            public final void run() {
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = this.f1236b;
                synchronizedCaptureSessionBaseImpl.m1762e(synchronizedCaptureSessionBaseImpl);
            }
        });
    }

    public void createCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        if (this.mCameraCaptureSessionCompat == null) {
            this.mCameraCaptureSessionCompat = CameraCaptureSessionCompat.toCameraCaptureSessionCompat(cameraCaptureSession, this.mCompatHandler);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public List<CaptureRequest> createHighSpeedRequestList(CaptureRequest captureRequest) throws CameraAccessException {
        CameraCaptureSession cameraCaptureSession = ((CameraCaptureSessionCompat) Preconditions.checkNotNull(this.mCameraCaptureSessionCompat)).toCameraCaptureSession();
        return cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? Api23Impl.createHighSpeedRequestList((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public SessionConfigurationCompat createSessionConfigurationCompat(int i11, List<OutputConfigurationCompat> list, SynchronizedCaptureSession.StateCallback stateCallback) {
        this.mCaptureSessionStateCallback = stateCallback;
        return new SessionConfigurationCompat(i11, list, getExecutor(), new CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                CallbackToFutureAdapter.Completer<Void> completer;
                try {
                    SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigureFailed(synchronizedCaptureSessionBaseImpl);
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        Preconditions.checkNotNull(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                        completer = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                } finally {
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        Preconditions.checkNotNull(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                        completer = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        completer.setException(new IllegalStateException("onConfigureFailed"));
                    }
                }
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                CallbackToFutureAdapter.Completer<Void> completer;
                try {
                    SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigured(synchronizedCaptureSessionBaseImpl);
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        Preconditions.checkNotNull(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                        completer = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                } finally {
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        Preconditions.checkNotNull(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                        completer = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        completer.set(null);
                    }
                }
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onActive(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onActive(synchronizedCaptureSessionBaseImpl);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            @RequiresApi(api = 26)
            public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onCaptureQueueEmpty(synchronizedCaptureSessionBaseImpl);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onClosed(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onClosed(synchronizedCaptureSessionBaseImpl);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onReady(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onReady(synchronizedCaptureSessionBaseImpl);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            @RequiresApi(api = 23)
            public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onSurfacePrepared(synchronizedCaptureSessionBaseImpl, surface);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public CameraDevice getDevice() {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.toCameraCaptureSession().getDevice();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public Surface getInputSurface() {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat);
        return Api23Impl.getInputSurface(this.mCameraCaptureSessionCompat.toCameraCaptureSession());
    }

    public void holdDeferrableSurfaces(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        synchronized (this.mLock) {
            releaseDeferrableSurfaces();
            DeferrableSurfaces.incrementAll(list);
            this.mHeldDeferrableSurfaces = list;
        }
    }

    public boolean isCameraCaptureSessionOpen() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mOpenCaptureSessionFuture != null;
        }
        return z11;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onActive(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onActive(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    @RequiresApi(api = 26)
    public void onCaptureQueueEmpty(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onCaptureQueueEmpty(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(final SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture<Void> listenableFuture;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    listenableFuture = null;
                } else {
                    this.mClosed = true;
                    Preconditions.checkNotNull(this.mOpenCaptureSessionFuture, "Need to call openCaptureSession before using this API.");
                    listenableFuture = this.mOpenCaptureSessionFuture;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        finishClose();
        if (listenableFuture != null) {
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.b4
                @Override // java.lang.Runnable
                public final void run() {
                    SynchronizedCaptureSessionBaseImpl.m1758a(this.f1246b, synchronizedCaptureSession);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        finishClose();
        this.mCaptureSessionRepository.onCaptureSessionConfigureFail(this);
        this.mCaptureSessionStateCallback.onConfigureFailed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionRepository.onCaptureSessionCreated(this);
        this.mCaptureSessionStateCallback.onConfigured(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onReady(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: onSessionFinished, reason: merged with bridge method [inline-methods] */
    public void m1762e(final SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture<Void> listenableFuture;
        synchronized (this.mLock) {
            try {
                if (this.mSessionFinished) {
                    listenableFuture = null;
                } else {
                    this.mSessionFinished = true;
                    Preconditions.checkNotNull(this.mOpenCaptureSessionFuture, "Need to call openCaptureSession before using this API.");
                    listenableFuture = this.mOpenCaptureSessionFuture;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (listenableFuture != null) {
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.z3
                @Override // java.lang.Runnable
                public final void run() {
                    SynchronizedCaptureSessionBaseImpl.m1760c(this.f1540b, synchronizedCaptureSession);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    @RequiresApi(api = 23)
    public void onSurfacePrepared(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onSurfacePrepared(synchronizedCaptureSession, surface);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public ListenableFuture<Void> openCaptureSession(CameraDevice cameraDevice, final SessionConfigurationCompat sessionConfigurationCompat, final List<DeferrableSurface> list) {
        synchronized (this.mLock) {
            try {
                if (this.mOpenerDisabled) {
                    return Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                this.mCaptureSessionRepository.onCreateCaptureSession(this);
                final CameraDeviceCompat cameraDeviceCompat = CameraDeviceCompat.toCameraDeviceCompat(cameraDevice, this.mCompatHandler);
                ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.c4
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return SynchronizedCaptureSessionBaseImpl.m1759b(this.f1258a, list, cameraDeviceCompat, sessionConfigurationCompat, completer);
                    }
                });
                this.mOpenCaptureSessionFuture = future;
                Futures.addCallback(future, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r11) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th2) {
                        SynchronizedCaptureSessionBaseImpl.this.finishClose();
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                        synchronizedCaptureSessionBaseImpl.mCaptureSessionRepository.onCaptureSessionConfigureFail(synchronizedCaptureSessionBaseImpl);
                    }
                }, CameraXExecutors.directExecutor());
                return Futures.nonCancellationPropagating(this.mOpenCaptureSessionFuture);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void releaseDeferrableSurfaces() {
        synchronized (this.mLock) {
            try {
                List<DeferrableSurface> list = this.mHeldDeferrableSurfaces;
                if (list != null) {
                    DeferrableSurfaces.decrementAll(list);
                    this.mHeldDeferrableSurfaces = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public ListenableFuture<List<Surface>> startWithDeferrableSurface(final List<DeferrableSurface> list, long j11) {
        synchronized (this.mLock) {
            try {
                if (this.mOpenerDisabled) {
                    return Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                FutureChain futureChainTransformAsync = FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(list, false, j11, getExecutor(), this.mScheduledExecutorService)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.d4
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return SynchronizedCaptureSessionBaseImpl.m1761d(this.f1332a, list, (List) obj);
                    }
                }, getExecutor());
                this.mStartingSurface = futureChainTransformAsync;
                return Futures.nonCancellationPropagating(futureChainTransformAsync);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void stopRepeating() throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public CameraCaptureSessionCompat toCameraCaptureSessionCompat() {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat;
    }

    public SynchronizedCaptureSessionBaseImpl(CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mCompatHandler = handler;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ListenableFuture m1761d(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, List list, List list2) {
        synchronizedCaptureSessionBaseImpl.getClass();
        Logger.m1866d(TAG, "[" + synchronizedCaptureSessionBaseImpl + "] getSurface done with results: " + list2);
        if (list2.isEmpty()) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        if (list2.contains(null)) {
            return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null))));
        }
        return Futures.immediateFuture(list2);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void finishClose() {
        releaseDeferrableSurfaces();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        Preconditions.checkNotNull(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public SynchronizedCaptureSession.StateCallback getStateCallback() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void onCameraDeviceError(int i11) {
    }
}
