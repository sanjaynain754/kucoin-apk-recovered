package org.springframework.web.util.pattern;

import org.springframework.util.LinkedMultiValueMap;
import wh0.InterfaceC45841i;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.e */
/* JADX INFO: compiled from: PathElement.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC43315e {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC45841i<String, String> f95601e = new LinkedMultiValueMap();

    /* JADX INFO: renamed from: a */
    public final int f95602a;

    /* JADX INFO: renamed from: b */
    public final char f95603b;

    /* JADX INFO: renamed from: c */
    public AbstractC43315e f95604c;

    /* JADX INFO: renamed from: d */
    public AbstractC43315e f95605d;

    /* JADX INFO: renamed from: a */
    public int mo95318a() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo95319b();

    /* JADX INFO: renamed from: c */
    public int mo95322c() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo95320e(int i11, C43316f.a aVar);

    /* JADX INFO: renamed from: d */
    public final boolean m95333d() {
        return this.f95604c == null;
    }

    public AbstractC43315e(int i11, char c11) {
        this.f95602a = i11;
        this.f95603b = c11;
    }
}
