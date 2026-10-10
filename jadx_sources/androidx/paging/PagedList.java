package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes34.dex */
public abstract class PagedList<T> extends AbstractList<T> {

    @NonNull
    final Executor mBackgroundThreadExecutor;

    @Nullable
    final BoundaryCallback<T> mBoundaryCallback;

    @NonNull
    final Config mConfig;

    @NonNull
    final Executor mMainThreadExecutor;
    final int mRequiredRemainder;

    @NonNull
    final PagedStorage<T> mStorage;
    int mLastLoad = 0;
    T mLastItem = null;
    boolean mBoundaryCallbackBeginDeferred = false;
    boolean mBoundaryCallbackEndDeferred = false;
    private int mLowestIndexAccessed = Integer.MAX_VALUE;
    private int mHighestIndexAccessed = Integer.MIN_VALUE;
    private final AtomicBoolean mDetached = new AtomicBoolean(false);
    private final ArrayList<WeakReference<Callback>> mCallbacks = new ArrayList<>();

    public static final class Builder<Key, Value> {
        private BoundaryCallback mBoundaryCallback;
        private final Config mConfig;
        private final DataSource<Key, Value> mDataSource;
        private Executor mFetchExecutor;
        private Key mInitialKey;
        private Executor mNotifyExecutor;

        public Builder(@NonNull DataSource<Key, Value> dataSource, @NonNull Config config) {
            if (dataSource == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            }
            if (config == null) {
                throw new IllegalArgumentException("Config may not be null");
            }
            this.mDataSource = dataSource;
            this.mConfig = config;
        }

        @NonNull
        @WorkerThread
        public PagedList<Value> build() {
            Executor executor = this.mNotifyExecutor;
            if (executor == null) {
                throw new IllegalArgumentException("MainThreadExecutor required");
            }
            Executor executor2 = this.mFetchExecutor;
            if (executor2 != null) {
                return PagedList.create(this.mDataSource, executor, executor2, this.mBoundaryCallback, this.mConfig, this.mInitialKey);
            }
            throw new IllegalArgumentException("BackgroundThreadExecutor required");
        }

        @NonNull
        public Builder<Key, Value> setBoundaryCallback(@Nullable BoundaryCallback boundaryCallback) {
            this.mBoundaryCallback = boundaryCallback;
            return this;
        }

        @NonNull
        public Builder<Key, Value> setFetchExecutor(@NonNull Executor executor) {
            this.mFetchExecutor = executor;
            return this;
        }

        @NonNull
        public Builder<Key, Value> setInitialKey(@Nullable Key key) {
            this.mInitialKey = key;
            return this;
        }

        @NonNull
        public Builder<Key, Value> setNotifyExecutor(@NonNull Executor executor) {
            this.mNotifyExecutor = executor;
            return this;
        }

        public Builder(@NonNull DataSource<Key, Value> dataSource, int i11) {
            this(dataSource, new Config.Builder().setPageSize(i11).build());
        }
    }

    public static abstract class Callback {
        public abstract void onChanged(int i11, int i12);

        public abstract void onInserted(int i11, int i12);

        public abstract void onRemoved(int i11, int i12);
    }

    public abstract void dispatchUpdatesSinceSnapshot(@NonNull PagedList<T> pagedList, @NonNull Callback callback);

    @NonNull
    public abstract DataSource<?, T> getDataSource();

    @Nullable
    public abstract Object getLastKey();

    public abstract boolean isContiguous();

    public abstract void loadAroundInternal(int i11);

    public static class Config {
        public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;
        public final boolean enablePlaceholders;
        public final int initialLoadSizeHint;
        public final int maxSize;
        public final int pageSize;
        public final int prefetchDistance;

        public static final class Builder {
            static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
            private int mPageSize = -1;
            private int mPrefetchDistance = -1;
            private int mInitialLoadSizeHint = -1;
            private boolean mEnablePlaceholders = true;
            private int mMaxSize = Integer.MAX_VALUE;

