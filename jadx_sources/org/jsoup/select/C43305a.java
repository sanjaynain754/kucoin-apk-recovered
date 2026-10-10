package org.jsoup.select;

import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.Element;
import qh0.InterfaceC43743a;

/* JADX INFO: renamed from: org.jsoup.select.a */
/* JADX INFO: compiled from: Collector.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43305a {

    /* JADX INFO: renamed from: org.jsoup.select.a$a */
    /* JADX INFO: compiled from: Collector.java */
    public static class a implements InterfaceC43743a {

        /* JADX INFO: renamed from: a */
        public final Element f95541a;

        /* JADX INFO: renamed from: b */
        public final Elements f95542b;

        /* JADX INFO: renamed from: c */
        public final AbstractC43307c f95543c;

        @Override // qh0.InterfaceC43743a
        /* JADX INFO: renamed from: b */
        public void mo94907b(AbstractC43189g abstractC43189g, int i11) {
            if (abstractC43189g instanceof Element) {
                Element element = (Element) abstractC43189g;
                if (this.f95543c.mo95282a(this.f95541a, element)) {
                    this.f95542b.add(element);
                }
            }
        }

        public a(Element element, Elements elements, AbstractC43307c abstractC43307c) {
            this.f95541a = element;
            this.f95542b = elements;
            this.f95543c = abstractC43307c;
        }

        @Override // qh0.InterfaceC43743a
        /* JADX INFO: renamed from: a */
        public void mo94906a(AbstractC43189g abstractC43189g, int i11) {
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.a$b */
    /* JADX INFO: compiled from: Collector.java */
    public static class b implements NodeFilter {

        /* JADX INFO: renamed from: a */
        public final Element f95544a;

        /* JADX INFO: renamed from: b */
        public Element f95545b = null;

        /* JADX INFO: renamed from: c */
        public final AbstractC43307c f95546c;

        @Override // org.jsoup.select.NodeFilter
        /* JADX INFO: renamed from: a */
        public NodeFilter.FilterResult mo95269a(AbstractC43189g abstractC43189g, int i11) {
            return NodeFilter.FilterResult.CONTINUE;
        }

        @Override // org.jsoup.select.NodeFilter
        /* JADX INFO: renamed from: b */
        public NodeFilter.FilterResult mo95270b(AbstractC43189g abstractC43189g, int i11) {
            if (abstractC43189g instanceof Element) {
                Element element = (Element) abstractC43189g;
                if (this.f95546c.mo95282a(this.f95544a, element)) {
                    this.f95545b = element;
                    return NodeFilter.FilterResult.STOP;
                }
            }
            return NodeFilter.FilterResult.CONTINUE;
        }

        public b(Element element, AbstractC43307c abstractC43307c) {
            this.f95544a = element;
            this.f95546c = abstractC43307c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Elements m95276a(AbstractC43307c abstractC43307c, Element element) {
        Elements elements = new Elements();
        C43308d.m95288c(new a(element, elements, abstractC43307c), element);
        return elements;
    }

    /* JADX INFO: renamed from: b */
    public static Element m95277b(AbstractC43307c abstractC43307c, Element element) {
        b bVar = new b(element, abstractC43307c);
        C43308d.m95286a(bVar, element);
        return bVar.f95545b;
    }
}
