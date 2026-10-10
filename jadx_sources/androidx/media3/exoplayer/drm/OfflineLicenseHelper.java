package androidx.media3.exoplayer.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    public synchronized byte[] downloadLicense(Format format) throws DrmSession.DrmSessionException {
        Assertions.checkArgument(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) throws DrmSession.DrmSessionException {
        Pair<Long, Long> pair;
        Assertions.checkNotNull(bArr);
        try {
            final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            final SettableFuture settableFutureCreate = SettableFuture.create();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.b0
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineLicenseHelper.m3294e(this.f3168b, settableFutureCreate, drmSessionAcquireFirstSessionOnHandlerThread);
                }
            });
            try {
                try {
                    pair = (Pair) settableFutureCreate.get();
                    releaseManagerOnHandlerThread();
                } catch (Throwable th2) {
                    releaseManagerOnHandlerThread();
                    throw th2;
                }
            } catch (InterruptedException | ExecutionException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (DrmSession.DrmSessionException e12) {
            if (e12.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e12;
        }
        return pair;
    }

    public synchronized void releaseLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DrmSession acquireFirstSessionOnHandlerThread(final int i11, @Nullable final byte[] bArr, final Format format) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(format.drmInitData);
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.c0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.m3293d(this.f3171b, i11, bArr, settableFutureCreate, format);
            }
        });
        try {
            final DrmSession drmSession = (DrmSession) settableFutureCreate.get();
            this.drmListenerConditionVariable.block();
            final SettableFuture settableFutureCreate2 = SettableFuture.create();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.d0
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineLicenseHelper.m3290a(this.f3177b, drmSession, settableFutureCreate2);
                }
            });
            try {
                if (settableFutureCreate2.get() == 0) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) settableFutureCreate2.get());
            } catch (InterruptedException | ExecutionException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (InterruptedException | ExecutionException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z11, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z11, factory, null, eventDispatcher);
    }

    public void release() {
        this.handlerThread.quit();
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3290a(OfflineLicenseHelper offlineLicenseHelper, DrmSession drmSession, SettableFuture settableFuture) {
        offlineLicenseHelper.getClass();
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
                offlineLicenseHelper.drmSessionManager.release();
            }
            settableFuture.set(error);
        } catch (Throwable th2) {
            settableFuture.setException(th2);
            drmSession.release(offlineLicenseHelper.eventDispatcher);
            offlineLicenseHelper.drmSessionManager.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i11, @Nullable byte[] bArr, Format format) throws DrmSession.DrmSessionException {
        final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i11, bArr, format);
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.f0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.m3292c(this.f3184b, settableFutureCreate, drmSessionAcquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                byte[] bArr2 = (byte[]) Assertions.checkNotNull((byte[]) settableFutureCreate.get());
                releaseManagerOnHandlerThread();
                return bArr2;
            } catch (Throwable th2) {
                releaseManagerOnHandlerThread();
                throw th2;
            }
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3291b(OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture) {
        offlineLicenseHelper.getClass();
        try {
            offlineLicenseHelper.drmSessionManager.release();
            settableFuture.set(null);
        } catch (Throwable th2) {
            settableFuture.setException(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3292c(OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture, DrmSession drmSession) {
        offlineLicenseHelper.getClass();
        try {
            settableFuture.set(drmSession.getOfflineLicenseKeySetId());
            drmSession.release(offlineLicenseHelper.eventDispatcher);
        } catch (Throwable th2) {
            try {
                settableFuture.setException(th2);
            } finally {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3293d(OfflineLicenseHelper offlineLicenseHelper, int i11, byte[] bArr, SettableFuture settableFuture, Format format) {
        offlineLicenseHelper.getClass();
        try {
            offlineLicenseHelper.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), PlayerId.UNSET);
            offlineLicenseHelper.drmSessionManager.prepare();
            try {
                offlineLicenseHelper.drmSessionManager.setMode(i11, bArr);
                settableFuture.set((DrmSession) Assertions.checkNotNull(offlineLicenseHelper.drmSessionManager.acquireSession(offlineLicenseHelper.eventDispatcher, format)));
            } catch (Throwable th2) {
                offlineLicenseHelper.drmSessionManager.release();
                throw th2;
            }
        } catch (Throwable th3) {
            settableFuture.setException(th3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m3294e(OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture, DrmSession drmSession) {
        offlineLicenseHelper.getClass();
        try {
            settableFuture.set((Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(drmSession)));
            drmSession.release(offlineLicenseHelper.eventDispatcher);
        } catch (Throwable th2) {
            try {
                settableFuture.setException(th2);
            } finally {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
            }
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z11, DataSource.Factory factory, @Nullable Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map).build(new HttpMediaDrmCallback(str, z11, factory)), eventDispatcher);
    }

    private void releaseManagerOnHandlerThread() {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.e0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.m3291b(this.f3180b, settableFutureCreate);
            }
        });
        try {
            settableFutureCreate.get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
