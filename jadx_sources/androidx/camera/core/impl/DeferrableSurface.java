package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import com.tencent.bugly.proguard.C33627eb;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
public abstract class DeferrableSurface {

    @GuardedBy("mLock")
    private CallbackToFutureAdapter.Completer<Void> mCloseCompleter;
    private final ListenableFuture<Void> mCloseFuture;

    @GuardedBy("mLock")
    private boolean mClosed;
    Class<?> mContainerClass;
    private final Object mLock;
    private final Size mPrescribedSize;
    private final int mPrescribedStreamFormat;

    @GuardedBy("mLock")
    private CallbackToFutureAdapter.Completer<Void> mTerminationCompleter;
    private final ListenableFuture<Void> mTerminationFuture;

    @GuardedBy("mLock")
    private int mUseCount;
    public static final Size SIZE_UNDEFINED = new Size(0, 0);
    private static final String TAG = "DeferrableSurface";
    private static final boolean DEBUG = Logger.isDebugEnabled(TAG);
    private static final AtomicInteger USED_COUNT = new AtomicInteger(0);
    private static final AtomicInteger TOTAL_COUNT = new AtomicInteger(0);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }
    }

    public DeferrableSurface() {
        this(SIZE_UNDEFINED, 0);
    }

    public abstract ListenableFuture<Surface> provideSurface();

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface(Size size, int i11) {
        this.mLock = new Object();
        this.mUseCount = 0;
        this.mClosed = false;
        this.mPrescribedSize = size;
        this.mPrescribedStreamFormat = i11;
        ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.u
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurface.m1952a(this.f1694a, completer);
            }
        });
        this.mTerminationFuture = future;
        this.mCloseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.v
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurface.m1953b(this.f1723a, completer);
            }
        });
        if (Logger.isDebugEnabled(TAG)) {
            printGlobalDebugCounts("Surface created", TOTAL_COUNT.incrementAndGet(), USED_COUNT.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            future.addListener(new Runnable() { // from class: androidx.camera.core.impl.w
                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface.m1954c(this.f1724b, stackTraceString);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m1952a(DeferrableSurface deferrableSurface, CallbackToFutureAdapter.Completer completer) {
        synchronized (deferrableSurface.mLock) {
            deferrableSurface.mTerminationCompleter = completer;
        }
        return "DeferrableSurface-termination(" + deferrableSurface + ")";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m1953b(DeferrableSurface deferrableSurface, CallbackToFutureAdapter.Completer completer) {
        synchronized (deferrableSurface.mLock) {
            deferrableSurface.mCloseCompleter = completer;
        }
        return "DeferrableSurface-close(" + deferrableSurface + ")";
    }

    private void printGlobalDebugCounts(String str, int i11, int i12) {
        if (!DEBUG && Logger.isDebugEnabled(TAG)) {
            Logger.m1866d(TAG, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        Logger.m1866d(TAG, str + "[total_surfaces=" + i11 + ", used_surfaces=" + i12 + "](" + this + "}");
    }

    public void close() {
        CallbackToFutureAdapter.Completer<Void> completer;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    completer = null;
                } else {
                    this.mClosed = true;
                    this.mCloseCompleter.set(null);
                    if (this.mUseCount == 0) {
                        completer = this.mTerminationCompleter;
                        this.mTerminationCompleter = null;
                    } else {
                        completer = null;
                    }
                    if (Logger.isDebugEnabled(TAG)) {
                        Logger.m1866d(TAG, "surface closed,  useCount=" + this.mUseCount + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    public void decrementUseCount() {
        CallbackToFutureAdapter.Completer<Void> completer;
        synchronized (this.mLock) {
            try {
                int i11 = this.mUseCount;
                if (i11 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i12 = i11 - 1;
                this.mUseCount = i12;
                if (i12 == 0 && this.mClosed) {
                    completer = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                } else {
                    completer = null;
                }
                if (Logger.isDebugEnabled(TAG)) {
                    Logger.m1866d(TAG, "use count-1,  useCount=" + this.mUseCount + " closed=" + this.mClosed + C33627eb.f69716f + this);
                    if (this.mUseCount == 0) {
                        printGlobalDebugCounts("Surface no longer in use", TOTAL_COUNT.get(), USED_COUNT.decrementAndGet());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    public ListenableFuture<Void> getCloseFuture() {
        return Futures.nonCancellationPropagating(this.mCloseFuture);
    }

    public Class<?> getContainerClass() {
        return this.mContainerClass;
    }

    public Size getPrescribedSize() {
        return this.mPrescribedSize;
    }

    public int getPrescribedStreamFormat() {
        return this.mPrescribedStreamFormat;
    }

    public final ListenableFuture<Surface> getSurface() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return Futures.immediateFailedFuture(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return provideSurface();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ListenableFuture<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    @VisibleForTesting
    public int getUseCount() {
        int i11;
        synchronized (this.mLock) {
            i11 = this.mUseCount;
        }
        return i11;
    }

    public void incrementUseCount() throws SurfaceClosedException {
        synchronized (this.mLock) {
            try {
                int i11 = this.mUseCount;
                if (i11 == 0 && this.mClosed) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.mUseCount = i11 + 1;
                if (Logger.isDebugEnabled(TAG)) {
                    if (this.mUseCount == 1) {
                        printGlobalDebugCounts("New surface in use", TOTAL_COUNT.get(), USED_COUNT.incrementAndGet());
                    }
                    Logger.m1866d(TAG, "use count+1, useCount=" + this.mUseCount + C33627eb.f69716f + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isClosed() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mClosed;
        }
        return z11;
    }

    public void setContainerClass(Class<?> cls) {
        this.mContainerClass = cls;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1954c(DeferrableSurface deferrableSurface, String str) {
        deferrableSurface.getClass();
        try {
            deferrableSurface.mTerminationFuture.get();
            deferrableSurface.printGlobalDebugCounts("Surface terminated", TOTAL_COUNT.decrementAndGet(), USED_COUNT.get());
        } catch (Exception e11) {
            Logger.m1868e(TAG, "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
            synchronized (deferrableSurface.mLock) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.mClosed), Integer.valueOf(deferrableSurface.mUseCount)), e11);
            }
        }
    }
}
