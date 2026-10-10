package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ab */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7807ab extends AbstractRunnableC7838t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ServiceConnectionC7809ad f12090a;

    public C7807ab(ServiceConnectionC7809ad serviceConnectionC7809ad) {
        this.f12090a = serviceConnectionC7809ad;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        C7810ae.m13290s(this.f12090a.f12091a);
        this.f12090a.f12091a.f12106o = null;
        this.f12090a.f12091a.f12099h = false;
    }
}
