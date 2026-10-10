package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C7810ae;
import com.google.android.play.integrity.internal.InterfaceC7819an;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.at */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7745at {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7819an f11997a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7819an f11998b;

    /* JADX INFO: renamed from: a */
    public final BinderC7744as m13233a(Activity activity, TaskCompletionSource taskCompletionSource, C7810ae c7810ae) {
        Object objMo13217a = this.f11997a.mo13217a();
        objMo13217a.getClass();
        InterfaceC7783k interfaceC7783k = (InterfaceC7783k) this.f11998b.mo13217a();
        interfaceC7783k.getClass();
        activity.getClass();
        c7810ae.getClass();
        return new BinderC7744as((Context) objMo13217a, interfaceC7783k, activity, taskCompletionSource, c7810ae);
    }

    public C7745at(InterfaceC7819an interfaceC7819an, InterfaceC7819an interfaceC7819an2) {
        this.f11997a = interfaceC7819an;
        this.f11998b = interfaceC7819an2;
    }
}
