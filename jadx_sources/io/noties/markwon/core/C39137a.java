package io.noties.markwon.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import cf0.AbstractC4946a;
import cf0.C4952g;
import cf0.InterfaceC4955j;
import cf0.InterfaceC4957l;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import df0.C36672b;
import ef0.C37164a;
import ef0.C37165b;
import ef0.C37166c;
import ef0.C37167d;
import ef0.C37168e;
import ef0.C37169f;
import ef0.C37170g;
import ef0.C37171h;
import ef0.C37172i;
import ih0.AbstractC38619a;
import ih0.AbstractC38635q;
import ih0.AbstractC38637s;
import ih0.C38620b;
import ih0.C38621c;
import ih0.C38622d;
import ih0.C38625g;
import ih0.C38626h;
import ih0.C38627i;
import ih0.C38628j;
import ih0.C38631m;
import ih0.C38632n;
import ih0.C38633o;
import ih0.C38636r;
import ih0.C38638t;
import ih0.C38639u;
import ih0.C38640v;
import ih0.C38641w;
import ih0.C38642x;
import ih0.C38643y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lf0.AbstractC42184c;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: io.noties.markwon.core.a */
/* JADX INFO: compiled from: CorePlugin.java */
/* JADX INFO: loaded from: classes60.dex */
public class C39137a extends AbstractC4946a {

    /* JADX INFO: renamed from: a */
    public final List<p> f87007a = new ArrayList(0);

