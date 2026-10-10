package com.sumsub.sns.internal.features.presentation.verification2.code;

import android.text.Editable;
import android.text.TextWatcher;
import com.sumsub.sns.core.widget.pincode.SNSPinView;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32753i implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSPinView f67013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32759o f67014b;

    public C32753i(SNSPinView sNSPinView, C32759o c32759o) {
        this.f67013a = sNSPinView;
        this.f67014b = c32759o;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        ((C32767w) this.f67014b.f67021a.getValue()).f67064f.setValue(null);
        this.f67013a.removeTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
