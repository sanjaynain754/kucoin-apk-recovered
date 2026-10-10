package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.InterfaceC7827i;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bg */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7759bg extends AbstractC7765bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f12017a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f12018b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f12019c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ TaskCompletionSource f12020d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C7766bn f12021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7759bg(C7766bn c7766bn, TaskCompletionSource taskCompletionSource, int i11, String str, long j11, long j12, TaskCompletionSource taskCompletionSource2) {
        super(c7766bn, taskCompletionSource);
        this.f12021e = c7766bn;
        this.f12017a = str;
        this.f12018b = j11;
        this.f12019c = j12;
        this.f12020d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        if (C7766bn.m13255k(this.f12021e)) {
            super.mo13220a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C7766bn c7766bn = this.f12021e;
            ((InterfaceC7827i) c7766bn.f12036a.m13294e()).mo13316d(C7766bn.m13248a(c7766bn, this.f12017a, this.f12018b, this.f12019c, 0), new BinderC7763bk(this.f12021e, this.f12020d, this.f12018b));
        } catch (RemoteException e11) {
            this.f12021e.f12037b.m13325c(e11, "requestExpressIntegrityToken(%s, %s)", this.f12017a, Long.valueOf(this.f12018b));
            this.f12020d.trySetException(new StandardIntegrityException(-100, e11));
        }
    }
}
