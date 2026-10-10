package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class SurfaceEdge {
    private final Rect mCropRect;
    private final int mFormat;
    private final boolean mHasCameraTransform;
    private final boolean mMirroring;
    private SurfaceRequest mProviderSurfaceRequest;
    private int mRotationDegrees;
    private final Matrix mSensorToBufferTransform;
    private SettableSurface mSettableSurface;
    private final StreamSpec mStreamSpec;
    private int mTargetRotation;
    private final int mTargets;
    private boolean mHasConsumer = false;
    private final Set<Runnable> mOnInvalidatedListeners = new HashSet();
    private boolean mIsClosed = false;
    private final List<Consumer<SurfaceRequest.TransformationInfo>> mTransformationUpdatesListeners = new ArrayList();

    public static class SettableSurface extends DeferrableSurface {
        CallbackToFutureAdapter.Completer<Surface> mCompleter;
        private SurfaceOutputImpl mConsumer;
        private DeferrableSurface mProvider;
        final ListenableFuture<Surface> mSurfaceFuture;

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m2027d(SettableSurface settableSurface) {
            SurfaceOutputImpl surfaceOutputImpl = settableSurface.mConsumer;
            if (surfaceOutputImpl != null) {
                surfaceOutputImpl.requestClose();
            }
            if (settableSurface.mProvider == null) {
                settableSurface.mCompleter.setCancelled();
            }
            settableSurface.mProvider = null;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Object m2028e(SettableSurface settableSurface, CallbackToFutureAdapter.Completer completer) {
            settableSurface.mCompleter = completer;
            return "SettableFuture hashCode: " + settableSurface.hashCode();
        }

        @VisibleForTesting
        public boolean hasProvider() {
            return this.mProvider != null;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public ListenableFuture<Surface> provideSurface() {
            return this.mSurfaceFuture;
        }

        @MainThread
        public void setConsumer(SurfaceOutputImpl surfaceOutputImpl) {
            Preconditions.checkState(this.mConsumer == null, "Consumer can only be linked once.");
            this.mConsumer = surfaceOutputImpl;
        }

        public SettableSurface(Size size, int i11) {
            super(size, i11);
            this.mSurfaceFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.b0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return SurfaceEdge.SettableSurface.m2028e(this.f1758a, completer);
                }
            });
        }

        @MainThread
        public boolean canSetProvider() {
            Threads.checkMainThread();
            if (this.mProvider == null && !isClosed()) {
                return true;
            }
            return false;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public void close() {
            super.close();
            Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.z
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceEdge.SettableSurface.m2027d(this.f1843b);
                }
            });
        }

        @MainThread
        public boolean setProvider(final DeferrableSurface deferrableSurface, Runnable runnable) throws DeferrableSurface.SurfaceClosedException {
            boolean z11;
            Threads.checkMainThread();
            Preconditions.checkNotNull(deferrableSurface);
            DeferrableSurface deferrableSurface2 = this.mProvider;
            boolean z12 = false;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            if (deferrableSurface2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkState(z11, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            Preconditions.checkArgument(getPrescribedSize().equals(deferrableSurface.getPrescribedSize()), String.format("The provider's size(%s) must match the parent(%s)", getPrescribedSize(), deferrableSurface.getPrescribedSize()));
            if (getPrescribedStreamFormat() == deferrableSurface.getPrescribedStreamFormat()) {
                z12 = true;
            }
            Preconditions.checkArgument(z12, String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(getPrescribedStreamFormat()), Integer.valueOf(deferrableSurface.getPrescribedStreamFormat())));
            Preconditions.checkState(!isClosed(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.mProvider = deferrableSurface;
            Futures.propagate(deferrableSurface.getSurface(), this.mCompleter);
            deferrableSurface.incrementUseCount();
            getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.processing.a0
                @Override // java.lang.Runnable
                public final void run() {
                    deferrableSurface.decrementUseCount();
                }
            }, CameraXExecutors.directExecutor());
            deferrableSurface.getCloseFuture().addListener(runnable, CameraXExecutors.mainThreadExecutor());
            return true;
        }
    }

    @MainThread
    public SurfaceRequest createSurfaceRequest(CameraInternal cameraInternal) {
        return createSurfaceRequest(cameraInternal, true);
    }

    public void updateTransformation(int i11) {
        updateTransformation(i11, -1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2024b(SurfaceEdge surfaceEdge) {
        if (surfaceEdge.mIsClosed) {
            return;
        }
        surfaceEdge.invalidate();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2025c(SurfaceEdge surfaceEdge, int i11, int i12) {
        boolean z11;
        boolean z12 = true;
        if (surfaceEdge.mRotationDegrees != i11) {
            surfaceEdge.mRotationDegrees = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        if (surfaceEdge.mTargetRotation != i12) {
            surfaceEdge.mTargetRotation = i12;
        } else {
            z12 = z11;
        }
        if (z12) {
            surfaceEdge.notifyTransformationInfoUpdate();
        }
    }

    private void checkAndSetHasConsumer() {
        Preconditions.checkState(!this.mHasConsumer, "Consumer can only be linked once.");
        this.mHasConsumer = true;
    }

    private void checkNotClosed() {
        Preconditions.checkState(!this.mIsClosed, "Edge is already closed.");
    }

    @MainThread
    public SurfaceRequest createSurfaceRequest(CameraInternal cameraInternal, boolean z11) {
        Threads.checkMainThread();
        checkNotClosed();
        SurfaceRequest surfaceRequest = new SurfaceRequest(this.mStreamSpec.getResolution(), cameraInternal, z11, this.mStreamSpec.getDynamicRange(), this.mStreamSpec.getSessionType(), this.mStreamSpec.getExpectedFrameRateRange(), new Runnable() { // from class: androidx.camera.core.processing.t
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.m2023a(this.f1835b);
            }
        });
        try {
            final DeferrableSurface deferrableSurface = surfaceRequest.getDeferrableSurface();
            SettableSurface settableSurface = this.mSettableSurface;
            Objects.requireNonNull(settableSurface);
            if (settableSurface.setProvider(deferrableSurface, new RunnableC1151u(settableSurface))) {
                ListenableFuture<Void> terminationFuture = settableSurface.getTerminationFuture();
                Objects.requireNonNull(deferrableSurface);
                terminationFuture.addListener(new Runnable() { // from class: androidx.camera.core.processing.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        deferrableSurface.close();
                    }
                }, CameraXExecutors.directExecutor());
            }
            this.mProviderSurfaceRequest = surfaceRequest;
            notifyTransformationInfoUpdate();
            return surfaceRequest;
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            throw new AssertionError("Surface is somehow already closed", e11);
        } catch (RuntimeException e12) {
            surfaceRequest.willNotProvideSurface();
            throw e12;
        }
    }

    public Rect getCropRect() {
        return this.mCropRect;
    }

    @VisibleForTesting
    public DeferrableSurface getDeferrableSurfaceForTesting() {
        return this.mSettableSurface;
    }

    public int getFormat() {
        return this.mFormat;
    }

    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    public Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    public StreamSpec getStreamSpec() {
        return this.mStreamSpec;
    }

    public int getTargets() {
        return this.mTargets;
    }

    public boolean hasCameraTransform() {
        return this.mHasCameraTransform;
    }

    @VisibleForTesting
    public boolean hasProvider() {
        return this.mSettableSurface.hasProvider();
    }

    @VisibleForTesting
    public boolean isClosed() {
        return this.mIsClosed;
    }

    public boolean isMirroring() {
        return this.mMirroring;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.mTargets + ", format=" + this.mFormat + ", resolution=" + this.mStreamSpec.getResolution() + ", cropRect=" + this.mCropRect + ", rotationDegrees=" + this.mRotationDegrees + ", mirroring=" + this.mMirroring + ", sensorToBufferTransform= " + this.mSensorToBufferTransform + ", rotationInTransform= " + TransformUtils.getRotationDegrees(this.mSensorToBufferTransform) + ", isMirrorInTransform= " + TransformUtils.isMirrored(this.mSensorToBufferTransform) + ", isClosed=" + this.mIsClosed + '}';
    }

    public void updateTransformation(final int i11, final int i12) {
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.w
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.m2025c(this.f1838b, i11, i12);
            }
        });
    }

    public SurfaceEdge(int i11, int i12, StreamSpec streamSpec, Matrix matrix, boolean z11, Rect rect, int i13, int i14, boolean z12) {
        this.mTargets = i11;
        this.mFormat = i12;
        this.mStreamSpec = streamSpec;
        this.mSensorToBufferTransform = matrix;
        this.mHasCameraTransform = z11;
        this.mCropRect = rect;
        this.mRotationDegrees = i13;
        this.mTargetRotation = i14;
        this.mMirroring = z12;
        this.mSettableSurface = new SettableSurface(streamSpec.getResolution(), i12);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2023a(final SurfaceEdge surfaceEdge) {
        surfaceEdge.getClass();
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.processing.y
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceEdge.m2024b(this.f1842b);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ListenableFuture m2026d(SurfaceEdge surfaceEdge, final SettableSurface settableSurface, int i11, SurfaceOutput.CameraInputInfo cameraInputInfo, SurfaceOutput.CameraInputInfo cameraInputInfo2, Surface surface) {
        surfaceEdge.getClass();
        Preconditions.checkNotNull(surface);
        try {
            settableSurface.incrementUseCount();
            SurfaceOutputImpl surfaceOutputImpl = new SurfaceOutputImpl(surface, surfaceEdge.getTargets(), i11, surfaceEdge.mStreamSpec.getResolution(), cameraInputInfo, cameraInputInfo2, surfaceEdge.mSensorToBufferTransform);
            surfaceOutputImpl.getCloseFuture().addListener(new Runnable() { // from class: androidx.camera.core.processing.x
                @Override // java.lang.Runnable
                public final void run() {
                    settableSurface.decrementUseCount();
                }
            }, CameraXExecutors.directExecutor());
            settableSurface.setConsumer(surfaceOutputImpl);
            return Futures.immediateFuture(surfaceOutputImpl);
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            return Futures.immediateFailedFuture(e11);
        }
    }

    @MainThread
    private void notifyTransformationInfoUpdate() {
        Threads.checkMainThread();
        SurfaceRequest.TransformationInfo transformationInfoM1896of = SurfaceRequest.TransformationInfo.m1896of(this.mCropRect, this.mRotationDegrees, this.mTargetRotation, hasCameraTransform(), this.mSensorToBufferTransform, this.mMirroring);
        SurfaceRequest surfaceRequest = this.mProviderSurfaceRequest;
        if (surfaceRequest != null) {
            surfaceRequest.updateTransformationInfo(transformationInfoM1896of);
        }
        Iterator<Consumer<SurfaceRequest.TransformationInfo>> it = this.mTransformationUpdatesListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(transformationInfoM1896of);
        }
    }

    @MainThread
    public void addOnInvalidatedListener(Runnable runnable) {
        Threads.checkMainThread();
        checkNotClosed();
        this.mOnInvalidatedListeners.add(runnable);
    }

    public void addTransformationUpdateListener(Consumer<SurfaceRequest.TransformationInfo> consumer) {
        Preconditions.checkNotNull(consumer);
        this.mTransformationUpdatesListeners.add(consumer);
    }

    @MainThread
    public final void close() {
        Threads.checkMainThread();
        this.mSettableSurface.close();
        this.mIsClosed = true;
        this.mTransformationUpdatesListeners.clear();
        this.mOnInvalidatedListeners.clear();
    }

    @MainThread
    public ListenableFuture<SurfaceOutput> createSurfaceOutputFuture(final int i11, final SurfaceOutput.CameraInputInfo cameraInputInfo, final SurfaceOutput.CameraInputInfo cameraInputInfo2) {
        Threads.checkMainThread();
        checkNotClosed();
        checkAndSetHasConsumer();
        final SettableSurface settableSurface = this.mSettableSurface;
        return Futures.transformAsync(settableSurface.getSurface(), new AsyncFunction() { // from class: androidx.camera.core.processing.s
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return SurfaceEdge.m2026d(this.f1830a, settableSurface, i11, cameraInputInfo, cameraInputInfo2, (Surface) obj);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    @MainThread
    public final void disconnect() {
        Threads.checkMainThread();
        checkNotClosed();
        this.mSettableSurface.close();
    }

    @MainThread
    public DeferrableSurface getDeferrableSurface() {
        Threads.checkMainThread();
        checkNotClosed();
        checkAndSetHasConsumer();
        return this.mSettableSurface;
    }

    @MainThread
    public void invalidate() {
        Threads.checkMainThread();
        checkNotClosed();
        if (!this.mSettableSurface.canSetProvider()) {
            this.mHasConsumer = false;
            this.mSettableSurface.close();
            this.mSettableSurface = new SettableSurface(this.mStreamSpec.getResolution(), this.mFormat);
            Iterator<Runnable> it = this.mOnInvalidatedListeners.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    public void removeTransformationUpdateListener(Consumer<SurfaceRequest.TransformationInfo> consumer) {
        Preconditions.checkNotNull(consumer);
        this.mTransformationUpdatesListeners.remove(consumer);
    }

    @MainThread
    public void setProvider(DeferrableSurface deferrableSurface) throws DeferrableSurface.SurfaceClosedException {
        Threads.checkMainThread();
        checkNotClosed();
        SettableSurface settableSurface = this.mSettableSurface;
        Objects.requireNonNull(settableSurface);
        settableSurface.setProvider(deferrableSurface, new RunnableC1151u(settableSurface));
    }
}
