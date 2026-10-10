package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public abstract class ItemKeyedDataSource<Key, Value> extends ContiguousDataSource<Key, Value> {

    public static abstract class LoadCallback<Value> {
        public abstract void onResult(@NonNull List<Value> list);
    }

    public static class LoadCallbackImpl<Value> extends LoadCallback<Value> {
        final DataSource.LoadCallbackHelper<Value> mCallbackHelper;

        @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
        public void onResult(@NonNull List<Value> list) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, 0, 0, 0));
        }

        public LoadCallbackImpl(@NonNull ItemKeyedDataSource itemKeyedDataSource, int i11, @Nullable Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(itemKeyedDataSource, i11, executor, receiver);
        }
    }

    public static abstract class LoadInitialCallback<Value> extends LoadCallback<Value> {
        public abstract void onResult(@NonNull List<Value> list, int i11, int i12);
    }

    @Override // androidx.paging.ContiguousDataSource
    @Nullable
    public final Key getKey(int i11, Value value) {
        if (value == null) {
            return null;
        }
        return getKey(value);
    }

    @NonNull
    public abstract Key getKey(@NonNull Value value);

    public abstract void loadAfter(@NonNull LoadParams<Key> loadParams, @NonNull LoadCallback<Value> loadCallback);

    public abstract void loadBefore(@NonNull LoadParams<Key> loadParams, @NonNull LoadCallback<Value> loadCallback);

    public abstract void loadInitial(@NonNull LoadInitialParams<Key> loadInitialParams, @NonNull LoadInitialCallback<Value> loadInitialCallback);

    public static class LoadInitialCallbackImpl<Value> extends LoadInitialCallback<Value> {
        final DataSource.LoadCallbackHelper<Value> mCallbackHelper;
        private final boolean mCountingEnabled;

        @Override // androidx.paging.ItemKeyedDataSource.LoadInitialCallback
        public void onResult(@NonNull List<Value> list, int i11, int i12) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            DataSource.LoadCallbackHelper.validateInitialLoadParams(list, i11, i12);
            int size = (i12 - i11) - list.size();
            if (this.mCountingEnabled) {
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, i11, size, 0));
            } else {
                this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, i11));
            }
        }

        public LoadInitialCallbackImpl(@NonNull ItemKeyedDataSource itemKeyedDataSource, boolean z11, @NonNull PageResult.Receiver<Value> receiver) {
            this.mCallbackHelper = new DataSource.LoadCallbackHelper<>(itemKeyedDataSource, 0, null, receiver);
            this.mCountingEnabled = z11;
        }

        @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
        public void onResult(@NonNull List<Value> list) {
            if (this.mCallbackHelper.dispatchInvalidResultIfInvalid()) {
                return;
            }
            this.mCallbackHelper.dispatchResultToReceiver(new PageResult<>(list, 0, 0, 0));
        }
    }

    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;

        @Nullable
        public final Key requestedInitialKey;
        public final int requestedLoadSize;

        public LoadInitialParams(@Nullable Key key, int i11, boolean z11) {
            this.requestedInitialKey = key;
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

    @Override // androidx.paging.ContiguousDataSource
    public final void dispatchLoadAfter(int i11, @NonNull Value value, int i12, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        loadAfter(new LoadParams<>(getKey(value), i12), new LoadCallbackImpl(this, 1, executor, receiver));
    }

    @Override // androidx.paging.ContiguousDataSource
    public final void dispatchLoadBefore(int i11, @NonNull Value value, int i12, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        loadBefore(new LoadParams<>(getKey(value), i12), new LoadCallbackImpl(this, 2, executor, receiver));
    }

    @Override // androidx.paging.ContiguousDataSource
    public final void dispatchLoadInitial(@Nullable Key key, int i11, int i12, boolean z11, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver) {
        LoadInitialCallbackImpl loadInitialCallbackImpl = new LoadInitialCallbackImpl(this, z11, receiver);
        loadInitial(new LoadInitialParams<>(key, i11, z11), loadInitialCallbackImpl);
        loadInitialCallbackImpl.mCallbackHelper.setPostExecutor(executor);
    }

    @Override // androidx.paging.DataSource
    @NonNull
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> map(@NonNull Function<Value, ToValue> function) {
        return mapByPage((Function) DataSource.createListFunction(function));
    }

    @Override // androidx.paging.DataSource
    @NonNull
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> mapByPage(@NonNull Function<List<Value>, List<ToValue>> function) {
        return new WrapperItemKeyedDataSource(this, function);
    }
}
