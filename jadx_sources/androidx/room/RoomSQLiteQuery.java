package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.p023db.SupportSQLiteProgram;
import androidx.sqlite.p023db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;

    @VisibleForTesting
    static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;

    @VisibleForTesting
    static final int POOL_LIMIT = 15;
    private static final int STRING = 4;

    @VisibleForTesting
    static final TreeMap<Integer, RoomSQLiteQuery> sQueryPool = new TreeMap<>();

    @VisibleForTesting
    int mArgCount;
    private final int[] mBindingTypes;

    @VisibleForTesting
    final byte[][] mBlobBindings;

    @VisibleForTesting
    final int mCapacity;

    @VisibleForTesting
    final double[] mDoubleBindings;

    @VisibleForTesting
    final long[] mLongBindings;
    private volatile String mQuery;

    @VisibleForTesting
    final String[] mStringBindings;

    @Override // androidx.sqlite.p023db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        for (int i11 = 1; i11 <= this.mArgCount; i11++) {
            int i12 = this.mBindingTypes[i11];
            if (i12 == 1) {
                supportSQLiteProgram.bindNull(i11);
            } else if (i12 == 2) {
                supportSQLiteProgram.bindLong(i11, this.mLongBindings[i11]);
            } else if (i12 == 3) {
                supportSQLiteProgram.bindDouble(i11, this.mDoubleBindings[i11]);
            } else if (i12 == 4) {
                supportSQLiteProgram.bindString(i11, this.mStringBindings[i11]);
            } else if (i12 == 5) {
                supportSQLiteProgram.bindBlob(i11, this.mBlobBindings[i11]);
            }
        }
    }

    public static RoomSQLiteQuery acquire(String str, int i11) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = sQueryPool;
        synchronized (treeMap) {
            try {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i11));
                if (entryCeilingEntry == null) {
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i11);
                    roomSQLiteQuery.init(str, i11);
                    return roomSQLiteQuery;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                RoomSQLiteQuery value = entryCeilingEntry.getValue();
                value.init(str, i11);
                return value;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void prunePoolLocked() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = sQueryPool;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i11 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i11;
        }
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindBlob(int i11, byte[] bArr) {
        this.mBindingTypes[i11] = 5;
        this.mBlobBindings[i11] = bArr;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindDouble(int i11, double d11) {
        this.mBindingTypes[i11] = 3;
        this.mDoubleBindings[i11] = d11;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindLong(int i11, long j11) {
        this.mBindingTypes[i11] = 2;
        this.mLongBindings[i11] = j11;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindNull(int i11) {
        this.mBindingTypes[i11] = 1;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindString(int i11, String str) {
        this.mBindingTypes[i11] = 4;
        this.mStringBindings[i11] = str;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.mBindingTypes, 1);
        Arrays.fill(this.mStringBindings, (Object) null);
        Arrays.fill(this.mBlobBindings, (Object) null);
        this.mQuery = null;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteQuery
    public int getArgCount() {
        return this.mArgCount;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteQuery
    public String getSql() {
        return this.mQuery;
    }

    public void init(String str, int i11) {
        this.mQuery = str;
        this.mArgCount = i11;
    }

    public void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = sQueryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.mCapacity), this);
            prunePoolLocked();
        }
    }

    private RoomSQLiteQuery(int i11) {
        this.mCapacity = i11;
        int i12 = i11 + 1;
        this.mBindingTypes = new int[i12];
        this.mLongBindings = new long[i12];
        this.mDoubleBindings = new double[i12];
        this.mStringBindings = new String[i12];
        this.mBlobBindings = new byte[i12][];
    }

    public static RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
        supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery.1
            @Override // androidx.sqlite.p023db.SupportSQLiteProgram
            public void bindBlob(int i11, byte[] bArr) {
                RoomSQLiteQuery.this.bindBlob(i11, bArr);
            }

            @Override // androidx.sqlite.p023db.SupportSQLiteProgram
            public void bindDouble(int i11, double d11) {
                RoomSQLiteQuery.this.bindDouble(i11, d11);
            }

            @Override // androidx.sqlite.p023db.SupportSQLiteProgram
            public void bindLong(int i11, long j11) {
                RoomSQLiteQuery.this.bindLong(i11, j11);
            }

            @Override // androidx.sqlite.p023db.SupportSQLiteProgram
            public void bindNull(int i11) {
                RoomSQLiteQuery.this.bindNull(i11);
            }

            @Override // androidx.sqlite.p023db.SupportSQLiteProgram
            public void bindString(int i11, String str) {
                RoomSQLiteQuery.this.bindString(i11, str);
            }

            @Override // androidx.sqlite.p023db.SupportSQLiteProgram
            public void clearBindings() {
                RoomSQLiteQuery.this.clearBindings();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        });
        return roomSQLiteQueryAcquire;
    }

    public void copyArgumentsFrom(RoomSQLiteQuery roomSQLiteQuery) {
        int argCount = roomSQLiteQuery.getArgCount() + 1;
        System.arraycopy(roomSQLiteQuery.mBindingTypes, 0, this.mBindingTypes, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mLongBindings, 0, this.mLongBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mStringBindings, 0, this.mStringBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mBlobBindings, 0, this.mBlobBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mDoubleBindings, 0, this.mDoubleBindings, 0, argCount);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
