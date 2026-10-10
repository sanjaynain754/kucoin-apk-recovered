package com.sumsub.sns.internal.features.presentation.verification2.email;

import android.text.Editable;
import android.text.TextWatcher;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32776a implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32785g f67081a;

    public C32776a(C32785g c32785g) {
        this.f67081a = c32785g;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        C32774D c32774d = (C32774D) this.f67081a.f67090a.getValue();
        String string = charSequence != null ? charSequence.toString() : null;
        c32774d.f67078c.setValue(string != null ? StringsKt.trim((CharSequence) string).toString() : null);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
