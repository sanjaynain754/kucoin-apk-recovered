package ph0;

import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43184b;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C43300f;
import org.jsoup.select.Elements;

/* JADX INFO: renamed from: ph0.b */
/* JADX INFO: compiled from: FormElement.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43480b extends Element {

    /* JADX INFO: renamed from: k */
    public final Elements f96000k;

    /* JADX INFO: renamed from: l1 */
    public C43480b m95712l1(Element element) {
        this.f96000k.add(element);
        return this;
    }

    public C43480b(C43300f c43300f, String str, C43184b c43184b) {
        super(c43300f, str, c43184b);
        this.f96000k = new Elements();
    }

    @Override // org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: N */
    public void mo94976N(AbstractC43189g abstractC43189g) {
        super.mo94976N(abstractC43189g);
        this.f96000k.remove(abstractC43189g);
    }

    @Override // org.jsoup.nodes.Element
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C43480b mo94812s0() {
        return (C43480b) super.mo94812s0();
    }
}
