package org.jsoup.nodes;

import java.io.IOException;
import nh0.C42841b;
import ph0.AbstractC43481c;

/* JADX INFO: renamed from: org.jsoup.nodes.k */
/* JADX INFO: compiled from: XmlDeclaration.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43193k extends AbstractC43481c {

    /* JADX INFO: renamed from: f */
    public final boolean f95389f;

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: A */
    public String mo94801A() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: E */
    public void mo94844E(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<").append(this.f95389f ? "!" : "?").append(m95714Z());
        m95006d0(appendable, outputSettings);
        appendable.append(this.f95389f ? "!" : "?").append(">");
    }

    public C43193k(String str, boolean z11) {
        C42841b.m93957i(str);
        this.f96002d = str;
        this.f95389f = z11;
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ String mo94956a(String str) {
        return super.mo94956a(str);
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C43193k mo94812s0() {
        return (C43193k) super.mo94812s0();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m95006d0(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        for (C43183a c43183a : mo94878h()) {
            if (!c43183a.getKey().equals(mo94801A())) {
                appendable.append(' ');
                c43183a.m94923e(appendable, outputSettings);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public String m95007e0() {
        return m95714Z();
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ String mo94960f(String str) {
        return super.mo94960f(str);
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ AbstractC43189g mo94968g(String str, String str2) {
        return super.mo94968g(str, str2);
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
