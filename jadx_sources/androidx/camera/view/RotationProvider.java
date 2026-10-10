package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public final class RotationProvider {

    @GuardedBy("mLock")
    @VisibleForTesting
    final OrientationEventListener mOrientationListener;
    final Object mLock = new Object();

    @GuardedBy("mLock")
    final Map<Listener, ListenerWrapper> mListeners = new HashMap();

    @VisibleForTesting
    boolean mIgnoreCanDetectForTest = false;

    public interface Listener {
        void onRotationChanged(int i11);
    }

    public static class ListenerWrapper {
        private final AtomicBoolean mEnabled = new AtomicBoolean(true);
        private final Executor mExecutor;
        private final Listener mListener;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2244a(ListenerWrapper listenerWrapper, int i11) {
            if (listenerWrapper.mEnabled.get()) {
                listenerWrapper.mListener.onRotationChanged(i11);
            }
        }

        public void disable() {
            this.mEnabled.set(false);
        }

        public void onRotationChanged(final int i11) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.view.x
                @Override // java.lang.Runnable
                public final void run() {
                    RotationProvider.ListenerWrapper.m2244a(this.f2175b, i11);
                }
            });
        }

        public ListenerWrapper(Listener listener, Executor executor) {
            this.mListener = listener;
            this.mExecutor = executor;
        }
    }

    @VisibleForTesting
    public static int orientationToSurfaceRotation(int i11) {
        if (i11 >= 315 || i11 < 45) {
            return 0;
        }
        if (i11 >= 225) {
            return 1;
        }
        return i11 >= 135 ? 2 : 3;
    }

    @CheckResult
    public boolean addListener(Executor executor, Listener listener) {
        synchronized (this.mLock) {
            try {
                if (!this.mOrientationListener.canDetectOrientation() && !this.mIgnoreCanDetectForTest) {
                    return false;
                }
                this.mListeners.put(listener, new ListenerWrapper(listener, executor));
                this.mOrientationListener.enable();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeListener(Listener listener) {
        synchronized (this.mLock) {
            try {
                ListenerWrapper listenerWrapper = this.mListeners.get(listener);
                if (listenerWrapper != null) {
                    listenerWrapper.disable();
                    this.mListeners.remove(listener);
                }
                if (this.mListeners.isEmpty()) {
                    this.mOrientationListener.disable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public RotationProvider(Context context) {
        this.mOrientationListener = new OrientationEventListener(context) { // from class: androidx.camera.view.RotationProvider.1
            private static final int INVALID_SURFACE_ROTATION = -1;
            private int mRotation = -1;

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i11) {
                int iOrientationToSurfaceRotation;
                ArrayList arrayList;
                if (i11 == -1 || this.mRotation == (iOrientationToSurfaceRotation = RotationProvider.orientationToSurfaceRotation(i11))) {
                    return;
                }
                this.mRotation = iOrientationToSurfaceRotation;
                synchronized (RotationProvider.this.mLock) {
                    arrayList = new ArrayList(RotationProvider.this.mListeners.values());
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ListenerWrapper) it.next()).onRotationChanged(iOrientationToSurfaceRotation);
                }
            }
        };
    }
}
