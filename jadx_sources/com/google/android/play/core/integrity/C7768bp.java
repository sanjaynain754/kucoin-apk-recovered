package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C7837s;
import com.google.android.play.integrity.internal.InterfaceC7816ak;
import com.google.android.play.integrity.internal.InterfaceC7819an;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bp */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7768bp implements InterfaceC7816ak {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7819an f12043a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7819an f12044b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC7819an f12045c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC7819an f12046d;

    @Override // com.google.android.play.integrity.internal.InterfaceC7819an
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13217a() {
        return new C7766bn((Context) this.f12043a.mo13217a(), (C7837s) this.f12044b.mo13217a(), ((C7746au) this.f12045c).mo13217a(), new C7782j());
    }

    public C7768bp(InterfaceC7819an interfaceC7819an, InterfaceC7819an interfaceC7819an2, InterfaceC7819an interfaceC7819an3, InterfaceC7819an interfaceC7819an4) {
        this.f12043a = interfaceC7819an;
        this.f12044b = interfaceC7819an2;
        this.f12045c = interfaceC7819an3;
        this.f12046d = interfaceC7819an4;
    }
}
