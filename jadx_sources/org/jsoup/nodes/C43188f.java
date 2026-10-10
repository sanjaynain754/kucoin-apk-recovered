package org.jsoup.nodes;

import com.tencent.bugly.proguard.C33627eb;
import java.io.IOException;
import nh0.C42841b;
import oh0.C43093c;
import p852kotlin.text.Typography;
import ph0.AbstractC43481c;

/* JADX INFO: renamed from: org.jsoup.nodes.f */
/* JADX INFO: compiled from: DocumentType.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43188f extends AbstractC43481c {
    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: A */
    public String mo94801A() {
        return "#doctype";
    }

    /* JADX INFO: renamed from: d0 */
    public void m94966d0(String str) {
        if (str != null) {
            mo94968g("pubSysKey", str);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m94967e0() {
        if (m94965c0("publicId")) {
            mo94968g("pubSysKey", "PUBLIC");
        } else if (m94965c0("systemId")) {
            mo94968g("pubSysKey", "SYSTEM");
        }
    }

    public C43188f(String str, String str2, String str3) {
        C42841b.m93957i(str);
        C42841b.m93957i(str2);
        C42841b.m93957i(str3);
        mo94968g("name", str);
        mo94968g("publicId", str2);
        mo94968g("systemId", str3);
        m94967e0();
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: E */
    public void mo94844E(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.m94829k() == Document.OutputSettings.Syntax.html && !m94965c0("publicId") && !m94965c0("systemId")) {
            appendable.append("<!doctype");
        } else {
            appendable.append("<!DOCTYPE");
        }
        if (m94965c0("name")) {
            appendable.append(C33627eb.f69716f).append(mo94960f("name"));
        }
        if (m94965c0("pubSysKey")) {
            appendable.append(C33627eb.f69716f).append(mo94960f("pubSysKey"));
        }
        if (m94965c0("publicId")) {
            appendable.append(" \"").append(mo94960f("publicId")).append('\"');
        }
        if (m94965c0("systemId")) {
            appendable.append(" \"").append(mo94960f("systemId")).append('\"');
        }
        appendable.append(Typography.greater);
    }

    @Override // ph0.AbstractC43481c, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ String mo94956a(String str) {
        return super.mo94956a(str);
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m94965c0(String str) {
        return !C43093c.m94687f(mo94960f(str));
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
