package ph0;

import java.util.Collections;
import java.util.List;
import nh0.C42841b;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43184b;

/* JADX INFO: renamed from: ph0.c */
/* JADX INFO: compiled from: LeafNode.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC43481c extends AbstractC43189g {

    /* JADX INFO: renamed from: e */
    public static final List<AbstractC43189g> f96001e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: d */
    public Object f96002d;

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: m */
    public int mo94887m() {
        return 0;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: t */
    public List<AbstractC43189g> mo94897t() {
        return f96001e;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: w */
    public final boolean mo94901w() {
        return this.f96002d instanceof C43184b;
    }

    /* JADX INFO: renamed from: Z */
    public String m95714Z() {
        return mo94960f(mo94801A());
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: a */
    public String mo94956a(String str) {
        m95716b0();
        return super.mo94956a(str);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public AbstractC43481c mo94892q(AbstractC43189g abstractC43189g) {
        AbstractC43481c abstractC43481c = (AbstractC43481c) super.mo94892q(abstractC43189g);
        if (mo94901w()) {
            abstractC43481c.f96002d = ((C43184b) this.f96002d).clone();
        }
        return abstractC43481c;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m95716b0() {
        if (!mo94901w()) {
            Object obj = this.f96002d;
            C43184b c43184b = new C43184b();
            this.f96002d = c43184b;
            if (obj != null) {
                c43184b.m94934G(mo94801A(), (String) obj);
            }
        }
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: f */
    public String mo94960f(String str) {
        C42841b.m93957i(str);
        if (!mo94901w()) {
            if (str.equals(mo94801A())) {
                return (String) this.f96002d;
            }
            return "";
        }
        return super.mo94960f(str);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: g */
    public AbstractC43189g mo94968g(String str, String str2) {
        if (!mo94901w() && str.equals(mo94801A())) {
            this.f96002d = str2;
            return this;
        }
        m95716b0();
        super.mo94968g(str, str2);
        return this;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: h */
    public final C43184b mo94878h() {
        m95716b0();
        return (C43184b) this.f96002d;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: i */
    public String mo94880i() {
        if (m94997x()) {
            return mo94848H().mo94880i();
        }
        return "";
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: v */
    public boolean mo94962v(String str) {
        m95716b0();
        return super.mo94962v(str);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: s */
    public AbstractC43189g mo94896s() {
        return this;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: r */
    public void mo94894r(String str) {
    }
}
