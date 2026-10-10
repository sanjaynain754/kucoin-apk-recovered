package androidx.camera.core.impl;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.camera.core.CameraIdentifier;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractCameraPresenceSource implements Observable<List<CameraIdentifier>> {
    private static final String TAG = "CameraPresenceSrc";

    @GuardedBy("mLock")
    private List<CameraIdentifier> mCurrentData;

    @GuardedBy("mLock")
    private Throwable mCurrentError;

    @GuardedBy("mLock")
    private boolean mIsActive;
    private final Object mLock;
    private final List<ObserverWrapper> mObservers;

    public AbstractCameraPresenceSource() {
        this(Collections.EMPTY_LIST);
    }

    @Override // androidx.camera.core.impl.Observable
    public abstract ListenableFuture<List<CameraIdentifier>> fetchData();

    public abstract void startMonitoring();

    public abstract void stopMonitoring();

    public void updateData(List<CameraIdentifier> list) {
        updateState(list, null);
    }

    public void updateError(Throwable th2) {
        updateState(null, th2);
    }

    public static class ObserverWrapper {
        final Executor mExecutor;
        final Observable.Observer<? super List<CameraIdentifier>> mObserver;

        public ObserverWrapper(Executor executor, Observable.Observer<? super List<CameraIdentifier>> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }
    }

    public AbstractCameraPresenceSource(List<String> list) {
        this.mLock = new Object();
        this.mObservers = new CopyOnWriteArrayList();
        this.mCurrentError = null;
        this.mIsActive = false;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CameraIdentifier.create(it.next()));
        }
        this.mCurrentData = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1934a(Throwable th2, ObserverWrapper observerWrapper, List list) {
        if (th2 != null) {
            observerWrapper.mObserver.onError(th2);
        } else {
            observerWrapper.mObserver.onNewData(list);
        }
    }

    private void notifyObserver(final ObserverWrapper observerWrapper, final List<CameraIdentifier> list, final Throwable th2) {
        observerWrapper.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractCameraPresenceSource.m1934a(th2, observerWrapper, list);
            }
        });
    }

    private void updateState(List<CameraIdentifier> list, Throwable th2) {
        boolean z11;
        List<CameraIdentifier> listUnmodifiableList;
        Throwable th3;
        synchronized (this.mLock) {
            try {
                if (th2 != null) {
                    z11 = this.mCurrentError == null || !this.mCurrentData.isEmpty();
                    this.mCurrentError = th2;
                    this.mCurrentData = Collections.EMPTY_LIST;
                } else {
                    Preconditions.checkNotNull(list);
                    boolean z12 = (this.mCurrentError == null && this.mCurrentData.equals(list)) ? false : true;
                    this.mCurrentError = null;
                    this.mCurrentData = list;
                    z11 = z12;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.mCurrentData);
                th3 = this.mCurrentError;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Data changed. Notifying ");
            sb2.append(this.mObservers.size());
            sb2.append(" observers. Error: ");
            sb2.append(th3 != null);
            Log.d(TAG, sb2.toString());
            Iterator<ObserverWrapper> it = this.mObservers.iterator();
            while (it.hasNext()) {
                notifyObserver(it.next(), listUnmodifiableList, th3);
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, Observable.Observer<? super List<CameraIdentifier>> observer) {
        List<CameraIdentifier> listUnmodifiableList;
        Throwable th2;
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(observer);
        this.mObservers.add(new ObserverWrapper(executor, observer));
        synchronized (this.mLock) {
            try {
                if (!this.mIsActive && !this.mObservers.isEmpty()) {
                    Log.i(TAG, "First observer added. Starting monitoring.");
                    this.mIsActive = true;
                    startMonitoring();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.mCurrentData);
                th2 = this.mCurrentError;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        notifyObserver(new ObserverWrapper(executor, observer), listUnmodifiableList, th2);
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super List<CameraIdentifier>> observer) {
        ObserverWrapper next;
        Preconditions.checkNotNull(observer);
        Iterator<ObserverWrapper> it = this.mObservers.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!next.mObserver.equals(observer));
        if (next != null) {
            this.mObservers.remove(next);
        }
        synchronized (this.mLock) {
            try {
                if (this.mIsActive && this.mObservers.isEmpty()) {
                    Log.i(TAG, "Last observer removed. Stopping monitoring.");
                    this.mIsActive = false;
                    stopMonitoring();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
