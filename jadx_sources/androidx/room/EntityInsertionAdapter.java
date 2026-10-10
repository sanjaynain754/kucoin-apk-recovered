package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t11);

    public final void insert(T t11) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t11);
            supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            Iterator<? extends T> it = collection.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                jArr[i11] = supportSQLiteStatementAcquire.executeInsert();
                i11++;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            Iterator<? extends T> it = collection.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i11] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
                i11++;
            }
            release(supportSQLiteStatementAcquire);
            return lArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i11 = 0;
            for (T t11 : tArr) {
                bind(supportSQLiteStatementAcquire, t11);
                arrayList.add(i11, Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
                i11++;
            }
            release(supportSQLiteStatementAcquire);
            return arrayList;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final long insertAndReturnId(T t11) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t11);
            return supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            for (T t11 : tArr) {
                bind(supportSQLiteStatementAcquire, t11);
                supportSQLiteStatementAcquire.executeInsert();
            }
            release(supportSQLiteStatementAcquire);
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int i11 = 0;
            for (T t11 : tArr) {
                bind(supportSQLiteStatementAcquire, t11);
                jArr[i11] = supportSQLiteStatementAcquire.executeInsert();
                i11++;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Long[] lArr = new Long[tArr.length];
            int i11 = 0;
            for (T t11 : tArr) {
                bind(supportSQLiteStatementAcquire, t11);
                lArr[i11] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
                i11++;
            }
            release(supportSQLiteStatementAcquire);
            return lArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<? extends T> it = collection.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                arrayList.add(i11, Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
                i11++;
            }
            release(supportSQLiteStatementAcquire);
            return arrayList;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                supportSQLiteStatementAcquire.executeInsert();
            }
            release(supportSQLiteStatementAcquire);
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }
}
