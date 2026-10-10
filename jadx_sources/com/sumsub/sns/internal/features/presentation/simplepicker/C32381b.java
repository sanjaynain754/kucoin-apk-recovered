package com.sumsub.sns.internal.features.presentation.simplepicker;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.sumsub.sns.core.widget.SNSTextInputLayout;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.simplepicker.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32381b implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32384e f65963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SNSTextInputLayout f65964b;

    public C32381b(C32384e c32384e, SNSTextInputLayout sNSTextInputLayout) {
        this.f65963a = c32384e;
        this.f65964b = sNSTextInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        C32383d c32383d = this.f65963a.f65971c;
        EditText editText = this.f65964b.getEditText();
        c32383d.filter(editText != null ? editText.getText() : null);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
