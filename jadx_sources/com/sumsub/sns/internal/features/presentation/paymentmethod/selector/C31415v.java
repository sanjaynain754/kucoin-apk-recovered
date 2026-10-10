package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import com.sumsub.sns.internal.features.domain.utils.C30317b;
import com.sumsub.sns.internal.features.presentation.paymentmethod.InterfaceC31392b;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31415v {

    /* JADX INFO: renamed from: a */
    public final C31412s f63662a;

    /* JADX INFO: renamed from: b */
    public final Function0 f63663b;

    /* JADX INFO: renamed from: c */
    public final C30317b f63664c;

    /* JADX INFO: renamed from: d */
    public boolean f63665d;

    /* JADX INFO: renamed from: e */
    public InterfaceC31392b f63666e;

    /* JADX INFO: renamed from: f */
    public boolean f63667f;

    /* JADX INFO: renamed from: a */
    public final void m70718a(InterfaceC31392b interfaceC31392b) {
        if (this.f63667f) {
            C30317b c30317b = this.f63664c;
            interfaceC31392b.getClass();
            C33272c.f67816e.f67810a.mo68955d(c30317b.f60947a, "requestAutoOpen(bankCard) ignored: already opened", null);
            return;
        }
        C30317b c30317b2 = this.f63664c;
        interfaceC31392b.getClass();
        C33272c.f67816e.f67810a.mo68955d(c30317b2.f60947a, "requestAutoOpen: pending=bankCard", null);
        this.f63666e = interfaceC31392b;
        m70717a();
    }

    public C31415v(C31412s c31412s, Function0 function0, C30317b c30317b) {
        this.f63662a = c31412s;
        this.f63663b = function0;
        this.f63664c = c30317b;
    }

    /* JADX INFO: renamed from: a */
    public final void m70717a() {
        InterfaceC31392b interfaceC31392b;
        if (!this.f63665d || (interfaceC31392b = this.f63666e) == null || this.f63667f) {
            return;
        }
        this.f63667f = true;
        this.f63666e = null;
        C33272c.f67816e.f67810a.mo68955d(this.f63664c.f60947a, "tryFire: opening bankCard", null);
        this.f63662a.invoke(interfaceC31392b);
    }
}
