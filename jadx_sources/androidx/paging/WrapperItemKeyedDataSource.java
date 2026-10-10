package androidx.paging;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
class WrapperItemKeyedDataSource<K, A, B> extends ItemKeyedDataSource<K, B> {
    private final IdentityHashMap<B, K> mKeyMap = new IdentityHashMap<>();
    final Function<List<A>, List<B>> mListFunction;
    private final ItemKeyedDataSource<K, A> mSource;

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
        this.mSource.addInvalidatedCallback(invalidatedCallback);
    }

    public List<B> convertWithStashedKeys(List<A> list) {
        List<B> listConvert = DataSource.convert(this.mListFunction, list);
        synchronized (this.mKeyMap) {
            for (int i11 = 0; i11 < listConvert.size(); i11++) {
                try {
                    this.mKeyMap.put(listConvert.get(i11), this.mSource.getKey(list.get(i11)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return listConvert;
    }

    @Override // androidx.paging.ItemKeyedDataSource
    @NonNull
    public K getKey(@NonNull B b11) {
        K k11;
        synchronized (this.mKeyMap) {
            k11 = this.mKeyMap.get(b11);
        }
        return k11;
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.mSource.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.mSource.isInvalid();
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadAfter(@NonNull ItemKeyedDataSource.LoadParams<K> loadParams, @NonNull final ItemKeyedDataSource.LoadCallback<B> loadCallback) {
        this.mSource.loadAfter(loadParams, new ItemKeyedDataSource.LoadCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.2
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(@NonNull List<A> list) {
                loadCallback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(list));
            }
        });
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadBefore(@NonNull ItemKeyedDataSource.LoadParams<K> loadParams, @NonNull final ItemKeyedDataSource.LoadCallback<B> loadCallback) {
        this.mSource.loadBefore(loadParams, new ItemKeyedDataSource.LoadCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.3
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(@NonNull List<A> list) {
                loadCallback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(list));
            }
        });
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadInitial(@NonNull ItemKeyedDataSource.LoadInitialParams<K> loadInitialParams, @NonNull final ItemKeyedDataSource.LoadInitialCallback<B> loadInitialCallback) {
        this.mSource.loadInitial(loadInitialParams, new ItemKeyedDataSource.LoadInitialCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadInitialCallback
            public void onResult(@NonNull List<A> list, int i11, int i12) {
                loadInitialCallback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(list), i11, i12);
            }

            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(@NonNull List<A> list) {
                loadInitialCallback.onResult(WrapperItemKeyedDataSource.this.convertWithStashedKeys(list));
            }
        });
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NonNull DataSource.InvalidatedCallback invalidatedCallback) {
        this.mSource.removeInvalidatedCallback(invalidatedCallback);
    }

    public WrapperItemKeyedDataSource(ItemKeyedDataSource<K, A> itemKeyedDataSource, Function<List<A>, List<B>> function) {
        this.mSource = itemKeyedDataSource;
        this.mListFunction = function;
    }
}
