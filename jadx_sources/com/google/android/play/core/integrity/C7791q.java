package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C7818am;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.q */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7791q implements InterfaceC7798x {

    /* JADX INFO: renamed from: a */
    private Context f12065a;

    private C7791q() {
    }

    public /* synthetic */ C7791q(C7790p c7790p) {
    }

    @Override // com.google.android.play.core.integrity.InterfaceC7798x
    /* JADX INFO: renamed from: b */
    public final C7793s mo13267b() {
        C7818am.m13305a(this.f12065a, Context.class);
        return new C7793s(this.f12065a, null);
    }

    /* JADX INFO: renamed from: a */
    public final C7791q m13266a(Context context) {
        context.getClass();
        this.f12065a = context;
        return this;
    }
}
