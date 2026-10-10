package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import nh0.C42841b;
import oh0.C43093c;
import org.jsoup.SerializationException;
import org.jsoup.select.C43308d;
import org.jsoup.select.Elements;
import qh0.InterfaceC43743a;

/* JADX INFO: renamed from: org.jsoup.nodes.g */
/* JADX INFO: compiled from: Node.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC43189g implements Cloneable {

    /* JADX INFO: renamed from: b */
    public AbstractC43189g f95385b;

    /* JADX INFO: renamed from: c */
    public int f95386c;

    /* JADX INFO: renamed from: org.jsoup.nodes.g$a */
    /* JADX INFO: compiled from: Node.java */
    public static class a implements InterfaceC43743a {

        /* JADX INFO: renamed from: a */
        public Appendable f95387a;

        /* JADX INFO: renamed from: b */
        public Document.OutputSettings f95388b;

        @Override // qh0.InterfaceC43743a
        /* JADX INFO: renamed from: b */
        public void mo94907b(AbstractC43189g abstractC43189g, int i11) {
            try {
                abstractC43189g.mo94844E(this.f95387a, i11, this.f95388b);
            } catch (IOException e11) {
                throw new SerializationException(e11);
            }
        }

        public a(Appendable appendable, Document.OutputSettings outputSettings) {
            this.f95387a = appendable;
            this.f95388b = outputSettings;
            outputSettings.m94827i();
        }

        @Override // qh0.InterfaceC43743a
        /* JADX INFO: renamed from: a */
        public void mo94906a(AbstractC43189g abstractC43189g, int i11) {
            if (!abstractC43189g.mo94801A().equals("#text")) {
                try {
                    abstractC43189g.mo94846F(this.f95387a, i11, this.f95388b);
                } catch (IOException e11) {
                    throw new SerializationException(e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo94801A();

    /* JADX INFO: renamed from: E */
    public abstract void mo94844E(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException;

    /* JADX INFO: renamed from: F */
    public abstract void mo94846F(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException;

    /* JADX INFO: renamed from: R */
    public AbstractC43189g mo94859R() {
        AbstractC43189g abstractC43189g = this;
        while (true) {
            AbstractC43189g abstractC43189g2 = abstractC43189g.f95385b;
            if (abstractC43189g2 == null) {
                return abstractC43189g;
            }
            abstractC43189g = abstractC43189g2;
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract C43184b mo94878h();

    /* JADX INFO: renamed from: i */
    public abstract String mo94880i();

    /* JADX INFO: renamed from: m */
    public abstract int mo94887m();

    @Override // 
    /* JADX INFO: renamed from: p */
    public AbstractC43189g mo94812s0() {
        AbstractC43189g abstractC43189gMo94892q = mo94892q(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC43189gMo94892q);
        while (!linkedList.isEmpty()) {
            AbstractC43189g abstractC43189g = (AbstractC43189g) linkedList.remove();
            int iMo94887m = abstractC43189g.mo94887m();
            for (int i11 = 0; i11 < iMo94887m; i11++) {
                List<AbstractC43189g> listMo94897t = abstractC43189g.mo94897t();
                AbstractC43189g abstractC43189gMo94892q2 = listMo94897t.get(i11).mo94892q(abstractC43189g);
                listMo94897t.set(i11, abstractC43189gMo94892q2);
                linkedList.add(abstractC43189gMo94892q2);
            }
        }
        return abstractC43189gMo94892q;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo94894r(String str);

    /* JADX INFO: renamed from: s */
    public abstract AbstractC43189g mo94896s();

    /* JADX INFO: renamed from: t */
    public abstract List<AbstractC43189g> mo94897t();

    /* JADX INFO: renamed from: w */
    public abstract boolean mo94901w();

    /* JADX INFO: renamed from: D */
    public void m94969D(Appendable appendable) {
        C43308d.m95288c(new a(appendable, C43190h.m95000a(this)), this);
    }

    /* JADX INFO: renamed from: H */
    public AbstractC43189g mo94848H() {
        return this.f95385b;
    }

    /* JADX INFO: renamed from: I */
    public final AbstractC43189g m94971I() {
        return this.f95385b;
    }

    /* JADX INFO: renamed from: J */
    public AbstractC43189g m94972J() {
        AbstractC43189g abstractC43189g = this.f95385b;
        if (abstractC43189g != null && this.f95386c > 0) {
            return abstractC43189g.mo94897t().get(this.f95386c - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public void m94974L() {
        C42841b.m93957i(this.f95385b);
        this.f95385b.mo94976N(this);
    }

    /* JADX INFO: renamed from: N */
    public void mo94976N(AbstractC43189g abstractC43189g) {
        C42841b.m93951c(abstractC43189g.f95385b == this);
        int i11 = abstractC43189g.f95386c;
        mo94897t().remove(i11);
        m94973K(i11);
        abstractC43189g.f95385b = null;
    }

    /* JADX INFO: renamed from: P */
    public void m94978P(AbstractC43189g abstractC43189g, AbstractC43189g abstractC43189g2) {
        C42841b.m93951c(abstractC43189g.f95385b == this);
        C42841b.m93957i(abstractC43189g2);
        AbstractC43189g abstractC43189g3 = abstractC43189g2.f95385b;
        if (abstractC43189g3 != null) {
            abstractC43189g3.mo94976N(abstractC43189g2);
        }
        int i11 = abstractC43189g.f95386c;
        mo94897t().set(i11, abstractC43189g2);
        abstractC43189g2.f95385b = this;
        abstractC43189g2.m94982U(i11);
        abstractC43189g.f95385b = null;
    }

    /* JADX INFO: renamed from: U */
    public void m94982U(int i11) {
        this.f95386c = i11;
    }

    /* JADX INFO: renamed from: V */
    public int m94983V() {
        return this.f95386c;
    }

    /* JADX INFO: renamed from: W */
    public List<AbstractC43189g> m94984W() {
        AbstractC43189g abstractC43189g = this.f95385b;
        if (abstractC43189g == null) {
            return Collections.EMPTY_LIST;
        }
        List<AbstractC43189g> listMo94897t = abstractC43189g.mo94897t();
        ArrayList arrayList = new ArrayList(listMo94897t.size() - 1);
        for (AbstractC43189g abstractC43189g2 : listMo94897t) {
            if (abstractC43189g2 != this) {
                arrayList.add(abstractC43189g2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public AbstractC43189g m94985X() {
        C42841b.m93957i(this.f95385b);
        List<AbstractC43189g> listMo94897t = mo94897t();
        AbstractC43189g abstractC43189g = listMo94897t.size() > 0 ? listMo94897t.get(0) : null;
        this.f95385b.m94987b(this.f95386c, m94995o());
        m94974L();
        return abstractC43189g;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC43189g m94990e(String str) {
        m94989d(this.f95386c + 1, str);
        return this;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC43189g m94991j(String str) {
        m94989d(this.f95386c, str);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public boolean m94997x() {
        return this.f95385b != null;
    }

    /* JADX INFO: renamed from: y */
    public void m94998y(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException {
        appendable.append('\n').append(C43093c.m94693l(i11 * outputSettings.m94825g()));
    }

    /* JADX INFO: renamed from: z */
    public AbstractC43189g m94999z() {
        AbstractC43189g abstractC43189g = this.f95385b;
        if (abstractC43189g == null) {
            return null;
        }
        List<AbstractC43189g> listMo94897t = abstractC43189g.mo94897t();
        int i11 = this.f95386c + 1;
        if (listMo94897t.size() > i11) {
            return listMo94897t.get(i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public String mo94802C() {
        StringBuilder sbM94683b = C43093c.m94683b();
        m94969D(sbM94683b);
        return C43093c.m94694m(sbM94683b);
    }

    /* JADX INFO: renamed from: G */
    public Document m94970G() {
        AbstractC43189g abstractC43189gMo94859R = mo94859R();
        if (abstractC43189gMo94859R instanceof Document) {
            return (Document) abstractC43189gMo94859R;
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m94973K(int i11) {
        List<AbstractC43189g> listMo94897t = mo94897t();
        while (i11 < listMo94897t.size()) {
            listMo94897t.get(i11).m94982U(i11);
            i11++;
        }
    }

    /* JADX INFO: renamed from: M */
    public AbstractC43189g m94975M(String str) {
        C42841b.m93957i(str);
        mo94878h().m94939O(str);
        return this;
    }

    /* JADX INFO: renamed from: O */
    public void m94977O(AbstractC43189g abstractC43189g) {
        abstractC43189g.m94981T(this);
    }

    /* JADX INFO: renamed from: Q */
    public void m94979Q(AbstractC43189g abstractC43189g) {
        C42841b.m93957i(abstractC43189g);
        C42841b.m93957i(this.f95385b);
        this.f95385b.m94978P(this, abstractC43189g);
    }

    /* JADX INFO: renamed from: S */
    public void m94980S(String str) {
        C42841b.m93957i(str);
        mo94894r(str);
    }

    /* JADX INFO: renamed from: T */
    public void m94981T(AbstractC43189g abstractC43189g) {
        C42841b.m93957i(abstractC43189g);
        AbstractC43189g abstractC43189g2 = this.f95385b;
        if (abstractC43189g2 != null) {
            abstractC43189g2.mo94976N(this);
        }
        this.f95385b = abstractC43189g;
    }

    /* JADX INFO: renamed from: Y */
    public AbstractC43189g m94986Y(String str) {
        Element element;
        C42841b.m93955g(str);
        if (mo94848H() instanceof Element) {
            element = (Element) mo94848H();
        } else {
            element = null;
        }
        List<AbstractC43189g> listM95192c = C43190h.m95001b(this).m95192c(str, element, mo94880i());
        AbstractC43189g abstractC43189g = listM95192c.get(0);
        if (!(abstractC43189g instanceof Element)) {
            return null;
        }
        Element element2 = (Element) abstractC43189g;
        Element elementM94996u = m94996u(element2);
        this.f95385b.m94978P(this, element2);
        elementM94996u.m94988c(this);
        if (listM95192c.size() > 0) {
            for (int i11 = 0; i11 < listM95192c.size(); i11++) {
                AbstractC43189g abstractC43189g2 = listM95192c.get(i11);
                abstractC43189g2.f95385b.mo94976N(abstractC43189g2);
                element2.m94875f0(abstractC43189g2);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String mo94956a(String str) {
        C42841b.m93955g(str);
        if (!mo94962v(str)) {
            return "";
        }
        return C43093c.m94695n(mo94880i(), mo94960f(str));
    }

    /* JADX INFO: renamed from: b */
    public void m94987b(int i11, AbstractC43189g... abstractC43189gArr) {
        C42841b.m93957i(abstractC43189gArr);
        if (abstractC43189gArr.length == 0) {
            return;
        }
        List<AbstractC43189g> listMo94897t = mo94897t();
        AbstractC43189g abstractC43189gMo94848H = abstractC43189gArr[0].mo94848H();
        if (abstractC43189gMo94848H != null && abstractC43189gMo94848H.mo94887m() == abstractC43189gArr.length) {
            List<AbstractC43189g> listM94994n = abstractC43189gMo94848H.m94994n();
            int length = abstractC43189gArr.length;
            while (true) {
                int i12 = length - 1;
                if (length <= 0 || abstractC43189gArr[i12] != listM94994n.get(i12)) {
                    break;
                } else {
                    length = i12;
                }
            }
            abstractC43189gMo94848H.mo94896s();
            listMo94897t.addAll(i11, Arrays.asList(abstractC43189gArr));
            int length2 = abstractC43189gArr.length;
            while (true) {
                int i13 = length2 - 1;
                if (length2 > 0) {
                    abstractC43189gArr[i13].f95385b = this;
                    length2 = i13;
                } else {
                    m94973K(i11);
                    return;
                }
            }
        } else {
            C42841b.m93953e(abstractC43189gArr);
            for (AbstractC43189g abstractC43189g : abstractC43189gArr) {
                m94977O(abstractC43189g);
            }
            listMo94897t.addAll(i11, Arrays.asList(abstractC43189gArr));
            m94973K(i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m94988c(AbstractC43189g... abstractC43189gArr) {
        List<AbstractC43189g> listMo94897t = mo94897t();
        for (AbstractC43189g abstractC43189g : abstractC43189gArr) {
            m94977O(abstractC43189g);
            listMo94897t.add(abstractC43189g);
            abstractC43189g.m94982U(listMo94897t.size() - 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m94989d(int i11, String str) {
        Element element;
        C42841b.m93957i(str);
        C42841b.m93957i(this.f95385b);
        if (mo94848H() instanceof Element) {
            element = (Element) mo94848H();
        } else {
            element = null;
        }
        this.f95385b.m94987b(i11, (AbstractC43189g[]) C43190h.m95001b(this).m95192c(str, element, mo94880i()).toArray(new AbstractC43189g[0]));
    }

    /* JADX INFO: renamed from: f */
    public String mo94960f(String str) {
        C42841b.m93957i(str);
        if (!mo94901w()) {
            return "";
        }
        String strM94947m = mo94878h().m94947m(str);
        if (strM94947m.length() > 0) {
            return strM94947m;
        }
        if (!str.startsWith("abs:")) {
            return "";
        }
        return mo94956a(str.substring(4));
    }

    /* JADX INFO: renamed from: g */
    public AbstractC43189g mo94968g(String str, String str2) {
        mo94878h().m94936I(C43190h.m95001b(this).m95195f().m95184a(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC43189g m94992k(AbstractC43189g abstractC43189g) {
        C42841b.m93957i(abstractC43189g);
        C42841b.m93957i(this.f95385b);
        this.f95385b.m94987b(this.f95386c, abstractC43189g);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public AbstractC43189g m94993l(int i11) {
        return mo94897t().get(i11);
    }

    /* JADX INFO: renamed from: n */
    public List<AbstractC43189g> m94994n() {
        return Collections.unmodifiableList(mo94897t());
    }

    /* JADX INFO: renamed from: o */
    public AbstractC43189g[] m94995o() {
        return (AbstractC43189g[]) mo94897t().toArray(new AbstractC43189g[0]);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC43189g mo94892q(AbstractC43189g abstractC43189g) {
        int i11;
        try {
            AbstractC43189g abstractC43189g2 = (AbstractC43189g) super.clone();
            abstractC43189g2.f95385b = abstractC43189g;
            if (abstractC43189g == null) {
                i11 = 0;
            } else {
                i11 = this.f95386c;
            }
            abstractC43189g2.f95386c = i11;
            return abstractC43189g2;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public String toString() {
        return mo94802C();
    }

    /* JADX INFO: renamed from: u */
    public final Element m94996u(Element element) {
        Elements elementsM94890o0 = element.m94890o0();
        if (elementsM94890o0.size() > 0) {
            return m94996u(elementsM94890o0.get(0));
        }
        return element;
    }

    /* JADX INFO: renamed from: v */
    public boolean mo94962v(String str) {
        C42841b.m93957i(str);
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo94878h().m94949r(strSubstring) && !mo94956a(strSubstring).equals("")) {
                return true;
            }
        }
        return mo94878h().m94949r(str);
    }

    /* JADX INFO: renamed from: B */
    public void mo94840B() {
    }
}
