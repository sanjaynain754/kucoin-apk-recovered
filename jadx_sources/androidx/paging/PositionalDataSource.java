package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {

    public static class ContiguousWithoutPlaceholdersWrapper<Value> extends ContiguousDataSource<Integer, Value> {

        @NonNull
        final PositionalDataSource<Value> mSource;

        @Override // androidx.paging.DataSource
        public void addInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
            this.mSource.addInvalidatedCallback(invalidatedCallback);
        }

        @Override // androidx.paging.ContiguousDataSource
        public void dispatchLoadAfter(int i11, @NonNull Value value, int i12, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            this.mSource.dispatchLoadRange(1, i11 + 1, i12, executor, receiver);
        }

        @Override // androidx.paging.ContiguousDataSource
        public void dispatchLoadBefore(int i11, @NonNull Value value, int i12, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            int i13 = i11 - 1;
            if (i13 < 0) {
                this.mSource.dispatchLoadRange(2, i13, 0, executor, receiver);
                return;
            }
            int iMin = Math.min(i12, i11);
            this.mSource.dispatchLoadRange(2, (i13 - iMin) + 1, iMin, executor, receiver);
        }

        @Override // androidx.paging.ContiguousDataSource
        public void dispatchLoadInitial(@Nullable Integer num, int i11, int i12, boolean z11, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            Integer numValueOf;
            if (num == null) {
                numValueOf = 0;
            } else {
                i11 = Math.max(i11 / i12, 2) * i12;
                numValueOf = Integer.valueOf(Math.max(0, ((num.intValue() - (i11 / 2)) / i12) * i12));
            }
            this.mSource.dispatchLoadInitial(false, numValueOf.intValue(), i11, i12, executor, receiver);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.paging.ContiguousDataSource
        public Integer getKey(int i11, Value value) {
            return Integer.valueOf(i11);
        }

        @Override // androidx.paging.DataSource
        public void invalidate() {
            this.mSource.invalidate();
        }

        @Override // androidx.paging.DataSource
        public boolean isInvalid() {
            return this.mSource.isInvalid();
        }

        @Override // androidx.paging.DataSource
        @NonNull
        public <ToValue> DataSource<Integer, ToValue> map(@NonNull Function<Value, ToValue> function) {
            throw new UnsupportedOperationException("Inaccessible inner type doesn't support map op");
        }

        @Override // androidx.paging.DataSource
        @NonNull
        public <ToValue> DataSource<Integer, ToValue> mapByPage(@NonNull Function<List<Value>, List<ToValue>> function) {
            throw new UnsupportedOperationException("Inaccessible inner type doesn't support map op");
        }

        @Override // androidx.paging.DataSource
        public void removeInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
            this.mSource.removeInvalidatedCallback(invalidatedCallback);
        }

        public ContiguousWithoutPlaceholdersWrapper(@NonNull PositionalDataSource<Value> positionalDataSource) {
            this.mSource = positionalDataSource;
        }
    }

    public static abstract class LoadInitialCallback<T> {
        public abstract void onResult(@NonNull List<T> list, int i11);

        public abstract void onResult(@NonNull List<T> list, int i11, int i12);
    }

    public static abstract class LoadRangeCallback<T> {
        public abstract void onResult(@NonNull List<T> list);
    }

    public static class LoadRangeCallbackImpl<T> extends LoadRangeCallback<T> {
        private DataSource.LoadCallbackHelper<T> mCallbackHelper;
        private final int mPositionOffset;

        @Override // androidx.paging.PositionalDataSource.LoadRangeCallback
        public void onResult(@NonNull List<T> list) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, 0, 0, this.mPositionOffset));
        }

        public LoadRangeCallbackImpl(@NonNull PositionalDataSource positionalDataSource, int i11, int i12, Executor executor, PageResult.Receiver<T> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(positionalDataSource, i11, executor, receiver);
            this.mPositionOffset = i12;
        }
    }

    public static int computeInitialLoadSize(@NonNull LoadInitialParams loadInitialParams, int i11, int i12) {
        return Math.min(i12 - i11, loadInitialParams.requestedLoadSize);
    }

    @Override // androidx.paging.DataSource
    public boolean isContiguous() {
        return false;
    }

    @WorkerThread
    public abstract void loadInitial(@NonNull LoadInitialParams loadInitialParams, @NonNull LoadInitialCallback<T> loadInitialCallback);

    @WorkerThread
    public abstract void loadRange(@NonNull LoadRangeParams loadRangeParams, @NonNull LoadRangeCallback<T> loadRangeCallback);

    public static class LoadInitialCallbackImpl<T> extends LoadInitialCallback<T> {
        final DataSource.LoadCallbackHelper<T> mCallbackHelper;
        private final boolean mCountingEnabled;
        private final int mPageSize;

        @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
        public void onResult(@NonNull List<T> list, int i11, int i12) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            DataSource.LoadCallbackHelper.validateInitialLoadParams(list, i11, i12);
            if (list.size() + i11 == i12 || list.size() % this.mPageSize == 0) {
                if (!this.mCountingEnabled) {
                    this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, i11));
                    return;
                } else {
                    this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, i11, (i12 - i11) - list.size(), 0));
                    return;
                }
            }
            throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + list.size() + ", position " + i11 + ", totalCount " + i12 + ", pageSize " + this.mPageSize);
        }

        public LoadInitialCallbackImpl(@NonNull PositionalDataSource positionalDataSource, boolean z11, int i11, PageResult.Receiver<T> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(positionalDataSource, 0, null, receiver);
            this.mCountingEnabled = z11;
            this.mPageSize = i11;
            if (i11 >= 1) {
            } else {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }

        @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
        public void onResult(@NonNull List<T> list, int i11) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            if (i11 >= 0) {
                if (list.isEmpty() && i11 != 0) {
                    throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
                }
                if (!this.mCountingEnabled) {
                    this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, i11));
                    return;
                }
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
            throw new IllegalArgumentException("Position must be non-negative");
        }
    }

    public static class LoadInitialParams {
        public final int pageSize;
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;
        public final int requestedStartPosition;

        public LoadInitialParams(int i11, int i12, int i13, boolean z11) {
            this.requestedStartPosition = i11;
            this.requestedLoadSize = i12;
            this.pageSize = i13;
            this.placeholdersEnabled = z11;
        }
    }

    public static class LoadRangeParams {
        public final int loadSize;
        public final int startPosition;

        public LoadRangeParams(int i11, int i12) {
            this.startPosition = i11;
            this.loadSize = i12;
        }
    }

    public static int computeInitialLoadPosition(@NonNull LoadInitialParams loadInitialParams, int i11) {
        int i12 = loadInitialParams.requestedStartPosition;
        int i13 = loadInitialParams.requestedLoadSize;
        int i14 = loadInitialParams.pageSize;
        return Math.max(0, Math.min(((((i11 - i13) + i14) - 1) / i14) * i14, (i12 / i14) * i14));
    }

    public final void dispatchLoadInitial(boolean z11, int i11, int i12, int i13, @NonNull Executor executor, @NonNull PageResult.Receiver<T> receiver) {
        LoadInitialCallbackImpl loadInitialCallbackImpl = new LoadInitialCallbackImpl(this, z11, i13, receiver);
        loadInitial(new LoadInitialParams(i11, i12, i13, z11), loadInitialCallbackImpl);
        loadInitialCallbackImpl.mCallbackHelper.setPostExecutor(executor);
    }

    public final void dispatchLoadRange(int i11, int i12, int i13, @NonNull Executor executor, @NonNull PageResult.Receiver<T> receiver) {
        LoadRangeCallbackImpl loadRangeCallbackImpl = new LoadRangeCallbackImpl(this, i11, i12, executor, receiver);
        if (i13 == 0) {
            loadRangeCallbackImpl.onResult(Collections.EMPTY_LIST);
        } else {
            loadRange(new LoadRangeParams(i12, i13), loadRangeCallbackImpl);
        }
    }

    @Override // androidx.paging.DataSource
    @NonNull
    public final <V> PositionalDataSource<V> map(@NonNull Function<T, V> function) {
        return mapByPage((Function) DataSource.createListFunction(function));
    }

    @Override // androidx.paging.DataSource
    @NonNull
    public final <V> PositionalDataSource<V> mapByPage(@NonNull Function<List<T>, List<V>> function) {
        return new WrapperPositionalDataSource(this, function);
    }

    @NonNull
    public ContiguousDataSource<Integer, T> wrapAsContiguousWithoutPlaceholders() {
        return new ContiguousWithoutPlaceholdersWrapper(this);
    }
}
