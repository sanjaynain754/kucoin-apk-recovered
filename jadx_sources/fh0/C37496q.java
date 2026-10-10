package fh0;

import ih0.AbstractC38619a;
import ih0.C38634p;
import ih0.C38639u;
import java.util.List;
import jh0.InterfaceC40405a;
import kh0.AbstractC41041a;
import kh0.C41043c;
import kh0.InterfaceC41048h;
import org.commonmark.internal.LinkReferenceDefinitionParser;

/* JADX INFO: renamed from: fh0.q */
/* JADX INFO: compiled from: ParagraphParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37496q extends AbstractC41041a {

    /* JADX INFO: renamed from: a */
    public final C38639u f83185a = new C38639u();

    /* JADX INFO: renamed from: b */
    public LinkReferenceDefinitionParser f83186b = new LinkReferenceDefinitionParser();

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: b */
    public boolean mo84416b() {
        return true;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: c */
    public AbstractC38619a mo84311c() {
        return this.f83185a;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: d */
    public void mo84328d(CharSequence charSequence) {
        this.f83186b.m94797f(charSequence);
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: e */
    public void mo84365e(InterfaceC40405a interfaceC40405a) {
        CharSequence charSequenceM94795d = this.f83186b.m94795d();
        if (charSequenceM94795d.length() > 0) {
            interfaceC40405a.mo84387a(charSequenceM94795d.toString(), this.f83185a);
        }
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: f */
    public void mo84358f() {
        if (this.f83186b.m94795d().length() == 0) {
            this.f83185a.m87361l();
        }
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m84417i() {
        return this.f83186b.m94795d();
    }

    /* JADX INFO: renamed from: j */
    public List<C38634p> m84418j() {
        return this.f83186b.m94794c();
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        if (!interfaceC41048h.mo84332a()) {
            return C41043c.m90002b(interfaceC41048h.getIndex());
        }
        return C41043c.m90004d();
    }
}
