package of0;

import androidx.annotation.NonNull;
import cf0.AbstractC4946a;
import cf0.C4965t;
import cf0.InterfaceC4957l;
import cf0.InterfaceC4964s;
import java.util.Iterator;
import jh0.C40408d;
import lh0.InterfaceC42224a;

/* JADX INFO: renamed from: of0.d */
/* JADX INFO: compiled from: SimpleExtPlugin.java */
/* JADX INFO: loaded from: classes60.dex */
public class C43042d extends AbstractC4946a {

    /* JADX INFO: renamed from: a */
    public final C43039a f95230a = new C43039a();

    /* JADX INFO: renamed from: of0.d$a */
    /* JADX INFO: compiled from: SimpleExtPlugin.java */
    public class a implements InterfaceC4957l.c<C43041c> {
        public a() {
        }

        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C43041c c43041c) {
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c43041c);
            C4965t.m5248j(interfaceC4957l.builder(), c43041c.m94526m().mo5246a(interfaceC4957l.mo5202o(), interfaceC4957l.mo5200h()), length, interfaceC4957l.length());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C43042d m94527b() {
        return new C43042d();
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public C43042d m94528a(int i11, char c11, char c12, @NonNull InterfaceC4964s interfaceC4964s) {
        this.f95230a.m94523a(i11, c11, c12, interfaceC4964s);
        return this;
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public void configureParser(@NonNull C40408d.b bVar) {
        Iterator<InterfaceC42224a> it = this.f95230a.m94524b().iterator();
        while (it.hasNext()) {
            bVar.m89049g(it.next());
        }
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public void configureVisitor(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C43041c.class, new a());
    }
}