    /* JADX INFO: renamed from: io.noties.markwon.core.a$g */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class g implements InterfaceC4957l.c<C38642x> {
        public g() {
        }

        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38642x c38642x) {
            String strM87366m = c38642x.m87366m();
            interfaceC4957l.builder().m5253d(strM87366m);
            if (!C39137a.this.f87007a.isEmpty()) {
                int length = interfaceC4957l.length() - strM87366m.length();
                Iterator it = C39137a.this.f87007a.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).mo87841a(interfaceC4957l, strM87366m, length);
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$p */
    /* JADX INFO: compiled from: CorePlugin.java */
    public interface p {
        /* JADX INFO: renamed from: a */
        void mo87841a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull String str, int i11);
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$a */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class a implements InterfaceC4957l.c<C38643y> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38643y c38643y) {
            interfaceC4957l.mo5204v(c38643y);
            int length = interfaceC4957l.length();
            interfaceC4957l.builder().append(Typography.nbsp);
            interfaceC4957l.mo5199d(c38643y, length);
            interfaceC4957l.mo5197F(c38643y);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$b */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class b implements InterfaceC4957l.c<C38628j> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38628j c38628j) {
            interfaceC4957l.mo5204v(c38628j);
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c38628j);
            CoreProps.f87002d.m5239d(interfaceC4957l.mo5200h(), Integer.valueOf(c38628j.m87338n()));
            interfaceC4957l.mo5199d(c38628j, length);
            interfaceC4957l.mo5197F(c38628j);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$c */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class c implements InterfaceC4957l.c<C38640v> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38640v c38640v) {
            interfaceC4957l.builder().append(' ');
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$d */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class d implements InterfaceC4957l.c<C38627i> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38627i c38627i) {
            interfaceC4957l.mo5203q();
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$e */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class e implements InterfaceC4957l.c<C38639u> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38639u c38639u) {
            boolean zM87814o = C39137a.m87814o(c38639u);
            if (!zM87814o) {
                interfaceC4957l.mo5204v(c38639u);
            }
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c38639u);
            CoreProps.f87004f.m5239d(interfaceC4957l.mo5200h(), Boolean.valueOf(zM87814o));
            interfaceC4957l.mo5199d(c38639u, length);
            if (!zM87814o) {
                interfaceC4957l.mo5197F(c38639u);
            }
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$f */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class f implements InterfaceC4957l.c<C38633o> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38633o c38633o) {
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c38633o);
            CoreProps.f87003e.m5239d(interfaceC4957l.mo5200h(), c38633o.m87348m());
            interfaceC4957l.mo5199d(c38633o, length);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$h */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class h implements InterfaceC4957l.c<C38641w> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38641w c38641w) {
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c38641w);
            interfaceC4957l.mo5199d(c38641w, length);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$i */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class i implements InterfaceC4957l.c<C38625g> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38625g c38625g) {
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c38625g);
            interfaceC4957l.mo5199d(c38625g, length);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$j */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class j implements InterfaceC4957l.c<C38620b> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38620b c38620b) {
            interfaceC4957l.mo5204v(c38620b);
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c38620b);
            interfaceC4957l.mo5199d(c38620b, length);
            interfaceC4957l.mo5197F(c38620b);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$k */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class k implements InterfaceC4957l.c<C38622d> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38622d c38622d) {
            int length = interfaceC4957l.length();
            interfaceC4957l.builder().append(Typography.nbsp).m5253d(c38622d.m87326m()).append(Typography.nbsp);
            interfaceC4957l.mo5199d(c38622d, length);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$l */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class l implements InterfaceC4957l.c<C38626h> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38626h c38626h) {
            C39137a.m87823y(interfaceC4957l, c38626h.m87331q(), c38626h.m87332r(), c38626h);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$m */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class m implements InterfaceC4957l.c<C38632n> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38632n c38632n) {
            C39137a.m87823y(interfaceC4957l, null, c38632n.m87346n(), c38632n);
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$n */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class n implements InterfaceC4957l.c<C38631m> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38631m c38631m) {
            InterfaceC4964s interfaceC4964s = interfaceC4957l.mo5202o().m5180c().get(C38631m.class);
            if (interfaceC4964s == null) {
                interfaceC4957l.mo5205w(c38631m);
                return;
            }
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c38631m);
            if (length == interfaceC4957l.length()) {
                interfaceC4957l.builder().append((char) 65532);
            }
            C4952g c4952gMo5202o = interfaceC4957l.mo5202o();
            boolean z11 = c38631m.mo87320f() instanceof C38633o;
            String strMo93248b = c4952gMo5202o.m5178a().mo93248b(c38631m.m87345m());
            InterfaceC4962q interfaceC4962qMo5200h = interfaceC4957l.mo5200h();
            AbstractC42184c.f93651a.m5239d(interfaceC4962qMo5200h, strMo93248b);
            AbstractC42184c.f93652b.m5239d(interfaceC4962qMo5200h, Boolean.valueOf(z11));
            AbstractC42184c.f93653c.m5239d(interfaceC4962qMo5200h, null);
            interfaceC4957l.mo5198c(length, interfaceC4964s.mo5246a(c4952gMo5202o, interfaceC4962qMo5200h));
        }
    }

    /* JADX INFO: renamed from: io.noties.markwon.core.a$o */
    /* JADX INFO: compiled from: CorePlugin.java */
    public class o implements InterfaceC4957l.c<C38636r> {
        @Override // cf0.InterfaceC4957l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5209a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull C38636r c38636r) {
            int length = interfaceC4957l.length();
            interfaceC4957l.mo5205w(c38636r);
            AbstractC38619a abstractC38619aMo87320f = c38636r.mo87320f();
            if (abstractC38619aMo87320f instanceof C38638t) {
                C38638t c38638t = (C38638t) abstractC38619aMo87320f;
                int iM87363q = c38638t.m87363q();
                CoreProps.f86999a.m5239d(interfaceC4957l.mo5200h(), CoreProps.ListItemType.ORDERED);
                CoreProps.f87001c.m5239d(interfaceC4957l.mo5200h(), Integer.valueOf(iM87363q));
                c38638t.m87365s(c38638t.m87363q() + 1);
            } else {
                CoreProps.f86999a.m5239d(interfaceC4957l.mo5200h(), CoreProps.ListItemType.BULLET);
                CoreProps.f87000b.m5239d(interfaceC4957l.mo5200h(), Integer.valueOf(C39137a.m87817r(c38636r)));
            }
            interfaceC4957l.mo5199d(c38636r, length);
            if (interfaceC4957l.mo5201i(c38636r)) {
                interfaceC4957l.mo5203q();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m87804e(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38620b.class, new j());
    }

    /* JADX INFO: renamed from: f */
    public static void m87805f(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38621c.class, new C36672b());
    }

    /* JADX INFO: renamed from: g */
    public static void m87806g(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38622d.class, new k());
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static C39137a m87807h() {
        return new C39137a();
    }

    /* JADX INFO: renamed from: i */
    public static void m87808i(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38625g.class, new i());
    }

    /* JADX INFO: renamed from: j */
    public static void m87809j(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38626h.class, new l());
    }

    /* JADX INFO: renamed from: k */
    public static void m87810k(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38627i.class, new d());
    }

    /* JADX INFO: renamed from: l */
    public static void m87811l(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38628j.class, new b());
    }

    /* JADX INFO: renamed from: m */
    public static void m87812m(InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38631m.class, new n());
    }

    /* JADX INFO: renamed from: n */
    public static void m87813n(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38632n.class, new m());
    }

    /* JADX INFO: renamed from: p */
    public static void m87815p(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38633o.class, new f());
    }

    /* JADX INFO: renamed from: q */
    public static void m87816q(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38636r.class, new o());
    }

    /* JADX INFO: renamed from: s */
    public static void m87818s(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38638t.class, new C36672b());
    }

    /* JADX INFO: renamed from: t */
    public static void m87819t(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38639u.class, new e());
    }

    /* JADX INFO: renamed from: u */
    public static void m87820u(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38640v.class, new c());
    }

    /* JADX INFO: renamed from: v */
    public static void m87821v(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38641w.class, new h());
    }

    /* JADX INFO: renamed from: x */
    public static void m87822x(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38643y.class, new a());
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public void configureSpansFactory(@NonNull InterfaceC4955j.a aVar) {
        C37165b c37165b = new C37165b();
        aVar.mo5195a(C38641w.class, new C37171h()).mo5195a(C38625g.class, new C37167d()).mo5195a(C38620b.class, new C37164a()).mo5195a(C38622d.class, new C37166c()).mo5195a(C38626h.class, c37165b).mo5195a(C38632n.class, c37165b).mo5195a(C38636r.class, new C37170g()).mo5195a(C38628j.class, new C37168e()).mo5195a(C38633o.class, new C37169f()).mo5195a(C38643y.class, new C37172i());
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C39137a m87824d(@NonNull p pVar) {
        this.f87007a.add(pVar);
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final void m87825w(@NonNull InterfaceC4957l.b bVar) {
        bVar.mo5207b(C38642x.class, new g());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m87814o(@NonNull C38639u c38639u) {
        AbstractC38619a abstractC38619aMo87320f = c38639u.mo87320f();
        if (abstractC38619aMo87320f != null) {
            AbstractC38637s abstractC38637sMo87320f = abstractC38619aMo87320f.mo87320f();
            if (abstractC38637sMo87320f instanceof AbstractC38635q) {
                return ((AbstractC38635q) abstractC38637sMo87320f).m87352n();
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static int m87817r(@NonNull AbstractC38637s abstractC38637s) {
        int i11 = 0;
        for (AbstractC38637s abstractC38637sMo87320f = abstractC38637s.mo87320f(); abstractC38637sMo87320f != null; abstractC38637sMo87320f = abstractC38637sMo87320f.mo87320f()) {
            if (abstractC38637sMo87320f instanceof C38636r) {
                i11++;
            }
        }
        return i11;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: y */
    public static void m87823y(@NonNull InterfaceC4957l interfaceC4957l, @Nullable String str, @NonNull String str2, @NonNull AbstractC38637s abstractC38637s) {
        interfaceC4957l.mo5204v(abstractC38637s);
        int length = interfaceC4957l.length();
        interfaceC4957l.builder().append(Typography.nbsp).append('\n').append(interfaceC4957l.mo5202o().m5181d().mo95675a(str, str2));
        interfaceC4957l.mo5203q();
        interfaceC4957l.builder().append(Typography.nbsp);
        CoreProps.f87005g.m5239d(interfaceC4957l.mo5200h(), str);
        interfaceC4957l.mo5199d(abstractC38637s, length);
        interfaceC4957l.mo5197F(abstractC38637s);
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public void configureVisitor(@NonNull InterfaceC4957l.b bVar) {
        m87825w(bVar);
        m87821v(bVar);
        m87808i(bVar);
        m87804e(bVar);
        m87806g(bVar);
        m87809j(bVar);
        m87813n(bVar);
        m87812m(bVar);
        m87805f(bVar);
        m87818s(bVar);
        m87816q(bVar);
        m87822x(bVar);
        m87811l(bVar);
        m87820u(bVar);
        m87810k(bVar);
        m87819t(bVar);
        m87815p(bVar);
    }
}