            @NonNull
            public Builder setPageSize(@IntRange(from = 1) int i11) {
                if (i11 < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.mPageSize = i11;
                return this;
            }

            @NonNull
            public Config build() {
                if (this.mPrefetchDistance < 0) {
                    this.mPrefetchDistance = this.mPageSize;
                }
                if (this.mInitialLoadSizeHint < 0) {
                    this.mInitialLoadSizeHint = this.mPageSize * 3;
                }
                boolean z11 = this.mEnablePlaceholders;
                if (!z11 && this.mPrefetchDistance == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i11 = this.mMaxSize;
                if (i11 == Integer.MAX_VALUE || i11 >= this.mPageSize + (this.mPrefetchDistance * 2)) {
                    return new Config(this.mPageSize, this.mPrefetchDistance, z11, this.mInitialLoadSizeHint, i11);
                }
                throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.mPageSize + ", prefetchDist=" + this.mPrefetchDistance + ", maxSize=" + this.mMaxSize);
            }

            @NonNull
            public Builder setEnablePlaceholders(boolean z11) {
                this.mEnablePlaceholders = z11;
                return this;
            }

            @NonNull
            public Builder setInitialLoadSizeHint(@IntRange(from = 1) int i11) {
                this.mInitialLoadSizeHint = i11;
                return this;
            }

            @NonNull
            public Builder setMaxSize(@IntRange(from = 2) int i11) {
                this.mMaxSize = i11;
                return this;
            }

            @NonNull
            public Builder setPrefetchDistance(@IntRange(from = 0) int i11) {
                this.mPrefetchDistance = i11;
                return this;
            }
        }

        public Config(int i11, int i12, boolean z11, int i13, int i14) {
            this.pageSize = i11;
            this.prefetchDistance = i12;
            this.enablePlaceholders = z11;
            this.initialLoadSizeHint = i13;
            this.maxSize = i14;
        }
    }

    public void addWeakCallback(@Nullable List<T> list, @NonNull Callback callback) {
        if (list != null && list != this) {
            if (!list.isEmpty()) {
                dispatchUpdatesSinceSnapshot((PagedList) list, callback);
            } else if (!this.mStorage.isEmpty()) {
                callback.onInserted(0, this.mStorage.size());
            }
        }
        for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
            if (this.mCallbacks.get(size).get() == null) {
                this.mCallbacks.remove(size);
            }
        }
        this.mCallbacks.add(new WeakReference<>(callback));
    }

    @AnyThread
    public void deferBoundaryCallbacks(final boolean z11, final boolean z12, final boolean z13) {
        if (this.mBoundaryCallback == null) {
            throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.mLowestIndexAccessed == Integer.MAX_VALUE) {
            this.mLowestIndexAccessed = this.mStorage.size();
        }
        if (this.mHighestIndexAccessed == Integer.MIN_VALUE) {
            this.mHighestIndexAccessed = 0;
        }
        if (z11 || z12 || z13) {
            this.mMainThreadExecutor.execute(new Runnable() { // from class: androidx.paging.PagedList.1
                @Override // java.lang.Runnable
                public void run() {
                    if (z11) {
                        PagedList.this.mBoundaryCallback.onZeroItemsLoaded();
                    }
                    if (z12) {
                        PagedList.this.mBoundaryCallbackBeginDeferred = true;
                    }
                    if (z13) {
                        PagedList.this.mBoundaryCallbackEndDeferred = true;
                    }
                    PagedList.this.tryDispatchBoundaryCallbacks(false);
                }
            });
        }
    }

    public void detach() {
        this.mDetached.set(true);
    }

