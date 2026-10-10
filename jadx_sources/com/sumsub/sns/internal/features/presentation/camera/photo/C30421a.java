package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.presentation.country.C30877b;
import com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30421a implements InterfaceC30893e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30669g f61236a;

    public C30421a(C30669g c30669g) {
        this.f61236a = c30669g;
    }

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e
    public final void onDismiss() {
        ((C30736v0) this.f61236a.f61975b.getValue()).intent(C30741y.f62111a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e
    public final void onItemSelected(C30877b c30877b) {
        ((C30736v0) this.f61236a.f61975b.getValue()).intent(new C30739x(c30877b));
    }
}
