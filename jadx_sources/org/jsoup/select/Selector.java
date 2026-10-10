package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import nh0.C42841b;
import org.jsoup.nodes.Element;

/* JADX INFO: loaded from: classes61.dex */
public class Selector {

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Elements m95271a(Collection<Element> collection, Collection<Element> collection2) {
        Elements elements = new Elements();
        for (Element element : collection) {
            Iterator<Element> it = collection2.iterator();
            do {
                if (!it.hasNext()) {
                    elements.add(element);
                    break;
                }
            } while (!element.equals(it.next()));
        }
        return elements;
    }

    /* JADX INFO: renamed from: b */
    public static Elements m95272b(String str, Iterable<Element> iterable) {
        C42841b.m93955g(str);
        C42841b.m93957i(iterable);
        AbstractC43307c abstractC43307cM95290t = C43309e.m95290t(str);
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<Element> it = iterable.iterator();
        while (it.hasNext()) {
            for (Element element : m95274d(abstractC43307cM95290t, it.next())) {
                if (!identityHashMap.containsKey(element)) {
                    arrayList.add(element);
                    identityHashMap.put(element, Boolean.TRUE);
                }
            }
        }
        return new Elements((List<Element>) arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static Elements m95273c(String str, Element element) {
        C42841b.m93955g(str);
        return m95274d(C43309e.m95290t(str), element);
    }

    /* JADX INFO: renamed from: d */
    public static Elements m95274d(AbstractC43307c abstractC43307c, Element element) {
        C42841b.m93957i(abstractC43307c);
        C42841b.m93957i(element);
        return C43305a.m95276a(abstractC43307c, element);
    }

    /* JADX INFO: renamed from: e */
    public static Element m95275e(String str, Element element) {
        C42841b.m93955g(str);
        return C43305a.m95277b(C43309e.m95290t(str), element);
    }
}
