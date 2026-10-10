package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C7837s;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bl */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class BinderC7764bl extends BinderC7761bi {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C7766bn f12033c;

    /* JADX INFO: renamed from: d */
    private final C7837s f12034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC7764bl(C7766bn c7766bn, TaskCompletionSource taskCompletionSource) {
        super(c7766bn, taskCompletionSource);
        this.f12033c = c7766bn;
        this.f12034d = new C7837s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC7761bi, com.google.android.play.integrity.internal.InterfaceC7829k
    /* JADX INFO: renamed from: e */
    public final void mo13246e(Bundle bundle) throws RemoteException {
        super.mo13246e(bundle);
        this.f12034d.m13326d("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionMo13261a = this.f12033c.f12041f.mo13261a(bundle);
        if (apiExceptionMo13261a != null) {
            this.f12027a.trySetException(apiExceptionMo13261a);
        } else {
            this.f12027a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
