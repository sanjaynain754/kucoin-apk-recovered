package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C7837s;
import com.tencent.bugly.proguard.InterfaceC33826o0;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bk */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class BinderC7763bk extends BinderC7761bi {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C7766bn f12030c;

    /* JADX INFO: renamed from: d */
    private final C7837s f12031d;

    /* JADX INFO: renamed from: e */
    private final long f12032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC7763bk(C7766bn c7766bn, TaskCompletionSource taskCompletionSource, long j11) {
        super(c7766bn, taskCompletionSource);
        this.f12030c = c7766bn;
        this.f12031d = new C7837s("OnRequestIntegrityTokenCallback");
        this.f12032e = j11;
    }

    @Override // com.google.android.play.core.integrity.BinderC7761bi, com.google.android.play.integrity.internal.InterfaceC7829k
    /* JADX INFO: renamed from: c */
    public final void mo13244c(Bundle bundle) throws RemoteException {
        super.mo13244c(bundle);
        this.f12031d.m13326d("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionMo13261a = this.f12030c.f12041f.mo13261a(bundle);
        if (apiExceptionMo13261a != null) {
            this.f12027a.trySetException(apiExceptionMo13261a);
            return;
        }
        C7762bj c7762bj = new C7762bj(this, this.f12030c.f12038c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f12027a;
        C7752b c7752b = new C7752b();
        c7752b.mo13240b(bundle.getString(InterfaceC33826o0.f71244p));
        c7752b.mo13239a(c7762bj);
        taskCompletionSource.trySetResult(c7752b.mo13241c());
    }
}
