package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.InterfaceC7827i;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bf */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7758bf extends AbstractC7765bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f12014a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TaskCompletionSource f12015b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C7766bn f12016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7758bf(C7766bn c7766bn, TaskCompletionSource taskCompletionSource, int i11, long j11, TaskCompletionSource taskCompletionSource2) {
        super(c7766bn, taskCompletionSource);
        this.f12016c = c7766bn;
        this.f12014a = j11;
        this.f12015b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        if (C7766bn.m13255k(this.f12016c)) {
            super.mo13220a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C7766bn c7766bn = this.f12016c;
            ((InterfaceC7827i) c7766bn.f12036a.m13294e()).mo13317e(C7766bn.m13249b(c7766bn, this.f12014a, 0), new BinderC7764bl(this.f12016c, this.f12015b));
        } catch (RemoteException e11) {
            this.f12016c.f12037b.m13325c(e11, "warmUpIntegrityToken(%s)", Long.valueOf(this.f12014a));
            this.f12015b.trySetException(new StandardIntegrityException(-100, e11));
        }
    }
}
