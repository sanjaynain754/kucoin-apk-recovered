package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.room.util.SneakyThrow;
import androidx.sqlite.p023db.SupportSQLiteCompat;
import androidx.sqlite.p023db.SupportSQLiteDatabase;
import androidx.sqlite.p023db.SupportSQLiteOpenHelper;
import androidx.sqlite.p023db.SupportSQLiteQuery;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    @NonNull
    private final AutoCloser mAutoCloser;

    @NonNull
    private final AutoClosingSupportSQLiteDatabase mAutoClosingDb;

    @NonNull
    private final SupportSQLiteOpenHelper mDelegateOpenHelper;

    /* JADX INFO: loaded from: classes34.dex */
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {

        @NonNull
        private final AutoCloser mAutoCloser;

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ Object m3750u(SupportSQLiteDatabase supportSQLiteDatabase) {
            return null;
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void execSQL(final String str) throws SQLException {
            this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.a
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m3745m(str, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public Cursor query(String str) {
            try {
                return new KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(str), this.mAutoCloser);
            } catch (Throwable th2) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new C4031w())).booleanValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th2) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th2) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(sQLiteTransactionListener);
            } catch (Throwable th2) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
            } catch (Throwable th2) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mAutoCloser.closeDatabaseIfOpen();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public SupportSQLiteStatement compileStatement(String str) {
            return new AutoClosingSupportSqliteStatement(str, this.mAutoCloser);
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public int delete(final String str, final String str2, final Object[] objArr) {
            return ((Integer) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.x
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).delete(str, str2, objArr));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void endTransaction() {
            if (this.mAutoCloser.getDelegateDatabase() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                this.mAutoCloser.getDelegateDatabase().endTransaction();
            } finally {
                this.mAutoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void execSQL(final String str, final Object[] objArr) throws SQLException {
            this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.h
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m3747o(str, objArr, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.f
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ((SupportSQLiteDatabase) obj).getAttachedDbs();
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Long) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.b
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Long) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.s
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public String getPath() {
            return (String) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.o
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ((SupportSQLiteDatabase) obj).getPath();
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Integer) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.g
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.mAutoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.y
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).inTransaction());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public long insert(final String str, final int i11, final ContentValues contentValues) throws SQLException {
            return ((Long) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.d
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).insert(str, i11, contentValues));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.c
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.mAutoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.e
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase = this.mAutoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.v
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.j
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean needUpgrade(final int i11) {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.m
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).needUpgrade(i11));
                }
            })).booleanValue();
        }

        public void pokeOpen() {
            this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.p
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m3750u((SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public void setForeignKeyConstraintsEnabled(final boolean z11) {
            this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.n
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m3746n(z11, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void setLocale(final Locale locale) {
            this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.k
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m3748p(locale, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(final int i11) {
            this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.t
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m3738b(i11, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public long setMaximumSize(final long j11) {
            return ((Long) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.q
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).setMaximumSize(j11));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void setPageSize(final long j11) {
            this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.u
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m3742j(j11, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            SupportSQLiteDatabase delegateDatabase = this.mAutoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
            delegateDatabase.setTransactionSuccessful();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public void setVersion(final int i11) {
            this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.i
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m3739g(i11, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public int update(final String str, final int i11, final ContentValues contentValues, final String str2, final Object[] objArr) {
            return ((Integer) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.l
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).update(str, i11, contentValues, str2, objArr));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long j11) {
            return ((Boolean) this.mAutoCloser.executeRefCountingFunction(new C4031w())).booleanValue();
        }

        public AutoClosingSupportSQLiteDatabase(@NonNull AutoCloser autoCloser) {
            this.mAutoCloser = autoCloser;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m3738b(int i11, SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setMaxSqlCacheSize(i11);
            return null;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ Object m3739g(int i11, SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setVersion(i11);
            return null;
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ Object m3742j(long j11, SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setPageSize(j11);
            return null;
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ Object m3745m(String str, SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL(str);
            return null;
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ Object m3746n(boolean z11, SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setForeignKeyConstraintsEnabled(z11);
            return null;
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ Object m3747o(String str, Object[] objArr, SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL(str, objArr);
            return null;
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ Object m3748p(Locale locale, SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setLocale(locale);
            return null;
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public Cursor query(String str, Object[] objArr) {
            try {
                return new KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(str, objArr), this.mAutoCloser);
            } catch (Throwable th2) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
            try {
                return new KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(supportSQLiteQuery), this.mAutoCloser);
            } catch (Throwable th2) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteDatabase
        @RequiresApi(api = 24)
        public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
            try {
                return new KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(supportSQLiteQuery, cancellationSignal), this.mAutoCloser);
            } catch (Throwable th2) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {
        private final AutoCloser mAutoCloser;
        private final ArrayList<Object> mBinds = new ArrayList<>();
        private final String mSql;

        private void doBinds(SupportSQLiteStatement supportSQLiteStatement) {
            int i11 = 0;
            while (i11 < this.mBinds.size()) {
                int i12 = i11 + 1;
                Object obj = this.mBinds.get(i11);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i12);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i12, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i12, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i12, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i12, (byte[]) obj);
                }
                i11 = i12;
            }
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteProgram
        public void bindNull(int i11) {
            saveBinds(i11, null);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m3751a(AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, Function function, SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = supportSQLiteDatabase.compileStatement(autoClosingSupportSqliteStatement.mSql);
            autoClosingSupportSqliteStatement.doBinds(supportSQLiteStatementCompileStatement);
            return function.apply(supportSQLiteStatementCompileStatement);
        }

        private <T> T executeSqliteStatementWithRefCount(final Function<SupportSQLiteStatement, T> function) {
            return (T) this.mAutoCloser.executeRefCountingFunction(new Function() { // from class: androidx.room.z
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.m3751a(this.f3666a, function, (SupportSQLiteDatabase) obj);
                }
            });
        }

        private void saveBinds(int i11, Object obj) {
            int i12 = i11 - 1;
            if (i12 >= this.mBinds.size()) {
                for (int size = this.mBinds.size(); size <= i12; size++) {
                    this.mBinds.add(null);
                }
            }
            this.mBinds.set(i12, obj);
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteProgram
        public void clearBindings() {
            this.mBinds.clear();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteStatement
        public void execute() {
            executeSqliteStatementWithRefCount(new Function() { // from class: androidx.room.b0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.m3752b((SupportSQLiteStatement) obj);
                }
            });
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteStatement
        public long executeInsert() {
            return ((Long) executeSqliteStatementWithRefCount(new Function() { // from class: androidx.room.c0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((SupportSQLiteStatement) obj).executeInsert());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((Integer) executeSqliteStatementWithRefCount(new Function() { // from class: androidx.room.e0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((SupportSQLiteStatement) obj).executeUpdateDelete());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((Long) executeSqliteStatementWithRefCount(new Function() { // from class: androidx.room.d0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((SupportSQLiteStatement) obj).simpleQueryForLong());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteStatement
        public String simpleQueryForString() {
            return (String) executeSqliteStatementWithRefCount(new Function() { // from class: androidx.room.a0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ((SupportSQLiteStatement) obj).simpleQueryForString();
                }
            });
        }

        public AutoClosingSupportSqliteStatement(String str, AutoCloser autoCloser) {
            this.mSql = str;
            this.mAutoCloser = autoCloser;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m3752b(SupportSQLiteStatement supportSQLiteStatement) {
            supportSQLiteStatement.execute();
            return null;
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteProgram
        public void bindBlob(int i11, byte[] bArr) {
            saveBinds(i11, bArr);
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteProgram
        public void bindDouble(int i11, double d11) {
            saveBinds(i11, Double.valueOf(d11));
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteProgram
        public void bindLong(int i11, long j11) {
            saveBinds(i11, Long.valueOf(j11));
        }

        @Override // androidx.sqlite.p023db.SupportSQLiteProgram
        public void bindString(int i11, String str) {
            saveBinds(i11, str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class KeepAliveCursor implements Cursor {
        private final AutoCloser mAutoCloser;
        private final Cursor mDelegate;

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mDelegate.close();
            this.mAutoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i11, CharArrayBuffer charArrayBuffer) {
            this.mDelegate.copyStringToBuffer(i11, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.mDelegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i11) {
            return this.mDelegate.getBlob(i11);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.mDelegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.mDelegate.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.mDelegate.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i11) {
            return this.mDelegate.getColumnName(i11);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.mDelegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.mDelegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i11) {
            return this.mDelegate.getDouble(i11);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.mDelegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i11) {
            return this.mDelegate.getFloat(i11);
        }

        @Override // android.database.Cursor
        public int getInt(int i11) {
            return this.mDelegate.getInt(i11);
        }

        @Override // android.database.Cursor
        public long getLong(int i11) {
            return this.mDelegate.getLong(i11);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 19)
        public Uri getNotificationUri() {
            return SupportSQLiteCompat.Api19Impl.getNotificationUri(this.mDelegate);
        }

        @Override // android.database.Cursor
        @Nullable
        @RequiresApi(api = 29)
        public List<Uri> getNotificationUris() {
            return SupportSQLiteCompat.Api29Impl.getNotificationUris(this.mDelegate);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.mDelegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i11) {
            return this.mDelegate.getShort(i11);
        }

        @Override // android.database.Cursor
        public String getString(int i11) {
            return this.mDelegate.getString(i11);
        }

        @Override // android.database.Cursor
        public int getType(int i11) {
            return this.mDelegate.getType(i11);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.mDelegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.mDelegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.mDelegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.mDelegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.mDelegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.mDelegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i11) {
            return this.mDelegate.isNull(i11);
        }

        @Override // android.database.Cursor
        public boolean move(int i11) {
            return this.mDelegate.move(i11);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.mDelegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.mDelegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.mDelegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i11) {
            return this.mDelegate.moveToPosition(i11);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.mDelegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.mDelegate.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.mDelegate.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.mDelegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.mDelegate.respond(bundle);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 23)
        public void setExtras(Bundle bundle) {
            SupportSQLiteCompat.Api23Impl.setExtras(this.mDelegate, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.mDelegate.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 29)
        public void setNotificationUris(@NonNull ContentResolver contentResolver, @NonNull List<Uri> list) {
            SupportSQLiteCompat.Api29Impl.setNotificationUris(this.mDelegate, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.mDelegate.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.mDelegate.unregisterDataSetObserver(dataSetObserver);
        }

        public KeepAliveCursor(Cursor cursor, AutoCloser autoCloser) {
            this.mDelegate = cursor;
            this.mAutoCloser = autoCloser;
        }
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            this.mAutoClosingDb.close();
        } catch (IOException e11) {
            SneakyThrow.reThrow(e11);
        }
    }

    @NonNull
    public AutoCloser getAutoCloser() {
        return this.mAutoCloser;
    }

    @NonNull
    public SupportSQLiteDatabase getAutoClosingDb() {
        return this.mAutoClosingDb;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteOpenHelper
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.mDelegateOpenHelper.getName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NonNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.mDelegateOpenHelper;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteOpenHelper
    @NonNull
    @RequiresApi(api = 24)
    public SupportSQLiteDatabase getReadableDatabase() {
        this.mAutoClosingDb.pokeOpen();
        return this.mAutoClosingDb;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteOpenHelper
    @NonNull
    @RequiresApi(api = 24)
    public SupportSQLiteDatabase getWritableDatabase() {
        this.mAutoClosingDb.pokeOpen();
        return this.mAutoClosingDb;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.mDelegateOpenHelper.setWriteAheadLoggingEnabled(z11);
    }

    public AutoClosingRoomOpenHelper(@NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper, @NonNull AutoCloser autoCloser) {
        this.mDelegateOpenHelper = supportSQLiteOpenHelper;
        this.mAutoCloser = autoCloser;
        autoCloser.init(supportSQLiteOpenHelper);
        this.mAutoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }
}
