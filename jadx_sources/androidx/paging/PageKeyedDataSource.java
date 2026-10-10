package androidx.paging;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public abstract class PageKeyedDataSource<Key, Value> extends ContiguousDataSource<Key, Value> {
    private final Object mKeyLock = new Object();

    @Nullable
    @GuardedBy("mKeyLock")
    private Key mNextKey = null;

    @Nullable
    @GuardedBy("mKeyLock")
    private Key mPreviousKey = null;

    public static abstract class LoadCallback<Key, Value> {
        public abstract void onResult(@NonNull List<Value> list, @Nullable Key key);
    }

    public static class LoadCallbackImpl<Key, Value> extends LoadCallback<Key, Value> {
        final DataSource.LoadCallbackHelper<Value> mCallbackHelper;
        private final PageKeyedDataSource<Key, Value> mDataSource;

        @Override // androidx.paging.PageKeyedDataSource.LoadCallback
        public void onResult(@NonNull List<Value> list, @Nullable Key key) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            if (this.mCallbackHelper.mResultType == 1) {
                this.mDataSource.setNextKey(key);
            } else {
                this.mDataSource.setPreviousKey(key);
            }
            this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, 0, 0, 0));
        }

        public LoadCallbackImpl(@NonNull PageKeyedDataSource<Key, Value> pageKeyedDataSource, int i11, @Nullable Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(pageKeyedDataSource, i11, executor, receiver);
            this.mDataSource = pageKeyedDataSource;
        }
    }

    public static abstract class LoadInitialCallback<Key, Value> {
        public abstract void onResult(@NonNull List<Value> list, int i11, int i12, @Nullable Key key, @Nullable Key key2);

        public abstract void onResult(@NonNull List<Value> list, @Nullable Key key, @Nullable Key key2);
    }

    @Override // androidx.paging.ContiguousDataSource
    @Nullable
    public final Key getKey(int i11, Value value) {
        return null;
    }

    public abstract void loadAfter(@NonNull LoadParams<Key> loadParams, @NonNull LoadCallback<Key, Value> loadCallback);

    public abstract void loadBefore(@NonNull LoadParams<Key> loadParams, @NonNull LoadCallback<Key, Value> loadCallback);

    public abstract void loadInitial(@NonNull LoadInitialParams<Key> loadInitialParams, @NonNull LoadInitialCallback<Key, Value> loadInitialCallback);

    @Override // androidx.paging.ContiguousDataSource
    public boolean supportsPageDropping() {
        return false;
    }

    public static class LoadInitialCallbackImpl<Key, Value> extends LoadInitialCallback<Key, Value> {
        final DataSource.LoadCallbackHelper<Value> mCallbackHelper;
        private final boolean mCountingEnabled;
        private final PageKeyedDataSource<Key, Value> mDataSource;

        @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
        public void onResult(@NonNull List<Value> list, int i11, int i12, @Nullable Key key, @Nullable Key key2) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            DataSource.LoadCallbackHelper.validateInitialLoadParams(list, i11, i12);
            this.mDataSource.initKeys(key, key2);
            int size = (i12 - i11) - list.size();
            if (this.mCountingEnabled) {
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, i11, size, 0));
            } else {
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, i11));
            }
        }

        public LoadInitialCallbackImpl(@NonNull PageKeyedDataSource<Key, Value> pageKeyedDataSource, boolean z11, @NonNull PageResult.Receiver<Value> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(pageKeyedDataSource, 0, null, receiver);
            this.mDataSource = pageKeyedDataSource;
            this.mCountingEnabled = z11;
        }

        @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
        public void onResult(@NonNull List<Value> list, @Nullable Key key, @Nullable Key key2) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            this.mDataSource.initKeys(key, key2);
            this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, 0, 0, 0));
        }
    }

    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;

        public LoadInitialParams(int i11, boolean z11) {
            this.requestedLoadSize = i11;
            this.placeholdersEnabled = z11;
        }
    }

    public static class LoadParams<Key> {

        @NonNull
        public final Key key;
        public final int requestedLoadSize;

        public LoadParams(@NonNull Key key, int i11) {
            this.key = key;
            this.requestedLoadSize = i11;
        }
    }

    @Nullable
    private Key getNextKey() {
        Key key;
        synchronized (this.mKeyLock) {
            key = this.mNextKey;
        }
        return key;
    }

    @Nullable
    private Key getPreviousKey() {
        Key key;
        synchronized (this.mKeyLock) {
            key = this.mPreviousKey;
        }
        return key;
    }

    @Override // androidx.paging.ContiguousDataSource
    public final void dispatchLoadInitial(@Nullable Key key, int i11, int i12, boolean z11, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        LoadInitialCallbackImpl loadInitialCallbackImpl = new LoadInitialCallbackImpl(this, z11, receiver);
        loadInitial(new LoadInitialParams<>(i11, z11), loadInitialCallbackImpl);
        loadInitialCallbackImpl.mCallbackHelper.setPostExecutor(executor);
    }

    public void initKeys(@Nullable Key key, @Nullable Key key2) {
        synchronized (this.mKeyLock) {
            this.mPreviousKey = key;
            this.mNextKey = key2;
        }
    }

    @Override // androidx.paging.DataSource
    @NonNull
    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(@NonNull Function<Value, ToValue> function) {
        return mapByPage((Function) DataSource.createListFunction(function));
    }

    @Override // androidx.paging.DataSource
    @NonNull
    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(@NonNull Function<List<Value>, List<ToValue>> function) {
        return new WrapperPageKeyedDataSource(this, function);
    }

    public void setNextKey(@Nullable Key key) {
        synchronized (this.mKeyLock) {
            this.mNextKey = key;
        }
    }

    public void setPreviousKey(@Nullable Key key) {
        synchronized (this.mKeyLock) {
            this.mPreviousKey = key;
        }
    }

    @Override // androidx.paging.ContiguousDataSource
    public final void dispatchLoadAfter(int i11, @NonNull Value value, int i12, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        Key nextKey = getNextKey();
        if (nextKey != null) {
            loadAfter(new LoadParams<>(nextKey, i12), new LoadCallbackImpl(this, 1, executor, receiver));
        } else {
            receiver.onPageResult(1, PageResult.getEmptyResult());
        }
    }

    @Override // androidx.paging.ContiguousDataSource
    public final void dispatchLoadBefore(int i11, @NonNull Value value, int i12, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        Key previousKey = getPreviousKey();
        if (previousKey != null) {
            loadBefore(new LoadParams<>(previousKey, i12), new LoadCallbackImpl(this, 2, executor, receiver));
        } else {
            receiver.onPageResult(2, PageResult.getEmptyResult());
        }
    }
}
