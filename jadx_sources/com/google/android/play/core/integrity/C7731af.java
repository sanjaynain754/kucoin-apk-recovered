package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC7838t;
import com.google.android.play.integrity.internal.C7811af;
import com.google.android.play.integrity.internal.InterfaceC7832n;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.af */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7731af extends AbstractRunnableC7838t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ byte[] f11959a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Long f11960b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f11961c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ IntegrityTokenRequest f11962d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C7735aj f11963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7731af(C7735aj c7735aj, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l11, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f11963e = c7735aj;
        this.f11959a = bArr;
        this.f11960b = l11;
        this.f11961c = taskCompletionSource2;
        this.f11962d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: a */
    public final void mo13220a(Exception exc) {
        if (exc instanceof C7811af) {
            super.mo13220a(new IntegrityServiceException(-9, exc));
        } else {
            super.mo13220a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        try {
            ((InterfaceC7832n) this.f11963e.f11973a.m13294e()).mo13320d(C7735aj.m13224a(this.f11963e, this.f11959a, this.f11960b, null), new BinderC7734ai(this.f11963e, this.f11961c));
        } catch (RemoteException e11) {
            this.f11963e.f11974b.m13325c(e11, "requestIntegrityToken(%s)", this.f11962d);
            this.f11961c.trySetException(new IntegrityServiceException(-100, e11));
        }
    }
}
