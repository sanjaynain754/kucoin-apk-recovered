package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
class CaptureSessionRepository {
    final Executor mExecutor;
    final Object mLock = new Object();

    @GuardedBy("mLock")
    final Set<SynchronizedCaptureSession> mCaptureSessions = new LinkedHashSet();

    @GuardedBy("mLock")
    final Set<SynchronizedCaptureSession> mClosingCaptureSession = new LinkedHashSet();

    @GuardedBy("mLock")
    final Set<SynchronizedCaptureSession> mCreatingCaptureSessions = new LinkedHashSet();
    private final CameraDevice.StateCallback mCameraStateCallback = new C07051();

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.CaptureSessionRepository$1 */
    public class C07051 extends CameraDevice.StateCallback {
        public C07051() {
        }

        private void cameraClosed() {
            List<SynchronizedCaptureSession> sessionsInOrder;
            synchronized (CaptureSessionRepository.this.mLock) {
                sessionsInOrder = CaptureSessionRepository.this.getSessionsInOrder();
                CaptureSessionRepository.this.mCreatingCaptureSessions.clear();
                CaptureSessionRepository.this.mCaptureSessions.clear();
                CaptureSessionRepository.this.mClosingCaptureSession.clear();
            }
            Iterator<SynchronizedCaptureSession> it = sessionsInOrder.iterator();
            while (it.hasNext()) {
                it.next().finishClose();
            }
        }

        private void dispatchOnError(final int i11) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CaptureSessionRepository.this.mLock) {
                linkedHashSet.addAll(CaptureSessionRepository.this.mCreatingCaptureSessions);
                linkedHashSet.addAll(CaptureSessionRepository.this.mCaptureSessions);
            }
            CaptureSessionRepository.this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.n2
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureSessionRepository.C07051.m1721a(linkedHashSet, i11);
                }
            });
        }

        private void forceOnClosedCaptureSessions() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CaptureSessionRepository.this.mLock) {
                linkedHashSet.addAll(CaptureSessionRepository.this.mCreatingCaptureSessions);
                linkedHashSet.addAll(CaptureSessionRepository.this.mCaptureSessions);
            }
            CaptureSessionRepository.this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m2
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureSessionRepository.forceOnClosed(linkedHashSet);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m1721a(LinkedHashSet linkedHashSet, int i11) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((SynchronizedCaptureSession) it.next()).onCameraDeviceError(i11);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            forceOnClosedCaptureSessions();
            cameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            forceOnClosedCaptureSessions();
            cameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i11) {
            forceOnClosedCaptureSessions();
            dispatchOnError(i11);
            cameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public CameraDevice.StateCallback getCameraStateCallback() {
        return this.mCameraStateCallback;
    }

    public List<SynchronizedCaptureSession> getCaptureSessions() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mCaptureSessions);
        }
        return arrayList;
    }

    public List<SynchronizedCaptureSession> getClosingCaptureSession() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mClosingCaptureSession);
        }
        return arrayList;
    }

    public List<SynchronizedCaptureSession> getCreatingCaptureSessions() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mCreatingCaptureSessions);
        }
        return arrayList;
    }

    public List<SynchronizedCaptureSession> getSessionsInOrder() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList();
            arrayList.addAll(getCaptureSessions());
            arrayList.addAll(getCreatingCaptureSessions());
        }
        return arrayList;
    }

    public void onCaptureSessionClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCaptureSessions.remove(synchronizedCaptureSession);
            this.mClosingCaptureSession.remove(synchronizedCaptureSession);
        }
    }

    public void onCaptureSessionClosing(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mClosingCaptureSession.add(synchronizedCaptureSession);
        }
    }

    public void onCaptureSessionCreated(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCaptureSessions.add(synchronizedCaptureSession);
            this.mCreatingCaptureSessions.remove(synchronizedCaptureSession);
        }
        forceFinishCloseStaleSessions(synchronizedCaptureSession);
    }

    public void onCreateCaptureSession(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCreatingCaptureSessions.add(synchronizedCaptureSession);
        }
    }

    public CaptureSessionRepository(Executor executor) {
        this.mExecutor = executor;
    }

    private void forceFinishCloseStaleSessions(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession next;
        Iterator<SynchronizedCaptureSession> it = getSessionsInOrder().iterator();
        while (it.hasNext() && (next = it.next()) != synchronizedCaptureSession) {
            next.finishClose();
        }
    }

    public static void forceOnClosed(Set<SynchronizedCaptureSession> set) {
        for (SynchronizedCaptureSession synchronizedCaptureSession : set) {
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    public void onCaptureSessionConfigureFail(SynchronizedCaptureSession synchronizedCaptureSession) {
        forceFinishCloseStaleSessions(synchronizedCaptureSession);
        synchronized (this.mLock) {
            this.mCreatingCaptureSessions.remove(synchronizedCaptureSession);
        }
    }
}
