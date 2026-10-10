package org.springframework.web.util.pattern;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.k */
/* JADX INFO: compiled from: WildcardTheRestPathElement.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43321k extends AbstractC43315e {
    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: b */
    public int mo95319b() {
        return 1;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: e */
    public boolean mo95320e(int i11, C43316f.a aVar) {
        if (i11 < aVar.f95621c && !aVar.m95351c(i11)) {
            return false;
        }
        if (!aVar.f95625g) {
            return true;
        }
        aVar.f95626h = aVar.f95621c;
        return true;
    }

    public String toString() {
        return "WildcardTheRest(" + this.f95603b + "**)";
    }

    public C43321k(int i11, char c11) {
        super(i11, c11);
    }
}
