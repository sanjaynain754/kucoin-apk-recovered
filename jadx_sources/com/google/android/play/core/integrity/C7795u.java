package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C7818am;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.u */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7795u implements InterfaceC7747av {

    /* JADX INFO: renamed from: a */
    private Context f12072a;

    private C7795u() {
    }

    public /* synthetic */ C7795u(C7794t c7794t) {
    }

    @Override // com.google.android.play.core.integrity.InterfaceC7747av
    /* JADX INFO: renamed from: b */
    public final InterfaceC7748aw mo13235b() {
        C7818am.m13305a(this.f12072a, Context.class);
        return new C7797w(this.f12072a, null);
    }

    /* JADX INFO: renamed from: a */
    public final C7795u m13269a(Context context) {
        context.getClass();
        this.f12072a = context;
        return this;
    }
}
