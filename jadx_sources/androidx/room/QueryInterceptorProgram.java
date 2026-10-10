package androidx.room;

import androidx.sqlite.p023db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class QueryInterceptorProgram implements SupportSQLiteProgram {
    private List<Object> mBindArgsCache = new ArrayList();

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindNull(int i11) {
        saveArgsToCache(i11, null);
    }

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
    public void clearBindings() {
        this.mBindArgsCache.clear();
    }

    public List<Object> getBindArgs() {
        return this.mBindArgsCache;
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindBlob(int i11, byte[] bArr) {
        saveArgsToCache(i11, bArr);
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindDouble(int i11, double d11) {
        saveArgsToCache(i11, Double.valueOf(d11));
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindLong(int i11, long j11) {
        saveArgsToCache(i11, Long.valueOf(j11));
    }

    @Override // androidx.sqlite.p023db.SupportSQLiteProgram
    public void bindString(int i11, String str) {
        saveArgsToCache(i11, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
