package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.C5311e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.util.Map;
import java.util.concurrent.Executor;
import p419l2.InterfaceC42033g;
import p523p2.C43359f;
import p523p2.C43363j;
import p546q2.C43591a;
import p628t1.C44613e;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44616h;
import p680v1.AbstractC45352c;
import p680v1.C45354e;
import p680v1.C45355f;
import p680v1.C45357h;
import p680v1.C45361l;
import p680v1.InterfaceC45353d;
import p680v1.InterfaceC45359j;
import p745x1.C45982b;
import p745x1.InterfaceC45981a;
import p745x1.InterfaceC45988h;
import p782y1.ExecutorServiceC46362a;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.f */
/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes.dex */
public class C5346f implements InterfaceC45353d, InterfaceC45988h.a, C5348h.a {

    /* JADX INFO: renamed from: i */
    public static final boolean f6866i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    public final C45357h f6867a;

    /* JADX INFO: renamed from: b */
    public final C45355f f6868b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45988h f6869c;

    /* JADX INFO: renamed from: d */
    public final b f6870d;

    /* JADX INFO: renamed from: e */
    public final C45361l f6871e;

    /* JADX INFO: renamed from: f */
    public final c f6872f;

    /* JADX INFO: renamed from: g */
    public final a f6873g;

    /* JADX INFO: renamed from: h */
    public final C5341a f6874h;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$a */
    /* JADX INFO: compiled from: Engine.java */
    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a */
        public final DecodeJob.InterfaceC5338e f6875a;

        /* JADX INFO: renamed from: b */
        public final Pools.Pool<DecodeJob<?>> f6876b = C43591a.m95935d(150, new C46961a());

        /* JADX INFO: renamed from: c */
        public int f6877c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Engine.java */
        public class C46961a implements C43591a.d<DecodeJob<?>> {
            public C46961a() {
            }

