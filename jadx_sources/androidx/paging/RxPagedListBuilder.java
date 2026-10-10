package androidx.paging;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.functions.Cancellable;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public final class RxPagedListBuilder<Key, Value> {
    private PagedList.BoundaryCallback mBoundaryCallback;
    private PagedList.Config mConfig;
    private DataSource.Factory<Key, Value> mDataSourceFactory;
    private Executor mFetchExecutor;
    private Scheduler mFetchScheduler;
    private Key mInitialLoadKey;
    private Executor mNotifyExecutor;
    private Scheduler mNotifyScheduler;

    public static class PagingObservableOnSubscribe<Key, Value> implements ObservableOnSubscribe<PagedList<Value>>, DataSource.InvalidatedCallback, Cancellable, Runnable {

        @Nullable
        private final PagedList.BoundaryCallback mBoundaryCallback;

        @NonNull
        private final PagedList.Config mConfig;

        @Nullable
        private DataSource<Key, Value> mDataSource;

        @NonNull
        private final DataSource.Factory<Key, Value> mDataSourceFactory;
        private ObservableEmitter<PagedList<Value>> mEmitter;

        @NonNull
        private final Executor mFetchExecutor;

        @Nullable
        private final Key mInitialLoadKey;

        @Nullable
        private PagedList<Value> mList;

        @NonNull
        private final Executor mNotifyExecutor;

        private PagedList<Value> createPagedList() {
            PagedList<Value> pagedListBuild;
            Key key = this.mInitialLoadKey;
            PagedList<Value> pagedList = this.mList;
            if (pagedList != null) {
                key = (Key) pagedList.getLastKey();
            }
            do {
                DataSource<Key, Value> dataSource = this.mDataSource;
                if (dataSource != null) {
                    dataSource.removeInvalidatedCallback(this);
                }
                DataSource<Key, Value> dataSourceCreate = this.mDataSourceFactory.create();
                this.mDataSource = dataSourceCreate;
                dataSourceCreate.addInvalidatedCallback(this);
                pagedListBuild = new PagedList.Builder(this.mDataSource, this.mConfig).setNotifyExecutor(this.mNotifyExecutor).setFetchExecutor(this.mFetchExecutor).setBoundaryCallback(this.mBoundaryCallback).setInitialKey(key).build();
                this.mList = pagedListBuild;
            } while (pagedListBuild.isDetached());
            return this.mList;
        }

        @Override // io.reactivex.functions.Cancellable
        public void cancel() throws Exception {
            DataSource<Key, Value> dataSource = this.mDataSource;
            if (dataSource != null) {
                dataSource.removeInvalidatedCallback(this);
            }
        }

        @Override // androidx.paging.DataSource.InvalidatedCallback
        public void onInvalidated() {
            if (this.mEmitter.getDisposed()) {
                return;
            }
            this.mFetchExecutor.execute(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mEmitter.onNext(createPagedList());
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<PagedList<Value>> observableEmitter) throws Exception {
            this.mEmitter = observableEmitter;
            observableEmitter.setCancellable(this);
            this.mEmitter.onNext(createPagedList());
        }

        public PagingObservableOnSubscribe(@Nullable Key key, @NonNull PagedList.Config config, @Nullable PagedList.BoundaryCallback boundaryCallback, @NonNull DataSource.Factory<Key, Value> factory, @NonNull Executor executor, @NonNull Executor executor2) {
            this.mInitialLoadKey = key;
            this.mConfig = config;
            this.mBoundaryCallback = boundaryCallback;
            this.mDataSourceFactory = factory;
            this.mNotifyExecutor = executor;
            this.mFetchExecutor = executor2;
        }
    }

    public RxPagedListBuilder(@NonNull DataSource.Factory<Key, Value> factory, @NonNull PagedList.Config config) {
        if (config == null) {
            throw new IllegalArgumentException("PagedList.Config must be provided");
        }
        if (factory == null) {
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        }
        this.mDataSourceFactory = factory;
        this.mConfig = config;
    }

    @NonNull
    @SuppressLint({"RestrictedApi"})
    public Observable<PagedList<Value>> buildObservable() {
        if (this.mNotifyExecutor == null) {
            Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
            this.mNotifyExecutor = mainThreadExecutor;
            this.mNotifyScheduler = Schedulers.from(mainThreadExecutor);
        }
        if (this.mFetchExecutor == null) {
            Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
            this.mFetchExecutor = iOThreadExecutor;
            this.mFetchScheduler = Schedulers.from(iOThreadExecutor);
        }
        return Observable.create(new PagingObservableOnSubscribe(this.mInitialLoadKey, this.mConfig, this.mBoundaryCallback, this.mDataSourceFactory, this.mNotifyExecutor, this.mFetchExecutor)).observeOn(this.mNotifyScheduler).subscribeOn(this.mFetchScheduler);
    }

    @NonNull
    public RxPagedListBuilder<Key, Value> setBoundaryCallback(@Nullable PagedList.BoundaryCallback<Value> boundaryCallback) {
        this.mBoundaryCallback = boundaryCallback;
        return this;
    }

    @NonNull
    public RxPagedListBuilder<Key, Value> setFetchScheduler(@NonNull final Scheduler scheduler) {
        this.mFetchExecutor = new Executor() { // from class: androidx.paging.RxPagedListBuilder.2
            @Override // java.util.concurrent.Executor
            public void execute(@NonNull Runnable runnable) {
                scheduler.scheduleDirect(runnable);
            }
        };
        this.mFetchScheduler = scheduler;
        return this;
    }

    @NonNull
    public RxPagedListBuilder<Key, Value> setInitialLoadKey(@Nullable Key key) {
        this.mInitialLoadKey = key;
        return this;
    }

    @NonNull
    public RxPagedListBuilder<Key, Value> setNotifyScheduler(@NonNull Scheduler scheduler) {
        this.mNotifyScheduler = scheduler;
        final Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        this.mNotifyExecutor = new Executor() { // from class: androidx.paging.RxPagedListBuilder.1
            @Override // java.util.concurrent.Executor
            public void execute(@NonNull Runnable runnable) {
                workerCreateWorker.schedule(runnable);
            }
        };
        return this;
    }

    @NonNull
    public Flowable<PagedList<Value>> buildFlowable(@NonNull BackpressureStrategy backpressureStrategy) {
        return buildObservable().toFlowable(backpressureStrategy);
    }

    public RxPagedListBuilder(@NonNull DataSource.Factory<Key, Value> factory, int i11) {
        this(factory, new PagedList.Config.Builder().setPageSize(i11).build());
    }
}
