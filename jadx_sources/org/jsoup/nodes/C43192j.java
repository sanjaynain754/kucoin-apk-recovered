package org.jsoup.nodes;

import java.io.IOException;
import oh0.C43093c;
import ph0.AbstractC43481c;

/* JADX INFO: renamed from: org.jsoup.nodes.j */
/* JADX INFO: compiled from: TextNode.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43192j extends AbstractC43481c {
    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: A */
    public String mo94801A() {
        return "#text";
    }

    public C43192j(String str) {
        this.f96002d = str;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m95002f0(StringBuilder sb2) {
        if (sb2.length() != 0 && sb2.charAt(sb2.length() - 1) == ' ') {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: E */
    public void mo94844E(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException {
        boolean z11;
        boolean z12;
        boolean zM94828j = outputSettings.m94828j();
        if (zM94828j) {
            if (m94983V() == 0) {
                AbstractC43189g abstractC43189g = this.f95385b;
                if (!(abstractC43189g instanceof Element) || !((Element) abstractC43189g).m94868b1().m95200b() || m95004e0()) {
                    if (outputSettings.m94826h() && m94984W().size() > 0 && !m95004e0()) {
                        m94998y(appendable, i11, outputSettings);
                    }
                } else {
                    m94998y(appendable, i11, outputSettings);
                }
            } else if (outputSettings.m94826h()) {
                m94998y(appendable, i11, outputSettings);
            }
        }
        if (zM94828j && !Element.m94832S0(this.f95385b)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zM94828j && (this.f95385b instanceof Document)) {
            z12 = true;
        } else {
            z12 = false;
        }
        Entities.m94912e(appendable, m95714Z(), outputSettings, false, z11, z12);
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ String mo94956a(String str) {
        return super.mo94956a(str);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C43192j mo94812s0() {
        return (C43192j) super.mo94812s0();
    }

    /* JADX INFO: renamed from: d0 */
    public String m95003d0() {
        return m95714Z();
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m95004e0() {
        return C43093c.m94687f(m95714Z());
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ String mo94960f(String str) {
        return super.mo94960f(str);
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
