package org.jsoup.select;

import java.util.Iterator;
import nh0.C42841b;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.Element;
import qh0.InterfaceC43743a;

/* JADX INFO: renamed from: org.jsoup.select.d */
/* JADX INFO: compiled from: NodeTraversor.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43308d {
    /* JADX INFO: renamed from: a */
    public static NodeFilter.FilterResult m95286a(NodeFilter nodeFilter, AbstractC43189g abstractC43189g) {
        AbstractC43189g abstractC43189gM94993l = abstractC43189g;
        int i11 = 0;
        while (abstractC43189gM94993l != null) {
            NodeFilter.FilterResult filterResultMo95270b = nodeFilter.mo95270b(abstractC43189gM94993l, i11);
            if (filterResultMo95270b == NodeFilter.FilterResult.STOP) {
                return filterResultMo95270b;
            }
            if (filterResultMo95270b != NodeFilter.FilterResult.CONTINUE || abstractC43189gM94993l.mo94887m() <= 0) {
                while (abstractC43189gM94993l.m94999z() == null && i11 > 0) {
                    NodeFilter.FilterResult filterResult = NodeFilter.FilterResult.CONTINUE;
                    if ((filterResultMo95270b == filterResult || filterResultMo95270b == NodeFilter.FilterResult.SKIP_CHILDREN) && (filterResultMo95270b = nodeFilter.mo95269a(abstractC43189gM94993l, i11)) == NodeFilter.FilterResult.STOP) {
                        return filterResultMo95270b;
                    }
                    AbstractC43189g abstractC43189gM94971I = abstractC43189gM94993l.m94971I();
                    i11--;
                    if (filterResultMo95270b == NodeFilter.FilterResult.REMOVE) {
                        abstractC43189gM94993l.m94974L();
                    }
                    filterResultMo95270b = filterResult;
                    abstractC43189gM94993l = abstractC43189gM94971I;
                }
                if ((filterResultMo95270b == NodeFilter.FilterResult.CONTINUE || filterResultMo95270b == NodeFilter.FilterResult.SKIP_CHILDREN) && (filterResultMo95270b = nodeFilter.mo95269a(abstractC43189gM94993l, i11)) == NodeFilter.FilterResult.STOP) {
                    return filterResultMo95270b;
                }
                if (abstractC43189gM94993l == abstractC43189g) {
                    return filterResultMo95270b;
                }
                AbstractC43189g abstractC43189gM94999z = abstractC43189gM94993l.m94999z();
                if (filterResultMo95270b == NodeFilter.FilterResult.REMOVE) {
                    abstractC43189gM94993l.m94974L();
                }
                abstractC43189gM94993l = abstractC43189gM94999z;
            } else {
                abstractC43189gM94993l = abstractC43189gM94993l.m94993l(0);
                i11++;
            }
        }
        return NodeFilter.FilterResult.CONTINUE;
    }

    /* JADX INFO: renamed from: c */
    public static void m95288c(InterfaceC43743a interfaceC43743a, AbstractC43189g abstractC43189g) {
        AbstractC43189g abstractC43189gM94993l = abstractC43189g;
        int i11 = 0;
        while (abstractC43189gM94993l != null) {
            interfaceC43743a.mo94907b(abstractC43189gM94993l, i11);
            if (abstractC43189gM94993l.mo94887m() > 0) {
                abstractC43189gM94993l = abstractC43189gM94993l.m94993l(0);
                i11++;
            } else {
                while (abstractC43189gM94993l.m94999z() == null && i11 > 0) {
                    interfaceC43743a.mo94906a(abstractC43189gM94993l, i11);
                    abstractC43189gM94993l = abstractC43189gM94993l.m94971I();
                    i11--;
                }
                interfaceC43743a.mo94906a(abstractC43189gM94993l, i11);
                if (abstractC43189gM94993l == abstractC43189g) {
                    return;
                } else {
                    abstractC43189gM94993l = abstractC43189gM94993l.m94999z();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m95287b(NodeFilter nodeFilter, Elements elements) {
        C42841b.m93957i(nodeFilter);
        C42841b.m93957i(elements);
        Iterator<Element> it = elements.iterator();
        while (it.hasNext() && m95286a(nodeFilter, it.next()) != NodeFilter.FilterResult.STOP) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m95289d(InterfaceC43743a interfaceC43743a, Elements elements) {
        C42841b.m93957i(interfaceC43743a);
        C42841b.m93957i(elements);
        Iterator<Element> it = elements.iterator();
        while (it.hasNext()) {
            m95288c(interfaceC43743a, it.next());
        }
    }
}
