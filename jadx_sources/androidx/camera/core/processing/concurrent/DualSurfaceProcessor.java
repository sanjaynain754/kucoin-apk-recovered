package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.CompositionSettings;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.processing.RunnableC1112c;
import androidx.camera.core.processing.RunnableC1144n;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.util.GLUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public class DualSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "DualSurfaceProcessor";
    private final Executor mGlExecutor;

    @VisibleForTesting
    final Handler mGlHandler;
    private final DualOpenGlRenderer mGlRenderer;

    @VisibleForTesting
    final HandlerThread mGlThread;
    private int mInputSurfaceCount;
    private final AtomicBoolean mIsReleaseRequested;
    private boolean mIsReleased;
    final Map<SurfaceOutput, Surface> mOutputSurfaces;
    private SurfaceTexture mPrimarySurfaceTexture;
    private SurfaceTexture mSecondarySurfaceTexture;

    public static class Factory {
        private static Function3<DynamicRange, CompositionSettings, CompositionSettings, SurfaceProcessorInternal> sSupplier = new Function3() { // from class: androidx.camera.core.processing.concurrent.j
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new DualSurfaceProcessor((DynamicRange) obj, (CompositionSettings) obj2, (CompositionSettings) obj3);
            }
        };

        public static SurfaceProcessorInternal newInstance(DynamicRange dynamicRange, CompositionSettings compositionSettings, CompositionSettings compositionSettings2) {
            return sSupplier.invoke(dynamicRange, compositionSettings, compositionSettings2);
        }

        @VisibleForTesting
        public static void setSupplier(Function3<DynamicRange, CompositionSettings, CompositionSettings, SurfaceProcessorInternal> function3) {
            sSupplier = function3;
        }

        private Factory() {
        }
    }

    public DualSurfaceProcessor(DynamicRange dynamicRange, CompositionSettings compositionSettings, CompositionSettings compositionSettings2) {
        this(dynamicRange, Collections.EMPTY_MAP, compositionSettings, compositionSettings2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2041d(DualSurfaceProcessor dualSurfaceProcessor) {
        dualSurfaceProcessor.mIsReleased = true;
        dualSurfaceProcessor.checkReadyToRelease();
    }

    private void executeSafely(Runnable runnable) {
        executeSafely(runnable, new Runnable() { // from class: androidx.camera.core.processing.concurrent.h
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.m2039b();
            }
        });
    }

    public DualSurfaceProcessor(DynamicRange dynamicRange, Map<GLUtils.InputFormat, ShaderProvider> map, CompositionSettings compositionSettings, CompositionSettings compositionSettings2) {
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mOutputSurfaces = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mGlRenderer = new DualOpenGlRenderer(compositionSettings, compositionSettings2);
        try {
            initGlRenderer(dynamicRange, map);
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2038a(DualSurfaceProcessor dualSurfaceProcessor, Runnable runnable, Runnable runnable2) {
        if (dualSurfaceProcessor.mIsReleased) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @WorkerThread
    private void checkReadyToRelease() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            Iterator<SurfaceOutput> it = this.mOutputSurfaces.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.mOutputSurfaces.clear();
            this.mGlRenderer.release();
            this.mGlThread.quit();
        }
    }

    private void executeSafely(final Runnable runnable, final Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.concurrent.g
                @Override // java.lang.Runnable
                public final void run() {
                    DualSurfaceProcessor.m2038a(this.f1775b, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e11) {
            Logger.m1873w(TAG, "Unable to executor runnable", e11);
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2043f(final DualSurfaceProcessor dualSurfaceProcessor, final SurfaceOutput surfaceOutput) {
        Surface surface = surfaceOutput.getSurface(dualSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.concurrent.f
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DualSurfaceProcessor.m2042e(this.f1773b, surfaceOutput, (SurfaceOutput.Event) obj);
            }
        });
        dualSurfaceProcessor.mGlRenderer.registerOutputSurface(surface);
        dualSurfaceProcessor.mOutputSurfaces.put(surfaceOutput, surface);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2044g(final DualSurfaceProcessor dualSurfaceProcessor, SurfaceRequest surfaceRequest) {
        dualSurfaceProcessor.mInputSurfaceCount++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(dualSurfaceProcessor.mGlRenderer.getTextureName(surfaceRequest.isPrimary()));
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, dualSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.concurrent.i
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DualSurfaceProcessor.m2040c(this.f1778b, surfaceTexture, surface, (SurfaceRequest.Result) obj);
            }
        });
        if (surfaceRequest.isPrimary()) {
            dualSurfaceProcessor.mPrimarySurfaceTexture = surfaceTexture;
        } else {
            dualSurfaceProcessor.mSecondarySurfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(dualSurfaceProcessor, dualSurfaceProcessor.mGlHandler);
        }
    }

    private void initGlRenderer(final DynamicRange dynamicRange, final Map<GLUtils.InputFormat, ShaderProvider> map) {
        try {
            CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.concurrent.c
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return DualSurfaceProcessor.m2046i(this.f1764a, dynamicRange, map, completer);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e11) {
            e = e11;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.mIsReleaseRequested.get() || (surfaceTexture2 = this.mPrimarySurfaceTexture) == null || this.mSecondarySurfaceTexture == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.mSecondarySurfaceTexture.updateTexImage();
        for (Map.Entry<SurfaceOutput, Surface> entry : this.mOutputSurfaces.entrySet()) {
            Surface value = entry.getValue();
            SurfaceOutput key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), value, key, this.mPrimarySurfaceTexture, this.mSecondarySurfaceTexture);
                } catch (RuntimeException e11) {
                    Logger.m1869e(TAG, "Failed to render with OpenGL.", e11);
                }
            }
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(final SurfaceRequest surfaceRequest) throws ProcessingException {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.concurrent.b
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.m2044g(this.f1762b, surfaceRequest);
            }
        };
        Objects.requireNonNull(surfaceRequest);
        executeSafely(runnable, new RunnableC1112c(surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(final SurfaceOutput surfaceOutput) throws ProcessingException {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutput.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: androidx.camera.core.processing.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.m2043f(this.f1771b, surfaceOutput);
            }
        };
        Objects.requireNonNull(surfaceOutput);
        executeSafely(runnable, new RunnableC1144n(surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely(new Runnable() { // from class: androidx.camera.core.processing.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessor.m2041d(this.f1761b);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2040c(DualSurfaceProcessor dualSurfaceProcessor, SurfaceTexture surfaceTexture, Surface surface, SurfaceRequest.Result result) {
        dualSurfaceProcessor.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        dualSurfaceProcessor.mInputSurfaceCount--;
        dualSurfaceProcessor.checkReadyToRelease();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2042e(DualSurfaceProcessor dualSurfaceProcessor, SurfaceOutput surfaceOutput, SurfaceOutput.Event event) {
        dualSurfaceProcessor.getClass();
        surfaceOutput.close();
        Surface surfaceRemove = dualSurfaceProcessor.mOutputSurfaces.remove(surfaceOutput);
        if (surfaceRemove != null) {
            dualSurfaceProcessor.mGlRenderer.unregisterOutputSurface(surfaceRemove);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2045h(DualSurfaceProcessor dualSurfaceProcessor, DynamicRange dynamicRange, Map map, CallbackToFutureAdapter.Completer completer) throws Throwable {
        dualSurfaceProcessor.getClass();
        try {
            dualSurfaceProcessor.mGlRenderer.init(dynamicRange, map);
            completer.set(null);
        } catch (RuntimeException e11) {
            completer.setException(e11);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m2046i(final DualSurfaceProcessor dualSurfaceProcessor, final DynamicRange dynamicRange, final Map map, final CallbackToFutureAdapter.Completer completer) {
        dualSurfaceProcessor.getClass();
        dualSurfaceProcessor.executeSafely(new Runnable() { // from class: androidx.camera.core.processing.concurrent.d
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                DualSurfaceProcessor.m2045h(this.f1767b, dynamicRange, map, completer);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2039b() {
    }
}
