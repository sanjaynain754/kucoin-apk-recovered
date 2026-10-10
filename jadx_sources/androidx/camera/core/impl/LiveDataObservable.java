package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class LiveDataObservable<T> implements Observable<T> {
    private Observer<Result<T>> mLiveDataObserver;
    final MutableLiveData<Result<T>> mLiveData = new MutableLiveData<>();

    @GuardedBy("mObservers")
    private final Map<Observable.Observer<? super T>, Executor> mObservers = new HashMap();

    public static final class Result<T> {
        private final Throwable mError;
        private final T mValue;

        public static <T> Result<T> fromError(Throwable th2) {
            return new Result<>(null, (Throwable) Preconditions.checkNotNull(th2));
        }

        public static <T> Result<T> fromValue(T t11) {
            return new Result<>(t11, null);
        }

        public boolean completedSuccessfully() {
            return this.mError == null;
        }

        public Throwable getError() {
            return this.mError;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.mValue;
            } else {
                str = "Error: " + this.mError;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }

        private Result(T t11, Throwable th2) {
            this.mValue = t11;
            this.mError = th2;
        }

        public T getValue() {
            if (completedSuccessfully()) {
                return this.mValue;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1957a(LiveDataObservable liveDataObservable, final Result result) {
        HashMap map;
        synchronized (liveDataObservable.mObservers) {
            map = new HashMap(liveDataObservable.mObservers);
        }
        for (final Map.Entry entry : map.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: androidx.camera.core.impl.d0
                @Override // java.lang.Runnable
                public final void run() {
                    LiveDataObservable.m1958b(entry, result);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1960d(final LiveDataObservable liveDataObservable) {
        if (liveDataObservable.mLiveDataObserver == null) {
            liveDataObservable.mLiveDataObserver = new Observer() { // from class: androidx.camera.core.impl.z
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LiveDataObservable.m1957a(this.f1731b, (LiveDataObservable.Result) obj);
                }
            };
        }
        liveDataObservable.mLiveData.observeForever(liveDataObservable.mLiveDataObserver);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1961e(LiveDataObservable liveDataObservable) {
        Observer<Result<T>> observer = liveDataObservable.mLiveDataObserver;
        if (observer != null) {
            liveDataObservable.mLiveData.removeObserver(observer);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1962f(LiveDataObservable liveDataObservable, Observable.Observer observer) {
        Result<T> value = liveDataObservable.mLiveData.getValue();
        if (value == null) {
            return;
        }
        if (value.completedSuccessfully()) {
            observer.onNewData(value.getValue());
        } else {
            Preconditions.checkNotNull(value.getError());
            observer.onError(value.getError());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1963g(LiveDataObservable liveDataObservable, CallbackToFutureAdapter.Completer completer) {
        Result<T> value = liveDataObservable.mLiveData.getValue();
        if (value == null) {
            completer.setException(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (value.completedSuccessfully()) {
            completer.set(value.getValue());
        } else {
            Preconditions.checkNotNull(value.getError());
            completer.setException(value.getError());
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, final Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            try {
                boolean zIsEmpty = this.mObservers.isEmpty();
                this.mObservers.put(observer, executor);
                if (zIsEmpty) {
                    enableInternalObserver();
                } else {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.impl.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LiveDataObservable.m1962f(this.f1660b, observer);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public ListenableFuture<T> fetchData() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.e0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return LiveDataObservable.m1959c(this.f1666a, completer);
            }
        });
    }

    public LiveData<Result<T>> getLiveData() {
        return this.mLiveData;
    }

    public void postError(Throwable th2) {
        this.mLiveData.postValue(Result.fromError(th2));
    }

    public void postValue(T t11) {
        this.mLiveData.postValue(Result.fromValue(t11));
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            try {
                this.mObservers.remove(observer);
                if (this.mObservers.isEmpty()) {
                    disableInternalObserver();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1958b(Map.Entry entry, Result result) {
        Observable.Observer observer = (Observable.Observer) entry.getKey();
        if (result.completedSuccessfully()) {
            observer.onNewData(result.getValue());
        } else {
            Preconditions.checkNotNull(result.getError());
            observer.onError(result.getError());
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m1959c(final LiveDataObservable liveDataObservable, final CallbackToFutureAdapter.Completer completer) {
        liveDataObservable.getClass();
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.c0
            @Override // java.lang.Runnable
            public final void run() {
                LiveDataObservable.m1963g(this.f1662b, completer);
            }
        });
        return liveDataObservable + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    private void disableInternalObserver() {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.f0
            @Override // java.lang.Runnable
            public final void run() {
                LiveDataObservable.m1961e(this.f1667b);
            }
        });
    }

    private void enableInternalObserver() {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.a0
            @Override // java.lang.Runnable
            public final void run() {
                LiveDataObservable.m1960d(this.f1658b);
            }
        });
    }
}
