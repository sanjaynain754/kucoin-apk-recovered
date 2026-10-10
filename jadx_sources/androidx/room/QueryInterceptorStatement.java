package androidx.room;

import androidx.annotation.NonNull;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> mBindArgsCache = new ArrayList();
    private final SupportSQLiteStatement mDelegate;
    private final RoomDatabase.QueryCallback mQueryCallback;
    private final Executor mQueryCallbackExecutor;
    private final String mSqlStatement;

    private void saveArgsToCache(int i11, Object obj) {
        int i12 = i11 - 1;
        if (i12 >= this.mBindArgsCache.size()) {
            for (int size = this.mBindArgsCache.size(); size <= i12; size++) {
                this.mBindArgsCache.add(null);
            }
        }
        this.mBindArgsCache.set(i12, obj);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindNull(int i11) {
        saveArgsToCache(i11, this.mBindArgsCache.toArray());
        this.mDelegate.bindNull(i11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void clearBindings() {
        this.mBindArgsCache.clear();
        this.mDelegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mDelegate.close();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteStatement
    public void execute() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.v0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement queryInterceptorStatement = this.f3659b;
                queryInterceptorStatement.mQueryCallback.onQuery(queryInterceptorStatement.mSqlStatement, queryInterceptorStatement.mBindArgsCache);
            }
        });
        this.mDelegate.execute();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteStatement
    public long executeInsert() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.t0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement queryInterceptorStatement = this.f3656b;
                queryInterceptorStatement.mQueryCallback.onQuery(queryInterceptorStatement.mSqlStatement, queryInterceptorStatement.mBindArgsCache);
            }
        });
        return this.mDelegate.executeInsert();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.w0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement queryInterceptorStatement = this.f3660b;
                queryInterceptorStatement.mQueryCallback.onQuery(queryInterceptorStatement.mSqlStatement, queryInterceptorStatement.mBindArgsCache);
            }
        });
        return this.mDelegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.s0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement queryInterceptorStatement = this.f3654b;
                queryInterceptorStatement.mQueryCallback.onQuery(queryInterceptorStatement.mSqlStatement, queryInterceptorStatement.mBindArgsCache);
            }
        });
        return this.mDelegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteStatement
    public String simpleQueryForString() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.u0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement queryInterceptorStatement = this.f3658b;
                queryInterceptorStatement.mQueryCallback.onQuery(queryInterceptorStatement.mSqlStatement, queryInterceptorStatement.mBindArgsCache);
            }
        });
        return this.mDelegate.simpleQueryForString();
    }

    public QueryInterceptorStatement(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull RoomDatabase.QueryCallback queryCallback, String str, @NonNull Executor executor) {
        this.mDelegate = supportSQLiteStatement;
        this.mQueryCallback = queryCallback;
        this.mSqlStatement = str;
        this.mQueryCallbackExecutor = executor;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindBlob(int i11, byte[] bArr) {
        saveArgsToCache(i11, bArr);
        this.mDelegate.bindBlob(i11, bArr);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindDouble(int i11, double d11) {
        saveArgsToCache(i11, Double.valueOf(d11));
        this.mDelegate.bindDouble(i11, d11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindLong(int i11, long j11) {
        saveArgsToCache(i11, Long.valueOf(j11));
        this.mDelegate.bindLong(i11, j11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindString(int i11, String str) {
        saveArgsToCache(i11, str);
        this.mDelegate.bindString(i11, str);
    }
}
