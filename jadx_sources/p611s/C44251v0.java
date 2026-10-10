package p611s;

import com.google.common.net.HttpHeaders;
import p246f.AbstractC37284f;
import p277g.C37738d;
import p277g.InterfaceC37735a;

/* JADX INFO: renamed from: s.v0 */
/* JADX INFO: loaded from: classes23.dex */
public class C44251v0 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C37738d m97598c(String str, String str2) {
        return new C37738d.b("console_log").m85089f(str).m85091h(str2).m85096m();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C37738d m97599d(String str, String str2, String str3) {
        return new C37738d.b("function_called").m85094k("function_name", str).m85094k("class_name", str2).m85088e(str3).m85096m();
    }

    /* JADX INFO: renamed from: e */
    public static void m97600e(final String str, final String str2) {
        C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.u0
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return C44251v0.m97598c(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m97601f(final String str, final String str2, final String str3) {
        C44211c1.m97482R().m83469L(new InterfaceC37735a() { // from class: s.t0
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return C44251v0.m97599d(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m97602g(Throwable th2) {
        m97603h(AbstractC37284f.m83455H(th2));
    }

    /* JADX INFO: renamed from: h */
    public static void m97603h(Object obj) {
        m97600e(HttpHeaders.WARNING, String.valueOf(obj));
    }
}
