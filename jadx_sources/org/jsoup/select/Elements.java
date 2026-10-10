package org.jsoup.select;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import nh0.C42841b;
import oh0.C43093c;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43186d;
import org.jsoup.nodes.C43187e;
import org.jsoup.nodes.C43192j;
import org.jsoup.nodes.Element;
import ph0.C43480b;
import qh0.InterfaceC43743a;

/* JADX INFO: loaded from: classes61.dex */
public class Elements extends ArrayList<Element> {
    public Elements() {
    }

    public String attr(String str) {
        for (Element element : this) {
            if (element.mo94962v(str)) {
                return element.mo94960f(str);
            }
        }
        return "";
    }

    public String html() {
        StringBuilder sbM94683b = C43093c.m94683b();
        for (Element element : this) {
            if (sbM94683b.length() != 0) {
                sbM94683b.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sbM94683b.append(element.m94842C0());
        }
        return C43093c.m94694m(sbM94683b);
    }

    public Elements next() {
        return m95266b(null, true, false);
    }

    public Elements nextAll() {
        return m95266b(null, true, true);
    }

    public Elements prev() {
        return m95266b(null, false, false);
    }

    public Elements prevAll() {
        return m95266b(null, false, true);
    }

    public String val() {
        return size() > 0 ? first().m94881i1() : "";
    }

    public Elements(int i11) {
        super(i11);
    }

    /* JADX INFO: renamed from: a */
    public final <T extends AbstractC43189g> List<T> m95265a(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (Element element : this) {
            if (element.getClass().isInstance(cls)) {
                arrayList.add(cls.cast(element));
            } else if (AbstractC43189g.class.isAssignableFrom(cls)) {
                for (int i11 = 0; i11 < element.mo94887m(); i11++) {
                    AbstractC43189g abstractC43189gM94993l = element.m94993l(i11);
                    if (cls.isInstance(abstractC43189gM94993l)) {
                        arrayList.add(cls.cast(abstractC43189gM94993l));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final Elements m95266b(String str, boolean z11, boolean z12) {
        Elements elements = new Elements();
        AbstractC43307c abstractC43307cM95290t = str != null ? C43309e.m95290t(str) : null;
        for (Element elementM94852K0 : this) {
            do {
                elementM94852K0 = z11 ? elementM94852K0.m94852K0() : elementM94852K0.m94861T0();
                if (elementM94852K0 == null) {
                    break;
                }
                if (abstractC43307cM95290t == null) {
                    elements.add(elementM94852K0);
                } else if (elementM94852K0.m94847G0(abstractC43307cM95290t)) {
                    elements.add(elementM94852K0);
                }
            } while (z12);
        }
        return elements;
    }

    @Override // java.util.ArrayList
    public Elements clone() {
        Elements elements = new Elements(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            elements.add(it.next().mo94812s0());
        }
        return elements;
    }

    public List<C43186d> comments() {
        return m95265a(C43186d.class);
    }

    public List<C43187e> dataNodes() {
        return m95265a(C43187e.class);
    }

    public List<String> eachAttr(String str) {
        ArrayList arrayList = new ArrayList(size());
        for (Element element : this) {
            if (element.mo94962v(str)) {
                arrayList.add(element.mo94960f(str));
            }
        }
        return arrayList;
    }

    public List<String> eachText() {
        ArrayList arrayList = new ArrayList(size());
        for (Element element : this) {
            if (element.m94839A0()) {
                arrayList.add(element.m94874e1());
            }
        }
        return arrayList;
    }

    public List<C43480b> forms() {
        return m95265a(C43480b.class);
    }

    public Elements next(String str) {
        return m95266b(str, true, false);
    }

    public Elements nextAll(String str) {
        return m95266b(str, true, true);
    }

    public Elements parents() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next().m94857P0());
        }
        return new Elements(linkedHashSet);
    }

    public Elements prev(String str) {
        return m95266b(str, false, false);
    }

    public Elements prevAll(String str) {
        return m95266b(str, false, true);
    }

    public List<C43192j> textNodes() {
        return m95265a(C43192j.class);
    }

    public Elements(Collection<Element> collection) {
        super(collection);
    }

    public Elements addClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94869c0(str);
        }
        return this;
    }

    public Elements after(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94871d0(str);
        }
        return this;
    }

    public Elements append(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94873e0(str);
        }
        return this;
    }

    public Elements before(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94884k0(str);
        }
        return this;
    }

    public Elements empty() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().mo94896s();
        }
        return this;
    }

    /* JADX INFO: renamed from: eq */
    public Elements m95267eq(int i11) {
        if (size() > i11) {
            return new Elements(get(i11));
        }
        return new Elements();
    }

    public Elements filter(NodeFilter nodeFilter) {
        C43308d.m95287b(nodeFilter, this);
        return this;
    }

    public Element first() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public boolean hasAttr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().mo94962v(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().m94905z0(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasText() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().m94839A0()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: is */
    public boolean m95268is(String str) {
        AbstractC43307c abstractC43307cM95290t = C43309e.m95290t(str);
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().m94847G0(abstractC43307cM95290t)) {
                return true;
            }
        }
        return false;
    }

    public Element last() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public Elements not(String str) {
        return Selector.m95271a(this, Selector.m95272b(str, this));
    }

    public String outerHtml() {
        StringBuilder sbM94683b = C43093c.m94683b();
        for (Element element : this) {
            if (sbM94683b.length() != 0) {
                sbM94683b.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            sbM94683b.append(element.mo94802C());
        }
        return C43093c.m94694m(sbM94683b);
    }

    public Elements prepend(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94858Q0(str);
        }
        return this;
    }

    public Elements remove() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94974L();
        }
        return this;
    }

    public Elements removeAttr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94862U0(str);
        }
        return this;
    }

    public Elements removeClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94863V0(str);
        }
        return this;
    }

    public Elements select(String str) {
        return Selector.m95272b(str, this);
    }

    public Elements tagName(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94872d1(str);
        }
        return this;
    }

    public String text() {
        StringBuilder sbM94683b = C43093c.m94683b();
        for (Element element : this) {
            if (sbM94683b.length() != 0) {
                sbM94683b.append(C33627eb.f69716f);
            }
            sbM94683b.append(element.m94874e1());
        }
        return C43093c.m94694m(sbM94683b);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return outerHtml();
    }

    public Elements toggleClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94879h1(str);
        }
        return this;
    }

    public Elements traverse(InterfaceC43743a interfaceC43743a) {
        C43308d.m95289d(interfaceC43743a, this);
        return this;
    }

    public Elements unwrap() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94985X();
        }
        return this;
    }

    public Elements wrap(String str) {
        C42841b.m93955g(str);
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94885k1(str);
        }
        return this;
    }

    public Elements(List<Element> list) {
        super(list);
    }

    public Elements val(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94883j1(str);
        }
        return this;
    }

    public Elements(Element... elementArr) {
        super(Arrays.asList(elementArr));
    }

    public Elements attr(String str, String str2) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94882j0(str, str2);
        }
        return this;
    }

    public Elements html(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().m94843D0(str);
        }
        return this;
    }
}
