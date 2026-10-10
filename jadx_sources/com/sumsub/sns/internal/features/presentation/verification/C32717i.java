package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.core.widget.autocompletePhone.ValidationListener;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32717i implements ValidationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32730p f66927a;

    public C32717i(C32730p c32730p) {
        this.f66927a = c32730p;
    }

    @Override // com.sumsub.sns.core.widget.autocompletePhone.ValidationListener
    public final void onValidate(boolean z11, boolean z12, String str) {
        ((C32720j0) this.f66927a.f66979n.getValue()).m71308a(str, z11);
    }
}
