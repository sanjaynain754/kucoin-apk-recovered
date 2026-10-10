package com.sumsub.sns.internal.features.presentation.verification2.phone;

import com.sumsub.sns.core.widget.autocompletePhone.ValidationListener;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32855d implements ValidationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32857e f67228a;

    public C32855d(C32857e c32857e) {
        this.f67228a = c32857e;
    }

    @Override // com.sumsub.sns.core.widget.autocompletePhone.ValidationListener
    public final void onValidate(boolean z11, boolean z12, String str) {
        ((C32853c) this.f67228a.f67237k.getValue()).m71353a(str, z11);
    }
}
