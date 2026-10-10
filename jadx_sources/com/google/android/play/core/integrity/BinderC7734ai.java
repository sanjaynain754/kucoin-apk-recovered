package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC7833o;
import com.google.android.play.integrity.internal.C7837s;
import com.tencent.bugly.proguard.InterfaceC33826o0;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ai */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class BinderC7734ai extends AbstractBinderC7833o {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C7735aj f11970a;

    /* JADX INFO: renamed from: b */
    private final C7837s f11971b = new C7837s("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c */
    private final TaskCompletionSource f11972c;

    public BinderC7734ai(C7735aj c7735aj, TaskCompletionSource taskCompletionSource) {
        this.f11970a = c7735aj;
        this.f11972c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC7834p
    /* JADX INFO: renamed from: b */
    public final void mo13223b(Bundle bundle) {
        this.f11970a.f11973a.m13297v(this.f11972c);
        this.f11971b.m13326d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionMo13261a = this.f11970a.f11977e.mo13261a(bundle);
        if (apiExceptionMo13261a != null) {
            this.f11972c.trySetException(apiExceptionMo13261a);
            return;
        }
        String string = bundle.getString(InterfaceC33826o0.f71244p);
        if (string == null) {
            this.f11972c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        C7733ah c7733ah = new C7733ah(this, this.f11970a.f11975c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f11972c;
        C7725a c7725a = new C7725a();
        c7725a.mo13215b(string);
        c7725a.mo13214a(c7733ah);
        taskCompletionSource.trySetResult(c7725a.mo13216c());
    }
}
