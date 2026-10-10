package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C7810ae;
import com.google.android.play.integrity.internal.InterfaceC7827i;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bh */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7760bh extends AbstractC7765bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f12022a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f12023b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f12024c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f12025d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C7766bn f12026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7760bh(C7766bn c7766bn, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i11) {
        super(c7766bn, taskCompletionSource);
        this.f12026e = c7766bn;
        this.f12022a = bundle;
        this.f12023b = activity;
        this.f12024c = taskCompletionSource2;
        this.f12025d = i11;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        if (C7766bn.m13255k(this.f12026e)) {
            super.mo13220a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C7766bn c7766bn = this.f12026e;
            C7810ae c7810ae = c7766bn.f12036a;
            ((InterfaceC7827i) c7810ae.m13294e()).mo13315c(this.f12022a, c7766bn.f12040e.m13233a(this.f12023b, this.f12024c, c7810ae));
        } catch (RemoteException e11) {
            this.f12026e.f12037b.m13325c(e11, "requestAndShowDialog(%s)", Integer.valueOf(this.f12025d));
            this.f12024c.trySetException(new StandardIntegrityException(-100, e11));
        }
    }
}
