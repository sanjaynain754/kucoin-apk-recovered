package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
abstract class ContiguousDataSource<Key, Value> extends DataSource<Key, Value> {
    public abstract void dispatchLoadAfter(int i11, @NonNull Value value, int i12, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver);

    public abstract void dispatchLoadBefore(int i11, @NonNull Value value, int i12, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver);

    public abstract void dispatchLoadInitial(@Nullable Key key, int i11, int i12, boolean z11, @NonNull Executor executor, @NonNull PageResult.Receiver<Value> receiver);

    public abstract Key getKey(int i11, Value value);

    @Override // androidx.paging.DataSource
    public boolean isContiguous() {
        return true;
    }

    public boolean supportsPageDropping() {
        return true;
    }
}
