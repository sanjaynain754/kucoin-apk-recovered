package org.jsoup.select;

import org.jsoup.nodes.Element;

/* JADX INFO: renamed from: org.jsoup.select.f */
/* JADX INFO: compiled from: StructuralEvaluator.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC43310f extends AbstractC43307c {

    /* JADX INFO: renamed from: a */
    public AbstractC43307c f95574a;

    /* JADX INFO: renamed from: org.jsoup.select.f$a */
    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class a extends AbstractC43310f {
        public String toString() {
            return String.format(":has(%s)", this.f95574a);
        }

        public a(AbstractC43307c abstractC43307c) {
            this.f95574a = abstractC43307c;
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            for (Element element3 : element2.m94903x0()) {
                if (element3 != element2 && this.f95574a.mo95282a(element2, element3)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.f$b */
    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class b extends AbstractC43310f {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            Element elementMo94848H;
            return (element == element2 || (elementMo94848H = element2.mo94848H()) == null || !this.f95574a.mo95282a(element, elementMo94848H)) ? false : true;
        }

        public String toString() {
            return String.format(":ImmediateParent%s", this.f95574a);
        }

        public b(AbstractC43307c abstractC43307c) {
            this.f95574a = abstractC43307c;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.f$c */
    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class c extends AbstractC43310f {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            Element elementM94861T0;
            return (element == element2 || (elementM94861T0 = element2.m94861T0()) == null || !this.f95574a.mo95282a(element, elementM94861T0)) ? false : true;
        }

        public String toString() {
            return String.format(":prev%s", this.f95574a);
        }

        public c(AbstractC43307c abstractC43307c) {
            this.f95574a = abstractC43307c;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.f$d */
    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class d extends AbstractC43310f {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return !this.f95574a.mo95282a(element, element2);
        }

        public String toString() {
            return String.format(":not%s", this.f95574a);
        }

        public d(AbstractC43307c abstractC43307c) {
            this.f95574a = abstractC43307c;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.f$e */
    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class e extends AbstractC43310f {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element elementMo94848H = element2.mo94848H(); !this.f95574a.mo95282a(element, elementMo94848H); elementMo94848H = elementMo94848H.mo94848H()) {
                if (elementMo94848H == element) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return String.format(":parent%s", this.f95574a);
        }

        public e(AbstractC43307c abstractC43307c) {
            this.f95574a = abstractC43307c;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.f$f */
    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class f extends AbstractC43310f {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element elementM94861T0 = element2.m94861T0(); elementM94861T0 != null; elementM94861T0 = elementM94861T0.m94861T0()) {
                if (this.f95574a.mo95282a(element, elementM94861T0)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":prev*%s", this.f95574a);
        }

        public f(AbstractC43307c abstractC43307c) {
            this.f95574a = abstractC43307c;
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.f$g */
    /* JADX INFO: compiled from: StructuralEvaluator.java */
    public static class g extends AbstractC43307c {
        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            return element == element2;
        }
    }
}
