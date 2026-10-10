package p445m2;

import androidx.annotation.NonNull;
import p523p2.C43364k;

/* JADX INFO: renamed from: m2.h */
/* JADX INFO: compiled from: SimpleTarget.java */
/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public abstract class AbstractC42397h<Z> extends AbstractC42390a<Z> {

    /* JADX INFO: renamed from: c */
    public final int f94002c;

    /* JADX INFO: renamed from: d */
    public final int f94003d;

    public AbstractC42397h() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC42397h(int i11, int i12) {
        this.f94002c = i11;
        this.f94003d = i12;
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: a */
    public final void mo92228a(@NonNull InterfaceC42398i interfaceC42398i) {
        if (C43364k.m95528u(this.f94002c, this.f94003d)) {
            interfaceC42398i.mo6939e(this.f94002c, this.f94003d);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f94002c + " and height: " + this.f94003d + ", either provide dimensions in the constructor or call override()");
    }

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: f */
    public void mo92229f(@NonNull InterfaceC42398i interfaceC42398i) {
    }
}