    public void dispatchBoundaryCallbacks(boolean z11, boolean z12) {
        if (z11) {
            this.mBoundaryCallback.onItemAtFrontLoaded(this.mStorage.getFirstLoadedItem());
        }
        if (z12) {
            this.mBoundaryCallback.onItemAtEndLoaded(this.mStorage.getLastLoadedItem());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    @Nullable
    public T get(int i11) {
        T t11 = this.mStorage.get(i11);
        if (t11 != null) {
            this.mLastItem = t11;
        }
        return t11;
    }

    @NonNull
    public Config getConfig() {
        return this.mConfig;
    }

    public int getLoadedCount() {
        return this.mStorage.getLoadedCount();
    }

    public int getPositionOffset() {
        return this.mStorage.getPositionOffset();
    }

    public boolean isDetached() {
        return this.mDetached.get();
    }

    public void loadAround(int i11) {
        if (i11 < 0 || i11 >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + size());
        }
        this.mLastLoad = getPositionOffset() + i11;
        loadAroundInternal(i11);
        this.mLowestIndexAccessed = Math.min(this.mLowestIndexAccessed, i11);
        this.mHighestIndexAccessed = Math.max(this.mHighestIndexAccessed, i11);
        tryDispatchBoundaryCallbacks(true);
    }

    public void notifyChanged(int i11, int i12) {
        if (i12 != 0) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                Callback callback = this.mCallbacks.get(size).get();
                if (callback != null) {
                    callback.onChanged(i11, i12);
                }
            }
        }
    }

    public void notifyInserted(int i11, int i12) {
        if (i12 != 0) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                Callback callback = this.mCallbacks.get(size).get();
                if (callback != null) {
                    callback.onInserted(i11, i12);
                }
            }
        }
    }

    public void notifyRemoved(int i11, int i12) {
        if (i12 != 0) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                Callback callback = this.mCallbacks.get(size).get();
                if (callback != null) {
                    callback.onRemoved(i11, i12);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void offsetAccessIndices(int i11) {
        this.mLastLoad += i11;
        this.mLowestIndexAccessed += i11;
        this.mHighestIndexAccessed += i11;
    }

    public void removeWeakCallback(@NonNull Callback callback) {
        for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
            Callback callback2 = this.mCallbacks.get(size).get();
            if (callback2 == null || callback2 == callback) {
                this.mCallbacks.remove(size);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mStorage.size();
    }

    public void tryDispatchBoundaryCallbacks(boolean z11) {
        final boolean z12 = this.mBoundaryCallbackBeginDeferred && this.mLowestIndexAccessed <= this.mConfig.prefetchDistance;
        final boolean z13 = this.mBoundaryCallbackEndDeferred && this.mHighestIndexAccessed >= (size() - 1) - this.mConfig.prefetchDistance;
        if (z12 || z13) {
            if (z12) {
                this.mBoundaryCallbackBeginDeferred = false;
            }
            if (z13) {
                this.mBoundaryCallbackEndDeferred = false;
            }
            if (z11) {
                this.mMainThreadExecutor.execute(new Runnable() { // from class: androidx.paging.PagedList.2
                    @Override // java.lang.Runnable
                    public void run() {
                        PagedList.this.dispatchBoundaryCallbacks(z12, z13);
                    }
                });
            } else {
                dispatchBoundaryCallbacks(z12, z13);
            }
        }
    }

    public PagedList(@NonNull PagedStorage<T> pagedStorage, @NonNull Executor executor, @NonNull Executor executor2, @Nullable BoundaryCallback<T> boundaryCallback, @NonNull Config config) {
        this.mStorage = pagedStorage;
        this.mMainThreadExecutor = executor;
        this.mBackgroundThreadExecutor = executor2;
        this.mBoundaryCallback = boundaryCallback;
        this.mConfig = config;
        this.mRequiredRemainder = (config.prefetchDistance * 2) + config.pageSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <K, T> PagedList<T> create(@NonNull DataSource<K, T> dataSource, @NonNull Executor executor, @NonNull Executor executor2, @Nullable BoundaryCallback<T> boundaryCallback, @NonNull Config config, @Nullable K k11) {
        int iIntValue;
        if (!dataSource.isContiguous() && config.enablePlaceholders) {
            PositionalDataSource positionalDataSource = (PositionalDataSource) dataSource;
            if (k11 != 0) {
                iIntValue = ((Integer) k11).intValue();
            } else {
                iIntValue = 0;
            }
            return new TiledPagedList(positionalDataSource, executor, executor2, boundaryCallback, config, iIntValue);
        }
        int iIntValue2 = -1;
        if (!dataSource.isContiguous()) {
            dataSource = ((PositionalDataSource) dataSource).wrapAsContiguousWithoutPlaceholders();
            if (k11 != 0) {
                iIntValue2 = ((Integer) k11).intValue();
            }
        }
        return new ContiguousPagedList((ContiguousDataSource) dataSource, executor, executor2, boundaryCallback, config, k11, iIntValue2);
    }

    public boolean isImmutable() {
        return isDetached();
    }

    @NonNull
    public List<T> snapshot() {
        if (isImmutable()) {
            return this;
        }
        return new SnapshotPagedList(this);
    }

    @MainThread
    public static abstract class BoundaryCallback<T> {
        public void onZeroItemsLoaded() {
        }

        public void onItemAtEndLoaded(@NonNull T t11) {
        }

        public void onItemAtFrontLoaded(@NonNull T t11) {
        }
    }
}
