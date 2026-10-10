package p006a4;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p712w3.C45702b;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: renamed from: a4.a */
/* JADX INFO: compiled from: CloseableReference.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC0110a<T> implements Cloneable, Closeable {

    /* JADX INFO: renamed from: g */
    public static int f436g;

    /* JADX INFO: renamed from: b */
    public boolean f439b = false;

    /* JADX INFO: renamed from: c */
    public final SharedReference<T> f440c;

    /* JADX INFO: renamed from: d */
    public final c f441d;

    /* JADX INFO: renamed from: e */
    public final Throwable f442e;

    /* JADX INFO: renamed from: f */
    public static Class<AbstractC0110a> f435f = AbstractC0110a.class;

    /* JADX INFO: renamed from: h */
    public static final InterfaceC0117h<Closeable> f437h = new a();

    /* JADX INFO: renamed from: i */
    public static final c f438i = new b();

    /* JADX INFO: renamed from: a4.a$a */
    /* JADX INFO: compiled from: CloseableReference.java */
    public class a implements InterfaceC0117h<Closeable> {
        @Override // p006a4.InterfaceC0117h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Closeable closeable) {
            try {
                C45702b.m100880a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a4.a$c */
    /* JADX INFO: compiled from: CloseableReference.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean mo569a();

        /* JADX INFO: renamed from: b */
        void mo570b(SharedReference<Object> sharedReference, Throwable th2);
    }

    public AbstractC0110a(SharedReference<T> sharedReference, c cVar, Throwable th2) {
        this.f440c = (SharedReference) C45708h.m100896g(sharedReference);
        sharedReference.m8543b();
        this.f441d = cVar;
        this.f442e = th2;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;La4/a$c;)La4/a<TT;>; */
    /* JADX INFO: renamed from: q */
    public static AbstractC0110a m559q(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return m562w(closeable, f437h, cVar, cVar.mo569a() ? new Throwable() : null);
    }

    /* JADX INFO: renamed from: v */
    public static <T> AbstractC0110a<T> m561v(T t11, InterfaceC0117h<T> interfaceC0117h, c cVar) {
        if (t11 == null) {
            return null;
        }
        return m562w(t11, interfaceC0117h, cVar, cVar.mo569a() ? new Throwable() : null);
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC0110a<T> clone();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f439b) {
                    return;
                }
                this.f439b = true;
                this.f440c.m8545d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized AbstractC0110a<T> mo564g() {
        if (!mo567n()) {
            return null;
        }
        return clone();
    }

    /* JADX INFO: renamed from: l */
    public synchronized T m565l() {
        C45708h.m100898i(!this.f439b);
        return (T) C45708h.m100896g(this.f440c.m8547f());
    }

    /* JADX INFO: renamed from: n */
    public synchronized boolean mo567n() {
        return !this.f439b;
    }

    /* JADX INFO: renamed from: a4.a$b */
    /* JADX INFO: compiled from: CloseableReference.java */
    public class b implements c {
        @Override // p006a4.AbstractC0110a.c
        /* JADX INFO: renamed from: a */
        public boolean mo569a() {
            return false;
        }

        @Override // p006a4.AbstractC0110a.c
        /* JADX INFO: renamed from: b */
        public void mo570b(SharedReference<Object> sharedReference, Throwable th2) {
            String name;
            Object objM8547f = sharedReference.m8547f();
            Class cls = AbstractC0110a.f435f;
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            Integer numValueOf2 = Integer.valueOf(System.identityHashCode(sharedReference));
            if (objM8547f == null) {
                name = null;
            } else {
                name = objM8547f.getClass().getName();
            }
            C45999a.m101486G(cls, "Finalized without closing: %x %x (type = %s)", numValueOf, numValueOf2, name);
        }
    }

    /* JADX INFO: renamed from: h */
    public static <T> AbstractC0110a<T> m553h(AbstractC0110a<T> abstractC0110a) {
        if (abstractC0110a != null) {
            return abstractC0110a.mo564g();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static <T> List<AbstractC0110a<T>> m554i(Collection<AbstractC0110a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<AbstractC0110a<T>> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m553h(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static void m555j(AbstractC0110a<?> abstractC0110a) {
        if (abstractC0110a != null) {
            abstractC0110a.close();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m556k(Iterable<? extends AbstractC0110a<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends AbstractC0110a<?>> it = iterable.iterator();
            while (it.hasNext()) {
                m555j(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m557o(AbstractC0110a<?> abstractC0110a) {
        return abstractC0110a != null && abstractC0110a.mo567n();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)La4/a<TT;>; */
    /* JADX INFO: renamed from: p */
    public static AbstractC0110a m558p(Closeable closeable) {
        return m560u(closeable, f437h);
    }

    /* JADX INFO: renamed from: u */
    public static <T> AbstractC0110a<T> m560u(T t11, InterfaceC0117h<T> interfaceC0117h) {
        return m561v(t11, interfaceC0117h, f438i);
    }

    /* JADX INFO: renamed from: w */
    public static <T> AbstractC0110a<T> m562w(T t11, InterfaceC0117h<T> interfaceC0117h, c cVar, Throwable th2) {
        if (t11 == null) {
            return null;
        }
        if ((t11 instanceof Bitmap) || (t11 instanceof InterfaceC0113d)) {
            int i11 = f436g;
            if (i11 == 1) {
                return new C0112c(t11, interfaceC0117h, cVar, th2);
            }
            if (i11 == 2) {
                return new C0116g(t11, interfaceC0117h, cVar, th2);
            }
            if (i11 == 3) {
                return new C0114e(t11);
            }
        }
        return new C0111b(t11, interfaceC0117h, cVar, th2);
    }

    /* JADX INFO: renamed from: m */
    public int m566m() {
        if (mo567n()) {
            return System.identityHashCode(this.f440c.m8547f());
        }
        return 0;
    }

    public AbstractC0110a(T t11, InterfaceC0117h<T> interfaceC0117h, c cVar, Throwable th2, boolean z11) {
        this.f440c = new SharedReference<>(t11, interfaceC0117h, z11);
        this.f441d = cVar;
        this.f442e = th2;
    }
}
