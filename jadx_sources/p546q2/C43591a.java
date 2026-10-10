package p546q2;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: q2.a */
/* JADX INFO: compiled from: FactoryPools.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43591a {

    /* JADX INFO: renamed from: a */
    public static final g<Object> f96241a = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: q2.a$b */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class b<T> implements d<List<T>> {
        @Override // p546q2.C43591a.d
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: q2.a$d */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface d<T> {
        T create();
    }

    /* JADX INFO: renamed from: q2.a$e */
    /* JADX INFO: compiled from: FactoryPools.java */
    public static final class e<T> implements Pools.Pool<T> {

        /* JADX INFO: renamed from: a */
        public final d<T> f96242a;

        /* JADX INFO: renamed from: b */
        public final g<T> f96243b;

        /* JADX INFO: renamed from: c */
        public final Pools.Pool<T> f96244c;

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            T tAcquire = this.f96244c.acquire();
            if (tAcquire == null) {
                tAcquire = this.f96242a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tAcquire.getClass());
                }
            }
            if (tAcquire instanceof f) {
                ((f) tAcquire).mo6704e().mo95946b(false);
            }
            return tAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t11) {
            if (t11 instanceof f) {
                ((f) t11).mo6704e().mo95946b(true);
            }
            this.f96243b.mo95938a(t11);
            return this.f96244c.release(t11);
        }

        public e(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar, @NonNull g<T> gVar) {
            this.f96244c = pool;
            this.f96242a = dVar;
            this.f96243b = gVar;
        }
    }

    /* JADX INFO: renamed from: q2.a$f */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface f {
        @NonNull
        /* JADX INFO: renamed from: e */
        AbstractC43593c mo6704e();
    }

    /* JADX INFO: renamed from: q2.a$g */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface g<T> {
        /* JADX INFO: renamed from: a */
        void mo95938a(@NonNull T t11);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: q2.a$c */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class c<T> implements g<List<T>> {
        @Override // p546q2.C43591a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo95938a(@NonNull List<T> list) {
            list.clear();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <T> Pools.Pool<T> m95933b(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(pool, dVar, gVar);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <T> g<T> m95934c() {
        return (g<T>) f96241a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T extends f> Pools.Pool<T> m95935d(int i11, @NonNull d<T> dVar) {
        return m95932a(new Pools.SynchronizedPool(i11), dVar);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> Pools.Pool<List<T>> m95936e() {
        return m95937f(20);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> Pools.Pool<List<T>> m95937f(int i11) {
        return m95933b(new Pools.SynchronizedPool(i11), new b(), new c());
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T extends f> Pools.Pool<T> m95932a(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar) {
        return m95933b(pool, dVar, m95934c());
    }

    /* JADX INFO: renamed from: q2.a$a */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class a implements g<Object> {
        @Override // p546q2.C43591a.g
        /* JADX INFO: renamed from: a */
        public void mo95938a(@NonNull Object obj) {
        }
    }
}
