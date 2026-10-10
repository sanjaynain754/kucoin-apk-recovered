package p390k2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p628t1.InterfaceC44615g;

/* JADX INFO: renamed from: k2.f */
/* JADX INFO: compiled from: ResourceEncoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class C40870f {

    /* JADX INFO: renamed from: a */
    public final List<a<?>> f90883a = new ArrayList();

    /* JADX INFO: renamed from: k2.f$a */
    /* JADX INFO: compiled from: ResourceEncoderRegistry.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f90884a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC44615g<T> f90885b;

        /* JADX INFO: renamed from: a */
        public boolean m89457a(@NonNull Class<?> cls) {
            return this.f90884a.isAssignableFrom(cls);
        }

        public a(@NonNull Class<T> cls, @NonNull InterfaceC44615g<T> interfaceC44615g) {
            this.f90884a = cls;
            this.f90885b = interfaceC44615g;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Z> void m89455a(@NonNull Class<Z> cls, @NonNull InterfaceC44615g<Z> interfaceC44615g) {
        this.f90883a.add(new a<>(cls, interfaceC44615g));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized <Z> InterfaceC44615g<Z> m89456b(@NonNull Class<Z> cls) {
        int size = this.f90883a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a<?> aVar = this.f90883a.get(i11);
            if (aVar.m89457a(cls)) {
                return (InterfaceC44615g<Z>) aVar.f90885b;
            }
        }
        return null;
    }
}
