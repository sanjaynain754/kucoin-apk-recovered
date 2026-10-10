package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.sumsub.sns.databinding.C28333M;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32492R0;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32559t;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32578d implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32583i f66444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32492R0 f66445b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28333M f66446c;

    public C32578d(C32492R0 c32492r0, C32583i c32583i, C28333M c28333m) {
        this.f66444a = c32583i;
        this.f66445b = c32492r0;
        this.f66446c = c28333m;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C32559t c32559t = this.f66444a.f66453c;
        Function1 function1 = this.f66445b.f66315i;
        Editable text = this.f66446c.f57679c.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        c32559t.invoke(function1.invoke(string));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
