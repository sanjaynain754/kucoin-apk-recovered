package com.kubi.qrcode.lib;

import android.content.Intent;
import com.kubi.sdk.BaseFragment;
import cy.InterfaceC36555b;

/* JADX INFO: renamed from: com.kubi.qrcode.lib.f */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C21548f implements InterfaceC36555b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseFragment f40920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40921b;

    @Override // cy.InterfaceC36555b
    /* JADX INFO: renamed from: a */
    public final void mo4404a(int i11, Intent intent) {
        QrCodeProcessor.b(this.f40920a, this.f40921b, i11, intent);
    }

    public /* synthetic */ C21548f(BaseFragment baseFragment, String str) {
        this.f40920a = baseFragment;
        this.f40921b = str;
    }
}