            @Override // p546q2.C43591a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public DecodeJob<?> create() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f6875a, aVar.f6876b);
            }
        }

        /* JADX INFO: renamed from: a */
        public <R> DecodeJob<R> m6794a(C5311e c5311e, Object obj, C45354e c45354e, InterfaceC44610b interfaceC44610b, int i11, int i12, Class<?> cls, Class<R> cls2, Priority priority, AbstractC45352c abstractC45352c, Map<Class<?>, InterfaceC44616h<?>> map, boolean z11, boolean z12, boolean z13, C44613e c44613e, DecodeJob.InterfaceC5335b<R> interfaceC5335b) {
            DecodeJob decodeJob = (DecodeJob) C43363j.m95506d(this.f6876b.acquire());
            int i13 = this.f6877c;
            this.f6877c = i13 + 1;
            return decodeJob.m6712m(c5311e, obj, c45354e, interfaceC44610b, i11, i12, cls, cls2, priority, abstractC45352c, map, z11, z12, z13, c44613e, interfaceC5335b, i13);
        }

        public a(DecodeJob.InterfaceC5338e interfaceC5338e) {
            this.f6875a = interfaceC5338e;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$b */
    /* JADX INFO: compiled from: Engine.java */
    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a */
        public final ExecutorServiceC46362a f6879a;

        /* JADX INFO: renamed from: b */
        public final ExecutorServiceC46362a f6880b;

        /* JADX INFO: renamed from: c */
        public final ExecutorServiceC46362a f6881c;

        /* JADX INFO: renamed from: d */
        public final ExecutorServiceC46362a f6882d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC45353d f6883e;

        /* JADX INFO: renamed from: f */
        public final C5348h.a f6884f;

        /* JADX INFO: renamed from: g */
        public final Pools.Pool<C5347g<?>> f6885g = C43591a.m95935d(150, new a());

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$b$a */
        /* JADX INFO: compiled from: Engine.java */
        public class a implements C43591a.d<C5347g<?>> {
            public a() {
            }

            @Override // p546q2.C43591a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C5347g<?> create() {
                b bVar = b.this;
                return new C5347g<>(bVar.f6879a, bVar.f6880b, bVar.f6881c, bVar.f6882d, bVar.f6883e, bVar.f6884f, bVar.f6885g);
            }
        }

        /* JADX INFO: renamed from: a */
        public <R> C5347g<R> m6796a(InterfaceC44610b interfaceC44610b, boolean z11, boolean z12, boolean z13, boolean z14) {
            return ((C5347g) C43363j.m95506d(this.f6885g.acquire())).m6807l(interfaceC44610b, z11, z12, z13, z14);
        }

        public b(ExecutorServiceC46362a executorServiceC46362a, ExecutorServiceC46362a executorServiceC46362a2, ExecutorServiceC46362a executorServiceC46362a3, ExecutorServiceC46362a executorServiceC46362a4, InterfaceC45353d interfaceC45353d, C5348h.a aVar) {
            this.f6879a = executorServiceC46362a;
            this.f6880b = executorServiceC46362a2;
            this.f6881c = executorServiceC46362a3;
            this.f6882d = executorServiceC46362a4;
            this.f6883e = interfaceC45353d;
            this.f6884f = aVar;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$c */
    /* JADX INFO: compiled from: Engine.java */
    public static class c implements DecodeJob.InterfaceC5338e {

        /* JADX INFO: renamed from: a */
        public final InterfaceC45981a.a f6887a;

        /* JADX INFO: renamed from: b */
        public volatile InterfaceC45981a f6888b;

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5338e
        /* JADX INFO: renamed from: a */
        public InterfaceC45981a mo6734a() {
            if (this.f6888b == null) {
                synchronized (this) {
                    try {
                        if (this.f6888b == null) {
                            this.f6888b = this.f6887a.build();
                        }
                        if (this.f6888b == null) {
                            this.f6888b = new C45982b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f6888b;
        }

        public c(InterfaceC45981a.a aVar) {
            this.f6887a = aVar;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.f$d */
    /* JADX INFO: compiled from: Engine.java */
    public class d {

        /* JADX INFO: renamed from: a */
        public final C5347g<?> f6889a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC42033g f6890b;

        public d(InterfaceC42033g interfaceC42033g, C5347g<?> c5347g) {
            this.f6890b = interfaceC42033g;
            this.f6889a = c5347g;
        }

        /* JADX INFO: renamed from: a */
        public void m6798a() {
            synchronized (C5346f.this) {
                this.f6889a.m6812r(this.f6890b);
            }
        }
    }

    public C5346f(InterfaceC45988h interfaceC45988h, InterfaceC45981a.a aVar, ExecutorServiceC46362a executorServiceC46362a, ExecutorServiceC46362a executorServiceC46362a2, ExecutorServiceC46362a executorServiceC46362a3, ExecutorServiceC46362a executorServiceC46362a4, boolean z11) {
        this(interfaceC45988h, aVar, executorServiceC46362a, executorServiceC46362a2, executorServiceC46362a3, executorServiceC46362a4, null, null, null, null, null, null, z11);
    }

    @Override // p680v1.InterfaceC45353d
    /* JADX INFO: renamed from: a */
    public synchronized void mo6783a(C5347g<?> c5347g, InterfaceC44610b interfaceC44610b, C5348h<?> c5348h) {
        if (c5348h != null) {
            try {
                if (c5348h.m6822d()) {
                    this.f6874h.m6746a(interfaceC44610b, c5348h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6867a.m100258d(interfaceC44610b, c5347g);
    }

    @Override // p680v1.InterfaceC45353d
    /* JADX INFO: renamed from: b */
    public synchronized void mo6784b(C5347g<?> c5347g, InterfaceC44610b interfaceC44610b) {
        this.f6867a.m100258d(interfaceC44610b, c5347g);
    }

    /* JADX INFO: renamed from: f */
    public <R> d m6788f(C5311e c5311e, Object obj, InterfaceC44610b interfaceC44610b, int i11, int i12, Class<?> cls, Class<R> cls2, Priority priority, AbstractC45352c abstractC45352c, Map<Class<?>, InterfaceC44616h<?>> map, boolean z11, boolean z12, C44613e c44613e, boolean z13, boolean z14, boolean z15, boolean z16, InterfaceC42033g interfaceC42033g, Executor executor) {
        long jM95490b = f6866i ? C43359f.m95490b() : 0L;
        C45354e c45354eM100254a = this.f6868b.m100254a(obj, interfaceC44610b, i11, i12, map, cls, cls2, c44613e);
        synchronized (this) {
            try {
                C5348h<?> c5348hM6791i = m6791i(c45354eM100254a, z13, jM95490b);
                if (c5348hM6791i == null) {
                    return m6793l(c5311e, obj, interfaceC44610b, i11, i12, cls, cls2, priority, abstractC45352c, map, z11, z12, c44613e, z13, z14, z15, z16, interfaceC42033g, executor, c45354eM100254a, jM95490b);
                }
                interfaceC42033g.mo6937c(c5348hM6791i, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final C5348h<?> m6791i(C45354e c45354e, boolean z11, long j11) {
        if (!z11) {
            return null;
        }
        C5348h<?> c5348hM6789g = m6789g(c45354e);
        if (c5348hM6789g != null) {
            if (f6866i) {
                m6782j("Loaded resource from active resources", j11, c45354e);
            }
            return c5348hM6789g;
        }
        C5348h<?> c5348hM6790h = m6790h(c45354e);
        if (c5348hM6790h == null) {
            return null;
        }
        if (f6866i) {
            m6782j("Loaded resource from cache", j11, c45354e);
        }
        return c5348hM6790h;
    }

    /* JADX INFO: renamed from: l */
    public final <R> d m6793l(C5311e c5311e, Object obj, InterfaceC44610b interfaceC44610b, int i11, int i12, Class<?> cls, Class<R> cls2, Priority priority, AbstractC45352c abstractC45352c, Map<Class<?>, InterfaceC44616h<?>> map, boolean z11, boolean z12, C44613e c44613e, boolean z13, boolean z14, boolean z15, boolean z16, InterfaceC42033g interfaceC42033g, Executor executor, C45354e c45354e, long j11) {
        C5347g<?> c5347gM100255a = this.f6867a.m100255a(c45354e, z16);
        if (c5347gM100255a != null) {
            c5347gM100255a.m6800a(interfaceC42033g, executor);
            if (f6866i) {
                m6782j("Added to existing load", j11, c45354e);
            }
            return new d(interfaceC42033g, c5347gM100255a);
        }
        C5347g<R> c5347gM6796a = this.f6870d.m6796a(c45354e, z13, z14, z15, z16);
        DecodeJob<R> decodeJobM6794a = this.f6873g.m6794a(c5311e, obj, c45354e, interfaceC44610b, i11, i12, cls, cls2, priority, abstractC45352c, map, z11, z12, z16, c44613e, c5347gM6796a);
        this.f6867a.m100257c(c45354e, c5347gM6796a);
        c5347gM6796a.m6800a(interfaceC42033g, executor);
        c5347gM6796a.m6813s(decodeJobM6794a);
        if (f6866i) {
            m6782j("Started new load", j11, c45354e);
        }
        return new d(interfaceC42033g, c5347gM6796a);
    }

    @VisibleForTesting
    public C5346f(InterfaceC45988h interfaceC45988h, InterfaceC45981a.a aVar, ExecutorServiceC46362a executorServiceC46362a, ExecutorServiceC46362a executorServiceC46362a2, ExecutorServiceC46362a executorServiceC46362a3, ExecutorServiceC46362a executorServiceC46362a4, C45357h c45357h, C45355f c45355f, C5341a c5341a, b bVar, a aVar2, C45361l c45361l, boolean z11) {
        this.f6869c = interfaceC45988h;
        c cVar = new c(aVar);
        this.f6872f = cVar;
        C5341a c5341a2 = c5341a == null ? new C5341a(z11) : c5341a;
        this.f6874h = c5341a2;
        c5341a2.m6751f(this);
        this.f6868b = c45355f == null ? new C45355f() : c45355f;
        this.f6867a = c45357h == null ? new C45357h() : c45357h;
        this.f6870d = bVar == null ? new b(executorServiceC46362a, executorServiceC46362a2, executorServiceC46362a3, executorServiceC46362a4, this, this) : bVar;
        this.f6873g = aVar2 == null ? new a(cVar) : aVar2;
        this.f6871e = c45361l == null ? new C45361l() : c45361l;
        interfaceC45988h.mo101450e(this);
    }

    /* JADX INFO: renamed from: j */
    public static void m6782j(String str, long j11, InterfaceC44610b interfaceC44610b) {
        Log.v("Engine", str + " in " + C43359f.m95489a(j11) + "ms, key: " + interfaceC44610b);
    }

    @Override // com.bumptech.glide.load.engine.C5348h.a
    /* JADX INFO: renamed from: c */
    public void mo6785c(InterfaceC44610b interfaceC44610b, C5348h<?> c5348h) {
        this.f6874h.m6749d(interfaceC44610b);
        if (c5348h.m6822d()) {
            this.f6869c.mo101449d(interfaceC44610b, c5348h);
        } else {
            this.f6871e.m100265a(c5348h, false);
        }
    }

    @Override // p745x1.InterfaceC45988h.a
    /* JADX INFO: renamed from: d */
    public void mo6786d(@NonNull InterfaceC45359j<?> interfaceC45359j) {
        this.f6871e.m100265a(interfaceC45359j, true);
    }

    /* JADX INFO: renamed from: e */
    public final C5348h<?> m6787e(InterfaceC44610b interfaceC44610b) {
        InterfaceC45359j<?> interfaceC45359jMo101448b = this.f6869c.mo101448b(interfaceC44610b);
        if (interfaceC45359jMo101448b == null) {
            return null;
        }
        return interfaceC45359jMo101448b instanceof C5348h ? (C5348h) interfaceC45359jMo101448b : new C5348h<>(interfaceC45359jMo101448b, true, true, interfaceC44610b, this);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final C5348h<?> m6789g(InterfaceC44610b interfaceC44610b) {
        C5348h<?> c5348hM6750e = this.f6874h.m6750e(interfaceC44610b);
        if (c5348hM6750e != null) {
            c5348hM6750e.m6820b();
        }
        return c5348hM6750e;
    }

    /* JADX INFO: renamed from: k */
    public void m6792k(InterfaceC45359j<?> interfaceC45359j) {
        if (!(interfaceC45359j instanceof C5348h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C5348h) interfaceC45359j).m6823e();
    }

    /* JADX INFO: renamed from: h */
    public final C5348h<?> m6790h(InterfaceC44610b interfaceC44610b) {
        C5348h<?> c5348hM6787e = m6787e(interfaceC44610b);
        if (c5348hM6787e != null) {
            c5348hM6787e.m6820b();
            this.f6874h.m6746a(interfaceC44610b, c5348hM6787e);
        }
        return c5348hM6787e;
    }
}
