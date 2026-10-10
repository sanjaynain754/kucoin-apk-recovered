package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public abstract class TiledDataSource<T> extends PositionalDataSource<T> {
    @WorkerThread
    public abstract int countItems();

    @Override // androidx.paging.PositionalDataSource, androidx.paging.DataSource
    public boolean isContiguous() {
        return false;
    }

    @Nullable
    @WorkerThread
    public abstract List<T> loadRange(int i11, int i12);

    @Override // androidx.paging.PositionalDataSource
    public void loadRange(@NonNull PositionalDataSource.LoadRangeParams loadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        List<T> listLoadRange = loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize);
        if (listLoadRange != null) {
            loadRangeCallback.onResult(listLoadRange);
        } else {
            invalidate();
        }
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        int iCountItems = countItems();
        if (iCountItems == 0) {
            loadInitialCallback.onResult(Collections.EMPTY_LIST, 0, 0);
            return;
        }
        int iComputeInitialLoadPosition = PositionalDataSource.computeInitialLoadPosition(loadInitialParams, iCountItems);
        int iComputeInitialLoadSize = PositionalDataSource.computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, iCountItems);
        List<T> listLoadRange = loadRange(iComputeInitialLoadPosition, iComputeInitialLoadSize);
        if (listLoadRange != null && listLoadRange.size() == iComputeInitialLoadSize) {
            loadInitialCallback.onResult(listLoadRange, iComputeInitialLoadPosition, iCountItems);
        } else {
            invalidate();
        }
    }
}
