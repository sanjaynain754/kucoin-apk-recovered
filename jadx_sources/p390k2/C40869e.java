package p390k2;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p628t1.InterfaceC44614f;

/* JADX INFO: renamed from: k2.e */
/* JADX INFO: compiled from: ResourceDecoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class C40869e {

    /* JADX INFO: renamed from: a */
    public final List<String> f90878a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Map<String, List<a<?, ?>>> f90879b = new HashMap();

    /* JADX INFO: renamed from: k2.e$a */
    /* JADX INFO: compiled from: ResourceDecoderRegistry.java */
    public static class a<T, R> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f90880a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f90881b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC44614f<T, R> f90882c;

        /* JADX INFO: renamed from: a */
        public boolean m89454a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f90880a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f90881b);
        }

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, InterfaceC44614f<T, R> interfaceC44614f) {
            this.f90880a = cls;
            this.f90881b = cls2;
            this.f90882c = interfaceC44614f;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <T, R> void m89448a(@NonNull String str, @NonNull InterfaceC44614f<T, R> interfaceC44614f, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m89450c(str).add(new a<>(cls, cls2, interfaceC44614f));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized <T, R> List<InterfaceC44614f<T, R>> m89449b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f90878a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f90879b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m89454a(cls, cls2)) {
                        arrayList.add(aVar.f90882c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final synchronized List<a<?, ?>> m89450c(@NonNull String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f90878a.contains(str)) {
                this.f90878a.add(str);
            }
            arrayList = this.f90879b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f90879b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public synchronized <T, R> List<Class<R>> m89451d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f90878a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f90879b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m89454a(cls, cls2) && !arrayList.contains(aVar.f90881b)) {
                        arrayList.add(aVar.f90881b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public synchronized <T, R> void m89452e(@NonNull String str, @NonNull InterfaceC44614f<T, R> interfaceC44614f, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m89450c(str).add(0, new a<>(cls, cls2, interfaceC44614f));
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m89453f(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f90878a);
            this.f90878a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f90878a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f90878a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
