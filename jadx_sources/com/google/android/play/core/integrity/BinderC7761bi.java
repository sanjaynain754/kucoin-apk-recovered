package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC7828j;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bi */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
class BinderC7761bi extends AbstractBinderC7828j {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f12027a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C7766bn f12028b;

    public BinderC7761bi(C7766bn c7766bn, TaskCompletionSource taskCompletionSource) {
        this.f12028b = c7766bn;
        this.f12027a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC7829k
    /* JADX INFO: renamed from: b */
    public final void mo13243b(Bundle bundle) throws RemoteException {
        this.f12028b.f12036a.m13297v(this.f12027a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC7829k
    /* JADX INFO: renamed from: c */
    public void mo13244c(Bundle bundle) throws RemoteException {
        this.f12028b.f12036a.m13297v(this.f12027a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC7829k
    /* JADX INFO: renamed from: d */
    public final void mo13245d(Bundle bundle) throws RemoteException {
        this.f12028b.f12036a.m13297v(this.f12027a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC7829k
    /* JADX INFO: renamed from: e */
    public void mo13246e(Bundle bundle) throws RemoteException {
        this.f12028b.f12036a.m13297v(this.f12027a);
    }
}
