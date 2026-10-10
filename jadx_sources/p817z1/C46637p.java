package p817z1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z1.p */
/* JADX INFO: compiled from: ModelLoaderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class C46637p {

    /* JADX INFO: renamed from: a */
    public final C46639r f104430a;

    /* JADX INFO: renamed from: b */
    public final a f104431b;

    /* JADX INFO: renamed from: z1.p$a */
    /* JADX INFO: compiled from: ModelLoaderRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<?>, C47040a<?>> f104432a = new HashMap();

        /* JADX INFO: renamed from: z1.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ModelLoaderRegistry.java */
        public static class C47040a<Model> {

            /* JADX INFO: renamed from: a */
            public final List<InterfaceC46635n<Model, ?>> f104433a;

            public C47040a(List<InterfaceC46635n<Model, ?>> list) {
                this.f104433a = list;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m102855a() {
            this.f104432a.clear();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public <Model> List<InterfaceC46635n<Model, ?>> m102856b(Class<Model> cls) {
            C47040a<?> c47040a = this.f104432a.get(cls);
            if (c47040a == null) {
                return null;
            }
            return (List<InterfaceC46635n<Model, ?>>) c47040a.f104433a;
        }

        /* JADX INFO: renamed from: c */
        public <Model> void m102857c(Class<Model> cls, List<InterfaceC46635n<Model, ?>> list) {
            if (this.f104432a.put(cls, new C47040a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C46637p(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new C46639r(pool));
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Model, Data> void m102849a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull InterfaceC46636o<? extends Model, ? extends Data> interfaceC46636o) {
        this.f104430a.m102861b(cls, cls2, interfaceC46636o);
        this.f104431b.m102855a();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public synchronized List<Class<?>> m102850c(@NonNull Class<?> cls) {
        return this.f104430a.m102865g(cls);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public final synchronized <A> List<InterfaceC46635n<A, ?>> m102852e(@NonNull Class<A> cls) {
        List<InterfaceC46635n<A, ?>> listM102856b;
        listM102856b = this.f104431b.m102856b(cls);
        if (listM102856b == null) {
            listM102856b = Collections.unmodifiableList(this.f104430a.m102862c(cls));
            this.f104431b.m102857c(cls, listM102856b);
        }
        return listM102856b;
    }

    /* JADX INFO: renamed from: f */
    public synchronized <Model, Data> void m102853f(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull InterfaceC46636o<? extends Model, ? extends Data> interfaceC46636o) {
        m102854g(this.f104430a.m102868j(cls, cls2, interfaceC46636o));
        this.f104431b.m102855a();
    }

    public C46637p(@NonNull C46639r c46639r) {
        this.f104431b = new a();
        this.f104430a = c46639r;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <A> Class<A> m102848b(@NonNull A a11) {
        return (Class<A>) a11.getClass();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public <A> List<InterfaceC46635n<A, ?>> m102851d(@NonNull A a11) {
        List<InterfaceC46635n<A, ?>> listM102852e = m102852e(m102848b(a11));
        if (!listM102852e.isEmpty()) {
            int size = listM102852e.size();
            List<InterfaceC46635n<A, ?>> arrayList = Collections.EMPTY_LIST;
            boolean z11 = true;
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC46635n<A, ?> interfaceC46635n = listM102852e.get(i11);
                if (interfaceC46635n.mo11b(a11)) {
                    if (z11) {
                        arrayList = new ArrayList<>(size - i11);
                        z11 = false;
                    }
                    arrayList.add(interfaceC46635n);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Registry.NoModelLoaderAvailableException(a11, listM102852e);
        }
        throw new Registry.NoModelLoaderAvailableException(a11);
    }

    /* JADX INFO: renamed from: g */
    public final <Model, Data> void m102854g(@NonNull List<InterfaceC46636o<? extends Model, ? extends Data>> list) {
        Iterator<InterfaceC46636o<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo15c();
        }
    }
}
