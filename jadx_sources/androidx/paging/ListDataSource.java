package androidx.paging;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
class ListDataSource<T> extends PositionalDataSource<T> {
    private final List<T> mList;

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        int size = this.mList.size();
        int iComputeInitialLoadPosition = PositionalDataSource.computeInitialLoadPosition(loadInitialParams, size);
        loadInitialCallback.onResult(this.mList.subList(iComputeInitialLoadPosition, PositionalDataSource.computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, size) + iComputeInitialLoadPosition), iComputeInitialLoadPosition, size);
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadRange(@NonNull PositionalDataSource.LoadRangeParams loadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        List<T> list = this.mList;
        int i11 = loadRangeParams.startPosition;
        loadRangeCallback.onResult(list.subList(i11, loadRangeParams.loadSize + i11));
    }

    public ListDataSource(List<T> list) {
        this.mList = new ArrayList(list);
    }
}
