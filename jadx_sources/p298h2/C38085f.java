package p298h2;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: h2.f */
/* JADX INFO: compiled from: TranscoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class C38085f {

    /* JADX INFO: renamed from: a */
    public final List<a<?, ?>> f85731a = new ArrayList();

    /* JADX INFO: renamed from: h2.f$a */
    /* JADX INFO: compiled from: TranscoderRegistry.java */
    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a */
        public final Class<Z> f85732a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f85733b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC38084e<Z, R> f85734c;

        /* JADX INFO: renamed from: a */
        public boolean m85985a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f85732a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f85733b);
        }

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull InterfaceC38084e<Z, R> interfaceC38084e) {
            this.f85732a = cls;
            this.f85733b = cls2;
            this.f85734c = interfaceC38084e;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public synchronized <Z, R> InterfaceC38084e<Z, R> m85982a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C38086g.m85986b();
        }
        for (a<?, ?> aVar : this.f85731a) {
            if (aVar.m85985a(cls, cls2)) {
                return (InterfaceC38084e<Z, R>) aVar.f85734c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized <Z, R> List<Class<R>> m85983b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.f85731a.iterator();
        while (it.hasNext()) {
            if (it.next().m85985a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public synchronized <Z, R> void m85984c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull InterfaceC38084e<Z, R> interfaceC38084e) {
        this.f85731a.add(new a<>(cls, cls2, interfaceC38084e));
    }
}
