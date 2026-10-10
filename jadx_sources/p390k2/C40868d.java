package p390k2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p523p2.C43362i;

/* JADX INFO: renamed from: k2.d */
/* JADX INFO: compiled from: ModelToResourceClassCache.java */
/* JADX INFO: loaded from: classes.dex */
public class C40868d {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C43362i> f90876a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final ArrayMap<C43362i, List<Class<?>>> f90877b = new ArrayMap<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public List<Class<?>> m89446a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        C43362i andSet = this.f90876a.getAndSet(null);
        if (andSet == null) {
            andSet = new C43362i(cls, cls2, cls3);
        } else {
            andSet.m95502a(cls, cls2, cls3);
        }
        synchronized (this.f90877b) {
            list = this.f90877b.get(andSet);
        }
        this.f90876a.set(andSet);
        return list;
    }

    /* JADX INFO: renamed from: b */
    public void m89447b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f90877b) {
            this.f90877b.put(new C43362i(cls, cls2, cls3), list);
        }
    }
}
