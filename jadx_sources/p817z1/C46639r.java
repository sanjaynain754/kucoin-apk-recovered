package p817z1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p523p2.C43363j;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.r */
/* JADX INFO: compiled from: MultiModelLoaderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class C46639r {

    /* JADX INFO: renamed from: e */
    public static final c f104443e = new c();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC46635n<Object, Object> f104444f = new a();

    /* JADX INFO: renamed from: a */
    public final List<b<?, ?>> f104445a;

    /* JADX INFO: renamed from: b */
    public final c f104446b;

    /* JADX INFO: renamed from: c */
    public final Set<b<?, ?>> f104447c;

    /* JADX INFO: renamed from: d */
    public final Pools.Pool<List<Throwable>> f104448d;

    /* JADX INFO: renamed from: z1.r$a */
    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class a implements InterfaceC46635n<Object, Object> {
        @Override // p817z1.InterfaceC46635n
        @Nullable
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n.a<Object> mo10a(@NonNull Object obj, int i11, int i12, @NonNull C44613e c44613e) {
            return null;
        }

        @Override // p817z1.InterfaceC46635n
        /* JADX INFO: renamed from: b */
        public boolean mo11b(@NonNull Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: z1.r$b */
    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a */
        public final Class<Model> f104449a;

        /* JADX INFO: renamed from: b */
        public final Class<Data> f104450b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC46636o<? extends Model, ? extends Data> f104451c;

        /* JADX INFO: renamed from: a */
        public boolean m102869a(@NonNull Class<?> cls) {
            return this.f104449a.isAssignableFrom(cls);
        }

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull InterfaceC46636o<? extends Model, ? extends Data> interfaceC46636o) {
            this.f104449a = cls;
            this.f104450b = cls2;
            this.f104451c = interfaceC46636o;
        }

        /* JADX INFO: renamed from: b */
        public boolean m102870b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (m102869a(cls) && this.f104450b.isAssignableFrom(cls2)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z1.r$c */
    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class c {
        @NonNull
        /* JADX INFO: renamed from: a */
        public <Model, Data> C46638q<Model, Data> m102871a(@NonNull List<InterfaceC46635n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            return new C46638q<>(list, pool);
        }
    }

    public C46639r(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(pool, f104443e);
    }

    /* JADX INFO: renamed from: b */
    public synchronized <Model, Data> void m102861b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull InterfaceC46636o<? extends Model, ? extends Data> interfaceC46636o) {
        m102860a(cls, cls2, interfaceC46636o, true);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public synchronized <Model> List<InterfaceC46635n<Model, ?>> m102862c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f104445a) {
                if (!this.f104447c.contains(bVar) && bVar.m102869a(cls)) {
                    this.f104447c.add(bVar);
                    arrayList.add(m102864e(bVar));
                    this.f104447c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f104447c.clear();
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public synchronized <Model, Data> InterfaceC46635n<Model, Data> m102863d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z11 = false;
            for (b<?, ?> bVar : this.f104445a) {
                if (this.f104447c.contains(bVar)) {
                    z11 = true;
                } else if (bVar.m102870b(cls, cls2)) {
                    this.f104447c.add(bVar);
                    arrayList.add(m102864e(bVar));
                    this.f104447c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f104446b.m102871a(arrayList, this.f104448d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC46635n) arrayList.get(0);
            }
            if (!z11) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return m102859f();
        } catch (Throwable th2) {
            this.f104447c.clear();
            throw th2;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public synchronized List<Class<?>> m102865g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f104445a) {
            if (!arrayList.contains(bVar.f104450b) && bVar.m102869a(cls)) {
                arrayList.add(bVar.f104450b);
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public synchronized <Model, Data> List<InterfaceC46636o<? extends Model, ? extends Data>> m102867i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f104445a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.m102870b(cls, cls2)) {
                it.remove();
                arrayList.add(m102866h(next));
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public synchronized <Model, Data> List<InterfaceC46636o<? extends Model, ? extends Data>> m102868j(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull InterfaceC46636o<? extends Model, ? extends Data> interfaceC46636o) {
        List<InterfaceC46636o<? extends Model, ? extends Data>> listM102867i;
        listM102867i = m102867i(cls, cls2);
        m102861b(cls, cls2, interfaceC46636o);
        return listM102867i;
    }

    @VisibleForTesting
    public C46639r(@NonNull Pools.Pool<List<Throwable>> pool, @NonNull c cVar) {
        this.f104445a = new ArrayList();
        this.f104447c = new HashSet();
        this.f104448d = pool;
        this.f104446b = cVar;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <Model, Data> InterfaceC46635n<Model, Data> m102859f() {
        return (InterfaceC46635n<Model, Data>) f104444f;
    }

    /* JADX INFO: renamed from: a */
    public final <Model, Data> void m102860a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull InterfaceC46636o<? extends Model, ? extends Data> interfaceC46636o, boolean z11) {
        b<?, ?> bVar = new b<>(cls, cls2, interfaceC46636o);
        List<b<?, ?>> list = this.f104445a;
        list.add(z11 ? list.size() : 0, bVar);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public final <Model, Data> InterfaceC46635n<Model, Data> m102864e(@NonNull b<?, ?> bVar) {
        return (InterfaceC46635n) C43363j.m95506d(bVar.f104451c.mo14a(this));
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public final <Model, Data> InterfaceC46636o<Model, Data> m102866h(@NonNull b<?, ?> bVar) {
        return (InterfaceC46636o<Model, Data>) bVar.f104451c;
    }
}
