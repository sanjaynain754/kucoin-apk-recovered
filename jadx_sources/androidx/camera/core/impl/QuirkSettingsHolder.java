package androidx.camera.core.impl;

import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.core.util.Consumer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class QuirkSettingsHolder {
    public static final QuirkSettings DEFAULT = QuirkSettings.withDefaultBehavior();
    private static final QuirkSettingsHolder sInstance = new QuirkSettingsHolder();
    private final MutableStateObservable<QuirkSettings> mObservable = MutableStateObservable.withInitialState(DEFAULT);

    public static class ObserverToConsumerAdapter<T> implements Observable.Observer<T> {
        private static final String TAG = "ObserverToConsumerAdapter";
        private final Consumer<T> mDelegate;

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th2) {
            Logger.m1869e(TAG, "Unexpected error in Observable", th2);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(T t11) {
            this.mDelegate.accept(t11);
        }

        public ObserverToConsumerAdapter(Consumer<T> consumer) {
            this.mDelegate = consumer;
        }
    }

    public static QuirkSettingsHolder instance() {
        return sInstance;
    }

    public QuirkSettings get() {
        try {
            return this.mObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e11);
        }
    }

    public void observe(Executor executor, Consumer<QuirkSettings> consumer) {
        this.mObservable.addObserver(executor, new ObserverToConsumerAdapter(consumer));
    }

    @VisibleForTesting
    public void reset() {
        this.mObservable.removeObservers();
        this.mObservable.setState(DEFAULT);
    }

    public void set(QuirkSettings quirkSettings) {
        this.mObservable.setState(quirkSettings);
    }
}
