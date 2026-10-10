package com.facebook.imagepipeline.producers;

import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p192d6.C36621b;
import p712w3.C45708h;
import p712w3.C45710j;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m0 */
/* JADX INFO: compiled from: MultiplexProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC5713m0<K, T extends Closeable> implements InterfaceC5731v0<T> {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final Map<K, AbstractC5713m0<K, T>.a> f9398a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5731v0<T> f9399b;

    /* JADX INFO: renamed from: c */
    public final boolean f9400c;

    /* JADX INFO: renamed from: d */
    public final String f9401d;

    /* JADX INFO: renamed from: e */
    public final String f9402e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m0$a */
    /* JADX INFO: compiled from: MultiplexProducer.java */
    @VisibleForTesting
    public class a {

        /* JADX INFO: renamed from: a */
        public final K f9403a;

        /* JADX INFO: renamed from: b */
        public final CopyOnWriteArraySet<Pair<InterfaceC5712m<T>, InterfaceC5733w0>> f9404b = C45710j.m100901a();

        /* JADX INFO: renamed from: c */
        public T f9405c;

        /* JADX INFO: renamed from: d */
        public float f9406d;

        /* JADX INFO: renamed from: e */
        public int f9407e;

        /* JADX INFO: renamed from: f */
        public C5688e f9408f;

        /* JADX INFO: renamed from: g */
        public AbstractC5713m0<K, T>.a.b f9409g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MultiplexProducer.java */
        public class C46967a extends C5691f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Pair f9411a;

            public C46967a(Pair pair) {
                this.f9411a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.C5691f, com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: a */
            public void mo9557a() {
                C5688e.m9660d(a.this.m9763r());
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: b */
            public void mo9116b() {
                boolean zRemove;
                List list;
                C5688e c5688e;
                List listM9765t;
                List listM9763r;
                synchronized (a.this) {
                    try {
                        zRemove = a.this.f9404b.remove(this.f9411a);
                        list = null;
                        if (!zRemove) {
                            c5688e = null;
                            listM9765t = null;
                        } else if (a.this.f9404b.isEmpty()) {
                            c5688e = a.this.f9408f;
                            listM9765t = null;
                        } else {
                            List listM9764s = a.this.m9764s();
                            listM9765t = a.this.m9765t();
                            listM9763r = a.this.m9763r();
                            c5688e = null;
                            list = listM9764s;
                        }
                        listM9763r = listM9765t;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C5688e.m9661e(list);
                C5688e.m9662p(listM9765t);
                C5688e.m9660d(listM9763r);
                if (c5688e != null) {
                    if (!AbstractC5713m0.this.f9400c || c5688e.mo9672n()) {
                        c5688e.m9674q();
                    } else {
                        C5688e.m9662p(c5688e.m9678v(Priority.LOW));
                    }
                }
                if (zRemove) {
                    ((InterfaceC5712m) this.f9411a.first).mo9651a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.C5691f, com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: c */
            public void mo9684c() {
                C5688e.m9661e(a.this.m9764s());
            }

            @Override // com.facebook.imagepipeline.producers.C5691f, com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: d */
            public void mo9685d() {
                C5688e.m9662p(a.this.m9765t());
            }
        }

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.m0$a$b */
        /* JADX INFO: compiled from: MultiplexProducer.java */
        public class b extends AbstractC5682c<T> {
            public b() {
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5682c
            /* JADX INFO: renamed from: f */
            public void mo9549f() {
                try {
                    if (C36621b.m81959d()) {
                        C36621b.m81957a("MultiplexProducer#onCancellation");
                    }
                    a.this.m9758m(this);
                } finally {
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5682c
            /* JADX INFO: renamed from: g */
            public void mo9550g(Throwable th2) {
                try {
                    if (C36621b.m81959d()) {
                        C36621b.m81957a("MultiplexProducer#onFailure");
                    }
                    a.this.m9759n(this, th2);
                } finally {
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5682c
            /* JADX INFO: renamed from: i */
            public void mo9552i(float f11) {
                try {
                    if (C36621b.m81959d()) {
                        C36621b.m81957a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.m9761p(this, f11);
                } finally {
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5682c
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public void mo9551h(T t11, int i11) {
                try {
                    if (C36621b.m81959d()) {
                        C36621b.m81957a("MultiplexProducer#onNewResult");
                    }
                    a.this.m9760o(this, t11, i11);
                } finally {
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public final synchronized boolean m9755j() {
            Iterator<Pair<InterfaceC5712m<T>, InterfaceC5733w0>> it = this.f9404b.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5733w0) it.next().second).mo9671m()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        public final synchronized boolean m9756k() {
            Iterator<Pair<InterfaceC5712m<T>, InterfaceC5733w0>> it = this.f9404b.iterator();
            while (it.hasNext()) {
                if (!((InterfaceC5733w0) it.next().second).mo9672n()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: l */
        public final synchronized Priority m9757l() {
            Priority higherPriority;
            higherPriority = Priority.LOW;
            Iterator<Pair<InterfaceC5712m<T>, InterfaceC5733w0>> it = this.f9404b.iterator();
            while (it.hasNext()) {
                higherPriority = Priority.getHigherPriority(higherPriority, ((InterfaceC5733w0) it.next().second).getPriority());
            }
            return higherPriority;
        }

        /* JADX INFO: renamed from: m */
        public void m9758m(AbstractC5713m0<K, T>.a.b bVar) {
            synchronized (this) {
                try {
                    if (this.f9409g != bVar) {
                        return;
                    }
                    this.f9409g = null;
                    this.f9408f = null;
                    m9754i(this.f9405c);
                    this.f9405c = null;
                    m9762q(TriState.UNSET);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m9759n(AbstractC5713m0<K, T>.a.b bVar, Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f9409g != bVar) {
                        return;
                    }
                    this.f9404b.clear();
                    AbstractC5713m0.this.m9745k(this.f9403a, this);
                    m9754i(this.f9405c);
                    this.f9405c = null;
                    for (Pair<InterfaceC5712m<T>, InterfaceC5733w0> pair : this.f9404b) {
                        synchronized (pair) {
                            try {
                                ((InterfaceC5733w0) pair.second).mo9665g().mo9463k((InterfaceC5733w0) pair.second, AbstractC5713m0.this.f9401d, th2, null);
                                C5688e c5688e = this.f9408f;
                                if (c5688e != null) {
                                    ((InterfaceC5733w0) pair.second).putExtras(c5688e.getExtras());
                                }
                                ((InterfaceC5712m) pair.first).onFailure(th2);
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        /* JADX INFO: renamed from: o */
        public void m9760o(AbstractC5713m0<K, T>.a.b bVar, T t11, int i11) {
            synchronized (this) {
                try {
                    if (this.f9409g != bVar) {
                        return;
                    }
                    m9754i(this.f9405c);
                    this.f9405c = null;
                    int size = this.f9404b.size();
                    if (AbstractC5682c.m9646e(i11)) {
                        this.f9405c = (T) AbstractC5713m0.this.mo9688g(t11);
                        this.f9407e = i11;
                    } else {
                        this.f9404b.clear();
                        AbstractC5713m0.this.m9745k(this.f9403a, this);
                    }
                    for (Pair<InterfaceC5712m<T>, InterfaceC5733w0> pair : this.f9404b) {
                        synchronized (pair) {
                            try {
                                if (AbstractC5682c.m9645d(i11)) {
                                    ((InterfaceC5733w0) pair.second).mo9665g().mo9462j((InterfaceC5733w0) pair.second, AbstractC5713m0.this.f9401d, null);
                                    C5688e c5688e = this.f9408f;
                                    if (c5688e != null) {
                                        ((InterfaceC5733w0) pair.second).putExtras(c5688e.getExtras());
                                    }
                                    ((InterfaceC5733w0) pair.second).putExtra(AbstractC5713m0.this.f9402e, Integer.valueOf(size));
                                }
                                ((InterfaceC5712m) pair.first).mo9652b(t11, i11);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public void m9761p(AbstractC5713m0<K, T>.a.b bVar, float f11) {
            synchronized (this) {
                try {
                    if (this.f9409g != bVar) {
                        return;
                    }
                    this.f9406d = f11;
                    for (Pair<InterfaceC5712m<T>, InterfaceC5733w0> pair : this.f9404b) {
                        synchronized (pair) {
                            ((InterfaceC5712m) pair.first).mo9653c(f11);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m9762q(TriState triState) {
            synchronized (this) {
                try {
                    C45708h.m100891b(Boolean.valueOf(this.f9408f == null));
                    C45708h.m100891b(Boolean.valueOf(this.f9409g == null));
                    if (this.f9404b.isEmpty()) {
                        AbstractC5713m0.this.m9745k(this.f9403a, this);
                        return;
                    }
                    InterfaceC5733w0 interfaceC5733w0 = (InterfaceC5733w0) this.f9404b.iterator().next().second;
                    C5688e c5688e = new C5688e(interfaceC5733w0.mo9666h(), interfaceC5733w0.getId(), interfaceC5733w0.mo9665g(), interfaceC5733w0.mo9663a(), interfaceC5733w0.mo9673o(), m9756k(), m9755j(), m9757l(), interfaceC5733w0.mo9664b());
                    this.f9408f = c5688e;
                    c5688e.putExtras(interfaceC5733w0.getExtras());
                    if (triState.isSet()) {
                        this.f9408f.putExtra("started_as_prefetch", Boolean.valueOf(triState.asBoolean()));
                    }
                    AbstractC5713m0<K, T>.a.b bVar = new b();
                    this.f9409g = bVar;
                    AbstractC5713m0.this.f9399b.mo9524a(bVar, this.f9408f);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: r */
        public final synchronized List<InterfaceC5735x0> m9763r() {
            C5688e c5688e = this.f9408f;
            if (c5688e == null) {
                return null;
            }
            return c5688e.m9676s(m9755j());
        }

        /* JADX INFO: renamed from: s */
        public final synchronized List<InterfaceC5735x0> m9764s() {
            C5688e c5688e = this.f9408f;
            if (c5688e == null) {
                return null;
            }
            return c5688e.m9677u(m9756k());
        }

        /* JADX INFO: renamed from: t */
        public final synchronized List<InterfaceC5735x0> m9765t() {
            C5688e c5688e = this.f9408f;
            if (c5688e == null) {
                return null;
            }
            return c5688e.m9678v(m9757l());
        }

        public a(K k11) {
            this.f9403a = k11;
        }

        /* JADX INFO: renamed from: g */
        public final void m9752g(Pair<InterfaceC5712m<T>, InterfaceC5733w0> pair, InterfaceC5733w0 interfaceC5733w0) {
            interfaceC5733w0.mo9667i(new C46967a(pair));
        }

        /* JADX INFO: renamed from: i */
        public final void m9754i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public boolean m9753h(InterfaceC5712m<T> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
            Pair<InterfaceC5712m<T>, InterfaceC5733w0> pairCreate = Pair.create(interfaceC5712m, interfaceC5733w0);
            synchronized (this) {
                try {
                    if (AbstractC5713m0.this.m9744i(this.f9403a) != this) {
                        return false;
                    }
                    this.f9404b.add(pairCreate);
                    List<InterfaceC5735x0> listM9764s = m9764s();
                    List<InterfaceC5735x0> listM9765t = m9765t();
                    List<InterfaceC5735x0> listM9763r = m9763r();
                    Closeable closeableMo9688g = this.f9405c;
                    float f11 = this.f9406d;
                    int i11 = this.f9407e;
                    C5688e.m9661e(listM9764s);
                    C5688e.m9662p(listM9765t);
                    C5688e.m9660d(listM9763r);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                try {
                                    if (closeableMo9688g != this.f9405c) {
                                        closeableMo9688g = null;
                                    } else if (closeableMo9688g != null) {
                                        closeableMo9688g = AbstractC5713m0.this.mo9688g(closeableMo9688g);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (closeableMo9688g != null) {
                                if (f11 > 0.0f) {
                                    interfaceC5712m.mo9653c(f11);
                                }
                                interfaceC5712m.mo9652b(closeableMo9688g, i11);
                                m9754i(closeableMo9688g);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    m9752g(pairCreate, interfaceC5733w0);
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public AbstractC5713m0(InterfaceC5731v0<T> interfaceC5731v0, String str, String str2) {
        this(interfaceC5731v0, str, str2, false);
    }

    /* JADX INFO: renamed from: g */
    public abstract T mo9688g(T t11);

    /* JADX INFO: renamed from: h */
    public final synchronized AbstractC5713m0<K, T>.a m9743h(K k11) {
        AbstractC5713m0<K, T>.a aVar;
        aVar = new a(k11);
        this.f9398a.put(k11, aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: i */
    public synchronized AbstractC5713m0<K, T>.a m9744i(K k11) {
        return this.f9398a.get(k11);
    }

    /* JADX INFO: renamed from: j */
    public abstract K mo9689j(InterfaceC5733w0 interfaceC5733w0);

    /* JADX INFO: renamed from: k */
    public synchronized void m9745k(K k11, AbstractC5713m0<K, T>.a aVar) {
        if (this.f9398a.get(k11) == aVar) {
            this.f9398a.remove(k11);
        }
    }

    public AbstractC5713m0(InterfaceC5731v0<T> interfaceC5731v0, String str, String str2, boolean z11) {
        this.f9399b = interfaceC5731v0;
        this.f9398a = new HashMap();
        this.f9400c = z11;
        this.f9401d = str;
        this.f9402e = str2;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<T> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        AbstractC5713m0<K, T>.a aVarM9744i;
        boolean z11;
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("MultiplexProducer#produceResults");
            }
            interfaceC5733w0.mo9665g().mo9454b(interfaceC5733w0, this.f9401d);
            K kMo9689j = mo9689j(interfaceC5733w0);
            do {
                synchronized (this) {
                    try {
                        aVarM9744i = m9744i(kMo9689j);
                        if (aVarM9744i == null) {
                            aVarM9744i = m9743h(kMo9689j);
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!aVarM9744i.m9753h(interfaceC5712m, interfaceC5733w0));
            if (z11) {
                aVarM9744i.m9762q(TriState.valueOf(interfaceC5733w0.mo9672n()));
            }
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        } catch (Throwable th3) {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            throw th3;
        }
    }
}
