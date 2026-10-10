package org.springframework.web.util.pattern;

import vh0.InterfaceC45553b;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.i */
/* JADX INFO: compiled from: SingleCharWildcardedPathElement.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43319i extends AbstractC43315e {

    /* JADX INFO: renamed from: f */
    public final char[] f95637f;

    /* JADX INFO: renamed from: g */
    public final int f95638g;

    /* JADX INFO: renamed from: h */
    public final int f95639h;

    /* JADX INFO: renamed from: i */
    public final boolean f95640i;

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: b */
    public int mo95319b() {
        return this.f95638g;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: e */
    public boolean mo95320e(int i11, C43316f.a aVar) {
        if (i11 >= aVar.f95621c) {
            return false;
        }
        InterfaceC45553b.a aVar2 = aVar.f95620b.get(i11);
        if (!(aVar2 instanceof InterfaceC45553b.c)) {
            return false;
        }
        String strMo100600a = ((InterfaceC45553b.c) aVar2).mo100600a();
        if (strMo100600a.length() != this.f95638g) {
            return false;
        }
        if (this.f95640i) {
            for (int i12 = 0; i12 < this.f95638g; i12++) {
                char c11 = this.f95637f[i12];
                if (c11 != '?' && c11 != strMo100600a.charAt(i12)) {
                    return false;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f95638g; i13++) {
                char c12 = this.f95637f[i13];
                if (c12 != '?' && c12 != Character.toLowerCase(strMo100600a.charAt(i13))) {
                    return false;
                }
            }
        }
        int i14 = i11 + 1;
        if (!m95333d()) {
            AbstractC43315e abstractC43315e = this.f95604c;
            return abstractC43315e != null && abstractC43315e.mo95320e(i14, aVar);
        }
        if (aVar.f95625g) {
            aVar.f95626h = i14;
            return true;
        }
        if (i14 == aVar.f95621c) {
            return true;
        }
        return aVar.m95350b() && i11 + 2 == aVar.f95621c && aVar.m95351c(i14);
    }

    public String toString() {
        return "SingleCharWildcarded(" + String.valueOf(this.f95637f) + ")";
    }

    public C43319i(int i11, char[] cArr, int i12, boolean z11, char c11) {
        super(i11, c11);
        this.f95638g = cArr.length;
        this.f95639h = i12;
        this.f95640i = z11;
        if (z11) {
            this.f95637f = cArr;
            return;
        }
        this.f95637f = new char[cArr.length];
        for (int i13 = 0; i13 < this.f95638g; i13++) {
            this.f95637f[i13] = Character.toLowerCase(cArr[i13]);
        }
    }
}
