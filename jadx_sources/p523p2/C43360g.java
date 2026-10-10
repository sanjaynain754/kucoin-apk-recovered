package p523p2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: p2.g */
/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes.dex */
public class C43360g<T, Y> {

    /* JADX INFO: renamed from: a */
    public final Map<T, a<Y>> f95752a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public final long f95753b;

    /* JADX INFO: renamed from: c */
    public long f95754c;

    /* JADX INFO: renamed from: d */
    public long f95755d;

    @Nullable
    /* JADX INFO: renamed from: g */
    public synchronized Y m95493g(@NonNull T t11) {
        a<Y> aVar;
        aVar = this.f95752a.get(t11);
        return aVar != null ? aVar.f95756a : null;
    }

    /* JADX INFO: renamed from: h */
    public synchronized long m95494h() {
        return this.f95754c;
    }

    /* JADX INFO: renamed from: i */
    public int mo95495i(@Nullable Y y11) {
        return 1;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public synchronized Y m95497k(@NonNull T t11, @Nullable Y y11) {
        int iMo95495i = mo95495i(y11);
        long j11 = iMo95495i;
        if (j11 >= this.f95754c) {
            mo95496j(t11, y11);
            return null;
        }
        if (y11 != null) {
            this.f95755d += j11;
        }
        a<Y> aVarPut = this.f95752a.put(t11, y11 == null ? null : new a<>(y11, iMo95495i));
        if (aVarPut != null) {
            this.f95755d -= (long) aVarPut.f95757b;
            if (!aVarPut.f95756a.equals(y11)) {
                mo95496j(t11, aVarPut.f95756a);
            }
        }
        m95492f();
        return aVarPut != null ? aVarPut.f95756a : null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public synchronized Y m95498l(@NonNull T t11) {
        a<Y> aVarRemove = this.f95752a.remove(t11);
        if (aVarRemove == null) {
            return null;
        }
        this.f95755d -= (long) aVarRemove.f95757b;
        return aVarRemove.f95756a;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m95499m(long j11) {
        while (this.f95755d > j11) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f95752a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f95755d -= (long) value.f95757b;
            T key = next.getKey();
            it.remove();
            mo95496j(key, value.f95756a);
        }
    }

    /* JADX INFO: renamed from: p2.g$a */
    /* JADX INFO: compiled from: LruCache.java */
    public static final class a<Y> {

        /* JADX INFO: renamed from: a */
        public final Y f95756a;

        /* JADX INFO: renamed from: b */
        public final int f95757b;

        public a(Y y11, int i11) {
            this.f95756a = y11;
            this.f95757b = i11;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m95491c() {
        m95499m(0L);
    }

    /* JADX INFO: renamed from: f */
    public final void m95492f() {
        m95499m(this.f95754c);
    }

    public C43360g(long j11) {
        this.f95753b = j11;
        this.f95754c = j11;
    }

    /* JADX INFO: renamed from: j */
    public void mo95496j(@NonNull T t11, @Nullable Y y11) {
    }
}
