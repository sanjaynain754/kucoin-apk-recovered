package org.jsoup.nodes;

import java.io.IOException;
import mh0.C42546a;
import org.jsoup.parser.C43299e;
import ph0.AbstractC43481c;

/* JADX INFO: renamed from: org.jsoup.nodes.d */
/* JADX INFO: compiled from: Comment.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43186d extends AbstractC43481c {
    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: A */
    public String mo94801A() {
        return "#comment";
    }

    public C43186d(String str) {
        this.f96002d = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: E */
    public void mo94844E(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.m94828j()) {
            if (m94983V() == 0) {
                AbstractC43189g abstractC43189g = this.f95385b;
                if (!(abstractC43189g instanceof Element) || !((Element) abstractC43189g).m94868b1().m95200b()) {
                    if (outputSettings.m94826h()) {
                        m94998y(appendable, i11, outputSettings);
                    }
                } else {
                    m94998y(appendable, i11, outputSettings);
                }
            } else if (outputSettings.m94826h()) {
                m94998y(appendable, i11, outputSettings);
            }
        }
        appendable.append("<!--").append(m94959e0()).append("-->");
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ String mo94956a(String str) {
        return super.mo94956a(str);
    }

    /* JADX INFO: renamed from: c0 */
    public C43193k m94957c0() {
        String strM94959e0 = m94959e0();
        Document documentM93277b = C42546a.m93277b("<" + strM94959e0.substring(1, strM94959e0.length() - 1) + ">", mo94880i(), C43299e.m95190g());
        if (documentM93277b.m94890o0().size() > 0) {
            Element elementM94888m0 = documentM93277b.m94888m0(0);
            C43193k c43193k = new C43193k(C43190h.m95001b(documentM93277b).m95195f().m95186c(elementM94888m0.m94870c1()), strM94959e0.startsWith("!"));
            c43193k.mo94878h().m94941e(elementM94888m0.mo94878h());
            return c43193k;
        }
        return null;
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C43186d mo94812s0() {
        return (C43186d) super.mo94812s0();
    }

    /* JADX INFO: renamed from: e0 */
    public String m94959e0() {
        return m95714Z();
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ String mo94960f(String str) {
        return super.mo94960f(str);
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m94961f0() {
        String strM94959e0 = m94959e0();
        if (strM94959e0.length() > 1) {
            if (strM94959e0.startsWith("!") || strM94959e0.startsWith("?")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ String mo94880i() {
        return super.mo94880i();
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ int mo94887m() {
        return super.mo94887m();
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ AbstractC43189g mo94896s() {
        return super.mo94896s();
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    public String toString() {
        return mo94802C();
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: v */
    public /* bridge */ /* synthetic */ boolean mo94962v(String str) {
        return super.mo94962v(str);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: F */
    public void mo94846F(Appendable appendable, int i11, Document.OutputSettings outputSettings) {
    }
}
