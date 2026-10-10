package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
class TiledPagedList<T> extends PagedList<T> implements PagedStorage.Callback {
    final PositionalDataSource<T> mDataSource;
    PageResult.Receiver<T> mReceiver;

    @Override // androidx.paging.PagedList
    public boolean isContiguous() {
        return false;
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onInitialized(int i11) {
        notifyInserted(0, i11);
    }

    @WorkerThread
    public TiledPagedList(@NonNull PositionalDataSource<T> positionalDataSource, @NonNull Executor executor, @NonNull Executor executor2, @Nullable PagedList.BoundaryCallback<T> boundaryCallback, @NonNull PagedList.Config config, int i11) {
        super(new PagedStorage(), executor, executor2, boundaryCallback, config);
        this.mReceiver = new PageResult.Receiver<T>() { // from class: androidx.paging.TiledPagedList.1
            @Override // androidx.paging.PageResult.Receiver
            @AnyThread
            public void onPageResult(int i12, @NonNull PageResult<T> pageResult) {
                boolean z11;
                boolean z12;
                if (pageResult.isInvalid()) {
                    TiledPagedList.this.detach();
                    return;
                }
                if (!TiledPagedList.this.isDetached()) {
                    if (i12 != 0 && i12 != 3) {
                        throw new IllegalArgumentException("unexpected resultType" + i12);
                    }
                    List<T> list = pageResult.page;
                    if (TiledPagedList.this.mStorage.getPageCount() == 0) {
                        TiledPagedList tiledPagedList = TiledPagedList.this;
                        tiledPagedList.mStorage.initAndSplit(pageResult.leadingNulls, list, pageResult.trailingNulls, pageResult.positionOffset, tiledPagedList.mConfig.pageSize, tiledPagedList);
                    } else {
                        TiledPagedList tiledPagedList2 = TiledPagedList.this;
                        tiledPagedList2.mStorage.tryInsertPageAndTrim(pageResult.positionOffset, list, tiledPagedList2.mLastLoad, tiledPagedList2.mConfig.maxSize, tiledPagedList2.mRequiredRemainder, tiledPagedList2);
                    }
                    TiledPagedList tiledPagedList3 = TiledPagedList.this;
                    if (tiledPagedList3.mBoundaryCallback != null) {
                        boolean z13 = false;
                        if (tiledPagedList3.mStorage.size() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11 && pageResult.leadingNulls == 0 && pageResult.positionOffset == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int size = TiledPagedList.this.size();
                        if (!z11 && ((i12 == 0 && pageResult.trailingNulls == 0) || (i12 == 3 && pageResult.positionOffset + TiledPagedList.this.mConfig.pageSize >= size))) {
                            z13 = true;
                        }
                        TiledPagedList.this.deferBoundaryCallbacks(z11, z12, z13);
                    }
                }
            }
        };
        this.mDataSource = positionalDataSource;
        int i12 = this.mConfig.pageSize;
        this.mLastLoad = i11;
        if (positionalDataSource.isInvalid()) {
            detach();
        } else {
            int iMax = Math.max(this.mConfig.initialLoadSizeHint / i12, 2) * i12;
            positionalDataSource.dispatchLoadInitial(true, Math.max(0, ((i11 - (iMax / 2)) / i12) * i12), iMax, i12, this.mMainThreadExecutor, this.mReceiver);
        }
    }

    @Override // androidx.paging.PagedList
    public void dispatchUpdatesSinceSnapshot(@NonNull PagedList<T> pagedList, @NonNull PagedList.Callback callback) {
        PagedStorage<T> pagedStorage = pagedList.mStorage;
        if (pagedStorage.isEmpty() || this.mStorage.size() != pagedStorage.size()) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        int i11 = this.mConfig.pageSize;
        int leadingNullCount = this.mStorage.getLeadingNullCount() / i11;
        int pageCount = this.mStorage.getPageCount();
        int i12 = 0;
        while (i12 < pageCount) {
            int i13 = i12 + leadingNullCount;
            int i14 = 0;
            while (i14 < this.mStorage.getPageCount()) {
                int i15 = i13 + i14;
                if (!this.mStorage.hasPage(i11, i15) || pagedStorage.hasPage(i11, i15)) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 > 0) {
                callback.onChanged(i13 * i11, i11 * i14);
                i12 += i14 - 1;
            }
            i12++;
        }
    }

    @Override // androidx.paging.PagedList
    @NonNull
    public DataSource<?, T> getDataSource() {
        return this.mDataSource;
    }

    @Override // androidx.paging.PagedList
    @Nullable
    public Object getLastKey() {
        return Integer.valueOf(this.mLastLoad);
    }

    @Override // androidx.paging.PagedList
    public void loadAroundInternal(int i11) {
        PagedStorage<T> pagedStorage = this.mStorage;
        PagedList.Config config = this.mConfig;
        pagedStorage.allocatePlaceholders(i11, config.prefetchDistance, config.pageSize, this);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onEmptyAppend() {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onEmptyPrepend() {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPageAppended(int i11, int i12, int i13) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagePlaceholderInserted(final int i11) {
        this.mBackgroundThreadExecutor.execute(new Runnable() { // from class: androidx.paging.TiledPagedList.2
            @Override // java.lang.Runnable
            public void run() {
                if (TiledPagedList.this.isDetached()) {
                    return;
                }
                TiledPagedList tiledPagedList = TiledPagedList.this;
                int i12 = tiledPagedList.mConfig.pageSize;
                if (tiledPagedList.mDataSource.isInvalid()) {
                    TiledPagedList.this.detach();
                    return;
                }
                int i13 = i11 * i12;
                int iMin = Math.min(i12, TiledPagedList.this.mStorage.size() - i13);
                TiledPagedList tiledPagedList2 = TiledPagedList.this;
                tiledPagedList2.mDataSource.dispatchLoadRange(3, i13, iMin, tiledPagedList2.mMainThreadExecutor, tiledPagedList2.mReceiver);
            }
        });
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagePrepended(int i11, int i12, int i13) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPageInserted(int i11, int i12) {
        notifyChanged(i11, i12);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesRemoved(int i11, int i12) {
        notifyRemoved(i11, i12);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesSwappedToPlaceholder(int i11, int i12) {
        notifyChanged(i11, i12);
    }
}
