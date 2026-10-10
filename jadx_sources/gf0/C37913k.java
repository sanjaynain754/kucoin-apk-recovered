package gf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cf0.InterfaceC4957l;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gf0.k */
/* JADX INFO: compiled from: MarkwonHtmlRendererImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37913k extends AbstractC37912j {

    /* JADX INFO: renamed from: a */
    public final boolean f85312a;

    /* JADX INFO: renamed from: b */
    public final Map<String, AbstractC37915m> f85313b;

    /* JADX INFO: renamed from: gf0.k$a */
    /* JADX INFO: compiled from: MarkwonHtmlRendererImpl.java */
    public class a implements AbstractC37910h.a<InterfaceC37908f.b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4957l f85314a;

        public a(InterfaceC4957l interfaceC4957l) {
            this.f85314a = interfaceC4957l;
        }

        @Override // gf0.AbstractC37910h.a
        public void apply(@NonNull List<InterfaceC37908f.b> list) {
            AbstractC37915m abstractC37915mMo85728b;
            for (InterfaceC37908f.b bVar : list) {
                if (bVar.isClosed() && (abstractC37915mMo85728b = C37913k.this.mo85728b(bVar.name())) != null) {
                    abstractC37915mMo85728b.mo85734a(this.f85314a, C37913k.this, bVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: gf0.k$b */
    /* JADX INFO: compiled from: MarkwonHtmlRendererImpl.java */
    public class b implements AbstractC37910h.a<InterfaceC37908f.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4957l f85316a;

        public b(InterfaceC4957l interfaceC4957l) {
            this.f85316a = interfaceC4957l;
        }

        @Override // gf0.AbstractC37910h.a
        public void apply(@NonNull List<InterfaceC37908f.a> list) {
            for (InterfaceC37908f.a aVar : list) {
                if (aVar.isClosed()) {
                    AbstractC37915m abstractC37915mMo85728b = C37913k.this.mo85728b(aVar.name());
                    if (abstractC37915mMo85728b != null) {
                        abstractC37915mMo85728b.mo85734a(this.f85316a, C37913k.this, aVar);
                    } else {
                        apply(aVar.mo85700f());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: gf0.k$c */
    /* JADX INFO: compiled from: MarkwonHtmlRendererImpl.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final Map<String, AbstractC37915m> f85318a = new HashMap(2);

        /* JADX INFO: renamed from: b */
        public boolean f85319b;

        /* JADX INFO: renamed from: c */
        public boolean f85320c;

        /* JADX INFO: renamed from: d */
        public boolean f85321d;

        /* JADX INFO: renamed from: c */
        public final void m85731c() {
            if (this.f85321d) {
                throw new IllegalStateException("Builder has been already built");
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m85732d() {
            return this.f85320c;
        }

        /* JADX INFO: renamed from: a */
        public void m85729a(@NonNull AbstractC37915m abstractC37915m) {
            for (String str : abstractC37915m.mo85735b()) {
                if (!this.f85318a.containsKey(str)) {
                    this.f85318a.put(str, abstractC37915m);
                }
            }
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public AbstractC37912j m85730b() {
            m85731c();
            this.f85321d = true;
            if (this.f85318a.size() > 0) {
                return new C37913k(this.f85319b, Collections.unmodifiableMap(this.f85318a));
            }
            return new C37914l();
        }
    }

    @Override // gf0.AbstractC37912j
    /* JADX INFO: renamed from: a */
    public void mo85727a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC37910h abstractC37910h) {
        int length = !this.f85312a ? -1 : interfaceC4957l.length();
        abstractC37910h.mo85707b(length, new a(interfaceC4957l));
        abstractC37910h.mo85706a(length, new b(interfaceC4957l));
        abstractC37910h.mo85709d();
    }

    @Override // gf0.AbstractC37912j
    @Nullable
    /* JADX INFO: renamed from: b */
    public AbstractC37915m mo85728b(@NonNull String str) {
        return this.f85313b.get(str);
    }

    public C37913k(boolean z11, @NonNull Map<String, AbstractC37915m> map) {
        this.f85312a = z11;
        this.f85313b = map;
    }
}
