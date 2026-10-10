package p390k2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p628t1.InterfaceC44609a;

/* JADX INFO: renamed from: k2.a */
/* JADX INFO: compiled from: EncoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class C40865a {

    /* JADX INFO: renamed from: a */
    public final List<a<?>> f90869a = new ArrayList();

    /* JADX INFO: renamed from: k2.a$a */
    /* JADX INFO: compiled from: EncoderRegistry.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f90870a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC44609a<T> f90871b;

        /* JADX INFO: renamed from: a */
        public boolean m89439a(@NonNull Class<?> cls) {
            return this.f90870a.isAssignableFrom(cls);
        }

        public a(@NonNull Class<T> cls, @NonNull InterfaceC44609a<T> interfaceC44609a) {
            this.f90870a = cls;
            this.f90871b = interfaceC44609a;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <T> void m89437a(@NonNull Class<T> cls, @NonNull InterfaceC44609a<T> interfaceC44609a) {
        this.f90869a.add(new a<>(cls, interfaceC44609a));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized <T> InterfaceC44609a<T> m89438b(@NonNull Class<T> cls) {
        for (a<?> aVar : this.f90869a) {
            if (aVar.m89439a(cls)) {
                return (InterfaceC44609a<T>) aVar.f90871b;
            }
        }
        return null;
    }
}
