package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
class WrapperPageKeyedDataSource<K, A, B> extends PageKeyedDataSource<K, B> {
    final Function<List<A>, List<B>> mListFunction;
    private final PageKeyedDataSource<K, A> mSource;

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
        this.mSource.addInvalidatedCallback(invalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.mSource.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.mSource.isInvalid();
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadAfter(@NonNull PageKeyedDataSource.LoadParams<K> loadParams, @NonNull final PageKeyedDataSource.LoadCallback<K, B> loadCallback) {
        this.mSource.loadAfter(loadParams, new PageKeyedDataSource.LoadCallback<K, A>() { // from class: androidx.paging.WrapperPageKeyedDataSource.3
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(@NonNull List<A> list, @Nullable K k11) {
                loadCallback.onResult(DataSource.convert(WrapperPageKeyedDataSource.this.mListFunction, list), k11);
            }
        });
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadBefore(@NonNull PageKeyedDataSource.LoadParams<K> loadParams, @NonNull final PageKeyedDataSource.LoadCallback<K, B> loadCallback) {
        this.mSource.loadBefore(loadParams, new PageKeyedDataSource.LoadCallback<K, A>() { // from class: androidx.paging.WrapperPageKeyedDataSource.2
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(@NonNull List<A> list, @Nullable K k11) {
                loadCallback.onResult(DataSource.convert(WrapperPageKeyedDataSource.this.mListFunction, list), k11);
            }
        });
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadInitial(@NonNull PageKeyedDataSource.LoadInitialParams<K> loadInitialParams, @NonNull final PageKeyedDataSource.LoadInitialCallback<K, B> loadInitialCallback) {
        this.mSource.loadInitial(loadInitialParams, new PageKeyedDataSource.LoadInitialCallback<K, A>() { // from class: androidx.paging.WrapperPageKeyedDataSource.1
            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(@NonNull List<A> list, int i11, int i12, @Nullable K k11, @Nullable K k12) {
                loadInitialCallback.onResult(DataSource.convert(WrapperPageKeyedDataSource.this.mListFunction, list), i11, i12, k11, k12);
            }

            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(@NonNull List<A> list, @Nullable K k11, @Nullable K k12) {
                loadInitialCallback.onResult(DataSource.convert(WrapperPageKeyedDataSource.this.mListFunction, list), k11, k12);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
        this.mSource.removeInvalidatedCallback(invalidatedCallback);
    }

    public WrapperPageKeyedDataSource(PageKeyedDataSource<K, A> pageKeyedDataSource, Function<List<A>, List<B>> function) {
        this.mSource = pageKeyedDataSource;
        this.mListFunction = function;
    }
}
