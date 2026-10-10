package gf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cf0.AbstractC4946a;
import cf0.C4952g;
import cf0.InterfaceC4957l;
import ih0.AbstractC38637s;
import ih0.C38629k;
import ih0.C38630l;
import kf0.C41017a;
import kf0.C41018b;
import kf0.C41019c;
import kf0.C41020d;
import kf0.C41022f;
import kf0.C41023g;
import kf0.C41025i;
import kf0.C41026j;
import kf0.C41027k;
import kf0.C41028l;
import kf0.C41029m;

/* JADX INFO: renamed from: gf0.e */
/* JADX INFO: compiled from: HtmlPlugin.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37907e extends AbstractC4946a {

    /* JADX INFO: renamed from: b */
    public AbstractC37910h f85291b;

    /* JADX INFO: renamed from: c */
    public AbstractC37912j f85292c;

    /* JADX INFO: renamed from: d */
    public C37906d f85293d = new C37906d();

    /* JADX INFO: renamed from: a */
    public final C37913k.c f85290a = new C37913k.c();

    /* JADX INFO: renamed from: gf0.e$a */
    /* JADX INFO: compiled from: HtmlPlugin.java */
    public class a implements InterfaceC4957l.c<C38630l> {
        public a() {
        }

        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38630l c38630l) {
            C37907e.this.m85692c(interfaceC4957l, c38630l.m87342m());
        }
    }

    /* JADX INFO: renamed from: gf0.e$b */
    /* JADX INFO: compiled from: HtmlPlugin.java */
    public class b implements InterfaceC4957l.c<C38629k> {
        public b() {
        }

        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38629k c38629k) {
            C37907e.this.m85692c(interfaceC4957l, c38629k.m87340n());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C37907e m85691b() {
        return new C37907e();
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public void afterRender(@NonNull AbstractC38637s abstractC38637s, @NonNull InterfaceC4957l interfaceC4957l) {
        AbstractC37912j abstractC37912j = this.f85292c;
        if (abstractC37912j == null) {
            throw new IllegalStateException("Unexpected state, html-renderer is not defined");
        }
        abstractC37912j.mo85727a(interfaceC4957l, this.f85291b);
    }

    /* JADX INFO: renamed from: c */
    public final void m85692c(@NonNull InterfaceC4957l interfaceC4957l, @Nullable String str) {
        if (str != null) {
            this.f85291b.mo85708c(interfaceC4957l.builder(), str);
        }
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public void configureConfiguration(@NonNull C4952g.b bVar) {
        C37913k.c cVar = this.f85290a;
        if (!cVar.m85732d()) {
            cVar.m85729a(C41020d.m89975e());
            cVar.m85729a(new C41022f());
            cVar.m85729a(new C41017a());
            cVar.m85729a(new C41027k());
            cVar.m85729a(new C41028l());
            cVar.m85729a(new C41026j());
            cVar.m85729a(new C41025i());
            cVar.m85729a(new C41029m());
            cVar.m85729a(new C41023g());
            cVar.m85729a(new C41018b());
            cVar.m85729a(new C41019c());
        }
        this.f85291b = C37911i.m85710g(this.f85293d);
        this.f85292c = cVar.m85730b();
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public void configureVisitor(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38629k.class, new b()).mo5207b(C38630l.class, new a());
    }
}
