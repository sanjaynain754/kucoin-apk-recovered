package p050c4;

import p712w3.InterfaceC45704d;

/* JADX INFO: renamed from: c4.c */
/* JADX INFO: compiled from: MonotonicNanoClock.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC4821c extends InterfaceC4820b {
    @Override // p050c4.InterfaceC4820b
    @InterfaceC45704d
    /* synthetic */ long nowNanos();

    @Override // p050c4.InterfaceC4820b
    @InterfaceC45704d
    /* bridge */ /* synthetic */ default long now() {
        return super.now();
    }
}
