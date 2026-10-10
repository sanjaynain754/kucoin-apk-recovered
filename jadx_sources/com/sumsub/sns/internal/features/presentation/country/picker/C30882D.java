package com.sumsub.sns.internal.features.presentation.country.picker;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.sumsub.sns.core.widget.SNSTextInputLayout;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30882D implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30891d f62388a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSTextInputLayout f62389b;

    public C30882D(C30891d c30891d, SNSTextInputLayout sNSTextInputLayout) {
        this.f62388a = c30891d;
        this.f62389b = sNSTextInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        C30887b c30887b = this.f62388a.f62405c;
        EditText editText = this.f62389b.getEditText();
        c30887b.filter(editText != null ? editText.getText() : null);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
