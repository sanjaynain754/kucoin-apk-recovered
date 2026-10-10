package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.aa */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7806aa extends AbstractRunnableC7838t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IBinder f12088a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ServiceConnectionC7809ad f12089b;

    public C7806aa(ServiceConnectionC7809ad serviceConnectionC7809ad, IBinder iBinder) {
        this.f12089b = serviceConnectionC7809ad;
        this.f12088a = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        this.f12089b.f12091a.f12106o = (IInterface) this.f12089b.f12091a.f12101j.mo13219a(this.f12088a);
        C7810ae.m13289r(this.f12089b.f12091a);
        this.f12089b.f12091a.f12099h = false;
        Iterator it = this.f12089b.f12091a.f12096e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f12089b.f12091a.f12096e.clear();
    }
}
