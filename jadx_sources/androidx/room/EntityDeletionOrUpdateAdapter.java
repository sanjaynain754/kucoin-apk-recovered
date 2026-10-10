package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t11);

    @Override // androidx.room.SharedSQLiteStatement
    public abstract String createQuery();

    public final int handleMultiple(Iterable<? extends T> iterable) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            int iExecuteUpdateDelete = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                iExecuteUpdateDelete += supportSQLiteStatementAcquire.executeUpdateDelete();
            }
            release(supportSQLiteStatementAcquire);
            return iExecuteUpdateDelete;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public EntityDeletionOrUpdateAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final int handle(T t11) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t11);
            return supportSQLiteStatementAcquire.executeUpdateDelete();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            int iExecuteUpdateDelete = 0;
            for (T t11 : tArr) {
                bind(supportSQLiteStatementAcquire, t11);
                iExecuteUpdateDelete += supportSQLiteStatementAcquire.executeUpdateDelete();
            }
            release(supportSQLiteStatementAcquire);
            return iExecuteUpdateDelete;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }
}
