package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC7838t;
import com.google.android.play.integrity.internal.InterfaceC7832n;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ag */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7732ag extends AbstractRunnableC7838t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f11964a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f11965b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f11966c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f11967d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C7735aj f11968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7732ag(C7735aj c7735aj, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i11) {
        super(taskCompletionSource);
        this.f11968e = c7735aj;
        this.f11964a = bundle;
        this.f11965b = activity;
        this.f11966c = taskCompletionSource2;
        this.f11967d = i11;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        try {
            InterfaceC7832n interfaceC7832n = (InterfaceC7832n) this.f11968e.f11973a.m13294e();
            Bundle bundle = this.f11964a;
            C7735aj c7735aj = this.f11968e;
            interfaceC7832n.mo13319c(bundle, c7735aj.f11976d.m13233a(this.f11965b, this.f11966c, c7735aj.f11973a));
        } catch (RemoteException e11) {
            this.f11968e.f11974b.m13325c(e11, "requestAndShowDialog(%s)", Integer.valueOf(this.f11967d));
            this.f11966c.trySetException(new IntegrityServiceException(-100, e11));
        }
    }
}
