package org.springframework.web.util.pattern;

import vh0.InterfaceC45553b;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.j */
/* JADX INFO: compiled from: WildcardPathElement.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43320j extends AbstractC43315e {
    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: b */
    public int mo95319b() {
        return 1;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: c */
    public int mo95322c() {
        return 100;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: e */
    public boolean mo95320e(int i11, C43316f.a aVar) {
        String strMo100600a;
        AbstractC43315e abstractC43315e;
        if (i11 < aVar.f95621c) {
            InterfaceC45553b.a aVar2 = aVar.f95620b.get(i11);
            if (!(aVar2 instanceof InterfaceC45553b.c)) {
                return false;
            }
            strMo100600a = ((InterfaceC45553b.c) aVar2).mo100600a();
            i11++;
        } else {
            strMo100600a = null;
        }
        if (!m95333d()) {
            return (strMo100600a == null || strMo100600a.length() == 0 || (abstractC43315e = this.f95604c) == null || !abstractC43315e.mo95320e(i11, aVar)) ? false : true;
        }
        if (aVar.f95625g) {
            aVar.f95626h = i11;
            return true;
        }
        if (i11 == aVar.f95621c) {
            return true;
        }
        return aVar.m95350b() && strMo100600a != null && strMo100600a.length() > 0 && i11 + 1 == aVar.f95621c && aVar.m95351c(i11);
    }

    public String toString() {
        return "Wildcard(*)";
    }

    public C43320j(int i11, char c11) {
        super(i11, c11);
    }
}
