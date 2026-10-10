package a3d20260409;

import android.text.TextUtils;
import android.util.Pair;
import intl.oOooooooooooooo;
import p277g.C37737c;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p442m.C42337g;
import p457n.C42685f;
import p457n.C42686g;
import p457n.C42687h;
import p457n.C42692m;
import p482o.C42901a;
import p520p.AbstractC43343d;
import p520p.C43341b;
import p520p.C43342c;
import p579r.C43890a;
import we0.C45819f;

/* JADX INFO: renamed from: a3d20260409.l */
/* JADX INFO: loaded from: classes23.dex */
public class C0075l {

    /* JADX INFO: renamed from: a3d20260409.l$a */
    public class a implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C42687h f315a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ oOooooooooooooo f316b;

        public a(C42687h c42687h, oOooooooooooooo ooooooooooooooo) {
            this.f315a = c42687h;
            this.f316b = ooooooooooooooo;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b("network_performance").m85074b(this.f315a.m93550b().m93571d()).m85075c("networkLib", C0075l.m358a() ? "java" : "cpp").m85075c("url", C0109v.m533g(this.f316b.name())).m85075c("networkType", C42337g.m92907d(C43890a.m96661b())).m85075c("transactionId", this.f315a.m93551c()).m85077e(true).m85076d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m358a() {
        return C0109v.m544r(intl.oOooooooo0000000000.JAVA_NETWORK);
    }

    /* JADX INFO: renamed from: b */
    public static Pair<C42687h, Integer> m359b(oOooooooooooooo ooooooooooooooo, String str, C37739e c37739e) {
        return m360c(ooooooooooooooo, new C43341b.a().m95419c(str).m95418b(), c37739e);
    }

    /* JADX INFO: renamed from: d */
    public static Pair<C42687h, Integer> m361d(oOooooooooooooo ooooooooooooooo, byte[] bArr, C37739e c37739e) {
        return m360c(ooooooooooooooo, new C43342c.a().m95428e(bArr).m95430g(), c37739e);
    }

    /* JADX INFO: renamed from: f */
    public static void m363f(oOooooooooooooo ooooooooooooooo, C42687h c42687h, C37739e c37739e) {
        if (ooooooooooooooo == oOooooooooooooo.LOG || ooooooooooooooo == oOooooooooooooo.CRASH || ooooooooooooooo == oOooooooooooooo.SHENCE) {
            return;
        }
        C45819f.m101227J().m83490F(new a(c42687h, ooooooooooooooo), c37739e);
    }

    /* JADX INFO: renamed from: c */
    public static Pair<C42687h, Integer> m360c(oOooooooooooooo ooooooooooooooo, AbstractC43343d abstractC43343d, C37739e c37739e) {
        String strM541o;
        int iCurrentTimeMillis;
        C42687h c42687h;
        C42686g c42686gM93543h;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM533g = C0109v.m533g(ooooooooooooooo.name());
        if (m358a()) {
            c42686gM93543h = new C42686g.a().m93547l(strM533g).m93542g(C0109v.m551z()).m93548m(abstractC43343d).m93544i(m362e()).m93543h();
            c42687h = new C42685f.b().m93526d(new C42901a()).m93529g(30000).m93528f(false).m93527e().m93519n(c42686gM93543h);
            iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
        } else {
            if (abstractC43343d instanceof C43341b) {
                strM541o = C0109v.m540n(strM533g, ((C43341b) abstractC43343d).m95416b());
            } else if (abstractC43343d instanceof C43342c) {
                strM541o = C0109v.m541o(strM533g, "esu2fhj1C0QmBl2Z", ((C43342c) abstractC43343d).m95420b());
            } else {
                strM541o = null;
            }
            iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            C42692m c42692m = new C42692m();
            c42692m.m93582o(iCurrentTimeMillis);
            c42687h = new C42687h(strM541o, c42692m);
            c42686gM93543h = null;
        }
        m363f(ooooooooooooooo, c42687h, c37739e);
        m364g("", c42686gM93543h, c42687h, strM533g, iCurrentTimeMillis);
        return Pair.create(c42687h, Integer.valueOf(iCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: e */
    public static String m362e() {
        String strOOo0oOo0o = j3d20260409.oOo0oOo0o();
        if (TextUtils.isEmpty(strOOo0oOo0o)) {
            return null;
        }
        if (strOOo0oOo0o.startsWith("sha256//")) {
            return strOOo0oOo0o.replace("sha256//", "");
        }
        return strOOo0oOo0o;
    }

    /* JADX INFO: renamed from: g */
    public static void m364g(String str, C42686g c42686g, C42687h c42687h, String str2, int i11) {
    }
}
