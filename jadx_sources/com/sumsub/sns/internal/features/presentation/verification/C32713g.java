package com.sumsub.sns.internal.features.presentation.verification;

import android.text.Editable;
import android.text.TextWatcher;
import com.sumsub.sns.core.widget.pincode.SNSPinView;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32713g implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSPinView f66916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32730p f66917b;

    public C32713g(SNSPinView sNSPinView, C32730p c32730p) {
        this.f66916a = sNSPinView;
        this.f66917b = c32730p;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        ((C32720j0) this.f66917b.f66979n.getValue()).m71307a((CharSequence) null);
        this.f66916a.removeTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
