package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p712w3.C45708h;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.h1 */
/* JADX INFO: compiled from: ThrottlingProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5699h1<T> implements InterfaceC5731v0<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5731v0<T> f9345a;

    /* JADX INFO: renamed from: b */
    public final int f9346b;

    /* JADX INFO: renamed from: e */
    public final Executor f9349e;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue<Pair<InterfaceC5712m<T>, InterfaceC5733w0>> f9348d = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c */
    public int f9347c = 0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.h1$a */
    /* JADX INFO: compiled from: ThrottlingProducer.java */
    public class a extends AbstractC5724s<T, T> {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.h1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ThrottlingProducer.java */
        public class RunnableC46966a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Pair f9351b;

            public RunnableC46966a(Pair pair) {
                this.f9351b = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5699h1 c5699h1 = C5699h1.this;
                Pair pair = this.f9351b;
                c5699h1.m9704g((InterfaceC5712m) pair.first, (InterfaceC5733w0) pair.second);
            }
        }

        public a(InterfaceC5712m<T> interfaceC5712m) {
            super(interfaceC5712m);
        }

        /* JADX INFO: renamed from: p */
        public final void m9705p() {
            Pair pair;
            synchronized (C5699h1.this) {
                try {
                    pair = (Pair) C5699h1.this.f9348d.poll();
                    if (pair == null) {
                        C5699h1.this.f9347c--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair != null) {
                C5699h1.this.f9349e.execute(new RunnableC46966a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: f */
        public void mo9549f() {
            m9801o().mo9651a();
            m9705p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: g */
        public void mo9550g(Throwable th2) {
            m9801o().onFailure(th2);
            m9705p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: h */
        public void mo9551h(T t11, int i11) {
            m9801o().mo9652b(t11, i11);
            if (AbstractC5682c.m9645d(i11)) {
                m9705p();
            }
        }
    }

    public C5699h1(int i11, Executor executor, InterfaceC5731v0<T> interfaceC5731v0) {
        this.f9346b = i11;
        this.f9349e = (Executor) C45708h.m100896g(executor);
        this.f9345a = (InterfaceC5731v0) C45708h.m100896g(interfaceC5731v0);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(InterfaceC5712m<T> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        boolean z11;
        interfaceC5733w0.mo9665g().mo9454b(interfaceC5733w0, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i11 = this.f9347c;
                z11 = true;
                if (i11 >= this.f9346b) {
                    this.f9348d.add(Pair.create(interfaceC5712m, interfaceC5733w0));
                } else {
                    this.f9347c = i11 + 1;
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            m9704g(interfaceC5712m, interfaceC5733w0);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m9704g(InterfaceC5712m<T> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        interfaceC5733w0.mo9665g().mo9462j(interfaceC5733w0, "ThrottlingProducer", null);
        this.f9345a.mo9524a(new a(interfaceC5712m), interfaceC5733w0);
    }
}
