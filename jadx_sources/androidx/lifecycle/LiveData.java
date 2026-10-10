package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            return true;
        }

        public AlwaysActiveObserver(Observer<? super T> observer) {
            super(observer);
        }
    }

    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        final LifecycleOwner mOwner;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.mOwner = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public void detachObserver() {
            this.mOwner.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            return this.mOwner == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State currentState = this.mOwner.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.mObserver);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                activeStateChanged(shouldBeActive());
                state = currentState;
                currentState = this.mOwner.getLifecycle().getCurrentState();
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    public abstract class ObserverWrapper {
        boolean mActive;
        int mLastVersion = -1;
        final Observer<? super T> mObserver;

        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean shouldBeActive();

        public ObserverWrapper(Observer<? super T> observer) {
            this.mObserver = observer;
        }

        public void activeStateChanged(boolean z11) {
            if (z11 == this.mActive) {
                return;
            }
            this.mActive = z11;
            LiveData.this.changeActiveCounter(z11 ? 1 : -1);
            if (this.mActive) {
                LiveData.this.dispatchingValue(this);
            }
        }

        public void detachObserver() {
        }
    }

    public LiveData(T t11) {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                synchronized (LiveData.this.mDataLock) {
                    obj = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj);
            }
        };
        this.mData = t11;
        this.mVersion = 0;
    }

    private void considerNotify(LiveData<T>.ObserverWrapper observerWrapper) {
        if (observerWrapper.mActive) {
            if (!observerWrapper.shouldBeActive()) {
                observerWrapper.activeStateChanged(false);
                return;
            }
            int i11 = observerWrapper.mLastVersion;
            int i12 = this.mVersion;
            if (i11 >= i12) {
                return;
            }
            observerWrapper.mLastVersion = i12;
            observerWrapper.mObserver.onChanged((Object) this.mData);
        }
    }

    @MainThread
    public void changeActiveCounter(int i11) {
        int i12 = this.mActiveCount;
        this.mActiveCount = i11 + i12;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i13 = this.mActiveCount;
                if (i12 == i13) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z11 = i12 == 0 && i13 > 0;
                boolean z12 = i12 > 0 && i13 == 0;
                if (z11) {
                    onActive();
                } else if (z12) {
                    onInactive();
                }
                i12 = i13;
            } catch (Throwable th2) {
                this.mChangingActiveState = false;
                throw th2;
            }
        }
    }

    public void dispatchingValue(LiveData<T>.ObserverWrapper observerWrapper) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (observerWrapper != null) {
                considerNotify(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper>.IteratorWithAdditions iteratorWithAdditions = this.mObservers.iteratorWithAdditions();
                while (iteratorWithAdditions.hasNext()) {
                    considerNotify((ObserverWrapper) iteratorWithAdditions.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t11 = (T) this.mData;
        if (t11 != NOT_SET) {
            return t11;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    @MainThread
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        LiveData<T>.ObserverWrapper observerWrapperPutIfAbsent = this.mObservers.putIfAbsent(observer, lifecycleBoundObserver);
        if (observerWrapperPutIfAbsent != null && !observerWrapperPutIfAbsent.isAttachedTo(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapperPutIfAbsent != null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
    }

    @MainThread
    public void observeForever(Observer<? super T> observer) {
        assertMainThread("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        LiveData<T>.ObserverWrapper observerWrapperPutIfAbsent = this.mObservers.putIfAbsent(observer, alwaysActiveObserver);
        if (observerWrapperPutIfAbsent instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapperPutIfAbsent != null) {
            return;
        }
        alwaysActiveObserver.activeStateChanged(true);
    }

    public void postValue(T t11) {
        boolean z11;
        synchronized (this.mDataLock) {
            z11 = this.mPendingData == NOT_SET;
            this.mPendingData = t11;
        }
        if (z11) {
            ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
        }
    }

    @MainThread
    public void removeObserver(Observer<? super T> observer) {
        assertMainThread("removeObserver");
        LiveData<T>.ObserverWrapper observerWrapperRemove = this.mObservers.remove(observer);
        if (observerWrapperRemove == null) {
            return;
        }
        observerWrapperRemove.detachObserver();
        observerWrapperRemove.activeStateChanged(false);
    }

    @MainThread
    public void removeObservers(LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        for (Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper> entry : this.mObservers) {
            if (entry.getValue().isAttachedTo(lifecycleOwner)) {
                removeObserver(entry.getKey());
            }
        }
    }

    public static void assertMainThread(String str) {
        if (ArchTaskExecutor.getInstance().isMainThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    @MainThread
    public void setValue(T t11) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t11;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                synchronized (LiveData.this.mDataLock) {
                    obj2 = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj2);
            }
        };
        this.mData = obj;
        this.mVersion = -1;
    }

    public void onActive() {
    }

    public void onInactive() {
    }
}
