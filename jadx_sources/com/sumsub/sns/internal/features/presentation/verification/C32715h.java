package com.sumsub.sns.internal.features.presentation.verification;

import android.text.Editable;
import android.text.TextWatcher;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32715h implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32730p f66920a;

    public C32715h(C32730p c32730p) {
        this.f66920a = c32730p;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        C32720j0 c32720j0 = (C32720j0) this.f66920a.f66979n.getValue();
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            c32720j0.getClass();
            if (!StringsKt.isBlank(string)) {
                c32720j0.m71307a((CharSequence) null);
            }
        }
        c32720j0.f66949q = true;
        c32720j0.f66948p.setValue(string);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
