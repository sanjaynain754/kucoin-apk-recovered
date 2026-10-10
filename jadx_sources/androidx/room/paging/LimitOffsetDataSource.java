package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.p023db.SupportSQLiteQuery;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {
    private final String mCountQuery;
    private final RoomDatabase mDb;
    private final boolean mInTransaction;
    private final String mLimitOffsetQuery;
    private final InvalidationTracker.Observer mObserver;
    private final AtomicBoolean mRegisteredObserver;
    private final RoomSQLiteQuery mSourceQuery;

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z11, @NonNull String... strArr) {
        this(roomDatabase, RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z11, strArr);
    }

    @NonNull
    public abstract List<T> convertRows(@NonNull Cursor cursor);

    @Override // androidx.paging.PositionalDataSource
    public void loadRange(@NonNull PositionalDataSource.LoadRangeParams loadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z11, boolean z12, @NonNull String... strArr) {
        this(roomDatabase, RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z11, z12, strArr);
    }

    private RoomSQLiteQuery getSQLiteQuery(int i11, int i12) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(this.mLimitOffsetQuery, this.mSourceQuery.getArgCount() + 2);
        roomSQLiteQueryAcquire.copyArgumentsFrom(this.mSourceQuery);
        roomSQLiteQueryAcquire.bindLong(roomSQLiteQueryAcquire.getArgCount() - 1, i12);
        roomSQLiteQueryAcquire.bindLong(roomSQLiteQueryAcquire.getArgCount(), i11);
        return roomSQLiteQueryAcquire;
    }

    private void registerObserverIfNecessary() {
        if (this.mRegisteredObserver.compareAndSet(false, true)) {
            this.mDb.getInvalidationTracker().addWeakObserver(this.mObserver);
        }
    }

    @NonNull
    public List<T> loadRange(int i11, int i12) {
        RoomSQLiteQuery sQLiteQuery = getSQLiteQuery(i11, i12);
        if (!this.mInTransaction) {
            Cursor cursorQuery = this.mDb.query(sQLiteQuery);
            try {
                return convertRows(cursorQuery);
            } finally {
                cursorQuery.close();
                sQLiteQuery.release();
            }
        }
        this.mDb.beginTransaction();
        Cursor cursorQuery2 = null;
        try {
            cursorQuery2 = this.mDb.query(sQLiteQuery);
            List<T> listConvertRows = convertRows(cursorQuery2);
            this.mDb.setTransactionSuccessful();
            return listConvertRows;
        } finally {
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
            this.mDb.endTransaction();
            sQLiteQuery.release();
        }
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z11, @NonNull String... strArr) {
        this(roomDatabase, roomSQLiteQuery, z11, true, strArr);
    }

    public int countItems() {
        registerObserverIfNecessary();
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(this.mCountQuery, this.mSourceQuery.getArgCount());
        roomSQLiteQueryAcquire.copyArgumentsFrom(this.mSourceQuery);
        Cursor cursorQuery = this.mDb.query(roomSQLiteQueryAcquire);
        try {
            if (!cursorQuery.moveToFirst()) {
                return 0;
            }
            return cursorQuery.getInt(0);
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        registerObserverIfNecessary();
        this.mDb.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) throws Throwable {
        RoomSQLiteQuery sQLiteQuery;
        int i11;
        RoomSQLiteQuery roomSQLiteQuery;
        registerObserverIfNecessary();
        List<T> list = Collections.EMPTY_LIST;
        this.mDb.beginTransaction();
        Cursor cursorQuery = null;
        try {
            int iCountItems = countItems();
            if (iCountItems != 0) {
                int iComputeInitialLoadPosition = PositionalDataSource.computeInitialLoadPosition(loadInitialParams, iCountItems);
                sQLiteQuery = getSQLiteQuery(iComputeInitialLoadPosition, PositionalDataSource.computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, iCountItems));
                try {
                    cursorQuery = this.mDb.query(sQLiteQuery);
                    List<T> listConvertRows = convertRows(cursorQuery);
                    this.mDb.setTransactionSuccessful();
                    roomSQLiteQuery = sQLiteQuery;
                    i11 = iComputeInitialLoadPosition;
                    list = listConvertRows;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    this.mDb.endTransaction();
                    if (sQLiteQuery != null) {
                        sQLiteQuery.release();
                    }
                    throw th;
                }
            } else {
                i11 = 0;
                roomSQLiteQuery = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            this.mDb.endTransaction();
            if (roomSQLiteQuery != null) {
                roomSQLiteQuery.release();
            }
            loadInitialCallback.onResult(list, i11, iCountItems);
        } catch (Throwable th3) {
            th = th3;
            sQLiteQuery = null;
        }
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z11, boolean z12, @NonNull String... strArr) {
        this.mRegisteredObserver = new AtomicBoolean(false);
        this.mDb = roomDatabase;
        this.mSourceQuery = roomSQLiteQuery;
        this.mInTransaction = z11;
        this.mCountQuery = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery.getQuery() + " )";
        this.mLimitOffsetQuery = "SELECT * FROM ( " + roomSQLiteQuery.getQuery() + " ) LIMIT ? OFFSET ?";
        this.mObserver = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.paging.LimitOffsetDataSource.1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NonNull Set<String> set) {
                LimitOffsetDataSource.this.invalidate();
            }
        };
        if (z12) {
            registerObserverIfNecessary();
        }
    }
}
