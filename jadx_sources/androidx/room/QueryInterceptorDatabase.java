package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p023db.SupportSQLiteDatabase;
import androidx.sqlite.p023db.SupportSQLiteQuery;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    private final SupportSQLiteDatabase mDelegate;
    private final RoomDatabase.QueryCallback mQueryCallback;
    private final Executor mQueryCallbackExecutor;

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void execSQL(@NonNull final String str) throws SQLException {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3631b.mQueryCallback.onQuery(str, new ArrayList(0));
            }
        });
        this.mDelegate.execSQL(str);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @NonNull
    public Cursor query(@NonNull final String str) {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3625b.mQueryCallback.onQuery(str, Collections.EMPTY_LIST);
            }
        });
        return this.mDelegate.query(str);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.mDelegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3638b.mQueryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", Collections.EMPTY_LIST);
            }
        });
        this.mDelegate.beginTransaction();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3642b.mQueryCallback.onQuery("BEGIN DEFERRED TRANSACTION", Collections.EMPTY_LIST);
            }
        });
        this.mDelegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@NonNull SQLiteTransactionListener sQLiteTransactionListener) {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3650b.mQueryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", Collections.EMPTY_LIST);
            }
        });
        this.mDelegate.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@NonNull SQLiteTransactionListener sQLiteTransactionListener) {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3623b.mQueryCallback.onQuery("BEGIN DEFERRED TRANSACTION", Collections.EMPTY_LIST);
            }
        });
        this.mDelegate.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mDelegate.close();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @NonNull
    public SupportSQLiteStatement compileStatement(@NonNull String str) {
        return new QueryInterceptorStatement(this.mDelegate.compileStatement(str), this.mQueryCallback, str, this.mQueryCallbackExecutor);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public int delete(@NonNull String str, @NonNull String str2, @NonNull Object[] objArr) {
        return this.mDelegate.delete(str, str2, objArr);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.mDelegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.mDelegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void endTransaction() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3620b.mQueryCallback.onQuery("END TRANSACTION", Collections.EMPTY_LIST);
            }
        });
        this.mDelegate.endTransaction();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @NonNull
    public List<Pair<String, String>> getAttachedDbs() {
        return this.mDelegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.mDelegate.getMaximumSize();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.mDelegate.getPageSize();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @NonNull
    public String getPath() {
        return this.mDelegate.getPath();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public int getVersion() {
        return this.mDelegate.getVersion();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.mDelegate.inTransaction();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public long insert(@NonNull String str, int i11, @NonNull ContentValues contentValues) throws SQLException {
        return this.mDelegate.insert(str, i11, contentValues);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.mDelegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.mDelegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.mDelegate.isOpen();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.mDelegate.isReadOnly();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.mDelegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean needUpgrade(int i11) {
        return this.mDelegate.needUpgrade(i11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z11) {
        this.mDelegate.setForeignKeyConstraintsEnabled(z11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void setLocale(@NonNull Locale locale) {
        this.mDelegate.setLocale(locale);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i11) {
        this.mDelegate.setMaxSqlCacheSize(i11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public long setMaximumSize(long j11) {
        return this.mDelegate.setMaximumSize(j11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void setPageSize(long j11) {
        this.mDelegate.setPageSize(j11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3640b.mQueryCallback.onQuery("TRANSACTION SUCCESSFUL", Collections.EMPTY_LIST);
            }
        });
        this.mDelegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void setVersion(int i11) {
        this.mDelegate.setVersion(i11);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public int update(@NonNull String str, int i11, @NonNull ContentValues contentValues, @NonNull String str2, @NonNull Object[] objArr) {
        return this.mDelegate.update(str, i11, contentValues, str2, objArr);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j11) {
        return this.mDelegate.yieldIfContendedSafely(j11);
    }

    public QueryInterceptorDatabase(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, @NonNull RoomDatabase.QueryCallback queryCallback, @NonNull Executor executor) {
        this.mDelegate = supportSQLiteDatabase;
        this.mQueryCallback = queryCallback;
        this.mQueryCallbackExecutor = executor;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    public void execSQL(@NonNull final String str, @NonNull Object[] objArr) throws SQLException {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3643b.mQueryCallback.onQuery(str, arrayList);
            }
        });
        this.mDelegate.execSQL(str, arrayList.toArray());
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @NonNull
    public Cursor query(@NonNull final String str, @NonNull Object[] objArr) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3627b.mQueryCallback.onQuery(str, arrayList);
            }
        });
        return this.mDelegate.query(str, objArr);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @NonNull
    public Cursor query(@NonNull final SupportSQLiteQuery supportSQLiteQuery) {
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.bindTo(queryInterceptorProgram);
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3646b.mQueryCallback.onQuery(supportSQLiteQuery.getQuery(), queryInterceptorProgram.getBindArgs());
            }
        });
        return this.mDelegate.query(supportSQLiteQuery);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
    @NonNull
    public Cursor query(@NonNull final SupportSQLiteQuery supportSQLiteQuery, @NonNull CancellationSignal cancellationSignal) {
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.bindTo(queryInterceptorProgram);
        this.mQueryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3651b.mQueryCallback.onQuery(supportSQLiteQuery.getQuery(), queryInterceptorProgram.getBindArgs());
            }
        });
        return this.mDelegate.query(supportSQLiteQuery);
    }
}
