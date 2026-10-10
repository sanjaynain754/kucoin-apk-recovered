package com.facebook.imagepipeline.producers;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.InterfaceC5742b;
import com.facebook.imagepipeline.request.InterfaceC5743c;
import com.facebook.imagepipeline.request.InterfaceC5744d;
import java.util.Map;
import java.util.concurrent.Executor;
import p006a4.AbstractC0110a;
import p526p5.AbstractC43387c;
import p712w3.C45708h;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t0 */
/* JADX INFO: compiled from: PostprocessorProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5727t0 implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> f9462a;

    /* JADX INFO: renamed from: b */
    public final AbstractC43387c f9463b;

    /* JADX INFO: renamed from: c */
    public final Executor f9464c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t0$a */
    /* JADX INFO: compiled from: PostprocessorProducer.java */
    public class a extends AbstractC5724s<AbstractC0110a<InterfaceC46071e>, AbstractC0110a<InterfaceC46071e>> {

        /* JADX INFO: renamed from: c */
        public final InterfaceC5737y0 f9465c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC5733w0 f9466d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC5742b f9467e;

        /* JADX INFO: renamed from: f */
        public boolean f9468f;

        /* JADX INFO: renamed from: g */
        public AbstractC0110a<InterfaceC46071e> f9469g;

        /* JADX INFO: renamed from: h */
        public int f9470h;

        /* JADX INFO: renamed from: i */
        public boolean f9471i;

        /* JADX INFO: renamed from: j */
        public boolean f9472j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PostprocessorProducer.java */
        public class C46968a extends C5691f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5727t0 f9474a;

            public C46968a(C5727t0 c5727t0) {
                this.f9474a = c5727t0;
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: b */
            public void mo9116b() {
                a.this.m9823B();
            }
        }

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t0$a$b */
        /* JADX INFO: compiled from: PostprocessorProducer.java */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC0110a abstractC0110a;
                int i11;
                synchronized (a.this) {
                    abstractC0110a = a.this.f9469g;
                    i11 = a.this.f9470h;
                    a.this.f9469g = null;
                    a.this.f9471i = false;
                }
                if (AbstractC0110a.m557o(abstractC0110a)) {
                    try {
                        a.this.m9833y(abstractC0110a, i11);
                        AbstractC0110a.m555j(abstractC0110a);
                    } catch (Throwable th2) {
                        AbstractC0110a.m555j(abstractC0110a);
                        throw th2;
                    }
                }
                a.this.m9832w();
            }
        }

        /* JADX INFO: renamed from: x */
        private boolean m9821x() {
            synchronized (this) {
                try {
                    if (this.f9468f) {
                        return false;
                    }
                    AbstractC0110a<InterfaceC46071e> abstractC0110a = this.f9469g;
                    this.f9469g = null;
                    this.f9468f = true;
                    AbstractC0110a.m555j(abstractC0110a);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: A */
        public final synchronized boolean m9822A() {
            return this.f9468f;
        }

        /* JADX INFO: renamed from: F */
        public final AbstractC0110a<InterfaceC46071e> m9827F(InterfaceC46071e interfaceC46071e) {
            InterfaceC46072f interfaceC46072f = (InterfaceC46072f) interfaceC46071e;
            AbstractC0110a<Bitmap> abstractC0110aProcess = this.f9467e.process(interfaceC46072f.mo101544K(), C5727t0.this.f9463b);
            try {
                InterfaceC46072f interfaceC46072fM101551I = InterfaceC46072f.m101551I(abstractC0110aProcess, interfaceC46071e.getQualityInfo(), interfaceC46072f.mo101543F(), interfaceC46072f.mo101547t());
                interfaceC46072fM101551I.putExtras(interfaceC46072f.getExtras());
                return AbstractC0110a.m558p(interfaceC46072fM101551I);
            } finally {
                AbstractC0110a.m555j(abstractC0110aProcess);
            }
        }

        /* JADX INFO: renamed from: G */
        public final synchronized boolean m9828G() {
            if (this.f9468f || !this.f9471i || this.f9472j || !AbstractC0110a.m557o(this.f9469g)) {
                return false;
            }
            this.f9472j = true;
            return true;
        }

        /* JADX INFO: renamed from: J */
        public final void m9831J(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            synchronized (this) {
                try {
                    if (this.f9468f) {
                        return;
                    }
                    AbstractC0110a<InterfaceC46071e> abstractC0110a2 = this.f9469g;
                    this.f9469g = AbstractC0110a.m553h(abstractC0110a);
                    this.f9470h = i11;
                    this.f9471i = true;
                    boolean zM9828G = m9828G();
                    AbstractC0110a.m555j(abstractC0110a2);
                    if (zM9828G) {
                        m9830I();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: w */
        public final void m9832w() {
            boolean zM9828G;
            synchronized (this) {
                this.f9472j = false;
                zM9828G = m9828G();
            }
            if (zM9828G) {
                m9830I();
            }
        }

        public a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5737y0 interfaceC5737y0, InterfaceC5742b interfaceC5742b, InterfaceC5733w0 interfaceC5733w0) {
            super(interfaceC5712m);
            this.f9469g = null;
            this.f9470h = 0;
            this.f9471i = false;
            this.f9472j = false;
            this.f9465c = interfaceC5737y0;
            this.f9467e = interfaceC5742b;
            this.f9466d = interfaceC5733w0;
            interfaceC5733w0.mo9667i(new C46968a(C5727t0.this));
        }

        /* JADX INFO: renamed from: H */
        public final boolean m9829H(InterfaceC46071e interfaceC46071e) {
            return interfaceC46071e instanceof InterfaceC46072f;
        }

        /* JADX INFO: renamed from: I */
        public final void m9830I() {
            C5727t0.this.f9464c.execute(new b());
        }

        /* JADX INFO: renamed from: z */
        public final Map<String, String> m9834z(InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, InterfaceC5742b interfaceC5742b) {
            if (interfaceC5737y0.mo9458f(interfaceC5733w0, "PostprocessorProducer")) {
                return ImmutableMap.m8533of("Postprocessor", interfaceC5742b.getName());
            }
            return null;
        }

        /* JADX INFO: renamed from: B */
        public final void m9823B() {
            if (m9821x()) {
                m9801o().mo9651a();
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m9824C(Throwable th2) {
            if (m9821x()) {
                m9801o().onFailure(th2);
            }
        }

        /* JADX INFO: renamed from: D */
        public final void m9825D(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            boolean zM9645d = AbstractC5682c.m9645d(i11);
            if ((!zM9645d && !m9822A()) || (zM9645d && m9821x())) {
                m9801o().mo9652b(abstractC0110a, i11);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo9551h(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            if (!AbstractC0110a.m557o(abstractC0110a)) {
                if (AbstractC5682c.m9645d(i11)) {
                    m9825D(null, i11);
                    return;
                }
                return;
            }
            m9831J(abstractC0110a, i11);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: f */
        public void mo9549f() {
            m9823B();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: g */
        public void mo9550g(Throwable th2) {
            m9824C(th2);
        }

        /* JADX INFO: renamed from: y */
        public final void m9833y(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            C45708h.m100891b(Boolean.valueOf(AbstractC0110a.m557o(abstractC0110a)));
            if (!m9829H(abstractC0110a.m565l())) {
                m9825D(abstractC0110a, i11);
                return;
            }
            this.f9465c.mo9454b(this.f9466d, "PostprocessorProducer");
            try {
                try {
                    AbstractC0110a<InterfaceC46071e> abstractC0110aM9827F = m9827F(abstractC0110a.m565l());
                    InterfaceC5737y0 interfaceC5737y0 = this.f9465c;
                    InterfaceC5733w0 interfaceC5733w0 = this.f9466d;
                    interfaceC5737y0.mo9462j(interfaceC5733w0, "PostprocessorProducer", m9834z(interfaceC5737y0, interfaceC5733w0, this.f9467e));
                    m9825D(abstractC0110aM9827F, i11);
                    AbstractC0110a.m555j(abstractC0110aM9827F);
                } catch (Exception e11) {
                    InterfaceC5737y0 interfaceC5737y1 = this.f9465c;
                    InterfaceC5733w0 interfaceC5733w1 = this.f9466d;
                    interfaceC5737y1.mo9463k(interfaceC5733w1, "PostprocessorProducer", e11, m9834z(interfaceC5737y1, interfaceC5733w1, this.f9467e));
                    m9824C(e11);
                    AbstractC0110a.m555j(null);
                }
            } catch (Throwable th2) {
                AbstractC0110a.m555j(null);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t0$b */
    /* JADX INFO: compiled from: PostprocessorProducer.java */
    public class b extends AbstractC5724s<AbstractC0110a<InterfaceC46071e>, AbstractC0110a<InterfaceC46071e>> implements InterfaceC5744d {

        /* JADX INFO: renamed from: c */
        public boolean f9477c;

        /* JADX INFO: renamed from: d */
        public AbstractC0110a<InterfaceC46071e> f9478d;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t0$b$a */
        /* JADX INFO: compiled from: PostprocessorProducer.java */
        public class a extends C5691f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5727t0 f9480a;

            public a(C5727t0 c5727t0) {
                this.f9480a = c5727t0;
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: b */
            public void mo9116b() {
                if (b.this.m9836q()) {
                    b.this.m9801o().mo9651a();
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public final boolean m9836q() {
            synchronized (this) {
                try {
                    if (this.f9477c) {
                        return false;
                    }
                    AbstractC0110a<InterfaceC46071e> abstractC0110a = this.f9478d;
                    this.f9478d = null;
                    this.f9477c = true;
                    AbstractC0110a.m555j(abstractC0110a);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: s */
        public final void m9838s(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
            synchronized (this) {
                try {
                    if (this.f9477c) {
                        return;
                    }
                    AbstractC0110a<InterfaceC46071e> abstractC0110a2 = this.f9478d;
                    this.f9478d = AbstractC0110a.m553h(abstractC0110a);
                    AbstractC0110a.m555j(abstractC0110a2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: t */
        public final void m9839t() {
            synchronized (this) {
                try {
                    if (this.f9477c) {
                        return;
                    }
                    AbstractC0110a<InterfaceC46071e> abstractC0110aM553h = AbstractC0110a.m553h(this.f9478d);
                    try {
                        m9801o().mo9652b(abstractC0110aM553h, 0);
                    } finally {
                        AbstractC0110a.m555j(abstractC0110aM553h);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public b(a aVar, InterfaceC5743c interfaceC5743c, InterfaceC5733w0 interfaceC5733w0) {
            super(aVar);
            this.f9477c = false;
            this.f9478d = null;
            interfaceC5743c.m9895a(this);
            interfaceC5733w0.mo9667i(new a(C5727t0.this));
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: f */
        public void mo9549f() {
            if (m9836q()) {
                m9801o().mo9651a();
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: g */
        public void mo9550g(Throwable th2) {
            if (m9836q()) {
                m9801o().onFailure(th2);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo9551h(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            if (AbstractC5682c.m9646e(i11)) {
                return;
            }
            m9838s(abstractC0110a);
            m9839t();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t0$c */
    /* JADX INFO: compiled from: PostprocessorProducer.java */
    public class c extends AbstractC5724s<AbstractC0110a<InterfaceC46071e>, AbstractC0110a<InterfaceC46071e>> {
        public c(a aVar) {
            super(aVar);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(AbstractC0110a<InterfaceC46071e> abstractC0110a, int i11) {
            if (AbstractC5682c.m9646e(i11)) {
                return;
            }
            m9801o().mo9652b(abstractC0110a, i11);
        }
    }

    public C5727t0(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0, AbstractC43387c abstractC43387c, Executor executor) {
        this.f9462a = (InterfaceC5731v0) C45708h.m100896g(interfaceC5731v0);
        this.f9463b = abstractC43387c;
        this.f9464c = (Executor) C45708h.m100896g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        C5727t0 c5727t0;
        InterfaceC5733w0 interfaceC5733w1;
        InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> cVar;
        InterfaceC5737y0 interfaceC5737y0Mo9665g = interfaceC5733w0.mo9665g();
        InterfaceC5742b postprocessor = interfaceC5733w0.mo9666h().getPostprocessor();
        C45708h.m100896g(postprocessor);
        a aVar = new a(interfaceC5712m, interfaceC5737y0Mo9665g, postprocessor, interfaceC5733w0);
        if (postprocessor instanceof InterfaceC5743c) {
            interfaceC5733w1 = interfaceC5733w0;
            cVar = new b(aVar, (InterfaceC5743c) postprocessor, interfaceC5733w1);
            c5727t0 = this;
        } else {
            c5727t0 = this;
            interfaceC5733w1 = interfaceC5733w0;
            cVar = new c(aVar);
        }
        c5727t0.f9462a.mo9524a(cVar, interfaceC5733w1);
    }
}
