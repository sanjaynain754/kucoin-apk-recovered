package org.springframework.web.util.pattern;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.h */
/* JADX INFO: compiled from: SeparatorPathElement.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43318h extends AbstractC43315e {
    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: b */
    public int mo95319b() {
        return 1;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: e */
    public boolean mo95320e(int i11, C43316f.a aVar) {
        if (i11 < aVar.f95621c && aVar.m95351c(i11)) {
            if (m95333d()) {
                if (!aVar.f95625g) {
                    return i11 + 1 == aVar.f95621c;
                }
                aVar.f95626h = i11 + 1;
                return true;
            }
            int i12 = i11 + 1;
            AbstractC43315e abstractC43315e = this.f95604c;
            if (abstractC43315e != null && abstractC43315e.mo95320e(i12, aVar)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Separator(" + this.f95603b + ")";
    }

    public C43318h(int i11, char c11) {
        super(i11, c11);
    }
}
